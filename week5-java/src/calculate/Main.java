package calculate;

import java.util.Scanner;
public class Main   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator cal = new Calculator();
        char choice;
    do {
        System.out.println(" Enter the first number = ");
        int num1=scanner.nextInt();
        System.out.println(" Enter the second number = ");
        int num2=scanner.nextInt();
        System.out.println(" Enter the one symbol- +,-,*,/ =  ");
        char symbol = scanner.next().charAt(0);
        cal.calculateResult(num1,num2,symbol);
        System.out.println(" Would you like to do more calculation? please enter 'y' or 'n' : ");
        choice = scanner.next().charAt(0);
    }while (choice == 'y' || choice == 'Y' );
    scanner.close();

    }

}
