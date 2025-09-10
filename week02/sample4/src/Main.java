import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int result = 0;

        System.out.print("첫번쨰 값 입력 ; ");
        first = Keyboard.nextInt();
        System.out.print("두번쨰 값 입력 ; ");
        second = Keyboard.nextInt();

        result = first * second;


        System.out.printf("%,d * %,d = %,d\n", first, second, result);

    }
}




