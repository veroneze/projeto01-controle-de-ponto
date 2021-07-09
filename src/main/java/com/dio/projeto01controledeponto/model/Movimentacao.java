package com.dio.projeto01controledeponto.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Audited
public class Movimentacao {

    @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne(cascade= CascadeType.PERSIST)
    private Ocorrencia ocorrencia;
    @ManyToOne(cascade= CascadeType.PERSIST)
    private Calendario calendario;
}
