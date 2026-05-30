package com.luizsoftware.apiservicos.repository;

import com.luizsoftware.apiservicos.entity.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

//Disponibilizar métodos de banco de dados ao extender para o JpaRepository
//Entidade que quero passar para o Jpa ,tipo de dado da chave primaria Long
//Utilizar queries que utilizem esse mapeamento
//Ao instanciar dessa interface vão ser inseridos na tabela
public interface AvaliacaoRepository extends JpaRepository <Avaliacao , Long>{



}
