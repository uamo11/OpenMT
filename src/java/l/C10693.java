package l;

/* compiled from: R9RN */
/* renamed from: l.ۧ֫ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10693 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f32187;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f32188;

    public C10693(int i, int i2) {
        this.f32187 = i;
        this.f32188 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10693.class == obj.getClass()) {
            C10693 c10693 = (C10693) obj;
            if (this.f32187 == c10693.f32187 && this.f32188 == c10693.f32188) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f32187 * 31) + this.f32188;
    }
}
