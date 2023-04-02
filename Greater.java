import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        System.out.println("what is your name please?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("hello " + name + "!!");

    }
}