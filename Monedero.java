package misproyectos;

/**
 * Clase que implementa los metodos definidos en la interfaz Imonedero
 * Definir una clase 'Monedero' que implemente esta interfaz y que permita gestionar la cantidad 
 * de dinero de que una persona dispone en un momento dado.

* Esta clase tendrá que permitir crear un monedero con una cantidad de dinero inicial, y si no se indica ninguna,
* la cantidad inicial de dinero es cero.

* Comportamiento de la clase:
1.Meter dinero en el monedero
2.Sacar dinero del monedero
3.Consultar el dinero disponible (solo podrá conocerse la cantidad de dinero del monedero a través de este 
último método). 

Nota:
No se podrá sacar más dinero del que haya en un momento dado en el monedero. Si se intenta hacer esto, 
el programa emitirá un mensaje de error.
*/
public class Monedero implements IMonedero{

	private double dineroDisponible = 0;

	@Override //<--- esto significa que se esta implementando el metodo que obliga la clase padre
	public void meterDinero(double dinero) {
		this.dineroDisponible=this.dineroDisponible+dinero;
	}

	@Override
	public void sacarDinero(double dinero) {
		//evalua si tiene suficiente dinero, con respecto al que quiere sacar, en caso afirmativo 
		//resta el dinero solicitado del dinero disponible, en caso contrario emite un mensaje de error 
		if(this.dineroDisponible>=dinero){
			this.dineroDisponible=this.dineroDisponible-dinero;
		}else{
			System.out.println("Dinero Insuficiente, vuelva a intentarlo ;) ");
		}	
	}

	@Override
	public String consultarDineroTotal() {
		return "Dinero disponible= "+dineroDisponible;
	}
	
	//constructor
	public Monedero(double valorInicialDinero){
		//se crea el monedero con el valor inicial ingresado en el constructor
		this.dineroDisponible=valorInicialDinero;
	}
	

	
}
