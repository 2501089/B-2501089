import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
        Scanner keyboard = new Scanner(System.in);

        // 준비물 (변수 선언)
        String school;
        String name;
        int age;
        char gender;
        float height;
        float weight;

        // 입력
        System.out.print("학교를 입력하세요: ");
        school = keyboard.nextLine();

        System.out.print("이름을 입력하세요: ");
        name = keyboard.nextLine();

        System.out.print("나이를 입력하세요: ");
        age = keyboard.nextInt();
        keyboard.nextLine(); // 버퍼 비우기

        System.out.print("성별을 입력하세요(남/여): ");
        gender = keyboard.nextLine().charAt(0);  // 첫 글자만 저장

        System.out.print("신장(cm)을 입력하세요: ");
        height = keyboard.nextFloat();

        System.out.print("체중(kg)을 입력하세요: ");
        weight = keyboard.nextFloat();

        // 출력
        System.out.println("*********************");
        System.out.printf("학교 : %s\n", school);
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("신장 : %.1f Cm\n", height);
        System.out.printf("체중 : %.1f Kg\n", weight);
        System.out.println("*********************");
    }
}