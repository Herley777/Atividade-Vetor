/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Exercicio3 {
    public static void main(String[] args) {
        String[] numero = new String[50];
        
        int i;
        
        for(i=0;i<50;i++){
            numero[i]=JOptionPane.showInputDialog("Digite o " +(i+1) +"° numero: ");
        }
        
        for(i=0;i<50;i++){
            System.out.println((i+1)+"° Numero: " +numero[i]);
        }
    }
}
