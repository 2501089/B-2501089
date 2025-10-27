import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        int result;

        System.out.print("정수 입력 (1~10000) : ");
        num = keyboard.nextInt();

        if (!(num >= 1 && num <= 10000)) {
            System.err.println("ERROR : 입력 범위는 1~10,000 입니다");
        } else {
            if (num >= 1000 && num <=9999){
                result = 9999 - num + 1;
            }else  if (num >= 100 && num <= 999){
                result = 999 - num + 1;
            }else if (num >= 10 && num <= 99) {
                result = 99 - num + 1;
            }else {
                result = 9 - num + 1;
            }
            System.out.printf("입력한 정수의 %,d의 10의 보수는 %,d입니다.\n ",num, result);
        }


    }
}