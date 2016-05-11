package controller;

public class HandlerMapping {

	private static HandlerMapping handler = new HandlerMapping();
	private HandlerMapping(){}
	public static HandlerMapping getInstance(){
		return handler;
	}

	public Controller createController(String command){
		
		Controller controller = null;
		
		if(command.equals("git init")){
			controller = new GitInitController();
		}else if(command.equals("git add")){
			controller = new GitAddController();
		}else if(command.equals("git status")){
			controller = new GitStatusController();
		}else if(command.equals("git commit")){
			controller = new GitCommitController();
		}else{
			controller = new GitNotExistController();
		}
		
		return controller;
	}
	
}
