package l;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.function.BooleanSupplier;
import net.sf.sevenzipjbinding.ICryptoGetTextPassword;
import net.sf.sevenzipjbinding.SevenZipException;

/* compiled from: BB70 */
/* renamed from: l.֨ܳᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C1184 implements ICryptoGetTextPassword {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f4270;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f4271;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f4272;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f4273;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public BooleanSupplier f4274 = new C0478();

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Iterator f4275;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f4276;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f4277;

    public C1184(AbstractActivityC3346 abstractActivityC3346) {
        this.f4276 = abstractActivityC3346;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void m4001(String str) {
        this.f4271 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m3998(BooleanSupplier booleanSupplier) {
        this.f4274 = booleanSupplier;
    }

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public boolean m4003() {
        return this.f4272;
    }

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public String m4000() {
        if (TextUtils.isEmpty(this.f4271)) {
            return null;
        }
        return this.f4271;
    }

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public boolean mo4002() {
        return this.f4277;
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean m4004() {
        return this.f4270;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean m3999() {
        return this.f4273;
    }

    @Override // net.sf.sevenzipjbinding.ICryptoGetTextPassword
    public String cryptoGetTextPassword() {
        m3997();
        this.f4272 = true;
        if (TextUtils.isEmpty(this.f4271)) {
            if (this.f4275 == null) {
                this.f4275 = C10395.m26216();
            }
            if (this.f4275.hasNext()) {
                this.f4271 = (String) this.f4275.next();
                this.f4270 = true;
                this.f4273 = false;
            } else {
                this.f4270 = false;
                C12079 c12079 = new C12079(this.f4276, new InterfaceC12784() { // from class: l.ۚܳᩳ
                    @Override // l.InterfaceC12784
                    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
                    public final void mo15503(String str) {
                        C1184.this.f4271 = str;
                    }
                });
                c12079.m29463(this.f4274);
                boolean m29464 = c12079.m29464();
                this.f4273 = m29464;
                this.f4277 = true ^ m29464;
                m3997();
            }
        } else {
            this.f4270 = false;
            this.f4273 = false;
        }
        m3997();
        return this.f4271;
    }

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    private void m3997() {
        if (this.f4277 || this.f4274.getAsBoolean()) {
            this.f4277 = true;
            throw new SevenZipException("Cancel");
        }
    }
}
