package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: 28LT */
/* renamed from: l.ܿ᩵ۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17554 implements InterfaceC9773 {

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f53655 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18260 f53656;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f53657;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f53658;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f53660 = -3.4028235E38f;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f53661 = -3.4028235E38f;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17714 f53659 = new C17714();

    @Override // l.InterfaceC9773
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC9773
    /* renamed from: ֫ */
    public final /* synthetic */ InterfaceC13571 mo6617(int i, int i2, byte[] bArr) {
        return C14710.m35002(this, bArr, i2);
    }

    public C17554(List list) {
        if (list != null && !list.isEmpty()) {
            this.f53657 = true;
            String m11021 = C3603.m11021((byte[]) list.get(0));
            C22632.m50631(m11021.startsWith("Format:"));
            C18260 m42596 = C18260.m42596(m11021);
            m42596.getClass();
            this.f53656 = m42596;
            m41044(new C17714((byte[]) list.get(1)), StandardCharsets.UTF_8);
            return;
        }
        this.f53657 = false;
        this.f53656 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0209 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f6 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0280 A[LOOP:1: B:88:0x027e->B:89:0x0280, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0243  */
    @Override // l.InterfaceC9773
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6618(byte[] r25, int r26, int r27, l.C21062 r28, l.InterfaceC23483 r29) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17554.mo6618(byte[], int, int, l.᩷ᩴۧ, l.᩻ۚ֫):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41044(C17714 c17714, Charset charset) {
        while (true) {
            String m41474 = c17714.m41474(charset);
            if (m41474 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(m41474)) {
                while (true) {
                    String m414742 = c17714.m41474(charset);
                    if (m414742 != null && (c17714.m41457() == 0 || c17714.m41458(charset) != 91)) {
                        String[] split = m414742.split(":");
                        if (split.length == 2) {
                            String m35799 = C15107.m35799(split[0].trim());
                            m35799.getClass();
                            if (m35799.equals("playresx")) {
                                this.f53660 = Float.parseFloat(split[1].trim());
                            } else if (m35799.equals("playresy")) {
                                try {
                                    this.f53661 = Float.parseFloat(split[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
            } else if (!"[V4+ Styles]".equalsIgnoreCase(m41474)) {
                if ("[V4 Styles]".equalsIgnoreCase(m41474)) {
                    C19956.m46035("[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(m41474)) {
                    return;
                }
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C14731 c14731 = null;
                while (true) {
                    String m414743 = c17714.m41474(charset);
                    if (m414743 == null || (c17714.m41457() != 0 && c17714.m41458(charset) == 91)) {
                        break;
                    }
                    if (m414743.startsWith("Format:")) {
                        c14731 = C14731.m35039(m414743);
                    } else if (m414743.startsWith("Style:")) {
                        if (c14731 == null) {
                            C19956.m46037("Skipping 'Style:' line before 'Format:' line: ".concat(m414743));
                        } else {
                            C6971 m18845 = C6971.m18845(m414743, c14731);
                            if (m18845 != null) {
                                linkedHashMap.put(m18845.f21492, m18845);
                            }
                        }
                    }
                }
                this.f53658 = linkedHashMap;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m41043(String str) {
        Matcher matcher = f53655.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = C3603.f11424;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m41042(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }
}
