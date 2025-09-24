import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int salary, bonus;
        int total, tax;

        System.out.printf("본봉 입력: ");
        salary = Keyboard.nextInt();
        System.out.printf("보너스 입력 :");
        bonus = Keyboard.nextInt();
        total = salary + bonus;
        tax =(int) (total * (0.0f / 100));
        tax /=10;
        tax *=100;





        System.out.printf("본봉은 %,d원\n", salary);
        System.out.printf("보너스는 %,d원\n", bonus);
        System.out.printf("총 수입액 = %,d원\n", total);
        System.out.printf("세금 = %,d원\n원", tax);
        System.out.printf("실 금액 = %,d원\n", total * tax);



    }
}