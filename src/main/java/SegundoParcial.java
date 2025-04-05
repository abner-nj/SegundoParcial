
import java.util.Scanner;



/**
 *
 * @author Abner
 */
public class SegundoParcial {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();  // lista donde se almacenara los datos
        Scanner scanner = new Scanner(System.in);
        int seleccion;
        
        do {
            System.out.println("\n--- MENÚ LISTA ENLAZADA ---");
            System.out.println("1. Agregar al final");
            System.out.println("2. Agregar al inicio");
            System.out.println("3. Agregar en posición específica");
            System.out.println("4. Eliminar un valor");
            System.out.println("5. Imprimir lista");
            System.out.println("6. Revertir lista");
            System.out.println("7. Verificar si contiene un valor");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            seleccion = scanner.nextInt();

            switch (seleccion) {
                case 1:  //agregar al final
                    System.out.print("Ingresa el valor: ");
                    int dataEnd = scanner.nextInt();
                    System.out.println("");
                    list.add(dataEnd);
                    break;
                case 2:  //agregar al inicio
                    System.out.print("Ingresa el valor: ");
                    int dataStart = scanner.nextInt();
                    System.out.println("");
                    list.addFirst(dataStart);
                    break;
                case 3: //agregar en una posicion
                    System.out.print("Ingresa el valor: ");
                    int dataMid = scanner.nextInt();
                    System.out.print("Ingresa la posición: ");
                    int pos = scanner.nextInt();
                    System.out.println("");
                    list.addMiddle(dataMid, pos);
                    break;
                case 4: //eliminar un valor
                    System.out.print("Ingresa el valor a eliminar: ");
                    int removeVal = scanner.nextInt();
                    System.out.println("");
                    list.remove(removeVal);
                    break;
                case 5: // imprimir la lista
                    list.printList();
                    break;
                case 6: //revertir la lista 
                    System.out.println("");
                    list.reverse();
                    System.out.println("Lista revertida.");
                    break;
                case 7: // buscar un valor en la lista
                    System.out.print("Ingresa el valor a buscar: ");
                    int searchVal = scanner.nextInt();
                    boolean bandera = list.contains(searchVal);
                    System.out.println("");
                    System.out.println(bandera ? "El valor existe en la lista." : "El valor NO existe en la lista.");
                    break;
                case 0: // salir
                    System.out.println("");
                    System.out.println("Saliendo...");
                    break;
                default:  //ingreso de una opcion invalida 
                    System.out.println("");
                    System.out.println("Opción inválida.");
            }
        } while (seleccion != 0);

        scanner.close();
    }
}
