package com.cput.ac.org.repository;

import com.cput.ac.org.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount,String>
{

}
