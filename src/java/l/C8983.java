package l;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: G8O0 */
/* renamed from: l.ۡܺۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C8983 extends AbstractC14626 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f27300;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f27301;

    /* JADX WARN: Multi-variable type inference failed */
    public C8983(String str, String str2, List list) {
        super(str);
        C22632.m50631(!((AbstractCollection) list).isEmpty());
        this.f27300 = str2;
        AbstractC14545 copyOf = AbstractC14545.copyOf((Collection) list);
        this.f27301 = copyOf;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // l.AbstractC14626, l.InterfaceC14723
    /* renamed from: ֫ */
    public final void mo1026(C18252 c18252) {
        char c;
        String str = this.f44734;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        AbstractC14545 abstractC14545 = this.f27301;
        try {
            switch (c) {
                case 0:
                case '\n':
                    c18252.m42576((CharSequence) abstractC14545.get(0));
                    break;
                case 1:
                case 11:
                    c18252.m42584((CharSequence) abstractC14545.get(0));
                    break;
                case 2:
                case '\r':
                    String str2 = (String) abstractC14545.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    c18252.m42581(Integer.valueOf(parseInt));
                    c18252.m42577(Integer.valueOf(parseInt2));
                    break;
                case 3:
                case 18:
                    c18252.m42580((CharSequence) abstractC14545.get(0));
                    break;
                case 4:
                case 19:
                    c18252.m42569((CharSequence) abstractC14545.get(0));
                    break;
                case 5:
                case 20:
                    c18252.m42582((CharSequence) abstractC14545.get(0));
                    break;
                case 6:
                case 21:
                    String str3 = (String) abstractC14545.get(0);
                    String str4 = C3603.f11424;
                    String[] split = str3.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    c18252.m42575(Integer.valueOf(parseInt3));
                    c18252.m42587(valueOf);
                    break;
                case 7:
                case 17:
                    c18252.m42586((CharSequence) abstractC14545.get(0));
                    break;
                case '\b':
                case 16:
                    c18252.m42574((CharSequence) abstractC14545.get(0));
                    break;
                case '\t':
                case 22:
                    c18252.m42585(Integer.valueOf(Integer.parseInt((String) abstractC14545.get(0))));
                    break;
                case '\f':
                    Integer m32447 = C13426.m32447((String) abstractC14545.get(0));
                    if (m32447 == null) {
                        c18252.m42588((CharSequence) abstractC14545.get(0));
                        break;
                    } else {
                        String m52477 = C23799.m52477(m32447.intValue());
                        if (m52477 != null) {
                            c18252.m42588(m52477);
                            break;
                        }
                    }
                    break;
                case 14:
                    ArrayList m23219 = m23219((String) abstractC14545.get(0));
                    int size = m23219.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c18252.m42577((Integer) m23219.get(2));
                            }
                        }
                        c18252.m42581((Integer) m23219.get(1));
                    }
                    c18252.m42585((Integer) m23219.get(0));
                    break;
                case 15:
                    ArrayList m232192 = m23219((String) abstractC14545.get(0));
                    int size2 = m232192.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c18252.m42583((Integer) m232192.get(2));
                            }
                        }
                        c18252.m42579((Integer) m232192.get(1));
                    }
                    c18252.m42589((Integer) m232192.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8983.class == obj.getClass()) {
            C8983 c8983 = (C8983) obj;
            if (C11003.equals(this.f44734, c8983.f44734) && C11003.equals(this.f27300, c8983.f27300) && this.f27301.equals(c8983.f27301)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int m27349 = C11010.m27349(527, 31, this.f44734);
        String str = this.f27300;
        return this.f27301.hashCode() + ((m27349 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // l.AbstractC14626
    public final String toString() {
        return this.f44734 + ": description=" + this.f27300 + ": values=" + this.f27301;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m23219(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }
}
