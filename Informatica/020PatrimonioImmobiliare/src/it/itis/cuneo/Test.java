package it.itis.cuneo;

public class Test {
    public static void main(String[] args) {
        Abitazioni abitazioni = new Abitazioni(5, 500, "Via dei pozzi 15", "Los Angeles");
        Ville ville = new Ville(15, 8000, "Via pascoli 32", "Milano", 8, 350, true);
        Appartamenti appartamenti = new Appartamenti(4, 452, "Via Giovanni XXIII", "Bernezzo", 10, false, 3);

        System.out.println(abitazioni.toString());
        System.out.println(ville.toString());
        System.out.println(appartamenti.toString());
    }
}
