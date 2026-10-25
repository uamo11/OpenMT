package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import l.C0794;
import l.InterfaceC14905;

/* loaded from: classes.dex */
public class ConstructedOctetStream extends InputStream implements InterfaceC14905 {
    public InputStream _currentStream;
    public boolean _first = true;
    public final ASN1StreamParser _parser;

    public ConstructedOctetStream(ASN1StreamParser aSN1StreamParser) {
        this._parser = aSN1StreamParser;
    }

    private ASN1OctetStringParser getNextParser() {
        ASN1Encodable readObject = this._parser.readObject();
        if (readObject == null) {
            return null;
        }
        if (readObject instanceof ASN1OctetStringParser) {
            return (ASN1OctetStringParser) readObject;
        }
        throw new IOException("unknown object encountered: " + readObject.getClass());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x002b -> B:11:0x002f). Please report as a decompilation issue!!! */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read() {
        /*
            r4 = this;
            java.io.InputStream r0 = r4._currentStream
            r1 = -1
            if (r0 != 0) goto L17
            boolean r0 = r4._first
            if (r0 != 0) goto La
            return r1
        La:
            org.bouncycastle.asn1.ASN1OctetStringParser r0 = r4.getNextParser()
            if (r0 != 0) goto L11
            return r1
        L11:
            r2 = 0
            r4._first = r2
            r2 = -1
            r1 = r4
            goto L2f
        L17:
            r0 = r4
        L18:
            java.io.InputStream r2 = r0._currentStream
            int r2 = r2.read()
            if (r2 < 0) goto L21
            return r2
        L21:
            org.bouncycastle.asn1.ASN1OctetStringParser r2 = r0.getNextParser()
            if (r2 != 0) goto L2b
            r2 = 0
            r0._currentStream = r2
            return r1
        L2b:
            r3 = r1
            r1 = r0
            r0 = r2
            r2 = r3
        L2f:
            java.io.InputStream r0 = r0.getOctetStream()
            r1._currentStream = r0
            r0 = r1
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ConstructedOctetStream.read():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0037 -> B:11:0x003c). Please report as a decompilation issue!!! */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(byte[] r8, int r9, int r10) {
        /*
            r7 = this;
            java.io.InputStream r0 = r7._currentStream
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L18
            boolean r0 = r7._first
            if (r0 != 0) goto Lb
            return r2
        Lb:
            org.bouncycastle.asn1.ASN1OctetStringParser r0 = r7.getNextParser()
            if (r0 != 0) goto L12
            return r2
        L12:
            r7._first = r1
            r2 = 0
            r3 = -1
            r1 = r7
            goto L3c
        L18:
            r0 = r7
        L19:
            java.io.InputStream r3 = r0._currentStream
            int r4 = r9 + r1
            int r5 = r10 - r1
            int r3 = r3.read(r8, r4, r5)
            if (r3 < 0) goto L29
            int r1 = r1 + r3
            if (r1 != r10) goto L19
            return r1
        L29:
            org.bouncycastle.asn1.ASN1OctetStringParser r3 = r0.getNextParser()
            if (r3 != 0) goto L37
            r8 = 0
            r0._currentStream = r8
            r8 = 1
            if (r1 >= r8) goto L36
            return r2
        L36:
            return r1
        L37:
            r6 = r1
            r1 = r0
            r0 = r3
            r3 = r2
            r2 = r6
        L3c:
            java.io.InputStream r0 = r0.getOctetStream()
            r1._currentStream = r0
            r0 = r1
            r1 = r2
            r2 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ConstructedOctetStream.read(byte[], int, int):int");
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }
}
