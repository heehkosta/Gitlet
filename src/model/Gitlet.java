package model;

import front.controller.DispatcherGit;
import front.controller.DispatcherLinux;

import java.util.Scanner;

import path.Path;

public class Gitlet {
	public static void main(String[] args) {
		
		// how to? ���α׷� ���� �� .git ���� �о����
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print(Path.startPath+"> ");
			String command = sc.nextLine();
			String[] cArr = command.split(" ");
			
			if(command.equals("exit")){
				System.exit(0);
			}else if(command.equals("")){
				System.out.println("Please enter a command");
			}else if(cArr[0].equals("git")){//gitlet ��ɾ�
				DispatcherGit.getInstance().doProcess(command);
			}else if(!(cArr[0].equals("git"))){//������ ��ɾ�
				DispatcherLinux.getInstance().doProcess(command);
			}
		}//while
		
	}//main
}//GitletTest
