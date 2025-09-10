import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String name = "";
        int age = 0;
        char gender = ' '; // 공백으로 초기화
        String result = ""; // 성별 결과를 문자열로 저장

        System.out.print("당신의 이름은? ");
        name = keyboard.nextLine();

        System.out.printf("%s님의 나이는? ", name);
        age = keyboard.nextInt();

        System.out.printf("%s님의 성별(남=M, 여=F)? ", name);
        gender = keyboard.next().charAt(0);

        // 성별 결과 결정 (대소문자 모두 허용)
        result = (gender == 'M' || gender == 'm') ? "남" : "여";

        System.out.printf("%s님의 나이는 %d살 입니다.\n", name, age);
        System.out.printf("%s님의 성별은 %c (%c) 입니다.\n", name, gender, result);

        keyboard.close();
    }
}