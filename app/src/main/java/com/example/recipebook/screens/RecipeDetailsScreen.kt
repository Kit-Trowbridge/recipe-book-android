import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
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
    Scaffold(
        floatingActionButton = {
            ExtendedFloatingActionButton(onClick = onReturnToMain) {
                Text("View all")
            }
        }
    ) { innerPadding ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
        ){
            RecipeTitleCard(recipe = recipe)
            RecipeDetails(recipe = recipe, onSeeSubstitutions = onSeeSubstitutions)
            Spacer(
                modifier = modifier
                    .height(63.dp)
            )
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

        recipe.ingredients.forEach(
            {Text(
                text = "🍴 $it",
                fontSize = 14.sp,
                modifier = modifier
                    .padding(start = 14.dp, bottom = 3.dp, end = 14.dp)
            )}
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

        for ((index, step) in recipe.steps.withIndex()) {
            Text(
                text= "${index + 1}. $step",
                fontSize = 14.sp,
                modifier = modifier
                    .padding(start = 14.dp, bottom = 7.dp, end = 14.dp)
            )
        }
    }
}

val previewRecipe = recipes.first()

@Preview(showBackground=true)
@Composable
fun RecipeDetailsScreenPreview(){
    Scaffold(
        floatingActionButton = {
            ExtendedFloatingActionButton(onClick = { }) {
                Text("View all")
            }
        }
    ) {
        innerPadding ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
        ){
            RecipeTitleCard(recipe = previewRecipe)
            RecipeDetails(recipe = previewRecipe, onSeeSubstitutions = {})
            Button(
                onClick = { }
            ) {
                Text("Return to Main")
            }

        }

    }

}