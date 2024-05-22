package com.example.repository;

import com.example.entity.Role;
import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findAllByOrderByFirstNameDesc(Boolean deleted);

    User findByUserNameAndIsDeleted(String userName, Boolean deleted);

    List<User> findByRoleDescriptionIgnoreCaseAndIsDeleted(String description,Boolean deleted);

}
