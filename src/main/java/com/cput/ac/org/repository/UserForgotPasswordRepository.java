package com.cput.ac.org.repository;

import com.cput.ac.org.domain.UserForgotPassword;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserForgotPasswordRepository extends JpaRepository<UserForgotPassword,String>
{

}
