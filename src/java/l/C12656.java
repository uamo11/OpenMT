package l;

import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: O1K3 */
/* renamed from: l.۫᩷ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12656 implements InterfaceC5380 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ActivityC17169 f38121;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6306 f38122;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f38123;

    public C12656(ActivityC17169 activityC17169, C6306 c6306, boolean z) {
        C12366 c12366;
        C12230 c12230;
        this.f38122 = c6306;
        this.f38121 = activityC17169;
        this.f38123 = z;
        c12366 = c6306.f19514;
        if (c12366 == null) {
            C12366 c123662 = (C12366) ((C3764) new C4741(activityC17169).m13885(C3764.class)).m11419().m1662();
            C11003.requireNonNull(c123662);
            c6306.f19514 = c123662;
        }
        c12230 = c6306.f19502;
        if (c12230 == null) {
            c6306.f19502 = (C12230) new C4741(activityC17169).m13885(C12230.class);
        }
    }

    @Override // l.InterfaceC5380
    public final String getTitle() {
        return this.f38122.mo14421();
    }

    @Override // l.InterfaceC5380
    /* renamed from: ֫ */
    public final void mo3044() {
        boolean z;
        C12230 c12230;
        C12366 c12366;
        C11005 m34233;
        C12366 c123662;
        C12366 c123663;
        Bundle bundle;
        C12366 c123664;
        C12366 c123665;
        C12366 c123666;
        C11005 m34236;
        C12392 c12392;
        Bundle bundle2;
        C12366 c123667;
        z = this.f38122.f19523;
        if (z) {
            c12392 = this.f38122.f19506;
            m30935(c12392.m30436().toString());
            if (this.f38123) {
                bundle2 = this.f38122.f43260;
                bundle2.putBoolean("changed", false);
                C6306 c6306 = this.f38122;
                c123667 = c6306.f19514;
                c6306.m34239(c123667.m36268());
                InterfaceC18581 mo17431 = this.f38122.mo17431();
                if (mo17431 != null) {
                    C15477 c15477 = (C15477) mo17431;
                    c15477.mo9498();
                    c15477.mo9497();
                }
            }
            c12392.m30470();
            return;
        }
        c12230 = this.f38122.f19502;
        c12230.m29734();
        C6306 c63062 = this.f38122;
        c12366 = c63062.f19514;
        m34233 = c63062.m34233(c12366.m36268());
        C12951 m31485 = C12951.m31485(m34233.m27337());
        C22124.m49722((InterfaceC20008) m31485, 1382253409);
        int readInt = m31485.readInt();
        C22124.m49722((InterfaceC20008) m31485, 1382253409);
        c123662 = this.f38122.f19514;
        if (readInt == c123662.m30062(this.f38122.m17420())) {
            C6306 c63063 = this.f38122;
            c123666 = c63063.f19514;
            m34236 = c63063.m34236(c123666.m36268());
            m30935(C6748.m18370(m31485, m34236.m27340()));
        } else {
            c123663 = this.f38122.f19514;
            m30935(c123663.m30052(this.f38122.m17420()));
        }
        if (this.f38123) {
            bundle = this.f38122.f43260;
            bundle.putBoolean("changed", false);
            C6306 c63064 = this.f38122;
            c123664 = c63064.f19514;
            c63064.m34239(c123664.m36268());
            C6748.m18368(m31485);
            byte[] bArr = m31485.f38849;
            c123665 = this.f38122.f19514;
            C15972.m37746(4, c123665.m30062(this.f38122.m17420()), bArr);
            synchronized (this.f38122) {
                byte[] bArr2 = m31485.f38849;
                int i = C3878.f12396;
                m34233.m27332(C3878.m11707(bArr2, bArr2.length));
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m30935(String str) {
        C12366 c12366;
        C12366 c123662;
        C12366 c123663;
        C6306 c6306 = this.f38122;
        c12366 = c6306.f19514;
        String m30076 = c12366.m30076(c6306.m17420());
        c123662 = c6306.f19514;
        C19562 m30045 = c123662.m30045(m30076);
        if (C9684.m24627(str, m30045.m44986(), m30045) == null) {
            throw new Exception("Unknown error");
        }
        c123663 = c6306.f19514;
        c123663.m30056(c6306.m17420(), str);
    }

    @Override // l.InterfaceC5380
    /* renamed from: ֫ */
    public final Exception mo3043(Exception exc) {
        boolean z;
        C12366 c12366;
        C6306 c6306 = this.f38122;
        z = c6306.f19523;
        if (!z) {
            return exc instanceof C14658 ? new C1783(c6306.m17420(), (C14658) exc) : exc;
        }
        ActivityC17169 activityC17169 = this.f38121;
        activityC17169.m10223(exc, (DialogInterface.OnDismissListener) null);
        if (exc instanceof C14658) {
            C14658 c14658 = (C14658) exc;
            activityC17169.m40358();
            C19287 m44466 = C19287.m44466(c14658.f44794, c14658.f44798);
            m44466.f60678 = false;
            activityC17169.m40343(c6306.m17420(), m44466);
            c12366 = c6306.f19514;
            c12366.m30026(c6306.m17420());
        }
        return null;
    }
}
