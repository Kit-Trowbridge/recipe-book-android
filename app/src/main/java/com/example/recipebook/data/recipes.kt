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
    ),
    Recipe(
        title = "Mediterranean vegetable baked rice",
        image = R.drawable.med_veg_rice,
        ingredients = listOf(
            "1 x pack prepared Mediterranean-style vegetables (pack sizes range from 300–600g/10½oz–1lb 5oz), roughly chopped into 1cm/½in pieces",
            "splash olive oil (optional, only use if no oil in vegetable pack above)",
            "1 tsp dried mixed herbs (optional, only use if no herbs in vegetable pack above)",
            "4 tbsp white wine",
            "225g/8oz arborio rice",
            "700ml/1¼ pint vegetable stock",
            "25g/1oz Parmesan or grana padano, finely grated",
            "1 tbsp butter",
            "large handful fresh herbs (such as basil, flatleaf parsley, dill, oregano or a mixture), roughly chopped",
            "1 lemon, zest and juice",
            "100g/3½oz feta (or to taste), crumbled into bite-sized pieces",
            "sea salt and freshly ground black pepper"
        ),
        steps = listOf(
            "Place a casserole over a medium–high heat. If the vegetable pack already contains oil and herbs, add the vegetable pack to the casserole and fry until softened and browned. If not, heat the oil in the casserole, add the vegetable pack and dried herbs and fry until softened and browned.",
            "Preheat the oven to 195C/175C Fan/Gas 6.",
            "Add the wine and stir well to deglaze the pan. Add the rice and stock and season with salt and pepper. Stir again and cover with the lid.",
            "Bake for about 40 minutes, or until the rice is cooked to your liking.",
            "Remove from the oven and stir well, scraping all the bits from the bottom of the pan.",
            "Mix in the Parmesan and butter until creamy.",
            "Top with the herbs, lemon zest and juice and feta. Replace the lid for 3–4 minutes.",
            "To serve, remove the lid when everyone is seated – the smell is incredible! Serve in warmed bowls."
        )
    ),
    Recipe(
        title = "Pea and pesto spaghetti",
        image = R.drawable.pea_pesto_spaghetti,
        ingredients = listOf(
            "250g/9oz frozen petits pois, or fresh garden peas",
            "115g/4oz unsalted cashew nuts",
            "55g/2oz Parmesan, grated, plus extra to serve (optional)",
            "2 large garlic cloves, halved",
            "large bunch basil, roughly chopped",
            "100ml/3½fl oz olive oil",
            "350g/12oz spaghetti",
            "salt and freshly ground black pepper"
        ),
        steps = listOf(
            "Cook the peas in a saucepan of boiling water for 3 minutes. Drain and refresh under cold water. Drain again.",
            "Place half the peas in a small food processor and add the nuts, cheese, garlic and basil. Whiz until finely chopped. Slowly add the oil, a little at a time and processing between each addition, until you have a paste consistency. Season with salt to taste.",
            "Cook the spaghetti in boiling salted water according to the packet instructions. Reserve 50ml/5fl oz of the pasta water before draining.",
            "Place the pesto in a large non-stick frying pan, add the reserved peas and the cooked spaghetti and a little pasta cooking water. Toss everything together over a high heat until well coated.",
            "Season generously with black pepper and serve with extra Parmesan, if using."
        )
    ),
    Recipe(
        title = "Slow cooker chicken shawarma",
        image = R.drawable.slow_cooker_chicken_shawarma,
        ingredients = listOf(
            "1–1.2kg/2lb 4–10oz, about 10–12 chicken thighs, skin removed and boneless",
            "4 garlic cloves, crushed",
            "1 large lemon, juice only",
            "3 tbsp olive oil",
            "2–3 large onions, very thickly sliced into rounds",
            "few pinches dried oregano",
            "salt and freshly ground black pepper",
            "2 tsp ground cumin",
            "2 tsp ground coriander",
            "2 tsp paprika (plain or sweet smoked, not hot)",
            "2 tsp turmeric",
            "½ tsp freshly ground black pepper",
            "½ tsp cayenne pepper",
            "2 tsp onion granules (optional)",
            "1 tsp salt",
            "warmed pitta, flatbread or wraps",
            "chopped salad ingredients",
            "tzatziki, hummus, garlic or chilli sauces",
            "pickled turnips and chilli"
        ),
        steps = listOf(
            "Marinate the chicken overnight for best results. Mix together the spice mix ingredients in a food bag or bowl then sprinkle the spices over the chicken thighs. Use your hands to massage the spices all over the meat. Cover and leave in the fridge overnight or for as long as you have time for.",
            "Turn the slow cooker to the high setting to heat up. In a jug, whisk the garlic, lemon juice and olive oil with a fork. Drizzle a bit in the base of the slow cooker and then add the chicken. Arrange the thighs at angles to fit in snugly and to create an even layer with no gaps. Drizzle the rest of the lemony oil over the top. Cook on low for 6 hours or on high for 3 hours, until the chicken is falling apart and still juicy.",
            "Turn the slow cooker off and preheat the grill. Lay the onion rounds on a baking tray, brush the tops with some of the juices from the slow cooker, season with salt and pepper and sprinkle with half of the oregano. Flip the onions over and repeat. Grill for 2–4 minutes on each side until the onions are well charred.",
            "Use two forks to shred the chicken. Place the shredded chicken inside the warmed breads with the charred onions, salads items, sauces and pickles."
        )
    ),
    Recipe(
        title = "Chipotle chicken burrito bowl",
        image = R.drawable.chipotle_chicken_burrito_bowl,
        ingredients = listOf(
            "2 tbsp chipotle paste",
            "½ lime, juice only",
            "250g/9oz chicken fillets",
            "spray neutral cooking oil",
            "salt and freshly ground black pepper",
            "1 large tortilla wrap, cut into triangles",
            "½ tsp smoked paprika",
            "spray neutral cooking oil",
            "salt",
            "6 tbsp tinned black beans, drained and rinsed",
            "1 avocado, sliced",
            "2 tsp jarred jalapeño chilli slices or sliced red chillies",
            "6 lettuce leaves (optional)",
            "2 tbsp soured cream",
            "2 tbsp fresh coriander, leaves picked",
            "1 lime, halved"
        ),
        steps = listOf(
            "To make the chicken, preheat the air fryer to 180C.",
            "Mix the chipotle paste and lime juice in a large bowl and season with salt and pepper. Add the chicken fillets and mix well to coat. Spray with the oil and air-fry for 12 minutes until the chicken is cooked through. You'll know the chicken is completely cooked when the juices run clear with no trace of pink when the thickest part is pierced with a skewer.",
            "Remove from the air fryer and leave to rest while you make the tortilla crisps. Leave the air fryer on at 180C.",
            "To make the tortilla crisps, add the tortilla triangles to the air fryer, stirring into all the juices left over from the chicken. Sprinkle over some salt and the paprika and spray with the oil. Shake to coat and then air-fry for 4 minutes.",
            "To serve, slice the chicken and divide between two bowls. Add half of the tortilla crisps, black beans, avocado, jalapeños and lettuce (if using) to each bowl. Top with the soured cream, coriander and lime halves."
        )
    ),
    Recipe(
        title = "Easy tuna Niçoise salad",
        image = R.drawable.easy_tuna_nicoise_salad,
        ingredients = listOf(
            "2 tsp red wine vinegar",
            "2 tsp Dijon mustard",
            "4 anchovy fillets, finely chopped",
            "2 tbsp extra virgin olive oil",
            "½ red onion, thinly sliced",
            "200g/7oz new potatoes, cleaned",
            "100g/3½oz green beans, topped and tailed",
            "2 free-range eggs, room temperature",
            "100g/3½oz tomatoes, roughly chopped into bite-sized pieces",
            "100g/3½oz cucumber, roughly chopped into bite-sized pieces",
            "50g/2oz olives, stoned and roughly chopped",
            "60g/2¼oz mixed salad leaves",
            "2 x 145–160g tins tuna, drained"
        ),
        steps = listOf(
            "To make the dressing, whisk together the vinegar, mustard and anchovy fillets with a little salt and pepper then whisk in the oil. Set aside.",
            "To make the salad, place the red onion in a clean small bowl and massage with a little salt. Leave to one side while you prefer the rest of the salad.",
            "Place the potatoes in a small pan of cold salted water. Bring to a simmer and cook until just soft when pierced with a knife. Drain and leave to cool then chop into bite-sized chunks.",
            "Bring another small saucepan of water to the boil and blanch the green beans for 2 minutes. They should still have some bite. Remove with a slotted spoon and leave flat on a plate to cool.",
            "Carefully lower the eggs into the boiling water and cook for 7 minutes for soft or 8 for a little firmer yolk. Remove and plunge the eggs straight into a bowl of iced water. Once cool peel and slice in half.",
            "To assemble, place the onion, tomatoes, cucumber, olives, mixed salad leaves, cooled green beans and potatoes in a large bowl. Pour over the dressing and mix well."
        )
    ),
    Recipe(
        title = "Beetroot, lime and chilli salad with burrata",
        image = R.drawable.beetroot_lime_chilli_burrata,
        ingredients = listOf(
            "300g/10½oz raw candy beetroots, or regular beetroot, peeled and finely sliced on a mandoline",
            "2 limes, juice only",
            "5 tbsp rapeseed oil",
            "1 shallot, finely sliced",
            "4 garlic cloves, finely sliced",
            "1 red chilli, finely sliced",
            "1 tsp cumin seeds",
            "½ tsp black mustard seeds",
            "bunch fresh curry leaves",
            "2 tbsp rice wine vinegar",
            "250g/9oz cooked beetroot, chopped",
            "1 burrata",
            "salt and freshly ground black pepper"
        ),
        steps = listOf(
            "Put the raw beetroot slices in a large bowl and squeeze over the juice of 1 lime. Set aside.",
            "Heat the rapeseed oil in a frying pan over a medium heat. Add the shallots while the oil is still heating up and fry for about 3 minutes until they just start to take on some colour.",
            "Add the garlic, chilli, cumin seeds, mustard seeds and curry leaves. Cook for 2 minutes until the seeds pop and the garlic is just starting to turn golden. Scoop the crispy bits out of the pan with a slotted spoon and leave them on a plate lined with kitchen paper to cool and crisp up.",
            "Tip the oil from the pan into a heatproof bowl and allow it to cool, then add the rice wine vinegar and squeeze in the remaining lime juice. Season the dressing with salt.",
            "Add the cooked beetroot to the bowl of raw beetroot slices. Pour over most of the dressing and give it all a toss to combine.",
            "Arrange the beetroots on a plate, then tear open the burrata and place it on top. Sprinkle over the crispy shallots and curry leaf mixture, then pour over any extra dressing and serve."
        )
    ),
    Recipe(
        title = "Vegetarian chestnut and mushroom pie",
        image = R.drawable.chestnut_mushroom_pie,
        ingredients = listOf(
            "350g/12oz plain flour",
            "200g/7oz butter, chilled",
            "pinch salt",
            "1 free-range egg yolk",
            "chilled water",
            "50g/1¾oz butter",
            "2 leeks, sliced",
            "350g/12oz mushrooms (such as chestnut or button mushrooms)",
            "2 garlic cloves, sliced",
            "large sprig thyme, leaves only",
            "15g/½oz dried mushrooms (optional), soaked in 150ml/5fl oz freshly boiled water",
            "50g/1¾oz plain flour",
            "1 tsp Dijon mustard",
            "100ml/3½fl oz marsala",
            "200–300ml/7–10fl oz vegetable or chicken stock (amount depending on whether or not you are using dried mushrooms)",
            "200g/7oz vacuum-packed chestnuts, left whole"
        ),
        steps = listOf(
            "To make the pastry, either put the plain flour and butter into a food processor with a generous pinch of salt and pulse until it resembles breadcrumbs, or rub it in by hand. Add all but a tablespoon of the egg yolk and just enough chilled water to bind it together. Shape into a ball, wrap in cling film, and chill in the fridge until you are ready to roll it. Reserve the remaining egg yolk for egg wash later.",
            "To make the filling, put the butter in a large saucepan and melt over a low heat. Add the leeks and cover. Fry for 5 minutes.",
            "Turn up the heat slightly and add the mushrooms. Cook for a further 4–5 minutes, then add the garlic and thyme. If using, drain the rehydrated mushrooms, reserving their soaking liquor, and roughly chop. Add to the saucepan.",
            "Add the flour and stir until you can see a roux has formed around the vegetables.",
            "Stir in the mustard, then add the marsala and stir until it is well incorporated. Gradually add the stock and the mushroom liquor, if using. (If not using the mushroom liquor, use the larger quantity of stock.) Bring the mixture to the boil, then turn down and simmer, continuing to stir, until it has thickened. Add the chestnuts, cover, and remove from the heat. Leave to cool.",
            "Preheat the oven to 190C/170C Fan/Gas 5.",
            "Divide the pastry into two pieces, one slightly bigger than the other. Roll out the larger piece of pastry and use it to line a pie dish. Add the cooled filling.",
            "Roll out the remaining piece of pastry and top the pie, wetting the edges with the egg wash, making sure they are well crimped together. Cut a couple of slits in the pie to let steam escape and brush with egg wash.",
            "Bake in the oven for around 40–45 minutes, or until the crust is golden brown. Serve in slices."
        )
    ),
    Recipe(
        title = "Courgette, pistachio and olive filo pie",
        image = R.drawable.courgette_pistachio_olive_pie,
        ingredients = listOf(
            "120ml/4fl oz olive oil",
            "1½ tsp fennel seeds, crushed",
            "½ tsp cumin seeds, crushed",
            "1kg/2lb 4oz courgettes, very finely sliced (ideally with a mandoline)",
            "1 fennel bulb, very finely sliced (ideally with a mandoline)",
            "6 garlic cloves, very finely sliced (ideally with a mandoline)",
            "70g/3oz baby spinach",
            "65g/2⅓oz pitted green olives, roughly chopped",
            "50g/1¾oz roasted and salted pistachios, shelled and chopped",
            "3 tsp sumac",
            "250g/9oz hummus",
            "10g/⅓oz mint leaves, finely sliced",
            "400g tin chickpeas, drained",
            "5–7 sheets filo pastry",
            "fine sea salt"
        ),
        steps = listOf(
            "Preheat the oven to 190C/170C Fan/Gas 5.",
            "Heat 100ml/3½fl oz of the olive oil in a large cast iron skillet or ovenproof frying pan (26–28cm/10½–11in) over a medium heat (if you don't have an ovenproof pan, cook the filling in a frying pan then transfer to a baking dish before adding the pastry). Add 1 teaspoon fennel seeds and the cumin seeds. Fry for 1 minute or until fragrant.",
            "Add the courgettes, fennel and garlic along with 2 teaspoons salt. Gently fry for about 20 minutes over a medium heat, until softened. Stir occasionally but not too much as they will break apart.",
            "Add the spinach and stir gently until softened (about 5 minutes). Gently stir in the olives, 40g/1½oz pistachios, 2 teaspoons sumac, hummus, mint leaves and chickpeas. Remove from the heat.",
            "Brush a sheet of filo with some of the remaining oil, then scrunch it up and place it on top of the filling. Repeat with the remaining filo until the pie is covered.",
            "Scatter over the remaining fennel seeds and some salt. Bake for 10–12 minutes until the pastry is golden brown. Sprinkle over the remaining pistachios and sumac and serve."
        )
    ),
    Recipe(
        title = "Pantry raid chopped salad with cheat's stracciatella",
        image = R.drawable.pantry_raid_chopped_salad,
        ingredients = listOf(
            "125g ball mozzarella, drained",
            "4 tbsp double cream",
            "salt",
            "1½ tbsp crispy chilli oil",
            "2 tbsp pesto",
            "2 tbsp mayonnaise",
            "1 lemon, juice only",
            "250g pouch microwaveable grains",
            "400g tin kidney, black or aduki beans, drained and rinsed",
            "1 courgette, chopped into 1cm/½in pieces",
            "½ cucumber, chopped into 1cm/½in pieces",
            "1–2 apples, mangoes or peaches, flesh chopped into 1cm/½in pieces",
            "1 Little Gem lettuce, chopped into 1cm/½in pieces",
            "2 celery sticks, finely sliced",
            "5 spring onions, trimmed and finely sliced",
            "2 large handfuls soft herbs, such as fresh flatleaf parsley, coriander or mint, chopped",
            "salt and freshly ground black pepper"
        ),
        steps = listOf(
            "To make the cheat's stracciatella, tear the mozzarella ball into small pieces. Add to a bowl with the cream and a small pinch of salt, and stir to combine. Set aside for 10–15 minutes.",
            "To make the dressing, mix all of the ingredients in a large bowl. Add a little splash of water if the dressing is too thick. Set aside.",
            "To make the salad, microwave the grains according to packet instructions and leave to cool slightly.",
            "Add all of the salad ingredients to the bowl of dressing and season with salt and pepper. Toss well to combine.",
            "To serve, divide the salad between two bowls and dollop over the cheat's stracciatella."
        )
    )
)


