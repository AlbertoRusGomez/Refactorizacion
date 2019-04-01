package Ejemplos;

public class EjercicioPrecio {
	public double calcularPrecioIVA(int unidades, double precioUnitario) {
		double precioTotal;
		double precioConIVA;
		
		precioTotal = precioUnitario * unidades;
		
		precioConIVA = precioTotal + (precioTotal*0.21);
		
		return precioConIVA;
		
	}

}
