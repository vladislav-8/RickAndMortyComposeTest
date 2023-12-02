package com.practicum.rickandmortycomposetest.data.source.remote.dto

data class CharactersDto(
    val info: Info,
    val results: List<Result<Any?>>
)