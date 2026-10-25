package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: W8NJ */
/* renamed from: l.ܿܶ֫, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C17420 extends C22154 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f53280;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17420 m40765(IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !C15107.m35799(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        if (i2 != 2007) {
            return new C17420(iOException, i2, i);
        }
        return new C18126(2007, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted");
    }

    public C17420() {
        super(2008);
        this.f53280 = 1;
    }

    public C17420(String str, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.f53280 = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C17420(java.io.IOException r2, int r3, int r4) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r3 != r0) goto L9
            r0 = 1
            if (r4 != r0) goto L9
            r3 = 2001(0x7d1, float:2.804E-42)
        L9:
            r1.<init>(r3, r2)
            r1.f53280 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17420.<init>(java.io.IOException, int, int):void");
    }

    public C17420(int i, IOException iOException, String str) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.f53280 = 1;
    }
}
