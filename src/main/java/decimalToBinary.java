
import java.util.Scanner;

public class decimalToBinary {
    /**
     * ouputs the strating text
     */
    public static void start(){
        System.out.println("Hello what do you want to do?");
        System.out.println("For decimal to binary enter 1");
        int operation = s.nextInt();
        checkForOperation(operation);
    }

    /**
     * checks which operation should be run
     */
    public static void checkForOperation(int operation){
        switch (operation){
            case 1:
                System.out.println("You have chosen: decimal to binary!");
                System.out.println("enter your number to convert");
                Scanner s = new Scanner(System.in);
                int num = s.nextInt();
                decimalToBinary(num);
                return;
        }
    }

    /**
     * converts decimal to binary
     */
    public static void decimalToBinary (int num) {
        int binary[] = new int[100];
        int numToPrint = num;
        int indexForWhile = 0;
        if (num == 1){
            System.out.println("1");
        }else {
            while (num > 0) {
                int temp = num%2;
                binary [indexForWhile] = temp;
                indexForWhile ++;
                num /= 2;
            }
            System.out.print(numToPrint + " in binary = ");
            for (int i = indexForWhile-1;i >= 0; i--) {
                System.out.print(binary[i]);
            }
        }
    }
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        start();
    }

}

