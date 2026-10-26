public class TaskN {
    public static int transformDigits(int n) {
        int a = 0;
        int c = 1;
        for (int i = n; i > 0; i = i / 10) {
            int b = i % 10;
            if (b % 2 == 0) {
                b = b + 1;
            } else {
                b = b - 1;
            }
            a = a + b * c;
            c = c * 10;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(transformDigits(983210));
    }
}