package com.revature.training.BankingApplication.Repository;

import com.revature.training.BankingApplication.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Long> {

}