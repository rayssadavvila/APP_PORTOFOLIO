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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.ColorSpaces
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
                .offset(y=30.dp)
                .offset(x=10.dp),
            fontSize = 40.sp,
            text = "Projetos", color = Color.hsv(hue = 300f, saturation= 1f, value = 0.4f, alpha = 1f, colorSpace = ColorSpaces.Srgb))

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