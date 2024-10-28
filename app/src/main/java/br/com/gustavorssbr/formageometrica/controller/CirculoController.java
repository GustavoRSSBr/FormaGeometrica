package br.com.gustavorssbr.formageometrica.controller;

import br.com.gustavorssbr.formageometrica.model.Circulo;

public class CirculoController implements IGeometriaController<Circulo>{

    @Override
    public float calcularArea(Circulo circulo) {
        return (float) (Math.PI * (circulo.getRaio() * circulo.getRaio()));
    }

    @Override
    public float calcularPerimetro(Circulo circulo) {
        return (float) (2 * Math.PI * circulo.getRaio());
    }
}
