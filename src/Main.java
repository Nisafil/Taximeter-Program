import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, startPrice;

        Scanner input = new Scanner(System.in);
        System.out.print("Write The Distance In Kilometers : ");
        km = input.nextInt();

        startPrice =10;
        total = startPrice +(km * perKm);
        total = (total < 20 ) ? 20 : total;
        System.out.print("Total Amount : " + total);

    }
}