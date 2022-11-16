package com.example.pokehub

import org.json.JSONObject
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.SocketTimeoutException
import java.net.URL

const val API = "https://pokeapi.co/api/v2/"

fun getPokemon(name: String): String {
	var result: String = ""

	var connection: HttpURLConnection? = null

	try{
		val url = URL("${API}pokemon/$name")
		println(url)
		connection = url.openConnection() as HttpURLConnection
		connection.doInput = true
		connection.doOutput = true

		val httpResult : Int = connection.responseCode

		if (httpResult == HttpURLConnection.HTTP_OK) {
			val inputStream = connection.inputStream

			val reader = BufferedReader(InputStreamReader(inputStream))

			val stringBuilder = StringBuilder()
			var line: String?
			try {
				while(reader.readLine().also { line = it } != null) {
					stringBuilder.append(line + "\n")
				}
			} catch (e: IOException) {
				e.printStackTrace()
			} finally {
				try {
					inputStream.close()
				} catch (e: IOException) {
					e.printStackTrace()

				}
			}
			result = stringBuilder.toString()
		}
	} catch (e: SocketTimeoutException) {
		result = "Connection Timeout"
	} catch (e: Exception) {
		result = "Error : " + e.message
	} finally {
		connection?.disconnect()
	}
	return result
}

//fun getPokemons() {
//
//}