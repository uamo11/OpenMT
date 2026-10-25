package l;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* compiled from: RAB8 */
/* renamed from: l.ۢܽ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC9701 implements InterfaceC17482 {

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public static final Map f29318;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static final Map f29319;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public static final int f29320;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public static final String f29321;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static int f29322;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public static final Map f29323;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public static final Map f29324;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1134 f29325;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final boolean f29326;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public int f29327;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f29328;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final boolean f29329;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f29330;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f29331;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final boolean f29332;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f29333;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final boolean f29334;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final boolean f29335;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f29336;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final boolean f29337;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f29338;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f29339;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f29340;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f29341;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final boolean f29342;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final boolean f29343;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final boolean f29344;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final boolean f29345;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final boolean f29346;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final boolean f29347;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public EnumC0970 f29348;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f29349;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final boolean f29350;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f29351;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f29352;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f29353;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final boolean f29354;

    /* renamed from: ܺ */
    public abstract String mo4065();

    @Override // l.InterfaceC17482
    /* renamed from: ܽ */
    public /* synthetic */ boolean mo4066() {
        return true;
    }

    @Override // l.InterfaceC17482
    /* renamed from: ۧ */
    public void mo3021() {
        if (mo24649()) {
            mo18674();
        } else {
            mo18679();
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean mo24649() {
        return this.f29348.m3426() && this.f29347;
    }

    /* renamed from: ۚ */
    public void mo18674() {
        throw new C20990();
    }

    /* renamed from: ᩴ */
    public void mo18679() {
        throw new C20990();
    }

    /* renamed from: ᩳ */
    public void mo4067(int i, int i2) {
        throw new C20990();
    }

    /* renamed from: ۧ */
    public void mo4064(int i, int i2) {
        throw new C20990();
    }

    public AbstractC9701(InterfaceC1134 interfaceC1134) {
        this();
        this.f29325 = interfaceC1134;
    }

    public AbstractC9701() {
        EnumC1960 enumC1960 = EnumC1960.TABLE;
        this.f29347 = C11133.m27616(enumC1960);
        this.f29329 = C11133.m27616(EnumC1960.SYSINFO);
        this.f29330 = C11133.m27616(EnumC1960.DETAILED_Output);
        this.f29336 = C11133.m27616(EnumC1960.EXTRA_DETAILED_Output);
        this.f29352 = C11133.m27616(EnumC1960.BEST_EFFORT);
        this.f29339 = C11133.m27616(EnumC1960.DROP_Source);
        this.f29328 = C11133.m27616(EnumC1960.DROP_Classes);
        this.f29340 = C11133.m27616(EnumC1960.DROP_Signatures);
        C11133.m27616(EnumC1960.DROP_CharacterRange);
        EnumC1960 enumC19602 = EnumC1960.LOCAL_VARIABLE_All;
        this.f29350 = C11133.m27616(enumC19602, EnumC1960.LOCAL_VARIABLE_Vars);
        this.f29332 = C11133.m27616(enumC19602, EnumC1960.LOCAL_VARIABLE_Types);
        EnumC1960 enumC19603 = EnumC1960.LINE_NUMBER_TABLE_Numbers;
        EnumC1960 enumC19604 = EnumC1960.LINE_NUMBER_TABLE_Lines;
        EnumC1960 enumC19605 = EnumC1960.LINE_NUMBER_TABLE_Table;
        this.f29346 = C11133.m27616(enumC19603, enumC19604, enumC19605, enumC1960);
        this.f29326 = C11133.m27616(EnumC1960.CP_INDEX);
        this.f29343 = C11133.m27616(EnumC1960.NO_COMMENTS);
        boolean m27616 = C11133.m27616(EnumC1960.PRINT_BCI);
        this.f29335 = m27616;
        boolean z = C11133.m27616(EnumC1960.LABELS) && !m27616;
        this.f29337 = C11133.m27616(EnumC1960.CONSTANT_POOL);
        this.f29334 = C11133.m27616(enumC19604);
        this.f29345 = C11133.m27616(enumC19605);
        this.f29342 = C11133.m27616(enumC19604);
        this.f29354 = C11133.m27616(enumC19603);
        this.f29344 = C11133.m27616(EnumC1960.HEX);
        this.f29348 = EnumC0970.NOT_SUPPORTED;
        this.f29353 = 0;
        this.f29341 = false;
        this.f29351 = z ? "L" : "";
        this.f29349 = 0;
        this.f29338 = 0;
        this.f29327 = 2;
        this.f29333 = 2;
        this.f29331 = " ";
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m24668() {
        return this.f29351;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m24665(String str) {
        this.f29325.mo1973(m24644(str));
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m24669() {
        return this.f29327;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24659(String str, Object... objArr) {
        this.f29325.mo1973(m24644(new Formatter().format(str, objArr).toString()));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24655(String str, Object... objArr) {
        this.f29325.mo1968(m24644(new Formatter().format(str, objArr).toString()));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24658(String str) {
        this.f29325.mo1968(m24644(str));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m24661(int i, String str) {
        this.f29325.mo1968(m24657(i, str));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24654(String str) {
        this.f29325.mo1968(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24646(String str, Object... objArr) {
        this.f29325.mo1968(new Formatter().format(str, objArr).toString());
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m24662(String str) {
        this.f29325.mo1973(str);
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m24667() {
        this.f29325.mo1973("");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m24666(String str, Object... objArr) {
        this.f29325.mo1973(new Formatter().format(str, objArr).toString());
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m24664(int i) {
        this.f29338 = (this.f29327 * i) + this.f29338;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24653(int i) {
        int i2 = this.f29338 - (this.f29327 * i);
        this.f29338 = i2;
        if (i2 < 0) {
            this.f29338 = 0;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24647(AbstractC11817 abstractC11817) {
        this.f29338 = abstractC11817.f29338;
        this.f29333 = abstractC11817.f29333;
        this.f29327 = abstractC11817.f29327;
        this.f29349 = abstractC11817.f29349;
        this.f29331 = abstractC11817.f29331;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m24648() {
        this.f29338 = 0;
        this.f29327 = 2;
        this.f29333 = 0;
        this.f29331 = " ";
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m24656() {
        return this.f29333 + this.f29338;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m24660(int i) {
        if (i < 0) {
            i = 0;
        }
        List nCopies = Collections.nCopies(i, this.f29331);
        StringBuilder sb = new StringBuilder();
        Iterator it = nCopies.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "");
            }
        }
        return sb.toString();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m24650() {
        return m24660(m24656());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m24643(int i, String str) {
        return m24650() + m24657(i, str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m24652(int i, String str) {
        int length;
        if (i <= 0 || (length = i - str.length()) <= 0) {
            return str;
        }
        return m24660(length) + str;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m24657(int i, String str) {
        int length;
        if (i <= 0 || (length = i - str.length()) <= 0) {
            return str;
        }
        StringBuilder m15339 = C5368.m15339(str);
        m15339.append(m24660(length));
        return m15339.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m24644(String str) {
        return m24650() + str;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m24663(int i, String str) {
        this.f29333 += i;
        String m24644 = m24644(str);
        this.f29333 -= i;
        return m24644;
    }

    /* renamed from: ܿ */
    public int mo6398() {
        return this.f29349;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m24670(int i) {
        this.f29333 = i;
    }

    /* renamed from: ۡ */
    public int mo18675() {
        return ((this.f29335 ? 7 : 7 - this.f29327) + 24) - (m24656() * 2);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m24651() {
        return mo6398() - mo18675();
    }

    static {
        StringBuilder sb = new StringBuilder(2);
        for (int i = 0; i < 2; i++) {
            sb.append(" ");
        }
        f29321 = sb.toString();
        f29322 = 25;
        f29320 = C11133.m27616(EnumC1960.TABLE) ? 16 : 20;
        Object[] objArr = {2, 3};
        ArrayList arrayList = new ArrayList(2);
        int i2 = 0;
        while (i2 < 2) {
            Object obj = objArr[i2];
            i2 = C8954.m23073(obj, arrayList, obj, i2, 1);
        }
        List unmodifiableList = C20195.unmodifiableList(arrayList);
        ArrayList arrayList2 = new ArrayList(1);
        Object obj2 = new Object[]{3}[0];
        C11003.requireNonNull(obj2);
        arrayList2.add(obj2);
        List unmodifiableList2 = C20195.unmodifiableList(arrayList2);
        ArrayList arrayList3 = new ArrayList(1);
        Object obj3 = new Object[]{3}[0];
        C11003.requireNonNull(obj3);
        arrayList3.add(obj3);
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(0, unmodifiableList), new AbstractMap.SimpleEntry(1, unmodifiableList2), new AbstractMap.SimpleEntry(2, C20195.unmodifiableList(arrayList3))};
        HashMap hashMap = new HashMap(3);
        for (int i3 = 0; i3 < 3; i3++) {
            Map.Entry entry = entryArr[i3];
            Object key = entry.getKey();
            C11003.requireNonNull(key);
            Object value = entry.getValue();
            C11003.requireNonNull(value);
            if (hashMap.put(key, value) != null) {
                throw new IllegalArgumentException(C5368.m15337(key, "duplicate key: "));
            }
        }
        f29323 = C20195.unmodifiableMap(hashMap);
        ArrayList arrayList4 = new ArrayList(1);
        Object obj4 = new Object[]{3}[0];
        C11003.requireNonNull(obj4);
        arrayList4.add(obj4);
        List unmodifiableList3 = C20195.unmodifiableList(arrayList4);
        ArrayList arrayList5 = new ArrayList(1);
        Object obj5 = new Object[]{3}[0];
        C11003.requireNonNull(obj5);
        arrayList5.add(obj5);
        List unmodifiableList4 = C20195.unmodifiableList(arrayList5);
        ArrayList arrayList6 = new ArrayList(1);
        Object obj6 = new Object[]{3}[0];
        C11003.requireNonNull(obj6);
        arrayList6.add(obj6);
        Map.Entry[] entryArr2 = {new AbstractMap.SimpleEntry(0, unmodifiableList3), new AbstractMap.SimpleEntry(1, unmodifiableList4), new AbstractMap.SimpleEntry(2, C20195.unmodifiableList(arrayList6))};
        HashMap hashMap2 = new HashMap(3);
        for (int i4 = 0; i4 < 3; i4++) {
            Map.Entry entry2 = entryArr2[i4];
            Object key2 = entry2.getKey();
            C11003.requireNonNull(key2);
            Object value2 = entry2.getValue();
            C11003.requireNonNull(value2);
            if (hashMap2.put(key2, value2) != null) {
                throw new IllegalArgumentException(C5368.m15337(key2, "duplicate key: "));
            }
        }
        f29324 = C20195.unmodifiableMap(hashMap2);
        Object[] objArr2 = {2, 3};
        ArrayList arrayList7 = new ArrayList(2);
        int i5 = 0;
        while (i5 < 2) {
            Object obj7 = objArr2[i5];
            i5 = C8954.m23073(obj7, arrayList7, obj7, i5, 1);
        }
        Map.Entry[] entryArr3 = {new AbstractMap.SimpleEntry(0, C20195.unmodifiableList(arrayList7))};
        HashMap hashMap3 = new HashMap(1);
        Map.Entry entry3 = entryArr3[0];
        Object key3 = entry3.getKey();
        C11003.requireNonNull(key3);
        Object value3 = entry3.getValue();
        C11003.requireNonNull(value3);
        if (hashMap3.put(key3, value3) != null) {
            throw new IllegalArgumentException(C5368.m15337(key3, "duplicate key: "));
        }
        f29318 = C20195.unmodifiableMap(hashMap3);
        ArrayList arrayList8 = new ArrayList(1);
        Object obj8 = new Object[]{3}[0];
        C11003.requireNonNull(obj8);
        arrayList8.add(obj8);
        Map.Entry[] entryArr4 = {new AbstractMap.SimpleEntry(0, C20195.unmodifiableList(arrayList8))};
        HashMap hashMap4 = new HashMap(1);
        Map.Entry entry4 = entryArr4[0];
        Object key4 = entry4.getKey();
        C11003.requireNonNull(key4);
        Object value4 = entry4.getValue();
        C11003.requireNonNull(value4);
        if (hashMap4.put(key4, value4) != null) {
            throw new IllegalArgumentException(C5368.m15337(key4, "duplicate key: "));
        }
        f29319 = C20195.unmodifiableMap(hashMap4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m24645(String str, int i, String str2, Map map) {
        String nextToken;
        List list;
        String str3 = str;
        boolean contains = str3.contains("{}");
        if (contains) {
            str3 = str3.replaceAll("\\{\\}", "<!>");
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":\"{}\\^⾀", true);
        StringBuilder sb = new StringBuilder(80);
        String str4 = "";
        int i2 = 0;
        boolean z = true;
        int i3 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            nextToken = stringTokenizer.nextToken();
            list = (List) C13843.getOrDefault(map, Integer.valueOf(i2), Collections.EMPTY_LIST);
            nextToken.getClass();
            StringTokenizer stringTokenizer2 = stringTokenizer;
            switch (nextToken) {
                case """:
                    if (!str4.equals("\\")) {
                        z = !z;
                    }
                    sb.append(nextToken);
                    continue;
                case ":":
                    sb.append(nextToken);
                    if (z) {
                        i3++;
                        if (!list.contains(Integer.valueOf(i3))) {
                            break;
                        } else {
                            sb.append(System.lineSeparator());
                            sb.append(m24660(i));
                            sb.append(str2);
                            sb.append(m24660(this.f29327 * i2));
                            break;
                        }
                    } else {
                        continue;
                    }
                case "^":
                    if (!z) {
                        sb.append("^");
                        break;
                    } else {
                        sb.append(',');
                        sb.append(System.lineSeparator());
                        sb.append(m24660(i));
                        sb.append(str2);
                        sb.append(m24660(this.f29327 * i2));
                        break;
                    }
                case "{":
                    if (!z) {
                        sb.append(nextToken);
                        break;
                    } else {
                        i2++;
                        sb.append(" {");
                        sb.append(System.lineSeparator());
                        sb.append(m24660(i));
                        sb.append(str2);
                        sb.append(m24660(this.f29327 * i2));
                        break;
                    }
                case "}":
                    if (!z) {
                        sb.append(nextToken);
                        break;
                    } else {
                        if (i2 != 0) {
                            i2--;
                        }
                        sb.append(System.lineSeparator());
                        sb.append(m24660(i));
                        sb.append(str2);
                        sb.append(m24660(this.f29327 * i2));
                        sb.append(nextToken);
                        break;
                    }
                case "⾀":
                    if (!z) {
                        sb.append("^");
                        break;
                    } else {
                        sb.append(System.lineSeparator());
                        sb.append(m24660(i));
                        sb.append(str2);
                        sb.append(m24660(this.f29327 * i2));
                        continue;
                    }
                default:
                    sb.append(nextToken);
                    continue;
            }
            i3 = 0;
            stringTokenizer = stringTokenizer2;
            str4 = nextToken;
        }
        String sb2 = sb.toString();
        return contains ? sb2.replaceAll("<!>", "{}") : sb2;
    }
}
