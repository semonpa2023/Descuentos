package org.example;



import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombreCompleto;
        String tipoCliente;
        Integer cantidadArticulos= 0;
        Double valorTotalCompraSinDescuento;
        Double descuento;
        Double totalAPagar;
        Scanner leerDato= new Scanner(System.in);

        System.out.println("*****BIENVENIDO A MODA EXPRESS! TU TIENDA FAVORITA*****");
        System.out.println("Por favor ingresa tu nombre completo: ");
        nombreCompleto = leerDato.nextLine();
        System.out.println("Ingrese el tipo de cliiente (Regular O Vip)");
        tipoCliente=leerDato.nextLine();
        System.out.println("Ingrese cantidad de articulos comprados: ");
        cantidadArticulos= leerDato.nextInt();
        System.out.println("Ingrese el costo total de la compra sin descuento: $");
        valorTotalCompraSinDescuento=leerDato.nextDouble();


        if (tipoCliente.toUpperCase().equals("Regular")){
            if(cantidadArticulos >=1 && cantidadArticulos<=3){
                descuento= 0.05;

            } else if (cantidadArticulos>=4&&cantidadArticulos<=6) {
                descuento= 0.10;

            }else {
                descuento=0.15;

            }

        } else if (tipoCliente.toUpperCase().equals("VIP")){
            if (cantidadArticulos >= 1 && cantidadArticulos<=3){
                descuento= 0.10;

            } else if (cantidadArticulos >=4 && cantidadArticulos <=6 ) {
                descuento= 0.15;

            }else{
                descuento= 0.20;

            }
        }else{
            System.out.println("Amigo no sea ignorante ingrese solo Regular o VIP");
            return;
        }
        totalAPagar= valorTotalCompraSinDescuento*descuento;

        System.out.println("****Gracias por tu compra*****");
        System.out.println("**Este es el resumen de tu compra***");
        System.out.println("Cliente: " +nombreCompleto);
        System.out.println("Tipo de cliente: " +tipoCliente);
        System.out.println("Cantidad de articulos: " +cantidadArticulos);
        System.out.println("Total sin descuento: " +valorTotalCompraSinDescuento);
        System.out.println("Descuento aplicado: " +(descuento*100) + "%" );
        System.out.println("Valor descontado: $" + (valorTotalCompraSinDescuento*descuento));
        System.out.println("Total a pagar: $" + totalAPagar);




    }
}