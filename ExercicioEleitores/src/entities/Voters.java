package entities;

public class Voters {

	private Integer totalReaders = 1000;
	private Integer valid = 800;
	private Integer white = 150;
	private Integer nullVotes = 50;
	
	public Voters() {
	}
	
	public Voters(Integer totalEleitores, Integer validos, Integer votosBrancos, Integer votosNulos) {
		super();
		this.totalReaders = totalEleitores;
		this.valid = validos;
		this.white = votosBrancos;
		this.nullVotes = votosNulos;
	}
	
	
	public String percentagelValidVotes() {
		
		return "Percentual de eleitores com os votos validos " + (valid * 100.00) / totalReaders + "%";
	}
	
	public String percentagelWhiteVotes() {
		
		return "Percentual de eleitores com os votos brancos " + (white * 100.00) / totalReaders + "%";
	}
	
	public String percentagelNullVotes() {
		
		return "Percentual de eleitores com os votos nulos " + (nullVotes * 100.00) / totalReaders + "%";
	}
}
