package cl.praxis.model;

public class Ave extends Mascota {

  public Ave() {
  }

  public Ave(String nombre, int edad, String tipo) {
    super(nombre, edad, tipo);
  }

  @Override
  public void hacerSonido() {
    System.out.printf("y el %s dijo: pio pio\n", this.getNombre());
  }

  public void volar(){
    System.out.printf("y el %s voló\n", this.getNombre());
  }
}
