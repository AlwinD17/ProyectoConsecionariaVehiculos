/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduda
 */
public class Vehiculo {

    private String _marca;
    private int _pasajeros;
    private float _potencia;
    private float _precio;
    
    public Vehiculo(String marca, int pasajeros, float potencia, float precio) {
        this._marca = marca;
        this._pasajeros = pasajeros;
        this._potencia = potencia;
        this._precio = precio;
    }

    public String getMarca() {
        return _marca;
    }

    public void setMarca(String _marca) {
        this._marca = _marca;
    }

    public int getPasajeros() {
        return _pasajeros;
    }

    public void setPasajeros(int _pasajeros) {
        this._pasajeros = _pasajeros;
    }

    public float getPotencia() {
        return _potencia;
    }

    public void setPotencia(float _potencia) {
        this._potencia = _potencia;
    }

    public float getPrecio() {
        return _precio;
    }

    public void setPrecio(float _precio) {
        this._precio = _precio;
    }

    
}
