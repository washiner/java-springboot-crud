package com.washiner.cadastro.repository;

import com.washiner.cadastro.model.CadastroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<CadastroModel, Long> {
}
