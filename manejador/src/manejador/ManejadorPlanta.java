/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejador;

/**
 *
 * @author Estudiantes
 */
public class ManejadorPlanta extends Manejador{
    
    @Override
    public void handlerRequest(int opt) {
        if(opt==2){
            System.out.println("Generando liquidacion para un docente de Planta");
        }else{
            successor.handlerRequest(opt);
        }
    }
}
