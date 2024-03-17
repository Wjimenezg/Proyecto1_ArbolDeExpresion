    package proyecto1;

    import java.util.*;
    public class Proyecto1 {
        public static void main(String[] args) {
          Scanner entrada=new Scanner(System.in);
          Ingreso_Datos ingreso_datos = new Ingreso_Datos(); //mando a llamar la clase ingreso Datos
          Arbol arbol= new Arbol();
          boolean salir= false; // variable para finalizar 


          while(!salir){ // finalizara cuando la variable salir sea verdadera
              int opcion=ingreso_datos.imprimir(); // declare la variable opcion para acceder a la clase ingreso datos
            switch(opcion){ // elegira una de las opciones que se encuentra en el menu de la clase 
                case 1:
                    String expresion=ingreso_datos.Opcion1(); // obtiene la opcion ingresada por el usuario
                    String nuevaExpresion=ingreso_datos.validacion(expresion);
                    if(nuevaExpresion!=null){ // si la validacion es correcta hara lo siguiente
                        System.out.println("La expresion ingresada fue: " + nuevaExpresion);
                        System.out.println("-----------------------------------------------------------------------------------");
                        System.out.println("\n");
                        arbol=ingreso_datos.construirArbol(expresion);
                    }
                    break;
                case 2:
                    System.out.println("Recorrido Pre-orden");
                    arbol.preorden();
                    break;
                case 3:
                    System.out.println("Recorrido In-Orden");
                    arbol.inorden();
                    break;
                case 4:
                    System.out.println("Recorrido Post-Orden");
                    arbol.postorden();
                    break;
                case 5:
                    salir=true;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");

                }
            }

        }

    }
