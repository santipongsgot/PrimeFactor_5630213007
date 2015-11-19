package Homework;

import java.util.Scanner;

public class HW_Github{

    public static void main(String[] args) {

        double inputnumber;
        Scanner in = new Scanner(System.in);

        System.out.println("Exit enter 0 \n");
        do {
            System.out.print("Enter number : ");
            inputnumber = in.nextDouble();

            System.out.print("Prime result : ");
            for (int i = 2; i <= inputnumber; i++) {
                while (inputnumber % i == 0) {
                    primenumber = i;
                    inputnumber = inputnumber / i;
                    System.out.print(i);
                    if (inputnumber >= i) {
                        System.out.print(" x ");
                    }
                }
            }
            System.out.print("\n\n");
        } while (inputnumber != 0);

    }

}
