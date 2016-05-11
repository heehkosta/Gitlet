package notused;

public class HandlerMapping {

	private static HandlerMapping handler = new HandlerMapping();
	private HandlerMapping(){}
	public static HandlerMapping getInstance(){
		return handler;
	}

	public Controller createController(String command){
		
		Controller controller = null;
		
		if(command.equals("cd")){
			controller = new LinuxCdController();
		}else if(command.equals("ls")){
			controller = new LinuxLsController();
		}else if(command.equals("history")){
			controller = new LinuxHistoryController();
		}else{
			controller = new LinuxNotExistController();
		}
		
		return controller;
	}
	
}
