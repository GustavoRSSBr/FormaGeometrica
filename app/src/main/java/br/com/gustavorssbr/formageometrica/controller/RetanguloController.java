package br.com.gustavorssbr.formageometrica.controller;

import br.com.gustavorssbr.formageometrica.model.Retangulo;

public class RetanguloController implements IGeometriaController<Retangulo>{
    @Override
    public float calcularArea(Retangulo retangulo) {
        return retangulo.getBase() * retangulo.getAltura();
    }

    @Override
    public float calcularPerimetro(Retangulo retangulo) {
        return 2 * (retangulo.getAltura() + retangulo.getBase());
    }
}
