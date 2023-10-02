package com.geekster.UserManagement.repo;

import com.geekster.UserManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
}
