package com.example.proyfin1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.proyfin1.navegacion.NavegacionApp
import com.example.proyfin1.pantallas.PrimeraPantalla
import com.example.proyfin1.ui.theme.ProyFin1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyFin1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NavegacionApp()
                }
            }
        }
    }
}

/*
15.a retorna el último elemento en el stack de transiciónes de escenas
1. No ya que estamos usando jetpack
2.No no es necesario ya que Jetpack es capaz de manejar esto
3.Si para contener los datos leidos desde la API
4. En el hilo de UI
 */



