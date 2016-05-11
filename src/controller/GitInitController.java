package controller;

public class GitInitController implements Controller{

	@Override
	public Object execute(String command) throws Exception {
		System.out.println("git init");
		return null;
	}

}
