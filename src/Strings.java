import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
       String x = "Voer woord in"; //opdrachtregel
       System.out.println(x); //laat opdrachtregel zien

       var s = new Scanner(System.in); //scan input
       var tekst = s.nextLine(); // geef input in tekst
        System.out.println(tekst.length()); //tel letters

        String y = "voer getal in"; //opdrachtregel
        System.out.println(y);

        var c = new Scanner(System.in); //tellen input cijfers
        var getal = c.nextInt(); //geef input in cijfers

        getal = getal - 2; //trekt 2 af van variabele
        System.out.println(getal); //geeft uitkomst




    }

}
