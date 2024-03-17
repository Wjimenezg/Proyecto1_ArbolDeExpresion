package proyecto1;


public class Nodo {
    private String dato;
    private Nodo izquierda, derecha;

public Nodo(String dato){
    this.dato=dato;
    this.izquierda=this.derecha=null;
}

    public String getDato() {
        return dato;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    
    public void imprimirDato(){
        System.out.print(this.getDato()+",");
    }
}
