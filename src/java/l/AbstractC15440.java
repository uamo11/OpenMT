package l;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: A186 */
/* renamed from: l.ܶ᩵ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC15440 implements Serializable, Comparable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String f47291 = File.separator;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Pattern f47292;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f47293;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f47294;

    public abstract String getName();

    public abstract String getParent();

    /* renamed from: ֡֫ */
    public abstract boolean mo27911();

    /* renamed from: ֨ */
    public boolean mo18535() {
        return true;
    }

    /* renamed from: ֨֫ */
    public abstract boolean mo23113();

    /* renamed from: ֨ۧ */
    public boolean mo27912() {
        return this instanceof C6849;
    }

    /* renamed from: ֫ */
    public boolean mo18537(long j) {
        return false;
    }

    /* renamed from: ۗ */
    public abstract boolean mo23545();

    /* renamed from: ۗ֫ */
    public boolean mo27917() {
        return false;
    }

    /* renamed from: ۙ */
    public abstract boolean mo23546();

    /* renamed from: ۚۧ */
    public boolean mo29016() {
        return false;
    }

    /* renamed from: ۛ֫ */
    public abstract long mo23117();

    /* renamed from: ۜ */
    public abstract ParcelFileDescriptor mo27921(String str);

    /* renamed from: ۜۧ */
    public abstract FileChannel mo27922();

    /* renamed from: ۠ */
    public abstract boolean mo27924();

    /* renamed from: ۠֫ */
    public abstract boolean mo23119();

    /* renamed from: ۡ */
    public boolean mo35194() {
        return true;
    }

    /* renamed from: ۢۧ */
    public abstract InputStream mo27926();

    /* renamed from: ۤ */
    public abstract boolean mo23120();

    /* renamed from: ۤ֫ */
    public boolean mo23547() {
        return false;
    }

    /* renamed from: ۧ */
    public abstract List mo23549(boolean z);

    /* renamed from: ۧ */
    public abstract boolean mo23551(AbstractC15440 abstractC15440);

    /* renamed from: ۧ */
    public boolean mo29017(InterfaceC17066 interfaceC17066) {
        return false;
    }

    /* renamed from: ۫֫ */
    public boolean mo35196() {
        return false;
    }

    /* renamed from: ۬ */
    public abstract boolean mo23552();

    /* renamed from: ܰ֫ */
    public abstract List mo27931();

    /* renamed from: ܶ */
    public boolean mo18540() {
        return true;
    }

    /* renamed from: ܺ */
    public abstract boolean mo27933();

    /* renamed from: ܺ֫ */
    public abstract String mo23554();

    /* renamed from: ܽ */
    public abstract OutputStream mo23555(boolean z);

    /* renamed from: ܿ֫ */
    public String mo27935() {
        return null;
    }

    /* renamed from: ᩴ */
    public abstract boolean mo27936();

    /* renamed from: ᩵֫ */
    public boolean mo31568() {
        return false;
    }

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean mo36530() {
        return false;
    }

    /* renamed from: ᩷ */
    public abstract InterfaceC2245 mo23557(String str);

    /* renamed from: ᩹֫ */
    public boolean mo23126() {
        return false;
    }

    /* renamed from: ᩺ */
    public AbstractC15440 mo23559() {
        return this;
    }

    /* renamed from: ᩺֫ */
    public abstract long mo23127();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getName().compareToIgnoreCase(((AbstractC15440) obj).getName());
    }

    static {
        String str = File.pathSeparator;
        char c = File.separatorChar;
        char c2 = File.pathSeparatorChar;
        f47293 = Pattern.compile("(.*) \\((\\d+)\\)");
        f47292 = Pattern.compile("(.*)\\((\\d+)\\)");
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static String m36487(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        String substring = lastIndexOf == -1 ? "" : str.substring(lastIndexOf);
        String[] strArr = {".1", ".apk.1", ".png", ".9.png", ".gz", ".tar.gz", ".xz", ".tar.xz", ".zst", ".tar.zst", ".zstd", ".tar.zstd", ".bz2", ".tar.bz2", ".lz4", ".tar.lz4"};
        for (int i = 0; i < 16; i += 2) {
            if (substring.equals(strArr[i])) {
                int i2 = i + 1;
                if (C9679.m24617((CharSequence) strArr[i2], str)) {
                    return str.substring(str.length() - strArr[i2].length());
                }
            }
        }
        return substring;
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final String m36517() {
        String name = getName();
        return name.substring(0, name.length() - m36487(name).length());
    }

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final String m36505() {
        return m36487(getName());
    }

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final String m36511() {
        String parent = getParent();
        if (parent != null) {
            return parent;
        }
        throw new NullPointerException(C4153.m12552(this, new StringBuilder("Not parent: ")));
    }

    /* renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public final Uri m36522() {
        return Uri.fromFile(new File(mo23554()));
    }

    /* renamed from: ۜ֫ */
    public AbstractC15440 mo32032() {
        return m36514();
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m36519() {
        String mo27935 = mo27935();
        if (mo27935 == null) {
            return null;
        }
        if (mo27935.startsWith("/")) {
            return mo27935;
        }
        AbstractC15440 mo32032 = mo32032();
        while (mo32032 != null) {
            if (mo27935.isEmpty() || mo27935.equals(".")) {
                return mo32032.mo23554();
            }
            if (mo27935.equals("..")) {
                return mo32032.getParent();
            }
            if (mo27935.startsWith("./")) {
                mo27935 = mo27935.substring(2);
            } else if (mo27935.startsWith("../")) {
                mo27935 = mo27935.substring(3);
                mo32032 = mo32032.m36536();
            } else {
                return mo32032.m36526(mo27935).mo23554();
            }
        }
        return mo23554();
    }

    /* renamed from: ᩹ */
    public AbstractC10503 mo23558() {
        return new C20381(this);
    }

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final boolean m36533() {
        return mo27935() != null;
    }

    /* renamed from: ۖ֫ */
    public String mo32031() {
        return m36533() ? m36519() : mo23554();
    }

    /* renamed from: ܽ */
    public void mo27934(String str) {
        C20402.m46727(str, mo23554());
    }

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m36536() {
        String parent = getParent();
        if (parent != null) {
            return C16999.m39866(parent, new String[0]);
        }
        return null;
    }

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m36514() {
        AbstractC15440 m36536 = m36536();
        if (m36536 != null) {
            return m36536;
        }
        throw new NullPointerException(C4153.m12552(this, new StringBuilder("Not parent: ")));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m36524(String str) {
        return C16999.m39866(m36511(), str);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m36526(String str) {
        return C16999.m39866(mo23554(), str);
    }

    /* renamed from: ֫֫ */
    public String mo23544() {
        return mo23559().mo23554();
    }

    /* renamed from: ܽ֫ */
    public Uri mo31567() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public final Uri m36509() {
        return C11914.m29045(mo23554());
    }

    /* renamed from: ۫ */
    public boolean mo27929() {
        return mo23552();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m36490(InterfaceC17066 interfaceC17066) {
        if (!mo23113()) {
            return mo23127();
        }
        List mo23549 = mo23549(true);
        long j = 0;
        for (int i = 0; i < mo23549.size() && !interfaceC17066.mo1526(); i++) {
            j += ((AbstractC15440) mo23549.get(i)).m36490(interfaceC17066);
        }
        return j;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m36488() {
        String mo23544 = mo23544();
        int i = C16999.f52136;
        return new File(mo23544).canRead();
    }

    /* renamed from: ۚ */
    public boolean mo27919() {
        return m36488();
    }

    /* renamed from: ֫ */
    public AbstractC21087 mo27915(InterfaceC6975 interfaceC6975) {
        return new C18970(this, interfaceC6975);
    }

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public final BufferedInputStream m36518() {
        InputStream mo27926 = mo27926();
        if (mo27926 instanceof BufferedInputStream) {
            return (BufferedInputStream) mo27926;
        }
        return new BufferedInputStream(mo27926);
    }

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public final BufferedReader m36521() {
        return new BufferedReader(new InputStreamReader(mo27926(), StandardCharsets.UTF_8));
    }

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream m36525() {
        OutputStream mo23555 = mo23555(false);
        if (mo23555 instanceof BufferedOutputStream) {
            return (BufferedOutputStream) mo23555;
        }
        return new BufferedOutputStream(mo23555);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C23411 m36513(String str) {
        return C0127.m1200(mo23557(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (l.C22518.m50492().mo2658() == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m36500(l.AbstractC15440 r12, l.C17558 r13, l.InterfaceC5627 r14) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC15440.m36500(l.ܶ᩵ܿ, l.ܿ᩵ܿ, l.ۚ᩸ܿ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36495(OutputStream outputStream, InterfaceC1393 interfaceC1393) {
        try {
            InputStream mo27926 = mo27926();
            try {
                C14176.m33825(mo27926, outputStream, mo23127(), interfaceC1393);
                mo27926.close();
            } catch (Throwable th) {
                if (mo27926 != null) {
                    try {
                        mo27926.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            C12598.m30862(this, e);
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36499(AbstractC15440 abstractC15440, C17558 c17558) {
        if (!mo23113()) {
            m36500(abstractC15440, c17558, (InterfaceC5627) null);
            return;
        }
        if (c17558 != null) {
            c17558.m41050(this);
            abstractC15440.m36508();
            c17558.m41052(abstractC15440);
        } else {
            abstractC15440.m36508();
        }
        for (AbstractC15440 abstractC154402 : mo23549(true)) {
            abstractC154402.m36499(abstractC15440.m36526(abstractC154402.getName()), c17558);
        }
    }

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m36506() {
        InputStream mo27926 = mo27926();
        try {
            byte[] m1795 = C0349.m1795(mo27926, (int) mo23127());
            if (mo27926 != null) {
                mo27926.close();
            }
            return m1795;
        } catch (Throwable th) {
            if (mo27926 != null) {
                try {
                    mo27926.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m36523() {
        long mo23127 = mo23127();
        if (mo23127 <= 20971520) {
            return m36506();
        }
        try {
            InputStream mo27926 = mo27926();
            try {
                byte[] m1794 = C0349.m1794(mo23127, mo27926);
                if (mo27926 != null) {
                    mo27926.close();
                }
                return m1794;
            } finally {
            }
        } catch (Exception unused) {
            return m36506();
        }
    }

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public final C12951 m36528() {
        return new C12951(m36506());
    }

    /* renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public final String m36489() {
        InputStream mo27926 = mo27926();
        try {
            String m49848 = C22194.m49848(mo27926, Charset.defaultCharset());
            if (mo27926 != null) {
                mo27926.close();
            }
            return m49848;
        } catch (Throwable th) {
            if (mo27926 != null) {
                try {
                    mo27926.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public final int m36512() {
        InputStream mo27926 = mo27926();
        try {
            byte[] bArr = new byte[4];
            C22194.m49857(mo27926, bArr, 4);
            int m37744 = C15972.m37744(0, bArr);
            if (mo27926 != null) {
                mo27926.close();
            }
            return m37744;
        } catch (Throwable th) {
            if (mo27926 != null) {
                try {
                    mo27926.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36502(byte[] bArr) {
        m36503(bArr, 0, bArr.length);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36503(byte[] bArr, int i, int i2) {
        mo35195();
        mo27915(new C1330(this, bArr, i, i2, C16999.m39879(this) && !mo23120())).m47984();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36493(InputStream inputStream) {
        m36494(inputStream, -1L, (InterfaceC5627) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36494(InputStream inputStream, long j, InterfaceC5627 interfaceC5627) {
        mo35195();
        m36515(inputStream, j, interfaceC5627);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36515(InputStream inputStream, long j, InterfaceC5627 interfaceC5627) {
        mo27915(new C8386(this, inputStream, j, interfaceC5627, C16999.m39879(this) && !mo23120())).m47984();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36496(C10130 c10130) {
        m36503(c10130.m25438(), 0, c10130.size());
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m36510(String str) {
        m36502(str.getBytes(Charset.defaultCharset()));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36516(String str) {
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        int length = bytes.length;
        mo35195();
        boolean z = C16999.m39879(this) && !mo23120();
        OutputStream mo23555 = mo23555(true);
        try {
            mo23555.write(bytes, 0, length);
            mo23555.close();
            if (z) {
                C16999.m39882(this);
            }
        } catch (Throwable th) {
            if (mo23555 != null) {
                try {
                    mo23555.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m36527() {
        return C16999.m39868(this, ".tmp");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m36535(String str) {
        return C16999.m39868(this, str);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m36520(String str) {
        return C16999.m39868(m36514(), str);
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m36529() {
        if (!mo23120() || mo23113()) {
            return;
        }
        if (mo23127() == 0) {
            mo23552();
            return;
        }
        AbstractC15440 m39866 = C16999.m39866(mo23554() + ".bak", new String[0]);
        m39866.mo23552();
        mo23551(m39866);
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m36532() {
        AbstractC15440 m39866 = C16999.m39866(mo23554() + ".bak", new String[0]);
        if (m39866.mo23120()) {
            if (mo23120()) {
                mo23552();
            }
            m39866.mo23551(this);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36497(InterfaceC12766 interfaceC12766) {
        try {
            new C9945(this).m25070(interfaceC12766);
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36498(AbstractC15440 abstractC15440, Runnable runnable) {
        if (mo23551(abstractC15440)) {
            return;
        }
        if (abstractC15440.mo23120() && (mo23113() || abstractC15440.mo23113())) {
            throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Move failed, target exists: ")));
        }
        if (runnable != null) {
            runnable.run();
        }
        m36499(abstractC15440, new C17558());
        mo23552();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36501(AbstractC15440 abstractC15440, boolean z, boolean z2, Runnable runnable) {
        AbstractC15440 abstractC154402;
        if (equals(abstractC15440)) {
            throw new IOException(C4153.m12552(this, new StringBuilder("Source and target are the same file: ")));
        }
        if (mo23113()) {
            throw new IOException(C4153.m12552(this, new StringBuilder("Source file is a directory: ")));
        }
        if (abstractC15440.mo23120() && abstractC15440.mo23113()) {
            throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Target file is a directory: ")));
        }
        if (!abstractC15440.mo23120()) {
            abstractC154402 = null;
        } else {
            if (abstractC15440.getParent() == null) {
                throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Target file has no parent for rollback: ")));
            }
            abstractC154402 = abstractC15440.m36520(".force_replace_target");
            if (!abstractC15440.mo23551(abstractC154402)) {
                throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to move target file to rollback file: ")));
            }
        }
        try {
            m36498(abstractC15440, runnable);
            if (abstractC154402 == null || !abstractC154402.mo23120()) {
                return;
            }
            if (!z) {
                abstractC154402.mo23552();
                return;
            }
            AbstractC15440 m39866 = C16999.m39866(abstractC15440.mo23554() + ".bak", new String[0]);
            if (m39866.mo23120() && !m39866.mo23552()) {
                abstractC154402.mo23552();
            } else {
                if (abstractC154402.mo23551(m39866)) {
                    return;
                }
                abstractC154402.mo23552();
            }
        } catch (IOException e) {
            if (abstractC15440.mo23120() && !abstractC15440.mo23552()) {
                e.addSuppressed(new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to delete failed target file: "))));
            }
            if (abstractC154402 != null && abstractC154402.mo23120() && !abstractC154402.mo23551(abstractC15440)) {
                e.addSuppressed(new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to restore original target file: "))));
            }
            if (z2 && mo23120() && !mo23552()) {
                e.addSuppressed(new IOException(C4153.m12552(this, new StringBuilder("Unable to delete source file after replace failure: "))));
            }
            throw e;
        }
    }

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m36508() {
        if (!mo23120()) {
            if (!mo23546() && !mo23113()) {
                throw new IOException(C4153.m12552(this, new StringBuilder("Unable to create directory ")));
            }
        } else {
            if (mo23113()) {
                return;
            }
            throw new IOException("File " + mo23554() + " exists and is not a directory. Unable to create directory.");
        }
    }

    /* renamed from: ۨ */
    public void mo35195() {
        m36514().m36508();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m36492(boolean z) {
        String parent;
        String m36505;
        AbstractC15440 m39866;
        if (!mo23120() || (parent = getParent()) == null) {
            return this;
        }
        String name = getName();
        int i = 0;
        if (mo23113()) {
            m36505 = "";
        } else {
            m36505 = m36505();
            name = name.substring(0, name.length() - m36505.length());
        }
        Matcher matcher = (z ? f47293 : f47292).matcher(name);
        if (matcher.matches()) {
            try {
                i = Integer.parseInt(matcher.group(2));
                name = matcher.group(1);
            } catch (Exception unused) {
            }
        }
        StringBuilder m15339 = C5368.m15339(name);
        m15339.append(z ? " (" : MotionUtils.EASING_TYPE_FORMAT_START);
        String sb = m15339.toString();
        String concat = MotionUtils.EASING_TYPE_FORMAT_END.concat(m36505);
        do {
            i++;
            m39866 = C16999.m39866(parent, sb + i + concat);
        } while (m39866.mo23120());
        return m39866;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m36491(String str) {
        return m36524(m36517() + str + m36505());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36504(AbstractC15440 abstractC15440) {
        String lowerCase = mo23544().toLowerCase();
        String lowerCase2 = abstractC15440.mo23544().toLowerCase();
        if (!lowerCase.endsWith("/")) {
            lowerCase = lowerCase.concat("/");
        }
        if (!lowerCase2.endsWith("/")) {
            lowerCase2 = lowerCase2.concat("/");
        }
        return lowerCase.startsWith(lowerCase2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC15440) {
            return mo23554().equals(((AbstractC15440) obj).mo23554());
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f47294;
        if (i != 0) {
            return i;
        }
        int hashCode = mo23554().hashCode();
        this.f47294 = hashCode;
        return hashCode;
    }

    public final String toString() {
        return mo23554();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C15587 mo36531() {
        throw new RuntimeException();
    }

    /* renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public final C15587 m36534() {
        return mo36530() ? mo36531() : this instanceof C12993 ? new C15587(new File(mo23554()), true) : mo27917() ? new C15587(new File(mo23554()), mo27925().m27916()) : new C15587(new File(mo23554()), false);
    }

    /* renamed from: ۢ */
    public C11293 mo27925() {
        throw new RuntimeException();
    }

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36507() {
        return mo35196() && !mo23547();
    }

    /* renamed from: ܿ */
    public C8966 mo23124() {
        throw new RuntimeException();
    }

    /* renamed from: ᩻ */
    public C13198 mo32036() {
        throw new RuntimeException();
    }

    /* renamed from: ۧ */
    public C12993 mo31566() {
        throw new RuntimeException();
    }
}
