package org.system;
//extending a class Single inheritance
public class Desktop extends Computer{
public void desktopSize()  {
	System.out.println("Desktop size");
	
}
public static void main(String[] args) {
	//creating desktop object and calling methods from the super class and the subclass
	Desktop desk=new Desktop();
	//super class method
	desk.computerModel();
	//subclass method
	desk.desktopSize();
}
}
