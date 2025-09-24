import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner Keyboard=new Scanner(System.in);
        int base;
        int height;
        float area;

        System.out.printf("삼각형의 밑변입력 :");
        base = Keyboard.nextInt();
        System.out.printf("삼각형의 높이 입력 :");
        height = Keyboard.nextInt();

        area = base * height /2.0f;

        System.out.printf(">>>삼각형 면적<<<");
        System.out.printf("\t 밑변 : %,d Cm\n", base);
        System.out.printf("\t 높이 : %d Cm\n", height);
        System.out.printf("\t 면적 %.2f\u33A0\n", area);

    }
}