//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {


        final int KOREA =99920;
        final int Northkorea = 122762;
        final int USA = 9631418;
        final int JAPAN = 377873;

        float temp1 = (float) Northkorea / KOREA;
        float temp2 = (float) USA / KOREA;
        float temp3 = (float) JAPAN / KOREA;



        System.out.printf("대한민국의 면적 :%,d ㎢d\n", KOREA);
        System.out.printf("북한의 면적 : %,d ㎢d\n", Northkorea);
        System.out.printf("미국의 면적 : %,d ㎢d\n", USA);
        System.out.printf("일본의 면적 : %,d ㎢d\n", JAPAN);

        System.out.printf("북한은 우리나라에 비해 %.2f 배임\n", temp1);
        System.out.printf("북한은 우리나라에 비해 %.2f 배임\n", temp2);
        System.out.printf("북한은 우리나라에 비해 %.2f 배임\n", temp3);



    }
}