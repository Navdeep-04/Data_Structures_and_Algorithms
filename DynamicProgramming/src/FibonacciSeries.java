import java.util.Arrays;

public class FibonacciSeries {
    static int count = 0;
    static int[] mem;
    static int fib(int n){
        count++;
        if(mem[n] != -1){
            return mem[n];
        }
        if(n == 0){
            mem[n] = 0;
            return 0;
        }
        if(n == 1){
            mem[n] = 1;
            return 1;
        }
        int result =  fib(n-1) + fib(n-2);
        mem[n] = result;
        return result;
    }
    public static void main(String[] args) {
        int n = 10 ;
        mem = new int[n+1];
        Arrays.fill(mem, -1);
        System.out.println(fib(n)+" Count: "+count);
    }
}
// 10 = 177