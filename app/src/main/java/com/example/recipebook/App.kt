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
            val id = it.arguments?.getString("id")
            val nonNullId = requireNotNull(id?.toInt()) {"Recipe does not exist"}
            val recipe = recipes[nonNullId]
            RecipeDetailsScreen(
                recipe = recipe,
                returnToMain = { navController.navigate(
                    "main-screen"
                ) }
            )
        }
        composable(route= "substitutions") {
            // SubstitutionScreen goes here
        }
    }

}