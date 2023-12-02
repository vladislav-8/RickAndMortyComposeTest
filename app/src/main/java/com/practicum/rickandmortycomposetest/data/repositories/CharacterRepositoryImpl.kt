package com.practicum.rickandmortycomposetest.data.repositories

import com.practicum.rickandmortycomposetest.data.source.remote.dto.Result
import com.practicum.rickandmortycomposetest.domain.models.Character
import com.practicum.rickandmortycomposetest.domain.models.Characters
import com.practicum.rickandmortycomposetest.domain.repository.CharacterRepository
import kotlinx.coroutines.flow.Flow

class CharacterRepositoryImpl(): CharacterRepository {
    override fun getCharacters(page: Int): Flow<Result<List<Characters>>> {
        TODO("Not yet implemented")
    }

    override suspend fun getCharacter(id: Int): Result<Character> {
        TODO("Not yet implemented")
    }
}