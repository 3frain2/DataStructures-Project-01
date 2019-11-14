/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Arista;
import Modelo.Grafo;
import Modelo.Point;
import Modelo.Nodo;
import java.util.Map;
import java.util.Observable;
import java.util.UUID;

/**
 *
 * @author efrai
 */
//ComponenteConexa
public class ControladorMapa extends Observable {
  private final Grafo<Point> miGrafo; 
    
  public ControladorMapa() {
      this.miGrafo = new Grafo<>();
  }
    
  public Nodo<Point> agregarPunto(int x, int y) {
    Point punto = new Point(x, y);
        
    Nodo<Point> nuevo = miGrafo.insertarVertice(punto);
    System.out.println("Se agrego el vertice.");
    return nuevo;
  }
  
  //Vertice es un tipo de dato
  public void agregarArco(Nodo verticeInicio, Nodo verticeDestino) {
    miGrafo.insertarArista(verticeInicio, verticeDestino);
  }
    
  public void verCordenadas() {
     Point key = null;
    for (Map.Entry<Point, Nodo<Point>> e : miGrafo.getVerticesContenido().entrySet()) {
      key = e.getKey();
   
      System.out.println(miGrafo.getVerticesContenido().get(key).getVecinos().toString());
      /*
      System.out.println(key.getY());

      
      System.out.println(miGrafo.getAristasContenido().get(key));
      int w = miGrafo.getAristasContenido().get(key).getVerticeInicio().getNombre().getX();
      int x = miGrafo.getAristasContenido().get(key).getVerticeInicio().getNombre().getY();
      int y = miGrafo.getAristasContenido().get(key).getVerticeDestino().getNombre().getX();
      int z = miGrafo.getAristasContenido().get(key).getVerticeDestino().getNombre().getY();
      System.out.println("XInicio: " +   w);
      System.out.println("YInicio: " +   x);
      System.out.println("XDestino: " +   y);
      System.out.println("yDestino: " +   z);
      
      System.out.println("FIN...");*/
    }
  }
  
}
