package com.hiltandcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import com.hiltandcompose.resource.Resource
import com.hiltandcompose.resource.Status
import com.hiltandcompose.resource.request.LoginRequest
import com.hiltandcompose.ui.theme.HiltAndComposeTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HiltAndComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(viewModel: PostsViewModel = hiltViewModel()) {

    LaunchedEffect(key1 = true){
        val loginRequest = LoginRequest("admin", "password123")
        viewModel.login(loginRequest).collectLatest {response->
            when(response.status){
                Status.LOADING-> Log.i("ApiResponse","Loading")
                Status.SUCCESS-> Log.i("ApiResponse","SUCCESS")
                Status.ERROR-> Log.i("ApiResponse","ERROR")
            }
        }

    }


}