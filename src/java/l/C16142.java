package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: V8K2 */
/* renamed from: l.ܺ᩵ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16142 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f49724;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f49725;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f49726;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String[] f49727;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C5560 f49728;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f49729;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f49730;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f49731;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f49732;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f49733;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f49734;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f49735;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C16142 f49736;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16142 m38055(String str) {
        return new C16142(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16142 m38056(String str, long j, long j2, C5560 c5560, String[] strArr, String str2, String str3, C16142 c16142) {
        return new C16142(str, null, j, j2, c5560, strArr, str2, str3, c16142);
    }

    public C16142(String str, String str2, long j, long j2, C5560 c5560, String[] strArr, String str3, String str4, C16142 c16142) {
        this.f49731 = str;
        this.f49725 = str2;
        this.f49732 = str4;
        this.f49728 = c5560;
        this.f49727 = strArr;
        this.f49734 = str2 != null;
        this.f49735 = j;
        this.f49729 = j2;
        str3.getClass();
        this.f49726 = str3;
        this.f49736 = c16142;
        this.f49730 = new HashMap();
        this.f49733 = new HashMap();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38065(long j) {
        long j2 = this.f49729;
        long j3 = this.f49735;
        if (j3 == -9223372036854775807L && j2 == -9223372036854775807L) {
            return true;
        }
        if (j3 <= j && j2 == -9223372036854775807L) {
            return true;
        }
        if (j3 != -9223372036854775807L || j >= j2) {
            return j3 <= j && j < j2;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38064(C16142 c16142) {
        if (this.f49724 == null) {
            this.f49724 = new ArrayList();
        }
        this.f49724.add(c16142);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16142 m38063(int i) {
        ArrayList arrayList = this.f49724;
        if (arrayList == null) {
            throw new IndexOutOfBoundsException();
        }
        return (C16142) arrayList.get(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38061() {
        ArrayList arrayList = this.f49724;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long[] m38066() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        m38060(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38060(TreeSet treeSet, boolean z) {
        String str = this.f49731;
        boolean equals = am.ax.equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.f49732 != null)) {
            long j = this.f49735;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f49729;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f49724 == null) {
            return;
        }
        for (int i = 0; i < this.f49724.size(); i++) {
            ((C16142) this.f49724.get(i)).m38060(treeSet, z || equals);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m38062(long j, Map map, HashMap hashMap, HashMap hashMap2) {
        ArrayList arrayList = new ArrayList();
        m38057(j, this.f49726, arrayList);
        TreeMap treeMap = new TreeMap();
        m38059(j, false, this.f49726, treeMap);
        m38058(j, map, hashMap, this.f49726, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C19672 c19672 = (C19672) hashMap.get(pair.first);
                c19672.getClass();
                C21927 c21927 = new C21927();
                c21927.m49387(decodeByteArray);
                c21927.m49391(c19672.f63532);
                c21927.m49393(0);
                c21927.m49385(c19672.f63533, 0);
                c21927.m49386(c19672.f63535);
                c21927.m49401(c19672.f63530);
                c21927.m49384(c19672.f63528);
                c21927.m49397(c19672.f63536);
                arrayList2.add(c21927.m49383());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C19672 c196722 = (C19672) hashMap.get(entry.getKey());
            c196722.getClass();
            C21927 c219272 = (C21927) entry.getValue();
            CharSequence m49398 = c219272.m49398();
            m49398.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) m49398;
            for (C9794 c9794 : (C9794[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C9794.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c9794), spannableStringBuilder.getSpanEnd(c9794), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c219272.m49385(c196722.f63533, c196722.f63534);
            c219272.m49386(c196722.f63535);
            c219272.m49391(c196722.f63532);
            c219272.m49401(c196722.f63530);
            c219272.m49392(c196722.f63537, c196722.f63529);
            c219272.m49397(c196722.f63536);
            arrayList2.add(c219272.m49383());
        }
        return arrayList2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38057(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f49726;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (m38065(j) && "div".equals(this.f49731) && (str2 = this.f49732) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < m38061(); i++) {
            m38063(i).m38057(j, str, arrayList);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38059(long j, boolean z, String str, TreeMap treeMap) {
        HashMap hashMap = this.f49730;
        hashMap.clear();
        HashMap hashMap2 = this.f49733;
        hashMap2.clear();
        String str2 = this.f49731;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f49726;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f49734 && z) {
            SpannableStringBuilder m38054 = m38054(str4, treeMap);
            String str5 = this.f49725;
            str5.getClass();
            m38054.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            m38054(str4, treeMap).append('\n');
            return;
        }
        if (m38065(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence m49398 = ((C21927) entry.getValue()).m49398();
                m49398.getClass();
                hashMap.put(str6, Integer.valueOf(m49398.length()));
            }
            boolean equals = am.ax.equals(str2);
            for (int i = 0; i < m38061(); i++) {
                m38063(i).m38059(j, z || equals, str4, treeMap);
            }
            if (equals) {
                SpannableStringBuilder m380542 = m38054(str4, treeMap);
                int length = m380542.length() - 1;
                while (length >= 0 && m380542.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && m380542.charAt(length) != '\n') {
                    m380542.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence m493982 = ((C21927) entry2.getValue()).m49398();
                m493982.getClass();
                hashMap2.put(str7, Integer.valueOf(m493982.length()));
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m38054(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C21927 c21927 = new C21927();
            c21927.m49389(new SpannableStringBuilder());
            treeMap.put(str, c21927);
        }
        CharSequence m49398 = ((C21927) treeMap.get(str)).m49398();
        m49398.getClass();
        return (SpannableStringBuilder) m49398;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02bd A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m38058(long r18, java.util.Map r20, java.util.HashMap r21, java.lang.String r22, java.util.TreeMap r23) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16142.m38058(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }
}
