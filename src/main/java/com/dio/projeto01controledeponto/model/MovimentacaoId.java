package com.dio.projeto01controledeponto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class MovimentacaoId implements Serializable {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idMovimentacao;
    private long idUsuario;
}