package ufpb.poo.exer5.iran;

import java.util.Collection;

public interface Times {
    boolean existeJogador(int cpf);
    boolean cadastrarJogador(String nome, JogadorPosicao posicao,int quantEstrela,int cpf);
    boolean removerJogador (int cpf);
    Collection<Jogador> pesquisaJogadores(int cpf);
}
