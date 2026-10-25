package l;

import java.util.Comparator;

/* compiled from: Y1KK */
/* renamed from: l.ᩳۧۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18011 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Comparator f56165 = C8200.comparing(new C22536(3));

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Comparator f56166 = C15254.thenComparing(C8200.comparing(new C17576(2)), new C16599(0));

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f56167;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11005 f56168;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f56169;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f56170;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11005 f56171;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f56172;

    public C18011(String str) {
        C11003.requireNonNull(str);
        this.f56169 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18011.class != obj.getClass()) {
            return false;
        }
        return this.f56169.equals(((C18011) obj).f56169);
    }

    public final int hashCode() {
        return this.f56169.hashCode();
    }
}
