package l;

import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: Z1GQ */
/* renamed from: l.֨֫ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0808 implements InterfaceC5380 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ActivityC17169 f2946;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7864 f2947;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f2948;

    public C0808(ActivityC17169 activityC17169, C7864 c7864, boolean z) {
        C19452 c19452;
        C12230 c12230;
        this.f2947 = c7864;
        this.f2946 = activityC17169;
        this.f2948 = z;
        c19452 = c7864.f24368;
        if (c19452 == null) {
            C19452 c194522 = (C19452) ((C3764) new C4741(activityC17169).m13885(C3764.class)).m11411().m1662();
            C11003.requireNonNull(c194522);
            c7864.f24368 = c194522;
        }
        c12230 = c7864.f24372;
        if (c12230 == null) {
            c7864.f24372 = (C12230) new C4741(activityC17169).m13885(C12230.class);
        }
    }

    @Override // l.InterfaceC5380
    public final String getTitle() {
        return this.f2947.mo14421();
    }

    @Override // l.InterfaceC5380
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3044() {
        boolean z;
        C12230 c12230;
        C19452 c19452;
        C11005 m34233;
        C19452 c194522;
        C19452 c194523;
        Bundle bundle;
        C19452 c194524;
        C19452 c194525;
        C19452 c194526;
        C11005 m34236;
        C12392 c12392;
        Bundle bundle2;
        C19452 c194527;
        z = this.f2947.f24385;
        if (z) {
            c12392 = this.f2947.f24374;
            m3042(c12392.m30436().toString());
            if (this.f2948) {
                bundle2 = this.f2947.f43260;
                bundle2.putBoolean("changed", false);
                C7864 c7864 = this.f2947;
                c194527 = c7864.f24368;
                c7864.m34239(c194527.m36268());
                InterfaceC18581 mo17431 = this.f2947.mo17431();
                if (mo17431 != null) {
                    C8570 c8570 = (C8570) mo17431;
                    c8570.mo9498();
                    c8570.mo9497();
                }
            }
            c12392.m30470();
            return;
        }
        c12230 = this.f2947.f24372;
        c12230.m29734();
        C7864 c78642 = this.f2947;
        c19452 = c78642.f24368;
        m34233 = c78642.m34233(c19452.m36268());
        C12951 m31485 = C12951.m31485(m34233.m27337());
        C22124.m49722((InterfaceC20008) m31485, 1382253410);
        int readInt = m31485.readInt();
        C22124.m49722((InterfaceC20008) m31485, 1382253410);
        c194522 = this.f2947.f24368;
        if (readInt == c194522.m44835(this.f2947.m21123())) {
            C7864 c78643 = this.f2947;
            c194526 = c78643.f24368;
            m34236 = c78643.m34236(c194526.m36268());
            m3042(C6748.m18370(m31485, m34236.m27340()));
        } else {
            c194523 = this.f2947.f24368;
            m3042(c194523.m44856(this.f2947.m21123()));
        }
        if (this.f2948) {
            bundle = this.f2947.f43260;
            bundle.putBoolean("changed", false);
            C7864 c78644 = this.f2947;
            c194524 = c78644.f24368;
            c78644.m34239(c194524.m36268());
            C6748.m18368(m31485);
            byte[] bArr = m31485.f38849;
            c194525 = this.f2947.f24368;
            C15972.m37746(4, c194525.m44835(this.f2947.m21123()), bArr);
            synchronized (this.f2947) {
                byte[] bArr2 = m31485.f38849;
                int i = C3878.f12396;
                m34233.m27332(C3878.m11707(bArr2, bArr2.length));
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3042(String str) {
        C19452 c19452;
        C7864 c7864 = this.f2947;
        String m21123 = c7864.m21123();
        c19452 = c7864.f24368;
        c19452.m44849(m21123, str);
        if (m21123.endsWith("package-info") || m21123.endsWith("type-info")) {
            this.f2946.m40369().m11400();
        }
    }

    @Override // l.InterfaceC5380
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Exception mo3043(Exception exc) {
        boolean z;
        int m38634;
        C12392 c12392;
        C7864 c7864 = this.f2947;
        z = c7864.f24385;
        if (!z) {
            return exc instanceof C1580 ? new C5672(c7864.m21123(), (C1580) exc) : exc;
        }
        this.f2946.m10223(exc, (DialogInterface.OnDismissListener) null);
        if ((exc instanceof C1580) && (m38634 = ((C1580) exc).m5400().m38634()) != -1) {
            c12392 = c7864.f24374;
            c12392.m30372(m38634 - 1);
        }
        return null;
    }
}
