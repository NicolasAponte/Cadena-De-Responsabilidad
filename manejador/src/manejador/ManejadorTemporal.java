package manejador;

public class ManejadorTemporal extends Manejador{

    @Override
    public void handlerRequest(int opt) {
        if(opt==1){
            System.out.println("Generando liquidacion para un docente temporal");
        }else{
            successor.handlerRequest(opt);
        }
    }  
}
