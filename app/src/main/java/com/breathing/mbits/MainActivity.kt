package com.breathing.mbits

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(text = "Hello MBITS")
        }
    }
}


@Composable
fun viewMBITS(name:String){

    Text(text = "Hello $name")
}

@Preview(showBackground = true, name = "Hello message", showSystemUi = true, widthDp = 200, heightDp = 200)
@Composable
private fun previewFunction(){
    viewMBITS(name = "Vivek")
}