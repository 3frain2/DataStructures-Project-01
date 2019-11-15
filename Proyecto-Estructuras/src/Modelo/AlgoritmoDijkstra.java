/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 *
 * @author efrai
 */
public class AlgoritmoDijkstra {
  private LinkedHashMap<Point, Vertice<Point>> hashVertices;
  private LinkedHashMap<Point, List<Integer>> hashAdyacencia;
  private List<Integer> lista = new ArrayList<>();
  private int cantidadVertices;
  
  int dist[]; 
  private Set<Integer> settled; 
  private PriorityQueue<Vertice<Point>> pq; 
  private int V; // Number of vertices 
  List<List<Vertice<Point>> > adj; 
   
  
  public AlgoritmoDijkstra(int V) {
    this.hashVertices = new LinkedHashMap<>();
    this.hashAdyacencia = new LinkedHashMap<>();
    this.V = V; 
    dist = new int[V]; 
    settled = new HashSet<Integer>(); 
    pq = new PriorityQueue<Vertice<Point>>(V, new Vertice<>());  
  }
  
  
  public void dijkstra(List<List<Vertice<Point>> > adj, int point) {
      
        this.adj = adj; 
  
        for (int i = 0; i < V; i++) 
            dist[i] = Integer.MAX_VALUE; 
  
        // Add source node to the priority queue 
        pq.add(new Vertice(point, 0)); 
        
        // Distance to the source is 0 
        dist[point] = 0; 
        while (settled.size() != V) { 
          // remove the minimum distance node  
            // from the priority queue  
            int u = pq.remove().getNombre().hashCode(); 
  
            // adding the node whose distance is 
            // finalized 
            settled.add(u); 
  
            e_Neighbours(u); 
          
        }  
    }
  
  private void e_Neighbours(int u) { 
        int edgeDistance = -1; 
        int newDistance = -1; 
  
        // All the neighbors of v 
        for (int i = 0; i < adj.get(u).size(); i++) { 
            Vertice<Point> v = adj.get(u).get(i); 
  
            // If current node hasn't already been processed 
            if (!settled.contains(v.getNombre().hashCode())) { 
                edgeDistance = v.getA(); 
                newDistance = dist[u] + edgeDistance; 
  
                // If new distance is cheaper in cost 
                if (newDistance < dist[v.getNombre().hashCode()]) 
                    dist[v.getNombre().hashCode()] = newDistance; 
  
                // Add the current node to the queue 
                pq.add(new Vertice<Point>(v.getNombre(), dist[v.getNombre().hashCode()])); 
            } 
        } 
    }
  
  
  public void repasarLista(Grafo<Point> miGrafo, Vertice inicio, Vertice destino) {
    hashVertices = miGrafo.getVerticesContenido();
    cantidadVertices = hashVertices.size();
    for(int i=0; i<cantidadVertices; i++) {
      lista.add(0);
    }
    
    for (Map.Entry<Point, Vertice<Point>> e : hashVertices.entrySet()) {  
      System.out.println();
      hashAdyacencia.put(e.getKey(), lista);
    }
    
    for (Map.Entry<Point, List<Integer>> e : hashAdyacencia.entrySet()) {  
      System.out.println(e.getValue());
    }
    /*
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
            */
  }
  
}
