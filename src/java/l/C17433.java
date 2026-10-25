package l;

import android.os.Bundle;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* compiled from: 3B3L */
/* renamed from: l.ܿܶᩳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17433 extends C13802 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f53289;

    public C17433(C22372 c22372) {
        this.f53289 = c22372;
    }

    @Override // l.C13802
    /* renamed from: ۧ */
    public final String mo8403() {
        String string = this.f53289.f5606.getString("filePath");
        return string == null ? "untitled" : C9523.m24404(string);
    }

    @Override // l.C13802
    /* renamed from: ܽ */
    public final String mo22096() {
        String string = this.f53289.f5606.getString("filePath");
        if (string == null || !string.equals("untitled")) {
            return string;
        }
        return null;
    }

    @Override // l.C13802
    /* renamed from: ܳ */
    public final boolean mo33117() {
        boolean m50167;
        m50167 = this.f53289.m50167();
        return m50167;
    }

    @Override // l.C13802
    /* renamed from: ᩳ */
    public final int mo33118() {
        boolean m50167;
        C11915 c11915;
        C22372 c22372 = this.f53289;
        m50167 = c22372.m50167();
        if (!m50167) {
            return 0;
        }
        c11915 = c22372.f72506;
        return c11915.f35628.m32656();
    }

    @Override // l.C13802
    /* renamed from: ֫ */
    public final int mo33115() {
        boolean m50167;
        C11915 c11915;
        C22372 c22372 = this.f53289;
        m50167 = c22372.m50167();
        if (!m50167) {
            return 0;
        }
        c11915 = c22372.f72506;
        return c11915.f35631;
    }

    @Override // l.C13802
    /* renamed from: ֫ */
    public final void mo33116(int i, ResultCallback resultCallback) {
        boolean m50167;
        FutureC3575 m50138;
        C22372 c22372 = this.f53289;
        m50167 = c22372.m50167();
        if (m50167) {
            m50138 = c22372.m50138(i, (Runnable) null);
            m50138.m10910((InterfaceC8017) new C15441(resultCallback));
        } else if (resultCallback != null) {
            resultCallback.onFailure(ResultCallback.ERROR_UNSUPPORTED_OPERATION);
        }
    }

    @Override // l.C13802
    /* renamed from: ܿ */
    public final boolean mo22097() {
        return this.f53289.m5426();
    }

    @Override // l.C13802
    /* renamed from: ֫ */
    public final void mo22095(ResultCallback resultCallback) {
        C13328 c13328;
        C13328 c133282;
        C22372 c22372 = this.f53289;
        if (c22372.m5410()) {
            c13328 = c22372.f72499;
            if (c13328 != null) {
                c22372.f72514 = resultCallback;
                c133282 = c22372.f72499;
                c133282.m32311(null, R.string.MT_Protector_res_0x7f1205fc, c22372.m5420().f15019.getName(), Bundle.EMPTY);
                return;
            }
        }
        c22372.m50221((ActivityC16315) c22372.requireActivity(), resultCallback);
    }
}
