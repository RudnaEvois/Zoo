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
        int menu = 0;
        boolean z=true;
        String nome = null, cor = null, alimento = null, caracteristica = null, ambiente = null;
        int comprimento = 0, patas = 0;
        double velocidade = 0;
        Animal zoo = new Animal("Camelo", "Amarelo", "Terra", 150, 2.0, 4);

        Mamifero mam = new Mamifero(nome, cor, alimento, ambiente, comprimento, velocidade, patas);
        Peixe peixe = new Peixe(nome, caracteristica, cor, ambiente, comprimento, velocidade, patas);
        Animal[] todos = new Animal[3];

        Mamifero[] mamifero = new Mamifero[12];
        Peixe[] peixes = new Peixe[11];

        mamifero[0] = new Mamifero("Camelo", "Amarelo", "Terra", "verde", 150, 2.0, 4);
        peixes[0] = new Peixe("Tubarão", "Barbatana e cauda", "cinza", "Oceano", 300, 1.5, 0);
        mamifero[1] = new Mamifero("Urso do Canadá", "Vermelho", "Mel", "Terra", 180, 0.5, 4);
        while (menu == 0) {

            int escolha = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer? \n 1- Consultar animal cadastrado \n 2- Cadastrar Animal \n 3- Sair "));

            switch (escolha) {
                case 1:
                    menu = 1; //pesquisar
                    break;
                case 2:
                    menu = 2;//cadastrar
                    break;
                case 3: //sair
                    menu = 10;
                    break;
            }
            while (menu == 1) {
                int escolha11 = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de animal deseja pesquisar? \n 1- Mamífero \n 2-Peixes \n 3- Voltar \n 4- Sair"));
                switch (escolha11) {
                    case 1:
                        menu=3;
                        while(menu==3){
                        String nomem = JOptionPane.showInputDialog("Digite o nome do animal: ");
                        
                        
int j=1;
                        for (int i = 0; i < j; i++) {
                            System.out.println(mamifero[i].nome());


                            if (nomem.toUpperCase().equals(mamifero[i].nome().toUpperCase())) {
                                mamifero[i].dados();
                                z=false;
                                j=1;
                                
                                                       }else
                                j++;
                        }
                       int escolha12=Integer.parseInt(JOptionPane.showInputDialog("Deseja pesquisar outro mamífero? \n 1- SIM \n 2- NÃO"));
                       switch(escolha12){
                           case 1:
                               menu=3;
                               break;
                           case 2:
                               menu=0;
                               break;
                       }
                           
                            


                   
                       
                        }
                    case 2:
                        String nomep = JOptionPane.showInputDialog("Digite o nome do animal: ");
                        for (int i = 0; i < 11; i++) {

                            if (nomep.toUpperCase().equals(peixes[i].nome().toUpperCase())) {
                                peixes[i].dados();
                            }
                        }
                        break;
                    case 3:
                        menu = 0;
                        break;
                    case 4:
                        menu = 10;
                        break;
                }
            }

            while (menu == 2) {
                int escolha2 = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de animal deseja cadastrar? \n 1- Mamífero \n 2-Peixes \n 3- Voltar \n 4- Sair"));
                switch (escolha2) {
                    case 1:

                        int vetm = 3;
                        for (int i = 2; i < vetm; i++) {

                            nome = JOptionPane.showInputDialog(null, "Digite o nome do animal: ");
                            cor = JOptionPane.showInputDialog(null, "Digite a cor do animal: ");
                            alimento = JOptionPane.showInputDialog(null, "Digite o alimento do animal: ");
                            ambiente = JOptionPane.showInputDialog(null, "Digite o ambiente do animal: ");
                            comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do animal em cm: "));
                            patas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de patas do animal: "));
                            velocidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade media do animal em m/s: "));
                            mamifero[i] = new Mamifero(nome, cor, alimento, ambiente, comprimento, velocidade, patas);
                            String escolha21 = JOptionPane.showInputDialog("Deseja cadastrar mais 1 mamifero? \n Digite Sim ou Não:");
                            if (("SIM".equals(escolha21.toUpperCase())) || ("S".equals(escolha21.toUpperCase()))) {
                                vetm++;

                            }
                        }
                        break;

                    case 2:
                        int vetp = 2;
                        for (int i = 1; i < vetp; i++) {

                            nome = JOptionPane.showInputDialog(null, "Digite o nome do animal: ");
                            cor = JOptionPane.showInputDialog(null, "Digite a cor do animal: ");
                            caracteristica = JOptionPane.showInputDialog(null, "Digite o alimento do animal: ");
                            ambiente = JOptionPane.showInputDialog(null, "Digite o ambiente do animal: ");
                            comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do animal em cm: "));
                            velocidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade media do animal em m/s: "));
                            peixes[i] = new Peixe(nome, caracteristica, cor, ambiente, comprimento, velocidade, 0);
                            String escolha22 = JOptionPane.showInputDialog("Deseja cadastrar mais 1 peixe? \n Digite Sim ou Não:");
                            if (("SIM".equals(escolha22.toUpperCase())) || ("S".equals(escolha22.toUpperCase()))) {
                                vetp++;

                            }
                        }
                        break;
                    case 3:
                        menu = 0;
                        break;
                    case 4:
                        menu = 10;

                }

            }

        }

    }
}
