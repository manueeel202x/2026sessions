/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacion;

/**
 *
 * @author F20LAB207E02
 */
public class operacion {
    private  int op1;
    private  int op2;
    
    //constructores
    public operacion(int a, int b){
        op1 = a;
        op2 = b;
    }
    
    public void setOp1(int op1){
        this.op1 = op1;
    }
    
    public void setOp2(int op2){
        this.op2 = op2;
    }
    
    //imprimir operadores
    public void printOps(){
        System.out.println("operador 1: " + op1);
        System.out.println("operador 2: " + op2);
    }
    
    //operaciones
    public  int sumar(){
        return op1 + op2;
    }
    
    public  int multiplicar(){
        return op1*op2;
    }
    
    public int restar(){
        return op1 - op2;
    }
    
    
}
