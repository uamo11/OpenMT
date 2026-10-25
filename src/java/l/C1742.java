package l;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: U9SC */
/* renamed from: l.֫ۢۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1742 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Set f6019;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C23239 f6022;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ListView f6023;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f6021 = new ArrayList();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int f6020 = -1;

    static {
        HashSet hashSet = new HashSet();
        for (EnumC0841 enumC0841 : EnumC0841.values()) {
            hashSet.add(enumC0841.f3315);
        }
        f6019 = C20195.unmodifiableSet(hashSet);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5819(C12392 c12392) {
        InterfaceC7785 m30436 = c12392.m30436();
        int m30444 = c12392.m30444();
        int lastIndexOf = TextUtils.lastIndexOf(m30436, '\n', m30444 - 1) + 1;
        int indexOf = TextUtils.indexOf((CharSequence) m30436, '\n', m30444);
        if (indexOf == -1) {
            indexOf = m30436.length();
        }
        String trim = m30436.subSequence(lastIndexOf, indexOf).toString().trim();
        int indexOf2 = trim.indexOf(32);
        if (indexOf2 != -1) {
            trim = trim.substring(0, indexOf2);
        }
        if (f6019.contains(trim)) {
            return trim;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0086 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[Catch: all -> 0x018a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0006, B:18:0x0082, B:30:0x0089, B:32:0x008e, B:49:0x0100, B:54:0x0182, B:59:0x017f, B:61:0x0184, B:62:0x0189, B:63:0x0037, B:65:0x003f, B:69:0x004f, B:72:0x0059, B:75:0x0063, B:78:0x006d, B:81:0x0077), top: B:3:0x0006, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1742(l.AbstractActivityC3346 r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1742.<init>(l.ۗܺ᩷, java.lang.String):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static CharSequence m5818(String str, CharSequence charSequence, int i) {
        int m24606 = C9679.m24606(str, charSequence, 0);
        if (m24606 == -1) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        do {
            spannableString.setSpan(new StyleSpan(1), m24606, str.length() + m24606, 33);
            spannableString.setSpan(new ForegroundColorSpan(i), m24606, str.length() + m24606, 33);
            m24606 = C9679.m24606(str, charSequence, str.length() + m24606);
        } while (m24606 != -1);
        return spannableString;
    }
}
