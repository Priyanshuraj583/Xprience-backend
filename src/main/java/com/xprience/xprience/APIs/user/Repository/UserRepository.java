package com.xprience.xprience.APIs.user.Repository;


import com.fasterxml.jackson.core.JsonParseException;
import com.xprience.xprience.APIs.user.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {
}
