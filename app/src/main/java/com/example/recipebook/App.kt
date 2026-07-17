import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "main-screen"
    ) {
        composable(route = "main-screen") {

        }
        composable(route = "recipe/{id}") {

        }
        composable(route= "substitutions") {

        }
    }

}