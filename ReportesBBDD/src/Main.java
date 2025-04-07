

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        try {
            
            Connection con = Conexion.getConnection();

            // Compilar el archivo .jrxml
            //JasperReport reporte = JasperCompileManager.compileReport("reportes/alojamientos.jrxml");
            JasperReport reporte = JasperCompileManager.compileReport("reportes/baresrestaurantes.jrxml");

            // Llenar el reporte con datos de la BBDD
            JasperPrint print = JasperFillManager.fillReport(reporte, null, con);

            // Mostrar reporte
            JasperViewer.viewReport(print, false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
