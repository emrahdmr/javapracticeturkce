package javaofficehours;

public class day5_1 {

	public static void main(String[] args) {
		//concat() methodu concatination yapmam�z� sa�lar. Yani stringleri birle�tirir
		
				String str1= "ankara";
				String str2= "van";
				System.out.println(str1.concat(str2));
				System.out.println(str1 + str2);
				//replace() String deki istenilen karekterin ba�kabir karakter ile de�i�tirmemizi sa�lar.
				
				String str3 = "karete";
				System.out.println(str3.replace("a", "o"));
				
				// valueOf() 2 farkl� kullan�m� var.
				//1. String i�indeki int karakterlere matematiksel i�lem yapmam�z� sa�lar.
				
				String butce1= "12000";
				String butce2 ="13000";
				System.out.println(Integer.valueOf(butce1) +Integer.valueOf(butce2));
				
				//2. �nt i�indeki karaterlere String �zelli�i katar.
				
				int  yas1 =12;
				int yas2 = 15;
				System.out.println(yas1 + yas2);
				System.out.println(String.valueOf(yas1)+ String.valueOf(yas2));
		
	}

}
