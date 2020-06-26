package javaofficehours;

import java.util.Scanner;

public class day7_3 {

	 public static void main(String[] args) {
	        
	        // Girilen sayinin tersini return eden java methodunu yaziniz
	        
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Bir sayi giriniz:");
	        int num = scan.nextInt();
	        
	        System.out.println(sayininTersi(num));       
	        scan.close();
	    }
	    
	    public static int sayininTersi(int num) {
	        int sonuc = 0;
	        
	        while(num>0) {
	            int sayi = num%10;
	            num /= 10;
	            sonuc = sonuc * 10 + sayi;
	        }
	        return sonuc;
	    }
	}