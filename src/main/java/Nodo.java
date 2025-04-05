

/**
 *
 * @author Abner
 */
public class Nodo {
    int data;   //donde se almacenará el dato (DNI)
    Nodo next;   //referencia al siguiente nodo

    Nodo(int data) {  //constructor 
        this.data = data; //almacena la informacion
        this.next = null; //apunta a null
    }
}
