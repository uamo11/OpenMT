package l;

/* compiled from: F7HH */
/* renamed from: l.ᩴ֨ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18432 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f57201;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f57202;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f57203 = -1;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m42907() {
        C4488 c4488;
        C4488 c44882;
        notifyAll();
        c4488 = C19138.f60321;
        synchronized (c4488) {
            c44882 = C19138.f60321;
            c44882.remove(this.f57202);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m42908() {
        System.out.println("waitStatusChanged " + this.f57202);
        int i = this.f57203;
        if (i == 0 || i == 3 || i == 2) {
            return false;
        }
        try {
            wait(15000L);
        } catch (InterruptedException unused) {
        }
        return i != this.f57203;
    }

    public C18432(int i) {
        this.f57202 = i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m42906() {
        return this.f57203;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m42905() {
        return this.f57201;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42904(C18432 c18432, int i, String str) {
        synchronized (c18432) {
            System.out.println("update " + c18432.f57202 + " status " + i + " extra " + str);
            c18432.f57203 = i;
            c18432.f57201 = str;
            c18432.notifyAll();
        }
    }
}
