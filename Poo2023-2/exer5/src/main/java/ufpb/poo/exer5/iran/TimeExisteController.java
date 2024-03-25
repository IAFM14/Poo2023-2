package ufpb.poo.exer5.iran;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimeExisteController implements ActionListener {
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
            JOptionPane.showMessageDialog(janelaPrincipal,"JOGADOR EXISTE!\n"+e.toString());
        }else{
            JOptionPane.showMessageDialog(janelaPrincipal,"JOGADOR NÃO EXISTE!!");
        }
    }
}
