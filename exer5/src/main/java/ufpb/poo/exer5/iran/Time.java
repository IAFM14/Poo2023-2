package ufpb.poo.exer5.iran;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Time {
    private Map<String,Jogador > jogadores ;
    private GravadorDeDados gravador = new GravadorDeDados();

    public Time (){
        this.jogadores = new HashMap<>();
        recuperaDados();

    }

    public void recuperaDados(){
        try {
            this.jogadores = this.gravador.recuperarJogadores();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
