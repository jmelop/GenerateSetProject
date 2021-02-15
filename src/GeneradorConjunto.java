import java.util.HashSet;

public class GeneradorConjunto {

    private String palabra;
    private HashSet<Character> conjunto;

    public GeneradorConjunto(String palabra){
        this.palabra = palabra;
        conjunto = new HashSet<>();
    }

    public GeneradorConjunto(){
    }

    public void setPalabra(String palabra){
        this.palabra = palabra;
    }

    public void obtenerConjunto(){

        for (int i = 0; i < palabra.length(); i++){
            conjunto.add(palabra.charAt(i));
        }
        System.out.println(conjunto);
    }

    public String getPalabra(){
        return palabra;
    }

    public String toString(){
        return "La plabra elejida es: " +palabra+" y el cojunto es: "+conjunto+" .";
    }


}
