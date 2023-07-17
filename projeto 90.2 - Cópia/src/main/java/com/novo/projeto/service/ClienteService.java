package com.novo.projeto.service;

import com.novo.projeto.entity.ClienteEntity;
import com.novo.projeto.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteEntity salvar(ClienteEntity cliente) {
        return clienteRepository.save(cliente);
    }

    public ClienteEntity buscarPorId(Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public void excluir(Integer id) {
        clienteRepository.deleteById(id);
    }

    public List<ClienteEntity> listarTodos() {
        return clienteRepository.findAll();
    }

    public List<ClienteEntity> buscarPorNomeOuEmail(String query) {
        return clienteRepository.findByNomeContainingIgnoreCaseOrEmailContainingIgnoreCase(query, query);
    }

    public void excluirCliente(Integer id) {
        excluir(id);
    }
}
