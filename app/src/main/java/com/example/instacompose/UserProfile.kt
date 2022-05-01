package com.example.instacompose

data class UserProfile constructor(val pictureUrl : String)

val userProfileList = arrayListOf(
    UserProfile(pictureUrl = "https://images.unsplash.com/photo-1485290334039-a3c69043e517?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=80")
)