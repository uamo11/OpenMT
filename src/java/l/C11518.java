package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;

/* compiled from: X8F9 */
/* renamed from: l.ۨۛܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11518 extends AbstractC13921 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12223 f34398;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f34399;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f34400;

    @Override // l.AbstractC13921
    /* renamed from: ܽ */
    public final String mo7654() {
        return "compress";
    }

    public C11518(String str) {
        this.f34400 = C16999.m39866(str, new String[0]);
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final void mo7646(boolean z) {
        long j;
        EnumC15915 enumC15915;
        AbstractC15440 abstractC15440 = this.f34400;
        C23411 m36513 = abstractC15440.m36513("r");
        try {
            byte[] m37678 = EnumC15915.m37678();
            int i = 0;
            int mo21175 = m36513.mo21175(0, m37678.length, m37678);
            String m36517 = abstractC15440.m36517();
            long mo23127 = abstractC15440.mo23127();
            long mo23117 = abstractC15440.mo23117();
            EnumC15915[] values = EnumC15915.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    j = -1;
                    enumC15915 = null;
                    break;
                }
                EnumC15915 enumC159152 = values[i];
                if (enumC159152.m37682(m37678, mo21175)) {
                    j = enumC159152.m37679(m36513);
                    enumC15915 = enumC159152;
                    break;
                }
                i++;
            }
            long j2 = j;
            if (enumC15915 == null) {
                throw new IOException("Unknown format file: " + abstractC15440.mo23554());
            }
            this.f34398 = new C12223(m36517, j2, mo23127, mo23117, enumC15915);
            this.f34399 = mo23117;
            m36513.close();
        } catch (Throwable th) {
            try {
                m36513.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final InputStream mo7636(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889) {
        InputStream mo27926 = this.f34400.mo27926();
        try {
            return ((C12223) interfaceC17889).m29722().m37680(mo27926);
        } catch (IOException e) {
            mo27926.close();
            throw e;
        }
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19404 mo28347(InterfaceC17889 interfaceC17889) {
        AbstractC15440 abstractC15440 = this.f34400;
        C19277 c19277 = new C19277(abstractC15440.mo23127());
        C5873 c5873 = new C5873(abstractC15440.mo27926(), c19277);
        try {
            return new C19404(((C12223) interfaceC17889).m29722().m37680(c5873), c19277, false);
        } catch (IOException e) {
            c5873.close();
            throw e;
        }
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final void mo7641(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889, InterfaceC3569 interfaceC3569) {
        C19404 mo28347 = mo28347(interfaceC17889);
        try {
            mo28347.m44686().m44459(new C17951(interfaceC3569));
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            do {
                int read = mo28347.read(bArr);
                if (read == -1) {
                    mo28347.close();
                    return;
                }
                interfaceC3569.mo10874(read, bArr);
            } while (!interfaceC3569.mo1526());
            mo28347.close();
        } catch (Throwable th) {
            try {
                mo28347.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final InterfaceC17889 mo7638(String str) {
        if (this.f34398 == null) {
            mo7646(false);
        }
        C12223 c12223 = this.f34398;
        if (c12223 == null || !str.equals(c12223.getPath())) {
            return null;
        }
        return this.f34398;
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final void mo7639(MessageDigest messageDigest) {
        messageDigest.update("compress".getBytes());
        C14460.m34528(messageDigest, this.f34400.mo23554());
        messageDigest.update(String.valueOf(this.f34399).getBytes());
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final ArrayList mo7637(String str, boolean z) {
        if (this.f34398 == null) {
            mo7646(false);
        }
        ArrayList arrayList = new ArrayList(2);
        if (this.f34398 != null && (str.isEmpty() || str.equals("/"))) {
            arrayList.add(this.f34398);
        }
        return arrayList;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C12223 m28349() {
        return this.f34398;
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final void mo7643(C10130 c10130) {
        c10130.m25439(this.f34400.mo23554());
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m28348() {
        return this.f34400.mo23554();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m28350() {
        return this.f34400;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m28352() {
        return this.f34399 != this.f34400.mo23117();
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m28351() {
        return this.f34400.mo23120();
    }
}
