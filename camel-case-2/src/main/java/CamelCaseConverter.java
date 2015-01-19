
public class CamelCaseConverter {

	public String converter(String nome) {
		return nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();
	}

}
