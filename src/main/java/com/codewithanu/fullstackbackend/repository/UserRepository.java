package com.codewithanu.fullstackbackend.repository;

import com.codewithanu.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
