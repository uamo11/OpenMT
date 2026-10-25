package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Future;

/* compiled from: NB3C */
/* renamed from: l.ܿ᩸ᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C17622 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int f53839 = 20000000;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static CharSequence f53840;

    /* renamed from: ܳܶܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f53841;

    static {
        ApplicationC12518.m30701(135);
        f53841 = new short[]{3872, -32164, -32256, -32179, -32190, -32177, -32163, -32163, -32153, -32190, -32190, -32181, -32183, -32177, -32190, -32242, -32163, -32181, -32181, -32187, -32256, -32170, -32189, -32190, -32164, -32181, -32163, -32191, -32165, -32164, -32179, -32181, -32163, -32256, -32177, -32164, -32163, -32179, -32149, -32131, -32130, -32153, -32130, -32149};
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static native C11273 m41184(AbstractC3322 abstractC3322, boolean z, int i, InterfaceC17066 interfaceC17066, boolean z2);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11273 m41182() {
        CharSequence charSequence = f53840;
        if (charSequence != null) {
            f53840 = null;
        } else {
            charSequence = "";
        }
        return new C11273("\n", charSequence, 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11273 m41185(C4733 c4733, int i, InterfaceC17066 interfaceC17066) {
        return m41184(c4733, false, i, interfaceC17066, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11273 m41183(AbstractC3322 abstractC3322, boolean z, int i, InterfaceC17066 interfaceC17066) {
        return m41184(abstractC3322, z, i, interfaceC17066, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x024a A[Catch: all -> 0x02a8, LOOP:5: B:141:0x0244->B:143:0x024a, LOOP_END, TryCatch #8 {all -> 0x02a8, blocks: (B:78:0x0256, B:79:0x0263, B:81:0x0269, B:89:0x0273, B:90:0x0288, B:152:0x0220, B:153:0x0227, B:155:0x022d, B:157:0x0237, B:158:0x023c, B:140:0x023d, B:141:0x0244, B:143:0x024a, B:145:0x0254, B:130:0x0289, B:131:0x0290, B:133:0x0296, B:26:0x00d4, B:27:0x00df, B:30:0x00e7, B:37:0x0173, B:50:0x0195, B:51:0x019d, B:54:0x0199, B:57:0x01a2, B:59:0x00f8, B:61:0x00fe, B:63:0x0105, B:65:0x010b, B:70:0x0137, B:72:0x014a, B:74:0x015b, B:75:0x015f, B:91:0x0141, B:93:0x0146, B:95:0x0167, B:96:0x016c, B:104:0x01c6, B:105:0x01e7, B:106:0x01eb, B:108:0x01f1, B:110:0x01f7, B:117:0x01fd, B:118:0x0204, B:120:0x0205, B:124:0x0214), top: B:23:0x0093, outer: #12, inners: #11, #11, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b9 A[SYNTHETIC] */
    @l.InterfaceC12992
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C11273 m41186(l.InterfaceC18328 r19, int r20, l.InterfaceC17066 r21) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17622.m41186(l.ᩳ᩸ᩳ, int, l.ܿۖ᩷):l.ۧ᩸ᩳ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41187(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Future future = (Future) it.next();
            future.cancel(true);
            try {
                future.get();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41188(AbstractC15440 abstractC15440, CharSequence charSequence) {
        int length = charSequence.length();
        C13533 c13533 = new C13533(new C2951(new C10007(abstractC15440.mo23555(false))));
        try {
            c13533.append(charSequence, 0, length);
            c13533.close();
        } catch (Throwable th) {
            try {
                c13533.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
