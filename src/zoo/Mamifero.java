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
public class Mamifero extends Animal {
    
String alimento;
    public Mamifero(String nome,String cor,String alimento,String ambiente,int comprimento, double velocidade, int patas){
   super(nome, cor,ambiente,comprimento, velocidade, patas);
   this.alimento=alimento;
    }

void alteraAlimento(String alimento){
    this.alimento=alimento;
    
}
String alimento( ){
   return alimento; // retorna o alimento de um determinado uso;
}
    @Override
void dados( ){
     JOptionPane.showMessageDialog(null,"Dados: \n Nome: "+this.nome+"\n Comprimento: "+this.comprimento+"\n Quantidade de Patas: "+this.patas+"\n Cor: "+this.cor+"\n Ambiente: "+this.ambiente+"\n Velocidade Média: "+this.velocidade+"\n Alimento: "+this.alimento);
}
}

