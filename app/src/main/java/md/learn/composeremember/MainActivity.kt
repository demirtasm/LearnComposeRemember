package md.learn.composeremember

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import md.learn.composeremember.ui.theme.ComposeRememberTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeRememberTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    captainGame()
                }
            }
        }
    }
}

@Composable
fun captainGame() {
    val treasuresFound = remember {mutableStateOf(0)}
    val direction = remember { mutableStateOf("North")}
    Column {
        Text(text = "Treasures Found: ${treasuresFound.value}")
        Text(text = "Curretn Direction: ${direction.value}")
        Button(onClick = {
            direction.value = "East"
            if(Random.nextBoolean()){
                treasuresFound.value += 1
            }
        }) {
            Text(text = "Sail East")
        }
        Button(onClick = {
            direction.value = "West"
            if(Random.nextBoolean()){
                treasuresFound.value += 1
            }
        }) {
            Text(text = "Sail West")
        }
        Button(onClick = {
            direction.value = "North"
            if(Random.nextBoolean()){
                treasuresFound.value += 1
            }
        }) {
            Text(text = "Sail North")
        }
        Button(onClick = {
            direction.value = "South"
            if(Random.nextBoolean()){
                treasuresFound.value += 1
            }
        }) {
            Text(text = "Sail South")
        }
    }
}
}
/**
 * In Jetpack Compose, remember is a utility function used for retaining state across recompositions of a Composable function.
 * It allows you to keep track of mutable state within a Composable function without having to manage the state yourself.
 *
 * The remember function is similar to mutableStateOf in that it holds a piece of mutable state,
 * but it also ensures that the state is preserved across recompositions of the Composable function.
 * When the Composable function is recomposed, remember returns the previously remembered state,
 * so the state is retained and not reset to its initial value.
 */

/**
 * Composable fonksiyonlar remember ile işaretlenmiş objeleri hafızada saklayabilirler.
 * Bu sayede objenin içeriği değiştiği zaman o objeyi işaret eden tüm viewlar recompositiona(yeniden çizdirilme) uğramış olur.
 *
 * val mutableState = remember { mutableStateOf(default) }
 * val value by remember { mutableStateOf(default) }
 * val (value, setValue) = remember { mutableStateOf(default) }
 */
