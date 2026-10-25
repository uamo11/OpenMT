package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: P676 */
/* renamed from: l.᩻᩶ܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23928 implements Comparable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f77599;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23928 f77600;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f77601;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f77602;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f77603 = new ArrayList();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f77604 = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f77602.compareTo(((C23928) obj).f77602);
    }

    public C23928(ActivityC21107 activityC21107, String str, String str2, C23928 c23928) {
        this.f77601 = activityC21107;
        this.f77602 = str;
        this.f77599 = str2;
        this.f77600 = c23928;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23928 m52692(String str) {
        C18284 c18284;
        ActivityC21107 activityC21107 = this.f77601;
        c18284 = activityC21107.f68093;
        boolean z = c18284.f56837;
        String str2 = this.f77599;
        ArrayList arrayList = this.f77603;
        if (z) {
            if (str.startsWith("android/support/")) {
                return m52692("android/support").m52692(str.substring(16));
            }
            String replace = str.replace("/", ".");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C23928 c23928 = (C23928) it.next();
                if (c23928.f77602.equals(replace)) {
                    return c23928;
                }
            }
            C23928 c239282 = new C23928(activityC21107, replace, str2 + str + '/', this);
            arrayList.add(c239282);
            return c239282;
        }
        if (str.indexOf(47) == -1) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C23928 c239283 = (C23928) it2.next();
                if (c239283.f77602.equals(str)) {
                    return c239283;
                }
            }
            C23928 c239284 = new C23928(activityC21107, str, str2 + str + '/', this);
            arrayList.add(c239284);
            return c239284;
        }
        C23928 c239285 = this;
        for (String str3 : str.split("/")) {
            c239285 = c239285.m52692(str3);
        }
        return c239285;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52693() {
        ArrayList arrayList = this.f77603;
        Collections.sort(arrayList);
        Collections.sort(this.f77604);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C23928) it.next()).m52693();
        }
    }
}
