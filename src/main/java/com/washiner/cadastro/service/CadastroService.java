package com.washiner.cadastro.service;

import com.washiner.cadastro.model.CadastroModel;
import com.washiner.cadastro.repository.CadastroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CadastroService {

    private final CadastroRepository cadastroRepository;

    public CadastroService(CadastroRepository cadastroRepository){
        this.cadastroRepository = cadastroRepository;
    }

    public CadastroModel salvarCadastro(CadastroModel cadastroSalvo){
        return cadastroRepository.save(cadastroSalvo);
    }

    public List<CadastroModel> listarCadastros(){
        return cadastroRepository.findAll();
    }

    public Optional<CadastroModel> buscarPorId(Long id){
        return  cadastroRepository.findById(id);
    }

    public CadastroModel atualizarCadastro(Long id, CadastroModel cadastroAtual){
            cadastroAtual.setId(id);
            return cadastroRepository.save(cadastroAtual);
    }

    public void deletarCadastro(Long id){
        cadastroRepository.deleteById(id);
    }
}
