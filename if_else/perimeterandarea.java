package if_else;

import java.util.Scanner;

public class perimeterandarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length");
        int a = sc.nextInt();
        System.out.print("Enter the  breadth");
        int b = sc.nextInt();
        sc.close();
        if (a * b > a + b) {
            System.out.print("the area of rectangle is greater than the perimeter. " + " area is:" + (a * b)
                    + "perimeter is:" + (a + b));

        } else {
            System.out.print("the area of rectangle is not greater than the perimeter" + " area is:" + (a * b)
                    + "perimeter is:" + (a + b));
        }
    }

}
