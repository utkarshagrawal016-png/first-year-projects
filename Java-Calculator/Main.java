import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public void add(int a , int b){
        int res = a+b;
        System.out.println("Addition of " + a + " and "  + b + " : " +  res);
    }
    public void sub(int a , int b){
        int res = a-b;
        System.out.println("Subtraction of " + a + " and "  + b + " : " +  res);
    }
    public void div(int a , int b){
        int res = a/b;
        System.out.println("Addition of " + a + " and "  + b + " : " +  res);
    }
    public void mul(int a , int b){
        int res = a*b;
        System.out.println("Multiplication of " + a + " and "  + b + " : " +  res);
    }
    public void rem(int a , int b){
        int res = a%b;
        System.out.println("Remainder of " + a + " and "  + b + " : " +  res);
    }
    public static void main(String[] args) {
//        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        System.out.println("Menu\nPress Given Symbols for Selecting Operation:-\nAddition\t->\t+\nSubtraction\t->\t-\nDivision\t->\t/\nMultiplication\t->\t*\nRemainder\t->\t%\nExit\t->\tx\nShow Menu\t->\t!");
        System.out.println("Enter choice (+, -, /, *, %, x, !): ");
        char choice = sc.next().charAt(0);
        char ans = 'y';
        boolean key;
        while (ans == 'y'){
            key = true;
            if (choice == '+' || choice == '-' || choice == '*' || choice == '/' || choice == '%') {
                System.out.println("Enter Num 1 : ");
                int num1 = sc.nextInt();
                System.out.println("Enter Num 2 : ");
                int num2 = sc.nextInt();

                if (choice == '+') {
                    obj.add(num1, num2);
                } else if (choice == '-') {
                    obj.sub(num1, num2);
                } else if (choice == '/') {
                    if (num1 == 0 || num2 == 0) {
                        System.out.println("Zero Division Error");
                    } else {
                        obj.div(num1, num2);
                    }
                } else if (choice == '*') {
                    obj.mul(num1, num2);
                } else {
                    obj.rem(num1, num2);
                }
            }
            else if (choice == 'x'){
                break;
            }
            else if (choice == '!'){
                System.out.println("Menu\nPress Given Symbols for Selecting Operation:-\nAddition\t->\t+\nSubtraction\t->\t-\nDivision\t->\t/\nMultiplication\t->\t*\nRemainder\t->\t%\nExit\t->\tx\nShow Menu\t->\t!");
            }
            else{
                System.out.println("Please choose correctly");
                key = false;
                System.out.println("Enter choice (+, -, /, *, %, x, !): ");
                choice = sc.next().charAt(0);
            }
            if (key) {
                System.out.println("Do you Want to Continue(y/n)?");
                ans = sc.next().charAt(0);
                if (ans == 'y'){
                    System.out.println("Enter choice (+, -, /, *, %, x, !): ");
                    choice = sc.next().charAt(0);
                }
            }
        }
        sc.close();
    }
}