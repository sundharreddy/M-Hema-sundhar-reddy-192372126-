public class Main {
    public static void main(String[] args) {
        int n = 5;
        long factorial = 1;
        for (int i = 1; i <= n; ++i) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " = " + factorial);
    }
}
