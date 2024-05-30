package cl.praxis.model;

public class PerroNadador extends Perro implements Nadador {
  public PerroNadador() {
  }
  public PerroNadador(String nombre, int edad, String tipo) {
    super(nombre, edad, tipo);
  }

  @Override
  public void nadar() {
    System.out.printf("y el %s nadó\n", this.getNombre());
  }
}
