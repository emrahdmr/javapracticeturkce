package javaofficehours;

import java.util.Scanner;

public class day8_1 {

	    public static void main(String[] args) {
	        //Kullan�c�da bir String k�mesi girmesini isteyelim ve Ka� kelimeden
	        //olu�tu�unu d�nen java methodu yaz�n�z.

	    	Scanner sc =new Scanner(System.in);
	        System.out.println("L�tfen bir c�mle giriniz.");
	        String str = sc.nextLine();
	        System.out.println("Metindeki kelime say�s�: " +kelimeSayisi(str));
           
	        sc.close();
	    }
	    public static  int kelimeSayisi(String str){
	        int count=0;
	        for (int i=0;i<str.length();i++){
	            if(str.charAt(i)==' '){
	                count++;
	            }
	        }
	        
	        count=count +1;
	        return count;

	       
	    }
	}
