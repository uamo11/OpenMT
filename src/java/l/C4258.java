package l;

import bin.mt.plus.R;
import com.google.android.material.snackbar.SnackbarManager;
import java.util.regex.PatternSyntaxException;

/* compiled from: G4ML */
/* renamed from: l.ۘ᩺ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4258 implements InterfaceC3905 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15545 f13795;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22249 f13796;

    public C4258(C15545 c15545, C22249 c22249) {
        this.f13795 = c15545;
        this.f13796 = c22249;
    }

    @Override // l.InterfaceC3905
    /* renamed from: ֫ */
    public final void mo11909(boolean z) {
        this.f13796.m49964(z ? R.string.MT_Protector_res_0x7f120a63 : R.string.MT_Protector_res_0x7f120a62, SnackbarManager.SHORT_DURATION_MS);
    }

    @Override // l.InterfaceC3905
    /* renamed from: ֫ */
    public final void mo11907(int i) {
        this.f13796.m49965(C4925.m14306(R.string.MT_Protector_res_0x7f120897, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC3905
    /* renamed from: ۧ */
    public final void mo11910() {
        this.f13795.f47935.m14610();
    }

    @Override // l.InterfaceC3905
    /* renamed from: ֫ */
    public final void mo11906() {
        this.f13795.f47921.m14610();
    }

    @Override // l.InterfaceC3905
    /* renamed from: ֫ */
    public final void mo11908(PatternSyntaxException patternSyntaxException) {
        C15545.m36651(this.f13795, patternSyntaxException);
    }

    @Override // l.InterfaceC3905
    /* renamed from: ۧ */
    public final void mo11911(boolean z) {
        C15545 c15545 = this.f13795;
        c15545.f47935.m14609(z);
        c15545.f47921.m14612(z);
    }
}
