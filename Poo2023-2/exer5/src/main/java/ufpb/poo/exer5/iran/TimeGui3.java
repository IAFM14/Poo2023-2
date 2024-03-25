package ufpb.poo.exer5.iran;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TimeGui3 extends JFrame{
    JLabel linha1, linha2;
    ImageIcon jogador = new ImageIcon("./imgs/download.jfif");
    ImageIcon addImg = new ImageIcon("./imgs/icons/add_person.png");
    ImageIcon pesqImg = new ImageIcon("./imgs/icons/search_person.png");
    ImageIcon removeImg = new ImageIcon("./imgs/icons/remove_person.png");
    JButton botaoAdicionar, botaoPesquisar, botaoRemover;
   Time time= new Time();

    public TimeGui3(){
        setTitle("Agenda de Aniversários");
        setSize(800,600); //tamanho da janela
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.white);
        linha1 = new JLabel("Meus Times", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(jogador, JLabel.CENTER);
        botaoAdicionar = new JButton("Adicionar",addImg);
        botaoAdicionar.addActionListener( new TimeAddController(time, this));
        botaoPesquisar = new JButton("Pesquisar",pesqImg);
        botaoPesquisar.addActionListener( new TimeSearchController(time, this));
        botaoRemover = new JButton("Remover",removeImg);
        botaoRemover.addActionListener(new TimeRemoveController(time, this));
        getContentPane().setLayout(new GridLayout(3,2));
        getContentPane().add(linha1);
        getContentPane().add(botaoAdicionar);
        getContentPane().add(linha2);
        getContentPane().add(botaoPesquisar);
        getContentPane().add(new JLabel());
        getContentPane().add(botaoRemover);
    }
    //...
    public static void main(String [] args){
        JFrame janela = new TimeGui3();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


