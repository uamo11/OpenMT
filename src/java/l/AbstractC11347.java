package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: E1HX */
/* renamed from: l.ۨ֡ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC11347 implements Cloneable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final List f33968 = Collections.EMPTY_LIST;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC11347 f33969;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f33970;

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* renamed from: ֫ */
    public abstract C15578 mo25045();

    /* renamed from: ֫ */
    public abstract void mo7189(Appendable appendable, int i, C0056 c0056);

    /* renamed from: ۜ */
    public abstract List mo25047();

    /* renamed from: ۧ */
    public abstract void mo7190(Appendable appendable, int i, C0056 c0056);

    /* renamed from: ܳ */
    public abstract AbstractC11347 mo10980();

    /* renamed from: ܺ */
    public abstract String mo2915();

    /* renamed from: ܽ */
    public abstract String mo25050();

    /* renamed from: ܽ */
    public abstract void mo25051(String str);

    /* renamed from: ᩳ */
    public abstract int mo10981();

    /* renamed from: ᩷ */
    public abstract boolean mo25054();

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m28094() {
        return this.f33969 != null;
    }

    /* renamed from: ۧ */
    public String mo25048(String str) {
        C16990.m39822((Object) str);
        if (!mo25054()) {
            return "";
        }
        String m36725 = mo25045().m36725(str);
        return m36725.length() > 0 ? m36725 : str.startsWith("abs:") ? mo25043(str.substring(4)) : "";
    }

    /* renamed from: ֫ */
    public AbstractC11347 mo20901(String str, String str2) {
        mo25045().m36732(C22635.m50637(this).m26763().m5153(str), str2);
        return this;
    }

    /* renamed from: ᩳ */
    public boolean mo25052(String str) {
        C16990.m39822((Object) str);
        if (!mo25054()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (mo25045().m36738(substring) && !mo25043(substring).isEmpty()) {
                return true;
            }
        }
        return mo25045().m36738(str);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m28098(String str) {
        C16990.m39822((Object) str);
        mo25051(str);
    }

    /* renamed from: ֫ */
    public String mo25043(String str) {
        C16990.m39823(str);
        return (mo25054() && mo25045().m36738(str)) ? C20519.m46997(mo25050(), mo25045().m36725(str)) : "";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC11347 m28087(int i) {
        return (AbstractC11347) mo25047().get(i);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List m28097() {
        if (mo10981() == 0) {
            return f33968;
        }
        List mo25047 = mo25047();
        ArrayList arrayList = new ArrayList(mo25047.size());
        arrayList.addAll(mo25047);
        return C20195.unmodifiableList(arrayList);
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC11347 mo28099() {
        return this.f33969;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC11347 m28085() {
        return this.f33969;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC11347 mo28086() {
        AbstractC11347 abstractC11347 = this;
        while (true) {
            AbstractC11347 abstractC113472 = abstractC11347.f33969;
            if (abstractC113472 == null) {
                return abstractC11347;
            }
            abstractC11347 = abstractC113472;
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C0762 m28090() {
        AbstractC11347 mo28086 = mo28086();
        if (mo28086 instanceof C0762) {
            return (C0762) mo28086;
        }
        return null;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m28091() {
        C16990.m39822(this.f33969);
        this.f33969.mo28095(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28089(C13462 c13462) {
        C16990.m39822(this.f33969);
        AbstractC11347 abstractC11347 = this.f33969;
        abstractC11347.getClass();
        C16990.m39825(this.f33969 == abstractC11347);
        AbstractC11347 abstractC113472 = c13462.f33969;
        if (abstractC113472 != null) {
            abstractC113472.mo28095(c13462);
        }
        int i = this.f33970;
        abstractC11347.mo25047().set(i, c13462);
        c13462.f33969 = abstractC11347;
        c13462.f33970 = i;
        this.f33969 = null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo28095(AbstractC11347 abstractC11347) {
        C16990.m39825(abstractC11347.f33969 == this);
        int i = abstractC11347.f33970;
        mo25047().remove(i);
        m28083(i);
        abstractC11347.f33969 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28088(int i, AbstractC11347... abstractC11347Arr) {
        C16990.m39822(abstractC11347Arr);
        if (abstractC11347Arr.length == 0) {
            return;
        }
        List mo25047 = mo25047();
        AbstractC11347 mo28099 = abstractC11347Arr[0].mo28099();
        if (mo28099 != null && mo28099.mo10981() == abstractC11347Arr.length) {
            List mo250472 = mo28099.mo25047();
            int length = abstractC11347Arr.length;
            while (true) {
                int i2 = length - 1;
                if (length > 0) {
                    if (abstractC11347Arr[i2] != mo250472.get(i2)) {
                        break;
                    } else {
                        length = i2;
                    }
                } else {
                    boolean z = mo10981() == 0;
                    mo28099.mo10980();
                    mo25047.addAll(i, Arrays.asList(abstractC11347Arr));
                    int length2 = abstractC11347Arr.length;
                    while (true) {
                        int i3 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        abstractC11347Arr[i3].f33969 = this;
                        length2 = i3;
                    }
                    if (z && abstractC11347Arr[0].f33970 == 0) {
                        return;
                    }
                    m28083(i);
                    return;
                }
            }
        }
        for (AbstractC11347 abstractC11347 : abstractC11347Arr) {
            if (abstractC11347 == null) {
                throw new C14167("Array must not contain any null objects");
            }
        }
        for (AbstractC11347 abstractC113472 : abstractC11347Arr) {
            abstractC113472.getClass();
            AbstractC11347 abstractC113473 = abstractC113472.f33969;
            if (abstractC113473 != null) {
                abstractC113473.mo28095(abstractC113472);
            }
            abstractC113472.f33969 = this;
        }
        mo25047.addAll(i, Arrays.asList(abstractC11347Arr));
        m28083(i);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m28083(int i) {
        int mo10981 = mo10981();
        if (mo10981 == 0) {
            return;
        }
        List mo25047 = mo25047();
        while (i < mo10981) {
            ((AbstractC11347) mo25047.get(i)).f33970 = i;
            i++;
        }
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List m28096() {
        AbstractC11347 abstractC11347 = this.f33969;
        if (abstractC11347 == null) {
            return Collections.EMPTY_LIST;
        }
        List<AbstractC11347> mo25047 = abstractC11347.mo25047();
        ArrayList arrayList = new ArrayList(mo25047.size() - 1);
        for (AbstractC11347 abstractC113472 : mo25047) {
            if (abstractC113472 != this) {
                arrayList.add(abstractC113472);
            }
        }
        return arrayList;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC11347 m28093() {
        AbstractC11347 abstractC11347 = this.f33969;
        if (abstractC11347 == null) {
            return null;
        }
        List mo25047 = abstractC11347.mo25047();
        int i = this.f33970 + 1;
        if (mo25047.size() > i) {
            return (AbstractC11347) mo25047.get(i);
        }
        return null;
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m28092() {
        return this.f33970;
    }

    /* renamed from: ۖ */
    public String mo2910() {
        StringBuilder m47000 = C20519.m47000();
        C0762 m28090 = m28090();
        if (m28090 == null) {
            m28090 = new C0762("");
        }
        C22412.m50342(new C5702(m47000, m28090.m2907()), this);
        return C20519.m46998(m47000);
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C1614 m28100() {
        return C1614.m5476(this, true);
    }

    public String toString() {
        return mo2910();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m28084(Appendable appendable, int i, C0056 c0056) {
        appendable.append('\n');
        c0056.getClass();
        appendable.append(C20519.m46996(c0056.m983() * i, c0056.m982()));
    }

    @Override // 
    /* renamed from: clone */
    public AbstractC11347 mo2918clone() {
        AbstractC11347 mo25044 = mo25044((AbstractC11347) null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(mo25044);
        while (!linkedList.isEmpty()) {
            AbstractC11347 abstractC11347 = (AbstractC11347) linkedList.remove();
            int mo10981 = abstractC11347.mo10981();
            for (int i = 0; i < mo10981; i++) {
                List mo25047 = abstractC11347.mo25047();
                AbstractC11347 mo250442 = ((AbstractC11347) mo25047.get(i)).mo25044(abstractC11347);
                mo25047.set(i, mo250442);
                linkedList.add(mo250442);
            }
        }
        return mo25044;
    }

    /* renamed from: ֫ */
    public AbstractC11347 mo25044(AbstractC11347 abstractC11347) {
        C0762 m28090;
        try {
            AbstractC11347 abstractC113472 = (AbstractC11347) super.clone();
            abstractC113472.f33969 = abstractC11347;
            abstractC113472.f33970 = abstractC11347 == null ? 0 : this.f33970;
            if (abstractC11347 == null && !(this instanceof C0762) && (m28090 = m28090()) != null) {
                C0762 m2913 = m28090.m2913();
                abstractC113472.f33969 = m2913;
                m2913.mo25047().add(abstractC113472);
            }
            return abstractC113472;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
