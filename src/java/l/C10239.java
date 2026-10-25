package l;

import java.util.HashSet;

/* compiled from: C7AH */
/* renamed from: l.ۤۤ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10239 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashSet f30862;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10239 m25929(String... strArr) {
        HashSet hashSet = new HashSet();
        hashSet.add("2025-11-25");
        for (String str : strArr) {
            C11003.requireNonNull(str, "supportedProtocolVersion");
            hashSet.add(str);
        }
        return new C10239(hashSet);
    }

    public C10239(HashSet hashSet) {
        this.f30862 = hashSet;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m25930(String str) {
        return this.f30862.contains(str) ? str : "2025-11-25";
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m25931(String str) {
        return this.f30862.contains(str);
    }
}
