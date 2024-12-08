public class Pub {
    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.name = "Kamikaze";
        drink.price = 25.78;
        drink.alcohol = true;
        drink.liquid = "wódka";
        drink.juice = "sok z limonki";
        drink.liqueur = "likier pomarańczowy";

        Ingredients ingredient = new Ingredients();
        ingredient.liquidAmount = 50;
        ingredient.juiceAmount = 15;
        ingredient.liqueurAmount = 30;

        System.out.println("Drink: " + drink.name);
        System.out.println("Price: " + drink.price);
        System.out.println("Czy zawiera alkohol? " + drink.alcohol);
        System.out.println("Składniki: \n" + drink.liquid + "\n" + drink.juice + "\n" + drink.liqueur);
        System.out.println("Pojemność: " + (ingredient.liquidAmount + ingredient.juiceAmount + ingredient.liqueurAmount) + "ml");
    }
}
