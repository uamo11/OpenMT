package l;

import java.io.Serializable;

/* compiled from: Y4VB */
/* renamed from: l.ᩳ۬ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18074 implements Serializable {
    public static final long serialVersionUID = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object[] f56301;

    public C18074(Object[] objArr) {
        this.f56301 = objArr;
    }

    public Object readResolve() {
        return AbstractC14545.m34733(this.f56301);
    }
}
