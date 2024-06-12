package tr.com.medipol.java;

public class ArabaUygulamasi {

	public static void main(String[] args) {
		
		// Araba nesnesi oluþturma 
		Araba car1 = new Araba("Siyah", "Ford", 2020);
		
		// Araba özelliklerine eriþim 
		System.out.println("Renk: " + car1.renk);
		System.out.println("Marka: " + car1.marka);
		System.out.println("Model: " + car1.model);

		
		// Araba metodlarýnýn kullanýmý
		
		
		car1.hareketEt();
		car1.frenYap();
		car1.hizlandir(100);
		
		
	}

}
