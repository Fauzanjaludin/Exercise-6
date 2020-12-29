package a1;

import java.util.Scanner;

public class x50 extends x70 {
	Scanner fet=new Scanner(System.in);
	
	public void feat() {
		x70 x=new x70();
		
		System.out.println(x.autop+"\n"+x.suv);
	}
	
	void defColor() {
		System.out.println("default color: Gunmetal");
	}
	
	private String glass;
	
	public String getglass() {//encapsulation getter
		return glass;
	}
	
	public void setglass(String g) {//encapsulation setter
		this.glass=g;
	}
	
	void run() {//polymorphism
		super.run();
		System.out.println("The x50 is Running!");
		
	}
	
	void transmission() {
		
		System.out.println("Transmission : 7 speed Auto ");
		
	}
	
	
	void ChColor(String a,String b,String c) {//overload
		System.out.println("Color: "+a+" "+b+" with "+c+" Decal");
	} 
	
	
	String[] Color() {//overload with polymorphism
		String x[]=super.Color();
		System.out.println("Enter decal (Modern,None):");
		String Cdecal= fet.nextLine();
		ChColor(x[0],x[1],Cdecal);
		
		return new String[] {x[0],x[1],Cdecal};
	}
	
	
}
