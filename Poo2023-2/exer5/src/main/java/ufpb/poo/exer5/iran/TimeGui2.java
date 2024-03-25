package ufpb.poo.exer5.iran;

import javax.swing.*;
import java.awt.*;

public class TimeGui2 extends JFrame{

    JLabel linha1, linha2;
    ImageIcon jogador = new ImageIcon("./imgs/download.jfif");
    public TimeGui2(){
        setTitle("Meus Time!");
        setSize(400,400); //tamanho da janela
        setLocation(0, 0);
        setResizable(false);
        getContentPane().setBackground(Color.white);
        linha1 = new JLabel("BARCELONA", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(jogador, JLabel.CENTER);
        getContentPane().setLayout(new GridLayout(3,1));
        getContentPane().add(linha1);
        getContentPane().add(linha2);
    }
    //...
    public static void main(String [] args){
        JFrame janela = new TimeGui2();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}


