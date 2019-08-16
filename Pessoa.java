package br.com.digitalhouse.Equals;

import java.util.Objects;

public class Pessoa {

private String nome;
private  Integer RG;

    public Pessoa(String novoNome, Integer novoRG){
    nome=novoNome;
    RG=novoRG;
    }


    public String getNome() {
        return nome;
    }

    public Integer getRG() {
        return RG;
    }


//Alt = inset para gerar a tela de construtor do equal para inserir mais de um parametro
    @Override
    public boolean equals(Object outraPessoa) {
        if (this == outraPessoa) return true;
        if (outraPessoa == null || getClass() != outraPessoa.getClass()) return false;
        Pessoa pessoa = (Pessoa) outraPessoa;
        return Objects.equals(RG, pessoa.RG)
              && Objects.equals(nome, pessoa.nome);
    }

    }

