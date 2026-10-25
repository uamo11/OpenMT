package l;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.NoSuchFileException;
import java.security.CodeSource;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* compiled from: V6B4 */
/* renamed from: l.۫ۡ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12302 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC11223 f36628;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22364 f36629;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public PrintWriter f36630;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public PrintWriter f36631;

    public C12302(PrintWriter printWriter) {
        this.f36630 = printWriter;
        this.f36631 = printWriter;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29852(C12281 c12281) {
        String m50108 = this.f36629.m50108((AbstractC4520) c12281);
        String m501082 = this.f36629.m50108((AbstractC4520) C6241.f19139);
        if (!m50108.startsWith(m501082)) {
            m50108 = C16014.m37867(m501082, m50108);
        }
        this.f36629.m50111(m50108);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC13007 m29850(String[] strArr) {
        EnumC13007 enumC13007;
        boolean z;
        C2903 c2903 = new C2903();
        int i = C11844.f35338;
        c2903.m8840(InterfaceC11223.class, (InterfaceC19837) new C4083());
        c2903.m8841(C22364.f72448, this.f36631);
        c2903.m8841(C22364.f72450, this.f36630);
        C22364 m50099 = C22364.m50099(c2903);
        this.f36629 = m50099;
        if (strArr.length == 0) {
            try {
                EnumC0121.f1140.mo1178(new C3130(m50099), "-help");
            } catch (C2239 unused) {
            }
            enumC13007 = EnumC13007.CMDERR;
        } else {
            try {
                ArrayList m43256 = C18653.m43256(C2609.m8238((Object[]) strArr));
                C15829 c15829 = (C15829) c2903.m8838(C15829.f48908);
                if (c15829 == null) {
                    c15829 = new C15829(c2903);
                }
                c15829.m37469(m43256);
                if (this.f36629.f72454 > 0) {
                    enumC13007 = EnumC13007.CMDERR;
                } else {
                    C11781 m28823 = C11781.m28823(c2903);
                    if (m28823.m28831("stdout")) {
                        this.f36629.m50122();
                        this.f36629.m50110(new PrintWriter((OutputStream) System.out, true));
                    }
                    if (m28823.m28835("nonBatchMode") && System.getProperty("nonBatchMode") == null) {
                        c2903.m8840(C2672.class, (InterfaceC19837) new C9728());
                    }
                    InterfaceC11223 interfaceC11223 = (InterfaceC11223) c2903.m8837(InterfaceC11223.class);
                    this.f36628 = interfaceC11223;
                    if (interfaceC11223 instanceof C0307) {
                        interfaceC11223 = ((C0307) interfaceC11223).m1706();
                    }
                    if (interfaceC11223 instanceof AbstractC21017) {
                        AbstractC21017 abstractC21017 = (AbstractC21017) interfaceC11223;
                        abstractC21017.mo28935(c2903);
                        boolean z2 = true;
                        for (Map.Entry entry : c15829.m37472().entrySet()) {
                            try {
                                z2 &= abstractC21017.mo28937((EnumC0121) entry.getKey(), (String) entry.getValue());
                            } catch (IllegalArgumentException e) {
                                C22364 c22364 = abstractC21017.f67846;
                                String m1188 = ((EnumC0121) entry.getKey()).m1188();
                                String message = e.getMessage();
                                C12281 c12281 = C6241.f19132;
                                c22364.m7276(new C12281("compiler", "illegal.argument.for.option", m1188, message));
                                z2 = false;
                            }
                        }
                        z = z2;
                    } else {
                        z = true;
                    }
                    String m28824 = m28823.m28824("showClass");
                    if (m28824 != null) {
                        if (m28824.equals("showClass")) {
                            m28824 = "com.sun.tools.javac.Main";
                        }
                        PrintWriter m50107 = this.f36629.m50107(EnumC21659.NOTICE);
                        m50107.println("javac: show class: ".concat(m28824));
                        URL resource = C12302.class.getResource("/" + m28824.replace('.', '/') + ".class");
                        if (resource != null) {
                            m50107.println(EnumC0121.f1143 + resource);
                        }
                        try {
                            InputStream resourceAsStream = C12302.class.getResourceAsStream("/" + m28824.replace('.', '/') + ".class");
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
                                DigestInputStream digestInputStream = new DigestInputStream(resourceAsStream, messageDigest);
                                try {
                                    while (digestInputStream.read(new byte[8192]) > 0) {
                                    }
                                    byte[] digest = messageDigest.digest();
                                    digestInputStream.close();
                                    StringBuilder sb = new StringBuilder();
                                    for (byte b : digest) {
                                        sb.append(String.format("%02x", Byte.valueOf(b)));
                                    }
                                    m50107.println("  SHA-256 checksum: " + ((Object) sb));
                                    if (resourceAsStream != null) {
                                        resourceAsStream.close();
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (IOException | NoSuchAlgorithmException e2) {
                            m50107.println("  cannot compute digest: " + e2);
                        }
                    }
                    if (!(c15829.m37477() & z) || this.f36629.f72454 > 0) {
                        enumC13007 = EnumC13007.CMDERR;
                    } else if (c15829.m37473()) {
                        enumC13007 = EnumC13007.OK;
                    } else {
                        if (m28823.m28831("debug.completionDeps")) {
                            C16514.m38893(c2903);
                        }
                        C14932 c14932 = (C14932) C14932.m35379(c2903);
                        c14932.m35380(c15829.m37475());
                        InterfaceC11223 interfaceC112232 = this.f36628;
                        EnumC0121 enumC0121 = EnumC0121.f1130;
                        if (interfaceC112232.mo1701(enumC0121.f1214) == 1) {
                            this.f36628.mo1709(C2609.of((Object) EnumC10892.m27201(c2903).m27208()).iterator(), enumC0121.f1214);
                        }
                        C4541 m13316 = C4541.m13316(c2903);
                        C2609 m37474 = c15829.m37474();
                        if (!m37474.isEmpty()) {
                            c14932.m35381(m37474);
                        }
                        if (m28823.m28825(EnumC0121.f1139) != null) {
                            m13316.f14459 = m13316.f14459.m8246(this.f36629.m50107(EnumC21659.NOTICE));
                        }
                        m28823.m28831("printArgsToFile");
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                m13316.m13335(c15829.m37476(), c15829.m37468(), C2609.m8239());
                                                HashSet hashSet = this.f36629.f72462;
                                                if (hashSet != null) {
                                                    if (hashSet.isEmpty()) {
                                                        this.f36629.m50111("all expected diagnostics found");
                                                        enumC13007 = EnumC13007.OK;
                                                    } else {
                                                        this.f36629.m50111("expected diagnostic keys not found: " + this.f36629.f72462);
                                                        enumC13007 = EnumC13007.ERROR;
                                                    }
                                                } else {
                                                    enumC13007 = m13316.m13346() == 0 ? EnumC13007.OK : EnumC13007.ERROR;
                                                }
                                            } catch (Throwable th) {
                                                m13316.m13332();
                                                throw th;
                                            }
                                        } catch (C16908 e3) {
                                            throw e3.getCause();
                                        }
                                    } catch (C11181 e4) {
                                        this.f36629.m50120(EnumC15307.JAVAC, "msg.proc.annotation.uncaught.exception", new Object[0]);
                                        e4.getCause().printStackTrace(this.f36629.m50107(EnumC21659.NOTICE));
                                        enumC13007 = EnumC13007.SYSERR;
                                    }
                                } catch (Throwable th2) {
                                    if (m13316.m13346() == 0 || m28823.m28831("dev")) {
                                        m29851(th2);
                                    }
                                    enumC13007 = EnumC13007.ABNORMAL;
                                }
                            } catch (C23570 e5) {
                                this.f36629.m50111(e5.getMessage());
                                if (e5.getCause() != null && m28823.m28831("dev")) {
                                    e5.getCause().printStackTrace(this.f36629.m50107(EnumC21659.NOTICE));
                                }
                                enumC13007 = EnumC13007.SYSERR;
                            }
                        } catch (IllegalAccessError e6) {
                            if (m29849(e6)) {
                                m29851((Throwable) e6);
                            }
                            enumC13007 = EnumC13007.ABNORMAL;
                        } catch (OutOfMemoryError e7) {
                            e = e7;
                            this.f36629.m50120(EnumC15307.JAVAC, "msg.resource", new Object[0]);
                            e.printStackTrace(this.f36629.m50107(EnumC21659.NOTICE));
                            enumC13007 = EnumC13007.SYSERR;
                        } catch (StackOverflowError e8) {
                            e = e8;
                            this.f36629.m50120(EnumC15307.JAVAC, "msg.resource", new Object[0]);
                            e.printStackTrace(this.f36629.m50107(EnumC21659.NOTICE));
                            enumC13007 = EnumC13007.SYSERR;
                        }
                        m13316.m13332();
                    }
                }
            } catch (FileNotFoundException e9) {
                e = e9;
                String message2 = e.getMessage();
                C12281 c122812 = C6241.f19132;
                m29852(new C12281("compiler", "file.not.found", message2));
                enumC13007 = EnumC13007.SYSERR;
            } catch (NoSuchFileException e10) {
                e = e10;
                String message22 = e.getMessage();
                C12281 c1228122 = C6241.f19132;
                m29852(new C12281("compiler", "file.not.found", message22));
                enumC13007 = EnumC13007.SYSERR;
            } catch (IOException e11) {
                this.f36629.m50120(EnumC15307.JAVAC, "msg.io", new Object[0]);
                e11.printStackTrace(this.f36629.m50107(EnumC21659.NOTICE));
                enumC13007 = EnumC13007.SYSERR;
            } catch (C3836 e12) {
                C12281 c122813 = C6241.f19132;
                m29852(new C12281("compiler", "unmatched.quote", e12.f12253));
                this.f36629.m50120(EnumC15307.JAVAC, "msg.usage", "javac");
                enumC13007 = EnumC13007.CMDERR;
            }
        }
        EnumC13007 enumC130072 = enumC13007;
        try {
            InterfaceC11223 interfaceC112233 = this.f36628;
            if (interfaceC112233 != null) {
                interfaceC112233.close();
            }
        } catch (IOException e13) {
            m29851(e13);
        }
        return enumC130072;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m29849(IllegalAccessError illegalAccessError) {
        Matcher matcher = Pattern.compile("(?i)(?<=tried to access class )([a-z_$][a-z\\d_$]*\\.)*[a-z_$][a-z\\d_$]*").matcher(illegalAccessError.getMessage());
        if (matcher.find()) {
            try {
                Class<?> cls = Class.forName(matcher.group(0));
                if (C12302.class.getClassLoader() != cls.getClassLoader()) {
                    CodeSource codeSource = cls.getProtectionDomain().getCodeSource();
                    CodeSource codeSource2 = C12302.class.getProtectionDomain().getCodeSource();
                    if (codeSource != null && codeSource2 != null) {
                        C22364 c22364 = this.f36629;
                        URL location = codeSource.getLocation();
                        URL location2 = codeSource2.getLocation();
                        C12281 c12281 = C6241.f19132;
                        c22364.m50119(new C12281("compiler", "two.class.loaders.2", location, location2));
                    } else {
                        this.f36629.m50119(C6241.f19213);
                    }
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29851(Throwable th) {
        this.f36629.m50120(EnumC15307.JAVAC, "msg.bug", C4541.m13321());
        th.printStackTrace(this.f36629.m50107(EnumC21659.NOTICE));
    }
}
