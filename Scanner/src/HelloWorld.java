import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What operation do you want?");
        String operation = scanner.nextLine();

        switch (operation){
            case "sum":
                System.out.print("Enter the first number:");
                double number1 = scanner.nextDouble();

                System.out.print("Enter the second number:");
                double number2 = scanner.nextDouble();

                String sum = String.format("%f + %f = %f", number1, number2, number1 + number2);
                System.out.println(sum);

                break;

            case "subtract":
                System.out.print("Enter the first number:");
                double number3 = scanner.nextDouble();

                System.out.print("Enter the second number:");
                double number4 = scanner.nextDouble();

                String subtract = String.format("%f - %f = %f", number3, number4, number3 - number4);
                System.out.println(subtract);

                break;

            case "multiple":
                System.out.print("Enter the first number:");
                double number5 = scanner.nextDouble();

                System.out.print("Enter the second number:");
                double number6 = scanner.nextDouble();

                String multiple = String.format("%f * %f = %f", number5, number6, number5 + number6);
                System.out.println(multiple);

                break;

            case "divide":
                System.out.print("Enter the first number:");
                double number7 = scanner.nextDouble();

                System.out.print("Enter the second number:");
                double number8 = scanner.nextDouble();

                if (number8 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    String divide = String.format("%f / %f = %f", number7, number8, number7 + number8);
                    System.out.println(divide);
                }
                break;

            case "percentage":
                System.out.print("Enter the value:");
                double value = scanner.nextDouble();

                System.out.print("Enter the total value:");
                double totalValue = scanner.nextDouble();

                double val = value/totalValue;

                double percentage = val*100;

                System.out.println(percentage);
                break;

            default:
                System.out.println("This is supported!");
        }



        scanner.close();
    }
}
