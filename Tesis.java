package comunicacion;

public class Tesis extends Escrito {
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}

    public int palabrasTotales(int palabrasPagina){
		int factor = 5;
		return this.getPaginas()* palabrasPagina * factor;
    }

    public String interpretacion() {
        return this.interpretacion;
    } 

	public String getIdea() {
		return this.idea;
	}

	public String[] getArgumentos() {
		return this.argumentos;
	}

	public String getConclusion() {
		return this.conclusion;
	}

	public String getReferencias() {
		return this.referencias;
	}

    public String toString() {
		String r = this.getOrigen() + "\n";
		r += this.getTitulo() + "\n";
		r += this.getAutor() + "\n";
		r += this.getPaginas() + "\n";
		r += this.idea + "\n";
		r += this.argumentos.length + "\n";
		r += this.conclusion + "\n";
		r += this.referencias;
        return r;
    }
}
