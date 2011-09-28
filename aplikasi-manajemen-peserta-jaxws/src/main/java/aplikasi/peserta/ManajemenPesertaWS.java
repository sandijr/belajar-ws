/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.peserta;

import aplikasi.peserta.domain.Peserta;
import aplikasi.peserta.service.ManajemenPesertaService;
import aplikasi.peserta.service.impl.dummy.ManajemenPesertaServiceDummy;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author brainmatics
 */
@WebService(serviceName = "ManajemenPesertaWS")
public class ManajemenPesertaWS {

    private static ManajemenPesertaService service = new ManajemenPesertaServiceDummy();

    /** This is a sample web service operation */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findPesertaBynomorPeserta")
    public Peserta findPesertaBynomorPeserta(@WebParam(name = "nomorPeserta") String nomorPeserta) {
        //TODO write your implementation code here:
        return service.findPesertByNomorPeserta(nomorPeserta);
    }

    @WebMethod(operationName = "simpanPeserta")
    public Peserta simpanPeserta(@WebParam(name = "Peserta") Peserta peserta) {
        //TODO write your implementation code here:
        service.simpan(peserta);
        return peserta;
    }

    @WebMethod(operationName = "countsemuaPeserta")
    public Long simpanPescountsemuaPesertaerta() {
        //TODO write your implementation code here:
        return service.countsemuaPeserta();

    }
    
    @WebMethod(operationName = "findsimpanPeserta")
    public List<Peserta> findsimpanPeserta(@WebParam(name = "start") Integer start,
    @WebParam(name = "rows") Integer rows) {
        //TODO write your implementation code here:
         
        return service.findSemuaPeserta(start, rows);
    }
    
}
