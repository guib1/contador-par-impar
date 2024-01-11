package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, qp=0,qi=0;
        int[]num = new int[10];
        for (i=0; i<=9; i++)
        {
            System.out.print ("Digite o "+(i+1)+" número: ");
            num[i] = scanner.nextInt();
            if (num[i]%2==0)
            {
                System.out.println(num[i]+" ==> PAR");
                qp++;
            }
            else if (num[i]%2!=0)
            {
                System.out.println(num[i]+" ==> IMPAR");
                qi++;
            }
        }
        System.out.println("\nTotal de números páres" + qp);
        System.out.println("\nTotal de números impáres" + qi);
    }
}