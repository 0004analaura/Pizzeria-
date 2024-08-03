package gt.edu.miumg.pizzeria.sucursal;

import gt.edu.miumg.pizzeria.ingredientes.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    List<Empleado> empleados = new ArrayList<>();
    List<Ingrediente> ingredientes = new ArrayList<>();
    List<Equipo> equipos = new ArrayList<>();
    List<String> especialidades = new ArrayList<>();

    public Empleado agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);

        System.out.println("El empleado se ha agregado correctamente: " + empleado.getNombre());
        return empleado;
    }

    private Ingrediente agregarIngrediente(Ingrediente ingrediente) {

        ingredientes.add(ingrediente);

        System.out.println("El empleado se ha agregado correctamente: " + ingrediente.getNombre());
        return ingrediente;
    }


    public Equipo agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
        System.out.println("El empleado se ha agregado correctamente: " + equipo.getTipo());
        return equipo;
    }

    public String agregarEspecialidad(String especialidad) {
        especialidades.add(especialidad);
        System.out.println("Se ha agregado la especialidad: " + especialidad);
        return especialidad;
    }




}
