/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.UUID;

public class Arista<T> implements Identificable {
    private Vertice<T> verticeInicio;
    private Vertice<T> verticeDestino;
    private int peso;
    private UUID code;

    public Arista(Vertice<T> verticeInicio, Vertice<T> verticeDestino) {
      this.verticeInicio = verticeInicio;
      this.verticeDestino = verticeDestino;
      this.peso = 1;	
      this.code = UUID.randomUUID();
    }

    public Vertice<T> getVerticeInicio() {
	return this.verticeInicio;
    }
    
    public Vertice<T> getVerticeDestino() {
	return this.verticeDestino;
    }

    public int getPeso() {
	return this.peso;
    }

    public void setPeso(int peso) {
	this.peso = peso;
    }

    public String toString() {
	return "({" + this.verticeInicio + ", " + this.verticeDestino  + "}, "+ this.peso  +")";
    }
    
    public int hashCode() {
	return (verticeInicio.getNombre().hashCode() + verticeDestino.getNombre().hashCode());
    }

  @Override
  public UUID getUUID() {
    return code;
  }
    
}