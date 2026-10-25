package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: Y22J */
/* renamed from: l.ܺ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16256 extends C8496 implements InterfaceC13122 {

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f50007;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public AbstractC9202 f50008;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C24018 f50009;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f50010 = -1;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f50006 = -1;

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0214, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r21.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C16256 m38226(android.content.Context r19, android.content.res.Resources r20, android.content.res.XmlResourceParser r21, android.util.AttributeSet r22, android.content.res.Resources.Theme r23) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16256.m38226(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):l.ܺ᩻");
    }

    @Override // l.C19786, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC9202 abstractC9202 = this.f50008;
        if (abstractC9202 != null && (visible || z2)) {
            if (z) {
                abstractC9202.mo19082();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    @Override // l.C19786, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC9202 abstractC9202 = this.f50008;
        if (abstractC9202 != null) {
            abstractC9202.mo19083();
            this.f50008 = null;
            m45480(this.f50010);
            this.f50010 = -1;
            this.f50006 = -1;
        }
    }

    public C16256(C24018 c24018, Resources resources) {
        mo22191(new C24018(c24018, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // l.C8496, l.C19786, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f50007) {
            super.mutate();
            this.f50009.mo4949();
            this.f50007 = true;
        }
        return this;
    }

    @Override // l.C19786
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC19080 mo38227() {
        return new C24018(this.f50009, this, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fc, code lost:
    
        if (m45480(r4) != false) goto L52;
     */
    @Override // l.C8496, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16256.onStateChange(int[]):boolean");
    }

    @Override // l.C8496, l.C19786
    /* renamed from: ֫ */
    public final void mo22191(AbstractC19080 abstractC19080) {
        super.mo22191(abstractC19080);
        if (abstractC19080 instanceof C24018) {
            this.f50009 = (C24018) abstractC19080;
        }
    }
}
