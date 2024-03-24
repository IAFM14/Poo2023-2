package ufpb.poo.exer5.iran;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class TimeRemoveController {
    private Time time;
    private JFrame janelaPrincipal;

    public TimeRemoveController(Time time,JFrame janelaPrincipal){
        this.time = time;
        this.janelaPrincipal = janelaPrincipal;

    }
    public void acctionPerformed(ActionEvent e){
        int cpf = JOptionPane.showConfirmDialog(janelaPrincipal,"CPF DO JOGADOR: ");
        boolean removeu = time.removerJogador(cpf);
        if(removeu){
            JOptionPane.showInputDialog(janelaPrincipal,"JOGADOR REMOVIDO!");

        }else{
            JOptionPane.showInputDialog(janelaPrincipal,"NÃO FOI POSSIVEL REMOVER O JOGADOR!!\n VERIFIQUE SE ELE ESTÁ CADASTRADO!");
        }
    }

}
