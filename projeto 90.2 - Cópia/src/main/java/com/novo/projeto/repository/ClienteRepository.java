package com.novo.projeto.repository;

import com.novo.projeto.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {
    List<ClienteEntity> findByNomeContainingIgnoreCaseOrEmailContainingIgnoreCase(String nome, String email);

}
