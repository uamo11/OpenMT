package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: V5XH */
/* renamed from: l.᩶۬ܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C20191 implements InterfaceC7409, Serializable {
    public static final long serialVersionUID = 0;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C20191 f65345;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f65346 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final transient AbstractC14545 f65347;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final transient AbstractC14545 f65348;

    static {
        int i = AbstractC14545.f44556;
        AbstractC14545 abstractC14545 = C16457.f50591;
        f65345 = new C20191(abstractC14545, abstractC14545);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C20191 m46426() {
        return f65345;
    }

    public C20191(AbstractC14545 abstractC14545, AbstractC14545 abstractC145452) {
        this.f65347 = abstractC14545;
        this.f65348 = abstractC145452;
    }

    @Override // l.InterfaceC7409
    /* renamed from: ֫ */
    public final Object mo11960(Integer num) {
        C5374 c5374 = new C5374();
        C2264 c2264 = new C2264(num);
        EnumC1806 enumC1806 = EnumC1806.f6229;
        EnumC10108 enumC10108 = EnumC10108.f30432;
        int m27290 = C10979.m27290(this.f65347, c5374, c2264, C13053.f39070, enumC1806, enumC10108);
        if (m27290 != -1 && ((C13758) this.f65347.get(m27290)).m33073(num)) {
            return this.f65348.get(m27290);
        }
        return null;
    }

    @Override // l.InterfaceC7409
    /* renamed from: ֫ */
    public final AbstractC9608 mo11961() {
        AbstractC14545 abstractC14545 = this.f65347;
        if (abstractC14545.isEmpty()) {
            return C6580.f20283;
        }
        int i = C13758.f41051;
        return new C18054(new C9403(abstractC14545, C22931.f73892), this.f65348, null);
    }

    /* renamed from: ֫ */
    public C20191 mo36250(C13758 c13758) {
        if (!c13758.m33072()) {
            AbstractC14545 abstractC14545 = this.f65347;
            if (!abstractC14545.isEmpty()) {
                if (abstractC14545.isEmpty()) {
                    throw new NoSuchElementException();
                }
                if (!c13758.m33074(C13758.m33064(((C13758) abstractC14545.get(0)).f41052, ((C13758) abstractC14545.get(abstractC14545.size() - 1)).f41053))) {
                    C1140 c1140 = new C1140();
                    AbstractC3675 abstractC3675 = c13758.f41052;
                    EnumC1806 enumC1806 = EnumC1806.f6227;
                    EnumC10108 enumC10108 = EnumC10108.f30433;
                    abstractC3675.getClass();
                    C13053 c13053 = C13053.f39070;
                    int m27290 = C10979.m27290(abstractC14545, c1140, abstractC3675, c13053, enumC1806, enumC10108);
                    C5374 c5374 = new C5374();
                    AbstractC3675 abstractC36752 = c13758.f41053;
                    EnumC1806 enumC18062 = EnumC1806.f6229;
                    abstractC36752.getClass();
                    int m272902 = C10979.m27290(abstractC14545, c5374, abstractC36752, c13053, enumC18062, enumC10108);
                    if (m27290 < m272902) {
                        return new C15250(new C8196(this, m272902 - m27290, m27290, c13758), this.f65348.subList(m27290, m272902), c13758, this);
                    }
                }
            }
            return this;
        }
        return f65345;
    }

    public final int hashCode() {
        return mo11961().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC7409)) {
            return false;
        }
        AbstractC9608 mo11961 = mo11961();
        Map mo119612 = ((InterfaceC7409) obj).mo11961();
        mo11961.getClass();
        return C19405.m44689(mo11961, mo119612);
    }

    public final String toString() {
        AbstractC9608 mo11961 = mo11961();
        mo11961.getClass();
        return C19405.m44688(mo11961);
    }

    public Object writeReplace() {
        return new C22307(mo11961());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
