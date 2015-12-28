package com.mcnc.yuga.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.mcnc.yuga.helper.security.AppUser;
import com.mcnc.yuga.helper.security.McncAuthenticationToken;
import com.mcnc.yuga.helper.security.Role;

public abstract class WebUtils {
	public static String getSessionUserId(){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Object principal = authentication.getPrincipal();
		return (String) principal;
	}
	
	public static Role getSessionUserRole(){
		McncAuthenticationToken  authentication = (McncAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
		Role role = authentication.getAppUser().getRole();
		return role;
	}
	
	public static AppUser getAppUser(){McncAuthenticationToken  authentication = (McncAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
		return authentication.getAppUser();
		
	}
}
