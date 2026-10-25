package l;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: E8SE */
/* renamed from: l.ۤ᩵ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10499 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set f31493;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f31494;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f31495;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f31496;

    public C10499(String str, int i, String str2, Set set) {
        this.f31495 = i;
        this.f31494 = str;
        this.f31496 = str2;
        this.f31493 = set;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10499 m26400(int i, String str) {
        String str2;
        String trim = str.trim();
        C22632.m50631(!trim.isEmpty());
        int indexOf = trim.indexOf(" ");
        if (indexOf == -1) {
            str2 = "";
        } else {
            String trim2 = trim.substring(indexOf).trim();
            trim = trim.substring(0, indexOf);
            str2 = trim2;
        }
        String str3 = C3603.f11424;
        String[] split = trim.split("\\.", -1);
        String str4 = split[0];
        HashSet hashSet = new HashSet();
        for (int i2 = 1; i2 < split.length; i2++) {
            hashSet.add(split[i2]);
        }
        return new C10499(str4, i, str2, hashSet);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10499 m26399() {
        return new C10499("", 0, "", Collections.EMPTY_SET);
    }
}
