package entidades;

public class Bombilla {
	private String marca;
	private int potencia;
	private boolean encendida;
	private String color;

	// constructores
	public Bombilla() {
		this("", 10, false, "");
	}

	public Bombilla(String marca, int potencia, boolean encendida, String color) {
		setMarca(marca);
		setPotencia(potencia);
		setEncendida(encendida);
		setColor(color);
	}

	// getter-setter
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		if (potencia > 9 && potencia < 501)
			this.potencia = potencia;
		else
			System.out.println("Ponga potencia entre 10 y 500");
	}

	public boolean isEncendida() {
		return encendida;
	}
	
	private String estadoBombilla(){
		boolean estado = isEncendida(); 
		return (!estado) ? "apagada" : "encendida"; 
	}

	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//reescritura de métodos
	@Override
	public String toString() {
		return "Marca: " + getMarca() + ", Potencia: " + getPotencia() + ", Estado: "
				+ estadoBombilla() + ", Color:" + getColor();
	}
}