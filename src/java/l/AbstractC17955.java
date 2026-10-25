package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: P1WW */
/* renamed from: l.ᩳۡᩳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC17955 extends AbstractC16543 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C19388 f55984;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f55985;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f55986;

    public AbstractC17955(C17249 c17249, InterfaceC5276 interfaceC5276, String str, boolean z) {
        super(c17249, interfaceC5276);
        if (z) {
            this.f55985 = "[ZIJDFCSB]*" + C3939.m11985(str) + "[ZIJDFCSB]*";
            this.f55986 = true;
            return;
        }
        this.f55985 = str;
        this.f55986 = false;
    }

    @Override // l.AbstractC16543
    /* renamed from: ֫ */
    public List mo3535(C17249 c17249) {
        boolean equals;
        InterfaceC19150 mo3570;
        ArrayList arrayList = new ArrayList();
        for (C0657 c0657 : c17249.f52880.values()) {
            if (mo7875(c0657)) {
                for (C1032 c1032 : c0657.mo2696()) {
                    if (mo11597(c1032) && c1032.mo3568().equals("Ljava/lang/String;")) {
                        String m13421 = C4570.m13421(c1032);
                        boolean z = this.f55986;
                        String str = this.f55985;
                        if (z) {
                            equals = m13421.matches(str);
                        } else {
                            equals = m13421.equals(str);
                        }
                        if (equals && (mo3570 = c1032.mo3570()) != null && mo1730(c1032, mo3570)) {
                            arrayList.add(c1032);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ֫ */
    public boolean mo7875(C0657 c0657) {
        return EnumC15657.PUBLIC.m36866(c0657.mo2700()) && "Ljava/lang/Object;".equals(c0657.mo2695());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫ */
    public boolean mo1730(C1032 c1032, InterfaceC19150 interfaceC19150) {
        C17249 c17249 = this.f76507;
        C19388 c19388 = new C19388(c17249);
        this.f55984 = c19388;
        c19388.m44656(c1032);
        Iterator it = this.f55984.m44655().iterator();
        while (it.hasNext()) {
            InterfaceC5471 interfaceC5471 = (InterfaceC5471) it.next();
            String mo3566 = interfaceC5471.mo3566();
            if (c17249.f52881) {
                mo3566.getClass();
                switch (mo3566) {
                    case "Lorg/json/JSONObject;":
                    case "Ljava/net/InetAddress;":
                    case "Ljava/net/HttpURLConnection;":
                    case "Ljava/net/URL;":
                        return false;
                    default:
                        if (mo3566.startsWith("Ljava/util/concurrent/") || mo3566.startsWith("Lorg/xml/") || mo3566.startsWith("Lorg/json/") || mo3566.startsWith("Ljavax/xml/") || mo3566.startsWith("Landroid/view/") || mo3566.startsWith("Landroid/graphics/")) {
                            return false;
                        }
                        break;
                }
            } else {
                mo3566.getClass();
                switch (mo3566) {
                    case "Ljava/io/RandomAccessFile;":
                    case "Ljava/text/SimpleDateFormat;":
                    case "Ljava/util/Calendar;":
                    case "Lorg/json/JSONObject;":
                    case "Ljava/net/InetAddress;":
                    case "Ljava/io/File;":
                    case "Ljava/util/Date;":
                    case "Ljava/io/FileInputStream;":
                    case "Ljava/net/HttpURLConnection;":
                    case "Ljava/io/FileOutputStream;":
                    case "Ljava/net/URL;":
                        return false;
                    default:
                        if (mo3566.startsWith("Ljava/nio/file/") || mo3566.startsWith("Ljava/util/concurrent/") || mo3566.startsWith("Lorg/xml/") || mo3566.startsWith("Lorg/json/") || mo3566.startsWith("Ljavax/xml/") || mo3566.startsWith("Landroid/app/") || mo3566.startsWith("Landroid/view/") || mo3566.startsWith("Landroid/content/") || mo3566.startsWith("Landroid/graphics/") || mo3566.startsWith("Landroid/os/")) {
                            return false;
                        }
                        break;
                }
            }
            if (mo3566.equals("Ljava/lang/Runtime;") && interfaceC5471.getName().equals("exec")) {
                return false;
            }
            if (mo3566.equals("Ljava/lang/Thread;") && interfaceC5471.getName().equals("start")) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ֫ */
    public boolean mo11597(C1032 c1032) {
        return EnumC15657.PUBLIC.m36866(c1032.mo3567()) && EnumC15657.STATIC.m36866(c1032.mo3567());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m41952() {
        Iterator it = this.f55984.m44655().iterator();
        if (!it.hasNext()) {
            return true;
        }
        String mo3566 = ((InterfaceC5471) it.next()).mo3566();
        return mo3566.startsWith("Ljava/lang/") || mo3566.startsWith("Ljavax/crypto/") || mo3566.equals("Ljava/io/ByteArrayOutputStream;");
    }
}
