//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int hours;
        String result;
        int salary;
        int extra;

        System.out.print("주당 근무 시간 입력 : ");
        hours = keyboard.nextInt();

        if (hours <= 40) {
            salary = 11500 * hours;
            extra = 0;
            result = String.format("급여는 %,d 원 입니다.\n", salary);
        } else {
            salary = 11500 * 40;
            extra = (int) (11500 * 1.5) * (hours - 40);
            result = String.format("초과 수당 %,d원과 급여 %,d원을 합한 %,d원 입니다.\n", extra, salary, extra+salary);
        }


        System.out.printf("%d 시간의 아르바이트 급여는 %s.\n", hours, result);
    }
}