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
@WebService(serviceName = "WSCalculadora")
public class WSCalculadora {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "soma")
    public double soma(@WebParam(name = "x") double x, @WebParam(name = "y") double y) {
        return x + y;
    }

    @WebMethod(operationName = "subtrai")
    public double subtrai(@WebParam(name = "x") double x, @WebParam(name = "y") double y) {
        return x - y;
    }

    @WebMethod(operationName = "multiplica")
    public double multiplica(@WebParam(name = "x") double x, @WebParam(name = "y") double y) {
        return x * y;
    }

    @WebMethod(operationName = "divide")
    public double divide(@WebParam(name = "x") double x, @WebParam(name = "y") double y) {
        return x / y;
    }
}
