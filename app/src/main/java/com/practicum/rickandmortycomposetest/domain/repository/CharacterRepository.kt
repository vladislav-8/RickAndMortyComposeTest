package com.practicum.rickandmortycomposetest.domain.repository

import com.practicum.rickandmortycomposetest.data.source.remote.dto.Result
import com.practicum.rickandmortycomposetest.domain.models.Character
import com.practicum.rickandmortycomposetest.domain.models.Characters
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {

    fun getCharacters(page: Int): Flow<Result<List<Characters>>>

    suspend fun getCharacter(id: Int): Result<Character>
}