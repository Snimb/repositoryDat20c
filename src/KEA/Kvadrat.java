package KEA;

public class Kvadrat {

    public void kvadrat(int a, String b) {
        for (int i = 0; i < a; i++) {

            for (int j = 0; j < a - 1; j++) {
                System.out.print(b);
            }
            System.out.println(b);
        }
    }
}