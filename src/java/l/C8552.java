package l;

import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: TB7B */
/* renamed from: l.ۡ֨ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8552 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Paint f26148;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C16997 f26149;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f26150;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C20672 f26151;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f26152;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Paint f26153;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f26154;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16997 f26155;

    public C8552() {
        Paint paint = new Paint();
        this.f26148 = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.f26153 = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.f26151 = C20672.m47291();
    }

    public C8552(C8552 c8552) {
        this.f26150 = c8552.f26150;
        this.f26152 = c8552.f26152;
        this.f26148 = new Paint(c8552.f26148);
        this.f26153 = new Paint(c8552.f26153);
        C16997 c16997 = c8552.f26149;
        if (c16997 != null) {
            this.f26149 = new C16997(c16997);
        }
        C16997 c169972 = c8552.f26155;
        if (c169972 != null) {
            this.f26155 = new C16997(c169972);
        }
        this.f26154 = c8552.f26154;
        try {
            this.f26151 = (C20672) c8552.f26151.clone();
        } catch (CloneNotSupportedException unused) {
            this.f26151 = C20672.m47291();
        }
    }
}
