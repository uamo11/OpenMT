package l;

import java.io.PrintStream;
import java.io.PrintWriter;

/* compiled from: M5SW */
/* renamed from: l.ܶ᩵ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C15431 extends RuntimeException {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public StringBuffer f47244;

    public C15431(Exception exc) {
        this(exc, null, new Object[0]);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15431 m36467(Exception exc, String str, Object... objArr) {
        C15431 c15431;
        if (exc instanceof C15431) {
            c15431 = (C15431) exc;
        } else {
            c15431 = new C15431(exc);
        }
        String format = String.format(str, objArr);
        StringBuffer stringBuffer = c15431.f47244;
        if (format == null) {
            throw new NullPointerException("str == null");
        }
        stringBuffer.append(format);
        if (!format.endsWith("\n")) {
            stringBuffer.append('\n');
        }
        return c15431;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C15431(java.lang.Exception r2, java.lang.String r3, java.lang.Object... r4) {
        /*
            r1 = this;
            if (r3 == 0) goto L7
            java.lang.String r3 = java.lang.String.format(r3, r4)
            goto Lf
        L7:
            if (r2 == 0) goto Le
            java.lang.String r3 = r2.getMessage()
            goto Lf
        Le:
            r3 = 0
        Lf:
            r1.<init>(r3, r2)
            boolean r3 = r2 instanceof l.C15431
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 == 0) goto L30
            l.ܶ᩵ۚ r2 = (l.C15431) r2
            java.lang.StringBuffer r2 = r2.f47244
            java.lang.String r2 = r2.toString()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            int r0 = r2.length()
            int r0 = r0 + r4
            r3.<init>(r0)
            r1.f47244 = r3
            r3.append(r2)
            return
        L30:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>(r4)
            r1.f47244 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15431.<init>(java.lang.Exception, java.lang.String, java.lang.Object[]):void");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f47244);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f47244);
    }
}
