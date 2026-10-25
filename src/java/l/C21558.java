package l;

import java.io.File;
import java.io.IOException;

/* compiled from: FATD */
/* renamed from: l.᩸ۨۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21558 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C10678 f69271 = C10678.m26789(new File(C16293.f50110.m36526("axmls").mo23554()), 26101061, 1, 2097152);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m48712(String str) {
        try {
            C1505 m26800 = f69271.m26800(str);
            if (m26800 != null) {
                return C23852.m52567(m26800.m5185(0)).mo12306();
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48711(String str, byte[] bArr) {
        C13680 c13680 = null;
        try {
            c13680 = f69271.m26796(str);
            if (c13680 == null) {
                return;
            }
            InterfaceC10405 m52568 = C23852.m52568(c13680.m32917(0));
            m52568.write(bArr);
            m52568.close();
            c13680.m32919();
        } catch (IOException unused) {
            if (c13680 != null) {
                try {
                    c13680.m32918();
                } catch (IOException unused2) {
                }
            }
        }
    }
}
