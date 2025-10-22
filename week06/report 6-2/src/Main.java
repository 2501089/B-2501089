//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int PRICE = 1663;
        float oil;
        int result = 0;
        int temp1 = 0;

        System.out.print("주유 할 양(L) : ");
        oil = keyboard.nextFloat();

        temp1 = (int) (PRICE * oil);
        result = (int) (temp1 >= 50000 ? ((temp1 - (temp1 * 0.07)) * 1.1) : temp1 * 1.1);

        System.out.printf("리터당 휘발유 가격은 %,d원 입니다.\n", PRICE);
        System.out.printf("%.1fL를 주유하셨으며, 결제하실 금액은 %,d원 입니다. ", oil, result);
    }
}