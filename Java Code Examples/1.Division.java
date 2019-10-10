package es.edu.bsb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    int a, b;
        a = in.nextInt();
        b = in.nextInt();
        if (b == 0) {
            System.out.println("Can't divide by zero!");
        } else {
            int q = a / b;
            int r = a % b;
            System.out.println(q);
            System.out.println(r);
        }
    }
}
