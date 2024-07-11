/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c.atividadederevisao;

/**
 *
 * @author carlo
 */
public class fila {
    private DadosCaminhoneiro[] fila;
    private int enqueue;
    private int dequeue;
    private int qtd;
    
    
    
    public fila(){
        fila = new DadosCaminhoneiro[10];
        enqueue = 0;
        dequeue = 0;
        qtd = 0;
    }
    
    public boolean isFull(){
        if(qtd == 10){
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean isEmpty(){
        if(qtd == 0){
            return true;
        }else{
            return false;
        }
        
    }
    
    public void enqueue(DadosCaminhoneiro caminhoneiro){
        if(isFull()){
            System.out.println("A fila esta creia");
            
        }else{
            fila[enqueue] = caminhoneiro;
            enqueue = (enqueue + 1) % fila.length;
            qtd++;
        }
    }
    
    
    public DadosCaminhoneiro dequeue() {
        if (isEmpty()) {
            System.out.println("A fila esta vazia");
            return null;
        } else {
            DadosCaminhoneiro caminhoneiro = fila[dequeue];
            dequeue = (dequeue + 1) % fila.length;
            qtd--;
            return caminhoneiro;
        }
    }
        
 
}
