package com.practicum.rickandmortycomposetest.data.repositories

import com.practicum.rickandmortycomposetest.data.Results
import com.practicum.rickandmortycomposetest.data.source.remote.RickAndMortyApi
import com.practicum.rickandmortycomposetest.data.source.remote.dto.toCharacter
import com.practicum.rickandmortycomposetest.data.source.remote.dto.toListCharacters
import com.practicum.rickandmortycomposetest.domain.models.Character
import com.practicum.rickandmortycomposetest.domain.models.Characters
import com.practicum.rickandmortycomposetest.domain.repository.CharacterRepository
import retrofit2.HttpException
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import java.lang.Exception
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val api: RickAndMortyApi
) : CharacterRepository {
    override fun getCharacters(page: Int): Flow<Results<List<Characters>>> = flow {
        emit(Results.Loading())
        try {
            val response = api.getCharacters(page).toListCharacters()
            emit(Results.Success(response))
        } catch (e: HttpException) {
            emit(
                Results.Error(
                    message = "something went wrong",
                    data = null
                )
            )
        } catch (e: IOException) {
            emit(
                Results.Error(
                    message = "something went wrong",
                    data = null
                )
            )
        }
    }

    override suspend fun getCharacter(id: Int): Results<Character> {
        val response = try {
            api.getCharacter(id)
        } catch (e: Exception) {
            return Results.Error(
                message = "An unknown error occurred"
            )
        }
        return Results.Success(response.toCharacter())
    }
}