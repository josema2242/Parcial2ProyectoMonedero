package misproyectos;

public interface IMonedero {
	
	//esta  interfaz solamente define comportamiento
	//estos metodos que estan en la interfaz no tienen cuerpo
	
	public void meterDinero(double dinero);
	public void sacarDinero(double dinero);
	public String consultarDineroTotal();
}