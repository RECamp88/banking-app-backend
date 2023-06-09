package com.revature.training.BankingApplication.Repository;

import com.revature.training.BankingApplication.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {
    // being used for getting someone logged in
    Users findUserByUsernameAndPassword(String username, String password);

}
