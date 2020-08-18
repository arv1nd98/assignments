package Assignment;

import java.util.List;

public class Showroom {
String showroomname;
List<Cars> cars;
public String getShowroomname() {
	return showroomname;
}
public void setShowroomname(String showroomname) {
	this.showroomname = showroomname;
}
public List<Cars> getCars() {
	return cars;
}
public void setCars(List<Cars> cars) {
	this.cars = cars;
}
public Showroom(String showroomname, List<Cars> cars) {
	super();
	this.showroomname = showroomname;
	this.cars = cars;
}
@Override
public String toString() {
	return "Showroom [showroomname=" + showroomname + ", cars=" + cars + "]";
}

	
}
