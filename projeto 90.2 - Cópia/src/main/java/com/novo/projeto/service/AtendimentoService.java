package com.novo.projeto.service;

import com.novo.projeto.entity.AtendimentoEntity;
import com.novo.projeto.repository.AtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtendimentoService {
    private final AtendimentoRepository atendimentoRepository;

    @Autowired
    public AtendimentoService(AtendimentoRepository atendimentoRepository) {
        this.atendimentoRepository = atendimentoRepository;

    }
    public AtendimentoEntity salvar(AtendimentoEntity atendimento) {
        return atendimentoRepository.save(atendimento);
    }
    public AtendimentoEntity buscarPoId(Integer id) {
        return atendimentoRepository.findById(id).orElse(null);
    }

    public AtendimentoRepository getAtendimentoRepository() {
        return atendimentoRepository;
    }




    public List<AtendimentoEntity> buscarPorNomeOuEmail(String query) {
        return atendimentoRepository.findByNomeContainingIgnoreCaseOrEmailContainingIgnoreCase(query, query);}

}


