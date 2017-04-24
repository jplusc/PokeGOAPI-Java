package com.pokegoapi.util;

import javax.net.ssl.X509TrustManager;
import java.security.cert.X509Certificate;

/**
 * DO NOT USE IN PRODUCTION!!!!
 *
 * This class will simply trust everything that comes along.
 *
 * @author frank
 *
 */
    // Retrieved from Stack Overflow at http://stackoverflow.com/questions/19723415/java-overriding-function-to-disable-ssl-certificate-check
    // Need this to fix stupid random SSL problems
public class TrustAllX509TrustManager implements X509TrustManager {
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }

    public void checkClientTrusted(java.security.cert.X509Certificate[] certs,
                                   String authType) {
    }

    public void checkServerTrusted(java.security.cert.X509Certificate[] certs,
                                   String authType) {
    }

}
