/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduda
 */
public class ColeccionVehiculo {
    public Vehiculo[] vehiculos;
    public int index;

    public ColeccionVehiculo( int tamaño) {
        this.vehiculos = new Vehiculo[tamaño];
        this.index = 0;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    public String getMarca(Vehiculo vehiculo){
        return vehiculo.getMarca();
    }
    
    public int posicionVehiculo(String marca){
        int posicion = 0;
        int p = 1;
        String Marca;
        while(p<=this.index && posicion != 0){
            Marca = getMarca(vehiculos[p]);
            if (Marca == null ? marca == null : Marca.equals(marca))
                posicion = p;
            else
                p +=1;
        }
        return posicion;
    }
    
    public boolean agregarVehiculo(String marca, int pasajeros, float potencia, float precio, boolean maletera, float capacidad){
        Automovil temp = new Automovil(maletera, capacidad, marca, pasajeros, potencia, precio);
        index +=1;
        if(posicionVehiculo(marca)== 0){
            if (index <= vehiculos.length){
                vehiculos[index] = temp;
                return true;
            }else{
                index = vehiculos.length;
                return false;
            }
        }
        return false;
    }

    public boolean agregarVehiculo(String marca, int pasajeros, boolean maletera, float capacidad){
        if(posicionVehiculo(marca)== 0){
            Automovil temp = new Automovil(maletera, capacidad, marca,4,1600,15000);
            index +=1;
            
            if(index <= vehiculos.length){
                vehiculos[index]=temp;
                return true;
            }else{
                index = vehiculos.length;
                return false;
            }
        }
        return false;
    }
    
    public boolean agregarVehiculo(String marca, int pasajeros, float potencia, float precio, float carga, boolean tolva){
        Camion temp = new Camion(tolva, carga, marca, pasajeros, potencia, precio);
        index +=1;
        if(posicionVehiculo(marca)== 0){
            if (index <= vehiculos.length){
                vehiculos[index] = temp;
                return true;
            }else{
                index = vehiculos.length;
                return false;
            }
        }
        return false;
    }
    
    public boolean agregarVehiculo(String marca, boolean tolva, float carga){
        Camion temp = new Camion(tolva, carga, marca, 2, 5000, 75000);
        index +=1;
        if(posicionVehiculo(marca)== 0){
            if (index <= vehiculos.length){
                vehiculos[index] = temp;
                return true;
            }else{
                index = vehiculos.length;
                return false;
            }
        }
        return false;
    }
    
    public boolean modificarVehiculo(Vehiculo vehiculo){
        String marca = vehiculo.getMarca();
        int posicion = posicionVehiculo(marca);
        if (posicion != 0){
            vehiculos[posicion]= vehiculo;
            return true;
        }
        return false;
    }
    
    public boolean eliminarVehiculo(String marca){
        int posicion = posicionVehiculo(marca);
        vehiculos[posicion]=null;
        if(posicion != 0){
            for(int p = posicion; posicion < index; p++){
                vehiculos[p]=vehiculos[p+1];
            }
            vehiculos[index] = null;
            index -=1;
            return true;
        }
        return false;
        
    }
    
    public Vehiculo buscarVehiculo(String Marca){
        int p=1;
        String marca;
        while(p<=vehiculos.length){
            marca = getMarca(vehiculos[p]);
            if(Marca == null ? marca == null : Marca.equals(marca))
                return vehiculos[p];
            else
                p +=1;
        }
        return null;
    }
    
    public Vehiculo mostrarVehiculo(int posicion){
        if(posicion != index)
            return vehiculos[posicion];
        return null;
    }
    
    public String mostrarVehiculos(){
        String mensaje="";
        for(int i = 1; i<=index;i++){
            if (vehiculos[i]!= null){
                mensaje = mensaje + "Marca: "+ vehiculos[i].getMarca()+"\nPasajeros: "
                        + vehiculos[i].getPasajeros()+"\nPotencia: "+ vehiculos[i].getPotencia() +
                        "\nPrecio: "+ vehiculos[i].getPrecio();
                
                if("Automovil".equals(vehiculos[i].getClass().toString())){
                    mensaje = mensaje +"\nMaletera: "+ ((Automovil)vehiculos[i]).getMaletera()
                            +"\nCapacidad: "+((Automovil)vehiculos[i]).getCapacidad();
                }else{
                    mensaje += "\nTolva: "+((Camion)vehiculos[i]).getTolva()+"\nCarga: "+
                            ((Camion)vehiculos[i]).getCarga();
                }
            }
        }
        return mensaje;
    }

}
