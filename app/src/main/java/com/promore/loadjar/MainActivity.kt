package com.promore.loadjar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.promore.loadjar.ui.theme.LoadJarTheme
import com.promore.main_log.MainLog

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoadJarTheme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
                ) {
                    Button(
                        onClick = {
                            loadLib()

                        },
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally),


                        ) {
                        Text(text = "Load lib")
                    }


                }
            }
        }
    }


    private fun loadLib() {
        MainLog().mainLog()
    }
}

