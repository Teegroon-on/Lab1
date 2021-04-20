package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //Простые числа
	    for(int i = 2; i < 101; i++)
        {
            if(IsPrime(i))
            {
                System.out.print("Простое число: ");
                System.out.println(i);
            }
        }
        //Палиндром
        Scanner in = new Scanner(System.in);
	    System.out.print("Введите строку: ");
	    String str = in.nextLine();
	    System.out.println("");
	    String[] strmas = str.split(" ");

	    for(int i = 0; i < strmas.length; i++)
        {
            if(IsPalindrom(strmas[i]))
            {
                System.out.print("Слово палиндром: ");
                System.out.println(strmas[i]);
            }
        }
    }

    public static boolean IsPrime(int n)
    {
        if (n > 1) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
                return true;
            }
        }
        else
        {
            return false;
        }
        return false;
    }

    public static String reverseString(String str)
    {
        String reverseStr = "";
        for(int i = str.length() - 1; i > -1 ; i--)
        {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }

    public static boolean IsPalindrom(String str)
    {
        if(str.toLowerCase(Locale.ROOT).equals(reverseString(str).toLowerCase(Locale.ROOT)))
        {
            return true;
        }
        return false;
    }

}
