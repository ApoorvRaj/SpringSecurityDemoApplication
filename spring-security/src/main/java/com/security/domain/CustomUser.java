package com.security.domain;

import org.springframework.security.core.userdetails.UserDetails;

public class CustomUser extends User implements UserDetails {

	private static final long serialVersionUID = 1L;

	public CustomUser() {
	}

	public CustomUser(User user) {
		this.setUsername(user.getUsername());
		this.setId(user.getId());
		this.setAuthorities(user.getAuthorities());
		this.setPassword(user.getPassword());
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
