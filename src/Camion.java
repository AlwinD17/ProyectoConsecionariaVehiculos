/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduda
 */
public class Camion extends Vehiculo{
    private boolean _tolva;
    private float _carga;

    public Camion(boolean tolva, float carga, String marca, int pasajeros, float potencia, float precio) {
        super(marca, pasajeros, potencia, precio);
        this._tolva = tolva;
        this._carga = carga;
    }

    public boolean getTolva() {
        return _tolva;
    }

    public void setTolva(boolean tolva) {
        this._tolva = tolva;
    }

    public float getCarga() {
        return _carga;
    }

    public void setCarga(float carga) {
        this._carga = carga;
    }
    
    public String getNombreClase(){
        return this.getClass().toString();
    }
}
