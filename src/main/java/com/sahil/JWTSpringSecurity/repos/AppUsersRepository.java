package com.sahil.JWTSpringSecurity.repos;

import com.sahil.JWTSpringSecurity.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUsersRepository extends JpaRepository<AppUser,Long> {

    public AppUser findByUsername(String username);

}
