package manejador;

public abstract class Manejador {
    Manejador successor;
    
    public abstract void handlerRequest(int opt);

    public Manejador getSuccessor() {
        return successor;
    }

    public void setSuccessor(Manejador successor) {
        this.successor = successor;
    }
        
    
    
}
    

