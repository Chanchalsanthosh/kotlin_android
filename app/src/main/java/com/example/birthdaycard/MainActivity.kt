package com.example.birthdaycard

import android.os.Bundle
import android.os.Message
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.birthdaycard.ui.theme.BirthdayCardTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    BirthdayGreetingsWithText("Happy Birthday CHANDNI" ,  "Chanchal")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingsWithText(message: String , from: String){


            Column() {
                Text(
                    text = message ,
                    fontSize = 36.sp,
                )
                Text(
                    text = from ,
                    fontsize= 24.sp,
                )
            }
        }




@Composable
fun BirthdayGreetingsWithImage(message: String,from: String){
    val image= painterResource(R.drawable.card)
}











@Preview(showBackground = true)
@Composable
fun BirthdayCardpreview() {
    BirthdayCardTheme {
        BirthdayGreetingsWithText("Happy Birthday CHANDNI" ,  " from Chanchal")


    }
}