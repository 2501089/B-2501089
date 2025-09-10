import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
String name = "";
short age = 0;
float height =0.0f;
float weight =0.0f;

        System.out.printf("당신의 이름은 ?", name);
        name =Keyboard.nextLine();
        System.out.printf("%s님의 나이는 ?", name );
        age =Keyboard.nextShort();
        System.out.printf("%s님의 키는 ?", name );
        height =Keyboard.nextFloat();
        System.out.printf("%s님의 몸무게는 ?", name);
        weight = Keyboard.nextFloat();




        System.out.printf("%s님의 나이는 %d살 입니다.\n", name,age);
        System.out.printf("%s님의 키는 %.1f Cm 입니다\n", name, height);
        System.out.printf("%s님의 몸무게는 %.1f Kg 입니다\n", name, weight);
    }
}