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
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(cascade= CascadeType.PERSIST)
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne(cascade= CascadeType.PERSIST)
    private Empresa empresa;
    @ManyToOne(cascade= CascadeType.PERSIST)
    private NivelAcesso nivelAcesso;
    @ManyToOne(cascade= CascadeType.PERSIST)
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;
}
