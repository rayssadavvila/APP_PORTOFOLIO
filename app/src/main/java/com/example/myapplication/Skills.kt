package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.ColorSpaces
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun SkillsScreen(onProjects: () -> Unit, onHome: () -> Unit) {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            modifier = Modifier
                .offset(y=30.dp),
            fontSize = 40.sp,
            text = "Skills", color = Color.hsv(hue = 300f, saturation= 1f, value = 0.4f, alpha = 1f, colorSpace = ColorSpaces.Srgb))


        Image(
            painter = painterResource(id = R.drawable.html_logo), contentDescription = "",
            modifier = Modifier
                .size(50.dp)
                .offset(y = 40.dp)
        )

        Text(
            modifier = Modifier
                .offset(y= 50.dp),
            text = "HTML - NÍVEL INTERMEDIÁRIO", fontWeight = Bold)


        Image(
            painter = painterResource(id = R.drawable.css_logo), contentDescription = "",
            modifier = Modifier
                .size(50.dp)
                .offset(y = 70.dp)
        )

        Text(
            modifier = Modifier
                .offset(y= 80.dp),
            text = "CSS - NÍVEL INTERMEDIÁRIO", fontWeight = Bold)

        Image(
            painter = painterResource(id = R.drawable.js_logo), contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .offset(y = 100.dp)
        )

        Text(
            modifier = Modifier
                .offset(y = 110.dp),
            text = "JS - NÍVEL INTERMEDIÁRIO", fontWeight = Bold)

        Image(
            painter = painterResource(id = R.drawable.figma_logo), contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .offset(y = 140.dp)
        )

        Text(
            modifier = Modifier
                .offset(y = 150.dp),
            text = "FIGMA - NÍVEL AVANÇADO", fontWeight = Bold)

        Image(
            painter = painterResource(id = R.drawable.java_logo), contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .offset(y = 170.dp)
        )

        Text(
            modifier = Modifier
                .offset(y = 180.dp),
            text = "JAVA - NÍVEL AVANÇADO", fontWeight = Bold)


        //Text("SKILLS")
        Button(
            modifier = Modifier
                .offset(y = 200.dp),
            onClick = onHome) {
            Text("Ir para a tela Home") }

        Button(
            modifier = Modifier
                .offset(y = 200.dp),
            onClick = onProjects) { Text("Ir para a tela de projetos") }
    }
}