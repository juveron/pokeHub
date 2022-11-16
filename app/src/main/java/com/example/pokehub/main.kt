package com.example.pokehub

import com.google.gson.Gson
import org.json.JSONObject
import java.util.Objects

fun main() {
	val result = getPokemon("gengar")
	val data = Gson().toJson(result)
//	println(result)
}