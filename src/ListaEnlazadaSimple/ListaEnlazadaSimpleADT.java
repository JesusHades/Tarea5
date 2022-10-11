
package ListaEnlazadaSimple;
import java.io.IOException;
import Nodo.Nodo;


public class ListaEnlazadaSimpleADT <T>{
    
Nodo head;   
Nodo end; 
int tamanio = 0;
  

public ListaEnlazadaSimpleADT(){
   head = null;
   end = null;
           
}

 
public boolean estaVacia(){
   return (head==null)?true:false;
}


public int getTamanio() {
  return tamanio;
}
  

 public void agregarfinal(T dato){
 Nodo nuevo=new Nodo(dato,null);
 if(head==null){
 end=nuevo;
 head=end;
 }
 else{
 end.setSiguiente(nuevo);
 end=nuevo;
 actualizar();
 }
 tamanio++;

 }
 
 
public void agregarInicio(T Dato){
  if(head == null){
      head = new Nodo(Dato);
  }
  else{
    Nodo temp = head;
   
    Nodo nuevo=new Nodo(Dato);
    nuevo.setSiguiente(temp);
    head = nuevo;
    actualizar();
  }
  tamanio++;
 
 }


  public int size(){
  return tamanio;
  } 
 
  
public void agregarDespuesDe(T dato, T datoInicial) throws ListaLigadaException {
        if (head == null) {
            throw new ListaLigadaException("La lista está vacía.");
        }
        Nodo<T> actual = head;
        boolean band = false;
        while (!actual.getDato().equals(datoInicial) && !band) {
            if (actual.getSiguiente()!= null) {
                actual = actual.getSiguiente();
            } else {
                band = true;
            }

        }
        if (!band) {
            Nodo<T> nodo = new Nodo<>(dato);
            nodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nodo);
        } else {
            throw new ListaLigadaException("El nodo dado como referencia no está en la lista");
        }
        actualizar();
    }


public void eliminar(int posicion){
 if(posicion == 0){
   head = head.getSiguiente();
 }
 else{
    int contador=0;
    Nodo aux = head;
    while(contador < posicion-1){
     aux=aux.getSiguiente();
     contador++;
    }
   aux.setSiguiente(aux.getSiguiente().getSiguiente());
  }
 tamanio--;
 actualizar();
 }


 public void eliminarUltimoElemento(){
 int contador = 0;
 Nodo aux = head;
 while(contador < tamanio-2){
  aux = aux.getSiguiente();
  contador++;
 }
 aux.setSiguiente(null);
 tamanio--;
 if(tamanio==0){
     head = null;
 }
 actualizar();
 }
 
 
 public void eliminarPrimerElemento() {
  if (head != null) {
  head = head.getSiguiente();
 }
  actualizar();
 }
 
public void actualizar(){
 Nodo aux = head;
 while(aux.getSiguiente() != null){
     aux = aux.getSiguiente();
 }
 end = aux;
}

 public void transversal(){
 int cont =0;
 Nodo aux = head;
   while(cont < tamanio){
     System.out.print(aux.getDato()+"-->");
     aux=aux.getSiguiente();
     cont++;
   }
actualizar();
 }
 

 

}
