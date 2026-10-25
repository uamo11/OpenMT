package l;

import java.util.concurrent.CancellationException;

/* compiled from: Y6SG */
/* renamed from: l.ܿᩴᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC17538 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53562;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f53563;

    public /* synthetic */ RunnableC17538(int i, Object obj) {
        this.f53562 = i;
        this.f53563 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C19656 c19656;
        Runnable runnable;
        C19677 c19677;
        FutureC3575 futureC3575;
        FutureC3575 futureC35752;
        C19677 c196772;
        C19677 c196773;
        switch (this.f53562) {
            case 0:
                ((C14715) this.f53563).f44935.m10914((Throwable) new CancellationException("Checkpoint was superseded or discarded"));
                return;
            default:
                C4028 c4028 = (C4028) this.f53563;
                C9344 c9344 = c4028.f12791;
                C12392 c12392 = c4028.f12786;
                C22372 c22372 = c4028.f12785;
                c4028.f12788 = false;
                FutureC3575 futureC35753 = c4028.f12793;
                if (futureC35753.isDone()) {
                    return;
                }
                try {
                    if (!c22372.f72503 || c12392 == null || c22372.f72517 != c12392 || c22372.f5607 != c9344 || !c4028.f12789.equals(c22372.m5420().f15019.mo23554()) || (c4028.f12796 != null && c12392.m30436() != c4028.f12796)) {
                        throw new CancellationException("Saving owner changed before capture");
                    }
                    FutureC3575 futureC35754 = c4028.f12790;
                    if (futureC35754 != null) {
                        if (!futureC35754.isDone()) {
                            return;
                        } else {
                            c4028.f12790.m10930();
                        }
                    }
                    FutureC3575 futureC35755 = c4028.f12795;
                    if (futureC35755 != null) {
                        if (!futureC35755.isDone()) {
                            return;
                        }
                        if (((C11915) c4028.f12795.m10930()).f35630 != c12392.m30436()) {
                            throw new CancellationException("Saving loaded content was replaced");
                        }
                    }
                    c19656 = c22372.f72511;
                    if (c19656 == null) {
                        runnable = c22372.f72518;
                        if (runnable != null) {
                            return;
                        }
                        c19677 = c22372.f72497;
                        if (c19677 != null) {
                            c196772 = c22372.f72497;
                            C19677 c196774 = c4028.f12797;
                            if (c196772 != c196774) {
                                if (c196774 != null || c4028.f12796 != null) {
                                    throw new CancellationException("Saving preparation was superseded");
                                }
                                c196773 = c22372.f72497;
                                c4028.f12797 = c196773;
                                FutureC3575 m45254 = c196773.m45254();
                                c4028.f12795 = m45254;
                                m45254.m10910((InterfaceC8017) new C6955(1, c4028));
                            }
                        }
                        if (c9344.m24142()) {
                            return;
                        }
                        futureC3575 = c22372.f72486;
                        if (futureC3575 != null) {
                            futureC35752 = c22372.f72486;
                            if (!futureC35752.isDone()) {
                                return;
                            }
                        }
                        if (c22372.m5414()) {
                            throw new IllegalStateException("Cannot save failed editor content");
                        }
                        if (c4028.f12796 == null) {
                            c4028.f12796 = c12392.m30436();
                        }
                        C8967 m50179 = C22372.m50179(c22372, c4028.f12787);
                        c4028.f12784 = m50179;
                        if (m50179 != null) {
                            c4028.m12124();
                            futureC35753.m10912(c4028.f12784);
                            return;
                        } else {
                            if (c12392.m30536()) {
                                throw new IllegalStateException("Editor content is not available for saving");
                            }
                            return;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    c4028.m12125(th);
                    return;
                }
        }
    }
}
