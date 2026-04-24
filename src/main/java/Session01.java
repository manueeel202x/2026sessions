
import java.util.Scanner;
import operacion.operacion;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author F20LAB207E02
 */
public class Session01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("op1: ");
        int op1 = teclado.nextInt();
        System.out.println("op2: ");
        int op2 = teclado.nextInt();
        
        operacion operacion1 = new operacion(op1,op2);
        operacion1.printOps();
        
        System.out.println("suma: " + operacion1.sumar());
        
    }
}
