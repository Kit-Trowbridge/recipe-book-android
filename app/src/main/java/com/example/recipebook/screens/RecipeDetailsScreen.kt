import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.recipebook.R
import com.example.recipebook.data.Recipe

@Composable
fun RecipeDetailsScreen(recipe: Recipe, modifier: Modifier = Modifier){
    Column(){
        RecipeTitleCard(recipe = recipe)
        RecipeDetails(recipe = recipe)
    }
}


@Composable
fun RecipeTitleCard(recipe: Recipe, modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Image(
            painter = painterResource(recipe.image)
        )
        Text(
            text = recipe.title,
            fontSize = 28.sp
        )
    }

}

@Composable
fun RecipeDetails(recipe: Recipe, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(){
            Text(
                text = recipe.ingredients.joinToString(),
                fontSize = 14.sp
            )
        }
        Row(){}

    }
}

val previewRecipe = recipes.last()

@Preview(showBackground=true)
@Composable
fun RecipeDetailsScreenPreview(){
    Column(){
        RecipeTitleCard(recipe = previewRecipe)
        RecipeDetails(recipe = previewRecipe)
    }
}