public class TaskL {
    public static int reverseNumber(int n) {
        int a=0;
        for (int i=n; i>0; i=i/10) {
            int b=i%10;
            a=a*10+b;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(reverseNumber(79865));
    }
}