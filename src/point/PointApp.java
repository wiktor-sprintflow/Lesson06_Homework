package point;

import java.util.Locale;
import java.util.Scanner;

public class PointApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Podaj współrzędną X:");
        double x = sc.nextDouble();
        sc.nextLine();

        System.out.println("Podaj współrzędną Y: ");
        double y = sc.nextDouble();
        sc.nextLine();

        sc.close();

        Point point = new Point(x,y);
        System.out.println(point.getPointDetails());
    }
}