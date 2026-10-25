package l;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: X81I */
/* renamed from: l.۫ۗܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12144 implements TextWatcher {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5794 f36245;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C12144(AbstractC5794 abstractC5794) {
        this.f36245 = abstractC5794;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        C10235 c10235;
        C10235 c102352;
        int i;
        int i2;
        AbstractC5794 abstractC5794 = this.f36245;
        z = abstractC5794.f17826;
        if (z) {
            c10235 = abstractC5794.f17825;
            if (c10235.isFocused()) {
                try {
                    int parseInt = Integer.parseInt(editable.toString());
                    c102352 = abstractC5794.f17823;
                    i = abstractC5794.f17828;
                    i2 = abstractC5794.f17827;
                    c102352.mo25910((CharSequence) String.valueOf((parseInt * i) / i2));
                } catch (Exception unused) {
                }
            }
        }
    }
}
