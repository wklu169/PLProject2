package lu.ui;

/**
 * Created by Owner on 2/18/2016.
 */

import java.util.Scanner;

public class Console {

    private static Scanner sc = new Scanner(System.in);

    public static void displayLine(){
        System.out.println();
    }

    public static void displayLine(String s){
        System.out.println(s);
    }

    public static String getString(String prompt){
        System.out.println(prompt);
        String s = sc.nextLine();
        return s;
    }
}
