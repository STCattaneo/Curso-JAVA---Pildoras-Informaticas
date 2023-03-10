import java.util.*;
import javax.swing.*;

public class Condicionales4_switch {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);

        System.out.println("Elige de que figura quieres saber su superficie: \n1: Cuadrado \n2: Rectangulo \n3: Triángulo \n4: Circulo");

        int figura=entrada.nextInt();

        switch (figura){

            case 1:

                int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del lado"));
                
                System.out.println("La superficie del Cuadrado es " + Math.pow(lado, 2));

                break;

            case 2:

                int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la base"));

                int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la altura"));

                System.out.println("La superficie del Rectangulo es " + base*altura);

                break;

            case 3:

                base=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la base"));

                altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la altura"));

                System.out.print("La superficie del Triángulo es " + (base*altura)/2);

                break;

            case 4:

                int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del radio"));

                System.out.print("La superficie del Circulo es ");

                System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));

                break;

            default:
                System.out.println("La opcion ingresada no es valida");
        }
    }
    
}
