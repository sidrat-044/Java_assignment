public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci up to 100:");
        System.out.println(a);
        System.out.println(b);

        for (int fibo = a + b; fibo <= 100; fibo = a + b) {
            System.out.println(fibo);
            a = b;
            b = fibo;
        }
    }
}
