/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduda
 */
public class Automovil extends Vehiculo{
    private boolean _maletera;
    private float _capacidad;

    public Automovil(boolean _maletera, float _capacidad, String marca, int pasajeros, float potencia, float precio) {
        super(marca, pasajeros, potencia, precio);
        this._maletera = _maletera;
        this._capacidad = _capacidad;
    }

    public boolean getMaletera() {
        return _maletera;
    }

    public void setMaletera(boolean _maletera) {
        this._maletera = _maletera;
    }

    public float getCapacidad() {
        return _capacidad;
    }

    public void setCapacidad(float _capacidad) {
        this._capacidad = _capacidad;
    }
    public String getNombreClase(){
        return this.getClass().toString();
    }
    
}
