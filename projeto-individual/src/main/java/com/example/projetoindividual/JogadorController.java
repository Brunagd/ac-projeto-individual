package com.example.projetoindividual;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

   private List<CalculoPontos> listaJogador = new ArrayList<>();


    // lista todos os jogadores
    @GetMapping("/listar")
    public ResponseEntity listarJogadores(){
        if (listaJogador.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.ok(listaJogador);
    }

    // cria um novo jogador
    @PostMapping
    public ResponseEntity criarJogador(@RequestBody CalculoPontos novoJogador){
        listaJogador.add(novoJogador);
        return ResponseEntity.status(201).build();
    }


    // deleta um jogador
    @DeleteMapping("/{id}")
    public ResponseEntity excluirJogador(@PathVariable int id){
        if (listaJogador.size() >= id) {
            listaJogador.remove(id-1);
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.status(404).build();
        }

    }

    // tras os melhores jogadores com nivel >=80
    @GetMapping("/melhoresJogadores")
    public ResponseEntity getGetMelhoresJogadores() {

        List<CalculoPontos> melhoresJogadores = listaJogador.stream()
                .filter(lisJogadores -> lisJogadores.getNivel() >= 80)
                .collect(Collectors.toList());

        if (melhoresJogadores.isEmpty()) {
            return ResponseEntity.status(204).build();
        } else {
            return ResponseEntity.ok(melhoresJogadores);
        }
    }




}
