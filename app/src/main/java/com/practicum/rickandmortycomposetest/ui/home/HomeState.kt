package com.practicum.rickandmortycomposetest.ui.home

import com.practicum.rickandmortycomposetest.domain.models.Characters

data class HomeState(
    val characters: List<Characters> = emptyList(),
    val showPrevious: Boolean = false,
    val showNext: Boolean = false,
    val isLoading: Boolean = false
)
