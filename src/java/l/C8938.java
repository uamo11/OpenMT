package l;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: K7QT */
/* renamed from: l.ۡܳ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C8938 extends AbstractC13959 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public List f27169;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3999 f27170;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3152 f27171;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22343 f27172;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8938(C22343 c22343) {
        super(EnumC21101.MODULE_SOURCE_PATH, EnumC0121.f1173);
        this.f27172 = c22343;
        this.f27171 = new C3152(3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
    
        throw new java.lang.IllegalArgumentException("illegal use of * in ".concat(r5));
     */
    @Override // l.AbstractC11055
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo20401(l.EnumC0121 r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8938.mo20401(l.֡ۖ۠, java.lang.String):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23047(C8938 c8938, String str, List list) {
        if (C5378.stream(list).anyMatch(c8938.f27171)) {
            c8938.f27170.m12048(new C16698(c8938.f27172, c8938, c8938.f41661.getName() + "[" + str + "]", str, list, false));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23050(LinkedHashMap linkedHashMap, InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC207582) {
        boolean z;
        C11076 c11076;
        C22364 c22364;
        if (!C17229.isDirectory(interfaceC20758, new EnumC14406[0])) {
            C22343 c22343 = this.f27172;
            z = c22343.f72410;
            if (z) {
                if (C17229.exists(interfaceC20758, new EnumC14406[0])) {
                    C11076 c110762 = C14001.f42334;
                    c11076 = new C11076("compiler", "dir.path.element.not.directory", interfaceC20758);
                } else {
                    C11076 c110763 = C14001.f42334;
                    c11076 = new C11076("compiler", "dir.path.element.not.found", interfaceC20758);
                }
                c22364 = c22343.f72411;
                c22364.m7282(EnumC20347.PATH, c11076);
                return;
            }
            return;
        }
        try {
            DirectoryStream<InterfaceC20758> newDirectoryStream = C17229.newDirectoryStream(interfaceC20758, new C20933());
            try {
                for (InterfaceC20758 interfaceC207583 : newDirectoryStream) {
                    InterfaceC20758 resolve = interfaceC207582 == null ? interfaceC207583 : interfaceC207583.resolve(interfaceC207582);
                    if (C17229.isDirectory(resolve, new EnumC14406[0])) {
                        String interfaceC207584 = interfaceC207583.getFileName().toString();
                        List list = (List) linkedHashMap.get(interfaceC207584);
                        if (list == null) {
                            list = new ArrayList();
                            linkedHashMap.put(interfaceC207584, list);
                        }
                        list.add(resolve);
                    }
                }
                newDirectoryStream.close();
            } finally {
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23046(String str, ArrayList arrayList) {
        int i = -1;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            int i4 = 1;
            if (charAt != ',') {
                if (charAt == '{') {
                    i2++;
                    if (i2 == 1) {
                        String substring = str.substring(0, i3);
                        int i5 = i3 + 1;
                        for (int i6 = i5; i6 < str.length(); i6++) {
                            char charAt2 = str.charAt(i6);
                            if (charAt2 == '{') {
                                i4++;
                            } else if (charAt2 == '}' && i4 - 1 == 0) {
                                str3 = str.substring(i6 + 1);
                                str2 = substring;
                                i = i5;
                            }
                        }
                        throw new IllegalArgumentException("mismatched braces");
                    }
                    continue;
                } else if (charAt != '}') {
                    continue;
                } else {
                    if (i2 == 0) {
                        throw new IllegalArgumentException("mismatched braces");
                    }
                    if (i2 == 1) {
                        m23046(C22870.m50967(str2, str.substring(i, i3), str3), arrayList);
                        return;
                    }
                    i2--;
                }
            } else if (i2 == 1) {
                m23046(C22870.m50967(str2, str.substring(i, i3), str3), arrayList);
                i = i3 + 1;
            }
        }
        if (i2 > 0) {
            throw new IllegalArgumentException("mismatched braces");
        }
        arrayList.add(str);
    }

    @Override // l.AbstractC11055
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean mo23053() {
        return this.f27170 != null;
    }

    @Override // l.AbstractC11055
    /* renamed from: ܽ */
    public final Collection mo6225() {
        List list = this.f27169;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("paths not available");
    }

    @Override // l.AbstractC11055
    /* renamed from: ֫ */
    public final void mo20400(Iterable iterable) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C5494) iterable).iterator();
        while (true) {
            C8316 c8316 = (C8316) it;
            if (!c8316.f25522.hasNext()) {
                this.f27170 = new C3999(this.f27172);
                C13843.forEach(linkedHashMap, new C9644(this));
                this.f41660 = true;
                this.f27169 = C20195.unmodifiableList(arrayList);
                return;
            }
            InterfaceC20758 interfaceC20758 = (InterfaceC20758) c8316.next();
            m23050(linkedHashMap, interfaceC20758, (InterfaceC20758) null);
            arrayList.add(interfaceC20758);
        }
    }

    @Override // l.AbstractC13959, l.AbstractC11055
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo23049(Iterable iterable, String str) {
        C11003.requireNonNull(iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC20758 interfaceC20758 = (InterfaceC20758) it.next();
            AbstractC13959.m33406(interfaceC20758);
            arrayList.add(interfaceC20758);
        }
        C3999 c3999 = this.f27170;
        C22343 c22343 = this.f27172;
        if (c3999 == null) {
            this.f27170 = new C3999(c22343);
        }
        C16698 m12046 = this.f27170.m12046(str);
        if (m12046 == null) {
            this.f27170.m12048(new C16698(c22343, this, this.f41661.getName() + "[" + str + "]", str, arrayList, true));
        } else {
            m12046.f51263 = arrayList;
            this.f27170.m12052(m12046);
        }
        this.f41660 = true;
    }

    @Override // l.AbstractC11055
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2050 mo23048(String str) {
        C3999 c3999 = this.f27170;
        if (c3999 == null) {
            return null;
        }
        return c3999.m12046(str);
    }

    @Override // l.AbstractC11055
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2050 mo23051(InterfaceC20758 interfaceC20758) {
        C3999 c3999 = this.f27170;
        if (c3999 == null) {
            return null;
        }
        return c3999.m12051(interfaceC20758);
    }

    @Override // l.AbstractC11055
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Iterable mo23052() {
        C3999 c3999 = this.f27170;
        if (c3999 == null) {
            return Collections.EMPTY_SET;
        }
        return Collections.singleton(c3999.m12054());
    }

    @Override // l.AbstractC11055
    /* renamed from: ֫ */
    public final boolean mo20402(InterfaceC20758 interfaceC20758) {
        C3999 c3999 = this.f27170;
        if (c3999 == null) {
            return false;
        }
        return c3999.m12049(interfaceC20758);
    }
}
