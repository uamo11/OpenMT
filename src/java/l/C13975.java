package l;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: UB2A */
/* renamed from: l.ܰᩳ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13975 implements TextWatcher, SpanWatcher {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f41686 = new AtomicInteger(0);

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f41687;

    public C13975(Object obj) {
        this.f41687 = obj;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f41687).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f41687).onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f41687).afterTextChanged(editable);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.f41686.get() <= 0 || !(obj instanceof AbstractC22443)) {
            ((SpanWatcher) this.f41687).onSpanAdded(spannable, obj, i, i2);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.f41686.get() <= 0 || !(obj instanceof AbstractC22443)) {
            ((SpanWatcher) this.f41687).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.f41686.get() <= 0 || !(obj instanceof AbstractC22443)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i2) {
                    i = 0;
                }
                if (i3 > i4) {
                    i5 = i;
                    i6 = 0;
                    ((SpanWatcher) this.f41687).onSpanChanged(spannable, obj, i5, i2, i6, i4);
                }
            }
            i5 = i;
            i6 = i3;
            ((SpanWatcher) this.f41687).onSpanChanged(spannable, obj, i5, i2, i6, i4);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33425() {
        this.f41686.incrementAndGet();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m33426() {
        this.f41686.decrementAndGet();
    }
}
