public class Main {
    public static void main(String [] args) {
        int[] f = new int[20];  // f is Fibonacci array
        f[0] = 1;
        f[1] = 1;
        for(int i=2; i<20; i++){
            f[i] = f[i-1] + f[i-2]; // fibonacci's rule
        }
        for(int i=0; i<20; i++){
            System.out.println(f[i]);
        }
    }
}
