/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ControladorMapa;


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
    map.verDijktra(c, e);
  } 
}
