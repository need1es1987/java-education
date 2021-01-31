package testwork;

import java.util.Scanner;

public class printDiamond {
    public static void main(String[] args) {

        int height;
        int weight;


        Scanner scan = new Scanner(System.in);

        System.out.println("Ведите высоту ромба:");
        height = scan.nextInt();
        System.out.println("Ведите ширину ромба:");
        weight = scan.nextInt();

        printDiamond.printDiamond(height,weight);
    }

    public static void printDiamond(int height, int weight) {

        if ((height > 0) & (weight > 0)) {
            if ((height == 1) && (weight == 1)) {
                System.out.print("#");
            }
            int center = weight / 2 + 1;
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= weight; j++) {
                    if (i <= center) {
                        if ((j >= center - i + 1) && (j <= center + i - 1)) {
                            System.out.print("#");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        if ((j >= center + i - height) && (j <= center - i + height)) {
                            System.out.print("#");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
