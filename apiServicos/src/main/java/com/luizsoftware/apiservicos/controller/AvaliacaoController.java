package com.luizsoftware.apiservicos.controller;


import com.luizsoftware.apiservicos.bo.AvaliacaoBO;
import com.luizsoftware.apiservicos.entity.Avaliacao;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")//Porta de entrada desta class
@RequiredArgsConstructor //Força criação de construtores
public class AvaliacaoController {


    //injetando o service
    private final AvaliacaoBO avaliacaoBO;

    //Informacoes paginacao
    //Controle HTTP status 200, 400...
    @GetMapping//Receber uma requisicao em / avaliacoes redireciona para ca retornado essas informacoes para quem solicitou
    public ResponseEntity<List<Avaliacao>> findAll(){
        return ResponseEntity.ok(avaliacaoBO.findAll());
    }

    //Jogando um valor para variavel
    @GetMapping("/{id}")
    public ResponseEntity<Avaliacao> findById(@PathVariable Long id){
        return ResponseEntity.ok(avaliacaoBO.findById(id));
    }

    //Created 201 -> Sucesso , criação de novo recurso
    //Request body json -> requisição convertido para objeto avaliacao
    //No body recebo o dado que foi salvo no avaliacao BO Service
    //Retornando um CREATED
    @PostMapping
    public ResponseEntity<Avaliacao> save(@RequestBody Avaliacao avaliacao){
        return ResponseEntity.status(HttpStatus.CREATED).body(avaliacaoBO.save(avaliacao));
    }

    //Deletar um registro
    /*
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        avaliacaoBO.delete(id);
        return ResponseEntity.noContent().build();
    }*/
    
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        avaliacaoBO.delete(id);
    }


}
