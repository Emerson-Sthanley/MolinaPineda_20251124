/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MolinaPineda_20251124;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GrafoRecursivo grafo = new GrafoRecursivo(4);
        
        grafo.insertarNodo('A');//Indice 0
        grafo.insertarNodo('B');//Indice 1
        grafo.insertarNodo('C');//Indice 2
        grafo.insertarNodo('D');//Indice 3
        
        grafo.conectar(0, 1);//ARRISTA (A,B)
        grafo.conectar(0, 2);//ARRISTA (A,C)
        grafo.conectar(1, 3);//ARRISTA (B,D)
        grafo.conectar(2, 3);//ARRISTA (C,D)
        
        System.out.println("Recorrido Depth First Search (DFS) desde el nodo A");
        grafo.dfs(0);
        //TEORICAMENTE EL RECORIDO ES:
        //VISITA NODO A
        //LUEGO VISITA NODO B (SERIA EL PRIMER ADYACENTE DE A)
        //LUEGO VISITA D (QUE SERIA EL ADYACENTE DE B)
        //LUEGO RETROCEDE (VUELVE A LA RAÍZ) Y VISITA C (QUE SERIA EL ADYACENTE DE NO VISITADO DE A)
    }
    
}
