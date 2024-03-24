package ufpb.poo.exer5.iran;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class Time implements Times {
    private Map<String,Jogador > jogadores ;
    private GravadorDeDados gravador = new GravadorDeDados();

    public Time (){
        this.jogadores = new HashMap<>();
        recuperaDados();

    }
    public void salvarDados(){
        try{
            gravador.salvarJogadores(jogadores);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void recuperaDados(){
        try {
            this.jogadores = this.gravador.recuperarJogadores();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    public boolean existeJogador(int cpf){
        if (jogadores.containsKey(cpf)) {
            return true;
        }else{
            return false;
        }
    }
    public boolean cadastrarJogador(String nome, JogadorPosicao posicao,int quantEstrela,int cpf){
        if(!jogadores.containsKey(cpf)){
            this.jogadores.put(String.valueOf(cpf), new Jogador(nome,posicao,quantEstrela,cpf));
            return true;

        }else{
            return false;
        }
    }
    public boolean removerJogador(int cpf){
        if(jogadores.containsKey(cpf)){
            jogadores.remove(cpf);
           return true;
        }else{
            return false;
        }
    }
    public Collection<Jogador> pesquisaJogadores(String nome,int cpf){
        Collection<Jogador> jogadoresAchados = new ArrayList<>();
        for(Jogador j : this.jogadores.values()){
            if(j.getNome() == nome && j.getCpf() == cpf){
                jogadoresAchados.add(j);
            }
        }return jogadoresAchados;
    }
}//FIM DA CLASSE
