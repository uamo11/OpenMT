package l;

/* compiled from: R8N3 */
@Deprecated
/* renamed from: l.۬ۡۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C13010 implements InterfaceC14723 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f38947;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f38948;

    @Override // l.InterfaceC14723
    /* renamed from: ֫ */
    public final /* synthetic */ C8353 mo1025() {
        return null;
    }

    @Override // l.InterfaceC14723
    /* renamed from: ۧ */
    public final /* synthetic */ byte[] mo1027() {
        return null;
    }

    public C13010(String str, String str2) {
        this.f38947 = C15107.m35802(str);
        this.f38948 = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l.InterfaceC14723
    /* renamed from: ֫ */
    public final void mo1026(C18252 c18252) {
        String str = this.f38947;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = '\t';
                    break;
                }
                break;
        }
        String str2 = this.f38948;
        switch (c) {
            case 0:
                Integer m32447 = C13426.m32447(str2);
                if (m32447 != null) {
                    c18252.m42587(m32447);
                    break;
                }
                break;
            case 1:
                Integer m324472 = C13426.m32447(str2);
                if (m324472 != null) {
                    c18252.m42573(m324472);
                    break;
                }
                break;
            case 2:
                Integer m324473 = C13426.m32447(str2);
                if (m324473 != null) {
                    c18252.m42575(m324473);
                    break;
                }
                break;
            case 3:
                c18252.m42576(str2);
                break;
            case 4:
                c18252.m42588(str2);
                break;
            case 5:
                c18252.m42586(str2);
                break;
            case 6:
                c18252.m42578(str2);
                break;
            case 7:
                Integer m324474 = C13426.m32447(str2);
                if (m324474 != null) {
                    c18252.m42570(m324474);
                    break;
                }
                break;
            case '\b':
                c18252.m42569(str2);
                break;
            case '\t':
                c18252.m42580(str2);
                break;
        }
    }

    public final String toString() {
        return "VC: " + this.f38947 + "=" + this.f38948;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C13010 c13010 = (C13010) obj;
            if (this.f38947.equals(c13010.f38947) && this.f38948.equals(c13010.f38948)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f38948.hashCode() + C11010.m27349(527, 31, this.f38947);
    }
}
