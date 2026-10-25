package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: 88AQ */
/* renamed from: l.ۙۡ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4553 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC3163 f14523;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC22192 f14524;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f14529;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15249 f14530;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C8102 f14532;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ExecutorService f14535;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC13921 f14537;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f14538 = C4925.m14321();

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final List f14528 = C16895.m39756();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f14533 = new AtomicReference();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List f14527 = C16895.m39756();

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C4300 f14526 = new C4300(0);

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f14539 = new ThreadLocal();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC21601 f14534 = new C4586(false);

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f14531 = false;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C20076 f14536 = new C20076(this);

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f14525 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13402(InterfaceC21601 interfaceC21601) {
        this.f14534 = interfaceC21601;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m13405() {
        this.f14531 = true;
        this.f14534.mo13495();
    }

    /* JADX WARN: Removed duplicated region for block: B:189:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02bf  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13401(l.AbstractC13921 r8, l.AbstractC3163 r9, java.lang.String[] r10, java.lang.String r11, l.InterfaceC22192 r12) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4553.m13401(l.ܰܺܳ, l.ۗۢ᩻, java.lang.String[], java.lang.String, l.᩹ۡ᩻):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13392(AbstractC3163 abstractC3163, AbstractC1139 abstractC1139) {
        if (abstractC1139.m3888()) {
            String str = abstractC1139.m3910() + "/";
            Iterator it = this.f14525.iterator();
            while (it.hasNext()) {
                if (str.startsWith((String) it.next())) {
                    return;
                }
            }
            C0433 mo1983 = abstractC1139.mo1983();
            if (mo1983.m1986()) {
                Iterator it2 = mo1983.m1988().iterator();
                while (it2.hasNext()) {
                    m13392(abstractC3163, (AbstractC1139) it2.next());
                }
            } else {
                this.f14524.setTitle(R.string.MT_Protector_res_0x7f12087c);
                this.f14524.mo10100(abstractC1139.m3898());
                C10445.m26286(abstractC3163, mo1983);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m13396(AbstractC1139 abstractC1139) {
        AbstractC13921 abstractC13921 = this.f14537;
        if (abstractC13921 instanceof C2499) {
            abstractC1139.m3890().mo23552();
        } else if (abstractC13921 instanceof AbstractC3163) {
            ((AbstractC3163) abstractC13921).m9697(abstractC1139.m3910(), false);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 m13403() {
        return this.f14537;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC3163 m13404() {
        return this.f14523;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m13400() {
        return this.f14527;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13391(AbstractC1139 abstractC1139) {
        this.f14535.submit(new RunnableC18175(2, this, abstractC1139));
        if (abstractC1139.m3888()) {
            Iterator it = abstractC1139.mo1983().m1988().iterator();
            while (it.hasNext()) {
                m13391((AbstractC1139) it.next());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[Catch: all -> 0x02b9, Exception -> 0x02bb, Merged into TryCatch #2 {all -> 0x02b9, Exception -> 0x02bb, blocks: (B:13:0x0048, B:15:0x004c, B:17:0x0050, B:18:0x0058, B:20:0x005e, B:23:0x006a, B:25:0x0070, B:37:0x007f, B:39:0x0085, B:41:0x008b, B:43:0x0093, B:45:0x0097, B:47:0x00a0, B:49:0x00ac, B:50:0x00c6, B:52:0x00d3, B:54:0x00d9, B:57:0x00e8, B:60:0x00eb, B:62:0x00ef, B:64:0x00f7, B:65:0x0103, B:67:0x0109, B:69:0x0111, B:71:0x0115, B:73:0x0121, B:74:0x0130, B:76:0x0147, B:78:0x014d, B:81:0x015c, B:84:0x015f, B:86:0x0163, B:88:0x016b, B:89:0x0170, B:91:0x0176, B:93:0x0184, B:95:0x0188, B:97:0x0194, B:98:0x01e0, B:100:0x01e6, B:101:0x01a2, B:103:0x01b9, B:105:0x01bf, B:108:0x01ce, B:111:0x01d1, B:113:0x01d5, B:115:0x01dd, B:116:0x01ef, B:118:0x01f7, B:120:0x01fb, B:122:0x022e, B:123:0x023d, B:125:0x0249, B:127:0x0251, B:129:0x0259, B:130:0x0267, B:132:0x0279, B:134:0x0281, B:137:0x02bd, B:139:0x02c4), top: B:12:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x028f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[Catch: all -> 0x02b9, Exception -> 0x02bb, Merged into TryCatch #2 {all -> 0x02b9, Exception -> 0x02bb, blocks: (B:13:0x0048, B:15:0x004c, B:17:0x0050, B:18:0x0058, B:20:0x005e, B:23:0x006a, B:25:0x0070, B:37:0x007f, B:39:0x0085, B:41:0x008b, B:43:0x0093, B:45:0x0097, B:47:0x00a0, B:49:0x00ac, B:50:0x00c6, B:52:0x00d3, B:54:0x00d9, B:57:0x00e8, B:60:0x00eb, B:62:0x00ef, B:64:0x00f7, B:65:0x0103, B:67:0x0109, B:69:0x0111, B:71:0x0115, B:73:0x0121, B:74:0x0130, B:76:0x0147, B:78:0x014d, B:81:0x015c, B:84:0x015f, B:86:0x0163, B:88:0x016b, B:89:0x0170, B:91:0x0176, B:93:0x0184, B:95:0x0188, B:97:0x0194, B:98:0x01e0, B:100:0x01e6, B:101:0x01a2, B:103:0x01b9, B:105:0x01bf, B:108:0x01ce, B:111:0x01d1, B:113:0x01d5, B:115:0x01dd, B:116:0x01ef, B:118:0x01f7, B:120:0x01fb, B:122:0x022e, B:123:0x023d, B:125:0x0249, B:127:0x0251, B:129:0x0259, B:130:0x0267, B:132:0x0279, B:134:0x0281, B:137:0x02bd, B:139:0x02c4), top: B:12:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0103 A[Catch: all -> 0x02b9, Exception -> 0x02bb, Merged into TryCatch #2 {all -> 0x02b9, Exception -> 0x02bb, blocks: (B:13:0x0048, B:15:0x004c, B:17:0x0050, B:18:0x0058, B:20:0x005e, B:23:0x006a, B:25:0x0070, B:37:0x007f, B:39:0x0085, B:41:0x008b, B:43:0x0093, B:45:0x0097, B:47:0x00a0, B:49:0x00ac, B:50:0x00c6, B:52:0x00d3, B:54:0x00d9, B:57:0x00e8, B:60:0x00eb, B:62:0x00ef, B:64:0x00f7, B:65:0x0103, B:67:0x0109, B:69:0x0111, B:71:0x0115, B:73:0x0121, B:74:0x0130, B:76:0x0147, B:78:0x014d, B:81:0x015c, B:84:0x015f, B:86:0x0163, B:88:0x016b, B:89:0x0170, B:91:0x0176, B:93:0x0184, B:95:0x0188, B:97:0x0194, B:98:0x01e0, B:100:0x01e6, B:101:0x01a2, B:103:0x01b9, B:105:0x01bf, B:108:0x01ce, B:111:0x01d1, B:113:0x01d5, B:115:0x01dd, B:116:0x01ef, B:118:0x01f7, B:120:0x01fb, B:122:0x022e, B:123:0x023d, B:125:0x0249, B:127:0x0251, B:129:0x0259, B:130:0x0267, B:132:0x0279, B:134:0x0281, B:137:0x02bd, B:139:0x02c4), top: B:12:0x0048 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m13394(final l.C4553 r17, final l.AbstractC1139 r18) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4553.m13394(l.ۙۡ᩻, l.֨۬ܳ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13393(C4553 c4553, String str, AbstractC1139 abstractC1139) {
        try {
            if (c4553.f14523.mo9687()) {
                c4553.f14523.mo9700(abstractC1139.m3887(), str);
            }
        } catch (Exception unused) {
        }
    }
}
