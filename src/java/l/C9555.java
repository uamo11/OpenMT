package l;

import android.os.Build;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: K250 */
/* renamed from: l.ۢۧ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9555 extends C15688 {

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final C16477 f28975;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final C16477 f28976;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final C16477 f28977;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public C16477 f28978;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f28979;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C17642 f28980;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f28981;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f28982;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f28983;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C4027 f28984;

    static {
        int i;
        Iterator it = C22660.m50656().iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 0;
                break;
            }
            C11372 c11372 = (C11372) it.next();
            if (c11372.f34030.equals("everybody")) {
                i = c11372.f34032;
                break;
            }
        }
        f28977 = new C16477(16816, 0, i);
        f28976 = new C16477(33200, 0, i);
        f28975 = new C16477(41392, 0, i);
    }

    public C9555(AbstractC15440 abstractC15440) {
        super(abstractC15440.getName(), abstractC15440.getParent(), abstractC15440.mo27935(), abstractC15440.mo23127(), abstractC15440.mo23117(), !abstractC15440.mo23113());
        C11293 m31569;
        C17642 mo27920;
        this.f28981 = abstractC15440;
        if (abstractC15440.mo27917() && abstractC15440.mo23554().equals("/data/adb/ksu/modules.img")) {
            m36963(abstractC15440.mo27925().m27918());
        }
        boolean mo23126 = abstractC15440.mo23126();
        C16477 c16477 = f28977;
        if (mo23126) {
            C8966 mo23124 = abstractC15440.mo23124();
            if (mo23124.m23123()) {
                this.f28984 = mo23124.m23116();
                this.f28978 = c16477;
                return;
            }
        }
        boolean mo27917 = abstractC15440.mo27917();
        this.f28982 = mo27917;
        C16477 c164772 = f28976;
        if (mo27917) {
            try {
                C17642 m27928 = abstractC15440.mo27925().m27928();
                this.f28980 = m27928;
                this.f28978 = new C16477(m27928);
                return;
            } catch (IOException unused) {
                this.f28978 = isDirectory() ? c16477 : c164772;
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 30 && (abstractC15440 instanceof C12993) && (m31569 = abstractC15440.mo31566().m31569()) != null && (mo27920 = m31569.mo27920()) != null) {
            this.f28978 = new C16477(mo27920);
            return;
        }
        if (abstractC15440 instanceof C13198) {
            C13198 mo32036 = abstractC15440.mo32036();
            if (mo32036.m32033()) {
                this.f28983 = true;
                C3321 m32035 = mo32036.m32035();
                this.f28978 = new C16477(m32035.m10172(), m32035.m10169(), m32035.m10167());
            }
        }
        if (this.f28983) {
            return;
        }
        if (mo36978()) {
            this.f28978 = f28975;
        } else {
            this.f28978 = isDirectory() ? c16477 : c164772;
        }
    }

    public C9555(C4027 c4027) {
        super(c4027.f12783, "/storage", null, -1L, 0L, false);
        this.f28981 = C16999.m39866(getPath(), new String[0]);
        this.f28984 = c4027;
        this.f28978 = f28977;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m24435() {
        return this.f28984 != null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4027 m24434() {
        return this.f28984;
    }

    @Override // l.C15688, l.InterfaceC17889
    /* renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 mo24433() {
        return this.f28981;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m24432() {
        this.f28981 = C16999.m39866(this.f28981.mo23554(), new String[0]);
    }

    @Override // l.C15688, l.InterfaceC17889
    /* renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public final int mo24431() {
        if (m24435()) {
            return 6;
        }
        return super.mo24431();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m24430() {
        C17642 c17642 = this.f28980;
        return c17642 == null || c17642.m41288() == '-' || c17642.m41287() == '-';
    }

    @Override // l.C15688, l.InterfaceC17889
    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final boolean mo24437() {
        char m41288;
        C17642 c17642 = this.f28980;
        return (c17642 == null || (m41288 = c17642.m41288()) == '-' || (m41288 == 'l' && c17642.m41287() == '-')) && super.mo24437() && !getParent().startsWith("/proc/");
    }

    @Override // l.C15688, l.InterfaceC17889
    /* renamed from: ᩸ */
    public final CharSequence mo21183() {
        C4027 c4027 = this.f28984;
        if (c4027 != null) {
            return c4027.f12781;
        }
        if (C19890.f64280 || isDirectory()) {
            return null;
        }
        boolean z = this.f28982;
        boolean z2 = this.f28983;
        if ((!z && !z2) || C16999.m39887(getPath()) || C19739.m45449(getPath()) != null) {
            return null;
        }
        if (z2 && getPath().charAt(19) != 'd') {
            return null;
        }
        SpannableString spannableString = new SpannableString(this.f28978.m38839());
        spannableString.setSpan(new TypefaceSpan("monospace"), 0, spannableString.length(), 18);
        return spannableString;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m24436() {
        return this.f28983;
    }

    @Override // l.C15688, l.InterfaceC17889
    /* renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public final C16477 mo24428() {
        return this.f28978;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24429(C16477 c16477) {
        this.f28978 = c16477;
        this.f28979 = true;
    }

    @Override // l.C15688
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9555.class != obj.getClass() || this.f28979 || !super.equals(obj)) {
            return false;
        }
        C9555 c9555 = (C9555) obj;
        if (c9555.f28979) {
            return false;
        }
        return C11003.equals(this.f28978, c9555.f28978);
    }

    @Override // l.C15688
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        C16477 c16477 = this.f28978;
        return hashCode + (c16477 != null ? c16477.hashCode() : 0);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m24427(C16477 c16477) {
        return c16477 == f28977 || c16477 == f28976 || c16477 == f28975;
    }
}
