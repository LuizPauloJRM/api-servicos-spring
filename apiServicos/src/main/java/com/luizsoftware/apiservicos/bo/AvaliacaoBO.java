package com.luizsoftware.apiservicos.bo;


import com.luizsoftware.apiservicos.entity.Avaliacao;
import com.luizsoftware.apiservicos.repository.AvaliacaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor // Adicionando construtores
public class AvaliacaoBO {
    //Injetar repository
    //Final para imutavel
    private final AvaliacaoRepository avaliacaoRepository;

    //Metodos
    //Lista de avaliacao de todos os registros findAll
    public List<Avaliacao> findAll(){
        return  avaliacaoRepository.findAll();
    }

    //Buscar por id
    private Avaliacao findAll(Long id){
        return avaliacaoRepository.findById(id).orElse(null);
    }

    //Salvar
    public Avaliacao save(Avaliacao avaliacao){
        return avaliacaoRepository.save(avaliacao);
    }

    //Delete
    public void delete(Long id){
        avaliacaoRepository.deleteById(id);
    }

}
