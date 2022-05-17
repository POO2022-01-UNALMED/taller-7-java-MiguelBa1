package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;

	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}

    public int palabrasTotales(int palabrasPagina){
		int factor = 1;
		return this.getPaginas()* palabrasPagina * factor;
    }

	public String getEnsenanza() {
		return this.ensenanza;
	}
    public String interpretacion() {
        return this.interpretacion;
    } 

    public String toString() {
		String r = this.getOrigen() + "\n";
		r += this.getTitulo() + "\n";
		r += this.getAutor() + "\n";
		r += this.getPaginas() + "\n";
		r += this.ensenanza;
        return r;
    }
}