public class FunctionOverloading {
    public static void main(String[] args) {

    int a=10;
    int b=20;
    int c = add(a,b);
    System.out.println(c);
        
    double x=10.0;
    double y=20.0;
    double z = add(x,y);
    System.out.println(z);
    }

    static int add(int a, int b){
        int sum;
        sum= a+b;
        return sum;
    }

    static double add(double a, double b){
        double sum;
        sum= a+b;
        return sum;
    }
}
