//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {//TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.

        int a = 5;
        int b = -a;
        int c = (((a++) + 2) - (--b));

        //c= a+2;
        //a= a+1;
        int d =(((a--) + (++b)) + 2);
        //b= b+1;
        //d+ b+2;

        float e= (float) (5.0/4);

        a += 4;  //a= a+4;


        System.out.printf("a=%d, b=%d, c=%d, d=%d, e=%.2f\n", a, b, c, d, e);

    }
}