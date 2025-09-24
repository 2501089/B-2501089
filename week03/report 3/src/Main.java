//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("섭씨 온도를 입력하세요: ");


        double celsius = scanner.nextDouble();


        double fahrenheit = (celsius * 9 / 5) + 32;


        System.out.printf("섭씨 %.1f°C는 화씨 %.1f°F입니다.\n", celsius, fahrenheit);


        scanner.close();
    }
}