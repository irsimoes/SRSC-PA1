package srsc.sadkdp.jsonEntities;

import srsc.configEntities.Ciphersuite;

public class TicketCredentials {
    private String ip, port, movieId;
    private Ciphersuite ciphersuiteConf;
    private int n4_;
    private byte[] sessionKey;

    public TicketCredentials() {
    }

    public TicketCredentials(String ip, String port, String movieId, Ciphersuite ciphersuiteConf, byte[] sessionKey, int n4_) {
        this.ip = ip;
        this.port = port;
        this.movieId = movieId;
        this.ciphersuiteConf = ciphersuiteConf;
        this.sessionKey = sessionKey;
        this.n4_ = n4_;
    }


    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getMovieId() {
        return this.movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public Ciphersuite getCiphersuiteConf() {
        return this.ciphersuiteConf;
    }

    public void setCiphersuiteConf(Ciphersuite ciphersuiteConf) {
        this.ciphersuiteConf = ciphersuiteConf;
    }

    public int getN4_() {
        return this.n4_;
    }

    public void setN4_(int n4_) {
        this.n4_ = n4_;
    }

    public byte[] getSessionKey() {
        return this.sessionKey;
    }

    public void setSessionKey(byte[] sessionKey) {
        this.sessionKey = sessionKey;
    }
    
    
}