package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: J9W9 */
/* renamed from: l.ۡ᩻֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9204 implements InterfaceC7520 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f27885 = false;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f27887 = new HashMap();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f27886 = new LinkedBlockingQueue();

    @Override // l.InterfaceC7520
    /* renamed from: ֫ */
    public final synchronized InterfaceC2148 mo18065(String str) {
        C9910 c9910;
        c9910 = (C9910) this.f27887.get(str);
        if (c9910 == null) {
            c9910 = new C9910(str, this.f27886, this.f27885);
            this.f27887.put(str, c9910);
        }
        return c9910;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m23640() {
        return new ArrayList(this.f27887.values());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue m23639() {
        return this.f27886;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m23641() {
        this.f27885 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23638() {
        this.f27887.clear();
        this.f27886.clear();
    }
}
