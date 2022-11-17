package com.example.pokehub


data class Pokemon(
	val id: Int,
	val name: String,
	val base_experience: Int,
	val height: Int,
	val is_default: Boolean,
	val order: Int,
	val weight: Int,
	val abilities: List<PokemonAbility>,
	val forms: List<PokemonForm>,
	val game_indices: List<VersionGameIndex>,
	val held_items: List<PokemonHeldItem>,
	val location_area_encounters: String,
	val moves: List<PokemonMove>,
	val past_types: List<PokemonTypePast>,
	val species: PokemonSpecies,
	val sprites: PokemonSprites,
	val stats: List<PokemonStat>,
	val types: List<PokemonType>,
)

data class PokemonStat(
	val stat: Stat,
	val effort: Int,
	val base_stat: Int
)

data class Stat(
	val id: Int,
	val name: String,
	val game_index: Int,
	val is_battle_only: Boolean,
	val affecting_moves: MoveStatAffectSets,
	val affecting_natures: NatureStatAffectSets,
	val characteristics: Characteristic,
	val move_damage_class: MoveDamageClass,
	val names: List<Name>
)

data class Characteristic(
	val id: Int,
	val gene_modulo: Int,
	val possible_values: List<Int>,
)

data class MoveStatAffectSets(
	val increase: List<MoveStatAffect>,
	val decrease: List<MoveStatAffect>,
)

data class MoveStatAffect(
	val change: Int,
	val move: Move,
)

data class NatureStatAffectSets(
	val increase: List<Nature>,
	val decrease: List<Nature>,
)

data class PokemonSpecies(
	val id: Int,
	val name: String,
	val order: Int,
	val gender_rate: Int,
	val capture_rate: Int,
	val base_happiness: Int,
	val is_baby: Boolean,
	val is_legendary: Boolean,
	val is_mythical: Boolean,
	val hatch_counter: Int,
	val has_gender_differences: Boolean,
	val forms_switchable: Boolean,
	val growth_rate: GrowthRate,
	val pokedex_numbers: PokemonSpeciesDexEntry,
	val egg_groups: EggGroup,
	val color: PokemonColor,
	val shape: PokemonShape,
	val evolves_from_species: PokemonSpecies?,
	val evolution_chain: EvolutionChain,
	val habitat: PokemonHabitat,
	val generation: Generation,
	val names: List<Name>,
	val pal_park_encounters: List<PalParkEncounterArea>,
	val flavor_text_entries: List<FlavorText>,
	val form_descriptions: List<Description>,
	val genera: List<Genus>,
	val varieties: List<PokemonSpeciesVariety>
)

data class PokemonSprites(
	val front_default: String,
	val front_shiny: String,
	val front_female: String,
	val front_shiny_female: String,
	val back_default: String,
	val back_shiny: String,
	val back_female: String,
	val back_shiny_female: String,
)

data class PokemonTypePast(
	val generation: Generation,
	val types: List<PokemonType>
)

data class PokemonType(
	val slot: Int,
	val type: Type,
)

data class Type(
	val id: Int,
	val name: String,
	val damage_relations: TypeRelations,
	val past_damage_relations: List<TypeRelationsPast>,
	val game_indices: List<GenerationGameIndex>,
	val generation: Generation,
	val move_damage_class: MoveDamageClass,
	val names: List<Name>,
	val pokemon: List<TypePokemon>,
	val moves: List<Move>
)

data class PokemonMove(
	val move: Move,
	val version_group_details: List<PokemonMoveVersion>
)

data class Move(
	val id: Int,
	val name: String,
	val accuracy: Int,
	val effect_chance: Int,
	val pp: Int,
	val priority: Int,
	val power: Int,
	val contest_combos: ContestComboSets,
	val contest_type: ContestType,
	val contest_effect: ContestEffect,
	val damage_class: MoveDamageClass,
	val effect_entries: List<VerboseEffect>,
	val effect_changes: List<AbilityEffectChange>,
	val learned_by_pokemon: List<Pokemon>,
	val flavor_text_entries: List<MoveFlavorText>,
	val generation: Generation,
	val machines: List<MachineVersionDetail>,
	val meta: MoveMetaData,
	val names: List<Name>,
	val past_values: List<PastMoveStatValues>,
	val stat_changes: List<MoveStatChange>,
	val super_contest_effect: SuperContestEffect,
	val target: MoveTarget,
	val type: Type
)

data class VersionGameIndex(
	val game_index: Int,
	val version: Version,
)

data class PokemonHeldItem(
	val item: Item,
	val version_details: List<PokemonHeldItemVersion>,
)

data class PokemonHeldItemVersion(
	val version: Version,
	val rarity: Int,
)

data class Version(
	val id: Int,
	val name: String,
	val names: List<Name>,
	val version_groups: List<VersionGroup>
)

data class PokemonForm(
	val id: Int,
	val name: String,
	val order: Int,
	val form_order: Int,
	val is_default: Boolean,
	val is_battle_only: Boolean,
	val is_mega: Boolean,
	val form_name: String,
	val pokemon: Pokemon,
	val types: List<PokemonFormType>,
	val sprites: PokemonFormSprites,
	val version_group: VersionGroup,
	val names: List<Name>,
	val forms_names: List<Name>
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
	val id: Int,
	val locations: List<Location>,
	val name: String,
	val names: List<Name>,
	val main_generation: Generation,
	val pokedexes: List<Pokedex>,
	val version_groups: List<VersionGroup>,
)

data class Pokedex(
	val id: Int,
	val name: String,
	val is_main_series: Boolean,
	val descriptions: List<Description>,
	val names: List<Name>,
	val pokemon_entries: List<PokemonEntry>,
	val region: Region,
	val version_groups: List<VersionGroup>
)

data class Location(
	val id: Int,
	val name: String,
	val region: Region,
	val names: List<Name>,
	val game_indices: List<GenerationGameIndex>,
	val areas: List<LocationArea>
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

data class PokemonAbility(
	val is_hidden: Boolean,
	val slot: Int,
	val ability: Ability
)