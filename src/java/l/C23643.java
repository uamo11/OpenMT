package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.LinkedList;

/* compiled from: 31K1 */
/* renamed from: l.᩻ۤ᩷, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23643 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f76588;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f76589;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedList f76590;

    public C23643(ActivityC17169 activityC17169, LinkedList linkedList, Runnable runnable) {
        this.f76589 = activityC17169;
        this.f76590 = linkedList;
        this.f76588 = runnable;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f76589, R.string.MT_Protector_res_0x7f1208d2);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        while (true) {
            LinkedList linkedList = this.f76590;
            if (linkedList.isEmpty()) {
                return;
            }
            InterfaceC5380 interfaceC5380 = (InterfaceC5380) linkedList.peek();
            C11003.requireNonNull(interfaceC5380);
            this.f23322.m31861(this.f76589.getString(R.string.MT_Protector_res_0x7f1208d2) + " " + interfaceC5380.getTitle());
            interfaceC5380.mo3044();
            linkedList.pop();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        Runnable runnable = this.f76588;
        if (runnable != null) {
            C4925.m14315(runnable);
        } else {
            C21374.m48457(R.string.MT_Protector_res_0x7f1208d1);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C19452 c19452;
        C12366 c12366;
        LinkedList linkedList = this.f76590;
        InterfaceC5380 interfaceC5380 = linkedList.isEmpty() ? null : (InterfaceC5380) linkedList.peek();
        if (interfaceC5380 != null) {
            exc = interfaceC5380.mo3043(exc);
        }
        if (exc != null) {
            ActivityC17169 activityC17169 = this.f76589;
            activityC17169.m10223(exc, (DialogInterface.OnDismissListener) null);
            if (exc instanceof C1783) {
                C1783 c1783 = (C1783) exc;
                C19287 m44466 = C19287.m44466(c1783.f6159, c1783.f6160);
                m44466.f60678 = false;
                activityC17169.m40343(c1783.m5935(), m44466);
                c12366 = activityC17169.f52606;
                C11003.requireNonNull(c12366);
                c12366.m30026(c1783.m5935());
                return;
            }
            if (exc instanceof C5672) {
                C5672 c5672 = (C5672) exc;
                C19287 m444662 = C19287.m44466(c5672.f17514, c5672.f17513);
                m444662.f60678 = false;
                activityC17169.m40354(c5672.m15979(), m444662);
                c19452 = activityC17169.f52621;
                C11003.requireNonNull(c19452);
                c19452.m44818(c5672.m15979());
            }
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f76589.m40347();
        m20273();
    }
}
