package ufpb.poo.exer5.iran;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TimeGui extends JFrame {
    public TimeGui(){
        setTitle("Agenda de Aniversários");
        setSize(400,200);
        setLocation(150, 150);
        //localização da janela na tela
        setResizable(false);
        //janela não redimensionável
        getContentPane().setBackground(Color.blue);
    }
    //...
    public static void main(String [] args){
        TimeGui janela = new TimeGui();
        janela.setVisible(true);
        WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
            public void windowClosing(WindowEvent e){

                System.exit(0);
            }
        };
        janela.addWindowListener(fechadorDeJanelaPrincipal);

    }

}
