package com.luizsoftware.apiservicos.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "avaliacoes", schema = "apiservicos")
public class Avaliacao {
    //Terminou o servico vai ser aberto para usuario avaliar
    //data , comentario , e user que vai avaliar

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Servico solicitado que foi concluido para avaliacao
    @ManyToOne
    @JoinColumn(name = "solicitacao_servico_id")
    private SolicitacaoServico solicitacaoServico;

    @ManyToOne
    @JoinColumn(name = "usuario_avaliador_id")
    private Usuario usuario_avaliador;

    private Integer nota;
    private String comentarioAvaliacao;









}
