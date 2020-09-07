package com.example.projetoindividual;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

   private List<Jogador> listaJogador = new ArrayList<>();


    // lista todos os jogadores

    public void adiconaFree(@RequestBody JogadorFree jogadorFree){
        listaJogador.add(jogadorFree);
    }

    public void adiconaPremium(@RequestBody JogadorPremium jogadorPremium){
        listaJogador.add(jogadorPremium);
    }



    @GetMapping("/listar")
    public ResponseEntity listarJogadores(){
        if (listaJogador.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.ok(listaJogador);
    }


    // cria um novo jogador
    @PostMapping("/free")
    public ResponseEntity criarJogadorFree(@RequestBody JogadorFree jogadorFree){
           listaJogador.add(jogadorFree);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/premium")
    public ResponseEntity criarJogadorPremium(@RequestBody JogadorPremium jogadorPremium){
        listaJogador.add(jogadorPremium);
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

        List<Jogador> melhoresJogadores = listaJogador.stream()
                .filter(lisJogadores -> lisJogadores.getNivel() >= 80)
                .collect(Collectors.toList());

        if (melhoresJogadores.isEmpty()) {
            return ResponseEntity.status(204).build();
        } else {
            return ResponseEntity.ok(melhoresJogadores);
        }
    }




}
