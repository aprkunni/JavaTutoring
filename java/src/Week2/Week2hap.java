import java.util.Scanner;

public class Week2hap {
    public static void main(String[] args){
        int num1, num2;
        String shap;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        shap = scanner.next();
        num2 = scanner.nextInt();
        if (shap.equals("+")){
            System.out.println(num1 + num2);
        }
        else if (shap.equals("-")){
            System.out.println(num1 - num2);
        }
        else if (shap.equals("*")){
            System.out.println(num1 * num2);
        }
        else if (shap.equals("/")){
            System.out.println(num1 / num2);
        }

    }
}
