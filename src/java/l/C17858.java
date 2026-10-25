package l;

/* compiled from: U2T5 */
/* renamed from: l.ᩳۛ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17858 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15259[] f54540;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C3266[] f54541;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String[] f54542;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String[] f54543;

    public C17858(C12918 c12918) {
        this.f54542 = new String[Math.min(c12918.f38769, 65535)];
        this.f54543 = new String[Math.min(c12918.f38788, 65535)];
        this.f54541 = new C3266[Math.min(c12918.f38771, 65535)];
        this.f54540 = new C15259[Math.min(c12918.f38779, 65535)];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m41829(int i) {
        String[] strArr = this.f54542;
        if (i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41832(int i, String str) {
        if (str.length() > 512) {
            return;
        }
        String[] strArr = this.f54542;
        if (i >= strArr.length) {
            return;
        }
        strArr[i] = str;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m41833(int i) {
        String[] strArr = this.f54543;
        if (i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41835(int i, String str) {
        String[] strArr = this.f54543;
        if (i >= strArr.length) {
            return;
        }
        strArr[i] = str;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3266 m41834(C12918 c12918, int i) {
        C3266[] c3266Arr = this.f54541;
        if (i >= c3266Arr.length) {
            return new C3266(c12918, i);
        }
        C3266 c3266 = c3266Arr[i];
        if (c3266 != null) {
            return c3266;
        }
        C3266 c32662 = new C3266(c12918, i);
        c3266Arr[i] = c32662;
        return c32662;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15259 m41830(C12918 c12918, int i) {
        C15259[] c15259Arr = this.f54540;
        if (i >= c15259Arr.length) {
            return new C15259(c12918, i);
        }
        C15259 c15259 = c15259Arr[i];
        if (c15259 != null) {
            return c15259;
        }
        C15259 c152592 = new C15259(c12918, i);
        c15259Arr[i] = c152592;
        return c152592;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41831() {
        this.f54541 = null;
        this.f54540 = null;
    }
}
