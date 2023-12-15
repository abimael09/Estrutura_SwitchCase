package Estrutura_SwitchCase;

import javax.swing.*;

public class Estrutura_SwitchCase{
    
    public static void main(String[] args){
        
        String nome = JOptionPane.showInputDialog("Informe seu Nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua Idade:"));
        
        switch(idade){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:{
                JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nIdade: "+idade+" anos"+"\nNão há categoria"
                        + " para Crianças abaixo de 5 anos.");
            }
            break;
            case 5:
            case 6:
            case 7:{
                JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nIdade: "+idade+" anos"+"\nCategoria: Infantil A.");
            }
            break;
            case 8:
            case 9:
            case 10:
            case 11:{
                JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nIdade: "+idade+" anos"+"\nCategoria: Infantil B.");
            }
            break;
            case 12:
            case 13:{
                JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nIdade: "+idade+" anos"+"\nCategoria: Juvenil A.");
            }
            break;
            case 14:
            case 15:
            case 16:
            case 17:{
                JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nIdade: "+idade+" anos"+"\nCategoria: Juvenil B.");
            }
            break;
            default:
                JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nIdade: "+idade+" anos"+"\nCategoria: Adultos, maiores de 18 anos.");
        }
    }
}