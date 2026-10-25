package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* compiled from: Q917 */
/* renamed from: l.ۖۗۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2257 implements LeadingMarginSpan {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C12881 f7335;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Paint f7336 = AbstractC15661.m36873();

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f7337;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f7338;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC19938 f7339;

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.f7336;
            paint2.set(paint);
            C12881 c12881 = this.f7335;
            c12881.m31322(paint2);
            float measureText = paint2.measureText("8");
            float measureText2 = paint2.measureText(".");
            float measureText3 = paint2.measureText(" ");
            String str = this.f7337;
            int length = (int) ((str.length() * measureText) + measureText2 + measureText3 + 0.5f);
            int length2 = (int) ((String.valueOf(this.f7339.mo3236()).length() * measureText) + measureText2 + measureText3 + 0.5f);
            int m31314 = c12881.m31314();
            if (length2 > m31314) {
                this.f7338 = length2;
            } else {
                this.f7338 = 0;
                length2 = m31314;
            }
            int i8 = i2 > 0 ? ((length2 * i2) + i) - length : (length2 - length) + (length2 * i2) + i;
            Paint.Align textAlign = paint2.getTextAlign();
            paint2.setTextAlign(Paint.Align.CENTER);
            float f = measureText / 2.0f;
            float f2 = i8 + f;
            int i9 = 0;
            for (int length3 = str.length(); i9 < length3; length3 = length3) {
                int i10 = i9 + 1;
                canvas.drawText(this.f7337, i9, i10, f2, i4, paint2);
                f2 += measureText;
                i9 = i10;
            }
            canvas.drawText(".", (measureText2 / 2.0f) + (f2 - f), i4, paint2);
            paint2.setTextAlign(textAlign);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7461(android.widget.TextView r7, android.text.SpannableStringBuilder r8) {
        /*
            int r0 = r8.length()
            java.lang.Class<l.ۖۗۘ> r1 = l.C2257.class
            r2 = 0
            java.lang.Object[] r8 = r8.getSpans(r2, r0, r1)
            l.ۖۗۘ[] r8 = (l.C2257[]) r8
            if (r8 == 0) goto L46
            android.text.TextPaint r7 = r7.getPaint()
            java.lang.String r0 = "8"
            float r0 = r7.measureText(r0)
            java.lang.String r1 = "."
            float r1 = r7.measureText(r1)
            java.lang.String r3 = " "
            float r7 = r7.measureText(r3)
            int r3 = r8.length
        L26:
            if (r2 >= r3) goto L46
            r4 = r8[r2]
            l.᩶ۙۘ r5 = r4.f7339
            int r5 = r5.mo3236()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r5 = r5.length()
            float r5 = (float) r5
            float r5 = r5 * r0
            float r5 = r5 + r1
            float r5 = r5 + r7
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r6
            int r5 = (int) r5
            r4.f7338 = r5
            int r2 = r2 + 1
            goto L26
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2257.m7461(android.widget.TextView, android.text.SpannableStringBuilder):void");
    }

    public C2257(C12881 c12881, String str, InterfaceC19938 interfaceC19938) {
        this.f7335 = c12881;
        this.f7337 = str;
        this.f7339 = interfaceC19938;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return Math.max(this.f7338, this.f7335.m31314());
    }
}
