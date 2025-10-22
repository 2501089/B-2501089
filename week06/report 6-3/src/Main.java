import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age = 0;
        char use = ' ';
        int time = 0;

        System.out.print("당신의 나이 입력 : ");
        age = keyboard.nextInt();
        System.out.print("교통 카드 사용 여부(Y/N) : ");
        use = keyboard.next().charAt(0);
        System.out.print("탑승 시각 : ");
        time = keyboard.nextInt();

        int baseFare = (age >= 0 && age <= 13) ?
                (use == 'Y' ? 450 : 450) :
                (age >= 14 && age < 20) ?
                        (use == 'Y' ? 750 : 850) :
                        (use == 'Y' ? 1250 : 1350);

        double rate = ((time >= 0 && time < 5) || (time >= 22 && time <= 23)) ?
                1.2 :
                1.0;

        int result = (int) (baseFare * rate);

        System.out.printf("당신의 나이는 %d살 입니다.\n", age);
        System.out.printf("교통카드 사용 여부 : %c \n", use);
        System.out.printf("탑승 시각 : %d시\n", time);
        System.out.printf("지불 금액은 %,d원 입니다.\n", result);
    }
}