package com.dio.projeto01controledeponto.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Audited
public class BancoHoras {

    @EmbeddedId
    @Id
    private BancoHorasId id;
    private LocalDateTime data;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;
}
