package l;

import bin.mt.plus.R;

/* compiled from: F1FR */
/* renamed from: l.᩸᩺᩷, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21900 extends AbstractC4474 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4966 f70111;

    @Override // l.AbstractC12014
    /* renamed from: ۧ */
    public final int mo11916() {
        return 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21900(C4966 c4966, AbstractC5180 abstractC5180) {
        super(abstractC5180);
        this.f70111 = c4966;
    }

    @Override // l.AbstractC4474
    /* renamed from: ۧ */
    public final ComponentCallbacksC9205 mo13217(int i) {
        if (i == 0) {
            return new ViewOnClickListenerC21628();
        }
        if (i == 1) {
            return new C13865();
        }
        if (i == 2) {
            return new C5921();
        }
        if (i == 3) {
            return new C19328();
        }
        throw new RuntimeException();
    }

    @Override // l.AbstractC12014
    /* renamed from: ֫ */
    public final CharSequence mo11912(int i) {
        C4966 c4966 = this.f70111;
        if (i == 0) {
            return c4966.getString(R.string.MT_Protector_res_0x7f120a1b);
        }
        if (i == 1) {
            return c4966.getString(R.string.MT_Protector_res_0x7f120a1c);
        }
        if (i == 2) {
            return c4966.getString(R.string.MT_Protector_res_0x7f120a1d);
        }
        if (i == 3) {
            return c4966.getString(R.string.MT_Protector_res_0x7f120a1e);
        }
        throw new RuntimeException();
    }
}
