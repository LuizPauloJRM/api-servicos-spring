package com.luizsoftware.apiservicos.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "servicos_oferecidos")
public class ServicoOferecido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //id usuario , id servico , valor , desc , ativo , datas
    private Long id;

    private String descricao;
    private String nome;
    private BigDecimal valor;

    //Column para nomear a coluna no banco de dados
    //Servico prestado
    //Indicar o usuario que prestar esse servico
    //Varios servicos dentro da tabela
    //LAZY : Ler o atributo somente na hora
    //Relacionamento "join" : Coluna de relacionamento dentro dessa entidade servico
    @ManyToOne
    @JoinColumn(name = "servico_id")
    private Servico servico;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;


    private Boolean ativo;


    //Criação e atualização : Automaticamente
    @CreationTimestamp
    private LocalDateTime dataCadastro;

    @UpdateTimestamp
    private LocalDateTime dataAtualizacao;





}
