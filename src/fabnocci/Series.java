package fabnocci;

import java.util.Scanner;

public class Series {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int count=10;
        System.out.print(n+" "+n1);
        for(int i=2;i<=count;i++){
            int n3=n+n1;
            System.out.print(" "+n3);
            n=n1;
            n1=n3;
        }
    }
}
