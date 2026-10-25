package l;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: B54W */
/* renamed from: l.ۧۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10822 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Interpolator f32550;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC21882 f32551;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f32552;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f32548 = -1;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1080 f32549 = new C1649(this);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f32547 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27057(C15530 c15530) {
        if (this.f32552) {
            return;
        }
        this.f32547.add(c15530);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27058(C15530 c15530, C15530 c155302) {
        ArrayList arrayList = this.f32547;
        arrayList.add(c15530);
        c155302.m36606(c15530.m36604());
        arrayList.add(c155302);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m27061() {
        if (this.f32552) {
            return;
        }
        Iterator it = this.f32547.iterator();
        while (it.hasNext()) {
            C15530 c15530 = (C15530) it.next();
            long j = this.f32548;
            if (j >= 0) {
                c15530.m36600(j);
            }
            Interpolator interpolator = this.f32550;
            if (interpolator != null) {
                c15530.m36601(interpolator);
            }
            if (this.f32551 != null) {
                c15530.m36602(this.f32549);
            }
            c15530.m36607();
        }
        this.f32552 = true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27059() {
        this.f32552 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27054() {
        if (this.f32552) {
            Iterator it = this.f32547.iterator();
            while (it.hasNext()) {
                ((C15530) it.next()).m36598();
            }
            this.f32552 = false;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m27060() {
        if (this.f32552) {
            return;
        }
        this.f32548 = 250L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27055(Interpolator interpolator) {
        if (this.f32552) {
            return;
        }
        this.f32550 = interpolator;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27056(C1080 c1080) {
        if (this.f32552) {
            return;
        }
        this.f32551 = c1080;
    }
}
