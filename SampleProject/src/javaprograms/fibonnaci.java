package javaprograms;

public class fibonnaci {
	public static void fibonacci(int n) {
        if (n == 0) 
        	System.out.println(0);
        else if (n == 1) 
        	System.out.println(1);
        else {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int fib = 0;

        for (int i = 3; i <= n; i++) {
            fib = a + b;
            System.out.println(fib);
            a = b;
            b = fib;
        }

        }
    }
	public static void main(String[] args) {
		fibonacci(10);
	}
}
