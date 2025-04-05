

/**
 *
 * @author Abner
 */
public class LinkedList {
    private Nodo head;

    // Agrega un elemento al final de la lista
    public void add(int data) {
        Nodo nuevoNodo = new Nodo(data);
        if (head == null) {    //caso en donde no se tendan datos en
            head = nuevoNodo;  // la lista
            printList();
            return;
        }
        Nodo nodoTemp = head;       
        while (nodoTemp.next != null) {  // caso para agregara al final
            nodoTemp = nodoTemp.next; // se cambia hasta encontra el ultimo
        }                               //elemento de la lista
        nodoTemp.next = nuevoNodo;  // cuando se encuentra se asigna el valor
        printList();
    }

    // Agrega un elemento al incio de la lista
    public void addFirst(int data) {
        Nodo nuevoNodo = new Nodo(data);
        nuevoNodo.next = head;
        head = nuevoNodo;    // se asigna el valor 
        printList();
    }

    // Agrega un elemento en una posicion especifica
    public void addMiddle(int data, int position) {
        if (position <= 0) {    // caso en dode la posicion ingresada 
            addFirst(data);     // sea la primera
            printList();
            return;
        }

        Nodo nuevoNodo = new Nodo(data);
        Nodo nodoTemp = head;
        int contador = 0;

        while (nodoTemp != null && contador < position - 1) {
            nodoTemp = nodoTemp.next;   // se iteran los elementos hasta
            contador++;                 // encontrar la posicion
        }

        if (nodoTemp == null) { // caso en donde 
            add(data); // Si la posición es mayor al tamaño, agregar al final
        } else {
            nuevoNodo.next = nodoTemp.next;  // ase agregan los elementos
            nodoTemp.next = nuevoNodo;      //cuando este en cualquier posicion
        }
        printList();
    }

    // Elimina un valor de la lista (elimina el nodo)
    public void remove(int data) {
        if (head == null){
            System.out.println("No hay elementos en la lista ");
            return;
        }       //caso donde la lista este vacia 
            

        if (head.data == data) {    //caso en donde el dato se 
            head = head.next;       // encuentra en la primera posicion
            printList();
            return;
        }

        Nodo nodoTemp = head;  //siguiente caso
        while (nodoTemp.next != null && nodoTemp.next.data != data) { //se hacen los cambios si 
            nodoTemp = nodoTemp.next;                               //no es el elemento buscado
        }

        if (nodoTemp.next != null) {  // se elimina las conecciones para eliminar
            nodoTemp.next = nodoTemp.next.next;
        }
        printList();
    }

    // Imprime la lista de datos
    public void printList() {
        Nodo nodoTemp = head;
        System.out.print("[");
        while (nodoTemp != null) { // recorre la lista e imprime
            System.out.print(nodoTemp.data + ", ");
            nodoTemp = nodoTemp.next;
        }
        System.out.println("null]");
    }

    // Revierte el orden de la lista
    public void reverse() {
        Nodo nodoAnterior = null;  
        Nodo nodoTemp = head;  // para ir iteranndo la lista
        Nodo next;  // para no perder el siguiente elemento

        while (nodoTemp != null) {    //iteracion para los cambios
            next = nodoTemp.next;   // se hacen los cambios para cambiar el orden
            nodoTemp.next = nodoAnterior;
            nodoAnterior = nodoTemp;
            nodoTemp = next;
        }
        head = nodoAnterior;
        printList();
    }

    // Verifica si existe un valor en la lista 
    public boolean contains(int data) {
        Nodo nodoTemp = head;
        while (nodoTemp != null) {
            if (nodoTemp.data == data) 
                return true;        //encuentra el valor
            nodoTemp = nodoTemp.next; //no encuentra el valor y pasa al siguiente
        }
        return false; // caso en donde no econtro el valor 
    }
}
