package l;

/* compiled from: XBIU */
/* renamed from: l.ۢܳۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9645 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f29222 = false;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f29223 = 4;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24581() {
        this.f29222 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24580(Integer num) {
        this.f29223 = num.intValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m24579() {
        if (this.f29222) {
            return "\t";
        }
        String str = "";
        for (int i = 0; i < this.f29223; i++) {
            str = str.concat(" ");
        }
        return str;
    }
}
