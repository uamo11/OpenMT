package l;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: 95XT */
/* renamed from: l.ᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C18395 extends C21529 {
    @Override // l.C21529
    /* renamed from: ֫ */
    public final void mo10947(int i, Bundle bundle) {
        if (bundle != null) {
            C23645.m52135(bundle);
            try {
                bundle.isEmpty();
            } catch (BadParcelableException unused) {
                bundle = null;
            }
        }
        if (i != 0) {
            throw null;
        }
        if (bundle != null) {
            if (!bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof C14866)) {
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
