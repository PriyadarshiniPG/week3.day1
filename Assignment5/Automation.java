package week3.day1.Assignment5;

public class Automation implements Language, TestToll {

	public void selenium(int chapter) {
		//this.java();

		System.out.println("This is Test Toll interface method with number of chapters in selenium" + " " + chapter);

	}

	public void java() {
     this.selenium(10);
		System.out.println("This is Language interface  method ");

	}

	public static void main(String[] args) {
		Automation automate = new Automation();
		//automate.selenium(10);
		automate.java();

	}

}
