package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: 75V0 */
/* renamed from: l.᩺ۙۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22758 implements InterfaceC0179 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f73484 = false;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C20454 f73485 = new C11470(this);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C7236[] f73486;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73487;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f73488;

    public C22758(int i, HashMap hashMap) {
        this.f73487 = i;
        this.f73488 = hashMap;
        this.f73486 = new C7236[i];
    }

    @Override // l.InterfaceC0179
    /* renamed from: ֫ */
    public final Object mo1319(Object obj, Object obj2, AbstractC1591 abstractC1591, AbstractC1591 abstractC15912) {
        ArrayList arrayList;
        C13585 c13585;
        C13585 c135852;
        C7236[] c7236Arr = (C7236[]) obj;
        C7236[] c7236Arr2 = (C7236[]) obj2;
        int i = this.f73487;
        if (c7236Arr2 == null) {
            c7236Arr2 = new C7236[i];
            System.arraycopy(c7236Arr, 0, c7236Arr2, 0, i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                C7236 c7236 = c7236Arr[i2];
                C7236 c72362 = c7236Arr2[i2];
                if (c7236 != null) {
                    if (c72362 == null) {
                        c7236Arr2[i2] = c7236;
                    } else if (c7236 != c72362) {
                        C13585 c135853 = c7236.f22187;
                        if (c135853 != null) {
                            c135853.f40528 = true;
                        }
                        C13585 c135854 = c72362.f22187;
                        if (c135854 != null) {
                            c135854.f40528 = true;
                        }
                    }
                }
            }
        }
        if (abstractC15912.f5638 == EnumC7690.LABEL && (arrayList = ((C13334) abstractC15912).f39897) != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                for (AbstractC8396 abstractC8396 : ((C21802) it.next()).f42445.mo15838()) {
                    int i3 = ((C18274) abstractC8396).f56817;
                    C7236 c72363 = c7236Arr[i3];
                    C7236 c72364 = c7236Arr2[i3];
                    if (c72364 != null) {
                        if (!c72364.f22186 && (c135852 = c72364.f22187) != null) {
                            c135852.f40528 = true;
                        }
                    } else if (c72363 != null && !c72363.f22186 && (c13585 = c72363.f22187) != null) {
                        c13585.f40528 = true;
                    }
                }
            }
        }
        return c7236Arr2;
    }

    @Override // l.InterfaceC0179
    /* renamed from: ֫ */
    public final Object mo1320(Object obj, AbstractC1591 abstractC1591) {
        this.f73484 = false;
        int i = this.f73487;
        C7236[] c7236Arr = this.f73486;
        System.arraycopy((C7236[]) obj, 0, c7236Arr, 0, i);
        this.f73485.mo28276(abstractC1591);
        if (abstractC1591.f5630.size() > 1) {
            this.f73484 = true;
        }
        if (!this.f73484) {
            abstractC1591.f5637 = null;
        }
        return c7236Arr;
    }

    @Override // l.InterfaceC0179
    /* renamed from: ֫ */
    public final Object mo1318() {
        return new C7236[this.f73487];
    }
}
