package com.dio.projeto01controledeponto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Empresa {
    @Id
    private long id;
    private String descricao;
    private String cpnj;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
}
