package l;

import java.util.ArrayList;
import java.util.List;

/* compiled from: U19E */
/* renamed from: l.ۧܽᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11126 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f33398;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f33399;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f33400;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f33401;

    public C11126(ArrayList arrayList, int i, int i2) {
        String str;
        this.f33401 = i;
        this.f33400 = i2;
        if (!arrayList.isEmpty()) {
            C1953 c1953 = (C1953) arrayList.get(0);
            if ("Name".equalsIgnoreCase(c1953.m6421())) {
                str = c1953.m6422();
                this.f33399 = str;
                this.f33398 = C20195.unmodifiableList(new ArrayList(arrayList));
            }
        }
        str = null;
        this.f33399 = str;
        this.f33398 = C20195.unmodifiableList(new ArrayList(arrayList));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m27608() {
        return this.f33399;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m27610() {
        return this.f33401;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m27609() {
        return this.f33400;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m27607() {
        return this.f33398;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m27606(String str) {
        for (C1953 c1953 : this.f33398) {
            if (c1953.m6421().equalsIgnoreCase(str)) {
                return c1953.m6422();
            }
        }
        return null;
    }
}
