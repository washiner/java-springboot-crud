package com.washiner.cadastro.controller;

import com.washiner.cadastro.model.CadastroModel;
import com.washiner.cadastro.service.CadastroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    private final CadastroService cadastroService;

    public CadastroController(CadastroService cadastroService){
        this.cadastroService = cadastroService;
    }

    @PostMapping
    public CadastroModel salvarCadastro(@RequestBody CadastroModel cadastroNovo){
        return cadastroService.salvarCadastro(cadastroNovo);
    }

    @GetMapping
    public List<CadastroModel> buscarCadastros(){
        return cadastroService.listarCadastros();
    }

    @GetMapping("/{id}")
    public Optional<CadastroModel> buscarPorId(@PathVariable Long id){
        return cadastroService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public CadastroModel atualizarCadastro(@PathVariable Long id, @RequestBody CadastroModel cadastroAtual){
        return cadastroService.atualizarCadastro(id, cadastroAtual);
    }

    @DeleteMapping("/{id}")
    public void deletarCadastro(@PathVariable Long id){
        cadastroService.deletarCadastro(id);
    }

}
