package KEA;

public class Main {

    public static void main(String[] args) {
        // Skriv en metode, der som parameter modtager et heltal. Metoden skal udskrive et kvadrat på skærmen svarende til heltallet.
        // I det følgende eksempel er tallet 6 modtaget som parameter til metoden:
        // Udvid metoden, så den også modtager et tegn, som er det tegn, somprintes på skærmen
        Kvadrat kvadrat = new Kvadrat();

        kvadrat.kvadrat(6, "*");

        kvadrat.kvadrat(2, "+");
    }
}