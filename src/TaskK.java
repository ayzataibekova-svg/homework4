public class TaskK {
    public static int lcm(int a, int b) {
        for (int i=a; i<=a*b; i++) {
            if (i%a==0 && i%b==0) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("LCM = "+lcm(6, 8));
    }
}