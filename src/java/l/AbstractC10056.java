package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: V4OW */
/* renamed from: l.ۤۙ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC10056 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3454 f30232;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC14993 f30233;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f30235 = null;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f30236 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f30234 = new ArrayList();

    /* renamed from: ֫ */
    public abstract void mo1313(C10720 c10720, C12172 c12172);

    public AbstractC10056(C3454 c3454, EnumC14993 enumC14993) {
        this.f30232 = c3454;
        this.f30233 = enumC14993;
    }

    /* renamed from: ֫ */
    public int mo14223(int i) {
        ArrayList arrayList = this.f30234;
        if (arrayList.size() > 0) {
            EnumC14993 enumC14993 = this.f30233;
            int i2 = enumC14993.f45741 - 1;
            int i3 = (i + i2) & (~i2);
            this.f30236 = i3;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractC5116 abstractC5116 = (AbstractC5116) arrayList.get(i4);
                int i5 = enumC14993.f45741 - 1;
                i3 = abstractC5116.m14658((i3 + i5) & (~i5), i4);
            }
            return i3;
        }
        this.f30236 = 0;
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m25236() {
        return this.f30234;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5116 m25237(AbstractC5116 abstractC5116) {
        HashMap hashMap = this.f30235;
        ArrayList arrayList = this.f30234;
        if (hashMap == null) {
            this.f30235 = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC5116 abstractC51162 = (AbstractC5116) it.next();
                this.f30235.put(abstractC51162, abstractC51162);
            }
        }
        AbstractC5116 abstractC51163 = (AbstractC5116) this.f30235.get(abstractC5116);
        if (abstractC51163 != null) {
            return abstractC51163;
        }
        this.f30235.put(abstractC5116, abstractC5116);
        arrayList.add(abstractC5116);
        return abstractC5116;
    }
}
