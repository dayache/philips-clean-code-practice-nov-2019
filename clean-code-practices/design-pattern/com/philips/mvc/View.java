package com.philips.mvc;

import com.philips.absfactory.IVehicle;


interface IView {

	public  void render(Student student);
}

public abstract class View implements IView{
	public abstract void mobileCompliant();  
}





class DashedView implements IView{

	@Override
	public void render(Student student) {
		System.out.println("------------------------------------------------");
		System.out.println("Student Id : " + student.getStudentId());
		System.out.println("Student Name : " + student.getStudentName());
		System.out.println("Student Percentage : " + student.getPercentage());
		System.out.println("------------------------------------------------");
	}
	
}

class DashView extends View {

	@Override
	public void render(Student student) {
		System.out.println("------------------------------------------------");
		System.out.println("Student Id : " + student.getStudentId());
		System.out.println("Student Name : " + student.getStudentName());
		System.out.println("Student Percentage : " + student.getPercentage());
		System.out.println("------------------------------------------------");
	}

	@Override
	public void mobileCompliant() {
		// TODO Auto-generated method stub
		
	}
}

class StarView extends View {

	@Override
	public void render(Student student) {
		System.out.println("************************************************");
		System.out.println("Student Id : " + student.getStudentId());
		System.out.println("Student Name : " + student.getStudentName());
		System.out.println("Student Percentage : " + student.getPercentage());
		System.out.println("************************************************");
	}

	@Override
	public void mobileCompliant() {
		// TODO Auto-generated method stub
		
	}

}



class CapView extends View {

	@Override
	public void render(Student student) {
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Student Id : " + student.getStudentId());
		System.out.println("Student Name : " + student.getStudentName());
		System.out.println("Student Percentage : " + student.getPercentage());
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}

	@Override
	public void mobileCompliant() {
		// TODO Auto-generated method stub
		
	}

}