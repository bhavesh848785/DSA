import java.util.Arrays;

public class ArrayWithFunction {
    public static void main(String[] args) {
        int[] name= {23,45,67,89};
        System.out.println(Arrays.toString(name));
        change(name);
        System.out.println(Arrays.toString(name));

    }

    static void change(int[] arr){
        arr[0]= 50;
    }
}
