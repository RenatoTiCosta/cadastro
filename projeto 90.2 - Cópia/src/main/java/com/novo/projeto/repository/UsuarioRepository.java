package com.novo.projeto.repository;


import com.novo.projeto.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
    List<UsuarioEntity> findByNomeContainingIgnoreCaseOrEmailContainingIgnoreCase(String nome, String email);
}
