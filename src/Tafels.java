import java.util.Scanner;

public class Tafels {
    public Tafels() {
    }

    public static void main(String[] args) {

        String y = "voer getal in"; //opdrachtregel
        System.out.println(y);

        var s = new Scanner(System.in); //tellen input cijfers
        var getal = s.nextInt(); //geef input in cijfers

        String z = "De tafel van " +getal +" is:"; //antwoordregel
        System.out.println(z);

        int x = getal;
        int a = x * 1;
        int b = x * 2;
        int c = x * 3;
        int d = x * 4;
        int e = x * 5;
        int f = x * 6;
        int g = x * 7;
        int h = x * 8;
        int i = x * 9;
        int j = x * 10;
        System.out.println(" 1x" + x + "=" + a);
        System.out.println(" 2x" + x + "=" + b);
        System.out.println(" 3x" + x + "=" + c);
        System.out.println(" 4x" + x + "=" + d);
        System.out.println(" 5x" + x + "=" + e);
        System.out.println(" 6x" + x + "=" + f);
        System.out.println(" 7x" + x + "=" + g);
        System.out.println(" 8x" + x + "=" + h);
        System.out.println(" 9x" + x + "=" + i);
        System.out.println("10x" + x + "=" + j);

    }
}