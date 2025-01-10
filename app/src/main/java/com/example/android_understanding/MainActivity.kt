package com.example.android_understanding
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_understanding.ui.theme.Android_understandingTheme
import kotlinx.coroutines.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android_understandingTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("knjj")
                }
            }
        }


        GlobalScope.launch {
             Log.d( "ASRE" , "Coroutine thread${Thread.currentThread().name}")
        }

        Log.d( "TGYGYG" , "Main Tread ${Thread.currentThread().name}")  
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

        Text(
            text = "Hello $name!",
            modifier = modifier
        )

    }



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Android_understandingTheme {
        Greeting("Android")
    }
}