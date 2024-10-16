package br.com.serratec.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class LancamentoVendas {
	private Long id;
	private LocalDate data;
	private Double valor;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="id_vendedor") 
	private Vendedor vendedor;
	
 }

	
	