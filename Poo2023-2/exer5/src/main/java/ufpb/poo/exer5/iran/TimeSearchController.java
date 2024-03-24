package ufpb.poo.exer5.iran;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;


public class TimeSearchController {
    private Time time;
    private JFrame janelaPrincipal;

    public TimeSearchController(Time time, JFrame janelaPrincipal){
        this.time = time;
        this.janelaPrincipal = janelaPrincipal;
    }
    public void actionPerformed(ActionListener e){
        String nome = JOptionPane.showInputDialog(janelaPrincipal,"NOME DO JOGADOR: ");
        int cpf = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,"CPF DO JOGADOR: "));
        Collection<Jogador> jogadoresAchados = time.pesquisaJogadores(nome,cpf);
        if(jogadoresAchados.size()>0){
            JOptionPane.showInputDialog(janelaPrincipal,"JOGADORES ENCONTRADOS: ");

            for(Jogador j : jogadoresAchados){
                JOptionPane.showInputDialog(janelaPrincipal,j.toString());
            }

        }else{
            JOptionPane.showInputDialog(janelaPrincipal,"JOGADOR NÃO ENCONTRADO!");
        }
    }
}
