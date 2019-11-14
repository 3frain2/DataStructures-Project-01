/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author efrai
 */
public class AlgoritmoDijkstra {
  private LinkedHashMap<Point, Vertice<Point>> hashVertices;
  private LinkedHashMap<Point, List<Integer>> hashAdyacencia;
  
  
  
  public AlgoritmoDijkstra() {
    this.hashVertices = new LinkedHashMap<>();
    this.hashAdyacencia = new LinkedHashMap<>();
  }
  
  public void repasarLista(Grafo<Point> miGrafo, Vertice inicio, Vertice destino) {
    hashVertices = miGrafo.getVerticesContenido();
    
    for (Map.Entry<Point, Vertice<Point>> e : hashVertices.entrySet()) {
      Point vertice = e.getKey();
      ArrayList<Arista> verticesAdyacentes = hashVertices.get(vertice).getVecinos();
      
      int InicioHashCode = vertice.hashCode();
      System.out.println("Inicio: " + InicioHashCode);
      for(int i=0; i<verticesAdyacentes.size(); i++) {
        int DestinoHashCode = verticesAdyacentes.get(i).hashCode()- vertice.hashCode();
        System.out.println("Destino: " + DestinoHashCode);
      }
      
      System.out.println("");
    }
  }
}
