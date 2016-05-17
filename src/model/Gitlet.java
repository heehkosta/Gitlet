package model;

import front.controller.DispatcherGit;
import front.controller.DispatcherLinux;

import java.util.Scanner;

import path.Path;

public class Gitlet {
	public static void main(String[] args) {
		
		// how to? 프로그램 실행 시 .git 정보 읽어올지
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print(Path.startPath+"> ");
			String command = sc.nextLine();
			String[] cArr = command.split(" ");
			
			if(command.equals("exit")){
				System.exit(0);
			}else if(command.equals("")){
				System.out.println("Please enter a command");
			}else if(cArr[0].equals("git")){//gitlet 명령어
				DispatcherGit.getInstance().doProcess(command);
			}else if(!(cArr[0].equals("git"))){//리눅스 명령어
				DispatcherLinux.getInstance().doProcess(command);
			}
		}//while
		
	}//main
}//GitletTest
