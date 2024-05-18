import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {

        Scanner hi = new Scanner(System.in);
        String[] name = new String[4]; // array declartion
        for (int i = 0; i < name.length; i++)
        {
             name[i] = hi.next();
        }
        System.out.println(Arrays.toString(name));
        name[1] = "bhavesh";
        System.out.println(Arrays.toString(name));

        //int[] percentage = {80,78,98}; // array declaration

        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of an array: ");
        int size = in.nextInt();
        int[] marks = new int [size]; // array declaration

        // marks[0]=21;
        // marks[1]=22;
        // marks[2]=23;
        // marks[3]=24;
        // marks[4]=25;

        System.out.println("enter the element of an array: ");

        for(int i =0; i<size; i++)
        {
            System.out.println("enter the element for index" +i+":");
            marks[i] = in.nextInt();
        }
      
        System.out.println(Arrays.toString(marks));
        // for(int i =0; i<size; i++)
        // {
        //     System.out.println("element at index " +i+ "is " +marks[i]);

        // }
    }
}

