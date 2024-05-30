import cl.praxis.model.*;

import java.util.ArrayList;
import java.util.List;

public class SistemaMascotas {
  static List<Mascota> lista = new ArrayList<Mascota>();

  public static void main(String[] args) {

    Perro p = new Perro("cachupin", 12, "chiguagua");
    Gato g = new Gato("runrun", 18, "siames");
    Ave a = new Ave("pollito", 2, "gallina");

    agregarMascota(p);
    agregarMascota(g);
    agregarMascota(a);

    mostrarMascotas();
    realizarAccionesMascotas();

    hablar(p);
    hablar(g);
    hablar(a);

    PerroNadador pn = new PerroNadador("nautilus", 10, "perro acuatico");
    AveNadadora an = new AveNadadora("pato", 5, "pato nadador");

    Hipopotamo h = new Hipopotamo("Julius", 24);

    nadar(pn);
    nadar(an);

    // agregarMascota(h);
    nadar(h);
  }

  static void agregarMascota(Mascota m){
    lista.add(m);
  }

  static void mostrarMascotas(){
    for (Mascota mascota : lista) {
      mascota.mostrarInfo();
    }
  }

  static void realizarAccionesMascotas(){
    for (Mascota mascota : lista) {
      if (mascota instanceof Perro){
        ((Perro) mascota).correr();
      } else if (mascota instanceof Gato) {
        ((Gato) mascota).trepar();
      } else if (mascota instanceof Ave) {
        ((Ave) mascota).volar();
      }
    }
  }


  static void hablar(Mascota mascota) {
    mascota.hacerSonido();
  }


  static void nadar(Nadador nadador){
    nadador.nadar();
  }

}