
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alanm
 */
public class Numeros {
   //Atributos - getters e setters - Metodos
  
   //Atributos
   private int numero;
   
   //getters e setters  (metodos de acesso)

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
   
    //Metodos     (cria as ações)
    //sem retorno
    public void DescobrirNumero(){
        if (this.numero % 2 == 0){
            JOptionPane.showMessageDialog(null,"Numero PAR");
        }
        else{
            JOptionPane.showMessageDialog(null,"Numero ìmpar");
        }
    }
    
        
    // Com retorno

    
    public String DescobrirNumeroComRetorno(){
        
        String mensagem;
        
       if (this.numero % 2 == 0){
           mensagem = "O Número é PAR";
           
    }
    
    else {
           mensagem = "O Número é ÍMPAR";
       }
       return mensagem;
    }
}
