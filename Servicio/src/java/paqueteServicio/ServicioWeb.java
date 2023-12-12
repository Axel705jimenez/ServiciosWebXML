package paqueteServicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 */
@WebService(serviceName = "ServicioWeb")
public class ServicioWeb {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public Integer suma(@WebParam(name = "numero1") int numero1, @WebParam(name = "numero2") int numero2) {
        //TODO write your implementation code here:
        return numero1 + numero2;
    }
}
