package week3.day1.Assignment4;

public class Student {

	public int getStudentInfo(int id) {
		return id;

	}

	public void getstudentinfo(int id, String name) {
		System.out.println("id" + id + " "+ "name" + name);

	}

	public void getstudentinfo(String email, long phonenumber) {
		System.out.println("Email id " +" "+ email + " "+ "phome number" + phonenumber);

	}

	// overloading same method but with different argument types
	public static void main(String[] args) {
		Student obj = new Student();
		int studentInfo = obj.getStudentInfo(12);
		System.out.println("Student id " + "" + studentInfo);
		obj.getstudentinfo(studentInfo, "Priya");
		obj.getstudentinfo("test@gmail.com", 9087654321L);

	}

}
