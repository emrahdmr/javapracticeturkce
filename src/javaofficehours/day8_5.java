package javaofficehours;

public class day8_5 {
	
	 public static void main(String[] args) {
	        //Array listesinin ortalamasýný bulan java kodunu bulalým
	        int [] numbers = {20,30,25,32,-15,11};
	        int sum=0;
	        double ort=0;
	        for (int i = 0; i <numbers.length ; i++) {
	            sum=sum+numbers[i];
	        }
	        ort=sum/numbers.length;
	        System.out.println("Array elemanlarýnýn ortalamasý: " +ort);
	        
	 }
	}