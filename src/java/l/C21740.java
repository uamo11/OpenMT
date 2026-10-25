package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

/* compiled from: FA1E */
/* renamed from: l.᩸ᩳۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21740 extends AbstractC4806 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C21574 f69707;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f69708;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f69709;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public BigInteger f69710;

    public C21740() {
        super(1, "NegTokenTarg");
    }

    @Override // l.AbstractC4806
    /* renamed from: ֫ */
    public final void mo14017(C12441 c12441, C1818 c1818) {
        AbstractC11716 abstractC11716 = AbstractC11716.f34968;
        C23690 c23690 = new C23690(AbstractC11716.m28608(EnumC23004.CONTEXT_SPECIFIC, 1).m28610(EnumC0426.CONSTRUCTED), (AbstractC5366) c1818, true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C15948 c15948 = new C15948(new C8377(), byteArrayOutputStream);
        try {
            c15948.m37722(c23690);
            c15948.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            c12441.m26077(byteArray.length, byteArray);
        } catch (Throwable th) {
            try {
                c15948.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC4806
    /* renamed from: ֫ */
    public final void mo14016(C12441 c12441) {
        ArrayList arrayList = new ArrayList();
        try {
            if (this.f69710 != null) {
                AbstractC11716 abstractC11716 = AbstractC11716.f34968;
                arrayList.add(new C23690(AbstractC11716.m28608(EnumC23004.CONTEXT_SPECIFIC, 0).m28610(EnumC0426.CONSTRUCTED), (AbstractC5366) new C2524(this.f69710), true));
            }
            if (this.f69707 != null) {
                AbstractC11716 abstractC117162 = AbstractC11716.f34968;
                arrayList.add(new C23690(AbstractC11716.m28608(EnumC23004.CONTEXT_SPECIFIC, 1).m28610(EnumC0426.CONSTRUCTED), (AbstractC5366) this.f69707, true));
            }
            byte[] bArr = this.f69709;
            if (bArr != null && bArr.length > 0) {
                AbstractC11716 abstractC117163 = AbstractC11716.f34968;
                arrayList.add(new C23690(AbstractC11716.m28608(EnumC23004.CONTEXT_SPECIFIC, 2).m28610(EnumC0426.CONSTRUCTED), (AbstractC5366) new C10285(this.f69709), true));
            }
            byte[] bArr2 = this.f69708;
            if (bArr2 != null && bArr2.length > 0) {
                AbstractC11716 abstractC117164 = AbstractC11716.f34968;
                arrayList.add(new C23690(AbstractC11716.m28608(EnumC23004.CONTEXT_SPECIFIC, 3).m28610(EnumC0426.CONSTRUCTED), (AbstractC5366) new C10285(this.f69708), true));
            }
            mo14017(c12441, new C1818(arrayList));
        } catch (IOException e) {
            throw new C20329("Could not write NegTokenTarg to buffer", e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49066(byte[] bArr) {
        try {
            C8894 c8894 = new C8894(new C19478(), new C12441(bArr).m26085());
            try {
                m14015(c8894.readObject());
                c8894.close();
            } finally {
            }
        } catch (IOException e) {
            throw new C20329("Could not read NegTokenTarg from buffer", e);
        }
    }

    @Override // l.AbstractC4806
    /* renamed from: ֫ */
    public final void mo14018(C23690 c23690) {
        int m52234 = c23690.m52234();
        if (m52234 == 0) {
            AbstractC5366 m52235 = c23690.m52235();
            if (m52235 instanceof C2524) {
                this.f69710 = ((C2524) m52235).getValue();
                return;
            } else {
                throw new C20329("Expected the negResult (ENUMERATED) contents, not: " + this.f69707);
            }
        }
        if (m52234 == 1) {
            AbstractC5366 m522352 = c23690.m52235();
            if (m522352 instanceof C21574) {
                this.f69707 = (C21574) m522352;
                return;
            } else {
                throw new C20329("Expected the supportedMech (OBJECT IDENTIFIER) contents, not: " + m522352);
            }
        }
        if (m52234 == 2) {
            AbstractC5366 m522353 = c23690.m52235();
            if (m522353 instanceof C10285) {
                this.f69709 = ((C10285) m522353).getValue();
                return;
            } else {
                throw new C20329("Expected the responseToken (OCTET_STRING) contents, not: " + m522353);
            }
        }
        if (m52234 != 3) {
            throw new C20329("Unknown Object Tag " + c23690.m52234() + " encountered.");
        }
        AbstractC5366 m522354 = c23690.m52235();
        if (m522354 instanceof C10285) {
            this.f69708 = ((C10285) m522354).getValue();
        } else {
            throw new C20329("Expected the responseToken (OCTET_STRING) contents, not: " + m522354);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m49067() {
        return this.f69709;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49069(byte[] bArr) {
        this.f69709 = bArr;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49068(byte[] bArr) {
        this.f69708 = bArr;
    }
}
