package br.com.primus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.primus.entity.Membro;

public interface MembroRepository extends JpaRepository<Membro, Long> {
    Membro findByMatricula(String matricula);
}
