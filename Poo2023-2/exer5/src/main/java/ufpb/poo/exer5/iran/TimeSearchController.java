package ufpb.poo.exer5.iran;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;


public class TimeSearchController implements ActionListener {
    private Time time;
    private JFrame janelaPrincipal;

    public TimeSearchController(Time time, JFrame janelaPrincipal){
        this.time = time;
        this.janelaPrincipal = janelaPrincipal;
    }
    public void actionPerformed(ActionEvent e){
        int cpf = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,"CPF DO JOGADOR: "));
        Collection<Jogador> jogadoresAchados = time.pesquisaJogadores(cpf);
        if(jogadoresAchados.size()>0){
            JOptionPane.showMessageDialog(janelaPrincipal,"JOGADORES ENCONTRADOS: ");

            for(Jogador j : jogadoresAchados){
                JOptionPane.showMessageDialog(janelaPrincipal,j.toString());
            }

        }else{
            JOptionPane.showMessageDialog(janelaPrincipal,"JOGADOR NÃO ENCONTRADO!");
        }
    }
}
