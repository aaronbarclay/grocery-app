package groceryapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.Resource;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GroceryPopulator implements CommandLineRunner {
	@Resource
	private RecipeRepository recipeRepo;

	@Resource
	private IngredientRepository ingredientRepo;

	@Resource
	private StoreItemRepository storeItemRepo;

	@Resource
	private LineItemRepository lineItemRepo;

	@Resource
	private TagRepository tagRepo;

	@Resource
	private SelectedIngredientsListRepository selectedIngredientsListRepo;

	@Override
	public void run(String... args) throws Exception {

		SelectedIngredientsList selectedIngredientsList = new SelectedIngredientsList();
		selectedIngredientsListRepo.save(selectedIngredientsList);

		Tag tag1 = new Tag(1L, "fettuccine");
		tagRepo.save(tag1);

		Tag tag2 = new Tag(2L, "broccoli");
		tagRepo.save(tag2);

		Tag tag3 = new Tag(3L, "butter");
		tagRepo.save(tag3);

		Tag tag4 = new Tag(4L, "minced garlic");
		tagRepo.save(tag4);

		Tag tag5 = new Tag(5L, "garlic powder");
		tagRepo.save(tag5);

		Tag tag6 = new Tag(6L, "pepper");
		tagRepo.save(tag6);

		Tag tag7 = new Tag(7L, "salt");
		tagRepo.save(tag7);

		Tag tag8 = new Tag(8L, "heavy cream");
		tagRepo.save(tag8);

		Tag tag9 = new Tag(9L, "parmesan cheese");
		tagRepo.save(tag9);

		Tag tag10 = new Tag(10L, "chicken");
		tagRepo.save(tag10);

		Tag tag11 = new Tag(11L, "flour");
		tagRepo.save(tag11);

		Tag tag12 = new Tag(12L, "onions");
		tagRepo.save(tag12);

		Tag tag13 = new Tag(13L, "chicken broth");
		tagRepo.save(tag13);

		Tag tag14 = new Tag(14L, "milk");
		tagRepo.save(tag14);

		Tag tag15 = new Tag(15L, "frozen peas & carrots");
		tagRepo.save(tag15);

		Tag tag16 = new Tag(16L, "refrigerated pie crust");
		tagRepo.save(tag16);

		Tag tag17 = new Tag(17L, "egg noodles");
		tagRepo.save(tag17);
		Tag tag18 = new Tag(18L, "tuna");
		tagRepo.save(tag18);
		Tag tag19 = new Tag(19L, "cream of mushroom soup");
		tagRepo.save(tag19);
		Tag tag20 = new Tag(20L, "shredded cheddar cheese");
		tagRepo.save(tag20);
		Tag tag21 = new Tag(21L, "frozen green peas");
		tagRepo.save(tag21);
		Tag tag22 = new Tag(22L, "potato chips");
		tagRepo.save(tag22);
		Tag tag23 = new Tag(23L, "sliced mushrooms");
		tagRepo.save(tag23);

		Tag tag24 = new Tag(24L, "Pasta Sauce");
		tagRepo.save(tag24);
		Tag tag25 = new Tag(25L, "Zucchini");
		tagRepo.save(tag25);
		Tag tag26 = new Tag(26L, "Cottage Cheese");
		tagRepo.save(tag26);
		Tag tag27 = new Tag(27L, "Frozen Spinach");
		tagRepo.save(tag27);
		Tag tag28 = new Tag(28L, "Oregano");
		tagRepo.save(tag28);
		Tag tag29 = new Tag(29L, "Lasagna Noodles");
		tagRepo.save(tag29);
		Tag tag30 = new Tag(30L, "Mozzarella Cheese");
		tagRepo.save(tag30);
		Tag tag31 = new Tag(31L, "chipotle pepper powder");
		tagRepo.save(tag31);
		Tag tag32 = new Tag(32L, "salmon fillet");
		tagRepo.save(tag32);
		Tag tag33 = new Tag(33L, "pecans");
		tagRepo.save(tag33);
		Tag tag34 = new Tag(34L, "onion powder");
		tagRepo.save(tag34);
		Tag tag35 = new Tag(35L, "maple syrup");
		tagRepo.save(tag35);
		Tag tag36 = new Tag(36L, "smoked paprika");
		tagRepo.save(tag36);
		Tag tag37 = new Tag(37L, "apple cider vinegar");
		tagRepo.save(tag37);

		// populateStoreItemsAndLineItems();
		populateStoreItemsFromJSONInput();

		Ingredient fettuccine = new Ingredient("Fettucine", "");
		ingredientRepo.save(fettuccine);
		Ingredient broccoli = new Ingredient("Fresh chopped broccoli", "1 to 2 cups");
		ingredientRepo.save(broccoli);
		Ingredient butter = new Ingredient("Butter", "1/2 cup(1 stick)");
		ingredientRepo.save(butter);
		Ingredient butter2 = new Ingredient("Butter", "1/3 cup");
		ingredientRepo.save(butter2);
		Ingredient garlic = new Ingredient("Garlic", "1/2 tsp(1 clove)");
		ingredientRepo.save(garlic);
		Ingredient heavyCream = new Ingredient("Heavy Cream", "2 cups");
		ingredientRepo.save(heavyCream);
		Ingredient garlicPowder = new Ingredient("Garlic Powder", "1/8 tsp");
		ingredientRepo.save(garlicPowder);
		Ingredient blackPepper = new Ingredient("Black Pepper", "1/8 tsp");
		ingredientRepo.save(blackPepper);
		Ingredient blackPepper2 = new Ingredient("Black Pepper", "1/4 tsp");
		ingredientRepo.save(blackPepper2);
		Ingredient parmesanCheese = new Ingredient("Parmesan Cheese", "1/4 cup freshly grated");
		ingredientRepo.save(parmesanCheese);
		Ingredient chickenBreasts = new Ingredient("Chicken Breasts", "2 to 3 cooked/diced");
		ingredientRepo.save(chickenBreasts);
		Ingredient chicken = new Ingredient("Chicken", "2 1/2 to 3 cups cut-up cooked chicken or turkey");
		ingredientRepo.save(chicken);
		Ingredient flour = new Ingredient("All Purpose flour", "1/3 cup");
		ingredientRepo.save(flour);
		Ingredient milk = new Ingredient("Milk", "2/3 cup");
		ingredientRepo.save(milk);
		Ingredient chickenBroth = new Ingredient("Chicken Broth", "1 3/4 cups");
		ingredientRepo.save(chickenBroth);
		Ingredient onion = new Ingredient("Chopped onion", "1/3 cup");
		ingredientRepo.save(onion);
		Ingredient salt = new Ingredient("Salt", "1/2 tsp");
		ingredientRepo.save(salt);
		Ingredient frozenVeggies = new Ingredient("Frozen peas and carrots", "1 box(10 oz)");
		ingredientRepo.save(frozenVeggies);
		Ingredient pieCrust = new Ingredient("Refrigerated Pie Crust", "1 package(15 oz) softened as directed on box");
		ingredientRepo.save(pieCrust);
		Ingredient pastaSauce = new Ingredient("Pasta Sauce", "2 cups");
		ingredientRepo.save(pastaSauce);
		Ingredient zucchini = new Ingredient("Zucchini - shredded", "1 cup");
		ingredientRepo.save(zucchini);
		Ingredient cottageCheese = new Ingredient("Low-Fat Cottage Cheese", "1 1/2 cup");
		ingredientRepo.save(cottageCheese);
		Ingredient frozenSpinach = new Ingredient("Frozen Spinach", "9 oz.");
		ingredientRepo.save(frozenSpinach);
		Ingredient parmessanCheese = new Ingredient("Parmessan Cheese - grated", "1/3 cup");
		ingredientRepo.save(parmessanCheese);
		Ingredient oregano = new Ingredient("Oregano - chopped", "2 tbsp");
		ingredientRepo.save(oregano);
		Ingredient lasagnaNoodles = new Ingredient("Lasagna Noodles - oven ready", "8 (7x3 inches)");
		ingredientRepo.save(lasagnaNoodles);
		Ingredient mushrooms = new Ingredient("Mushrooms", "1 (4oz.) can");
		ingredientRepo.save(mushrooms);
		Ingredient mozzarellaCheese = new Ingredient("Mozzarella Cheese - shredded", "8oz. (2 Cups)");
		ingredientRepo.save(mozzarellaCheese);
		Ingredient eggNoodles = new Ingredient("Egg noodles", "1(12 ounce) package");
		ingredientRepo.save(eggNoodles);
		Ingredient tuna = new Ingredient("Tuna", "2 (5 ounce) cans tuna, drained");
		ingredientRepo.save(tuna);
		Ingredient onion2 = new Ingredient("Chopped onion", "� cup");
		ingredientRepo.save(onion2);
		Ingredient mushroomSoup = new Ingredient("Condensed cream of mushroom soup", "2 (10.75 ounce) cans");
		ingredientRepo.save(mushroomSoup);
		Ingredient cheddarCheese = new Ingredient("Shredded cheddar cheese", "2 cups");
		ingredientRepo.save(cheddarCheese);
		Ingredient mushrooms2 = new Ingredient("Sliced mushrooms", "1/2 (4.5 ounce) can");
		ingredientRepo.save(mushrooms2);
		Ingredient greenPeas = new Ingredient("Frozen green peas", "1 cup");
		ingredientRepo.save(greenPeas);
		Ingredient potatoChips = new Ingredient("Crushed potato chips", "1 cup");
		ingredientRepo.save(potatoChips);

		Ingredient chipotlePowder = new Ingredient("Chipotle pepper powder", "� tsp");
		ingredientRepo.save(chipotlePowder);
		Ingredient salmon = new Ingredient("Salmon fillets", "4(4 ounce)");
		ingredientRepo.save(salmon);
		Ingredient pecans = new Ingredient("Pecans", "� cup");
		ingredientRepo.save(pecans);
		Ingredient onionPowder = new Ingredient("Onion powder", "� tsp");
		ingredientRepo.save(onionPowder);
		Ingredient mapleSyrup = new Ingredient("Pure maple syrup", "3 tbsp");
		ingredientRepo.save(mapleSyrup);
		Ingredient paprika = new Ingredient("Smoked paprika", "1 tsp");
		ingredientRepo.save(paprika);
		Ingredient acv = new Ingredient("Apple cider vinegar", "1 tbsp");
		ingredientRepo.save(acv);
		Ingredient salt2 = new Ingredient("Salt", "To taste");
		ingredientRepo.save(salt2);
		Ingredient pepper3 = new Ingredient("Pepper", "To taste");
		ingredientRepo.save(pepper3);

		Recipe recipe1 = new Recipe("Chicken Broccoli Alfredo", "/images/chicken-broccoli-alfredo.jpg", "1\r\n"
				+ "Cook fettuccine according to package directions adding broccoli last 3 minutes, drain. Set aside.\r\n"
				+ "2\r\n"
				+ "Meanwhile, melt butter in medium saucepan over medium heat. Add minced garlic with the butter. Add cream, garlic powder, and pepper.\r\n"
				+ "3\r\n"
				+ "Simmer, uncovered, for 10 to 12 minutes or until thick, stirring frequently. Trust me, it will thicken. When sauce has reached desired consistency, stir in Parmesan cheese.\r\n"
				+ "4\r\n"
				+ "Add cooked chicken to Alfredo sauce and heat through. Serve over hot, cooked fettuccine and broccoli.",
				fettuccine, broccoli, butter, garlic, heavyCream, garlicPowder, blackPepper, parmesanCheese,
				chickenBreasts);
		recipeRepo.save(recipe1);
		Recipe recipe2 = new Recipe("Classic Chicken Pot Pie", "/images/classic-chicken-pot-pie.jpg", "1\r\n"
				+ "In 2-quart saucepan, melt butter over medium heat. Stir in flour, onion, salt and pepper. Cook, stirring constantly, until mixture is bubbly; remove from heat. Stir in broth and milk. Heat to boiling, stirring constantly. Boil and stir 1 minute. Stir in chicken and peas and carrots; remove from heat.\r\n"
				+ "2\r\n"
				+ "Heat oven to 425�F. Roll 1 pie crust into 13-inch square. Ease into ungreased 9-inch (2-quart) glass baking dish. Pour chicken mixture into crust-lined dish.\r\n"
				+ "3\r\n"
				+ "Roll remaining pie crust into 11-inch square. Cut out designs with 1-inch cookie cutter. Place square over chicken mixture. Arrange cutouts on top crust. Turn edges of pie crust under; flute edge.\r\n"
				+ "4\r\n" + "Bake about 35 minutes or until golden brown.", butter2, blackPepper2, chicken, flour, milk,
				chickenBroth, onion, salt, frozenVeggies, pieCrust);
		recipeRepo.save(recipe2);

		Recipe recipe3 = new Recipe("Best Tuna Casserole", "/images/tuna-casserole.jpg", "1\r\n"
				+ "Bring a large pot of lightly salted water to a boil. Cook pasta in boiling water for 8 to 10 minutes, or until al dente; drain.\r\n"
				+ "2\r\n" + "Preheat oven to 425 degrees F (220 degrees C).\r\n" + "3\r\n"
				+ "In a large bowl, thoroughly mix noodles, onion, 1 cup cheese, peas, tuna, soup and mushrooms. Transfer to a 9x13 inch baking dish, and top with potato chip crumbs and remaining 1 cup cheese. Parmesan cheese.\r\n"
				+ "4\r\n" + "Bake for 15 to 20 minutes in the preheated oven, or until cheese is bubbly.", eggNoodles,
				tuna, onion2, mushroomSoup, cheddarCheese, mushrooms2, greenPeas, potatoChips);
		recipeRepo.save(recipe3);

		Recipe recipe4 = new Recipe("Vegetarian Lasagna", "images/veggie-lasagna.jpg",
				"1. Spray 12x10-inch sheet of foil with nonstick cooking spray. In medium bowl, combine pasta sauce and zucchini; mix well. In another medium bowl, combine cottage cheese, spinach, Parmesan cheese and oregano; Mix well."
						+ "\r\n2. Spread 1/4 cup sauce mixture in ungreased 8-inch square (2-quart) glass baking dish. Top with 2 lasagna noodles. Spread about 1/2 cup sauce mixture over noodles. Drop 1/2 cup of spinach mixture by small spoonfuls over sauce mixture; spread carefully. Sprinkle with 1/4 of mushrooms and 1/2 cup of the mozzarella cheese."
						+ "\r\n3. Repeat layers 3 more times, beginning with noodles. Cover with foil, sprayed side down; refrigerate at least 8 hours or overnight."
						+ "\r\n4. Heat oven to 400�F. Bake covered for 45 minutes."
						+ "\r\n5. Uncover baking dish; bake an additional 10 minutes or until lasagna is bubbly around edges. Let stand 10 minutes before serving.",
				pastaSauce, zucchini, cottageCheese, frozenSpinach, parmessanCheese, oregano, lasagnaNoodles, mushrooms,
				mozzarellaCheese);
		recipeRepo.save(recipe4);

		Recipe recipe5 = new Recipe("Paleo Pecan Maple Syrup Salmon", "/images/salmon.jpg", "1\r\n"
				+ "Place salmon fillets on a baking sheet and season with salt and black pepper.\r\n" + "2\r\n"
				+ "Combine pecans, maple syrup, vinegar, paprika, chipotle powder, and onion powder in a food processor; pulse until texture is crumbly. Spoon pecan mixture on top of each salmon fillet, coating the entire top surface. Refrigerate coated salmon, uncovered, for 2 to 3 hours.\r\n"
				+ "3\r\n" + "Preheat oven to 425 degrees F (220 degrees C).\r\n" + "4\r\n"
				+ "Bake salmon in the preheated oven until fish flakes easily with a fork, 12 to 14 minutes.",
				chipotlePowder, salmon, pecans, onionPowder, mapleSyrup, paprika, acv, salt2, pepper3);
		recipeRepo.save(recipe5);

	}

	public void populateStoreItemsAndLineItems() {

		StoreItem storeItem1 = new StoreItem("Fettuccine", 1.99);
		storeItemRepo.save(storeItem1);
		StoreItem storeItem2 = new StoreItem("Fresh chopped broccoli", .99);
		storeItemRepo.save(storeItem2);
		StoreItem storeItem3 = new StoreItem("Garlic Powder", 2.50);
		storeItemRepo.save(storeItem3);
		StoreItem storeItem4 = new StoreItem("Butter", 1.99);
		storeItemRepo.save(storeItem4);
		StoreItem storeItem5 = new StoreItem("Butter", 1.99);
		storeItemRepo.save(storeItem5);
		StoreItem storeItem6 = new StoreItem("Garlic", 1.99);
		storeItemRepo.save(storeItem6);
		StoreItem storeItem7 = new StoreItem("Black Pepper", 1.99);
		storeItemRepo.save(storeItem7);
		StoreItem storeItem8 = new StoreItem("All Purpsoe Flour", 1.99);
		storeItemRepo.save(storeItem8);
		StoreItem storeItem9 = new StoreItem("Heavy Cream", 1.99);
		storeItemRepo.save(storeItem9);
		StoreItem storeItem10 = new StoreItem("Chopped onion", 2.00);
		storeItemRepo.save(storeItem10);
		StoreItem storeItem11 = new StoreItem("Salt", 1.99);
		storeItemRepo.save(storeItem11);
		StoreItem storeItem12 = new StoreItem("Parmesan Cheese", 1.99);
		storeItemRepo.save(storeItem12);
		StoreItem storeItem13 = new StoreItem("Milk", 1.99);
		storeItemRepo.save(storeItem13);
		StoreItem storeItem14 = new StoreItem("Chicken Broth", 1.99);
		storeItemRepo.save(storeItem14);
		StoreItem storeItem15 = new StoreItem("Black Pepper", 1.99);
		storeItemRepo.save(storeItem15);
		StoreItem storeItem16 = new StoreItem("Chicken breasts", 1.99);
		storeItemRepo.save(storeItem16);
		StoreItem storeItem17 = new StoreItem("Refrigerated pie crust", 2.50);
		storeItemRepo.save(storeItem17);
		StoreItem storeItem18 = new StoreItem("Frozen peas and carrots", 1.00);
		storeItemRepo.save(storeItem18);
		StoreItem storeItem19 = new StoreItem("Chicken", 6.99);
		storeItemRepo.save(storeItem19);

		LineItem lineItem1 = new LineItem(1, storeItem1);
		lineItemRepo.save(lineItem1);
		LineItem lineItem2 = new LineItem(1, storeItem2);
		lineItemRepo.save(lineItem2);
		LineItem lineItem3 = new LineItem(1, storeItem3);
		lineItemRepo.save(lineItem3);
		LineItem lineItem4 = new LineItem(1, storeItem4);
		lineItemRepo.save(lineItem4);
		LineItem lineItem5 = new LineItem(1, storeItem5);
		lineItemRepo.save(lineItem5);
		LineItem lineItem6 = new LineItem(1, storeItem6);
		lineItemRepo.save(lineItem6);
		LineItem lineItem7 = new LineItem(1, storeItem7);
		lineItemRepo.save(lineItem7);
		LineItem lineItem8 = new LineItem(1, storeItem8);
		lineItemRepo.save(lineItem8);
		LineItem lineItem9 = new LineItem(1, storeItem9);
		lineItemRepo.save(lineItem9);
		LineItem lineItem10 = new LineItem(1, storeItem10);
		lineItemRepo.save(lineItem10);
		LineItem lineItem11 = new LineItem(1, storeItem11);
		lineItemRepo.save(lineItem11);
		LineItem lineItem12 = new LineItem(1, storeItem12);
		lineItemRepo.save(lineItem12);
		LineItem lineItem13 = new LineItem(1, storeItem13);
		lineItemRepo.save(lineItem13);
		LineItem lineItem14 = new LineItem(1, storeItem14);
		lineItemRepo.save(lineItem14);
		LineItem lineItem15 = new LineItem(1, storeItem15);
		lineItemRepo.save(lineItem15);
		LineItem lineItem16 = new LineItem(1, storeItem16);
		lineItemRepo.save(lineItem16);
		LineItem lineItem17 = new LineItem(1, storeItem17);
		lineItemRepo.save(lineItem17);
		LineItem lineItem18 = new LineItem(1, storeItem18);
		lineItemRepo.save(lineItem18);
		LineItem lineItem19 = new LineItem(1, storeItem19);
		lineItemRepo.save(lineItem19);

	}

	public void populateStoreItemsFromJSONInput() {

		JSONParser parser = new JSONParser();

		String basePath = new File("").getAbsolutePath();
		basePath += "\\src\\main\\resources\\walmart-input-json-for-db-init";
		System.out.println(basePath);

		File folder = new File(basePath);
		File[] listOfFiles = folder.listFiles();
		// /database-test/src/main/resources/walmart-input/wmpriceitem10309187.txt
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				System.out.println("File " + listOfFiles[i].getName());

				try {
					StoreItem genericItem = new StoreItem();

					// Object obj = parser.parse(new
					// FileReader("C:/Users/WeCanCodeIT/wcci/default-workspace/database-test/src/main/resources/104514668.txt"));
					String fileName = basePath + "/" + listOfFiles[i].getName();
					Object obj = parser.parse(new FileReader(fileName));
					JSONObject jsonObject = (JSONObject) obj;
					System.out.println(jsonObject);

					Long uriItemId = ((Number) jsonObject.get("itemId")).longValue();
					String item = uriItemId.toString();
					System.out.println(uriItemId);
					genericItem.setUriItemId(item);

					String tagId = (String) jsonObject.get("groceryAppTagId");
					System.out.println(tagId);
					Long jsonTagId = new Long(tagId);
					Tag jsonTag = tagRepo.findOne(jsonTagId);
					genericItem.setTag(jsonTag);

					String name = (String) jsonObject.get("name");
					System.out.println(name);
					genericItem.setName(name);

					String shortDesc = (String) jsonObject.get("shortDescription");
					System.out.println(shortDesc);
					// sometimes walmart leaves in html chars, so strip them out
					// &lt;p&gt; will be at beginning
					// &lt;/p&gt; will be at the end
					// Also, it turns out some descriptions are not there, so
					// in that case, set it to an empty string in the db

					if (jsonObject.containsKey("shortDescription")) {
						// found a weird case where the desc was equal to this
						if (shortDesc.contentEquals("&nbsp;")) {
							shortDesc = "";
						} else {
							if (shortDesc.charAt(0) == '&') {
								String newDesc = shortDesc.substring(9, (shortDesc.length() - 10));
								shortDesc = newDesc;
							}
						}
					}

					genericItem.setDescription(shortDesc);

					// String longDesc = (String) jsonObject.get("longDescription");
					// System.out.println(longDesc);

					String size = (String) jsonObject.get("size");
					System.out.println(size);
					genericItem.setSize(size);

					String brand = (String) jsonObject.get("brandName");
					System.out.println(brand);
					genericItem.setBrand(brand);

					String upc = (String) jsonObject.get("upc");
					System.out.println(upc);
					genericItem.setUpc(upc);

					String imgUrlSmall = (String) jsonObject.get("thumbnailImage");
					System.out.println(imgUrlSmall);
					genericItem.setImgUrlSm(imgUrlSmall);

					String imgUrlMed = (String) jsonObject.get("mediumImage");
					System.out.println(imgUrlMed);
					genericItem.setImgUrlMed(imgUrlMed);

					String imgUrlLg = (String) jsonObject.get("largeImage");
					System.out.println(imgUrlLg);
					genericItem.setImgUrlLg(imgUrlLg);

					// genericItem.setId(3L);

					try {
						if (jsonObject.containsKey("salePrice")) {
							double salePrice = ((Number) jsonObject.get("salePrice")).doubleValue();
							System.out.println(salePrice);
							genericItem.setPrice(salePrice);
						} else if (jsonObject.containsKey("msrp")) {
							double salePrice = ((Number) jsonObject.get("msrp")).doubleValue();
							System.out.println(salePrice);
							genericItem.setPrice(salePrice);
						} else if (jsonObject.containsKey("groceryAppPrice")) {
							double salePrice = ((Number) jsonObject.get("groceryAppPrice")).doubleValue();
							System.out.println(salePrice);
							genericItem.setPrice(salePrice);

						}
					} catch (Exception ex) {
						throw new IllegalStateException("Failed to execute ApplicationRunner", ex);
					}

					storeItemRepo.save(genericItem);

					// Saved this logic because it shows how to iterate through
					// json array of data (in case we want to loop thru an
					// array of images present)
					// JSONArray msg = (JSONArray) jsonObject.get("messages");
					// Iterator<String> iterator = msg.iterator();
					// while (iterator.hasNext()) {
					// System.out.println(iterator.next());
					// }

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					e.printStackTrace();
				}

			} else if (listOfFiles[i].isDirectory()) {
				System.out.println("Directory " + listOfFiles[i].getName());
			}

		}

	} // run, throws exception

}
