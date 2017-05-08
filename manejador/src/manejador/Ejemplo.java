package manejador;

import java.util.Scanner;

public class Ejemplo {
    public void maneja() {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        
        Manejador manejadores[] = new Manejador[5];
        manejadores[4] = new ManejadorPorDefecto();
        manejadores[3] = new ManejadorCatedra();
        manejadores[2] = new ManejadorHonorario();
        manejadores[1] = new ManejadorPlanta();
        manejadores[0] = new ManejadorTemporal();
        
        for(int i=0; i<manejadores.length - 1;i++){
            manejadores[i].setSuccessor(manejadores[i+1]); ;
        }
        System.out.println("Ingrese un entero"); 
        System.out.println("1. Liquidacion Docente Temporal");
        System.out.println("2. Liquidacion Docente Planta");
        System.out.println("3. Liquidacion Docente Honorario");
        System.out.println("4. Liquidacion Docente Catedra");
 
        opt =  sc.nextInt();
        
        manejadores[0].handlerRequest(opt);
    }
    
    public static void main (String [] args) {
        Ejemplo correr = new Ejemplo();
        correr.maneja();
    }
}
