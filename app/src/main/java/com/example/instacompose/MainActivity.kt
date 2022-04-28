package com.example.instacompose

import android.graphics.fonts.Font
import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instacompose.ui.theme.InstaComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Scaffold(topBar = { AppBar() }) {

    }
}

@Composable
fun AppBar() {
    TopAppBar(
        backgroundColor = Color.White,
        contentColor = Color.Black,
    ) {
        Text(
            text = "anas0_31",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.h5,
        )

        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_arrow_down_24),
                contentDescription = "Localized description"
            )
        }


        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(start = 100.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.add_removebg_preview),
                contentDescription = "Localized description"
            )
        }

        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(start = 10.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_dehaze_24),
                contentDescription = "Localized description"
            )
        }


    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    InstaComposeTheme {
        MainScreen()
    }
}