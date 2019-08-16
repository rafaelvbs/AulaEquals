package br.com.digitalhouse.Equals;

import java.util.Objects;

public class Coca {
private Integer tamanho;
private Double preco;

    public Coca(Integer tamanho, Double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object outraCoca) {
//        if (this == outraCoca) return true; ESSA PARTE É DESNECESSARIA
//        if (outraCoca == null || getClass() != outraCoca.getClass()) return false;
           Coca coca = (Coca) outraCoca;
        return Objects.equals(getTamanho(), coca.getTamanho()) &&//lembrar de colocar o get no lugar do parametro
                Objects.equals(getPreco(), coca.getPreco());
    }

}
