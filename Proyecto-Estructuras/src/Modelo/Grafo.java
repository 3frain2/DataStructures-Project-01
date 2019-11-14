/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.*;

public class Grafo<T> {
    private final LinkedHashMap<T, Nodo<T>> vertices;
    private final LinkedHashMap<Integer, Arista<T>> aristas;

    public Grafo() {
	this.vertices = new LinkedHashMap<>();
	this.aristas = new LinkedHashMap<>();
    }
    
    public Nodo<T> insertarVertice(T vertice) {
      Nodo<T> nodo = new Nodo<>(vertice);
	vertices.put(nodo.getNombre(), nodo);
	return nodo;
    }
    
    public boolean insertarArista(Nodo<T> verticeInicio, Nodo<T> verticeDestino) {
	Arista<T> arista = new Arista<>(verticeInicio, verticeDestino);
        
	aristas.put(verticeInicio.getNombre().hashCode(), arista);
	verticeInicio.insertarVecino(arista);
	verticeDestino.insertarVecino(arista);
	return true;
    }

    public Nodo getVertice(String nombre) {
	return this.vertices.get(nombre);
    }

    public Set<T> verticeKeys() {
	return this.vertices.keySet();
    }

    public Set<Arista<T>> getAristas() {
	return new HashSet<>(this.aristas.values());
    }

    public HashMap<Integer, Arista<T>> getAristasContenido() {
      return (HashMap<Integer, Arista<T>>) aristas;
    }

    public HashMap<T, Nodo<T>> getVerticesContenido() {
      return vertices;
    }
    
    
}

