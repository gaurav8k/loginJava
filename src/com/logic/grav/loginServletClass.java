package com.logic.grav;

public class loginServletClass {
	public boolean authenticate(String uname, String pwd){
		if(pwd == "" || uname == ""){
			return false;
		}
		return true;
	}
}
