/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ingui.javafx.hola_mundo_navegador_web;

import ingui.javafx.navegador_web.Navegador_web;
import innui.modelos.configuraciones.ResourceBundles;
import innui.modelos.configuraciones.Resources;
import innui.modelos.configuraciones.iniciales;
import innui.modelos.errores.oks;
import innui.modelos.internacionalizacion.tr;
import innui.modelos.modelos;
import innui.modelos.modelos_comunicaciones.modelos_comunicaciones;
import java.io.InputStream;
import static java.lang.System.exit;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author emilio
 */
public class Hola_mundo_navegador_web extends Navegador_web {
    public static String k_in_ruta = "in/ingui/javafx/hola_mundo_navegador_web/in";
    public static String k_icono_ruta = "/re/ingui.javafx.hola_mundo_navegador_web.png";
    public static String k_imagen_ejemplo_ruta = "/re/ingui.javafx.hola_mundo_navegador_web.cripto_y_mas.png";
    public iniciales inicial = new iniciales () {
        @Override
        public boolean run(oks ok, Object... extra_array) throws Exception {
            try {
                iniciar(ok);
                if (ok.es) {
                    Hola_mundo_navegador_web.super.inicial.run(ok, Hola_mundo_navegador_web.class, extra_array[0]);
                    terminar(ok);
                }
                return ok.es;
            } catch (Exception e) {
                throw e;
            }
        }

        @Override
        public boolean iniciar(oks ok, Object... extra_array) throws Exception {
            if (ok.es == false) { return ok.es; }
            _iniciar_desde_clase(modelos.class, ok);
            if (ok.es == false) { return ok.es; }
            _iniciar_desde_clase(modelos_comunicaciones.class, ok);
            if (ok.es == false) { return ok.es; }
            _iniciar_desde_clase(Navegador_web.class, ok);
            if (ok.es == false) { return ok.es; }
            _iniciar_desde_clase(this.getClass(), ok);
            if (ok.es == false) { return ok.es; }
            return ok.es;
        }

        @Override
        public boolean terminar(oks ok, Object... extra_array) throws Exception {
            if (ok.es == false) { return ok.es; }
            _terminar_desde_clase(modelos.class, ok);
            if (ok.es == false) { return ok.es; }
            _terminar_desde_clase(modelos_comunicaciones.class, ok);
            if (ok.es == false) { return ok.es; }
            _terminar_desde_clase(Navegador_web.class, ok);
            if (ok.es == false) { return ok.es; }
            _terminar_desde_clase(this.getClass(), ok);
            if (ok.es == false) { return ok.es; }
            return ok.es;
        }       
    };

    public Hola_mundo_navegador_web() throws Exception {        
    }
    
    public static void main(String[] args) {
        oks ok = new oks();
        Hola_mundo_navegador_web hola_mundo_navegador_web = null;
        try {
            hola_mundo_navegador_web = new Hola_mundo_navegador_web();
            Object [] extra_array = { args };
            hola_mundo_navegador_web.inicial.run(ok, extra_array);
        } catch (Exception e) {
            ok.setTxt(e);
        }
        if (ok.es == false) {
            System.err.println(ok.txt);
            exit(1);
        } else {
            exit(0);
        }
    }
    /**
     * Realiza la operativa de navegar para presentar una página web
     * @param parametros_lista
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    @Override
    public boolean navegar(List<String> parametros_lista, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = ResourceBundles.getBundle(k_in_ruta);
        String texto;
        URL imagen_url;
        imagen_url = Resources.getResource(k_imagen_ejemplo_ruta);
        texto = "<html>"
                + "<body>"
                + "<table width='90%'>"
                + "<tr>"
                + "<td>"
                + "<img alt='"
                + imagen_url.getFile()
                + "' src='file://"
                + imagen_url.getPath()
                + "' width='100' height='100'>"
                + "</td>"
                + "<td>"
                + "<h1>"
                + tr.in(in, "¡Hola Mundo! ")
                + "</h1>"
                + "</td>"
                + "</tr>"
                + "</table>"
                + "</body>"
                + "</html>";
        webview_simpleController_implementacion.presentar_contenido(texto, ok);
        return ok.es;
    }
    /**
     * Pone el icono de la aplicación
     * @param stage Escenario donde poner el icono
     * @param ok
     * @param extra_array
     * @return true si tiene éxito, false si hay error.
     * @throws java.lang.Exception
     */
    @Override
    public boolean poner_icono(Stage stage, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ObservableList<Image> observableList = stage.getIcons();
        InputStream inputStream = this.getClass().getResourceAsStream(
            k_icono_ruta); 
        Image image = new Image(inputStream);
        observableList.add(image);
        return ok.es;
    }
}
