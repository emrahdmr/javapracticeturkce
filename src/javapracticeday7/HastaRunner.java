package javapracticeday7;
public class HastaRunner {
    
    
    public static void main(String[] args) {
        
        
        Hasta hasta1 = new Hasta();
        
        Case durum = new Case();
        
        
        durum.setActualCase("Romatizma");
        durum.setEmergency("normal");
        
        hasta1.setIsim("Nevzat");
        hasta1.setSoyIsim("Toprak");
        hasta1.setSuankiDurum(durum);
        
        
        
        
        System.out.println("Hastanin ismi: "+hasta1.getIsim());
        System.out.println("Hastanin soy ismi: "+hasta1.getSoyIsim());
        
//      System.out.println("Durum: "+durum.getActualCase());
        System.out.println("Hastanin durumu: "+hasta1.getSuankiDurum().getActualCase());
        
        System.out.println("Hastanin aciliyeti: "+hasta1.getSuankiDurum().getEmergency());
        
 
    }
    
    
}