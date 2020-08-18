package Assignment;

import java.util.Comparator;

public class CarsSort implements Comparator<Cars> {

	@Override
	public int compare(Cars o1, Cars o2) {
		// TODO Auto-generated method stub
		return o1.getCarname().compareTo(o2.getCarname());
	}

}
