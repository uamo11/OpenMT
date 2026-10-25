package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: K7QT */
/* renamed from: l.ܳܳ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14581 implements Iterator {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23754 f44641;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Iterator f44642;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f44644 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Set f44643 = null;

    public C14581(C23754 c23754) {
        this.f44641 = c23754;
        this.f44642 = c23754.f25348.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C23754 c23754;
        Set singleton;
        C22364 c22364;
        Set set;
        DirectoryStream newDirectoryStream;
        Throwable th;
        InterfaceC20758 interfaceC20758;
        C22364 c223642;
        C22364 c223643;
        C23754 c237542 = this.f44641;
        InterfaceC2050 interfaceC2050 = c237542.f41661;
        C22343 c22343 = c237542.f76900;
        int i = 1;
        if (this.f44643 != null) {
            return true;
        }
        while (this.f44643 == null) {
            Iterator it = this.f44642;
            int i2 = 0;
            if (!it.hasNext()) {
                return false;
            }
            InterfaceC20758 interfaceC207582 = (InterfaceC20758) it.next();
            String str = "[";
            String str2 = ":";
            String str3 = "]";
            if (C17229.isDirectory(interfaceC207582, new EnumC14406[0])) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    newDirectoryStream = C17229.newDirectoryStream(interfaceC207582);
                } catch (IOException | DirectoryIteratorException unused) {
                    c23754 = c237542;
                }
                try {
                    Iterator it2 = newDirectoryStream.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            interfaceC20758 = null;
                            break;
                        }
                        try {
                            interfaceC20758 = (InterfaceC20758) it2.next();
                            if (interfaceC20758.endsWith("module-info.class")) {
                                break;
                            }
                            linkedHashSet.add(interfaceC20758);
                        } catch (Throwable th2) {
                            th = th2;
                            c23754 = c237542;
                            if (newDirectoryStream != null) {
                                try {
                                    try {
                                        newDirectoryStream.close();
                                    } catch (Throwable th3) {
                                        th.addSuppressed(th3);
                                    }
                                } catch (IOException | DirectoryIteratorException unused2) {
                                    c22364 = c22343.f72411;
                                    C12281 c12281 = C6241.f19132;
                                    c22364.m7276(new C12281("compiler", "locn.cant.read.directory", interfaceC207582));
                                    set = Collections.EMPTY_SET;
                                    this.f44643 = set;
                                    this.f44644++;
                                    c237542 = c23754;
                                    i = 1;
                                }
                            }
                            throw th;
                        }
                    }
                    newDirectoryStream.close();
                    if (interfaceC20758 != null) {
                        try {
                            String m34829 = m34829(interfaceC20758);
                            set = Collections.singleton(new C16698(c22343, c237542, interfaceC2050.getName() + "[" + this.f44644 + ":" + m34829 + "]", m34829, Collections.singletonList(interfaceC207582), false));
                        } catch (IOException unused3) {
                            c223643 = c22343.f72411;
                            c223643.m7276(C6241.m17191(interfaceC207582));
                            set = Collections.EMPTY_SET;
                        } catch (C15850 unused4) {
                            c223642 = c22343.f72411;
                            C12281 c122812 = C6241.f19132;
                            Object[] objArr = new Object[i];
                            objArr[0] = interfaceC207582;
                            c223642.m7276(new C12281("compiler", "locn.bad.module-info", objArr));
                            set = Collections.EMPTY_SET;
                        }
                        c23754 = c237542;
                    } else {
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        Iterator it3 = linkedHashSet.iterator();
                        while (it3.hasNext()) {
                            C23069 m34828 = m34828((InterfaceC20758) it3.next());
                            if (m34828 != null) {
                                String str4 = (String) m34828.f74207;
                                linkedHashSet2.add(new C16698(c22343, c237542, interfaceC2050.getName() + str + this.f44644 + "." + i2 + str2 + str4 + str3, str4, Collections.singletonList((InterfaceC20758) m34828.f74208), false));
                                str2 = str2;
                                str = str;
                                str3 = str3;
                                i2++;
                                c237542 = c237542;
                                it3 = it3;
                            }
                        }
                        c23754 = c237542;
                        set = linkedHashSet2;
                    }
                    this.f44643 = set;
                } catch (Throwable th4) {
                    c23754 = c237542;
                    th = th4;
                }
            } else {
                c23754 = c237542;
                C23069 m348282 = m34828(interfaceC207582);
                if (m348282 == null) {
                    singleton = Collections.EMPTY_SET;
                } else {
                    String str5 = (String) m348282.f74207;
                    singleton = Collections.singleton(new C16698(c22343, c23754, interfaceC2050.getName() + "[" + this.f44644 + ":" + str5 + "]", str5, Collections.singletonList((InterfaceC20758) m348282.f74208), false));
                }
                this.f44643 = singleton;
            }
            this.f44644++;
            c237542 = c23754;
            i = 1;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        hasNext();
        Set set = this.f44643;
        if (set != null) {
            this.f44643 = null;
            return set;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C23069 m34828(InterfaceC20758 interfaceC20758) {
        C22364 c22364;
        C22364 c223642;
        C2672 c2672;
        C22364 c223643;
        C2672 c26722;
        C2672 c26723;
        C22364 c223644;
        C22364 c223645;
        Map map;
        C22364 c223646;
        String value;
        boolean m10693;
        C22364 c223647;
        C22364 c223648;
        boolean unused;
        C22343 c22343 = this.f44641.f76900;
        if (C17229.isDirectory(interfaceC20758, new EnumC14406[0])) {
            if (C17229.exists(interfaceC20758.resolve("module-info.class"), new EnumC14406[0]) || C17229.exists(interfaceC20758.resolve("module-info.sig"), new EnumC14406[0])) {
                String interfaceC207582 = interfaceC20758.getFileName().toString();
                if (EnumC3503.m10693(interfaceC207582)) {
                    return new C23069(interfaceC207582, interfaceC20758);
                }
            }
            return null;
        }
        if (interfaceC20758.getFileName().toString().endsWith(".jar")) {
            c26722 = c22343.f72409;
            if (c26722.mo8366(interfaceC20758)) {
                c26723 = c22343.f72409;
                C1344 m8365 = c26723.m8365();
                if (m8365 == null) {
                    c223648 = c22343.f72411;
                    C12281 c12281 = C6241.f19132;
                    c223648.m7276(new C12281("compiler", "no.zipfs.for.archive", interfaceC20758));
                    return null;
                }
                try {
                    map = c22343.f72407;
                    AbstractC7145 newFileSystem = m8365.newFileSystem(interfaceC20758, map);
                    try {
                        InterfaceC20758 path = newFileSystem.getPath("module-info.class", new String[0]);
                        if (C17229.exists(path, new EnumC14406[0])) {
                            C23069 c23069 = new C23069(m34829(path), interfaceC20758);
                            newFileSystem.close();
                            return c23069;
                        }
                        InterfaceC20758 path2 = newFileSystem.getPath("META-INF/MANIFEST.MF", new String[0]);
                        if (C17229.exists(path2, new EnumC14406[0])) {
                            InputStream newInputStream = C17229.newInputStream(path2, new InterfaceC23579[0]);
                            try {
                                Attributes mainAttributes = new Manifest(newInputStream).getMainAttributes();
                                if (mainAttributes != null && (value = mainAttributes.getValue(new Attributes.Name("Automatic-Module-Name"))) != null) {
                                    int i = 0;
                                    while (true) {
                                        int indexOf = value.indexOf(46, i);
                                        if (indexOf == -1) {
                                            m10693 = EnumC3503.m10693(value.substring(i));
                                            break;
                                        }
                                        if (!EnumC3503.m10693(value.substring(i, indexOf))) {
                                            m10693 = false;
                                            break;
                                        }
                                        i = indexOf + 1;
                                    }
                                    if (m10693) {
                                        C23069 c230692 = new C23069(value, interfaceC20758);
                                        if (newInputStream != null) {
                                            newInputStream.close();
                                        }
                                        newFileSystem.close();
                                        return c230692;
                                    }
                                    c223647 = c22343.f72411;
                                    C12281 c122812 = C6241.f19132;
                                    c223647.m7276(new C12281("compiler", "locn.cant.get.module.name.for.jar", interfaceC20758));
                                    if (newInputStream != null) {
                                        newInputStream.close();
                                    }
                                    newFileSystem.close();
                                    return null;
                                }
                                if (newInputStream != null) {
                                    newInputStream.close();
                                }
                            } finally {
                            }
                        }
                        newFileSystem.close();
                        String m36561 = C15472.m36561(4, 0, interfaceC20758.getFileName().toString());
                        Matcher matcher = Pattern.compile("-(\\d+(\\.|$))").matcher(m36561);
                        if (matcher.find()) {
                            m36561 = m36561.substring(0, matcher.start());
                        }
                        String replaceAll = m36561.replaceAll("[^A-Za-z0-9]", ".").replaceAll("(\\.)(\\1)+", ".").replaceAll("^\\.", "").replaceAll("\\.$", "");
                        if (!replaceAll.isEmpty()) {
                            return new C23069(replaceAll, interfaceC20758);
                        }
                        c223646 = c22343.f72411;
                        C12281 c122813 = C6241.f19132;
                        c223646.m7276(new C12281("compiler", "locn.cant.get.module.name.for.jar", interfaceC20758));
                        return null;
                    } catch (Throwable th) {
                        try {
                            newFileSystem.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                    c223645 = c22343.f72411;
                    c223645.m7276(C6241.m17191(interfaceC20758));
                    return null;
                } catch (C15850 unused3) {
                    c223644 = c22343.f72411;
                    C12281 c122814 = C6241.f19132;
                    c223644.m7276(new C12281("compiler", "locn.bad.module-info", interfaceC20758));
                    return null;
                }
            }
        }
        if (interfaceC20758.getFileName().toString().endsWith(".jmod")) {
            try {
                C9812.m24845(interfaceC20758);
                if (((AbstractC7145) c22343.f72405.get(interfaceC20758)) == null) {
                    c2672 = c22343.f72409;
                    C1344 m83652 = c2672.m8365();
                    if (m83652 == null) {
                        c223643 = c22343.f72411;
                        c223643.m7276(C6241.m17191(interfaceC20758));
                        return null;
                    }
                    AbstractC7145 newFileSystem2 = m83652.newFileSystem(interfaceC20758, Collections.EMPTY_MAP);
                    try {
                        String m34829 = m34829(newFileSystem2.getPath("classes/module-info.class", new String[0]));
                        InterfaceC20758 path3 = newFileSystem2.getPath("classes", new String[0]);
                        c22343.f72405.put(interfaceC20758, newFileSystem2);
                        c22343.f72403.add(newFileSystem2);
                        try {
                            return new C23069(m34829, path3);
                        } catch (Throwable th3) {
                            th = th3;
                            newFileSystem2 = null;
                            if (newFileSystem2 != null) {
                                newFileSystem2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            } catch (IOException unused4) {
                c223642 = c22343.f72411;
                c223642.m7276(C6241.m17191(interfaceC20758));
                return null;
            } catch (C15850 unused5) {
                c22364 = c22343.f72411;
                C12281 c122815 = C6241.f19132;
                c22364.m7276(new C12281("compiler", "locn.bad.module-info", interfaceC20758));
            }
        }
        unused = c22343.f72410;
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private String m34829(InterfaceC20758 interfaceC20758) {
        C2446 c2446;
        C2446 c24462;
        C22343 c22343 = this.f44641.f76900;
        c2446 = c22343.f72404;
        if (c2446 == null) {
            c22343.f72404 = new C2446();
        }
        c24462 = c22343.f72404;
        c24462.getClass();
        InputStream newInputStream = C17229.newInputStream(interfaceC20758, new InterfaceC23579[0]);
        try {
            String m7892 = c24462.m7892(newInputStream);
            if (newInputStream != null) {
                newInputStream.close();
            }
            return m7892;
        } catch (Throwable th) {
            if (newInputStream != null) {
                try {
                    newInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
