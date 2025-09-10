import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
        String name = "";
        int age =0;

        System.out.print("당신의 이름은 ?");
        name = Keyboard.nextLine();
        System.out.printf("%s님의 나이는 ?", name);
        age = Keyboard.nextLine();


        System.out.printf("%s남의 나이는%d살 입니다.\n, name, age")




