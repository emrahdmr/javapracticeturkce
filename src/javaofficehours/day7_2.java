package javaofficehours;

public class day7_2 {

	public static void main(String[] args) {
        //iki sayýnýn eþitlik durumunu kontrol eden methodu yazýnýz.
		
        System.out.println(esitMi(5,5));
    }
    public static boolean esitMi (int num1, int num2){
        if(num1==num2){
            return true;
        }
        return false;
    }
}




