package com.shcherbakov.android_lab_5_zlamanyuk_telyatnikova

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun TitleBlock() {
    Column( // test
        modifier = Modifier
            .padding(top = 100.dp, start = 70.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Пример compose-приложения",
            fontSize = 20.sp
        )
        Text(
            text = "Row, Column, Size, ARGB",
            fontSize = 16.sp,
            color = Color.Gray
        )
    }
}

@Composable
fun MainScreen() {
    Column {
        TitleBlock()
        CombinedBlock()
        ColorRow()
    }
}

@Composable
fun ColorRow() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(70.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        ColorBox(Color(0xFFFF0000))
        ColorBox(Color(0x8000FF00))
        ColorBox(Color(0xFF0000FF))
    }
}

@Composable
fun ColorBox(color: Color) {
    Box(
        modifier = Modifier
            .size(80.dp)
            .background(color)
            .padding(8.dp)
    )
}

@Composable
fun CombinedBlock() {
    Row {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(top=106.dp)
                .background(color = Color.Gray)
        ) {
            Text("Левая колонка")
            Text("Текст 1")
        }
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(top=106.dp)
                .background(color = Color.Gray),
            horizontalAlignment = Alignment.End
        )
        {
            Text("Правая колонка")
            Text("Текст 2")
        }
    }
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(8.dp),
//        verticalArrangement = Arrangement.SpaceBetween
//    ) {
//        Text("Комб блок")
//        Row{
//            Box(
//                modifier = Modifier
//                    .size(40.dp)
//                    .background(Color.Yellow)
//            )
//            Box(
//                modifier = Modifier
//                    .size(40.dp)
//                    .background(Color.Cyan)
//            )
//        }
//    }
}

//        val symbols = "Hello world!".filter { it.isLetter() }
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(8.dp)
//                .background(color = Color.Green),
//            verticalArrangement = Arrangement.SpaceEvenly,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceEvenly
//            ) {
//                for (char in symbols) {
//                    Text(
//                        text = char.toString(),
//                        fontWeight = FontWeight.ExtraBold,
//                        color = Color.Blue,
//                        fontSize = 20.sp,
//                        letterSpacing = 24.sp
//                    )
//                }
//            }
//            Spacer(modifier = Modifier.height(16.dp))
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceEvenly
//            ) {
//                for (char in symbols.reversed()) {
//                    Text(
//                        text = char.toString(),
//                        fontWeight = FontWeight.ExtraBold,
//                        color = Color.Red,
//                        fontSize = 20.sp,
//                        letterSpacing = 24.sp
//                    )
//                }
//            }
//
//        }
//    }
//}
//Column(
//modifier = Modifier
//.fillMaxSize()
//.background(Color. White)
//.padding(16.dp),
//verticalArrangement = Arrangement.SpaceEvenly,
//horizontalAlignment = Alignment.CenterHorizontally
//){
//    Box(
//        modifier = Modifier
//            .size(100.dp)
//            .background(Color(0xFFFF0000))
//    )
//    Box(
//        modifier = Modifier
//            .size(100.dp)
//            .background(Color(0x80FF0000))
//    )
//}
//}
//Scaffold(
//topBar = {
//    TopAppBar(
//        title = { Text(text = "Scaffold example") }
//    )
//},
//floatingActionButton = {
//    FloatingActionButton(onClick = { }) {
//        Text(text = "+")
//    }
//}
//) { paddingValues ->
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(paddingValues),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = "Основное содержимое экрана")
//    }
//}