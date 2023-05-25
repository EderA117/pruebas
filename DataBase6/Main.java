package org.example;

import org.example.controlador.ControladorLibro;
import org.example.modelo.Libro;
import org.example.persistencia.DemoLibroDataBase;
import org.example.persistencia.LibroDAO;
import org.example.vista.VentanaLibro;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {


        VentanaLibro view = new VentanaLibro("Ejemplo");
        ControladorLibro controller = new ControladorLibro(view);
//        LibroDAO ldao = new LibroDAO();
//        try{
//           Libro res = (Libro)ldao.buscarporId("1");
//            System.out.println(res);
//            System.out.println("--------");
//            for (Object lib: ldao.obtenerTodo()) {
//                System.out.println((Libro)lib);
//            }
//        }catch(SQLException sqle){
//            System.out.println("Error ");
//            System.out.println(sqle.getMessage());
//        }


//        Libro libro = new Libro(1, "El perfume", "Patrick Suskind");
//
//
//        try{
//            if(ldao.update(libro)){
//                System.out.println("Se modifico correctamente");
//            }else{
//                System.out.println("No se pudo modoficar");
//            }
//        }catch(SQLException sqle){
//            System.out.println("Error al insertar");
//        }


//        System.out.println("Hello world!");
//        DemoLibroDataBase demo = new DemoLibroDataBase();
//
//
//        Libro libro = new Libro(0 ,"El Juego", "Desconocido");
////        if (demo.insertarLibro(libro)){
////            System.out.println("Se inserto Correctamente");
////        }else {
////            System.out.println("No se inserto");
////        }
//        System.out.println(demo.buscarLibroporId(3));
//
//        System.out.println("----------------------------");
//        for (Libro tmp: demo.ObtenerTodos()) {
//            System.out.println("Libro: " + tmp);
//            System.out.println("Titulo: " + tmp.getTitulo());
//        }
//

    }


}