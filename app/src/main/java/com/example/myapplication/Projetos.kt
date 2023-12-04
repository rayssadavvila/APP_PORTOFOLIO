import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
//import androidx.compose.material3.icons.filled.ThumbUp
//import androidx.compose.material3.icons.outlined.ChatBubbleOutline
//import androidx.compose.material3.icons.outlined.Send
//import androidx.compose.material3.primaryColor
//import androidx.compose.material3.unselectedContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.ColorSpaces
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.myapplication.R

@Composable
fun ProjetosScreen(onSkills: () -> Unit, onHome: () -> Unit) {
    Column(
        Modifier.fillMaxSize(),
    ) {
        Text(
            modifier = Modifier
                .offset(y = 30.dp)
                .offset(x = 10.dp),
            fontSize = 40.sp,
            text = "Projetos",
            color = Color.hsv(hue = 300f, saturation = 1f, value = 0.4f, alpha = 1f, colorSpace = ColorSpaces.Srgb)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Exemplo de três cards
        repeat(1) {
            ProjectCard()
            ProjectCard2()
            Spacer(modifier = Modifier.height(16.dp))
        }

       /* val projects = listOf(
            ProjectCard("MTY - Music To You", "Projeto de um site de recomendação de músicas através da escolha de um gênero musical"),
            ProjectCard("Nome do Projeto 2", "Descrição do Projeto 2"),
            //ProjectCard("Nome do Projeto 3", "Descrição do Projeto 3")
        )

        projects.forEach {
            //ProjectCard(title = "MTY - Music To You", description = "projeto")

            Spacer(modifier = Modifier.height(16.dp))
        }*/

        Spacer(modifier = Modifier.weight(1f))

        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        ) {
            Button(onClick = onHome) {
                Text("Voltar para a tela Home")
            }
            Button(onClick = onSkills) {
                Text("Ir para a tela de skills")
            }
        }
    }
}

@Composable
fun ProjectCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Image(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .clip(MaterialTheme.shapes.medium),
            painter = painterResource(id = R.drawable.imagem_portfolio), contentDescription = ""
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "MTY - Music To You",
            fontSize = 20.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        )
        Text(
            text = "Projeto de um site de recomendação de músicas através da escolha de um gênero musical",
            fontSize = 16.sp,
            color = Color.Gray,
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        )
    }
}


@Composable
fun ProjectCard2() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Image(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .clip(MaterialTheme.shapes.medium),
            painter = painterResource(id = R.drawable.imagem_portfolio), contentDescription = ""
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Are You Bored?",
            fontSize = 20.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        )
        Text(
            text = "Projeto de um site de recomendações randômicas de atividades, para caso você esteja entediado. ",
            fontSize = 16.sp,
            color = Color.Gray,
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        )
    }
}
