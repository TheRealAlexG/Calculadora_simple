package com.example.estatex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.estatex.composable.IntegerUpDown
import com.example.estatex.composable.Selector
import com.example.estatex.ui.theme.EstatExTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EstatExTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EstatExTheme {
        var text by remember { mutableStateOf("Hola") }
        Column {

        TextField(value = text,
            onValueChange = {nouText -> text = nouText})

            Button(onClick = { text=""}) {
                Text(text = "Esborra")
                
            }
            IntegerUpDown(
                modifier = Modifier
                    .width(300.dp)
                    .height(300.dp)
            )

            Text(text = "DiaTriat")
            Selector (
            opcions = listOf("DG","DL","DM","DC","DJ","DV","DS"),
            onSeleccionChanged = {textSeleccionat:String,posicio:Int->
                text=textSeleccionat
            })

        }

    }
}