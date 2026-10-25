package l;

import java.util.ArrayList;

/* compiled from: S69M */
/* renamed from: l.֨᩶ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1347 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14961 f4892;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C11631 f4894 = new C11631(30);

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f4897 = new ArrayList();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f4896 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f4893 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9318 f4895 = new C9318(this);

    public C1347(C14961 c14961) {
        this.f4892 = c14961;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m4713() {
        m4704(this.f4897);
        m4704(this.f4896);
        this.f4893 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0005 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f A[SYNTHETIC] */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4714() {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1347.m4714():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4703() {
        ArrayList arrayList = this.f4896;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f4892.m35437((C5581) arrayList.get(i));
        }
        m4704(arrayList);
        this.f4893 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m4697(C5581 c5581) {
        int i;
        C11631 c11631;
        int i2 = c5581.f17282;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m4700 = m4700(c5581.f17285, i2);
        int i3 = c5581.f17285;
        int i4 = c5581.f17282;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c5581);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c5581.f17283;
            c11631 = this.f4894;
            if (i5 >= i7) {
                break;
            }
            int m47002 = m4700((i * i5) + c5581.f17285, c5581.f17282);
            int i8 = c5581.f17282;
            if (i8 == 2 ? m47002 != m4700 : !(i8 == 4 && m47002 == m4700 + 1)) {
                C5581 m4702 = m4702(c5581.f17284, i8, m4700, i6);
                m4705(m4702, i3);
                m4702.f17284 = null;
                c11631.mo16807(m4702);
                if (c5581.f17282 == 4) {
                    i3 += i6;
                }
                m4700 = m47002;
                i6 = 1;
            } else {
                i6++;
            }
            i5++;
        }
        Object obj = c5581.f17284;
        c5581.f17284 = null;
        c11631.mo16807(c5581);
        if (i6 > 0) {
            C5581 m47022 = m4702(obj, c5581.f17282, m4700, i6);
            m4705(m47022, i3);
            m47022.f17284 = null;
            c11631.mo16807(m47022);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m4700(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = this.f4896;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5581 c5581 = (C5581) arrayList.get(size);
            int i5 = c5581.f17282;
            if (i5 == 8) {
                int i6 = c5581.f17285;
                int i7 = c5581.f17283;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c5581.f17285 = i6 + 1;
                            c5581.f17283 = i7 + 1;
                        } else if (i2 == 2) {
                            c5581.f17285 = i6 - 1;
                            c5581.f17283 = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c5581.f17283 = i7 + 1;
                    } else if (i2 == 2) {
                        c5581.f17283 = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c5581.f17285 = i6 + 1;
                    } else if (i2 == 2) {
                        c5581.f17285 = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c5581.f17285;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c5581.f17283;
                    } else if (i5 == 2) {
                        i += c5581.f17283;
                    }
                } else if (i2 == 1) {
                    c5581.f17285 = i8 + 1;
                } else if (i2 == 2) {
                    c5581.f17285 = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C5581 c55812 = (C5581) arrayList.get(size2);
            int i9 = c55812.f17282;
            C11631 c11631 = this.f4894;
            if (i9 == 8) {
                int i10 = c55812.f17283;
                if (i10 == c55812.f17285 || i10 < 0) {
                    arrayList.remove(size2);
                    c55812.f17284 = null;
                    c11631.mo16807(c55812);
                }
            } else if (c55812.f17283 <= 0) {
                arrayList.remove(size2);
                c55812.f17284 = null;
                c11631.mo16807(c55812);
            }
        }
        return i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m4699(int i) {
        ArrayList arrayList = this.f4896;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5581 c5581 = (C5581) arrayList.get(i2);
            int i3 = c5581.f17282;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c5581.f17285;
                    int i5 = c5581.f17283 + i4;
                    while (i4 < i5) {
                        if (m4701(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m4701(c5581.f17283, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m4698(C5581 c5581) {
        this.f4896.add(c5581);
        int i = c5581.f17282;
        C14961 c14961 = this.f4892;
        if (i == 1) {
            int i2 = c5581.f17285;
            int i3 = c5581.f17283;
            C13132 c13132 = c14961.f45614;
            c13132.offsetPositionRecordsForInsert(i2, i3);
            c13132.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 2) {
            int i4 = c5581.f17285;
            int i5 = c5581.f17283;
            C13132 c131322 = c14961.f45614;
            c131322.offsetPositionRecordsForRemove(i4, i5, false);
            c131322.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            int i6 = c5581.f17285;
            int i7 = c5581.f17283;
            Object obj = c5581.f17284;
            C13132 c131323 = c14961.f45614;
            c131323.viewRangeUpdate(i6, i7, obj);
            c131323.mItemsChanged = true;
            return;
        }
        if (i == 8) {
            int i8 = c5581.f17285;
            int i9 = c5581.f17283;
            C13132 c131324 = c14961.f45614;
            c131324.offsetPositionRecordsForMove(i8, i9);
            c131324.mItemsAddedOrRemoved = true;
            return;
        }
        throw new IllegalArgumentException("Unknown update op type for " + c5581);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m4711() {
        return this.f4897.size() > 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m4706(int i) {
        return (i & this.f4893) != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m4701(int i, int i2) {
        ArrayList arrayList = this.f4896;
        int size = arrayList.size();
        while (i2 < size) {
            C5581 c5581 = (C5581) arrayList.get(i2);
            int i3 = c5581.f17282;
            if (i3 == 8) {
                int i4 = c5581.f17285;
                if (i4 == i) {
                    i = c5581.f17283;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c5581.f17283 <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c5581.f17285;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c5581.f17283;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c5581.f17283;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m4708(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        C5581 m4702 = m4702(obj, 4, i, i2);
        ArrayList arrayList = this.f4897;
        arrayList.add(m4702);
        this.f4893 |= 4;
        return arrayList.size() == 1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m4710(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        C5581 m4702 = m4702(null, 1, i, i2);
        ArrayList arrayList = this.f4897;
        arrayList.add(m4702);
        this.f4893 |= 1;
        return arrayList.size() == 1;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m4712(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        C5581 m4702 = m4702(null, 2, i, i2);
        ArrayList arrayList = this.f4897;
        arrayList.add(m4702);
        this.f4893 |= 2;
        return arrayList.size() == 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m4707(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        C5581 m4702 = m4702(null, 8, i, i2);
        ArrayList arrayList = this.f4897;
        arrayList.add(m4702);
        this.f4893 |= 8;
        return arrayList.size() == 1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4709() {
        m4703();
        ArrayList arrayList = this.f4897;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5581 c5581 = (C5581) arrayList.get(i);
            int i2 = c5581.f17282;
            C14961 c14961 = this.f4892;
            if (i2 == 1) {
                c14961.m35437(c5581);
                int i3 = c5581.f17285;
                int i4 = c5581.f17283;
                C13132 c13132 = c14961.f45614;
                c13132.offsetPositionRecordsForInsert(i3, i4);
                c13132.mItemsAddedOrRemoved = true;
            } else if (i2 == 2) {
                c14961.m35437(c5581);
                int i5 = c5581.f17285;
                int i6 = c5581.f17283;
                C13132 c131322 = c14961.f45614;
                c131322.offsetPositionRecordsForRemove(i5, i6, true);
                c131322.mItemsAddedOrRemoved = true;
                c131322.mState.f69349 += i6;
            } else if (i2 == 4) {
                c14961.m35437(c5581);
                int i7 = c5581.f17285;
                int i8 = c5581.f17283;
                Object obj = c5581.f17284;
                C13132 c131323 = c14961.f45614;
                c131323.viewRangeUpdate(i7, i8, obj);
                c131323.mItemsChanged = true;
            } else if (i2 == 8) {
                c14961.m35437(c5581);
                int i9 = c5581.f17285;
                int i10 = c5581.f17283;
                C13132 c131324 = c14961.f45614;
                c131324.offsetPositionRecordsForMove(i9, i10);
                c131324.mItemsAddedOrRemoved = true;
            }
        }
        m4704(arrayList);
        this.f4893 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5581 m4702(Object obj, int i, int i2, int i3) {
        C5581 c5581 = (C5581) this.f4894.mo16806();
        if (c5581 == null) {
            C5581 c55812 = new C5581();
            c55812.f17282 = i;
            c55812.f17285 = i2;
            c55812.f17283 = i3;
            c55812.f17284 = obj;
            return c55812;
        }
        c5581.f17282 = i;
        c5581.f17285 = i2;
        c5581.f17283 = i3;
        c5581.f17284 = obj;
        return c5581;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4704(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5581 c5581 = (C5581) arrayList.get(i);
            c5581.f17284 = null;
            this.f4894.mo16807(c5581);
        }
        arrayList.clear();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4705(C5581 c5581, int i) {
        C14961 c14961 = this.f4892;
        c14961.m35437(c5581);
        int i2 = c5581.f17282;
        if (i2 == 2) {
            int i3 = c5581.f17283;
            C13132 c13132 = c14961.f45614;
            c13132.offsetPositionRecordsForRemove(i, i3, true);
            c13132.mItemsAddedOrRemoved = true;
            c13132.mState.f69349 += i3;
            return;
        }
        if (i2 == 4) {
            int i4 = c5581.f17283;
            Object obj = c5581.f17284;
            C13132 c131322 = c14961.f45614;
            c131322.viewRangeUpdate(i, i4, obj);
            c131322.mItemsChanged = true;
            return;
        }
        throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    }
}
