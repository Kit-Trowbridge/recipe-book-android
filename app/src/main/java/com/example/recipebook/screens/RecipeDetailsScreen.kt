import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recipebook.data.Recipe

@Composable
fun RecipeDetailsScreen(recipe: Recipe, modifier: Modifier = Modifier){
    Column(){
        RecipeTitleCard(recipe = recipe)
//        Spacer(
//            Modifier.height(28.dp)
//        )
        RecipeDetails(recipe = recipe)
    }
}


@Composable
fun RecipeTitleCard(recipe: Recipe, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(recipe.image),
            recipe.title
        )
        Surface(
            color = Color.White.copy(alpha = 0.8F)
        ) {
            Text(
                text = recipe.title,
                textAlign = TextAlign.Center,
                fontSize = 28.sp,
                modifier = modifier
                    .padding(all = 14.dp)
            )
        }
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