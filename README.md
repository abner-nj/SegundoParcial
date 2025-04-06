# SegundoParcial
proyecto de lista enlazada de consola en java

Clase Nodo
tiene como atributos:
int data= donde se almacenará el dato del DNI
nodo next = es el que hace referencia al siguiente nodo

tiene un constructor para ingresar el DNI 

Clase LinkedList

metodo add = Agrega un elemento al final de la list

metodo addFirst = Agrega un elemento al inicio de la lista

metodo addMiddle = Agrega un elemento en una posicion especifica

metodo remove = elimina un valor de la lista 

metodo printList = imprime los datos de la lista

metodo reverse = cambia el orden de la lista primero al ultimo y el ultimo al primero 

metodo contains = valida si un elemento se encuentra en la lista

Explicacion del Metodo reverse

la lista al inicio se encuentra asi: 

[1,2,3,4,null]
el objetivo es que al final la lista quede asi:

[4,3,2,1]

en el codigo se encuentra:

Nodo nodoAnterior = null;   -> apunta a null por que el nuevo ultimo elemento tiene que apuntar a null
nodo nodoTemp = head; -> nodo de la lista que se estara trabajando 
Nodo next; -> nodo temporal que servira para no perder al siguiente cuando se cambian las referencias 


en el ciclo:

Paso	nodoTemp	next	nodoAnterior (lo que ya está invertido)
1      	[1]	        [2]	             null                            
                                   [1] -> null
2	    [2]	        [3]	           [1] -> null
                                   [2] -> [1] -> null
3	    [3]      	null	       [2] -> [1] -> null
                                    [3] -> [2] -> [1] -> null


metodo contains 

ejemplo:

head → [1 | •] → [5 | •] → [7 | null]

valores de cada nodo 
data (iquierda del bloque)
•  apunta al siguiente
el ultimo elemento apunta a null

nodoTemp apunta al primer nodo: [1 | •]

¿1 == 5?

Avanza al siguiente nodo: [5 | •]

¿5 == 5? 

Retorna true.

Ejemplo 2: contains(7)

[1 | •] → ❌

[5 | •] → ❌

[7 | null] → si
Retorna true.