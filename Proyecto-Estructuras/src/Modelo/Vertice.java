/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.ArrayList;
import java.util.Comparator;


public class Vertice<T> implements Comparator<Vertice<T>>{
    private T nombre;
    private int a;
    private ArrayList<Arista<T>> vecindad;
    
    public Vertice() {
	this.nombre = null;
	this.vecindad = new ArrayList<Arista<T>>();
    }

    public Vertice(T nombre, int a) {
	this.nombre = nombre;
        this.a = a;
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

    public void setNombre(T nombre) {
      this.nombre = nombre;
    }

  public int getA() {
    return a;
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

  @Override
  public int compare(Vertice<T> o1, Vertice<T> o2) {
   if (o1.getA() < o2.getA()) 
            return -1; 
        if (o1.getA() > o2.getA()) 
            return 1; 
        return 0; 
  }
}
