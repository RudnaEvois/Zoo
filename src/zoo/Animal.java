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


public class Animal {
  public String nome, cor,ambiente;
    public int comprimento, patas;
   public double velocidade;
    
    Animal (String nome, String cor, String ambiente, int comprimento, double velocidade, int patas){
    this.nome=nome;
    this.cor=cor;
    this.ambiente=ambiente;
    this.comprimento=comprimento;
    this.velocidade=velocidade;
    this.patas=patas;

}
void alteraNome(String nome){
    this.nome=nome;
}
void alteraComprimento(int comprimento){
    this.comprimento=comprimento;
}
void alteraPatas(int patas){
    this.patas=patas;
}
void alteraCor(String cor){
    this.cor=cor;
}
void alteraAmbiente(String ambiente){
    this.ambiente=ambiente;
}
void alteraVelocidade(float velocidade){
    this.velocidade=velocidade;
}

String nome( ){
    return nome;
}
int comprimento( ){
    return comprimento;
}
int patas( ){
    return patas;
}
String cor( ){
    return cor;
}
String ambiente( ){
    return ambiente;
}
double velocidade( ){
    return velocidade;
}
void dados(){
    JOptionPane.showMessageDialog(null,"Dados: \n Nome: "+this.nome+"\n Comprimento: "+this.comprimento+"cm \n Quantidade de Patas: "+this.patas+"\n Cor: "+this.cor+"\n Ambiente: "+this.ambiente+"\n Velocidade Média: "+this.velocidade+"m/s");
}
}


