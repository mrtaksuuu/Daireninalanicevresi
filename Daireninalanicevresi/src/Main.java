import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double area, pi,r, alan, cevre;
        pi = 3.14159;
        Scanner kb = new Scanner(System.in);
        System.out.println("Dairenin yarı çapını giriniz : ");
        r = kb.nextDouble();
        alan = pi * r * r;
        cevre = 2 * pi* r;
        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);



    }
}
