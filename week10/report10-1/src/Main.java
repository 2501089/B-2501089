import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] vote = new int[4];
        int nogood = 0;
        int total = 0;

        System.out.println("1~4번 후보 번호를 입력하세요. (0 입력 시 종료)");

        while (true) {
            int num = keyboard.nextInt();
            if (num == 0) {
                break;
            }
            total++;

            if (num >= 1 && num <= 4) {
                vote[num - 1]++;
            } else {
                nogood++;
            }
        }

        System.out.println("\n=== 득표 결과 ===");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%d번 후보 : %d표\n", i + 1, vote[i]);
        }
        System.out.printf("무효표 : %d표\n", nogood);
        System.out.printf("총 투표수 : %d표\n", total);
    }
}