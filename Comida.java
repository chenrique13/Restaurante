/*************************************************** Carlos Pereira - Restaurante ***************************************************/
public class Comida extends Alimento {

	public Comida(String descricao) {
		super(descricao);
	}

	String volume;
	float entrada = 6.50f;
	float p = 10.00f;
	float m = 12.00f;
	float g = 15.00f;
	float sobremesa = 5.00f;

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public float getEntrada() {
		return entrada;
	}

	public void setEntrada(float entrada) {
		this.entrada = entrada;
	}

	public float getP() {
		return p;
	}

	public void setP(float p) {
		this.p = p;
	}

	public float getM() {
		return m;
	}

	public void setM(float m) {
		this.m = m;
	}

	public float getG() {
		return g;
	}

	public void setG(float g) {
		this.g = g;
	}

	public float getSobremesa() {
		return sobremesa;
	}

	public void setSobremesa(float sobremesa) {
		this.sobremesa = sobremesa;
	}

}
