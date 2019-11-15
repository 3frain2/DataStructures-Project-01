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
import java.util.List;
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
  /*
  public void verDijktra() {
    int V = miGrafo.getVerticesContenido().size();
    AlgoritmoDijkstra dijkstra = new AlgoritmoDijkstra(v);
    int source = 0; 

    // Adjacency list representation of the  
    // connected edges 
    List<List<Vertice<Point>> > adj = new ArrayList<List<Vertice<Point>> >(); 

    // Initialize list for every node 
    for (int i = 0; i < V; i++) { 
        List<Vertice<Point>> item = new ArrayList<Vertice<Point>>(); 
        adj.add(item); 
    } 
  
    // Inputs for the DPQ graph 
    adj.get(0).add(new Vertice<Point>(1, 9)); 
    adj.get(0).add(new Vertice<Point>(2, 6)); 
    adj.get(0).add(new Vertice<Point>(3, 5)); 
    adj.get(0).add(new Vertice<Point>(4, 3)); 

    adj.get(2).add(new Vertice<Point>(1, 2)); 
    adj.get(2).add(new Vertice<Point>(3, 4)); 

    // Calculate the single source shortest path 
    AlgoritmoDijkstra dpq = new AlgoritmoDijkstra(V); 
    dpq.dijkstra(adj, source); 

    // Print the shortest path to all the nodes 
    // from the source node 
    System.out.println("The shorted path from node :"); 
    for (int i = 0; i < dpq.dist.length; i++) 
        System.out.println(source + " to " + i + " is "
                           + dpq.dist[i]); 
      } 
  } 
    
    dijkstra.repasarLista(miGrafo, inicio, destino);


  }
  */
}
