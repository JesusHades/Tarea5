
package ListaEnlazadaSimple;

/**
 *
 * @author manri
 */
public class Test {
  
public static void main(String[] args) throws ListaLigadaException {
  
ListaEnlazadaSimpleADT <Integer>LISTA1 = new ListaEnlazadaSimpleADT();


LISTA1.agregarfinal(3);
LISTA1.agregarfinal(5);
LISTA1.agregarfinal(6);
LISTA1.agregarfinal(7);
System.out.println("\nLista 1.0:");
LISTA1.transversal();


LISTA1.eliminarUltimoElemento();
System.out.println("\n\nLista 1.1:");
LISTA1.transversal();


LISTA1.agregarInicio(2);
LISTA1.agregarInicio(1);
System.out.println("\n\nLista 1.2:");
LISTA1.transversal();


LISTA1.agregarDespuesDe(4, 3);
LISTA1.actualizar();
System.out.println("\n\nLista 1.3:");
LISTA1.transversal();


LISTA1.eliminarPrimerElemento();
System.out.println("\n\nLista 1.4:");
LISTA1.transversal();

LISTA1.eliminarUltimoElemento();
System.out.println("\n\nLista 1.4:");
LISTA1.transversal();

LISTA1.eliminar(2);
System.out.println("\n\nLista Final:");
LISTA1.transversal();
}
    
    
    
}
