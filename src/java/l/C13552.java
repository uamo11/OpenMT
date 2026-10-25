package l;

import java.io.Serializable;
import java.util.EnumSet;

/* compiled from: A5TB */
/* renamed from: l.ܰۗܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13552 implements Serializable {
    public static final long serialVersionUID = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumSet f40440;

    public C13552(EnumSet enumSet) {
        this.f40440 = enumSet;
    }

    public Object readResolve() {
        return new C7203(this.f40440.clone(), 0);
    }
}
