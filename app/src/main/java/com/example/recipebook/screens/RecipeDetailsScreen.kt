import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recipebook.data.Recipe

@Composable
fun RecipeDetailsScreen(
    recipe: Recipe,
    onSeeSubstitutions: () -> Unit,
    onReturnToMain: () -> Unit,
    modifier: Modifier = Modifier
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        RecipeTitleCard(recipe = recipe)
        RecipeDetails(recipe = recipe, onSeeSubstitutions = onSeeSubstitutions)
        Button(
            onClick = onReturnToMain,
            modifier = modifier
        ) {
            Text("Return to Main")
        }
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
fun RecipeDetails(
    recipe: Recipe,
    onSeeSubstitutions: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
            Spacer(
                modifier = modifier
                    .height(14.dp)
            )

            Ingredients(recipe)

            Spacer(
                modifier = modifier
                    .height(14.dp)
            )

            Button(
                onClick= onSeeSubstitutions,
                modifier = modifier
            ) {
                Text("Need to substitute an ingredient?")
            }

            Spacer(
                modifier = modifier
                    .height(14.dp)
            )

            Instructions(recipe)

            Spacer(
                modifier = modifier
                    .height(14.dp)
            )
    }
}

@Composable
fun Ingredients(recipe: Recipe, modifier: Modifier = Modifier) {
    Column(){
        Text(
            text = "Ingredients",
            fontSize = 21.sp,
            modifier = modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
        Spacer(
            modifier = modifier
                .height(14.dp)
        )
        Text(
            text = recipe.ingredients.joinToString(),
            fontSize = 14.sp
        )
    }
}

@Composable
fun Instructions(recipe: Recipe, modifier: Modifier = Modifier) {
    Column(){
        Text(
            text = "Steps",
            fontSize = 21.sp,
            modifier = modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
        Spacer(
            modifier = modifier
                .height(14.dp)
        )
        Text(
            text = recipe.steps.joinToString(),
            fontSize = 14.sp
        )
    }
}

val previewRecipe = recipes.last()

@Preview(showBackground=true)
@Composable
fun RecipeDetailsScreenPreview(){
    Column(horizontalAlignment = Alignment.CenterHorizontally){
        RecipeTitleCard(recipe = previewRecipe)
        RecipeDetails(recipe = previewRecipe, onSeeSubstitutions = {})
        Button(
            onClick = { }
        ) {
            Text("Return to Main")
        }
    }
}