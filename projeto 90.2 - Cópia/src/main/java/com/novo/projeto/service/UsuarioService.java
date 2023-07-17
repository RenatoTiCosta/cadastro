package com.novo.projeto.service;

import com.novo.projeto.entity.UsuarioEntity;
import com.novo.projeto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioEntity salvar(UsuarioEntity usuario) {
        return usuarioRepository.save(usuario);
    }

    public UsuarioEntity buscarId(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public void excluir(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public List<UsuarioEntity> listarTodosUser() {
        return usuarioRepository.findAll();
    }


    public List<UsuarioEntity> buscarPorNomeOuEmail(String query) {
        return usuarioRepository.findByNomeContainingIgnoreCaseOrEmailContainingIgnoreCase(query, query);
    }
}

