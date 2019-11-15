/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.*;

public class Grafo<T> {
    private final LinkedHashMap<T, Vertice<T>> vertices;
    private final LinkedHashMap<Integer, Arista<T>> aristas;

    public Grafo() {
	this.vertices = new LinkedHashMap<>();
	this.aristas = new LinkedHashMap<>();
    }
    
    public Vertice<T> insertarVertice(T vertice) {
      Vertice<T> nodo = new Vertice<>();
      nodo.setNombre(vertice);
	vertices.put(nodo.getNombre(), nodo);
	return nodo;
    }
    
    public boolean insertarArista(Vertice<T> verticeInicio, Vertice<T> verticeDestino) {
	Arista<T> arista = new Arista<>(verticeInicio, verticeDestino);
        
	aristas.put(arista.hashCode(), arista);
	verticeInicio.insertarVecino(arista);
	verticeDestino.insertarVecino(arista);
	return true;
    }

    public Vertice getVertice(String nombre) {
	return this.vertices.get(nombre);
    }

    public Set<T> verticeKeys() {
	return this.vertices.keySet();
    }

    public Set<Arista<T>> getAristas() {
	return new HashSet<>(this.aristas.values());
    }

    public LinkedHashMap<Integer, Arista<T>> getAristasContenido() {
      return (LinkedHashMap<Integer, Arista<T>>) aristas;
    }

    public LinkedHashMap<T, Vertice<T>> getVerticesContenido() {
      return vertices;
    }
    
    
}

