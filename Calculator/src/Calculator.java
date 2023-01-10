import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which operation do you want to do:");
        String operation = scanner.nextLine();


        if(operation.equalsIgnoreCase("sum")){
            System.out.print("Enter the first number:");
            double number1 = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter the second number:");
            double number2 = scanner.nextDouble();
            scanner.nextLine();

            String sum = String.format("%f + %f = %f", number1, number2, number1 + number2);
            System.out.print(sum);
        } else if (operation.equalsIgnoreCase("subtract")) {
            System.out.print("Enter the first number:");
            double number1 = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter the second number:");
            double number2 = scanner.nextDouble();
            scanner.nextLine();

            String subtract = String.format("%f - %f = %f", number1, number2, number1 - number2);
            System.out.println(subtract);
        } else if (operation.equalsIgnoreCase("multiple")) {
            System.out.print("Enter the first number:");
            double number1 = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter the second number:");
            double number2 = scanner.nextDouble();
            scanner.nextLine();

            String multiple = String.format("%f * %f = %f", number1, number2, number1 * number2);
            System.out.println(multiple);
        } else if (operation.equalsIgnoreCase("divide")) {
            System.out.print("Enter the first number:");
            double number1 = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter the second number:");
            double number2 = scanner.nextDouble();
            scanner.nextLine();

            if (number2 == 0){
                System.out.println("Number cannot be divided by zero.");
            } else {
                String divide = String.format("%f / %f = %f", number1, number2, number1 / number2);
                System.out.println(divide);
            }


        } else if (operation.equalsIgnoreCase("percentage")) {
            System.out.print("Enter the value:");
            double value = scanner.nextDouble();

            System.out.print("Enter the total value:");
            double totalValue = scanner.nextDouble();

            double cal = value/totalValue;

            double percentage = cal * 100;

            System.out.println(percentage);
        } else {
            System.out.println("The operation is not supported");
        }


        scanner.close();
    }
}

