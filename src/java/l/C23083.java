package l;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

/* compiled from: P4VD */
/* renamed from: l.᩺ܺ֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23083 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C10384[] f74230 = new C10384[0];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LinkedList f74231;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6150 f74232;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f74233;

    public C23083(InterfaceC6150 interfaceC6150, C3328 c3328) {
        LinkedList linkedList = new LinkedList();
        this.f74231 = linkedList;
        linkedList.listIterator();
        this.f74232 = interfaceC6150;
        this.f74233 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10384[] m51247() {
        return (C10384[]) ((List) C5378.stream(this.f74231).map(new C2225(2, this)).filter(new C13514(1)).collect(C22976.toList())).toArray(f74230);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C10384 m51245(C23083 c23083, String str) {
        C10384 mo11134 = c23083.f74232.mo11134(str);
        return (mo11134 == null && c23083.f74233) ? new C10384(str) : mo11134;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51246(InputStream inputStream, String str) {
        this.f74231 = new LinkedList();
        InterfaceC6150 interfaceC6150 = this.f74232;
        int i = C8789.f26773;
        Charset defaultCharset = Charset.defaultCharset();
        if (str != null) {
            defaultCharset = Charset.forName(str);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, defaultCharset));
        try {
            for (String mo17064 = interfaceC6150.mo17064(bufferedReader); mo17064 != null; mo17064 = interfaceC6150.mo17064(bufferedReader)) {
                this.f74231.add(mo17064);
            }
            bufferedReader.close();
            interfaceC6150.mo11132(this.f74231);
            this.f74231.listIterator();
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
