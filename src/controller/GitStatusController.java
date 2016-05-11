package controller;

public class GitStatusController implements Controller{

	@Override
	public Object execute(String command) throws Exception {
		System.out.println("git status");
		return null;
	}

}
