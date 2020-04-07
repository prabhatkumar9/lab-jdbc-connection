package controller;

import java.util.Properties;
import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws Exception {
		
	// Fill your code
		Properties prop;
		prop = ConnectionManager.loadPropertiesFile();
		if(prop!=null) {
		    System.out.println("Connection Established");
		}else {
		    System.out.println("check your connection");
		}
	}
}
