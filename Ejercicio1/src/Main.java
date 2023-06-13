import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos a realizar una suma de 3 digitos! ");
        System.out.println(suma3(5,7,2));

        Coche auto = new Coche();
        System.out.println("Ahora tenemos una funcion coche con la siguiente cantidad de puertas: "+ auto.puertas);
        for(int q=0; q<5; q++){
            auto.añadirPuerta();
        }
        System.out.println("Pero si le aplicamos un ciclo for 5 veces tendremos la siguiente cantida de puertas: "+auto.puertas );
        System.out.println("Como nos hemos excedido de puertas, mandamos a traer la funcion quitar puerta una sola vez");
        auto.quitarPuerta();
        System.out.println("Ahora si nos quedan solamente: "+auto.puertas+ " puertas");
    }
//Primera parte
    public static int suma3(int x, int y, int z){

        return x+y+z;
    }
}

//Segunda Parte
class Coche{
   public int puertas = 0;
   public void añadirPuerta(){
       this.puertas++;
    }
    public void quitarPuerta(){
       this.puertas--;
    }
}