package l;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: M2AR */
/* renamed from: l.ۤ۬ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10312 implements Comparable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f31043;

    public C10312(Collator collator, String str, boolean z) {
        Pattern pattern;
        ArrayList arrayList = new ArrayList();
        this.f31043 = arrayList;
        if (z) {
            arrayList.add(new C6078(collator, str, false));
            return;
        }
        pattern = C7489.f23074;
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (true) {
            if (!matcher.find()) {
                break;
            }
            String group = matcher.group();
            if (!group.isEmpty()) {
                i += group.length();
                char charAt = group.charAt(0);
                this.f31043.add(new C6078(collator, group, '0' <= charAt && charAt <= '9'));
            }
        }
        C12171.m29642(i == str.length());
    }

    @Override // java.lang.Comparable
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C10312 c10312) {
        Iterator it = this.f31043.iterator();
        Iterator it2 = c10312.f31043.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = ((C6078) it.next()).compareTo((C6078) it2.next());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }
}
