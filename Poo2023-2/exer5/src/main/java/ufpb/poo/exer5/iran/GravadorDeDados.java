package ufpb.poo.exer5.iran;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GravadorDeDados {
    public static final String ARQUIVOS_JOGADORES = "jogadores.dat";

    public HashMap<String,Jogador> recuperarJogadores() throws IOException {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(ARQUIVOS_JOGADORES));
            return (HashMap< String , Jogador>) in.readObject();
        } catch (Exception e){
            System.out.println("Não foi possivel recuperar os dados.");
            throw new IOException("OS DADOS NÃO FORAM RECUPERADOS" + ARQUIVOS_JOGADORES);
        }finally {
            if(in != null)
                in.close();
        }

    }
    public void salvarJogadores(Map<String,Jogador> jogadores) throws IOException{
        ObjectOutputStream out = null;
        try{
            out = new ObjectOutputStream(new FileOutputStream(ARQUIVOS_JOGADORES));
            out.writeObject(jogadores);
        } catch (Exception e){
            System.out.println("Não foi possivel salvar os dados");
            throw new IOException("OS DADOS NÃO FORAM SALVOS");
        }
    }
}
