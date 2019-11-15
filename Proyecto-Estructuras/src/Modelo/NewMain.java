/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ControladorMapa;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author efrai
 */
public class NewMain {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    ControladorMapa map = new ControladorMapa();
    
    Vertice<Point> a = map.agregarPunto(0, 10);
    Vertice<Point> b = map.agregarPunto(20, 30);
    Vertice<Point> c = map.agregarPunto(40, 50);
    Vertice<Point> d = map.agregarPunto(60, 70);
    Vertice<Point> e = map.agregarPunto(80, 90);
    
    
    map.agregarArco(a, d);
    map.agregarArco(c, b);
    map.agregarArco(a, b);
    
    //map.verCordenadas();
    //map.verDijktra(c, e);
    
        int V = 5; 
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
        adj.get(0).add(new Vertice<Point>(a.getNombre(), 9)); 
        adj.get(0).add(new Vertice<Point>(b.getNombre(), 6)); 
        adj.get(0).add(new Vertice<Point>(c.getNombre(), 5)); 
        adj.get(0).add(new Vertice<Point>(d.getNombre(), 3)); 
  
        adj.get(2).add(new Vertice<Point>(a.getNombre(), 2)); 
        adj.get(2).add(new Vertice<Point>(c.getNombre(), 4)); 
  
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

