package l;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: 469I */
/* renamed from: l.ۖܽܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2658 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f8361;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18886 f8362;

    public C2658(C18886 c18886) {
        this.f8362 = c18886;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8346(String str) {
        C16104 c16104;
        ForegroundColorSpan foregroundColorSpan;
        C15356 c15356;
        C15356 c153562;
        C15356 c153563;
        C15356 c153564;
        C15356 c153565;
        ForegroundColorSpan foregroundColorSpan2;
        ForegroundColorSpan foregroundColorSpan3;
        if (this.f8361 == null) {
            C18221 c18221 = (C18221) C11166.m27704().f53493.get(0);
            ArrayList arrayList = new ArrayList(c18221.m42445());
            this.f8361 = arrayList;
            Iterator it = c18221.m42442().iterator();
            while (it.hasNext()) {
                arrayList.add(((C16809) it.next()).f51605);
            }
            arrayList.trimToSize();
            Collections.sort(arrayList);
        }
        String lowerCase = str.toLowerCase();
        String[] split = lowerCase.split(":", 2);
        C0681 c0681 = new C0681();
        C18886 c18886 = this.f8362;
        c16104 = c18886.f59528;
        String lowerCase2 = c16104.m38009().toLowerCase();
        if (split.length == 1) {
            int indexOf = lowerCase2.indexOf(lowerCase);
            if (indexOf != -1) {
                SpannableString spannableString = new SpannableString(lowerCase2.concat(":"));
                foregroundColorSpan3 = c18886.f59534;
                spannableString.setSpan(foregroundColorSpan3, indexOf, lowerCase.length() + indexOf, 33);
                c0681.m2763(spannableString, 0);
            }
            int length = lowerCase2.length() + 1;
            Iterator it2 = this.f8361.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                int indexOf2 = str2.toLowerCase().indexOf(lowerCase);
                if (indexOf2 != -1) {
                    SpannableString spannableString2 = new SpannableString(C22870.m50967(lowerCase2, ":", str2));
                    foregroundColorSpan2 = c18886.f59534;
                    int i = length + indexOf2;
                    spannableString2.setSpan(foregroundColorSpan2, i, lowerCase.length() + i, 33);
                    c0681.m2763(spannableString2, indexOf2);
                }
            }
        } else if (lowerCase2.equals(split[0])) {
            lowerCase = split[1];
            int length2 = lowerCase2.length() + 1;
            Iterator it3 = this.f8361.iterator();
            while (it3.hasNext()) {
                String str3 = (String) it3.next();
                int indexOf3 = str3.toLowerCase().indexOf(lowerCase);
                if (indexOf3 != -1) {
                    SpannableString spannableString3 = new SpannableString(C22870.m50967(lowerCase2, ":", str3));
                    foregroundColorSpan = c18886.f59534;
                    spannableString3.setSpan(foregroundColorSpan, 0, lowerCase.length() + length2 + indexOf3, 33);
                    c0681.m2763(spannableString3, indexOf3);
                }
            }
        }
        c15356 = c18886.f59529;
        c15356.clear();
        c153562 = c18886.f59529;
        c0681.m2764(c153562);
        c153563 = c18886.f59529;
        if (c153563.size() == 1) {
            c153564 = c18886.f59529;
            if (((SpannableString) c153564.get(0)).toString().equals(lowerCase)) {
                c153565 = c18886.f59529;
                c153565.clear();
            }
        }
    }
}
