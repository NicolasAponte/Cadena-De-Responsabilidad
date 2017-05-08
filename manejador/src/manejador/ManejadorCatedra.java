package manejador;

public class ManejadorCatedra extends Manejador{
    
    @Override
    public void handlerRequest(int opt) {
        if(opt == 4){
            System.out.println("Generando liquidacion para un docente de catedra");
        }else{
            successor.handlerRequest(opt);
        }
    }    
}
