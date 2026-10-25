package l;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;

/* compiled from: D9HP */
/* renamed from: l.ܺ۬ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15948 extends FilterOutputStream {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8377 f49237;

    public C15948(C8377 c8377, ByteArrayOutputStream byteArrayOutputStream) {
        super(byteArrayOutputStream);
        this.f49237 = c8377;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37722(AbstractC5366 abstractC5366) {
        AbstractC11716 m15330 = abstractC5366.m15330();
        write((byte) (m15330.m28612() | m15330.m28611().getValue() | m15330.m28609().getValue()));
        AbstractC18772 mo3870 = abstractC5366.m15330().mo3870(this.f49237);
        int mo13606 = mo3870.mo13606(abstractC5366);
        if (mo13606 < 127) {
            write(mo13606);
        } else {
            int i = 1;
            for (int i2 = mo13606; i2 > 255; i2 >>= 8) {
                i++;
            }
            write(i | 128);
            while (i > 0) {
                write(mo13606 >> ((i - 1) * 8));
                i--;
            }
        }
        mo3870.mo13607(abstractC5366, this);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }
}
