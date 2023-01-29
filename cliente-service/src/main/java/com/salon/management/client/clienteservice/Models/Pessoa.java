package com.salon.management.client.clienteservice.Models;


//CLasse pai, para as demais classes que receberam a herança de pessoa.
//Nesta classe estou utilizando o DESIGNER PATTERNS BUILDER, para assim poder construir objeto fornecendo de maneira
//clara e fácil , além de permitir alter facilmente o representante
public class Pessoa {
    protected String nome;
    protected String endereco;
    protected int idade;

    public Pessoa(String nome, String endereco, int idade){
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    @Override
    public String toString(){
        return "Nome " + nome +", "+ "Endereço " + endereco + ", " + "Idade " + idade ;
    }
}


