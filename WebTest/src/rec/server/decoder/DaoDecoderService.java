/**
 * DaoDecoderService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rec.server.decoder;

public interface DaoDecoderService extends javax.xml.rpc.Service {
    public java.lang.String getDaoDecoderAddress();

    public rec.server.decoder.DaoDecoder getDaoDecoder() throws javax.xml.rpc.ServiceException;

    public rec.server.decoder.DaoDecoder getDaoDecoder(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
