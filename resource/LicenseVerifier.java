//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.elasticsearch.license;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import org.apache.lucene.util.BytesRef;
import org.apache.lucene.util.BytesRefIterator;
import org.elasticsearch.common.bytes.BytesReference;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.common.xcontent.ToXContent.MapParams;
import org.elasticsearch.core.internal.io.Streams;

public class LicenseVerifier {
    public LicenseVerifier() {
    }

    public static boolean verifyLicense(License license, byte[] publicKeyData) {
       return true;
    }

    public static boolean verifyLicense(License license) {
    	return true;
    }
}