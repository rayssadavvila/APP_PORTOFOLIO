package com.example.myapplication



import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ProjetosScreen(onSkills: () -> Unit, onHome: () -> Unit) {
    Column(
        Modifier.fillMaxSize(),
        //horizontalAlignment = Alignment.CenterHorizontally,
        //verticalArrangement = Arrangement.Center
    ) {
        Text(
                modifier = Modifier
                    .offset(y=30.dp),
                fontSize = 40.sp,
            text = "Projetos")

        Button(
            modifier = Modifier
                .offset(y = 50.dp)
                .offset(x = 10.dp),
            onClick = onHome) {
            Text("Voltar para a tela Home")
        }
        Button(
            modifier = Modifier
                .offset(y = 50.dp)
                .offset(x = 10.dp),
            onClick = onSkills) { Text("Ir para a tela de skills")
        }
    }
}