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
        int menu=0;
        String nome = null, cor = null, alimento = null, caracteristica = null, ambiente = null;
        int comprimento = 0, patas = 0;
        double velocidade = 0;
        Animal zoo = new Animal("Camelo", "Amarelo", "Terra", 150, 2.0, 4);

        Mamifero mam = new Mamifero(nome, cor, alimento, ambiente, comprimento, velocidade, patas);
        Peixe peixe = new Peixe(nome, caracteristica, cor, ambiente, comprimento, velocidade, patas);
        Animal[] todos = new Animal[3];
        
        Mamifero[] mamifero = new Mamifero[10];
        Peixe[] peixes = new Peixe[10];

        todos[0] = new Mamifero("Camelo", "Amarelo", "Terra", "verde", 150, 2.0, 4);
        todos[1] = new Peixe("Tubarão", "Barbatana e cauda", "cinza", "Oceano", 300, 1.5, 0);
        todos[2] = new Mamifero("Urso do Canadá", "Vermelho", "Mel", "Terra", 180, 0.5, 4);

        int escolha1 = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer? \n 1- Consultar animal cadastrado \n 2- Cadastrar Animal \n 3- Sair "));
        switch (escolha1) {
            case 1:
                int escolha11 = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de animal deseja pesquisar? \n 1- Mamífero \n 2-Peixes \n 3- Voltar"));
                switch (escolha11) {
                    case 1:
                        String nomem = JOptionPane.showInputDialog("Digite o nome do animal: ");
                        for (int i = 0; i < 10; i++) {

                            if (nomem.equals(mamifero[i].nome())) {
                                mamifero[i].dados();
                            }

                        }

                    case 2:
                        String nomep = JOptionPane.showInputDialog("Digite o nome do animal: ");
                        for (int i = 0; i < 10; i++) {

                            if (nomep.equals(peixes[i].nome())) {
                                peixes[i].dados();
                            }
                        }
                    case 3:

                }
            case 2:
                int escolha2 = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de animal deseja cadastrar? \n 1- Mamífero \n 2-Peixes \n 3- Voltar"));
                switch (escolha2) {
                    case 1:
                      
                      int vet=1;
                      for(int i=0;i<vet;i++){
                          nome=JOptionPane.showInputDialog(null,"Digite o nome do animal: ");
                          cor=JOptionPane.showInputDialog(null,"Digite a cor do animal: ");
                          alimento=JOptionPane.showInputDialog(null,"Digite o alimento do animal: ");
                          ambiente=JOptionPane.showInputDialog(null,"Digite o ambiente do animal: ");
                          comprimento=Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do animal em cm: "));
                          patas=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de patas do animal: "));
                          velocidade=Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade media do animal em m/s: "));
                          mamifero[i]=new Mamifero(nome,cor,alimento,ambiente,comprimento,velocidade,patas);
                          String escolha21=JOptionPane.showInputDialog("Deseja cadastrar mais 1 mamifero? \n Digite Sim ou Não:");
                          if((escolha21.toUpperCase()=="SIM")||(escolha21.toUpperCase()=="S")){
                              vet++;
                          }
                              else
                              
                          menu=10;
                                  }
                    case 2:
                    case 3:

                }
            case 3:

        }

    }

}
