import java.util.Scanner;

public class Rente {
    public static void main(String[] args) {
        System.out.println("Wat is uw spaarbedrag op dit moment?");
        var s = new Scanner(System.in);
        float startbedrag = s.nextFloat();

        System.out.println("Met een rente van 5,5% per jaar is het bedrag na 10 jaar:");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("jaar " + i + ":" + startbedrag + (1+0.05) + "%n");
        }
    }
}


