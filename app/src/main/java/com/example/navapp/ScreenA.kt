package com.example.navapp

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
fun ScreenA(){
    Column {
        Text(text = "Screen A")
        Button(onClick = {}){
            Text(text = "")
        }
    }
}