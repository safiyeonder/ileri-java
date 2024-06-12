package tr.com.medipol.java;

public class Araba {
	
	// Alanlar
	
	 String renk;
	 String marka;
	 int model;
	

	
	// Kurucu metod
	
			public Araba(String renk,String marka,int model) {
				this.renk=renk;
				this.marka=marka;
				this.model= model;
				
			}
	
	// Metodlar
	public void hareketEt() {
		System.out.println("Araba hareket ediyor.");
	}
	
	public void frenYap() {
		System.out.println("Araba duruyor.");
	}
	 public void hizlandir(int hiz) {
	      System.out.println("Araba " + hiz + " km/s hýzla hareket ediyor...");
	   }
	
		
		
		
	
}
