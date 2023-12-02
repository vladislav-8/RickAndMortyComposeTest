package com.practicum.rickandmortycomposetest.domain.usecase

import com.practicum.rickandmortycomposetest.data.Results
import com.practicum.rickandmortycomposetest.domain.models.Characters
import com.practicum.rickandmortycomposetest.domain.repository.CharacterRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    suspend fun invoke(page: Int): Flow<Results<List<Characters>>> {
        return repository.getCharacters(page)
    }
}