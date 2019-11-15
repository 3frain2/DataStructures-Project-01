/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.awt.Graphics2D;
/**
 *
 * @author efrai
 */

public interface Personaje {
  
  double getX();
  double getY();
  int getR();
  boolean isDead();
  void hit();
  void update();
  abstract void draw(Graphics2D g);
  
}
