public class Main {

    // f is a recursion function to calculate fib
    static int f(int a){
        if(a <= 2) return 1;
        else return f(a-1) + f(a-2);
    }

    public static void main(String [] args) {
        System.out.println(f(20));
    }
}
