
/** 
 * Materiais/Labs para SRSC 17/18, Sem-2
 * Henrique Domingos, 12/3/17
 **/

import java.io.File;
import java.nio.ByteBuffer;
import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import srsc.Utils;

public class Test {

    public static void main(String[] args) throws Exception{
        // String s = "kek";
        // byte[] a = srsc.Utils.toByteArray(s);
        // String s1 = srsc.Utils.toString(a);

        // System.out.println(s);
        // System.out.println(a);
        // System.out.println(s1);

        // byte[] a1 = { 0b00000001, 0b00000010, 0b00000011};
        // String s2 = srsc.Utils.toString(a1);
        // byte[] a2 = srsc.Utils.toByteArray(s2);

        // System.out.print((int) a1[0]);
        // System.out.print(s2);
        // System.out.print((int) a2[2]);


        // Generate proxy box id

        KeyStore ks = KeyStore.getInstance(new File("./src/main/resources/proxybox.keystore"), "password".toCharArray());
        byte[] pub = ks.getCertificate("proxybox").getPublicKey().getEncoded();
        byte[] ran = new byte[32];
        new SecureRandom().nextBytes(ran);

        System.out.print(Utils.toHex(ByteBuffer.allocate(pub.length+ran.length).put(pub).put(ran).array()));
    }
}