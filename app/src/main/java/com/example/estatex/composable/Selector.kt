package com.example.estatex.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun PreviewSelector()
{
    val dies = listOf("DG","DL","DM","DC","DJ","DV","DS")
    Selector(dies,{String, Int ->{}})

}
@Composable
fun Selector(opcions: List<String>,
          onSeleccionChanged:((String,Int)->Unit),
             modifier:Modifier=Modifier,
             opcioInicial:Int=0)
{


    var opcioSeleccionada by remember{ mutableIntStateOf(opcioInicial) }

    Row(modifier=modifier){
        opcions.mapIndexed { index, valor ->
            Text(valor,
                modifier = Modifier
                    .background(color =
                    if(index == opcioSeleccionada)
                        Color.Yellow
                    else
                        Color.White
                    )
                    .clickable { opcioSeleccionada = index
                    onSeleccionChanged(opcions[opcioSeleccionada],opcioSeleccionada)}
            )
        }
    }
}