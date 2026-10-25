package org.bouncycastle.util.io.pem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import l.C16014;
import l.C4860;
import l.C5028;
import l.InterfaceC17664;
import l.InterfaceC19140;
import org.bouncycastle.util.encoders.Base64;

/* loaded from: classes2.dex */
public class PemReader extends BufferedReader implements InterfaceC19140 {
    public static final String BEGIN = "-----BEGIN ";
    public static final String END = "-----END ";
    public static final String LAX_PEM_PARSING_SYSTEM_PROPERTY_NAME = "org.bouncycastle.pemreader.lax";
    public static final Logger LOG = Logger.getLogger(PemReader.class.getName());

    public PemReader(Reader reader) {
        super(reader);
    }

    private PemObject loadObject(String str) {
        String readLine;
        String m14172 = C4860.m14172(END, str, "-----");
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        while (true) {
            readLine = readLine();
            if (readLine == null) {
                break;
            }
            int indexOf = readLine.indexOf(58);
            if (indexOf >= 0) {
                arrayList.add(new PemHeader(readLine.substring(0, indexOf), readLine.substring(indexOf + 1).trim()));
            } else {
                if (System.getProperty(LAX_PEM_PARSING_SYSTEM_PROPERTY_NAME, "false").equalsIgnoreCase("true")) {
                    String trim = readLine.trim();
                    if (!trim.equals(readLine)) {
                        Logger logger = LOG;
                        Level level = Level.WARNING;
                        if (logger.isLoggable(level)) {
                            logger.log(level, "PEM object contains whitespaces on -----END line", (Throwable) new Exception("trace"));
                        }
                    }
                    readLine = trim;
                }
                if (readLine.indexOf(m14172) == 0) {
                    break;
                }
                stringBuffer.append(readLine.trim());
            }
        }
        if (readLine != null) {
            return new PemObject(str, arrayList, Base64.decode(stringBuffer.toString()));
        }
        throw new IOException(C16014.m37867(m14172, " not found"));
    }

    @Override // java.io.BufferedReader, l.InterfaceC19140
    public /* synthetic */ InterfaceC17664 lines() {
        return C5028.lines(this);
    }

    public PemObject readPemObject() {
        String readLine;
        String trim;
        int indexOf;
        do {
            readLine = readLine();
            if (readLine == null) {
                break;
            }
        } while (!readLine.startsWith(BEGIN));
        if (readLine == null || (indexOf = (trim = readLine.substring(11).trim()).indexOf(45)) <= 0 || !trim.endsWith("-----") || trim.length() - indexOf != 5) {
            return null;
        }
        return loadObject(trim.substring(0, indexOf));
    }
}
