package com.dio.projeto01controledeponto.model;

import lombok.*;
import org.hibernate.annotations.Any;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Audited
@Entity
public class Calendario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(cascade= CascadeType.PERSIST)
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}
