package l;

/* compiled from: M1KQ */
/* renamed from: l.ܺۜۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15769 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f48612;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f48613;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f48614;

    public C15769(String str) {
        this.f48613 = str;
    }

    public C15769(String str, String str2) {
        this.f48613 = str;
        this.f48612 = str2;
        this.f48614 = true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m37186() {
        return this.f48614 ? this.f48612 : this.f48613;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37185(String str) {
        if (this.f48613.equals(str)) {
            this.f48612 = null;
            this.f48614 = false;
            return false;
        }
        this.f48612 = str;
        this.f48614 = true;
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m37184() {
        return this.f48613;
    }
}
