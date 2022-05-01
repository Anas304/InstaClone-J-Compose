package com.example.instacompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
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
fun MainScreen(userProfile: List<UserProfile> = userProfileList) {
    Scaffold(topBar = { AppBar() }) {
        Surface(modifier = Modifier.wrapContentSize()) {
            Column(
                modifier = Modifier.wrapContentSize(),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                ProfileCard()
                UserBioCard()
                UserProfileSettings()
                Highlights()
                NavButtons()
            }
        }
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


        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(start = 135.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.add_removebg_preview),
                contentDescription = "Localized description"
            )
        }

        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(start = 0.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_dehaze_24),
                contentDescription = "Localized description"
            )
        }


    }
}

@Composable
fun ProfileCard() {
    Card(
        modifier = Modifier
            /* .padding(top = 8.dp, bottom = 8.dp, start = 16.dp, end = 16.dp)*/
            .fillMaxWidth(),
        backgroundColor = Color.White
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ) {
            Profilepicture()
            Spacer(modifier = Modifier.width(5.dp))
            ProfileContent()
        }

    }
}

@Composable
fun Profilepicture() {
    Card(
        shape = CircleShape,
        border = BorderStroke(width = 2.dp, color = Color.LightGray),
        modifier = Modifier.padding(18.dp),
        elevation = 8.dp,
    ) {
        Image(
            modifier = Modifier.size(110.dp),
            painter = rememberImagePainter(data = R.drawable.ppic,
                builder = {
                    transformations(CircleCropTransformation())
                }),
            contentDescription = "Content Description"
        )

    }
}

@Composable
fun ProfileContent() {
    Row(
        modifier = Modifier.wrapContentSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(modifier = Modifier.width(10.dp))
        ProfileStat(numberText = "304", text = "Posts")
        Spacer(modifier = Modifier.width(30.dp))
        ProfileStat(numberText = "93", text = "Followers")
        Spacer(modifier = Modifier.width(30.dp))
        ProfileStat(numberText = "58", text = "Following")
    }
}

@Composable
fun UserBioCard() {
    Card(
        backgroundColor = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 12.dp, end = 20.dp),
            horizontalAlignment = Alignment.Start,

            ) {

            Text(text = "Anas")
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text(text = "Art")
            }
            Text(text = "Coding")
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text(text = "Caffeine")
            }
            Text(
                color = Color.Blue,
                text = "m.youtube.com/channel/SFSOFSDFhY67NH4UCg"
            )
        }

    }
}

@Composable
fun UserProfileSettings() {
    Column(
        modifier = Modifier
            .padding(top = 10.dp)
            .wrapContentSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start
    ) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
            border = BorderStroke(width = 2.dp, color = Color.Gray)
        ) {
            Text(
                text = "Edit Profile",
                fontWeight = FontWeight.Bold
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.padding(start = 10.dp, top = 5.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                border = BorderStroke(width = 2.dp, color = Color.Gray)
            ) {
                Text(
                    text = "Ad Tools",
                    modifier = Modifier.padding(start = 15.dp, end = 10.dp),
                    fontWeight = FontWeight.Bold
                )
            }

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.padding(start = 10.dp, top = 5.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                border = BorderStroke(width = 2.dp, color = Color.Gray)
            ) {
                Text(
                    text = "Insights",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 15.dp, end = 10.dp)
                )
            }

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.padding(start = 10.dp, top = 5.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                border = BorderStroke(width = 2.dp, color = Color.Gray)
            ) {
                Text(
                    text = "Contacts",
                    modifier = Modifier.padding(start = 15.dp, end = 1.dp),
                    fontWeight = FontWeight.Bold
                )
            }
        }

    }

}

@Composable
fun Highlights() {
    Card(
        backgroundColor = Color.White,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.Start,
        ) {
            Card(
                shape = CircleShape,
                border = BorderStroke(width = 2.dp, color = Color.LightGray),
                modifier = Modifier.padding(
                    start = 10.dp,
                    top = 15.dp,
                    bottom = 5.dp,
                    end = 250.dp
                ),
                elevation = 8.dp,
            ) {
                Image(
                    modifier = Modifier.size(70.dp),
                    painter = rememberImagePainter(data = R.drawable.ppic,
                        builder = {
                            transformations(CircleCropTransformation())
                        }),
                    contentDescription = "Content Description"
                )

            }
            Text(text = "Highlights", modifier = Modifier.padding(start = 10.dp))

        }
    }
}

@Composable
fun NavButtons() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            modifier = Modifier.size(70.dp),
            painter = rememberImagePainter(data = R.drawable.grid_black,
                builder = {
                    transformations(CircleCropTransformation())
                }),
            contentDescription = "Content Description"
        )


    }
}

@Composable
fun ProfileStat(
    numberText: String,
    text: String,
) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = numberText, style = MaterialTheme.typography.h6)
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text(text = text)
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