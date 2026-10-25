package l;

import java.util.HashSet;
import java.util.List;

/* compiled from: JBI9 */
/* renamed from: l.ۗۖܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2950 implements InterfaceC17101 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12827 f9364;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f9365;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21480[] f9366;

    @Override // l.InterfaceC17101
    /* renamed from: ֫ */
    public final void mo7531(C12122 c12122) {
    }

    @Override // l.InterfaceC17101
    /* renamed from: ֫ */
    public final void mo7532(C13532 c13532) {
    }

    public C2950(C12827 c12827, C21480[] c21480Arr, HashSet hashSet) {
        this.f9364 = c12827;
        this.f9366 = c21480Arr;
        this.f9365 = hashSet;
    }

    @Override // l.InterfaceC17101
    /* renamed from: ۧ */
    public final void mo7534(C12122 c12122) {
        C20630 c20630;
        C20630 c206302;
        if (c12122.mo29537().m9562() != 3) {
            return;
        }
        int mo2231 = ((C2635) ((AbstractC14423) c12122.mo29542()).m34454()).mo2231();
        C21480[] c21480Arr = this.f9366;
        C21480 c21480 = c21480Arr[mo2231];
        if (c21480 == null) {
            c21480Arr[mo2231] = c12122.m34042();
            return;
        }
        C21480 m34042 = c12122.m34042();
        C18658 m48653 = c21480.m48653();
        C18658 m486532 = m34042.m48653();
        if (m48653 == null) {
            m48653 = m486532;
        } else if (m486532 != null && !m48653.equals(m486532)) {
            return;
        }
        C12827 c12827 = this.f9364;
        c20630 = c12827.f38517;
        c20630.m47194(c21480.m48652()).m34040(m48653);
        C4361 c4361 = new C4361(this, m34042, c21480);
        c206302 = c12827.f38517;
        List m47199 = c206302.m47199(m34042.m48652());
        int size = m47199.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((AbstractC14278) m47199.get(size)).mo29539(c4361);
            } else {
                this.f9365.add(c12122);
                return;
            }
        }
    }
}
