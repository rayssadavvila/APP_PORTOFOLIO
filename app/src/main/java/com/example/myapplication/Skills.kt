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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun SkillsScreen(onHome: () -> Unit, onProjects: () -> Unit) {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        //verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier
                .offset(y=30.dp),
            fontSize = 40.sp,
            text = "SKILLS" )


        Image(
            painter = painterResource(id = R.drawable.html_logo), contentDescription = "",
            //contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(50.dp)
                //.clip(RoundedCornerShape(16.dp))
                .offset(y = 40.dp)
                //.offset(x=20.dp) ,
        )

        Text(
            modifier = Modifier
                .offset(y= 50.dp),
            text = "HTML - NÍVEL INTERMEDIÁRIO")


        Image(
            painter = painterResource(id = R.drawable.css_logo), contentDescription = "",
            //contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(50.dp)
                //.clip(RoundedCornerShape(16.dp))
                .offset(y = 70.dp)
            //.offset(x=20.dp) ,
        )

        Text(
            modifier = Modifier
                .offset(y= 80.dp),
            text = "CSS - NÍVEL INTERMEDIÁRIO")

        Image(
            painter = painterResource(id = R.drawable.js_logo), contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .offset(y = 100.dp)
        )

        Text(
            modifier = Modifier
                .offset(y = 110.dp),
            text = "JS - NÍVEL INTERMEDIÁRIO")

        Image(
            painter = painterResource(id = R.drawable.figma_logo), contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .offset(y = 140.dp)
        )

        Text(
            modifier = Modifier
                .offset(y = 150.dp),
            text = "FIGMA - NÍVEL AVANÇADO")

        Image(
            painter = painterResource(id = R.drawable.java_logo), contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .offset(y = 170.dp)
        )

        Text(
            modifier = Modifier
                .offset(y = 180.dp),
            text = "JAVA - NÍVEL AVANÇADO")

        //Text("SKILLS")
        Button(
            modifier = Modifier
                .offset(y = 200.dp)
                .offset(x = 10.dp),
            onClick = onHome) {
            Text("Ir para a tela Home") }

        Button(
            modifier = Modifier
                .offset(y = 200.dp)
                .offset(x = 10.dp),
            onClick = onProjects) { Text("Ir para a tela de projetos") }
    }
}