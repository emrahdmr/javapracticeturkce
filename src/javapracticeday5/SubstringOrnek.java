package javapracticeday5;

import java.util.Scanner;

public class SubstringOrnek {

	public static void main(String[] args) {
		
		/*
		Kullanicidan iki isim isteyiniz eger ilk isim uzunlugu cift sayi ise ikinci ismi ilk ismin ortasina ekleyiniz
		e.g: 
		mehmet ==>   mehahmetmet
		ahmet 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki isim giriniz");
		String name1 = scan.next(); 
		String name2 = scan.next(); 
		
		//int length = name1.length();
		
		if (name1.length()%2==0) {
        System.out.println(name1.substring(0,name1.length()/2) + (name2) + name1.substring(name1.length()/2)) ;
		}

	}

}
