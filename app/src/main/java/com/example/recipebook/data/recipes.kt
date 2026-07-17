import com.example.recipebook.R
import com.example.recipebook.data.Recipe

var recipes: List<Recipe> = listOf(
    Recipe(
        title = "Veggie sausage gochujang gnocchi with crispy kale",
        image = R.drawable.veggie_sausage_gochujang,
        ingredients = listOf(
            "100–120g/3½–4½oz kale, leaves roughly torn and any tough stems discarded",
            "2–3 tbsp olive oil",
            "6–8 vegetarian sausages (about 300g/10½oz)",
            "800g/1lb 12oz gnocchi",
            "2 shallots, peeled and finely chopped",
            "5 garlic cloves, finely chopped",
            "2 tbsp gochujang, or to taste",
            "4 tbsp light cream cheese",
            "salt and freshly ground black pepper",
            "freshly grated Parmesan (or a similar vegetarian hard cheese), to serve"
        ),
        steps = listOf(
            "Preheat the oven to 200C/180C Fan/Gas 6.",
            "Toss the kale with 1 tablespoon oil and a pinch of salt in a large bowl. Transfer to a baking tray and roast for 10 minutes, shaking halfway through, until nice and crisp. Set aside.",
            "Meanwhile, heat 1 tablespoon oil in a large frying pan. Break the sausages up into small pieces in the pan and fry until golden and crisp. Remove from the pan and set aside.",
            "Cook the gnocchi in a large saucepan of boiling water according to packet instructions. Drain and reserve a mug of the gnocchi cooking water.",
            "In the same pan as the sausages, heat the remaining oil, if needed, and fry the shallots and garlic for a few minutes until softened. Stir in the gochujang, cream cheese and a splash of the gnocchi cooking water. Mix until smooth and saucy, adding more gnocchi water if needed to loosen.",
            "Stir in the gnocchi and sausage pieces, tossing it all together. Season with salt and pepper.",
            "Serve in bowls and top each with the crispy kale, a generous sprinkling of Parmesan and an extra crack of black pepper."
        )
    )
)


