package br.com.primus.controller;
import br.com.primus.entity.Membro;
import br.com.primus.service.MembroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/membros")
public class MembroController {

    @Autowired
    private MembroService membroService;

    @PostMapping("/cadastrar")
    public Membro cadastrarMembro(@RequestBody Membro membro) {
        return membroService.cadastrarMembro(membro);
    }

    @DeleteMapping("/deletar/{matricula}")
    public void deletarMembro(@PathVariable String matricula) {
        membroService.deletarMembro(matricula);
    }

    @GetMapping("/visualizar/{matricula}")
    public Membro visualizarMembro(@PathVariable String matricula) {
        return membroService.visualizarMembro(matricula);
    }

    @PutMapping("/atualizar")
    public Membro atualizarMembro(@RequestBody Membro membro) {
        return membroService.atualizarMembro(membro);
    }
}
