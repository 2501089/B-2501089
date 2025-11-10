public class Main {
    public static void main(String[] args) {

        int coin500 = 10;   // 500원 10개
        int coin100 = 10;   // 100원 10개
        int money500 = 500; // 500원 동전
        int money100 = 100; // 100원 동전
        int amount = 0;     // 총저금액

        int month = (coin500 * money500) + (coin100 * money100); // 한 달 저금액 계산


        for (int i = 1; i <= 12 * 30; i++) {
            amount += month;
        }

        System.out.printf("30년 동안의 총 저금액은 %,d원 입니다.\n", amount);
    }
}