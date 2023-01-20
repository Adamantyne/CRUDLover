package com.modela_ai.modela_ai.model;

import com.modela_ai.modela_ai.dto.CarDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Car {

    public Car(CarDto data){
        this.anoModelo = data.anoModelo();
        this.dataFabricacao = data.dataFabricacao();
        this.fabricante = data.fabricante();
        this.modelo = data.modelo();
        this.valor = data.valor();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false)
    private String modelo;

    @Column(length = 50, nullable = false)
    private String fabricante;

    @Column(length = 50, nullable = false)
    private String dataFabricacao;

    @Column(length = 10, nullable = false)
    private double valor;

    @Column(length = 4, nullable = false)
    private int anoModelo;
}
