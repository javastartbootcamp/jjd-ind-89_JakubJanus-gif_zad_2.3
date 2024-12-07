import static org.junit.jupiter.api.Assertions.*;

class ingredients {
    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.name = "Kamikaze";
        drink.price = 25.78;
        drink.alcohol = true;

        System.out.println("Drink: "+drink.name);
        System.out.println("Price: "+drink.price+"zł");
        System.out.println("Czy zawiera alkohol? "+drink.alcohol);
        System.out.println("Składniki: \n"+
                "czysta wódka \n"+
                "sok z limonki \n"+
                "likier pomarańczowy \n"+
                "Pojemność: "+60+"ml");
    }

}