package Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShowroomMain {

	Map<String, List<Cars>> carstore;

	public void displayCarsByShowroomname(String Showroomname) 
	
	{
	List<Cars> cars=carstore.get(Showroomname);

	for(Cars car:cars){
	System.out.println(car);
	}

	}



	public static void main(String[] args) {

    Cars car1=new Cars("Benz", 2008);
	Cars car2=new Cars("BMW", 2016);
	Cars car3=new Cars("Audi", 2015);
	
	
	List<Cars> cars=new ArrayList<Cars>();
  cars.add(car1);
  cars.add(car2);
  cars.add(car3);

  
	Showroom showroom=new Showroom("Zoom cars",cars);

	//----------------------------------------------------------------

	Cars car4=new Cars("Jaguar", 2010);
	Cars car5=new Cars("Ferrari", 2020);
	Cars car6=new Cars("Mini Cooper",2017);
	
	List<Cars> cars1=new ArrayList<Cars>();
	
	cars1.add(car4);
	cars1.add(car5);
	cars1.add(car6);
	


	Showroom showroom1=new Showroom("Ola cars",cars);

	ShowroomMain m= new ShowroomMain();

	m.carstore=new HashMap<String,List<Cars>>();
	m.carstore.put(showroom.getShowroomname(),showroom.getCars());
	m.carstore.put(showroom1.getShowroomname(),showroom1.getCars());


	m.displayCarsByShowroomname("Zoom cars");
	
	}
}
