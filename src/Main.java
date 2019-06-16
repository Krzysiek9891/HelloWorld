public class Main {

    public static void main(String[] args) {

        String localMessage="Hello world!";

        print(localMessage);

        Print print = new Print("Hello");

        System.out.println(print.handlePrint());
    }

    public static void print(String message){
        System.out.println(message);
    }


}

