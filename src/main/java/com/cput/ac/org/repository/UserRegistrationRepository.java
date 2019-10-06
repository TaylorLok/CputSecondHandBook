package com.cput.ac.org.repository;

import com.cput.ac.org.domain.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRegistrationRepository extends JpaRepository<UserRegistration,String>
{

}
