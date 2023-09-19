package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.time.LocalDate;

public class ProyectoTransversal {

    public static void main(String[] args) {
        
        //Guardar Alumno
        //Alumno alumno = new Alumno(22456078, "Lopez", "Lautaro", LocalDate.of(1995, 7, 12), true);
        AlumnoData alum = new AlumnoData();
        //alum.guardarAlumno(alumno);
        
        //Buscar Alumno por id
        //System.out.println(alum.buscarAlumno(2));
        
        //Buscar Alumno por dni
        //System.out.println(alum.buscarAlumnoPorDni(28789890));
        
        //Listar alumnos
        //System.out.println(alum.listarAlumnos());
        
        //Modificar alumno
        //Alumno alumno = new Alumno();
        //alumno.setDni(12322111);
        //alumno.setApellido("Daguerre");
        //alumno.setNombre("Guille");
        //alumno.setFechaNacimiento(LocalDate.of(1885, 4, 15));
        //alumno.setIdAlumno(1);
        //alum.modificarAlumno(alumno);
        
        //Eliminar alumno
        //alum.eliminarAlumno(4);
        
        
        //GUARDAR MATERIA
        //Materia materia = new Materia("Historia", 1, true);
        //MateriaData matData = new MateriaData();
        //matData.guardarMateria(materia);
        
        
        //BUSCAR MATERIA
        //System.out.println(matData.buscarMateria(2));
        
        //LISTAR MATERIAS
        //System.out.println(matData.listarMaterias());
        
        //MODIFICAR MATERIA
        //Materia mat = new Materia();
        //mat.setNombre("Quimica");
        //mat.setAnio(3);
        //mat.setIdMateria(3);
        //matData.modificarMateria(mat);
        
        //ELIMINAR MATERIA
        //matData.eliminarMateria(4);
        
        //GUARDAR INSCRIPCION
        //AlumnoData ad = new AlumnoData();
        //MateriaData md = new MateriaData();
        //                        
        //Alumno alumno = ad.buscarAlumno(1);
        //Materia materia = md.buscarMateria(3);
        //                        
        //Inscripcion insc = new Inscripcion(6, alumno, materia);
        InscripcionData inscData = new InscripcionData();
        //inscData.guardarInscripcion(insc);
        
        //OBTENER INSCRIPCIONES
        //System.out.println(inscData.obtenerInscripciones());
        
        //OBTENER INSCRIPCIONES POR ALUMNO
        //System.out.println(inscData.obtenerInscripcionesPorAlumno(3));
        
        //OBTENER INSCRIPCIONES POR CURSADAS
        //System.out.println(inscData.materiasCursadas(3));
        
        
        //OBTENER INSCRIPCIONES POR NO CURSADAS
        //for (Materia materias : inscData.materiasNOCursadas(1)) {
        //System.out.println(materias.getNombre());
        //}
        
        //BORRAR INSCRIPCIONES
        //inscData.borrarInscripcionMateriaAlumno(2, 2);
        
        //ACTUALIZAR NOTA DE LAS INSCRIPCIONES
        //inscData.actualizarNota(3, 2, 10);
        
        //OBTENER ALUMNO POR MATERIA
        System.out.println(inscData.obtenerAlumnosXMateria(2));
    }
}