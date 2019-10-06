package com.cput.ac.org.repository;

import com.cput.ac.org.domain.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginRepository extends JpaRepository<UserLogin,String>
{

}
