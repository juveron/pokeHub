package com.example.pokehub

data class Pokemon(
	val id: Int,
	val name: String,
	val base_experience: Int,
	val height: Int,
	val is_default: Boolean,
	val order: Int,
	val weight: Int,
	val abilities: Ability,
	val forms,
	val game_indices,
	val held_items,
	val location_area_encounters,
	val moves,
	val past_types,
	val sprites,
	val species,
	val stats,
	val types,
)

data class Ability(
	val id: Int,
	val name: String,
	val is_main_series: Boolean,
	val generation: Generation,
	val names: List<Name>,
)

data class Generation(
	val id: Int,
	val name: String,
	val abilities: List<Ability>,
	val names: List<Name>,
	val main_region: Region,
	val moves: Move,
	val pokemon_species: List<PokemonSpecies>,
	val types: List<Type>,
	val version_groups: List<VersionGroup>,
)

data class Region(

)
data class Move(

)
data class PokemonSpecies(

)

data class Type(

)

data class VersionGroup(

)

data class Name(
	val name: String,
	val language: Language
)

data class Language(
	val id: Int,
	val name: String,
	val official: Boolean,
	val iso639: String,
	val iso3166: String,
	val names: List<Name>
)

data class VerboseEffect(

)
data class AbilityEffectChange(

)
data class AbilityFlavorText(

)
data class AbilityPokemon(

)