package com.philips.mvc;

public class Controller {
	private Student model; 
	private IView view; 
	
	
	public Controller(Student model, IView view) {
		this.model = model; 
		this.view = view; 
	}
	
	public void render() {
		view.render(model);
	}
}
