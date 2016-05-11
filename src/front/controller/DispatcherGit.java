package front.controller;

import controller.Controller;
import controller.HandlerMapping;

public class DispatcherGit {
	
	private static DispatcherGit dispatcher = new DispatcherGit();
	
	private DispatcherGit(){}
	
	public static DispatcherGit getInstance(){
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
