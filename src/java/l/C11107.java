package l;

import java.net.MalformedURLException;
import java.util.HashMap;

/* compiled from: ZA2F */
/* renamed from: l.ۧܺ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C11107 extends AbstractC1934 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C18560 f33329;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7373 f33330;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C6565 f33331;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15611 f33332;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final RunnableC9242 f33333;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C13474 f33334 = new C13474();

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9948 f33335;

    public C11107(C7373 c7373) {
        this.f33330 = c7373;
        new HashMap();
        this.f33331 = new C6565(this);
        this.f33333 = new RunnableC9242(this);
        this.f33335 = new C9948(c7373);
        this.f33332 = new C15611();
        this.f33329 = new C18560();
    }

    @Override // l.InterfaceC18663
    public final C12914 get(String str) {
        try {
            return new C12914(str, this);
        } catch (MalformedURLException e) {
            throw new C19369(C20094.m46315("Invalid URL ", str), e);
        }
    }

    @Override // l.InterfaceC18663
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11607 mo27538() {
        return this.f33332;
    }

    @Override // l.InterfaceC18663
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1023 mo27540() {
        return this.f33330;
    }

    @Override // l.InterfaceC18663
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15133 mo27541() {
        return this.f33334;
    }

    @Override // l.InterfaceC18663
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20074 mo27539() {
        return this.f33333;
    }

    @Override // l.InterfaceC18663
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9948 mo27542() {
        return this.f33335;
    }

    @Override // l.InterfaceC18663
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C6565 mo27537() {
        return this.f33331;
    }

    @Override // l.AbstractC1934
    /* renamed from: ۡ */
    public final C18560 mo6356() {
        return this.f33329;
    }

    @Override // l.AbstractC1934
    /* renamed from: ۢ */
    public final void mo6357() {
        super.mo6357();
        this.f33332.m36797();
    }
}
