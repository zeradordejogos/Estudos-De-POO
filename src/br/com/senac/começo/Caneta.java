package br.com.senac.começo;

/**
 *
 * @author Victor
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    public void status(){
        System.out.println("Modelo Desta Caneta: " + this.modelo);
        System.out.println("Tamanho da Ponta " + this.ponta);
        System.out.println("qual a porcentagem de carga " + this.carga + "%");
        System.out.println("Uma Caneta " + this.cor);
        System.out.println("Esta Tampada? " + this.tampada);
    }
        
   public void rabiscar(){
       if (tampada == true) {
           
           System.out.println("ERRO IMPOSSIVEL DE ESCREVER DESTAMPEA PRIMEIRO");
           
       } else {
           System.out.println("Estou escrevendo");
       }
   
    }
   public void tampar(){
       this.tampada = true;
   }
   public void destampar(){
       this.tampada = false;
   }          
}
