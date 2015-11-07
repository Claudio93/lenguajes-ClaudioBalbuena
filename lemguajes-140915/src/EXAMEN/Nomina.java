/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXAMEN;
import java.io.Serializable;
/**
 *
 * @author Claudio
 */
public class Nomina {
    
private Empleado empleado;
    private Departamento departamento;

    public Nomina() {
    }
    
    public Nomina(Empleado empleado, Departamento departamento){
        this.empleado=empleado;
        this.departamento=departamento;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
