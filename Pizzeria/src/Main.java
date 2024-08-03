import gt.edu.miumg.pizzeria.pizza.Pizza;
import gt.edu.miumg.pizzeria.pizza.PizzaChicago;
import gt.edu.miumg.pizzeria.sucursal.Empleado;
import gt.edu.miumg.pizzeria.sucursal.Sucursal;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado empleado = new Empleado("Ana Laura", "repartidor", 4500);
        Sucursal sucursal = new Sucursal();
        sucursal.agregarEmpleado(empleado);
        int opcion;
        do {
            System.out.println("Pizzeria Ana Lauris");
            System.out.println("Ordenar una pizza: 1");
            System.out.println("Selecciona una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    PizzaChicago pizzaChicago = new PizzaChicago("pizza chicago", 18, 800.00, "cuadarada");
                    empleado.tomarOrden();
                    empleado.trabajar();
            }
        } while (opcion != -1);


    }






        }

