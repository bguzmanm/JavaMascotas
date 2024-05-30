package cl.praxis.model;

public class Perro extends Mascota {

  public Perro() {
  }

  public Perro(String nombre, int edad, String tipo) {
    super(nombre, edad, tipo);
  }

  @Override
  public void hacerSonido() {
    System.out.printf("y el %s dijo: wof wof\n", this.getNombre());
  }

  public void correr(){
    System.out.printf("y el %s corrió\n", this.getNombre());
  }

  @Override
  public void mostrarInfo() {
    System.out.println("Perro: {" +
            "nombre='" + getNombre() + '\'' +
            ", edad=" + getEdad() +
            ", tipo='" + getTipo() + '\'' +
            '}');
  }


}
