package ufpb.poo.exer5.iran;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimeAddController implements ActionListener  {
    private Time time;
    private JFrame janelaPrincipal;

    public TimeAddController(Time time,JFrame janelaPrincipal){
        this.time = time;
        this.janelaPrincipal = janelaPrincipal;

    }
    public void actionPerformed(ActionEvent e){
        String nome = JOptionPane.showInputDialog(janelaPrincipal,"NOME DO JOGADOR: ");

        JogadorPosicao posicao = JogadorPosicao.valueOf(JOptionPane.showInputDialog(janelaPrincipal,"POSIÇÃO DO JOGADOR: \n" + " GOLEIRO , DEFENSOR , MEIO_CAMPO , ATACANTE, SEMPOSICAO"));

        int quantEstrela = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,"QUANTIDADE DE ESTRELAS: \n (!NIVEL DO JOGADOR!"));

        int cpf = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,"CPF DO JOGADOR: "));

        boolean cadastrou = time.cadastrarJogador(nome,posicao,quantEstrela,cpf);
        if(cadastrou){
            JOptionPane.showMessageDialog(janelaPrincipal,"JOGADOR CADASTRADO");


        }else{
            JOptionPane.showMessageDialog(janelaPrincipal,"JOGADOR NÃO CADASTRADO! \n"+" VERIFIQUE SE JÁ NÃO EXISTIA!");
        }

    }

}
