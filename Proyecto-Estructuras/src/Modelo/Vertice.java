/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.ArrayList;


public class Vertice<T> {
    private T nombre;
    private ArrayList<Arista<T>> vecindad;
    
    public Vertice (T nombre) {
	this.nombre = nombre;
	this.vecindad = new ArrayList<Arista<T>>();
    }

    public void insertarVecino(Arista<T> arista) {
	if( !this.vecindad.contains(arista))
	    this.vecindad.add(arista);
    }

    public Arista<T> getVecino(int indice) {
	return this.vecindad.get(indice);
    }

    public int getContarVecinos() {
	return this.vecindad.size();
    }

    public T getNombre() {
	return this.nombre;
    }

    public String toString() {
	return "Vertice: " + this.nombre;
    }

    public int hashCode() {
	return this.getNombre().hashCode();
    }
    
    public ArrayList<Arista> getVecinos() {
	return new ArrayList<Arista>(this.vecindad);
    }
}
