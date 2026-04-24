package br.com.rpires.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TB_CARRO")
public class Carro {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="carro_seq")
    @SequenceGenerator(name="carro_seq", sequenceName="sq_carro", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "MODELO", length = 50, nullable = false)
    private String modelo;

    // Cascade ALL faz com que ao salvar o carro, a Marca seja salva automaticamente
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_marca_fk", foreignKey = @ForeignKey(name = "fk_marca_carro"), nullable = false)
    private Marca marca;

    // Cascade ALL faz com que ao salvar o carro, os Acessorios sejam salvos automaticamente
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "TB_CARRO_ACESSORIO",
            joinColumns = { @JoinColumn(name = "id_carro_fk") },
            inverseJoinColumns = { @JoinColumn(name = "id_acessorio_fk") })
    private List<Acessorio> acessorios = new ArrayList<>();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public Marca getMarca() { return marca; }
    public void setMarca(Marca marca) { this.marca = marca; }
    public List<Acessorio> getAcessorios() { return acessorios; }
    public void setAcessorios(List<Acessorio> acessorios) { this.acessorios = acessorios; }
}