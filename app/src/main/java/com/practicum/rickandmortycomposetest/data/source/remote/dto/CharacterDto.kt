package com.practicum.rickandmortycomposetest.data.source.remote.dto

import com.practicum.rickandmortycomposetest.domain.models.Character

data class CharacterDto(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: Location,
    val name: String,
    val origin: Origin,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)

fun CharacterDto.toCharacter(): Character {
    return Character(
        id = id,
        name = name,
        gender = gender,
        status = status,
        species = species,
        origin = origin,
        location = location,
        image = image,
    )
}