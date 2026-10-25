package org.bouncycastle.util.io.pem;

import java.io.BufferedWriter;
import java.io.Writer;
import l.C20094;
import l.C23202;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Base64;

/* loaded from: classes2.dex */
public class PemWriter extends BufferedWriter {
    public static final int LINE_LENGTH = 64;
    public char[] buf;
    public final int nlLength;

    public PemWriter(Writer writer) {
        super(writer);
        this.buf = new char[64];
        String lineSeparator = Strings.lineSeparator();
        this.nlLength = lineSeparator != null ? lineSeparator.length() : 2;
    }

    private void writeEncoded(byte[] bArr) {
        char[] cArr;
        int i;
        byte[] encode = Base64.encode(bArr);
        int i2 = 0;
        while (i2 < encode.length) {
            int i3 = 0;
            while (true) {
                cArr = this.buf;
                if (i3 != cArr.length && (i = i2 + i3) < encode.length) {
                    cArr[i3] = (char) encode[i];
                    i3++;
                }
            }
            write(cArr, 0, i3);
            newLine();
            i2 += this.buf.length;
        }
    }

    private void writePostEncapsulationBoundary(String str) {
        write(PemReader.END + str + "-----");
        newLine();
    }

    private void writePreEncapsulationBoundary(String str) {
        write(PemReader.BEGIN + str + "-----");
        newLine();
    }

    public int getOutputSize(PemObject pemObject) {
        int m46314 = C20094.m46314(pemObject.getType().length() + 10, this.nlLength, 2, 10);
        if (!pemObject.getHeaders().isEmpty()) {
            for (PemHeader pemHeader : pemObject.getHeaders()) {
                m46314 += pemHeader.getValue().length() + pemHeader.getName().length() + 2 + this.nlLength;
            }
            m46314 += this.nlLength;
        }
        int length = ((pemObject.getContent().length + 2) / 3) * 4;
        return C23202.m51496((length + 63) / 64, this.nlLength, length, m46314);
    }

    public void writeObject(PemObjectGenerator pemObjectGenerator) {
        PemObject generate = pemObjectGenerator.generate();
        writePreEncapsulationBoundary(generate.getType());
        if (!generate.getHeaders().isEmpty()) {
            for (PemHeader pemHeader : generate.getHeaders()) {
                write(pemHeader.getName());
                write(": ");
                write(pemHeader.getValue());
                newLine();
            }
            newLine();
        }
        writeEncoded(generate.getContent());
        writePostEncapsulationBoundary(generate.getType());
    }
}
