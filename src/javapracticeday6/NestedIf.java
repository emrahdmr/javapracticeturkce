package javapracticeday6;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
	
		// Kullanicidan 3 Numara isteyiniz ve bu numaralarin
		// en buyuk ve en kucuk olanlarini konsola yazdiriniz
		
		Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen iki numara giriniz");
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        
        if(num1 >=num2 && num1>=num3) {
            System.out.println(num1+" en buyuk sayidir");
        	if (num2>num3)
            System.out.println(num3+" en kucuk sayidir");
        	else {
            System.out.println(num2+" en kucuk sayidir");
        	}
        } else if(num2 >=num1 && num2>=num3) {
            System.out.println(num2+" en buyuk sayidir");
        	if (num1> num3) 
        		System.out.println(num3+" en kucuk sayidir");
        	else {
            System.out.println(num1+" en kucuk sayidir");
        	}	      
        }
scan.close();
	}
}
