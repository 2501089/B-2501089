//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {


        String school = "경복대학교"; // 준비물 <선언문>
        String name = "홍 길동";
        int age = 20;
        char gender = 'M';  // 'M' = 남자, 'F' = 여자
        double height = 170.6;
        double weight = 65.4;


        System.out.println("*********************"); // 출력
        System.out.printf("   학교 : %s\n", school);
        System.out.printf("   이름 : %s\n", name);
        System.out.printf("   나이 : %d\n", age);

        System.out.printf("   성별 : %c\n", (gender == 'M') ? '남' : '여'); // 처리

        System.out.printf("   신장 : %.1f Cm\n", height);
        System.out.printf("   체중 : %.1f Kg\n", weight);
        System.out.println("*********************");
    }
}