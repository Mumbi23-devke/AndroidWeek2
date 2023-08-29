package com.example.android_week2

import android.content.Intent
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android_week2.ui.theme.Android_week2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Home()
        }
    }
}

@Composable


@Preview(showBackground = true)

fun Home(){

    val email by remember{
        mutableStateOf("")
    }

    val password by remember {
        mutableStateOf("")

    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    )



    {
        Image(painter = R.drawable.Logo,
            contentDescription = null,
            )

            Text(text = "Welcome to Sky.com")

        OutlinedTextField(value = email,
            onValueChange = {email},
            label = Text(text = "Enter your email address")
        )

        OutlinedTextField(value = password,
            leadingIcon = Icon(Icons.Default.Lock, contentDescription = "lock"),
            onValueChange = {password},
            Text(text = "Enter your password")
        )


    }
    val login = LocalContext.current

    Button(onClick = {

        login.startActivity(Intent(login, Login::class.java))
    },

        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .fillMaxWidth()
    )
    
    {
        Text(text = "LOGIN")
    }

    Spacer(modifier = Modifier.height(100.dp))

    val signup = LocalContext.current

    Button(onClick = {

        signup.startActivity(Intent(signup, Signup::class.java))
    },

        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .fillMaxWidth()
    )

    {
            Text(text = "SIGN UP")
    }
    
}