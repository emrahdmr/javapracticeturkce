package javapracticeday8hastaneprojesi;

public class HastaneRunner {
	
	
	private static Hastane hastane = new Hastane();
	  

	public static void main(String[] args) {
		
		String hastaDurum = "Kalp hastaliklari";
		String unvan = doktorUnvan(hastaDurum);
		
		hastane.setDoctor(doctorBul(unvan));
		System.out.println("Doctor ismi: " + hastane.getDoctor().getIsim());
		System.out.println("Doctor soy isin: " + hastane.getDoctor().getSoyIsim());
		System.out.println("Doctor unvani: " + hastane.getDoctor().getUnvan());

	}

	
	public static String doktorUnvan(String aktuelDurum) { 
	if (aktuelDurum.equals("Allerji")) {
		return hastane.unvanlar[0];
  }else if(aktuelDurum.equals("Bas agrisi")) {
  		return hastane.unvanlar[1];
  }else if(aktuelDurum.equals("Diabet")) {
	  return hastane.unvanlar[2];
  }else if(aktuelDurum.equals("Soguk alginligi")) {
	  return hastane.unvanlar[3];
  }else if(aktuelDurum.equals("Migren")) {
	  return hastane.unvanlar[4];
  }else if(aktuelDurum.equals("Kalp hastaliklari")) {
	  return hastane.unvanlar[5];
  }
     return "yanlis durum";

	}
	
	
	public static Doctor doctorBul(String unvan) {
		Doctor doctor = new Doctor();
		
	for (int i = 0; i < hastane.unvanlar.length; i++) {
		if(unvan.equals(hastane.unvanlar[i])) {
			doctor.setIsim(hastane.doctorIsimleri[i]);
			doctor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
			doctor.setUnvan(hastane.unvanlar[i]);
			
		}
		
	}	
		
		return doctor;
	}
}