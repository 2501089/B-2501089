import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int type = ' ';
        int width = 0 ;
        int height = 0 ;
        int area = 0;

        System.out.printf("사각형의 가로 길이 입력 : ");
        width =keyboard.nextInt();
        System.out.printf("사각형의 세로 길이 입력 : ");
        height =keyboard.nextInt();

        type = width == height ? '정' : '직';
        area = width* height;



        System.out.printf("**** 정사각형 넓이 ******\n", type);
        System.out.printf("\t 가로 길이 : %d Cm\n",width);
        System.out.printf("\t 세로 길이 : %d Cm\n", height);
        System.out.printf("\t 넓이 : %d \u33A0\n", area);
    }
}