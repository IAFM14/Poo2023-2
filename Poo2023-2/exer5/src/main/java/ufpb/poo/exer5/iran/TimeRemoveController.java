package ufpb.poo.exer5.iran;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimeRemoveController implements ActionListener {
    private Time time;
    private JFrame janelaPrincipal;

    public TimeRemoveController(Time time,JFrame janelaPrincipal){
        this.time = time;
        this.janelaPrincipal = janelaPrincipal;

    }
    public void actionPerformed(ActionEvent e){
        int cpf = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,"CPF DO JOGADOR: "));
        boolean removeu = time.removerJogador(cpf);
        if(removeu){
            JOptionPane.showMessageDialog(janelaPrincipal,"JOGADOR REMOVIDO!");

        }else{
            JOptionPane.showMessageDialog(janelaPrincipal,"NÃO FOI POSSIVEL REMOVER O JOGADOR!!\n VERIFIQUE SE ELE ESTÁ CADASTRADO!");
        }
    }

}
