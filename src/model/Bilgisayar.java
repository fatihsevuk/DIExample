package model;

public class Bilgisayar {
	
	private String marka;
	private String fiyat;
	
	public Bilgisayar() {
		// TODO Auto-generated constructor stub
	}
	
	public Bilgisayar(String marka , String fiyat){

		  this.marka=marka;
		  this.fiyat=fiyat;
		}
	
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getFiyat() {
		return fiyat;
	}
	public void setFiyat(String fiyat) {
		this.fiyat = fiyat;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "bu bilgisayarýn[ markasý:"+marka+" fiyatý:"+fiyat+"]";
	}

}
