package l;

import android.os.Message;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi;

/* compiled from: D18B */
/* renamed from: l.᩺᩵ܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C23202 implements InterfaceC7961, InterfaceC15071, InterfaceC8449, InterfaceC5146 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74584;

    public /* synthetic */ C23202(int i) {
        this.f74584 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m51496(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ long m51497(java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23202.m51497(java.lang.String):long");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51498(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51499(BouncyCastleProvider bouncyCastleProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        bouncyCastleProvider.addKeyInfoConverter(aSN1ObjectIdentifier, new SnovaKeyFactorySpi());
    }

    @Override // l.InterfaceC8449
    public InterfaceC15503 get() {
        int i = C16999.f52136;
        return null;
    }

    @Override // l.InterfaceC15071
    /* renamed from: ֫ */
    public Object mo25124(Object obj, Throwable th) {
        return null;
    }

    @Override // l.InterfaceC5146
    /* renamed from: ֫ */
    public void mo7068(Object obj, Message message) {
        C22202.m49873((C22202) obj);
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        InterfaceC1131 interfaceC1131 = (InterfaceC1131) obj;
        switch (this.f74584) {
            case 4:
                interfaceC1131.getClass();
                break;
            default:
                interfaceC1131.getClass();
                break;
        }
    }
}
