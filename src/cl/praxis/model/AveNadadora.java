package cl.praxis.model;

public class AveNadadora extends Ave implements Nadador {

  public AveNadadora() {
  }

  public AveNadadora(String nombre, int edad, String tipo) {
    super(nombre, edad, tipo);
  }

  @Override
  public void nadar() {
    System.out.printf("y el %s nadó\n", this.getNombre());
  }
}
