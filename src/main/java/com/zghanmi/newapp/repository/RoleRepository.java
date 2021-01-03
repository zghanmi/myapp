package com.zghanmi.newapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zghanmi.newapp.models.ERole;
import com.zghanmi.newapp.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Optional<Role> findByName(ERole name);
}
