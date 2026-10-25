package l;

import com.alipay.sdk.m.w.a;
import java.io.DataOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;

/* compiled from: C9Z9 */
/* renamed from: l.ܶ᩷᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15485 extends AbstractC22542 {

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f47364 = C11321.m27962(C15485.class.getName());

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f47365;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f47366;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f47367;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f47368;

    @Override // l.AbstractC22542
    /* renamed from: ᩴ */
    public final boolean mo2721() {
        return true;
    }

    public C15485(String str, EnumC5983 enumC5983, boolean z, int i, int i2, int i3, int i4, String str2) {
        super(str, EnumC11628.TYPE_SRV, enumC5983, z, i);
        this.f47367 = i2;
        this.f47365 = i3;
        this.f47366 = i4;
        this.f47368 = str2;
    }

    @Override // l.AbstractC22542
    /* renamed from: ֫ */
    public final void mo2717(C17603 c17603) {
        c17603.writeShort(this.f47367);
        c17603.writeShort(this.f47365);
        c17603.writeShort(this.f47366);
        boolean z = C11254.f33725;
        String str = this.f47368;
        if (z) {
            c17603.m41143(str);
        } else {
            c17603.m41145(str.length(), str);
            c17603.writeByte(0);
        }
    }

    @Override // l.AbstractC13660
    /* renamed from: ֫ */
    public final void mo32823(DataOutputStream dataOutputStream) {
        super.mo32823(dataOutputStream);
        dataOutputStream.writeShort(this.f47367);
        dataOutputStream.writeShort(this.f47365);
        dataOutputStream.writeShort(this.f47366);
        try {
            dataOutputStream.write(this.f47368.getBytes(a.D));
        } catch (UnsupportedEncodingException unused) {
        }
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m36568() {
        return this.f47368;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m36566() {
        return this.f47367;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m36567() {
        return this.f47365;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m36569() {
        return this.f47366;
    }

    @Override // l.AbstractC22542
    /* renamed from: ܽ */
    public final boolean mo2720(AbstractC22542 abstractC22542) {
        if (!(abstractC22542 instanceof C15485)) {
            return false;
        }
        C15485 c15485 = (C15485) abstractC22542;
        return this.f47367 == c15485.f47367 && this.f47365 == c15485.f47365 && this.f47366 == c15485.f47366 && this.f47368.equals(c15485.f47368);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r14.f47368.equalsIgnoreCase(r15.m22739().f23907) == false) goto L12;
     */
    @Override // l.AbstractC22542
    /* renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo2718(l.C8806 r15) {
        /*
            r14 = this;
            java.util.concurrent.ConcurrentMap r0 = r15.m22751()
            java.lang.String r1 = r14.m32822()
            l.ۧۤᩴ r0 = (l.ConcurrentMapC10942) r0
            java.lang.Object r0 = r0.get(r1)
            l.᩶ۢ᩵ r0 = (l.C20095) r0
            r1 = 0
            if (r0 == 0) goto Le0
            boolean r2 = r0.m46337()
            if (r2 != 0) goto L1f
            boolean r2 = r0.m46332()
            if (r2 == 0) goto Le0
        L1f:
            int r2 = r14.f47366
            int r3 = r0.mo25454()
            if (r2 != r3) goto L35
            l.۟᩷᩵ r2 = r15.m22739()
            java.lang.String r2 = r2.f23907
            java.lang.String r3 = r14.f47368
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 != 0) goto Le0
        L35:
            java.lang.String r2 = "handleQuery() Conflicting probe detected from: {}"
            java.net.InetAddress r3 = r14.m50545()
            l.֫᩻֨ r4 = l.C15485.f47364
            r4.mo7100(r3, r2)
            l.ܶ᩷᩵ r2 = new l.ܶ᩷᩵
            java.lang.String r6 = r0.mo25450()
            l.ۛۢ᩵ r7 = l.EnumC5983.CLASS_IN
            int r9 = l.C13038.f39042
            int r10 = r0.mo25458()
            int r11 = r0.mo25453()
            int r12 = r0.mo25454()
            l.۟᩷᩵ r3 = r15.m22739()
            java.lang.String r13 = r3.f23907
            r8 = 1
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            java.net.InetAddress r3 = r15.m22765()     // Catch: java.io.IOException -> L7d
            java.net.InetAddress r5 = r14.m50545()     // Catch: java.io.IOException -> L7d
            boolean r3 = r3.equals(r5)     // Catch: java.io.IOException -> L7d
            if (r3 == 0) goto L83
            java.lang.String r3 = "Got conflicting probe from ourselves\nincoming: {}\nlocal   : {}"
            java.lang.String r5 = r14.toString()     // Catch: java.io.IOException -> L7d
            java.lang.String r6 = r2.toString()     // Catch: java.io.IOException -> L7d
            r4.mo7098(r3, r5, r6)     // Catch: java.io.IOException -> L7d
            goto L83
        L7d:
            r3 = move-exception
            java.lang.String r5 = "IOException"
            r4.mo7083(r5, r3)
        L83:
            int r2 = r14.m32821(r2)
            if (r2 != 0) goto L8f
            java.lang.String r15 = "handleQuery() Ignoring a identical service query"
            r4.mo7088(r15)
            return r1
        L8f:
            boolean r3 = r0.m46339()
            if (r3 == 0) goto Le0
            if (r2 <= 0) goto Le0
            java.lang.String r1 = r0.mo25450()
            java.lang.String r1 = r1.toLowerCase()
            l.֨ۢ᩵ r2 = l.C19390.m44664()
            l.۟᩷᩵ r3 = r15.m22739()
            java.net.InetAddress r3 = r3.f23908
            java.lang.String r3 = r0.getName()
            l.֡ۢ᩵ r5 = l.EnumC0338.SERVICE
            l.ۚۢ᩵ r2 = (l.C5278) r2
            java.lang.String r2 = r2.m15205(r3, r5)
            r0.m46323(r2)
            java.util.concurrent.ConcurrentMap r2 = r15.m22751()
            l.ۧۤᩴ r2 = (l.ConcurrentMapC10942) r2
            r2.remove(r1)
            java.util.concurrent.ConcurrentMap r15 = r15.m22751()
            java.lang.String r1 = r0.mo25450()
            java.lang.String r1 = r1.toLowerCase()
            l.ۧۤᩴ r15 = (l.ConcurrentMapC10942) r15
            r15.put(r1, r0)
            java.lang.String r15 = "handleQuery() Lost tie break: new unique name chosen:{}"
            java.lang.String r1 = r0.getName()
            r4.mo7100(r1, r15)
            r0.m46330()
            r15 = 1
            return r15
        Le0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15485.mo2718(l.ۡۢ᩵):boolean");
    }

    @Override // l.AbstractC22542
    /* renamed from: ܽ */
    public final boolean mo2719(C8806 c8806) {
        C20095 c20095 = (C20095) ((ConcurrentMapC10942) c8806.m22751()).get(m32822());
        if (c20095 == null) {
            return false;
        }
        if (this.f47366 == c20095.mo25454()) {
            if (this.f47368.equalsIgnoreCase(c8806.m22739().f23907)) {
                return false;
            }
        }
        InterfaceC2148 interfaceC2148 = f47364;
        interfaceC2148.mo7088("handleResponse() Denial detected");
        if (c20095.m46339()) {
            String lowerCase = c20095.mo25450().toLowerCase();
            InterfaceC1044 m44664 = C19390.m44664();
            InetAddress inetAddress = c8806.m22739().f23908;
            c20095.m46323(((C5278) m44664).m15205(c20095.getName(), EnumC0338.SERVICE));
            ((ConcurrentMapC10942) c8806.m22751()).remove(lowerCase);
            ((ConcurrentMapC10942) c8806.m22751()).put(c20095.mo25450().toLowerCase(), c20095);
            interfaceC2148.mo7100(c20095.getName(), "handleResponse() New unique name chose:{}");
        }
        c20095.m46330();
        return true;
    }

    @Override // l.AbstractC22542
    /* renamed from: ֫ */
    public final C20095 mo2715(boolean z) {
        return new C20095(C20195.unmodifiableMap(this.f40739), this.f47366, this.f47365, this.f47367, z, null);
    }

    @Override // l.AbstractC22542
    /* renamed from: ֫ */
    public final C15154 mo2714(C8806 c8806) {
        C20095 mo2715 = mo2715(false);
        mo2715.m46326(c8806);
        return new C15154(c8806, mo2715.mo25446(), mo2715.getName(), mo2715);
    }

    @Override // l.AbstractC22542, l.AbstractC13660
    /* renamed from: ֫ */
    public final void mo2716(StringBuilder sb) {
        super.mo2716(sb);
        sb.append(" server: '");
        sb.append(this.f47368);
        sb.append(':');
        sb.append(this.f47366);
        sb.append('\'');
    }
}
