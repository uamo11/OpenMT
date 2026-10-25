package l;

import java.util.ArrayList;

/* compiled from: L78E */
/* renamed from: l.ۘܿۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4082 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f13004;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f13007;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18193 f13009;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f13010;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23528 f13011;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f13008 = new ArrayList();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f13013 = new ArrayList();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f13012 = new ArrayList();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f13005 = new ArrayList();

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f13006 = -1;

    public C4082(C23528 c23528) {
        this.f13011 = c23528;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12280(C23942 c23942) {
        this.f13008.add(c23942);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12277(String str) {
        ArrayList arrayList = this.f13013;
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12278(String str, C3059 c3059) {
        this.f13012.add(str);
        this.f13005.add(new C21121(str, c3059.f9610, c3059.getMessage()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12281() {
        return this.f13008.size() >= this.f13011.f75537;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12279(C18193 c18193) {
        this.f13009 = c18193;
    }
}
