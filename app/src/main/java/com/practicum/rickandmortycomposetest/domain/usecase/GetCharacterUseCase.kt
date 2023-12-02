package com.practicum.rickandmortycomposetest.domain.usecase

import com.practicum.rickandmortycomposetest.data.Results
import com.practicum.rickandmortycomposetest.domain.models.Character
import com.practicum.rickandmortycomposetest.domain.repository.CharacterRepository
import javax.inject.Inject

class GetCharacterUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    suspend operator fun invoke(id: Int): Results<Character> {
        return repository.getCharacter(id)
    }
}