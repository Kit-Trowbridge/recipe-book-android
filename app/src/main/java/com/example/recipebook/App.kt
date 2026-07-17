import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.recipebook.screens.RecipeListScreen
import recipes

@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "main-screen"
    ) {
        composable(route = "main-screen") {
            RecipeListScreen(
                recipes = recipes,
                onRecipeClick = { index ->
                    navController.navigate("recipe/$index")
                }
            )
        }
        composable(route = "recipe/{id}") {
        }
        composable(route = "substitutions") {
        }
    }
}