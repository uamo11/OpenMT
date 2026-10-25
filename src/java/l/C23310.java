package l;

import android.animation.Animator;
import com.google.android.material.animation.AnimatableView;

/* compiled from: F1E5 */
/* renamed from: l.᩺᩺᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C23310 implements InterfaceC12766, InterfaceC2343, AnimatableView.Listener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74928;

    public /* synthetic */ C23310(Object obj) {
        this.f74928 = obj;
    }

    @Override // com.google.android.material.animation.AnimatableView.Listener
    public void onAnimationEnd() {
        ((Animator) this.f74928).start();
    }

    @Override // l.InterfaceC2343
    /* renamed from: ֫ */
    public void mo6264(int i) {
        ((C12540) this.f74928).mo11538(i);
    }

    @Override // l.InterfaceC12061
    /* renamed from: ֫ */
    public void mo8487(AbstractC15440 abstractC15440) {
        ((C19357) this.f74928).m48535(abstractC15440);
    }
}
