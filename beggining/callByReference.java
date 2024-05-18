
public class callByReference {
  public static void main(String args[]) {
    int a = 10, b = 20;
    System.out.println("Before swapping - a: " + a + ", b: " + b);
    swap(a, b);
    System.out.println("After swapping - a: " + a + ", b: " + b);
  }

  public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
  }
}



// public class callByReference {
//     public static void main(String args[]) {
//         int[] arr = {10, 20};
//         System.out.println("Before swapping - arr[0]: " + arr[0] + ", arr[1]: " + arr[1]);
//         swap(arr);
//         System.out.println("After swapping - arr[0]: " + arr[0] + ", arr[1]: " + arr[1]);
//     }

//     public static void swap(int[] arr) {
//         int temp = arr[0];
//         arr[0] = arr[1];
//         arr[1] = temp;
//     }
// }


// class IntWrapper {
//     int value;

//     IntWrapper(int value) {
//         this.value = value;
//     }
// }

// public class callByReference {
//     public static void main(String args[]) {
//         IntWrapper a = new IntWrapper(10);
//         IntWrapper b = new IntWrapper(20);

//         System.out.println("Before swapping - a: " + a.value + ", b: " + b.value);
//         swap(a, b);
//         System.out.println("After swapping - a: " + a.value + ", b: " + b.value);
//     }

//     public static void swap(IntWrapper a, IntWrapper b) {
//         int temp = a.value;
//         a.value = b.value;
//         b.value = temp;
//     }
// }
