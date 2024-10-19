/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Exercicio1 {
    public static void main(String[] args) {
        String[] nomes = new String[15];
        
        int i;
        
        for(i=0;i<15;i++){
            nomes[i]=JOptionPane.showInputDialog("Digite o " +(i+1) +"° nome: ");
        }
        
        for(i=0;i<15;i++){
            System.out.println((i+1)+"° nome: " +nomes[i]);
        }
    }
}
