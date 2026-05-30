package com.luizsoftware.apiservicos.entity;


import com.luizsoftware.apiservicos.enums.StatusSolicitacao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "solicitacoes_servicos")
public class SolicitacaoServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //user solicitante
    @ManyToOne
    @JoinColumn(name = "usuario_solicitante_id")
    private Usuario usuarioSolicitante;

    //Usuario prestador;
    @ManyToOne
    @JoinColumn(name = "usuario_prestador_id")
    private Usuario usuarioPrestador;

    //status
    @Enumerated(EnumType.STRING)
    private StatusSolicitacao status;

    //Campo para data que vai ser executado determinado servico
    private LocalDateTime dataRealizacao;

    @CreationTimestamp
    private LocalDateTime dataCadastro;





}
