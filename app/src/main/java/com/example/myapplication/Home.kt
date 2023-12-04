package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


    @Composable
    fun Home(onSkills: () -> Unit, onProjects: () -> Unit) {
        Column(
            Modifier.fillMaxSize(),
            //horizontalAlignment = Alignment.CenterHorizontally,
            //verticalArrangement = Arrangement.Center
        ) {
            //@Composable
            //fun purpleText(){
                Text(
                    modifier = Modifier
                        .offset(y=30.dp)
                        .offset(x=10.dp),
                    fontSize = 40.sp,
                    text = "Portfólio", color = Color.hsv(hue = 300f, saturation= 1f, value = 0.4f, alpha = 1f, colorSpace = ColorSpaces.Srgb))
            //}

            /*@Composable
            fun BlueText() {
                Text("Hello World", color = Color.Blue)
            }*/
            
            Image(
                painter = painterResource(id = R.drawable.imagem_portfolio), contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .offset(y= 40.dp)
                    .offset(x=20.dp)
            )
            Text(

                text = "Oi! me chamo Rayssa, e sou estudante do quinto período do curso de Ciência da Computação. Minhas áreas de interesse são em \n desenvolvimento, tanto front-end \n quanto back-end. \n Sobre esse portfólio, dividi ele em 3 partes\n sendo elas: Home, Skills e Projetos",
                modifier = Modifier
                    .offset(y=30.dp)
                    .offset(x=20.dp)
            )
            Button(
                modifier = Modifier
                    .offset(y = 50.dp)
                    .offset(x = 10.dp),
                    //.background(Color.Black),
                onClick = onSkills) {
                    Text("Ir para tela de Skills")
                }
           // )
            Button(
                modifier = Modifier
                    .offset(y = 50.dp)
                    .offset(x = 10.dp),
                onClick = onProjects) { Text("Ir para a tela de projetos")
            }
            /*{
                Text("Ir para tela de Skills")

                Button(
                    modifier = Modifier
                        .offset(y = 50.dp)
                        .offset(x = 10.dp),
                    onClick = onProfile) { Text("Ir para a tela de projetos")
                }
            }*/
        }
    }
