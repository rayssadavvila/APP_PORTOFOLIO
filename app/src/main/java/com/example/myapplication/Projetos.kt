import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.platform.LocalContext
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

        repeat(1) {
            ProjectCard()
            ProjectCard2()
            Spacer(modifier = Modifier.height(16.dp))
        }

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
        val context = LocalContext.current

        Image(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .clip(MaterialTheme.shapes.medium)
                .clickable {
                    openUrl(
                        context,
                        "https://projeto-n0udml7jh-rayssadavvila.vercel.app/?classId=a278db46-860a-4427-8c15-29cf8cd93ad7&assignmentId=59327425-16e3-4b48-abde-b19dec5ea5b4&submissionId=b798d36e-efb6-9be0-5108-d56e2014dbe1"
                    )
                },
            painter = painterResource(id = R.drawable.img_mty), contentDescription = ""
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
            text = "Projeto de um site de recomendação de músicas através da escolha de um gênero musical (clique na imagem para ver) ",
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
        val context = LocalContext.current
        Image(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .clip(MaterialTheme.shapes.medium)
                .clickable {
                    openUrl(
                       context,
                        "https://portfolio-3dbkpmcbz-rayssadavvila.vercel.app/boredAPI.html"
                    )
                },
            painter = painterResource(id = R.drawable.img_are_you_bored_api), contentDescription = ""
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
            text = "Projeto de um site de recomendações randômicas de atividades, para caso você esteja entediado. (clique na imagem para ver) ",
            fontSize = 16.sp,
            color = Color.Gray,
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        )
    }
}

fun openUrl(context: Context, url: String) {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    context.startActivity(intent)
}
