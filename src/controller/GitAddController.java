package controller;

public class GitAddController implements Controller{

	@Override
	public Object execute(String command) throws Exception {
		System.out.println("git add");
		return null;
	}

}
