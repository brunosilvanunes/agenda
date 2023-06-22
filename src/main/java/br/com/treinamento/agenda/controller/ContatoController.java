package br.com.treinamento.agenda.controller;

import br.com.treinamento.agenda.model.ContatoDTO;
import br.com.treinamento.agenda.service.ContatoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContatoController {
    @Autowired
    private ContatoService service;

    @GetMapping
    public ResponseEntity<List<ContatoDTO>> listar() {
        return ResponseEntity.ok(service.listarContatos());
    }

    @PostMapping
    public ResponseEntity<HttpStatus> salvar(@RequestBody ContatoDTO contatoDTO) {
        service.salvar(contatoDTO);

        return ResponseEntity.ok(HttpStatus.ACCEPTED);
    }


}
