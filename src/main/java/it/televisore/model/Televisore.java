package it.televisore.model;

public class Televisore {
	private Long id;
	private String marca;
	private String modello;
	private String codice;
	
	public Televisore() {
		// TODO Auto-generated constructor stub
	}

	public Televisore(String marca, String modello, String codice) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.codice = codice;
	}
	

	public Televisore(Long id, String marca, String modello, String codice) {
		super();
		this.id = id;
		this.marca = marca;
		this.modello = modello;
		this.codice = codice;
	}

	public Televisore(String marca, String modello) {
		super();
		this.marca = marca;
		this.modello = modello;
	}

	public Long getId() {
		return id;
	}

	public String getMarca() {
		return marca;
	}

	public String getModello() {
		return modello;
	}

	public String getCodice() {
		return codice;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	@Override
	public String toString() {
		return "Televisore [id=" + id + ", marca=" + marca + ", modello=" + modello + ", codice=" + codice + "]";
	}
	
	
}
