package a1;

public class x70 extends proton{

	String autop,suv;
	x70(){
	this.autop="This car has Auto Park";
	this.suv="This car is an SUV";
	}
	
	x70(String a,String b){
	this.autop=a;
	this.suv=b;
	}	
	
	public void tyre() {
		proton p=new proton(16,"Dunlop");
		System.out.println("brand of tyre: "+p.brand+" Size "+p.tyre);
	}
	
	public void AutoPark() {
		System.out.println("This car has Auto Park");
	}
	
	public void suv() {
		
		System.out.println("This car is an SUV");
	}
	
private String carheight;
	
	public String getcheight() {//encapsulation getter
		return carheight;
	}
	
	public void setcheight(String ch) {//encapsulation setter
		this.carheight=ch;
	}
	
	//void run() {
	//	super.run();
	//	System.out.println("The x70 is Running!");
		
	//}
	
	void transmission() {
		
		System.out.println("Transmission : 7 speed Auto ");
		
	}
	void ChColor(String a,String b) {
		
		System.out.println("Color: "+a+" "+b);
	} 
	
	String[] Color() {//overload with polymorphism
		
		String[] x=super.Color();
		System.out.println("Enter color type Metallic,matte,standard:");
		String Ctype= fet.nextLine();
		ChColor(x[0],Ctype);
		return new String[] {x[0],Ctype};
		 
		}
	
}
