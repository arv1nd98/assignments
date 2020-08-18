package Assignment;

import java.util.Collections;

public class Cars {
String carname;
int manufacturedyear;

public String getCarname() {
	return carname;
}
public void setCarname(String carname) {
	this.carname = carname;
}
public int getManufacturedyear() {
	return manufacturedyear;
}
public void setManufacturedyear(int manufacturedyear) {
	this.manufacturedyear = manufacturedyear;
}

public Cars(String carname, int manufacturedyear) {
	super();
	this.carname = carname;
	this.manufacturedyear = manufacturedyear;
}
@Override
public String toString() {
	return "Cars [carname=" + carname + ", manufacturedyear=" + manufacturedyear + "]";
}

}
