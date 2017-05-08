package manejador;

public class ManejadorHonorario extends Manejador{
    
    @Override
    public void handlerRequest(int opt) {
        if(opt == 3){
            System.out.println("Generando liquidacion para un docente honorario");
        }else{
            successor.handlerRequest(opt);
        }  
    }
    
}
