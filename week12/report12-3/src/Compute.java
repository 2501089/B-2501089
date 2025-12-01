public class Compute {
    // 숫자 한글화
    static String[] middle = {"","일","이","삼","사","오","육","칠","팔","구"};
    // 작은 자리수 단위
    static String[] small = {"","십","백","천"};
    // 큰 단위
    static String[] big = {"","만","억","조"};

    public static String convertHangul(long money) {
        if (money == 0) {
            return "영";
        }

        String result = "";
        int bigIndex = 0;

        while (money > 0) {

            int last4 = (int) (money % 10000);
            money = money / 10000;

            String hangul4 = convert4(last4);

            if (!hangul4.equals("")) { // 0인 묶음은 건너뛰게 만들기
                result = hangul4 + big[bigIndex] + " " + result;
            }

            bigIndex++;
        }
        return result;
    }
    static String convert4(int n) {
        String result = "";
        int i = 0;

        while (n > 0) {
            int digit = n % 10;
            n = n / 10;

            if (digit != 0) {
                if (digit == 1 && i == 1) {
                    result = small[i] + result;
                }
                else {
                    result = middle[digit] + small[i] + result;
                }
            }

            i++;
        }
        return result;
    }
}