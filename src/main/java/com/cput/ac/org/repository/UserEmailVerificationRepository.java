package com.cput.ac.org.repository;

import com.cput.ac.org.domain.UserEmailVerification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEmailVerificationRepository extends JpaRepository<UserEmailVerification,String>
{

}
