/*************************************************** Carlos Pereira - Restaurante ***************************************************/
public class Bebida extends Alimento {

	public Bebida(String descricao) {
		super(descricao);
	}

	float refri500 = 4.00f;
	float refri1L = 8.00f;
	float suco = 5.00f;
	float cerveja = 9.00f;

	public float getRefri500() {
		return refri500;
	}

	public void setRefri500(float refri500) {
		this.refri500 = refri500;
	}

	public float getRefri1L() {
		return refri1L;
	}

	public void setRefri1L(float refri1l) {
		refri1L = refri1l;
	}

	public float getSuco() {
		return suco;
	}

	public void setSuco(float suco) {
		this.suco = suco;
	}

	public float getCerveja() {
		return cerveja;
	}

	public void setCerveja(float cerveja) {
		this.cerveja = cerveja;
	}

}
