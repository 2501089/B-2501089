import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keybord =new Scanner(System.in);
        float litter=0.0f;
        float km =0.0f;
        float result=0.0f;

        System.out.printf("소비된 연료량 입력");
        litter=keybord.nextFloat( );
        System.out.printf("운행한 거리 입력");
        km=keybord.nextFloat( );



        System.out.printf("자동차 소비된 연료:%.1f Litter\n", litter);
        System.out.printf("자동차 운행거리:%.1f km\n", km);
        System.out.printf("연비:%.2f %c \n", result,'\u3392');
    }
}