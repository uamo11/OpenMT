package l;

import java.io.File;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: K7QT */
/* renamed from: l.᩹ܳ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22343 {

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20758 f72401;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20758 f72402;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C2446 f72404;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2672 f72409;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f72410;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22364 f72411;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f72405 = new LinkedHashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f72403 = new ArrayList();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Map f72407 = Collections.EMPTY_MAP;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f72408 = new HashMap();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumMap f72406 = new EnumMap(EnumC0121.class);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m50079(l.C22343 r4, java.util.Collection r5, l.InterfaceC20758 r6) {
        /*
            r4.getClass()
            r0 = 0
            if (r5 != 0) goto L8
            goto L85
        L8:
            l.۟֨ᩴ r1 = r6.getFileSystem()
            l.۬᩸ᩴ r1 = r1.provider()
            l.ۖܿ۠ r4 = r4.f72409
            l.֨᩶۠ r4 = r4.m8365()
            if (r1 != r4) goto L49
            java.net.URI r4 = r6.toUri()
            java.lang.String r1 = r4.getScheme()
            java.lang.String r2 = "jar"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L49
            java.lang.String r4 = r4.getSchemeSpecificPart()
            java.lang.String r1 = "!"
            int r1 = r4.lastIndexOf(r1)
            java.lang.String r2 = "file:"
            boolean r2 = r4.startsWith(r2)
            if (r2 == 0) goto L49
            if (r1 <= 0) goto L49
            java.lang.String r4 = r4.substring(r0, r1)
            java.net.URI r4 = java.net.URI.create(r4)
            l.᩷۠ᩴ r4 = l.C8763.get(r4)
            goto L4a
        L49:
            r4 = 0
        L4a:
            l.᩷۠ᩴ r6 = m50077(r6)
            java.util.Iterator r5 = r5.iterator()
        L52:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L85
            java.lang.Object r1 = r5.next()
            l.᩷۠ᩴ r1 = (l.InterfaceC20758) r1
            l.᩷۠ᩴ r1 = m50077(r1)
            l.۟֨ᩴ r2 = r1.getFileSystem()
            l.۟֨ᩴ r3 = r6.getFileSystem()
            if (r2 != r3) goto L7b
            l.ܳ۠ᩴ[] r2 = new l.EnumC14406[r0]
            boolean r2 = l.C17229.isDirectory(r1, r2)
            if (r2 == 0) goto L7b
            boolean r2 = r6.startsWith(r1)
            if (r2 == 0) goto L7b
            goto L83
        L7b:
            if (r4 == 0) goto L52
            boolean r1 = l.C17229.isSameFile(r4, r1)
            if (r1 == 0) goto L52
        L83:
            r4 = 1
            return r4
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22343.m50079(l.᩹ܳ۠, java.util.Collection, l.᩷۠ᩴ):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50080(C22343 c22343, InterfaceC20758 interfaceC20758) {
        c22343.getClass();
        String lowerCase = interfaceC20758.getFileName().toString().toLowerCase(Locale.US);
        if (c22343.f72409.mo8369(interfaceC20758)) {
            return lowerCase.endsWith(".jar") || lowerCase.endsWith(".zip");
        }
        return false;
    }

    static {
        InterfaceC20758 path = C1707.getDefault().getPath(System.getProperty("java.home"), new String[0]);
        f72402 = path;
        f72401 = path.resolve("lib").resolve("modules");
    }

    public C22343() {
        AbstractC13959[] abstractC13959Arr = {new C7610(this), new C1882(this), new C8232(this, EnumC21101.SOURCE_PATH, EnumC0121.f1179), new C8232(this, EnumC21101.ANNOTATION_PROCESSOR_PATH, EnumC0121.f1181), new C8232(this, EnumC21101.ANNOTATION_PROCESSOR_MODULE_PATH, EnumC0121.f1155), new C18816(this, EnumC21101.CLASS_OUTPUT, EnumC0121.f1209), new C18816(this, EnumC21101.SOURCE_OUTPUT, EnumC0121.f1196), new C18816(this, EnumC21101.NATIVE_HEADER_OUTPUT, EnumC0121.f1197), new C8938(this), new C19522(this), new C23754(this, EnumC21101.UPGRADE_MODULE_PATH, EnumC0121.f1198), new C23754(this, EnumC21101.MODULE_PATH, EnumC0121.f1207), new C21638(this)};
        for (int i = 0; i < 13; i++) {
            AbstractC13959 abstractC13959 = abstractC13959Arr[i];
            this.f72408.put(abstractC13959.f41661, abstractC13959);
            Iterator it = abstractC13959.f41662.iterator();
            while (it.hasNext()) {
                this.f72406.put((EnumMap) it.next(), (EnumC0121) abstractC13959);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 m50086(String str, String... strArr) {
        try {
            return C8763.get(str, strArr);
        } catch (InvalidPathException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50087() {
        C18837 c18837 = new C18837();
        C19846.forEach(this.f72403, new C1038(1, c18837));
        if (c18837.m43518()) {
            IOException iOException = new IOException();
            Iterator it = c18837.iterator();
            while (it.hasNext()) {
                iOException.addSuppressed((IOException) it.next());
            }
            throw iOException;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50089(C22364 c22364, boolean z, C2672 c2672) {
        this.f72411 = c22364;
        this.f72410 = z;
        this.f72409 = c2672;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18837 m50075(C22343 c22343, String str) {
        return c22343.m50074(str, (InterfaceC20758) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18837 m50074(String str, InterfaceC20758 interfaceC20758) {
        C18837 c18837 = new C18837();
        for (String str2 : str.split(Pattern.quote(File.pathSeparator), -1)) {
            if (!str2.isEmpty()) {
                try {
                    c18837.m43511(m50086(str2, new String[0]));
                } catch (IllegalArgumentException unused) {
                    if (this.f72410) {
                        C22364 c22364 = this.f72411;
                        EnumC20347 enumC20347 = EnumC20347.PATH;
                        C11076 c11076 = C14001.f42334;
                        c22364.m7282(enumC20347, new C11076("compiler", "invalid.path", str2));
                    }
                }
            } else if (interfaceC20758 != null) {
                c18837.m43511(interfaceC20758);
            }
        }
        return c18837;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50088(String str) {
        this.f72407 = Collections.singletonMap("releaseVersion", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC11055 m50085(InterfaceC2050 interfaceC2050) {
        C11003.requireNonNull(interfaceC2050);
        return interfaceC2050 instanceof AbstractC11055 ? (AbstractC11055) interfaceC2050 : (AbstractC11055) this.f72408.get(interfaceC2050);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC20758 m50077(InterfaceC20758 interfaceC20758) {
        try {
            return interfaceC20758.toRealPath(new EnumC14406[0]);
        } catch (IOException unused) {
            return interfaceC20758.toAbsolutePath().normalize();
        }
    }
}
