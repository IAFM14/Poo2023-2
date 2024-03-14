package ufpb.poo.exer5.iran;

import java.util.Objects;

public class Jogador {
    private String nome;

    private JogadorPosicao posicao;

    private int quantEstrela;

    private int cpf;

    public Jogador(String nome, JogadorPosicao posicao, int quantEstrela, int cpf){
        this.nome = nome;
        this.posicao = posicao;
        this.quantEstrela = quantEstrela;
        this.cpf = cpf;
    }
    public Jogador (){
        this("",JogadorPosicao.SEMPOSICAO,0,0);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jogador jogador = (Jogador) o;

        return cpf == jogador.cpf;
    }

    @Override
    public int hashCode() {
        return cpf;
    }

    public int getCpf (){
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;

    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public JogadorPosicao getPosicao(){
        return posicao;
    }
    public void setPosicao(JogadorPosicao posicao){
        this.posicao = posicao;
    }
    public int getQuantEstrela(){
        return quantEstrela;
    }
    public void setQuantEstrela(int quantEstrela){
        this.quantEstrela = quantEstrela;
    }

    @Override
    public String toString() {
        return "-" + this.nome + "\n" + "-" + this.cpf + "\n" + "-" + this.posicao + "\n" + "-" + this.quantEstrela;
    }
}
