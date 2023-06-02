package br.com.itb.miniprojeto3cspring.model;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Funcionario")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	private String cpf;
	private String rg;
	private String sexo;
	private String dtNasc;
	private byte[] img;
	private String telefone;
	private String email;
	private String logradouro;
	private String numero;
	private String complemento;
	private String cep;
	private String bairro;
	private String ciadde;
	private String uf;
	private int cargo_id;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCiadde() {
		return ciadde;
	}
	public void setCiadde(String ciadde) {
		this.ciadde = ciadde;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	/*@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", sexo=" + sexo + ", dtNasc=" + dtNasc
				+ ", img=" + Arrays.toString(img) + ", telefone=" + telefone + ", email=" + email + ", logradouro="
				+ logradouro + ", numero=" + numero + ", complemento=" + complemento + ", cep=" + cep + ", bairro="
				+ bairro + ", ciadde=" + ciadde + ", uf=" + uf + "]";
	}*/

	

	
}


