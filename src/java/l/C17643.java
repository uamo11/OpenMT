package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.HashMap;

/* compiled from: I6UD */
/* renamed from: l.ܿ᩹ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17643 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f53945;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f53946;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f53949 = new Object();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f53947 = new HashMap();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f53948 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f53944 = BasicLabelFormatter.MILLION;

    public C17643(long j) {
        this.f53945 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41292() {
        int i = this.f53946 + 1;
        this.f53946 = i;
        if (i > this.f53944) {
            throw new C13842("Recovery graph node limit exceeded");
        }
    }
}
