package com.learn.springsecurityjpa;

import com.learn.springsecurityjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//Optional is a container object used to contain not-null objects.
//and Optional object is used to represent null with absent value.

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUserName(String userName);

}
