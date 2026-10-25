package l;

/* compiled from: D70T */
/* renamed from: l.ܿۧܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17307 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f53016;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40619(long j) {
        if (j < 0) {
            throw C18177.m42352("Negative checkpoint allocation");
        }
        long m3495 = C1005.m3495(this.f53016, j);
        if (m3495 > 67108864) {
            throw C18177.m42352("Checkpoint metadata exceeds memory limit");
        }
        this.f53016 = m3495;
    }
}
