package z1_recursion;

public class R1_mesage {
    public static void main(String[] args) {
        message();
    }

    static void message(){
        System.out.println("hello world");
        message1();
    }

    static void message1(){
        System.out.println("how are you");
        message2();
    }

    static void message2(){
        System.out.println("let's start the new concept:");
        message3();
    }

    static void message3(){
        System.out.println("name is recursion");
    }

}
