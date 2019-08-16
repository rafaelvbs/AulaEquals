package br.com.digitalhouse.Equals;

public class Principal {
    public static void main(String[] args) {

       Pessoa pessoa1=new Pessoa("Joao da Silva",12345678);
       Pessoa pessoa2=new Pessoa("Maria da Silva",12345678);

       Coca coca1=new Coca(500,4.5);
       Coca coca2=new Coca(600,5.5);

        System.out.println(coca1.equals(coca2));

    }


}
