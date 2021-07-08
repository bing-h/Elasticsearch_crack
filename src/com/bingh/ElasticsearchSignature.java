package com.bingh;

import java.util.Base64;

public class ElasticsearchSignature {
    /**
     * generate legal version
     *
     * @return
     */
    public String generateValidSignature(byte version) {
        byte[] sb = {0, 0, 0, version, 0, 1};
        return new String(Base64.getEncoder().encode(sb));
    }
}
