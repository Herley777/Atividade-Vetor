
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Exercicio2 {
      public static void main(String[] args) {
        String[] nomes = new String[15];
        
        int i;
        
        for(i=0;i<15;i++){
            nomes[i]=JOptionPane.showInputDialog("Digite o " +(i+1) +"° nome: ");
        }
        
        for(i=14;i>=0;i--){
            System.out.println((i+1)+"° nome: " +nomes[i]);
        }
      }
}
