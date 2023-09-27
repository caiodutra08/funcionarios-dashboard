package com.funcionariosdash.application.data.service;

import com.funcionariosdash.application.data.entity.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FuncionariosRepository
        extends
            JpaRepository<Funcionarios, Long>,
            JpaSpecificationExecutor<Funcionarios> {

}
