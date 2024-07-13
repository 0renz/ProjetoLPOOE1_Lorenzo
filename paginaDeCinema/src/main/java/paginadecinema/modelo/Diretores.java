/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package paginadecinema.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "tb_diretores")
public class Diretores implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDiretor;

    @Column(nullable = false, length = 155)
    private String nomeDirector;

    @Enumerated(EnumType.STRING)
    private TipoDiretor tipoDiretor;

    @ManyToMany(mappedBy = "diretores")
    private List<Filmes> filmes;

    public Integer getIdDiretor() {
        return idDiretor;
    }

    public void setIdDiretor(Integer idDiretor) {
        this.idDiretor = idDiretor;
    }

    public String getNomeDirector() {
        return nomeDirector;
    }

    public void setNomeDirector(String nomeDirector) {
        this.nomeDirector = nomeDirector;
    }

    public TipoDiretor getTipoDiretor() {
        return tipoDiretor;
    }

    public void setTipoDiretor(TipoDiretor tipoDiretor) {
        this.tipoDiretor = tipoDiretor;
    }

    public List<Filmes> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filmes> filmes) {
        this.filmes = filmes;
    }
}
