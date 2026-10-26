public class TaskI {
    public static boolean isArmstrong(int n) {
        int a = n;
        int c = 0;

        for (int i = 100; i <= 999; i++) {
            int b = i;
            int sum = 0;

            for (; b > 0; b = b / 10) {
                int d = b % 10;
                sum = sum + d * d * d;
            }

            if (sum == i) {
                System.out.print(i + " ");
                c++;
            }
        }

        return c > 0;
    }

    public static void main(String[] args) {
        isArmstrong(0);
    }
}