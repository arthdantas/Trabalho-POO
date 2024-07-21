package br.com.primus.service;

import br.com.primus.entity.Membro;
import br.com.primus.repository.MembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembroService {

    @Autowired
    private MembroRepository membroRepository;

    public Membro cadastrarMembro(Membro membro) {
        return membroRepository.save(membro);
    }

    public void deletarMembro(String matricula) {
        Membro membro = membroRepository.findByMatricula(matricula);
        if (membro != null) {
            membroRepository.delete(membro);
        }
    }

    public Membro visualizarMembro(String matricula) {
        return membroRepository.findByMatricula(matricula);
    }

    public Membro atualizarMembro(Membro membro) {
        return membroRepository.save(membro);
    }
}
