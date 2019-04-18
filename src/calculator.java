import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        String rep;
        do {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number");
            int n1 = sc.nextInt();
            System.out.println("enter the second number ");
            int n2 = sc.nextInt();
            System.out.println("choose the operation symbol (+,-,*,/,%) which you want to perform");
            String opr = sc.next();
            int result;
            switch (opr) {
                case "+":
                    result = n1 + n2;
                    System.out.println(result);
                    break;
                case "-":
                    result = n1 - n2;
                    System.out.println(result);
                    break;
                case "*":
                    result = n1 * n2;
                    System.out.println(result);
                    break;
                case "/":
                    result = n1 / n2;
                    System.out.println(result);
                    break;
                case "%":
                    result = n1 % n2;
                    System.out.println(result);
                    break;
                default:
                    System.out.println("Syntax Error");
                    break;
            }
            System.out.println("Do you want to countinue(press (y for yes and n for no)");
             rep = sc.next();
        }
            while (rep.equals("y") || rep.equals(" n"));

    }
}
