package com.study.springsecurityjwt.repository;

import java.util.Optional;
import com.study.springsecurityjwt.models.Role;
import com.study.springsecurityjwt.models.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
