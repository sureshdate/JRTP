package com.tcs.sbi;

import in.ashokit.security.PwdSecurityService;

public class UserReg {

	public static void main(String[] args) {
		PwdSecurityService pss=new PwdSecurityService();
		String encode=pss.encode("ashokit");
		System.out.println(encode);
	}
	

	
}
