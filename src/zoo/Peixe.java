/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import javax.swing.JOptionPane;

/**
 *
 * @author 20832
 */
public class Peixe extends Animal {

    String caracteristica;

    public Peixe(String nome, String caracteristica, String cor, String ambiente, int comprimento, double velocidade, int patas) {
        super(nome, cor, ambiente, comprimento, velocidade, patas);
        this.caracteristica = caracteristica;
    }
  

    void alteraCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    String caracteristica() {
        return caracteristica;
    }

    @Override
    void dados() {
        JOptionPane.showMessageDialog(null, "Dados: \n Nome: " + this.nome + "\n Comprimento: " + this.comprimento + "\n Cor: " + this.cor + "\n Ambiente: " + this.ambiente + "\n Velocidade Média: " + this.velocidade + "\n Característica: " + this.caracteristica);
    }

}
