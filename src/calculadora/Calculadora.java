/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author manue
 */
public class Calculadora {

    //Atributos 
    String marca;
    String modelo;
    String numeroSerie;
    
    //Metodo Constructor
    
    public Calculadora(String marca, String modelo, String numeroSerie){
        
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public Calculadora(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    

    //Metodos
    
    public static void suma(double n1, double n2) {
        System.out.println("La suma de " + n1 + " más " + n2 + " es " + (n1 + n2));
    }

    public void resta(double n1, double n2) {
        System.out.println("La resta de " + n1 + " menos " + n2 + " es " + (n1 - n2));
    }

    public void multiplica(double n1, double n2) {
        System.out.println("La multiplicación de " + n1 + " por  " + n2 + " es " + (n1 * n2));
    }

    public void divide(double n1, double n2) {
        System.out.println("La división de " + n1 + " entre " + n2 + " es " + (n1 / n2));
    }
    
    // GETTER Y SETTER

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

  
    
}
