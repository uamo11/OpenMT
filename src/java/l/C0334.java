package l;

import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: T5RH */
/* renamed from: l.֡ۢܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0334 implements InterfaceC2452 {
    @Override // l.InterfaceC2452
    /* renamed from: ֫ */
    public final void mo1728(C16040 c16040) {
        byte[] bArr;
        try {
            byte[] bArr2 = (byte[]) ((C11955) c16040.m37919()).m29175();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr2);
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (Exception unused) {
            bArr = new byte[0];
        }
        C11955 c11955 = new C11955();
        c11955.m29154(bArr);
        c16040.m37918(c11955);
    }
}
