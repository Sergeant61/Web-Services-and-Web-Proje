package rec.server.decoder;

public class DaoDecoderProxy implements rec.server.decoder.DaoDecoder {
  private String _endpoint = null;
  private rec.server.decoder.DaoDecoder daoDecoder = null;
  
  public DaoDecoderProxy() {
    _initDaoDecoderProxy();
  }
  
  public DaoDecoderProxy(String endpoint) {
    _endpoint = endpoint;
    _initDaoDecoderProxy();
  }
  
  private void _initDaoDecoderProxy() {
    try {
      daoDecoder = (new rec.server.decoder.DaoDecoderServiceLocator()).getDaoDecoder();
      if (daoDecoder != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)daoDecoder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)daoDecoder)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (daoDecoder != null)
      ((javax.xml.rpc.Stub)daoDecoder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public rec.server.decoder.DaoDecoder getDaoDecoder() {
    if (daoDecoder == null)
      _initDaoDecoderProxy();
    return daoDecoder;
  }
  
  public void kayit() throws java.rmi.RemoteException{
    if (daoDecoder == null)
      _initDaoDecoderProxy();
    daoDecoder.kayit();
  }
  
  
}