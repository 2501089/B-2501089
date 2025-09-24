import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {//TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        Scanner Keyboard = new Scanner(System.in);
        int won = 0;
        float convert;
        float dollar = 0.0f;

        System.out.printf("오늘의 dollar 환율은?");
        convert = Keyboard.nextFloat();
        System.out.printf("원화 얼마를 dollar로 환전할까? ");
        won = Keyboard.nextInt();

        dollar = won/ convert;

          System.out.printf("원화 %, d원은 %달러($) 입니다.\n", won, dollar);




    }
}