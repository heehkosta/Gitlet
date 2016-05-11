package front.controller;

import notused.Controller;
import notused.HandlerMapping;



public class DispatcherLinux {
	
	private static DispatcherLinux dispatcher = new DispatcherLinux();
	
	private DispatcherLinux(){}
	
	public static DispatcherLinux getInstance(){
		return dispatcher;
	}
	
	//
	public void doProcess(String command){
		
		Controller controller = 
				HandlerMapping.getInstance().createController(command);
		
		try {
			controller.execute(command);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
