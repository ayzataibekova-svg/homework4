public class TaskG {
    public static int pop(int a){
        int b=1;
        for(int i=1;i<=a;i++){
            b=b*i;
        }
        return b;
    }
    public static void main(String[] args){
        System.out.println(pop(5));
    }
}
