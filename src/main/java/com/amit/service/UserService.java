package com.amit.service;

import com.amit.binding.LoginForm;
import com.amit.binding.SignUpForm;
import com.amit.binding.UnlockForm;

public interface UserService {
	
	public String login(LoginForm form);
	
	public boolean signUp(SignUpForm form);
	
	public boolean unlockAccount(UnlockForm form);
	
	public boolean forgotPwd(String  email);
}
