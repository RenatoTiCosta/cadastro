package com.novo.projeto.repository;

import com.novo.projeto.entity.AtendimentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtendimentoRepository extends JpaRepository<AtendimentoEntity, Integer> {

    List<AtendimentoEntity> findByNomeContainingIgnoreCaseOrEmailContainingIgnoreCase(String nome, String email);


}

