public class Pub {
    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.name = "Kamikaze";
        drink.price = 25.78;
        drink.alcohol = true;

        Ingredient ingredient1 = new Ingredient();
        ingredient1.ingredientName = "wódka";
        ingredient1.ingredientAmount = 50; //ml

        drink.typeOfalcohol = ingredient1;

        Ingredient ingredient2 = new Ingredient();
        ingredient2.ingredientName = "sok z limonki";
        ingredient2.ingredientAmount = 30; //ml

        drink.typeOfjuice = ingredient2;

        Ingredient ingredient3 = new Ingredient();
        ingredient3.ingredientName = "likier pomarańczowy";
        ingredient3.ingredientAmount = 15; //ml

        drink.flavoredLiqueur = ingredient3;

        System.out.println("Drink: " + drink.name);
        System.out.println("Price: " + drink.price + "zł");
        System.out.println("Czy zawiera alkohol? " + drink.alcohol);
        System.out.println("Składniki: \n" + ingredient1.ingredientName + "\n" + ingredient2.ingredientName + "\n" + ingredient3.ingredientName);
        System.out.println("Pojemność: " + (ingredient1.ingredientAmount + ingredient2.ingredientAmount + ingredient3.ingredientAmount) + "ml");
    }
}
