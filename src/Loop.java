public class Loop {
    public static void main(String[] args){
        testLoop();
    }

    public static void testLoop(){
        int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
