package com.example.android_week2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_week2.ui.theme.Android_week2Theme

class Signup : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable

@Preview(showBackground = true)

fun signup(){
    val name by remember{
        mutableStateOf("")
    }

    val email by remember{
        mutableStateOf("")
    }

    val password by remember{
        mutableStateOf("")
    }

    TextField(value = name,
        leadingIcon = Icon(Icons.Default.Lock, contentDescription = null),
        onValueChange ={name},
        label = Text(text = "Username"),
    )

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
        Text(text = "SIGN UP")
    }

}
