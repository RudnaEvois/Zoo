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
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome=null,cor=null,alimento=null,caracteristica=null, ambiente=null;
        int comprimento=0, patas=0;
        double velocidade=0;
        Animal zoo=new Animal("Camelo","Amarelo","Terra",150,2.0,4);
              
        Mamifero mam=new Mamifero(nome,cor,alimento,ambiente,comprimento,velocidade,patas);
        Peixe peixe=new Peixe(nome,caracteristica,cor, ambiente,comprimento,velocidade,patas);
        Animal[] todos=new Animal[100];
       
     todos[0]=new Mamifero("Camelo","Amarelo","Terra","verde",150,2.0,4);
     todos[1]=new Peixe("Tubarão","Barbatana e cauda","cinza","Oceano",300,1.5,0);   
     
     todos[1].dados();
      
        
        
    
   
    }


  

    

    
    
}
