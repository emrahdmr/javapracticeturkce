package arabaprojesiday6;

public class Car {
	
	/*
    Bir class olusturunuz adi Car olsun
    icerisinde 3 instance variable olsun 
    protected String make ;
    protected String model;
    protected int year ;
    Sonra 3 tane String return tipinden method olusturunuz
    arabaMarkasi
    arabaModeli
    arabaYili
    ve iki constructor olusturunuz 
    1 parametreli
    1 parametresiz
    String model;
    int year
    Son olarak bir oject olusturup method lari main method da print ediniz 
    */
      
	protected String make ;
    protected String model;
    protected int year ;

    public Car () {
        
        
    }
    
    public Car (String model , int year) {
        
        this.model = model;
        this.year = year;
        
    }
    
    
    
    
    
    
    
//    public static void main(String[] args) {
//        /*
//        Car newCar = new Car();
//        System.out.println("Arabanin markasi: "+newCar.arabaMarkasi());
//        System.out.println("Arabanin modeli: "+newCar.arabaModeli());
//        System.out.println("Arabanin yili: "+newCar.arabaYili());
//        */
//        
//        
//        
//        Car araba1 = new Car();
//        /*
//        System.out.println("Arabanin markasi: "+araba1.arabaMarkasi());
//        System.out.println("Arabanin modeli: "+araba1.arabaModeli());
//        System.out.println("Arabanin yili: "+araba1.arabaYili());
//        */
//        Car araba2 = new Car("Camry", 2013);
//        
//        System.out.println("Arabanin markasi: "+araba2.arabaMarkasi());
//        System.out.println("Arabanin modeli: "+araba2.arabaModeli());
//        System.out.println("Arabanin yili: "+araba2.arabaYili());
//        
//    }
    
    
    
    
    
    public  String arabaMarkasi() {
        
        return make;
    }
    
    public  String arabaModeli() {
        
        return model;
    }
    
    public  int arabaYili() {
        
        return year;
    }
    
    
    
    
}
