package es.edu.bsb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int a, b, c, d;
	    a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        int maximum = a;
        if (b > maximum) {
            maximum = b;
        }
        if (c > maximum) {
            maximum = c;
        }
        if (d > maximum) {
            maximum = d;
        }
        System.out.println(maximum);
    }
}
