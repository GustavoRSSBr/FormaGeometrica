package br.com.gustavorssbr.formageometrica.controller;

public interface IGeometriaController<T> {

    float calcularArea(T t);

    float calcularPerimetro(T t);

}
