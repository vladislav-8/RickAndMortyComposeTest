package com.practicum.rickandmortycomposetest.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController
import com.practicum.rickandmortycomposetest.ui.theme.RickAndMortyComposeTestTheme

@Composable
fun RickAndMortyApp() {

    RickAndMortyComposeTestTheme {
        val navController = rememberNavController()
        val navigationActions = remember(navController) {
            RickAndMortyActions(navController)
        }

        RickAndMortyNavGraph(
            navController = navController,
            navigateToHome = navigationActions.navigateToHome,
            navigateToDetail = navigationActions.navigateToDetail
        )
    }
}