package Ejemplos;

public class EjercicioPrecio {
	
	private static final int IVA = 21;
	
	public double calcularPrecioIVA(int unidades, double precioUnitario) {
		double precioSinIVA;
		double precioConIVA;
		
		precioSinIVA = precioUnitario * unidades;
		
		precioConIVA = precioSinIVA * IVA / 100;
		
		return precioConIVA;
		
	}

}
