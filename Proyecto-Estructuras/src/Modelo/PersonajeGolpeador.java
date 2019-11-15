/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author efrai
 */
public class PersonajeGolpeador implements Personaje {
  private double x;
  private double y;
  private int r;

  private double dx;
  private double dy;
  private double rad;
  
  
  private int hp;
  private int ataque;
  private double speed;
  
  private BufferedImage enemigoImagen;

  private boolean ready;
  private boolean dead;
    
  public PersonajeGolpeador() throws IOException {
    
    r = 40;
    hp = 100;
    ataque = 20;
    speed = 1;
    enemigoImagen = ImageIO.read(new File("src/Imagenes/Enemigo/Salyut.png"));
    
    double angle = Math.random() * 140 + 20;
    rad = Math.toRadians(angle);
    
    dx = Math.cos(rad) * speed;
    dy = Math.sin(rad) * speed;
  }

  @Override
  public double getX() {
    return x;
  }

  @Override
  public double getY() {
    return y;
  }

  @Override
  public int getR() {
    return r;
  }

  @Override
  public boolean isDead() {
    return dead;
  }
  
  @Override
  public void hit() {
    hp--;
    if(hp <= 0) {
      dead = true;
    }
  }

  @Override
  public void update() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void draw(Graphics2D g) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
