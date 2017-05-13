/**
 * DiziDenemeService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rec.server.dizi;

public interface DiziDenemeService extends javax.xml.rpc.Service {
    public java.lang.String getDiziDenemeAddress();

    public rec.server.dizi.DiziDeneme getDiziDeneme() throws javax.xml.rpc.ServiceException;

    public rec.server.dizi.DiziDeneme getDiziDeneme(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
