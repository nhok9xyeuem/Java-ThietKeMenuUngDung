import java.util.Scanner;

public class ThietKeMenuUngDung {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("MENU");

        String[] menu = {"1. Draw the triangle", "2. Draw the square", "3. Draw the rectangle", "0. Exit"};

        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
        System.out.println("Enter number ");
        choice = input.nextInt();
        switch (choice) {
            case 0:
                System.exit(0);
            case 1:
                DrawTheTraiangle();
                break;
            case 2:
                DrawTheSquare();
                break;
            case 3:
                DrawTheRectangle();
                break;
            default:
                System.out.println("No Choice !");

        }
    }



    private static void DrawTheSquare() {
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }

    private static void DrawTheRectangle() {
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");


    }

    private static void DrawTheTraiangle() {
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");

    }
}
