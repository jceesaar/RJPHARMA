/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Rocha
 */
public class Medicamento {
	private String ms;
	private String nome;
        private String valor;
        private String descr;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
        
        public String getMs() {
		return ms;
	}

	public void setMs(String ms) {
		this.ms = ms;
	}
        
        public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
        
        public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	
}
