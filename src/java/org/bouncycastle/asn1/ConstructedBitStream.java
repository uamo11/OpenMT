package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import l.C0794;
import l.InterfaceC14905;

/* loaded from: classes.dex */
public class ConstructedBitStream extends InputStream implements InterfaceC14905 {
    public ASN1BitStringParser _currentParser;
    public InputStream _currentStream;
    public final boolean _octetAligned;
    public final ASN1StreamParser _parser;
    public boolean _first = true;
    public int _padBits = 0;

    public ConstructedBitStream(ASN1StreamParser aSN1StreamParser, boolean z) {
        this._parser = aSN1StreamParser;
        this._octetAligned = z;
    }

    private ASN1BitStringParser getNextParser() {
        ASN1Encodable readObject = this._parser.readObject();
        if (readObject == null) {
            if (!this._octetAligned || this._padBits == 0) {
                return null;
            }
            throw new IOException("expected octet-aligned bitstring, but found padBits: " + this._padBits);
        }
        if (readObject instanceof ASN1BitStringParser) {
            if (this._padBits == 0) {
                return (ASN1BitStringParser) readObject;
            }
            throw new IOException("only the last nested bitstring can have padding");
        }
        throw new IOException("unknown object encountered: " + readObject.getClass());
    }

    public int getPadBits() {
        return this._padBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0037 -> B:11:0x003b). Please report as a decompilation issue!!! */
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
            if (r0 != 0) goto L19
            boolean r0 = r4._first
            if (r0 != 0) goto La
            return r1
        La:
            org.bouncycastle.asn1.ASN1BitStringParser r0 = r4.getNextParser()
            r4._currentParser = r0
            if (r0 != 0) goto L13
            return r1
        L13:
            r2 = 0
            r4._first = r2
            r2 = -1
            r1 = r4
            goto L3b
        L19:
            r0 = r4
        L1a:
            java.io.InputStream r2 = r0._currentStream
            int r2 = r2.read()
            if (r2 < 0) goto L23
            return r2
        L23:
            org.bouncycastle.asn1.ASN1BitStringParser r2 = r0._currentParser
            int r2 = r2.getPadBits()
            r0._padBits = r2
            org.bouncycastle.asn1.ASN1BitStringParser r2 = r0.getNextParser()
            r0._currentParser = r2
            if (r2 != 0) goto L37
            r2 = 0
            r0._currentStream = r2
            return r1
        L37:
            r3 = r1
            r1 = r0
            r0 = r2
            r2 = r3
        L3b:
            java.io.InputStream r0 = r0.getBitStream()
            r1._currentStream = r0
            r0 = r1
            r1 = r2
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ConstructedBitStream.read():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0043 -> B:11:0x0048). Please report as a decompilation issue!!! */
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
            if (r0 != 0) goto L1a
            boolean r0 = r7._first
            if (r0 != 0) goto Lb
            return r2
        Lb:
            org.bouncycastle.asn1.ASN1BitStringParser r0 = r7.getNextParser()
            r7._currentParser = r0
            if (r0 != 0) goto L14
            return r2
        L14:
            r7._first = r1
            r2 = 0
            r3 = -1
            r1 = r7
            goto L48
        L1a:
            r0 = r7
        L1b:
            java.io.InputStream r3 = r0._currentStream
            int r4 = r9 + r1
            int r5 = r10 - r1
            int r3 = r3.read(r8, r4, r5)
            if (r3 < 0) goto L2b
            int r1 = r1 + r3
            if (r1 != r10) goto L1b
            return r1
        L2b:
            org.bouncycastle.asn1.ASN1BitStringParser r3 = r0._currentParser
            int r3 = r3.getPadBits()
            r0._padBits = r3
            org.bouncycastle.asn1.ASN1BitStringParser r3 = r0.getNextParser()
            r0._currentParser = r3
            if (r3 != 0) goto L43
            r8 = 0
            r0._currentStream = r8
            r8 = 1
            if (r1 >= r8) goto L42
            return r2
        L42:
            return r1
        L43:
            r6 = r1
            r1 = r0
            r0 = r3
            r3 = r2
            r2 = r6
        L48:
            java.io.InputStream r0 = r0.getBitStream()
            r1._currentStream = r0
            r0 = r1
            r1 = r2
            r2 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ConstructedBitStream.read(byte[], int, int):int");
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }
}
