import java.util.ArrayList;

public class ListaNombres {
    ArrayList<String> nombres = new ArrayList<>();

    ListaNombres() {
    }

    public void añadirNombre(String nombre) {
        if (nombres.isEmpty()) {
            nombres.add(0, nombre);
        } else {
            int i = buscarPosicion(nombre);
            nombres.add(i, nombre);
            System.out.println("Nombre añadido con exito");
        }
    }

    private int buscarPosicion(String posicion) {
        for (int i = 0; i < nombres.size(); i++) {
            if (nombres.get(i).compareTo(posicion) > 0) {
                return i;
            }
        }
        return nombres.size();
    }


    public String toString() {
        String result = "Lista de nombres: ";
        for (int i = 0; i < nombres.size(); i++) {
            if (i < nombres.size() - 1) {
                result += nombres.get(i) + ", ";
            } else {
                result += nombres.get(i) + ".";
            }
        }
        return result;
    }

}
