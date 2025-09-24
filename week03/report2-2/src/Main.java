//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        final String SCHOOL = "경복대학교";
        final String NAME = "홍 길 동";
        final int AGE = 20;
        final char GENDER = '남';
        final double HEIGHT = 170.6;
        final double WEIGHT = 65.4;

        System.out.println("***********************");
        System.out.printf("학교 : " + SCHOOL);
        System.out.printf("이름 : " + NAME);
        System.out.printf("나이 : " + AGE);
        System.out.printf("성별 : " + GENDER + "(여)");
        System.out.printf("신장 : " + HEIGHT + " Cm");
        System.out.printf("체중 : " + WEIGHT + " Kg");
        System.out.println("***********************");
    }
}