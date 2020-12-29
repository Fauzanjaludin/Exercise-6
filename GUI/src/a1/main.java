package a1;

import java.util.Scanner;

public class main {


		public static void main(String[] args) {
			Scanner myObj = new Scanner(System.in);
			saga s=new saga();
			System.out.print("Enter Model (lowercase):");
			
			String name = myObj.next();
			
			
			
			
			
			
			
			switch(name) {
			case "saga":
			System.out.println("Proton Saga");
			s.wheels();
			s.FuelEffiecient();
			s.petrol();
			s.powerwindow();
			s.tyresaga();
			s.setradio("Tek");//setter
			System.out.println("Radio Brand: "+s.getradio());//getter
			s.run();//polymorph
			s.price(16,57);
			
			s.transmission();//polymorph
			s.Color();
			break;
			
			case "x70":
			x70 x=new x70();
			
			System.out.println("Proton X70");
			x.tyre();
			x.AutoPark();
			x.wheels();
			x.petrol();
			x.powerwindow();
			x.price(16,57,99);
			x.setcheight("1.69 m");//setter
			x.run();//polymorph
			x.transmission();//polymorph
			System.out.println("Car height : "+x.getcheight());//getter
			x.Color();
			
			break;
			
			case "x50":
			System.out.println("Proton X50");
			x50 x5=new x50();
			x5.tyre();
			x5.feat();
			x5.petrol();
			x5.price(61, 60);
			x5.price(69,420,360);
			x5.setglass("A+");//setter
			System.out.println("Window glass Quality : "+x5.getglass());//getter
			x5.run();//polymorph
			x5.transmission();//polymorph
			x5.Color();
			break;
			
			default:
				System.out.println("Wrong");
			break;
			
		}
			
			myObj.close();

	
		
		}
}
