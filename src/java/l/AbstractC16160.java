package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 07KX */
/* renamed from: l.ܺ᩶۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC16160 implements InterfaceC20758 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f49781;

    /* renamed from: ֫ */
    public abstract C8400 mo22009(String str);

    public AbstractC16160(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Path cannot be null");
        }
        this.f49781 = m38092(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m38092(String str) {
        if (str.isEmpty()) {
            return "";
        }
        String replaceAll = str.replaceAll("/+", "/");
        return (replaceAll.length() <= 1 || !replaceAll.endsWith("/")) ? replaceAll : C15472.m36561(1, 0, replaceAll);
    }

    @Override // l.InterfaceC20758
    public boolean isAbsolute() {
        return this.f49781.startsWith("/");
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 getRoot() {
        if (isAbsolute()) {
            return mo22009("/");
        }
        return null;
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 getFileName() {
        String str = this.f49781;
        if (str.isEmpty() || str.equals("/")) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf == -1) {
            return mo22009(str);
        }
        String substring = str.substring(lastIndexOf + 1);
        if (substring.isEmpty()) {
            return null;
        }
        return mo22009(substring);
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 getParent() {
        int lastIndexOf;
        String str = this.f49781;
        if (str.isEmpty() || str.equals("/") || (lastIndexOf = str.lastIndexOf(47)) == -1) {
            return null;
        }
        if (lastIndexOf == 0) {
            return mo22009("/");
        }
        return mo22009(str.substring(0, lastIndexOf));
    }

    @Override // l.InterfaceC20758
    public int getNameCount() {
        String str = this.f49781;
        int i = 0;
        if (str.isEmpty() || str.equals("/")) {
            return 0;
        }
        int i2 = !isAbsolute() ? 1 : 0;
        while (true) {
            int indexOf = str.indexOf(47, i);
            if (indexOf == -1) {
                return i2;
            }
            i2++;
            i = indexOf + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC20758
    public InterfaceC20758 getName(int i) {
        int nameCount = getNameCount();
        if (i < 0 || i >= nameCount) {
            throw new IllegalArgumentException(C19370.m44628(i, "Index out of bounds: "));
        }
        int i2 = 0;
        int i3 = isAbsolute();
        while (true) {
            String str = this.f49781;
            if (i2 >= i) {
                int indexOf = str.indexOf(47, i3);
                if (indexOf == -1) {
                    indexOf = str.length();
                }
                return mo22009(str.substring(i3, indexOf));
            }
            int indexOf2 = str.indexOf(47, i3);
            if (indexOf2 == -1) {
                throw new IllegalArgumentException(C19370.m44628(i, "Index out of bounds: "));
            }
            i2++;
            i3 = indexOf2 + 1;
        }
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 subpath(int i, int i2) {
        int nameCount = getNameCount();
        if (i < 0 || i2 > nameCount || i >= i2) {
            throw new IllegalArgumentException("Invalid subpath indices");
        }
        boolean isAbsolute = isAbsolute();
        String str = this.f49781;
        if (isAbsolute) {
            str = str.substring(1);
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = str.indexOf(47, i4) + 1;
        }
        int length = str.length();
        if (i2 < nameCount) {
            int i6 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                int indexOf = str.indexOf(47, i6);
                if (i3 == i2 - 1) {
                    length = indexOf;
                    break;
                }
                i6 = indexOf + 1;
                i3++;
            }
        }
        return mo22009(str.substring(i4, length));
    }

    @Override // l.InterfaceC20758
    public boolean startsWith(InterfaceC20758 interfaceC20758) {
        if (interfaceC20758 == null) {
            return false;
        }
        return startsWith(interfaceC20758.toString());
    }

    @Override // l.InterfaceC20758
    public boolean startsWith(String str) {
        if (str == null) {
            return false;
        }
        String m38092 = m38092(str);
        if (isAbsolute() != m38092.startsWith("/")) {
            return false;
        }
        if (m38092.equals("/") && isAbsolute()) {
            return true;
        }
        String str2 = this.f49781;
        return str2.equals(m38092) || str2.startsWith(m38092.concat("/"));
    }

    @Override // l.InterfaceC20758
    public boolean endsWith(InterfaceC20758 interfaceC20758) {
        if (interfaceC20758 == null) {
            return false;
        }
        return endsWith(interfaceC20758.toString());
    }

    @Override // l.InterfaceC20758
    public boolean endsWith(String str) {
        if (str == null) {
            return false;
        }
        String m38092 = m38092(str);
        boolean startsWith = m38092.startsWith("/");
        String str2 = this.f49781;
        if (startsWith) {
            return str2.equals(m38092);
        }
        return str2.equals(m38092) || str2.endsWith("/".concat(m38092));
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 normalize() {
        String str = this.f49781;
        if (str.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                break;
            }
            int indexOf = str.indexOf(47, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            if (indexOf > i) {
                String substring = str.substring(i, indexOf);
                if (!substring.equals(".")) {
                    if (!substring.equals("..")) {
                        arrayList.add(substring);
                    } else if (!arrayList.isEmpty() && !((String) C18566.m43105(arrayList, 1)).equals("..")) {
                        C18473.m42953(arrayList, 1);
                    } else if (!isAbsolute()) {
                        arrayList.add("..");
                    }
                }
            }
            i = indexOf + 1;
        }
        StringBuilder sb = new StringBuilder();
        if (isAbsolute()) {
            sb.append("/");
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (i2 > 0) {
                sb.append("/");
            }
            sb.append((String) arrayList.get(i2));
        }
        String sb2 = sb.toString();
        return mo22009((!sb2.isEmpty() || isAbsolute()) ? sb2 : ".");
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 resolve(InterfaceC20758 interfaceC20758) {
        if (interfaceC20758 == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        return resolve(interfaceC20758.toString());
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 resolve(String str) {
        if (str == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        String m38092 = m38092(str);
        if (m38092.isEmpty()) {
            return this;
        }
        if (m38092.startsWith("/")) {
            return mo22009(m38092);
        }
        String str2 = this.f49781;
        return str2.isEmpty() ? mo22009(m38092) : str2.equals("/") ? mo22009("/".concat(m38092)) : mo22009(C22870.m50967(str2, "/", m38092));
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 resolveSibling(InterfaceC20758 interfaceC20758) {
        if (interfaceC20758 == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        return resolveSibling(interfaceC20758.toString());
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 resolveSibling(String str) {
        if (str == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        InterfaceC20758 parent = getParent();
        if (parent == null) {
            return mo22009(m38092(str));
        }
        return ((C8400) parent).resolve(str);
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 relativize(InterfaceC20758 interfaceC20758) {
        int i;
        if (interfaceC20758 == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        if (isAbsolute() != interfaceC20758.toString().startsWith("/")) {
            throw new IllegalArgumentException("Cannot relativize absolute and relative paths");
        }
        InterfaceC20758 normalize = normalize();
        InterfaceC20758 normalize2 = interfaceC20758.normalize();
        String str = ((C8400) normalize).f49781;
        String interfaceC207582 = normalize2.toString();
        if (str.equals(interfaceC207582)) {
            return mo22009("");
        }
        int min = Math.min(str.length(), interfaceC207582.length());
        int i2 = 0;
        for (int i3 = 0; i3 < min && str.charAt(i3) == interfaceC207582.charAt(i3); i3++) {
            i2++;
        }
        while (i2 > 0 && i2 < str.length() && i2 < interfaceC207582.length() && str.charAt(i2) != '/' && interfaceC207582.charAt(i2) != '/') {
            i2--;
        }
        String substring = str.substring(i2);
        if (substring.startsWith("/")) {
            substring = substring.substring(1);
        }
        if (substring.isEmpty()) {
            i = 0;
        } else {
            i = 1;
            for (int i4 = 0; i4 < substring.length(); i4++) {
                if (substring.charAt(i4) == '/') {
                    i++;
                }
            }
        }
        String substring2 = interfaceC207582.substring(i2);
        if (substring2.startsWith("/")) {
            substring2 = substring2.substring(1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < i; i5++) {
            if (i5 > 0) {
                sb.append("/");
            }
            sb.append("..");
        }
        if (!substring2.isEmpty()) {
            if (sb.length() > 0) {
                sb.append("/");
            }
            sb.append(substring2);
        }
        return mo22009(sb.length() != 0 ? sb.toString() : "");
    }

    @Override // l.InterfaceC20758
    public InterfaceC20758 toAbsolutePath() {
        if (isAbsolute()) {
            return this;
        }
        return mo22009("/" + this.f49781);
    }

    @Override // l.InterfaceC20758, java.lang.Iterable
    public Iterator iterator() {
        return new C9106(this, getNameCount());
    }

    @Override // l.InterfaceC20758
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8400) {
            C8400 c8400 = (C8400) obj;
            if (C11003.equals(((C8400) this).getFileSystem(), c8400.getFileSystem()) && C11003.equals(this.f49781, c8400.f49781)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC20758
    public int hashCode() {
        return C11003.hash(((C8400) this).getFileSystem(), this.f49781);
    }

    @Override // java.lang.Comparable
    public int compareTo(InterfaceC20758 interfaceC20758) {
        return this.f49781.compareTo(interfaceC20758.toString());
    }
}
