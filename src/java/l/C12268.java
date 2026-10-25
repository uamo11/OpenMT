package l;

import bin.mt.plus.R;
import java.util.concurrent.CancellationException;

/* compiled from: 66VE */
/* renamed from: l.۫۟ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12268 {
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m29803(C12164 c12164) {
        m29800();
        boolean find = c12164.find();
        m29801(c12164);
        return find;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29802(C12164 c12164, int i) {
        m29800();
        boolean find = c12164.find(i);
        m29801(c12164);
        return find;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29801(C12164 c12164) {
        m29800();
        if (c12164.m29603()) {
            throw new C14501(R.string.MT_Protector_res_0x7f120a69);
        }
        if (c12164.m29613()) {
            throw new C14501(R.string.MT_Protector_res_0x7f120a68);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29800() {
        if (Thread.currentThread().isInterrupted()) {
            throw new CancellationException("Search canceled");
        }
    }
}
