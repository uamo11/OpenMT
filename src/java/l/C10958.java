package l;

import java.util.Comparator;

/* compiled from: D70T */
/* renamed from: l.ۧۧܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C10958 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C5313 c5313 = (C5313) obj;
        C5313 c53132 = (C5313) obj2;
        int compare = Long.compare(c53132.m15230(), c5313.m15230());
        if (compare != 0) {
            return compare;
        }
        int compare2 = Long.compare(c53132.m15230() + c53132.m15228(), c5313.m15230() + c5313.m15228());
        return compare2 != 0 ? compare2 : Integer.compare(c5313.m15228(), c53132.m15228());
    }
}
