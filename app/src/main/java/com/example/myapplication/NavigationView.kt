package com.example.myapplication

import ProjetosScreen
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationView() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            Home(
                onSkills = {navController.navigate("skills") },
                onProjects = { navController.navigate("projetos") }
            )
        }
        composable("skills") {
            SkillsScreen(
                onHome = { navController.popBackStack("home", false) },
                onProjects = { navController.navigate("projetos") })
        }
        composable("projetos") {
            ProjetosScreen (
                onSkills = {navController.navigate("skills") },
                onHome = {navController.popBackStack("home", false) })
        }
    }
}