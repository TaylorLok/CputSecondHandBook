package com.cput.ac.org.repository;

import com.cput.ac.org.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String>
{

}
