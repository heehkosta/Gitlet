package controller;

public class GitNotExistController implements Controller{

	@Override
	public Object execute(String command) throws Exception {
		String[] cArr = command.split(" ");
		
		System.out.println("git '"+cArr[1]+"' is not a git command."
				+ " See 'git --help'");
		return null;
	}

}
