package cl.praxis.model;

public class Gato extends Mascota {

  public Gato() {
  }

  public Gato(String nombre, int edad, String tipo) {
    super(nombre, edad, tipo);
  }

  @Override
  public void hacerSonido() {
    System.out.printf("y el %s dijo: miau\n", this.getNombre());
  }

  public void trepar(){
    System.out.printf("y el %s trepó\n", this.getNombre());
  }
}
