package l;

import java.util.HashMap;
import java.util.Map;

/* compiled from: 07T7 */
/* renamed from: l.֡᩺ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0722 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Map f2717;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC4251 f2718;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21393 f2719;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21393 f2720;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f2721;

    public C0722(C21393 c21393, C21393 c213932) {
        this.f2719 = c21393;
        this.f2720 = c213932;
        this.f2717 = m2831() ? new C2727() : null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2830(C21393 c21393, C0722 c0722) {
        C13843.putIfAbsent(this.f2717, c21393, c0722);
        if (this.f2717.size() == 20) {
            this.f2717 = new HashMap(this.f2717);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m2831() {
        C21393 c21393 = this.f2720;
        int length = c21393.length();
        return length == 0 || c21393.charAt(length - 1) == '/';
    }
}
