package Override;

public class AxisBank extends Bank{
	public void deposit() {
		System.out.println("deposit in AxisBank ");
	}
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.deposit();
		obj.fixed();
		obj.saving();
		
	}
}
