package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;

/* compiled from: Z8WX */
/* renamed from: l.ܰۜۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13651 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f40718 = C16293.f50110.m36526("tc");

    static {
        C4925.m14315(new RunnableC22365(1));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32801() {
        AbstractC15440 abstractC15440 = f40718;
        abstractC15440.m36526(am.aC).mo23552();
        abstractC15440.m36526("o").mo23552();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m32804(boolean z) {
        AbstractC15440 m36526 = f40718.m36526("o");
        byte[] bArr = null;
        if (!z && m36526.mo23120()) {
            try {
                C12951 m36528 = m36526.m36528();
                if (Math.abs(System.currentTimeMillis() - m36528.readLong()) < 3600000) {
                    bArr = m36528.m31496();
                }
            } catch (Exception unused) {
            }
        }
        if (bArr == null) {
            C23881 m42496 = C18237.m42480(4209).m42496();
            if (m42496.m52607()) {
                bArr = m42496.m52614();
                try {
                    C10130 c10130 = new C10130();
                    c10130.m25431(System.currentTimeMillis());
                    c10130.m25434(bArr);
                    m36526.m36496(c10130);
                } catch (Exception unused2) {
                }
            } else {
                throw new C19401(C1575.m5392(m42496, R.string.MT_Protector_res_0x7f120520));
            }
        }
        C12951 m31485 = C12951.m31485(bArr);
        ArrayList arrayList = new ArrayList();
        int readInt = m31485.readInt();
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new C2364(m31485));
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m32800(boolean z) {
        AbstractC15440 m36526 = f40718.m36526(am.aC);
        byte[] bArr = null;
        if (!z && m36526.mo23120()) {
            try {
                C12951 m36528 = m36526.m36528();
                if (Math.abs(System.currentTimeMillis() - m36528.readLong()) < 3600000) {
                    bArr = m36528.m31496();
                }
            } catch (Exception unused) {
            }
        }
        if (bArr == null) {
            C18237 m42480 = C18237.m42480(4199);
            C23881 m42496 = C23196.m51460() ? m42480.m42496() : m42480.m42497();
            if (m42496.m52607()) {
                bArr = m42496.m52614();
                try {
                    C10130 c10130 = new C10130();
                    c10130.m25431(System.currentTimeMillis());
                    c10130.m25434(bArr);
                    m36526.m36496(c10130);
                } catch (Exception unused2) {
                }
            } else {
                throw new C19401(C1575.m5392(m42496, R.string.MT_Protector_res_0x7f120520));
            }
        }
        C12951 m31485 = C12951.m31485(bArr);
        int readInt = m31485.readInt();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new C18592(m31485));
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m32803(int i, String str) {
        AbstractC15440 m36526 = f40718.m36526("d" + i);
        if (!m36526.mo23120()) {
            return null;
        }
        try {
            C12951 m36528 = m36526.m36528();
            if (m36528.m31506().equals(str)) {
                return m36528.m31496();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m32802(int i) {
        AbstractC15440 m36526 = f40718.m36526("d" + i);
        C18237 m42480 = C18237.m42480(4200);
        m42480.m42490(i);
        C23881 m42496 = C23196.m51460() ? m42480.m42496() : m42480.m42497();
        if (m42496.m52607()) {
            String[] strArr = {m42496.m52602(), m42496.m52602()};
            byte[] m11706 = C3878.m11706(strArr[0]);
            try {
                m36526.mo35195();
                C10130 c10130 = new C10130();
                c10130.m25439(strArr[1]);
                c10130.m25434(m11706);
                m36526.m36496(c10130);
            } catch (Exception unused) {
            }
            return m11706;
        }
        throw new C19401(C1575.m5392(m42496, R.string.MT_Protector_res_0x7f120520));
    }
}
