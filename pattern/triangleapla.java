package pattern;

import java.util.Scanner;

public class triangleapla {
            public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64)+" ");

            }
            System.out.println();
        }
    }
    
    
}
