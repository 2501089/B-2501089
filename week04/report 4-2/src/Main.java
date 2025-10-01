import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int totalSales;
        int basePrice;
        int vat;

        System.out.printf("판매금액을 입력하세요: ");
        totalSales = keyboard.nextInt();

        basePrice = (int) Math.round(totalSales / 1.1);
        vat = totalSales - basePrice;

        System.out.printf("총 판매금액 : %,d원\n금액 : %,d원\n세금 : %,d원\n", totalSales, basePrice, vat);
    }
}