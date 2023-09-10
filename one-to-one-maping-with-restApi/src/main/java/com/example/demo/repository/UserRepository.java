package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value = "select * from user left join user_profile on user_profile.id=user.up_id  WHERE user.name=:name ", nativeQuery = true)
	public List<User>getUserByDevision(@Param ("name") String name);
	
}
