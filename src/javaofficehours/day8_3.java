package javaofficehours;
import java.util.Arrays;

public class day8_3 {


		 public static void main(String[] args) {
	        //Array elemanlar�n�n matemati�e g�re tersini yapan java kodunu yaz�n�z.
	        //1,2,3,-4,5  -1,-2,-3,4,-5
	        
		 int[] arr ={1,2,-3,4,5};
	        
	        System.out.println(Arrays.toString(sayininTersi(arr)));

	 }
	    public static int[] sayininTersi(int []arr){
	    	for (int i = 0; i <arr.length ; i++) {
	            arr[i]*=-1;
	    	}
	          return arr;
	    }	    
	    }