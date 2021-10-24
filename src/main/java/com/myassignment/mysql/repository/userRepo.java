package com.myassignment.mysql.repository;

import com.myassignment.mysql.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<user, Long> {
}
