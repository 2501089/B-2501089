public class Main {
    public static void main(String[] args) {

        final int DEPTH = 300;
        final int UP = 55;
        final int DOWN = 13;
        int height = 0;
        int day = 0;

        while (height < DEPTH) {
            day++;
            height += UP;
            System.out.printf("%d일차 낮 - 현재 높이: %dcm\n", day, height);
            if (height >= DEPTH) {
                break;
            }
            height -= DOWN;
            System.out.printf("%d일차 밤 - 미끄러진 후 높이: %dcm\n", day, height);
        }
        System.out.printf("\n달팽이는 %d일 만에 우물에서 탈출했습니다.\n", day);
    }
}