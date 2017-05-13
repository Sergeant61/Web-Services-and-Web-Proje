/**
 * HesapmakinesiService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rec.server.hesap;

public interface HesapmakinesiService extends javax.xml.rpc.Service {
    public java.lang.String getHesapmakinesiAddress();

    public rec.server.hesap.Hesapmakinesi getHesapmakinesi() throws javax.xml.rpc.ServiceException;

    public rec.server.hesap.Hesapmakinesi getHesapmakinesi(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
