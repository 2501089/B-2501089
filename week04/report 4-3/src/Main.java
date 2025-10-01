//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int dollars, halfs, quarters, dimes, nickels, pennies;

        System.out.print("달러(dollars) 개수를 입력하세요: ");
        dollars = Keyboard.nextInt();

        System.out.print("하프(half) 개수를 입력하세요: ");
        halfs = Keyboard.nextInt();

        System.out.print("쿼터(quarter) 개수를 입력하세요: ");
        quarters = Keyboard.nextInt();

        System.out.print("다임(dime) 개수를 입력하세요: ");
        dimes = Keyboard.nextInt();

        System.out.print("니켈(nickel) 개수를 입력하세요: ");
        nickels = Keyboard.nextInt();

        System.out.print("페니(penny) 개수를 입력하세요: ");
        pennies = Keyboard.nextInt();


        int totalCents = (dollars * 100) + (halfs * 50) + (quarters * 25) + (dimes * 10) + (nickels * 5) + (pennies * 1);


        int totalDollars = totalCents / 100;
        int remainingCents = totalCents % 100;


        System.out.printf("총 금액은 %d달러 %d센트 입니다.\n", totalDollars, remainingCents);
    }
}