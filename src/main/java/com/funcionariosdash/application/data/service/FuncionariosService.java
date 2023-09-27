package com.funcionariosdash.application.data.service;

import com.funcionariosdash.application.data.entity.Funcionarios;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class FuncionariosService {

    private final FuncionariosRepository repository;

    public FuncionariosService(FuncionariosRepository repository) {
        this.repository = repository;
    }

    public Optional<Funcionarios> get(Long id) {
        return repository.findById(id);
    }

    public Funcionarios update(Funcionarios entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Funcionarios> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Funcionarios> list(Pageable pageable, Specification<Funcionarios> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
