package br.com.rpires.domain;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "TB_CARRO")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Carro {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="carro_seq")
    @SequenceGenerator(name="carro_seq", sequenceName="sq_carro", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "MARCA", nullable = false, length = 50)
    private String marca;

    @Column(name = "MODELO", nullable = false, length = 50)
    private String modelo;

    @Column(name = "PLACA", nullable = false, unique = true, length = 10)
    private String placa;

    @Column(name = "COR", nullable = false, length = 20)
    private String cor;

    @Column(name = "ANO", nullable = false)
    private Integer ano;
}