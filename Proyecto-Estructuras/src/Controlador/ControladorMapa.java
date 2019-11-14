/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AlgoritmoDijkstra;
import Modelo.Arista;
import Modelo.Grafo;
import Modelo.Point;
import Modelo.Vertice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

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
    
  public Vertice<Point> agregarPunto(int x, int y) {
    Point punto = new Point(x, y);
        
    Vertice<Point> nuevo = miGrafo.insertarVertice(punto);
    System.out.println("Se agrego el vertice.");
    return nuevo;
  }
  
  //Vertice es un tipo de dato
  public void agregarArco(Vertice verticeInicio, Vertice verticeDestino) {
    miGrafo.insertarArista(verticeInicio, verticeDestino);
  }
    
  public void verCordenadas() {
     Point key = null;
      for (Map.Entry<Point, Vertice<Point>> e : miGrafo.getVerticesContenido().entrySet()) {
      key = e.getKey();
   
      System.out.println("X " + key.getX());
      System.out.println("Y " + key.getY());
      /*
      
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

  public void verDijktra(Vertice inicio, Vertice destino) {
    AlgoritmoDijkstra dijkstra = new AlgoritmoDijkstra();
    
    dijkstra.repasarLista(miGrafo, inicio, destino);


  }

}
