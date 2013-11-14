/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.parameter;

import javax.servlet.http.HttpServletRequest;
import net.daw.bean.ComentBean;

/**
 *
 * @author al037342
 */
public class ComentParam {
    private HttpServletRequest request;
    
    
    public ComentParam(HttpServletRequest request) throws Exception {
        this.request = request;
    }

    public ComentBean loadId(ComentBean oComent) throws NumberFormatException {
        try {
            if (request.getParameter("id") != null) {
                oComent.setId(Integer.parseInt(request.getParameter("id")));
            } else {
                oComent.setId(0);
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Controller: Error: Load: Formato de datos en parámetros incorrecto " + e.getMessage());
        }
        return oComent;
    }

    public ComentBean load(ComentBean oComent) throws NumberFormatException {
        try {
            if ((request.getParameter("id") != null)) {
                oComent.setId(Integer.parseInt(request.getParameter("id")));
            }
            if ((request.getParameter("titulo") != null)) {
                oComent.setTitulo(request.getParameter("titulo"));
            }
            if ((request.getParameter("contenido") != null)) {
                oComent.setContenido(request.getParameter("contenido"));
            }
            if ((request.getParameter("fecha") != null)) {
                oComent.setFecha(request.getParameter("fecha"));
            }
            if ((request.getParameter("id_usuario") != null)) {
                oComent.setId_usuario(Integer.parseInt(request.getParameter("id_usuario")));
            }
            if ((request.getParameter("id_documento") != null)) {
                oComent.setId_documento(Integer.parseInt(request.getParameter("id_documento")));
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Controller: Error: Load: Formato de datos en parámetros incorrecto " + e.getMessage());
        }
        return oComent;
    }
    

}