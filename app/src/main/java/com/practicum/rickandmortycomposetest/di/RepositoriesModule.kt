package com.practicum.rickandmortycomposetest.di

import com.practicum.rickandmortycomposetest.data.repositories.CharacterRepositoryImpl
import com.practicum.rickandmortycomposetest.domain.repository.CharacterRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun bindCharacterRepository(impl: CharacterRepositoryImpl): CharacterRepository
}