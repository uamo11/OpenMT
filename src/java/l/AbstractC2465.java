package l;

/* compiled from: 37DX */
/* renamed from: l.ۖۤۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC2465 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC10932 f7865;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object f7866;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int mo7941() {
        return 1;
    }

    public AbstractC2465(EnumC10932 enumC10932, Object obj) {
        this.f7865 = enumC10932;
        this.f7866 = obj;
    }

    public int hashCode() {
        Object obj = this.f7866;
        return this.f7865.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2465)) {
            return false;
        }
        AbstractC2465 abstractC2465 = (AbstractC2465) obj;
        return this.f7866.equals(abstractC2465.f7866) && this.f7865 == abstractC2465.f7865;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo7940(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2465)) {
            return false;
        }
        AbstractC2465 abstractC2465 = (AbstractC2465) obj;
        EnumC10932 enumC10932 = abstractC2465.f7865;
        Object obj2 = this.f7866;
        boolean z = obj2 instanceof C15869;
        EnumC10932 enumC109322 = this.f7865;
        if (!z) {
            return obj2.equals(abstractC2465.f7866) && enumC109322 == enumC10932;
        }
        Object obj3 = abstractC2465.f7866;
        return (obj3 instanceof C15869) && ((C15869) obj2).m37605(obj3) && enumC109322 == enumC10932;
    }

    public String toString() {
        return C20087.m46306("[", this.f7865.toString(), " : '", mo7938(), "']");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String mo7938() {
        Object obj = this.f7866;
        return obj == null ? "?" : obj.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo7939(InterfaceC0408 interfaceC0408) {
        ((C6053) interfaceC0408).m16882((int) this.f7865.m27256());
    }
}
