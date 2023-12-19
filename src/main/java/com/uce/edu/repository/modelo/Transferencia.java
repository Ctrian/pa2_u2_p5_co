package com.uce.edu.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "transferencia")
public class Transferencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_transferencia")
	@SequenceGenerator(name = "seq_transferencia", sequenceName = "seq_transferencia", allocationSize = 1)
	
	@Column(name = "transf_id")
	private Integer id;
	
	@Column(name = "transf_numero")
	private BigDecimal numero;	
	
	@Column(name = "transf_fecha")
	private LocalDateTime fecha;
	
	@Column(name = "transf_monto")
	private BigDecimal monto;
	
//	@Column(name = "transf_cuentaOrigen")
//	private CuentaBancaria cuentaOrigen;
//	
//	@Column(name = "transf_cuentaDestino")
//	private CuentaBancaria cuentaDestino;
//
//	@Override
//	public String toString() {
//		return "Transferencia [numero=" + numero + ", fecha=" + fecha + ", monto=" + monto + ", cuentaOrigen="
//				+ cuentaOrigen + ", cuentaDestino=" + cuentaDestino + "]";
//	}

	// getters and setter
	public BigDecimal getNumero() {
		return numero;
	}

	public void setNumero(BigDecimal numero) {
		this.numero = numero;
	}
	
	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

//	public CuentaBancaria getCuentaOrigen() {
//		return cuentaOrigen;
//	}
//
//	public void setCuentaOrigen(CuentaBancaria cuentaOrigen) {
//		this.cuentaOrigen = cuentaOrigen;
//	}
//
//	public CuentaBancaria getCuentaDestino() {
//		return cuentaDestino;
//	}
//
//	public void setCuentaDestino(CuentaBancaria cuentaDestino) {
//		this.cuentaDestino = cuentaDestino;
//	}

}
