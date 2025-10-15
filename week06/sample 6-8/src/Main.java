import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {


final double PI = 3.141592;
final int RADIUS = 6378137;
final int KOREA = 99720;
double temp;
long surface ;
double result;

temp = (4 * PI * RADIUS * RADIUS);
surface = (long)(temp / 1000);

result= ((double)  KOREA / surface) * 100;

        System.out.printf("지구의 반지름은 %,d m 입니다.\n",RADIUS);
        System.out.printf("지구의 표면적인 %,d \u33A2 입니다.\n",surface );
        System.out.printf("대한민국의 넓이는 %,d \u33A2 입니다.\n",KOREA );
        System.out.printf("대한민국은 지구의 %.8f %%입니다.\n", result );
    }
}