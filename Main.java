package misproyectos;

/*
Para probar el funcionamiento de la clase Monedero, se escribe un método 'main' con una serie de instrucciones 
que hacen uso de los métodos definidos.
 */
import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            
          
            // Se pide al usuario la cantidad inicial de dinero
            System.out.println("Bienvenido(a), ingresa la cantidad de dinero inicial");
            double dineroinicial = scanner.nextDouble();
             
            /* Sele pasa al constructor la cantidad de dinero inicial ingresada por el usuarioy que se guardó
            en la variable "Dineroinicial */
            Monedero monederito = new Monedero(dineroinicial);
             
            int opcionSeleccionada;
            
            
            
            /* se usa un bucle do while, para que el menú de opciones se repita hasta que el usuario ingrese 
           una opcion incorrecta que no está en el menú. */
            
            do {     
             
            /*menú de opciones que segun a opcion ingresada por medio de un switch se analiza o que el usuario
             necesita*/    
            System.out.println("Por favor, ingresa una opcion");
            System.out.println("    1.Meter dinero en el monedero");
            System.out.println("    2.Sacar dinero");
            System.out.println("    3.Consultar dinero actual");
            System.out.println("    4.Salir");
            opcionSeleccionada = scanner.nextInt();
            
            switch (opcionSeleccionada) {
                case 1:
                    System.out.println("Ingresa la cantidad de dinero que vas a meter en el monedero");
                    double masdinero = scanner.nextDouble();
                    monederito.meterDinero(masdinero);
                    break;
                case 2:
                    System.out.println("Ingresa la cantidad de dinero que vas a sacar del monedero");
                    double menosdinero = scanner.nextDouble();
                    monederito.sacarDinero(menosdinero);
                    break;
                case 3:
                    System.out.println(monederito.consultarDineroTotal());
                    break;
                case 4:
                    System.out.println("Gracias por Utilizar el Programa");
                    break;
                }   
                      
            }while (opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3); 
         }
}
