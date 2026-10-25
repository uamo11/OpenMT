package l;

import android.view.View;
import android.widget.EditText;
import java.util.function.Supplier;

/* compiled from: J4L7 */
/* renamed from: l.ۤ۫ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10292 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public View f30999;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f31000;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f31001;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Supplier f31002;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public View f31003;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EditText f31004;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6058 f31005;

    public C10292(C6058 c6058, int i, String str, Supplier supplier) {
        this.f31005 = c6058;
        this.f31001 = i;
        this.f31000 = str;
        this.f31002 = supplier;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26049(int i, int i2, int i3, View view) {
        View findViewById = view.findViewById(i);
        C11003.requireNonNull(findViewById);
        this.f31003 = findViewById;
        EditText editText = (EditText) view.findViewById(i2);
        C11003.requireNonNull(editText);
        this.f31004 = editText;
        View findViewById2 = view.findViewById(i3);
        C11003.requireNonNull(findViewById2);
        this.f30999 = findViewById2;
        this.f31004.setKeyListener(null);
        this.f30999.setOnClickListener(new View.OnClickListener() { // from class: l.۫۫ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C13113 c13113;
                boolean z;
                C10292 c10292 = C10292.this;
                C6058 c6058 = c10292.f31005;
                c13113 = c6058.f18562;
                String m31781 = c13113.m31781(c10292.f31001);
                if (m31781 != null) {
                    z = c6058.f18564;
                    C4925.m14314((CharSequence) (z ? m31781.toUpperCase() : m31781.toLowerCase()));
                }
            }
        });
        m26048();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26048() {
        C13113 c13113;
        C13113 c131132;
        boolean z;
        C6058 c6058 = this.f31005;
        c13113 = c6058.f18562;
        int i = this.f31001;
        String m31781 = c13113.m31781(i);
        c131132 = c6058.f18562;
        boolean z2 = c131132.m31782(i) && m31781 != null;
        this.f31003.setVisibility(z2 ? 0 : 8);
        this.f31004.setVisibility(z2 ? 0 : 8);
        this.f30999.setVisibility(z2 ? 0 : 8);
        if (z2) {
            EditText editText = this.f31004;
            z = c6058.f18564;
            editText.setText(z ? m31781.toUpperCase() : m31781.toLowerCase());
        }
    }
}
