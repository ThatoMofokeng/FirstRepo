import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Your Name: ");
        String name = input.next();
        System.out.println("Welcome" + name);
    }
}