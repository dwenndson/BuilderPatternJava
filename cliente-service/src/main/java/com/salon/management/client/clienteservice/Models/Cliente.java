package com.salon.management.client.clienteservice.Models;

import java.util.List;

import com.salon.management.client.clienteservice.Models.EnumModels.TipoPagamento;


public class Cliente extends Pessoa{
    private int contato;
    private int ddd;
    private List<String> historico ;
    private TipoPagamento tipoPagamento;
 
    private Cliente(int contato, int ddd, List<String> historico,
    TipoPagamento tipoPagamento, String nome, String endereco, int idade) {
        super(nome, endereco, idade);
        this.contato = contato;
        this.ddd = ddd;
        this.historico = historico;
        this.tipoPagamento = tipoPagamento;
    }

    public static class ClienteBuilder {
        private int contato;
        private int ddd;
        private List<String> historico;
        private TipoPagamento tipoPagamento;
        private Pessoa pessoa;

        public ClienteBuilder(){
        }

        public ClienteBuilder contato(int contato){
            this.contato = contato;
            return this;
        }

        public ClienteBuilder ddd(int ddd){
            this.ddd = ddd;
            return this;
        }

        public ClienteBuilder historico(List<String> historico){
            this.historico = historico;
            return this;
        }

        public ClienteBuilder tipoPagamento(TipoPagamento tipoPagamento){
            this.tipoPagamento = tipoPagamento;
            return this;
        }

        public ClienteBuilder pessoa(Pessoa pessoa){
            this.pessoa = new Pessoa(pessoa.nome, pessoa.endereco, pessoa.idade);
            return this;
        }

        public static ClienteBuilder build() {
            return new ClienteBuilder();
        }

        @Override
        public String toString() {
        return "ClienteBuilder{" +
            "contato=" + contato +
            ", ddd=" + ddd +
            ", historico=" + historico +
            ", tipoPagamento=" + tipoPagamento +
            ", pessoa=" + pessoa +
            '}';
        }

    }
}
