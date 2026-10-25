package l;

import bin.mt.plus.R;
import java.util.Arrays;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.IInArchive;
import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: CB5W */
/* renamed from: l.۫ۤܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12347 extends C3695 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C12347 f36981 = new C12347();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12347 m29966() {
        return f36981;
    }

    @Override // l.C3695
    /* renamed from: ֫ */
    public final String mo9349(InterfaceC17889 interfaceC17889, int i) {
        return m29964(((C10231) interfaceC17889).m25859());
    }

    @Override // l.C3695, l.InterfaceC10834
    /* renamed from: ۧ */
    public final int mo9351(InterfaceC17889 interfaceC17889) {
        if (interfaceC17889.mo36969()) {
            return m29965(((C10231) interfaceC17889).m25859());
        }
        return 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m29965(C4007 c4007) {
        if (!c4007.m12076() && !c4007.m12075()) {
            String m7304 = C2204.m7304(c4007.m12085());
            long m12074 = c4007.m12074();
            if (m7304.equals("image/svg+xml")) {
                return m12074 <= 819200 ? 2 : 0;
            }
            if (m7304.equals("text/xml")) {
                return m12074 <= 153600 ? 3 : 0;
            }
            if (m7304.startsWith("image/") && m12074 <= X931RNG.BLOCK128_RESEED_MAX) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v9, types: [l.۟ۡۡ] */
    @Override // l.C3695, l.InterfaceC10834
    /* renamed from: ֫ */
    public final C11813 mo9350(AbstractC16891 abstractC16891, InterfaceC17889 interfaceC17889, int i) {
        IInArchive iInArchive;
        String m29964;
        IInArchive iInArchive2;
        C5168 c5168 = (C5168) abstractC16891;
        C10231 c10231 = (C10231) interfaceC17889;
        IInArchive iInArchive3 = null;
        try {
            iInArchive = c5168.m14825();
        } catch (Throwable unused) {
            iInArchive = null;
        }
        try {
            C20488 c20488 = new C20488((int) c10231.m25859().m12074());
            if (iInArchive.extractSlow(c10231.m25859().m12080(), c20488) == ExtractOperationResult.OK) {
                c5168.m14823(iInArchive);
                iInArchive2 = new C7364(c20488.m46943());
            } else {
                iInArchive2 = null;
                iInArchive3 = iInArchive;
            }
            C0349.m1793(iInArchive3);
            iInArchive3 = iInArchive2;
        } catch (Throwable unused2) {
            C0349.m1793(iInArchive);
            m29964 = m29964(c10231.m25859());
            if (i != 1) {
            }
            return C3695.m11250(m29964, C19883.f64215, true, new C6576(iInArchive3));
        }
        m29964 = m29964(c10231.m25859());
        if (i != 1 || i == 2) {
            return C3695.m11250(m29964, C19883.f64215, true, new C6576(iInArchive3));
        }
        if (i == 3) {
            C19883 c19883 = C19883.f64196;
            C11813 m11250 = C3695.m11250(m29964, c19883, true, new C20378(iInArchive3));
            if (m11250 != c19883.f64250) {
                interfaceC17889.mo36975(R.id.MT_Protector_res_0x7f0a02a4, Boolean.TRUE);
            }
            return m11250;
        }
        throw new RuntimeException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m29964(C4007 c4007) {
        int hashCode;
        Integer m12077 = c4007.m12077();
        if (m12077 != null) {
            hashCode = m12077.intValue();
        } else {
            hashCode = Arrays.hashCode(new long[]{c4007.m12072(), c4007.m12084(), c4007.m12082().hashCode()});
        }
        return C14460.m34530("archive:" + Long.toHexString(hashCode & 4294967295L) + c4007.m12074()).toLowerCase();
    }
}
