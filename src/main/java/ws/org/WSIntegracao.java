/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws.org;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Lucas
 */
@WebService(serviceName = "WSIntegracao")
public class WSIntegracao {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "consultaprocesso")
    public boolean consultaprocesso(@WebParam(name = "nroprocesso") String nroprocesso) {
        return true;
    }

    @WebMethod(operationName = "statusprocesso")
    public String statusprocesso(@WebParam(name = "nroprocesso") String nroprocesso) {
        return "Extinto";
    }

    @WebMethod(operationName = "incluiprocesso")
    public boolean incluiprocesso(@WebParam(name = "nroprocesso") String nroprocesso) {
        return true;
    }   
}

