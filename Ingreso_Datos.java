package proyecto1;

import java.util.*;
public class Ingreso_Datos {
    private Scanner scanner;
    
    public Ingreso_Datos(){
    this.scanner=new Scanner(System.in);
    }
    
public int imprimir(){
    System.out.println("Ingrese una de las siguientes opciones:");
    System.out.println("\n");
    System.out.println("1. Ingresar una expresion aritmetica");
    System.out.println("2. Pre-Orden");
    System.out.println("3. in-Orden");
    System.out.println("4. Post-Orden");
    System.out.println("5. Salir");
        return scanner.nextInt();
} 
    
public String Opcion1(){
    System.out.println("Ingrese una expresion aritmetica");
    scanner.nextLine();
    return scanner.nextLine();
}
   
public String validacion(String expresion){
    int cant = expresion.length();
    boolean contieneVariable = false;
    
    // Verificara si la expresión contiene alguna variable
    for(int cont = 0; cont < cant; cont++){
        char variable = expresion.charAt(cont);
        if(Character.isLetter(variable)){
            contieneVariable = true;
            break;
        }
    }    
    // Si la expresión no contiene variables, devolver la expresión original
    if(!contieneVariable) {
        return expresion;
    }
    
    // Si la expresión contiene variables, solicitar valores y reemplazar
    for(int cont = 0; cont < cant; cont++){
        char variable = expresion.charAt(cont);
        if(Character.isLetter(variable)){
            System.out.println("Favor ingrese el valor de la variable:" + variable);
            int valorVariable;
            try{
                valorVariable = scanner.nextInt();
            } catch(InputMismatchException e){
                System.out.println("El valor ingresado no es valido");
                return null;
            }
            expresion = expresion.replace(String.valueOf(variable), String.valueOf(valorVariable));
        }
    }
    return expresion;
}

public Arbol construirArbol(String expresion) {
    Arbol arbol = new Arbol();
    for (int i = 0; i < expresion.length(); i++) {
        char letra = expresion.charAt(i);
        if (!Character.isWhitespace(letra) && !arbol.existe(String.valueOf(letra))) {
            arbol.insertar(String.valueOf(letra));
        }
    }
    return arbol;
    }
}


  
