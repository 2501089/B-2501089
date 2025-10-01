//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        final int PRICE_PER_PYEONG = 56000;

        System.out.print("계산할 주택의 평수를 입력하세요: ");
        int pyeong = Keyboard.nextInt();

        int totalPrice = pyeong * PRICE_PER_PYEONG;
        int finalPrice = (totalPrice / 1000) * 1000;

        System.out.printf("입력하신 %d평 주택의 가격은 %,d원 입니다.\n", pyeong, finalPrice);
    }
}