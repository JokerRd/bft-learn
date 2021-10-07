package com.bftcom.bftlearn.repository;

import com.bftcom.bftlearn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
