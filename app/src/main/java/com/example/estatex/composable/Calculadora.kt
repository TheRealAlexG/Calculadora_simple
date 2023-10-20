package com.example.estatex.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.booleanResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(widthDp = 700, heightDp = 600, showBackground = true)
@Composable
fun Calculadora(){

    var estat by remember { mutableStateOf("null")}
    var pantallaResultat by remember{ mutableStateOf("0") }
    var memoria by remember {mutableStateOf("0") }
    var total by remember { mutableStateOf("0")}






    Column(modifier= Modifier
        .background(Color.Black)
        .padding(20.dp)) {

        Text(text = pantallaResultat , modifier = Modifier
            .background(Color(74, 70, 70))
            .fillMaxWidth()
            .padding(20.dp),
            fontSize = 80.sp,
            textAlign = TextAlign.End,
            color= Color(228,89,24)
            )

            Row (modifier= Modifier
                //.background(Color.White)
                .fillMaxWidth()
                .fillMaxHeight())
            {
                Column(modifier=Modifier
                    .weight(3F))
                {
                    Row(modifier=Modifier
                        .weight(1F)) {
                        Button(onClick = {



                            if(pantallaResultat!="0")pantallaResultat+=1

                            else{
                                pantallaResultat="1"
                            }
                            if(estat=="true")
                                total=memoria+"10"





                                         },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0XFFE45918)),
                            shape = RoundedCornerShape(percent=10),
                            modifier = Modifier
                                .padding(5.dp)
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .weight(1F)
                        ) {
                            Text(text = "1",
                                color = Color.Black,
                                fontSize = 50.sp

                            )
                        }
                        Button(onClick = {
                            if(pantallaResultat!="0")pantallaResultat+=2

                            else{
                                pantallaResultat="2"




                            }
                        },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0XFFE45918)),
                            shape = RoundedCornerShape(percent=10),
                            modifier = Modifier
                                .padding(5.dp)
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .weight(1F)
                        ) {
                            Text(text = "2",
                                color = Color.Black,
                                fontSize = 50.sp)
                        }
                        Button(onClick = {
                            if(pantallaResultat!="0")pantallaResultat+=3

                            else{
                                pantallaResultat="3"
                            }
                        },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0XFFE45918)),
                            shape = RoundedCornerShape(percent=10),
                            modifier = Modifier
                                .padding(5.dp)
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .weight(1F)
                        ) {
                            Text(text = "3",
                                color = Color.Black,
                                fontSize = 50.sp)
                        }


                    }

                    Row (modifier=Modifier
                        .weight(1F)) {
                        Button(onClick = {
                            if(pantallaResultat!="0")pantallaResultat+=4

                            else{
                                pantallaResultat="4"
                            }
                        },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0XFFE45918)),
                            shape = RoundedCornerShape(percent=10),
                            modifier = Modifier
                                .padding(5.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .weight(1F)
                        ) {
                            Text(text = "4",
                                color = Color.Black,
                                fontSize = 50.sp)
                        }
                        Button(onClick = {
                            if(pantallaResultat!="0")pantallaResultat+=5

                            else{
                                pantallaResultat="5"
                            }
                        },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0XFFE45918)),
                            shape = RoundedCornerShape(percent=10),
                            modifier = Modifier
                                .padding(5.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .weight(1F)
                        ) {
                            Text(text = "5",
                                color = Color.Black,
                                fontSize = 50.sp)
                        }
                        Button(onClick = {
                            if(pantallaResultat!="0")pantallaResultat+=6

                            else{
                                pantallaResultat="6"
                            }
                        },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0XFFE45918)),
                            shape = RoundedCornerShape(percent=10),
                            modifier = Modifier
                                .padding(5.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .weight(1F)
                        ) {
                            Text(text = "6",
                                color = Color.Black,
                                fontSize = 50.sp)
                        }


                    }

                    Row(modifier=Modifier
                        .weight(1F)) {

                        Button(onClick = {
                            if(pantallaResultat!="0")pantallaResultat+=7

                            else{
                                pantallaResultat="7"
                            }
                        },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0XFFE45918)),
                            shape = RoundedCornerShape(percent=10),
                            modifier = Modifier
                                .padding(5.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .weight(1F)
                        ) {
                            Text(text = "7",
                                color = Color.Black,
                                fontSize = 50.sp)
                        }
                        Button(onClick = {
                            if(pantallaResultat!="0")pantallaResultat+=8

                            else{
                                pantallaResultat="8"
                            }
                        },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0XFFE45918)),
                            shape = RoundedCornerShape(percent=10),
                            modifier = Modifier
                                .padding(5.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .weight(1F)
                        ) {
                            Text(text = "8",
                                color = Color.Black,
                                fontSize = 50.sp)
                        }
                        Button(onClick = {
                            if(pantallaResultat!="0")pantallaResultat+=9

                            else{
                                pantallaResultat="9"
                            }
                        },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0XFFE45918)),
                            shape = RoundedCornerShape(percent=10),
                            modifier = Modifier
                                .padding(5.dp)
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .weight(1F)
                        ) {
                            Text(text = "9",
                                color = Color.Black,
                                fontSize = 50.sp)
                        }


                    }

                    Row (modifier=Modifier
                        .weight(1F)){
                        Button(onClick = {
                            if(pantallaResultat!="0")pantallaResultat+=0

                            else{
                                pantallaResultat="0"
                            }
                        },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0XFFE45918)),
                            shape = RoundedCornerShape(percent=10),
                            modifier = Modifier
                                .padding(5.dp)
                                .fillMaxSize()

                        ) {
                            Text(text = "0",
                                color = Color.Black,
                                fontSize = 50.sp)
                        }

                    }


                }

                Column (modifier= Modifier
                    .fillMaxSize()
                    .weight(2F)
                    .padding(10.dp)) {

                    Row(modifier=Modifier
                        .weight(1F)){
                        Button(onClick = {
                            pantallaResultat="0"
                        },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0XFFF49C0B)),
                            shape = RoundedCornerShape(percent=10),
                            modifier = Modifier
                                .padding(5.dp)
                                .fillMaxSize()
                                .weight(1F)

                        ) {
                            Text(text = "C",
                                color = Color.Black,
                                fontSize = 50.sp)
                        }

                        Button(onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0XFFF49C0B)),
                            shape = RoundedCornerShape(percent=10),
                            modifier = Modifier
                                .padding(5.dp)
                                .fillMaxSize()
                                .weight(1F)

                        ) {
                            Text(text = "=",
                                color = Color.Black,
                                fontSize = 50.sp)
                        }



                    }

                    Row(modifier=Modifier
                        .weight(1F)){
                        Button(onClick = {
                                         estat = "Suma"
                            memoria=pantallaResultat










                        },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0XFFF49C0B)),
                            shape = RoundedCornerShape(percent=10),
                            modifier = Modifier
                                .padding(5.dp)
                                .fillMaxSize()
                                .weight(1F)

                        ) {
                            Text(text = "+",
                                color = Color.Black,
                                fontSize = 50.sp)
                        }

                        Button(onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0XFFF49C0B)),
                            shape = RoundedCornerShape(percent=10),
                            modifier = Modifier
                                .padding(5.dp)
                                .fillMaxSize()
                                .weight(1f)

                        ) {
                            Text(text = "-",
                                color = Color.Black,
                                fontSize = 50.sp)
                        }



                    }


                }


            }








    }
}