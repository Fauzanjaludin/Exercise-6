package a1;

public class saga extends proton{

	private String radio;
	
	public void tyresaga() {
		proton p=new proton();
		System.out.println("Brand of tyre: "+p.brand+" Size "+p.tyre);
	}
	
	public void FuelEffiecient() {
		System.out.println("This car is fuel effecient");
	}
	
	public String getradio() {//encapsulation getter
		return radio;
	}
	
	public void setradio(String rad) {//encapsulation setter
		this.radio=rad;
	}
	
	void run() {//polymorph
		super.run();
		System.out.println("The Saga is Running!");
		
	}
	
	void transmission() {
		super.transmission();
		System.out.println("5 speed Manual And 4 speed Auto ");
		
	}
	
	
}
