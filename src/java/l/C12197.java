package l;

import com.alipay.sdk.m.n.c;
import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: UBJ4 */
/* renamed from: l.۫ۚۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum C12197 extends EnumC22780 {

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static final int f36406 = 24;

    public /* synthetic */ C12197() {
        this("InBody", 6);
    }

    public C12197(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC22780
    /* renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        String str;
        boolean m50859;
        switch (C21370.f68842[abstractC2195.f7214.ordinal()]) {
            case 1:
                c17136.m40178((C14188) abstractC2195);
                return true;
            case 2:
                c17136.m40182(this);
                return false;
            case 3:
                return m29672(abstractC2195, c17136);
            case 4:
                return m29671(abstractC2195, c17136);
            case 5:
                C17011 c17011 = (C17011) abstractC2195;
                String m39895 = c17011.m39895();
                str = EnumC22780.f73536;
                if (m39895.equals(str)) {
                    c17136.m40182(this);
                    return false;
                }
                if (c17136.m40223()) {
                    m50859 = EnumC22780.m50859(c17011);
                    if (m50859) {
                        c17136.m40194();
                        c17136.m40179(c17011);
                        return true;
                    }
                }
                c17136.m40194();
                c17136.m40179(c17011);
                c17136.m40183(false);
                return true;
            case 6:
                if (c17136.m40189() <= 0) {
                    return true;
                }
                EnumC22780 enumC22780 = EnumC22780.f73543;
                c17136.f2106 = abstractC2195;
                return enumC22780.mo1361(abstractC2195, c17136);
            default:
                return true;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m29672(AbstractC2195 abstractC2195, C17136 c17136) {
        C19814 m40228;
        C12052 m40198;
        C15578 c15578;
        abstractC2195.getClass();
        C9251 c9251 = (C9251) abstractC2195;
        String str = c9251.f26122;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1644953643:
                if (str.equals("frameset")) {
                    c = 0;
                    break;
                }
                break;
            case -1377687758:
                if (str.equals("button")) {
                    c = 1;
                    break;
                }
                break;
            case -1191214428:
                if (str.equals("iframe")) {
                    c = 2;
                    break;
                }
                break;
            case -1134665583:
                if (str.equals("keygen")) {
                    c = 3;
                    break;
                }
                break;
            case -1010136971:
                if (str.equals("option")) {
                    c = 4;
                    break;
                }
                break;
            case -1003243718:
                if (str.equals("textarea")) {
                    c = 5;
                    break;
                }
                break;
            case -906021636:
                if (str.equals("select")) {
                    c = 6;
                    break;
                }
                break;
            case -891985998:
                if (str.equals("strike")) {
                    c = 7;
                    break;
                }
                break;
            case -891980137:
                if (str.equals("strong")) {
                    c = '\b';
                    break;
                }
                break;
            case -80773204:
                if (str.equals("optgroup")) {
                    c = '\t';
                    break;
                }
                break;
            case 97:
                if (str.equals(am.av)) {
                    c = '\n';
                    break;
                }
                break;
            case 98:
                if (str.equals("b")) {
                    c = 11;
                    break;
                }
                break;
            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                if (str.equals(am.aC)) {
                    c = '\f';
                    break;
                }
                break;
            case 115:
                if (str.equals(am.aB)) {
                    c = '\r';
                    break;
                }
                break;
            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                if (str.equals(am.aH)) {
                    c = 14;
                    break;
                }
                break;
            case 3152:
                if (str.equals("br")) {
                    c = 15;
                    break;
                }
                break;
            case 3200:
                if (str.equals("dd")) {
                    c = 16;
                    break;
                }
                break;
            case 3216:
                if (str.equals("dt")) {
                    c = 17;
                    break;
                }
                break;
            case 3240:
                if (str.equals("em")) {
                    c = 18;
                    break;
                }
                break;
            case 3273:
                if (str.equals("h1")) {
                    c = 19;
                    break;
                }
                break;
            case 3274:
                if (str.equals("h2")) {
                    c = 20;
                    break;
                }
                break;
            case 3275:
                if (str.equals("h3")) {
                    c = 21;
                    break;
                }
                break;
            case 3276:
                if (str.equals("h4")) {
                    c = 22;
                    break;
                }
                break;
            case 3277:
                if (str.equals("h5")) {
                    c = 23;
                    break;
                }
                break;
            case 3278:
                if (str.equals("h6")) {
                    c = 24;
                    break;
                }
                break;
            case 3338:
                if (str.equals("hr")) {
                    c = 25;
                    break;
                }
                break;
            case 3453:
                if (str.equals("li")) {
                    c = 26;
                    break;
                }
                break;
            case 3646:
                if (str.equals("rp")) {
                    c = 27;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c = 28;
                    break;
                }
                break;
            case 3712:
                if (str.equals("tt")) {
                    c = 29;
                    break;
                }
                break;
            case 97536:
                if (str.equals("big")) {
                    c = 30;
                    break;
                }
                break;
            case 104387:
                if (str.equals("img")) {
                    c = 31;
                    break;
                }
                break;
            case 111267:
                if (str.equals("pre")) {
                    c = ' ';
                    break;
                }
                break;
            case 114276:
                if (str.equals("svg")) {
                    c = '!';
                    break;
                }
                break;
            case 117511:
                if (str.equals("wbr")) {
                    c = '\"';
                    break;
                }
                break;
            case 118811:
                if (str.equals("xmp")) {
                    c = '#';
                    break;
                }
                break;
            case 3002509:
                if (str.equals("area")) {
                    c = '$';
                    break;
                }
                break;
            case 3029410:
                if (str.equals("body")) {
                    c = '%';
                    break;
                }
                break;
            case 3059181:
                if (str.equals("code")) {
                    c = '&';
                    break;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    c = '\'';
                    break;
                }
                break;
            case 3148996:
                if (str.equals(c.c)) {
                    c = '(';
                    break;
                }
                break;
            case 3213227:
                if (str.equals("html")) {
                    c = ')';
                    break;
                }
                break;
            case 3344136:
                if (str.equals("math")) {
                    c = '*';
                    break;
                }
                break;
            case 3386833:
                if (str.equals("nobr")) {
                    c = '+';
                    break;
                }
                break;
            case 3536714:
                if (str.equals("span")) {
                    c = ',';
                    break;
                }
                break;
            case 96620249:
                if (str.equals("embed")) {
                    c = '-';
                    break;
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    c = '.';
                    break;
                }
                break;
            case 100358090:
                if (str.equals("input")) {
                    c = '/';
                    break;
                }
                break;
            case 109548807:
                if (str.equals("small")) {
                    c = '0';
                    break;
                }
                break;
            case 110115790:
                if (str.equals("table")) {
                    c = '1';
                    break;
                }
                break;
            case 181975684:
                if (str.equals("listing")) {
                    c = '2';
                    break;
                }
                break;
            case 1973234167:
                if (str.equals("plaintext")) {
                    c = '3';
                    break;
                }
                break;
            case 2091304424:
                if (str.equals("isindex")) {
                    c = '4';
                    break;
                }
                break;
            case 2115613112:
                if (str.equals("noembed")) {
                    c = '5';
                    break;
                }
                break;
        }
        String[] strArr = C11492.f34318;
        String[] strArr2 = C17136.f52500;
        switch (c) {
            case 0:
                c17136.m40182(this);
                ArrayList arrayList = c17136.f2112;
                if (arrayList.size() == 1) {
                    return false;
                }
                if ((arrayList.size() > 2 && !((C19814) arrayList.get(1)).m45588().equals("body")) || !c17136.m40223()) {
                    return false;
                }
                C19814 c19814 = (C19814) arrayList.get(1);
                if (c19814.mo28099() != null) {
                    c19814.m28091();
                }
                while (arrayList.size() > 1) {
                    C18473.m42953(arrayList, 1);
                }
                c17136.m40173(c9251);
                c17136.m40212(EnumC22780.f73535);
                return true;
            case 1:
                if (c17136.m40193("button")) {
                    c17136.m40182(this);
                    c17136.m2163("button");
                    c17136.mo2158((AbstractC2195) c9251);
                    return true;
                }
                c17136.m40194();
                c17136.m40173(c9251);
                c17136.m40183(false);
                return true;
            case 2:
                c17136.m40183(false);
                EnumC22780.m50860(c9251, c17136);
                return true;
            case 3:
            case 15:
            case 31:
            case '\"':
            case '$':
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                c17136.m40194();
                c17136.m40201(c9251);
                c17136.m40183(false);
                return true;
            case 4:
            case '\t':
                if (c17136.m2157("option")) {
                    c17136.m2163("option");
                }
                c17136.m40194();
                c17136.m40173(c9251);
                return true;
            case 5:
                c17136.m40173(c9251);
                if (c9251.f26116) {
                    return true;
                }
                c17136.f2104.m44177(EnumC19541.f63162);
                c17136.m40219();
                c17136.m40183(false);
                c17136.m40212(EnumC22780.f73551);
                return true;
            case 6:
                c17136.m40194();
                c17136.m40173(c9251);
                c17136.m40183(false);
                if (!c9251.f26116) {
                    EnumC22780 m40221 = c17136.m40221();
                    if (m40221.equals(EnumC22780.f73560) || m40221.equals(EnumC22780.f73559) || m40221.equals(EnumC22780.f73540) || m40221.equals(EnumC22780.f73554) || m40221.equals(EnumC22780.f73549)) {
                        c17136.m40212(EnumC22780.f73550);
                        return true;
                    }
                    c17136.m40212(EnumC22780.f73553);
                    return true;
                }
                return true;
            case 7:
            case '\b':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 18:
            case 29:
            case 30:
            case '&':
            case '\'':
            case '0':
                c17136.m40194();
                c17136.m40192(c17136.m40173(c9251));
                return true;
            case '\n':
                if (c17136.m40205(am.av) != null) {
                    c17136.m40182(this);
                    c17136.m2163(am.av);
                    C19814 m402282 = c17136.m40228(am.av);
                    if (m402282 != null) {
                        c17136.m40222(m402282);
                        c17136.m40199(m402282);
                    }
                }
                c17136.m40194();
                c17136.m40192(c17136.m40173(c9251));
                return true;
            case 16:
            case 17:
                c17136.m40183(false);
                ArrayList arrayList2 = c17136.f2112;
                int size = arrayList2.size();
                int i = size - 1;
                int i2 = i >= 24 ? size - 25 : 0;
                while (true) {
                    if (i >= i2) {
                        C19814 c198142 = (C19814) arrayList2.get(i);
                        if (C20519.m47005(c198142.m45588(), C11492.f34330)) {
                            c17136.m2163(c198142.m45588());
                        } else if (!C20519.m47005(c198142.m45588(), strArr2) || C20519.m47005(c198142.m45588(), strArr)) {
                            i--;
                        }
                    }
                }
                if (c17136.m40193(am.ax)) {
                    c17136.m2163(am.ax);
                }
                c17136.m40173(c9251);
                return true;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                if (c17136.m40193(am.ax)) {
                    c17136.m2163(am.ax);
                }
                if (C20519.m47005(c17136.m2153().m45588(), C11492.f34333)) {
                    c17136.m40182(this);
                    c17136.m40190();
                }
                c17136.m40173(c9251);
                return true;
            case 25:
                if (c17136.m40193(am.ax)) {
                    c17136.m2163(am.ax);
                }
                c17136.m40201(c9251);
                c17136.m40183(false);
                return true;
            case 26:
                c17136.m40183(false);
                ArrayList arrayList3 = c17136.f2112;
                int size2 = arrayList3.size();
                while (true) {
                    size2--;
                    if (size2 > 0) {
                        C19814 c198143 = (C19814) arrayList3.get(size2);
                        if (c198143.m45588().equals("li")) {
                            c17136.m2163("li");
                        } else if (!C20519.m47005(c198143.m45588(), strArr2) || C20519.m47005(c198143.m45588(), strArr)) {
                        }
                    }
                }
                if (c17136.m40193(am.ax)) {
                    c17136.m2163(am.ax);
                }
                c17136.m40173(c9251);
                return true;
            case 27:
            case 28:
                if (c17136.m40200("ruby")) {
                    c17136.m40204(false);
                    if (!c17136.m2157("ruby")) {
                        c17136.m40182(this);
                        int size3 = c17136.f2112.size();
                        while (true) {
                            size3--;
                            if (size3 >= 0 && !((C19814) c17136.f2112.get(size3)).m45588().equals("ruby")) {
                                c17136.f2112.remove(size3);
                            }
                        }
                    }
                    c17136.m40173(c9251);
                    return true;
                }
                return true;
            case ' ':
            case '2':
                if (c17136.m40193(am.ax)) {
                    c17136.m2163(am.ax);
                }
                c17136.m40173(c9251);
                c17136.f2107.m41796("\n");
                c17136.m40183(false);
                return true;
            case '!':
                c17136.m40194();
                c17136.m40173(c9251);
                return true;
            case '#':
                if (c17136.m40193(am.ax)) {
                    c17136.m2163(am.ax);
                }
                c17136.m40194();
                c17136.m40183(false);
                EnumC22780.m50860(c9251, c17136);
                return true;
            case '%':
                c17136.m40182(this);
                ArrayList arrayList4 = c17136.f2112;
                if (arrayList4.size() == 1) {
                    return false;
                }
                if ((arrayList4.size() > 2 && !((C19814) arrayList4.get(1)).m45588().equals("body")) || c17136.m40186("template")) {
                    return false;
                }
                c17136.m40183(false);
                if (c9251.m22252() && (m40228 = c17136.m40228("body")) != null) {
                    Iterator it = c9251.f26118.iterator();
                    while (it.hasNext()) {
                        C9230 c9230 = (C9230) it.next();
                        if (!m40228.mo25052(c9230.getKey())) {
                            m40228.mo25045().m36729(c9230);
                        }
                    }
                }
                return true;
            case '(':
                if (c17136.m40198() != null && !c17136.m40186("template")) {
                    c17136.m40182(this);
                    return false;
                }
                if (c17136.m40193(am.ax)) {
                    c17136.m40191();
                }
                c17136.m40176(c9251, true, true);
                return true;
            case ')':
                c17136.m40182(this);
                if (c17136.m40186("template")) {
                    return false;
                }
                if (c17136.f2112.size() > 0) {
                    C19814 c198144 = (C19814) c17136.f2112.get(0);
                    if (c9251.m22252()) {
                        Iterator it2 = c9251.f26118.iterator();
                        while (it2.hasNext()) {
                            C9230 c92302 = (C9230) it2.next();
                            if (!c198144.mo25052(c92302.getKey())) {
                                c198144.mo25045().m36729(c92302);
                            }
                        }
                    }
                }
                return true;
            case '*':
                c17136.m40194();
                c17136.m40173(c9251);
                return true;
            case '+':
                c17136.m40194();
                if (c17136.m40200("nobr")) {
                    c17136.m40182(this);
                    c17136.m2163("nobr");
                    c17136.m40194();
                }
                c17136.m40192(c17136.m40173(c9251));
                return true;
            case ',':
                c17136.m40194();
                c17136.m40173(c9251);
                return true;
            case '.':
                if (c17136.m40228("svg") == null) {
                    c9251.m22257("img");
                    return c17136.mo2158((AbstractC2195) c9251);
                }
                c17136.m40173(c9251);
                return true;
            case '/':
                c17136.m40194();
                if (!c17136.m40201(c9251).mo25048("type").equalsIgnoreCase("hidden")) {
                    c17136.m40183(false);
                    return true;
                }
                return true;
            case '1':
                if (c17136.f2109.m2914() != EnumC4996.quirks && c17136.m40193(am.ax)) {
                    c17136.m2163(am.ax);
                }
                c17136.m40173(c9251);
                c17136.m40183(false);
                c17136.m40212(EnumC22780.f73560);
                return true;
            case '3':
                if (c17136.m40193(am.ax)) {
                    c17136.m2163(am.ax);
                }
                c17136.m40173(c9251);
                c17136.f2104.m44177(EnumC19541.f63129);
                return true;
            case '4':
                c17136.m40182(this);
                if (c17136.m40198() != null) {
                    return false;
                }
                c17136.m2164(c.c);
                C15578 c155782 = c9251.f26118;
                if (c155782 != null && c155782.m36735("action") && (m40198 = c17136.m40198()) != null && (c15578 = c9251.f26118) != null && c15578.m36735("action")) {
                    m40198.mo25045().put("action", c9251.f26118.get("action"));
                }
                c17136.m2164("hr");
                c17136.m2164(AnnotatedPrivateKey.LABEL);
                C15578 c155783 = c9251.f26118;
                String str2 = (c155783 == null || !c155783.m36735("prompt")) ? "This is a searchable index. Enter search keywords: " : c9251.f26118.get("prompt");
                C17011 c17011 = new C17011();
                c17011.m39894(str2);
                c17136.mo2158((AbstractC2195) c17011);
                C15578 c155784 = new C15578();
                if (c9251.m22252()) {
                    Iterator it3 = c9251.f26118.iterator();
                    while (it3.hasNext()) {
                        C9230 c92303 = (C9230) it3.next();
                        if (!C20519.m47005(c92303.getKey(), C11492.f34319)) {
                            c155784.m36729(c92303);
                        }
                    }
                }
                c155784.put("name", "isindex");
                c17136.m2159(c155784);
                c17136.m2163(AnnotatedPrivateKey.LABEL);
                c17136.m2164("hr");
                c17136.m2163(c.c);
                return true;
            case '5':
                EnumC22780.m50860(c9251, c17136);
                return true;
            default:
                if (!C16305.m38358(str)) {
                    c17136.m40173(c9251);
                    return true;
                }
                if (C20519.m47005(str, C11492.f34309)) {
                    if (c17136.m40193(am.ax)) {
                        c17136.m2163(am.ax);
                    }
                    c17136.m40173(c9251);
                    return true;
                }
                if (C20519.m47005(str, C11492.f34311)) {
                    EnumC22780 enumC22780 = EnumC22780.f73545;
                    c17136.f2106 = abstractC2195;
                    return enumC22780.mo1361(abstractC2195, c17136);
                }
                if (C20519.m47005(str, C11492.f34315)) {
                    c17136.m40194();
                    c17136.m40173(c9251);
                    c17136.m40185();
                    c17136.m40183(false);
                    return true;
                }
                if (C20519.m47005(str, C11492.f34329)) {
                    c17136.m40201(c9251);
                    return true;
                }
                if (C20519.m47005(str, C11492.f34338)) {
                    c17136.m40182(this);
                    return false;
                }
                c17136.m40194();
                c17136.m40173(c9251);
                return true;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m29671(AbstractC2195 abstractC2195, C17136 c17136) {
        C20540 c20540;
        String str;
        abstractC2195.getClass();
        c20540 = (C20540) abstractC2195;
        str = c20540.f26122;
        str.getClass();
        switch (str) {
            case "template":
                c17136.m40175(abstractC2195, EnumC22780.f73545);
                return true;
            case "p":
                if (!c17136.m40193(str)) {
                    c17136.m40182(this);
                    c17136.m2164(str);
                    return c17136.mo2158(c20540);
                }
                c17136.m40215(str);
                if (!c17136.m2157(str)) {
                    c17136.m40182(this);
                }
                c17136.m40187(str);
                return true;
            case "br":
                c17136.m40182(this);
                c17136.m2164("br");
                return false;
            case "dd":
            case "dt":
                if (!c17136.m40200(str)) {
                    c17136.m40182(this);
                    return false;
                }
                c17136.m40215(str);
                if (!c17136.m2157(str)) {
                    c17136.m40182(this);
                }
                c17136.m40187(str);
                return true;
            case "h1":
            case "h2":
            case "h3":
            case "h4":
            case "h5":
            case "h6":
                String[] strArr = C11492.f34333;
                if (!c17136.m40184(strArr)) {
                    c17136.m40182(this);
                    return false;
                }
                c17136.m40215(str);
                if (!c17136.m2157(str)) {
                    c17136.m40182(this);
                }
                for (int size = c17136.f2112.size() - 1; size >= 0; size--) {
                    C19814 c19814 = (C19814) c17136.f2112.get(size);
                    c17136.f2112.remove(size);
                    if (C20519.m47005(c19814.m45588(), strArr)) {
                        return true;
                    }
                }
                return true;
            case "li":
                if (!c17136.m40224(str)) {
                    c17136.m40182(this);
                    return false;
                }
                c17136.m40215(str);
                if (!c17136.m2157(str)) {
                    c17136.m40182(this);
                }
                c17136.m40187(str);
                return true;
            case "body":
                if (!c17136.m40200("body")) {
                    c17136.m40182(this);
                    return false;
                }
                m29674(abstractC2195, c17136);
                c17136.m40212(EnumC22780.f73538);
                return true;
            case "form":
                if (c17136.m40186("template")) {
                    if (!c17136.m40200(str)) {
                        c17136.m40182(this);
                        return false;
                    }
                    c17136.m40204(false);
                    if (!c17136.m2157(str)) {
                        c17136.m40182(this);
                    }
                    c17136.m40187(str);
                    return true;
                }
                C12052 m40198 = c17136.m40198();
                c17136.m40226();
                if (m40198 == null || !c17136.m40200(str)) {
                    c17136.m40182(this);
                    return false;
                }
                c17136.m40204(false);
                if (!c17136.m2157(str)) {
                    c17136.m40182(this);
                }
                c17136.m40199(m40198);
                return true;
            case "html":
                if (c17136.m2163("body")) {
                    return c17136.mo2158(c20540);
                }
                return true;
            case "span":
            case "sarcasm":
                return m29674(abstractC2195, c17136);
            default:
                if (C20519.m47005(str, C11492.f34332)) {
                    return m29673(abstractC2195, c17136);
                }
                if (C20519.m47005(str, C11492.f34327)) {
                    if (!c17136.m40200(str)) {
                        c17136.m40182(this);
                        return false;
                    }
                    c17136.m40204(false);
                    if (!c17136.m2157(str)) {
                        c17136.m40182(this);
                    }
                    c17136.m40187(str);
                    return true;
                }
                if (!C20519.m47005(str, C11492.f34315)) {
                    return m29674(abstractC2195, c17136);
                }
                if (!c17136.m40200("name")) {
                    if (!c17136.m40200(str)) {
                        c17136.m40182(this);
                        return false;
                    }
                    c17136.m40204(false);
                    if (!c17136.m2157(str)) {
                        c17136.m40182(this);
                    }
                    c17136.m40187(str);
                    c17136.m40217();
                }
                return true;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m29674(AbstractC2195 abstractC2195, C17136 c17136) {
        abstractC2195.getClass();
        String str = ((C20540) abstractC2195).f26122;
        ArrayList arrayList = c17136.f2112;
        if (c17136.m40228(str) == null) {
            c17136.m40182(this);
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C19814 c19814 = (C19814) arrayList.get(size);
            if (!c19814.m45588().equals(str)) {
                if (C20519.m47005(c19814.m45588(), C17136.f52500)) {
                    c17136.m40182(this);
                    return false;
                }
            } else {
                c17136.m40215(str);
                if (!c17136.m2157(str)) {
                    c17136.m40182(this);
                }
                c17136.m40187(str);
                return true;
            }
        }
        return true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m29673(AbstractC2195 abstractC2195, C17136 c17136) {
        boolean z;
        C19814 c19814;
        abstractC2195.getClass();
        String str = ((C20540) abstractC2195).f26122;
        ArrayList arrayList = c17136.f2112;
        boolean z2 = false;
        int i = 0;
        while (i < 8) {
            C19814 m40205 = c17136.m40205(str);
            if (m40205 == null) {
                return m29674(abstractC2195, c17136);
            }
            if (!c17136.m40207(m40205)) {
                c17136.m40182(this);
                c17136.m40222(m40205);
                return true;
            }
            if (!c17136.m40200(m40205.m45588())) {
                c17136.m40182(this);
                return z2;
            }
            if (c17136.m2153() != m40205) {
                c17136.m40182(this);
            }
            int size = arrayList.size();
            boolean z3 = false;
            int i2 = -1;
            C19814 c198142 = null;
            for (int i3 = 1; i3 < size && i3 < 64; i3++) {
                c19814 = (C19814) arrayList.get(i3);
                if (c19814 == m40205) {
                    c198142 = (C19814) arrayList.get(i3 - 1);
                    i2 = c17136.m40227(c19814);
                    z3 = true;
                } else if (z3) {
                    z = true;
                    if (C20519.m47005(c19814.m45588(), C17136.f52500)) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            z = true;
            c19814 = null;
            if (c19814 != null) {
                C19814 c198143 = c19814;
                C19814 c198144 = c198143;
                for (int i4 = 0; i4 < 3; i4++) {
                    if (c17136.m40207(c198143)) {
                        c198143 = c17136.m40174(c198143);
                    }
                    if (c17136.m40218(c198143)) {
                        if (c198143 == m40205) {
                            break;
                        }
                        C19814 c198145 = new C19814(c17136.m2152(c198143.mo2915(), C1489.f5329), c17136.f2102, null);
                        c17136.m40181(c198143, c198145);
                        ArrayList arrayList2 = c17136.f2112;
                        int lastIndexOf = arrayList2.lastIndexOf(c198143);
                        C16990.m39825(lastIndexOf != -1);
                        arrayList2.set(lastIndexOf, c198145);
                        if (c198144 == c19814) {
                            i2 = c17136.m40227(c198145) + 1;
                        }
                        if (c198144.mo28099() != null) {
                            c198144.m28091();
                        }
                        c198145.m45584(c198144);
                        c198143 = c198145;
                        c198144 = c198143;
                    } else {
                        c17136.m40199(c198143);
                    }
                }
                if (c198142 != null) {
                    if (C20519.m47005(c198142.m45588(), C11492.f34342)) {
                        if (c198144.mo28099() != null) {
                            c198144.m28091();
                        }
                        c17136.m40177(c198144);
                    } else {
                        if (c198144.mo28099() != null) {
                            c198144.m28091();
                        }
                        c198142.m45584(c198144);
                    }
                }
                C19814 c198146 = new C19814(m40205.m45571(), c17136.f2102, null);
                c198146.mo25045().m36730(m40205.mo25045());
                c198146.m45562(-1, c19814.m28097());
                c19814.m45584(c198146);
                c17136.m40222(m40205);
                c17136.m40180(c198146, i2);
                c17136.m40199(m40205);
                int lastIndexOf2 = c17136.f2112.lastIndexOf(c19814);
                C16990.m39825(lastIndexOf2 != -1);
                c17136.f2112.add(lastIndexOf2 + 1, c198146);
                i++;
                z2 = false;
            } else {
                c17136.m40187(m40205.m45588());
                c17136.m40222(m40205);
                return z;
            }
        }
        return true;
    }
}
