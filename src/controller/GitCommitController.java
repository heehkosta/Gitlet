package controller;

public class GitCommitController implements Controller{

	@Override
	public Object execute(String command) throws Exception {
		System.out.println("git commit");
		return null;
	}

}
