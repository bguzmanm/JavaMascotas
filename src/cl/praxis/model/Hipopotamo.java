package cl.praxis.model;

import javax.sound.midi.Soundbank;

public class Hipopotamo implements Nadador {

  private String nombre;
  private int edad;

  public Hipopotamo() {
  }

  public Hipopotamo(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  @Override
  public void nadar() {
    System.out.printf("%s está nadando...", nombre);
  }
}
