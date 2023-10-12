package br.com.isaac.httpclient.domain;

public class CEP {

	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;

	public String getCep() {
		return cep;
	}

	public void setCep(String value) {
		this.cep = value;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String value) {
		this.logradouro = value;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String value) {
		this.complemento = value;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String value) {
		this.bairro = value;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String value) {
		this.localidade = value;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String value) {
		this.uf = value;
	}

	public String getIbge() {
		return ibge;
	}

	public void setIbge(String value) {
		this.ibge = value;
	}

	public String getGia() {
		return gia;
	}

	public void setGia(String value) {
		this.gia = value;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String value) {
		this.ddd = value;
	}

	public String getSiafi() {
		return siafi;
	}

	public void setSiafi(String value) {
		this.siafi = value;
	}

	@Override
	public String toString() {
		StringBuilder json = new StringBuilder();
		json.append("{\n");
		json.append("  \"cep\": \"").append(cep).append("\",\n");
		json.append("  \"logradouro\": \"").append(logradouro).append("\",\n");
		json.append("  \"complemento\": \"").append(complemento).append("\",\n");
		json.append("  \"bairro\": \"").append(bairro).append("\",\n");
		json.append("  \"localidade\": \"").append(localidade).append("\",\n");
		json.append("  \"uf\": \"").append(uf).append("\",\n");
		json.append("  \"ibge\": \"").append(ibge).append("\",\n");
		json.append("  \"gia\": \"").append(gia).append("\",\n");
		json.append("  \"ddd\": \"").append(ddd).append("\",\n");
		json.append("  \"siafi\": \"").append(siafi).append("\"\n");
		json.append("}");
		return json.toString();
	}

}
