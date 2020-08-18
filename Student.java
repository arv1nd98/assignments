package Assignment;

public class Student {

public void mark(int... marks) {
	
	for (int a:marks)
		if(a<=100) {
			System.out.println("Valid Mark");
		}
		else {
			try {
				
			throw new MarkNotValidException("Not a valid mark");
			}
			catch (MarkNotValidException e) {
				System.out.println(e);
			}
		}
}

public static void main(String[]args) throws Exception {
	Student student=new Student();
	student.mark(100,90,80,101);
}



}
