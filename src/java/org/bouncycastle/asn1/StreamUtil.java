package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import l.C12084;

/* loaded from: classes.dex */
public class StreamUtil {
    public static int findLimit(InputStream inputStream) {
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        if (inputStream instanceof LimitedInputStream) {
            return ((LimitedInputStream) inputStream).getLimit();
        }
        if (inputStream instanceof ASN1InputStream) {
            return ((ASN1InputStream) inputStream).getLimit();
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                convertMaybeLegacyFileChannelFromLibrary = C12084.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream) inputStream).getChannel());
                long size = convertMaybeLegacyFileChannelFromLibrary != null ? convertMaybeLegacyFileChannelFromLibrary.size() : 2147483647L;
                if (size < 2147483647L) {
                    return (int) size;
                }
            } catch (IOException unused) {
            }
        }
        long maxMemory = Runtime.getRuntime().maxMemory();
        if (maxMemory > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) maxMemory;
    }
}
