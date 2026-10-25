package l;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* compiled from: F1U0 */
/* renamed from: l.ۜۙۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6535 implements InterfaceC2548 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17824 f20180;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9358 f20181;

    public C6535(C17824 c17824, C15972 c15972, C9358 c9358) {
        this.f20180 = c17824;
        this.f20181 = c9358;
    }

    @Override // l.InterfaceC2548
    /* renamed from: ֫ */
    public final void mo3143(C2966 c2966, C12843 c12843) {
        m18041(c2966, c12843, true);
    }

    @Override // l.InterfaceC2548
    /* renamed from: ֫ */
    public final void mo3142(C2966 c2966, C10022 c10022) {
        if (C22927.m51032(c10022.m13109())) {
            return;
        }
        m18041(c2966, c10022, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18041(C2966 c2966, AbstractC12138 abstractC12138, boolean z) {
        String str;
        String sb;
        String m13109 = abstractC12138.m13109();
        C17824 c17824 = this.f20180;
        AbstractC16412 abstractC16412 = C10769.f32418;
        Map map = (Map) c17824.get(abstractC16412);
        if (map == null) {
            map = new HashMap();
            c17824.put(abstractC16412, map);
        }
        String m24169 = C9358.m24169(abstractC12138);
        String str2 = (String) map.get(m24169);
        if (str2 == null || m13109.equals(str2)) {
            return;
        }
        if (C15706.m37039(abstractC12138) instanceof C20647) {
            AbstractC16412 m13108 = abstractC12138.m13108();
            StringBuilder sb2 = new StringBuilder("Warning: ");
            sb2.append(c2966.m45794().replace('/', '.'));
            if (z) {
                StringBuilder sb3 = new StringBuilder(": field '");
                sb3.append("" + C22927.m51029(m13108.mo5456()) + ' ' + m13109);
                sb = sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder(": method '");
                String m45794 = c2966.m45794();
                String mo5456 = m13108.mo5456();
                StringBuilder sb5 = new StringBuilder("");
                if (m13109.equals("<init>")) {
                    String replace = m45794.replace('/', '.');
                    str = replace.substring(replace.lastIndexOf(46) + 1);
                } else {
                    str = C22927.m51029(mo5456.substring(mo5456.indexOf(41) + 1)) + ' ' + m13109;
                }
                sb5.append(str);
                sb5.append('(');
                sb5.append(C22927.m51021(mo5456));
                sb5.append(')');
                sb4.append(sb5.toString());
                sb = sb4.toString();
            }
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb2, sb, "' can't be mapped to '", m24169, "' because it would conflict with ");
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb2, z ? "field '" : "method '", str2, "', which is already being mapped to '", m24169);
            sb2.append("'");
        }
        C15706.m37039(abstractC12138).mo13103(null);
        abstractC12138.mo13106(c2966, this.f20181);
    }
}
