import java.util.Scanner;

class calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        if (num1 > num2) {
            return num1 - num2;
        } else {
            return num2 - num1;
        }
    }

    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public int division(int num1, int num2) {
        if (num1 > num2) {
            return num1 / num2;
        } else {
            return num2 / num2;
        }
    }
}

class object {
    public static void main(String args[]) {
        calculator cal = new calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the option you want to calculate (1-4) : ");
        int userinput = scanner.nextInt();
        if (userinput <= 4 && userinput >= 1) {
            System.out.print("Enter the number1 : ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the number2 : ");
            int num2 = scanner.nextInt();
            int result;
            switch (userinput) {
                case 1:
                    result = cal.add(num1, num2);
                    System.out.println("result of the operation : "+result);
                    break;
                case 2:
                    result = cal.subtract(num1, num2);
                    System.out.println("result of the operation : "+result);
                    break;
                case 3:
                    result = cal.multiplication(num1, num2);
                    System.out.println("result of the operation : "+result);
                    break;
                default:
                    result = cal.division(num1, num2);
                    System.out.println("result of the operation : "+result);
                    break;
            }
        }
        else{
            System.out.println("Invalid Option is choose by user");
        }
    }
}