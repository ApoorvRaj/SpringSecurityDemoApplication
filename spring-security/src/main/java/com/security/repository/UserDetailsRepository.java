package com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.security.domain.User;

@Repository
public interface UserDetailsRepository extends JpaRepository<User,Long>{
	
	@Query("select u from User u"
			+ " left join fetch u.authorities"
			+ " where u.username = :username")
	User findByUsername(String username);
}
