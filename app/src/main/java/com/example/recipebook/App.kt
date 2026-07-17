import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun App(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "main-screen"
    ) {
        composable(route = "main-screen") {
            // MainScreen goes here
        }
        composable(route = "recipe/{id}") {

        }
        composable(route= "substitutions") {
            // SubstitutionScreen goes here
        }
    }

}