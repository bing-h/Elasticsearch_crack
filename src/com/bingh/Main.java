package com.bingh;

import java.nio.ByteBuffer;
import java.util.Base64;

public class Main {

    public static void main(String[] args) {
        byte version = 5; // 5 enterprise version,3 platinum version
        ElasticsearchSignature esSignature = new ElasticsearchSignature();
        String prefixStr = esSignature.generateValidSignature(version);
        String s = prefixStr + "ABAA3uiNJR7B8rdgnwFZItAAABmC9ZN0hjZDBGYnVyRXpCOW5Bb3FjZDAxOWpSbTVoMVZwUzRxVk1PSmkxaktJRVl5MUYvUWh3bHZVUTllbXNPbzBUemtnbWpBbmlWRmRZb25KNFlBR2x0TXc2K2p1Y1VtMG1UQU9TRGZVSGRwaEJGUjE3bXd3LzRqZ05iLzRteWFNekdxRGpIYlFwYkJiNUs0U1hTVlJKNVlXekMrSlVUdFIvV0FNeWdOYnlESDc3MWhlY3hSQmdKSjJ2ZTcvYlBFOHhPQlV3ZHdDQ0tHcG5uOElCaDJ4K1hob29xSG85N0kvTWV3THhlQk9NL01VMFRjNDZpZEVXeUtUMXIyMlIveFpJUkk2WUdveEZaME9XWitGUi9WNTZVQW1FMG1DenhZU0ZmeXlZakVEMjZFT2NvOWxpZGlqVmlHNC8rWVVUYzMwRGVySHpIdURzKzFiRDl4TmM1TUp2VTBOUlJZUlAyV0ZVL2kvVk10L0NsbXNFYVZwT3NSU082dFNNa2prQ0ZsclZ4NTltbU1CVE5lR09Bck93V2J1Y3c9PQAAAQCyhef7hVFMq4orIbwULz0c1dX+Ng4sva5RTmWxKYLnJAyXmMRLp2Pvk9YE5G9JoI4gaSB4mIUtVyPzNGJpHLQCPS/kQ8y0B+mc0aXbBKZgbDTqE6p9E+kk1j8myN9GU+JR8QnYd8GiP4ziBUc2zOyx4hskiGE++Kx1KbD4862GbZwLCo9pIIHoxnpt44OytDB9lb7rYr2JBwc07flaR8ndkHlOL7AhuV2OMwDNw978l4OK/O4qxdthxc/XVo6l03IkVoy17coeJ9Oi4YIpOBXrIAYRgjPa68SvnnM8Ykb0KvNvJ7Y8GJ7x+l2q5qMu8QrBeJQ6U0fH/2ATgUy9EiwA";

        byte[] signatureBytes = Base64.getDecoder().decode(s);
        ByteBuffer byteBuffer = ByteBuffer.wrap(signatureBytes);
        System.out.println(byteBuffer.getInt());

    }
}
