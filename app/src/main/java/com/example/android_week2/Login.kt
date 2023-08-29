package com.example.android_week2

import android.graphics.drawable.Icon
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_week2.ui.theme.Android_week2Theme

class Login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            login()
        }
    }
}

@Composable

@Preview(showBackground = true)

fun login(){

    val email by remember{
        mutableStateOf("")
    }

    val password by remember{
        mutableStateOf("")
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Magenta)
    )


    {
        Text(text = "SIGN UP")
    }

    TextField(value = email,
        onValueChange ={email},
        label = Text(text = "Email address"),
    )

    TextField(value = password,
        leadingIcon = Icon(Icons.Default.Lock, contentDescription = null),
        onValueChange ={password},
        label = Text(text = "Password"),
    )
    
    Button(onClick = { /*TODO*/ })
    {
        Text(text = "LOGIN")
    }

}