package z1_recursion;

public class R6_FIibonacci {
    public static void main(String[] args){

        int n=10;
        System.out.println("fibonacci series:");

        for(int i=0; i<n; i++){
            System.out.println(fibo(i)+ " ");
        }
        
    }

    static int fibo(int n){

        //base condition
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
