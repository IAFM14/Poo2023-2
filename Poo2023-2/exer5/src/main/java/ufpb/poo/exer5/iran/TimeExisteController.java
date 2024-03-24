package ufpb.poo.exer5.iran;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class TimeExisteController {
    private Time time;
    private JFrame janelaPrincipal;

    public TimeExisteController(Time time,JFrame janelaPrincipal){
        this.time= time;
        this.janelaPrincipal= janelaPrincipal;
    }
    public void actionPerformed(ActionEvent e){
        int cpf = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,"CPF DO JOGADOR: "));
        boolean existe = time.existeJogador(cpf);
        if(existe){
            JOptionPane.showInputDialog(janelaPrincipal,"JOGADOR EXISTE!\n"+e.toString());
        }else{
            JOptionPane.showInputDialog(janelaPrincipal,"JOGADOR NÃO EXISTE!!");
        }
    }
}
