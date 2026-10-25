package l;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* compiled from: D4IW */
/* renamed from: l.᩶ᩳۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20334 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C11459 f65644 = C11459.m28260("\\n *\\.(end +)?([afm][a-z]+)");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12392 f65645;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f65646;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence f65647;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20334 m46645(CharSequence charSequence) {
        return new C20334(charSequence);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004f, code lost:
    
        if (r4.equals("annotation") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C20334(java.lang.CharSequence r8) {
        /*
            r7 = this;
            r7.<init>()
            r7.f65647 = r8
            l.ۨۘܽ r0 = l.C20334.f65644
            l.۫ۘܽ r8 = r0.matcher(r8)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
        L10:
            boolean r1 = r8.find()
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L86
            int r1 = r8.start(r4)
            r4 = -1
            if (r1 == r4) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            java.lang.String r4 = r8.group(r5)
            r4.getClass()
            int r6 = r4.hashCode()
            switch(r6) {
                case -1555043537: goto L49;
                case -1077554975: goto L3e;
                case 97427706: goto L33;
                default: goto L32;
            }
        L32:
            goto L51
        L33:
            java.lang.String r3 = "field"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L3c
            goto L51
        L3c:
            r3 = 2
            goto L52
        L3e:
            java.lang.String r3 = "method"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L47
            goto L51
        L47:
            r3 = 1
            goto L52
        L49:
            java.lang.String r6 = "annotation"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L52
        L51:
            r3 = -1
        L52:
            switch(r3) {
                case 0: goto L79;
                case 1: goto L67;
                case 2: goto L56;
                default: goto L55;
            }
        L55:
            goto L10
        L56:
            l.᩹ᩳۢ r3 = new l.᩹ᩳۢ
            if (r1 == 0) goto L5b
            goto L5c
        L5b:
            r2 = 2
        L5c:
            int r1 = r8.start(r5)
            r3.<init>(r2, r1)
            r0.addFirst(r3)
            goto L10
        L67:
            l.᩹ᩳۢ r2 = new l.᩹ᩳۢ
            if (r1 == 0) goto L6d
            r1 = 5
            goto L6e
        L6d:
            r1 = 4
        L6e:
            int r3 = r8.start(r5)
            r2.<init>(r1, r3)
            r0.addFirst(r2)
            goto L10
        L79:
            l.᩹ᩳۢ r2 = new l.᩹ᩳۢ
            int r3 = r8.start(r5)
            r2.<init>(r1, r3)
            r0.addFirst(r2)
            goto L10
        L86:
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L90:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lbd
            java.lang.Object r3 = r0.next()
            l.᩹ᩳۢ r3 = (l.C22450) r3
            int r4 = r3.f72710
            if (r4 == r5) goto Lab
            if (r4 == r2) goto La6
            r8.addFirst(r3)
            goto L90
        La6:
            r8.addFirst(r3)
            r1 = 1
            goto L90
        Lab:
            if (r1 == 0) goto Laf
            r1 = 0
            goto Lb9
        Laf:
            l.᩹ᩳۢ r4 = new l.᩹ᩳۢ
            int r6 = r3.f72709
            r4.<init>(r2, r6)
            r8.addFirst(r4)
        Lb9:
            r8.addFirst(r3)
            goto L90
        Lbd:
            java.util.List r8 = l.C20195.unmodifiableList(r8)
            r7.f65646 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20334.<init>(java.lang.CharSequence):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46654(C12392 c12392) {
        this.f65645 = c12392;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46652(String str, int i, int i2, String str2) {
        C12164 matcher = C5517.f17080.matcher(this.f65647);
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        boolean z2 = false;
        for (C22450 c22450 : this.f65646) {
            int i6 = c22450.f72710;
            int i7 = c22450.f72709;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        i5++;
                        if (matcher.lookingAt(i7) && str.equals(matcher.m29597("name")) && str2.equals(matcher.m29597("type"))) {
                            i4 = matcher.start();
                            z = true;
                        }
                    } else if (i6 != 3) {
                        if (i6 == 4) {
                            i5++;
                        } else if (i6 != 5) {
                        }
                    } else if (z) {
                        z = false;
                    }
                } else if (z && z2 && i5 == 2) {
                    m46647(i2, i4, i7);
                    return;
                }
                i5--;
            } else {
                i5++;
                if (z && !z2 && i5 == 2) {
                    i3++;
                    if (i3 == i) {
                        z2 = true;
                    }
                    i4 = i7;
                }
            }
        }
        m46646(i4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46653(String str, int i, String str2, String str3, int i2) {
        C12164 matcher = C5517.f17081.matcher(this.f65647);
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        boolean z2 = false;
        for (C22450 c22450 : this.f65646) {
            int i6 = c22450.f72710;
            int i7 = c22450.f72709;
            if (i6 == 0) {
                i5++;
                if (z && !z2 && i5 == 2) {
                    i3++;
                    if (i3 == i) {
                        z2 = true;
                    }
                    i4 = i7;
                }
            } else if (i6 == 1) {
                if (z && z2 && i5 == 2) {
                    m46647(i2, i4, i7);
                    return;
                }
                i5--;
            } else if (i6 == 2) {
                i5++;
            } else if (i6 == 3) {
                i5--;
            } else if (i6 == 4) {
                i5++;
                if (matcher.lookingAt(i7)) {
                    if (str.equals(matcher.m29597("name"))) {
                        if (str2.equals(matcher.m29597("parameters"))) {
                            if (str3.equals(matcher.m29597("type"))) {
                                i4 = matcher.start();
                                z = true;
                            }
                        }
                    }
                }
            } else if (i6 == 5) {
                if (z) {
                    z = false;
                }
                i5--;
            }
        }
        m46646(i4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46651(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = -1;
        for (C22450 c22450 : this.f65646) {
            int i6 = c22450.f72710;
            int i7 = c22450.f72709;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 4) {
                                if (i6 != 5) {
                                }
                            }
                        }
                    }
                    i4++;
                } else if (z && i4 == 1) {
                    m46647(i2, i3, i7);
                    return;
                }
                i4--;
            } else {
                i4++;
                if (!z && i4 == 1) {
                    i5++;
                    if (i5 == i) {
                        z = true;
                    }
                    i3 = i7;
                }
            }
        }
        m46646(i3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46646(int i) {
        this.f65645.mo25919(i);
        this.f65645.invalidate();
        this.f65645.m30537();
        this.f65645.m30427(i, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m46648(int i, int i2) {
        this.f65645.mo25922(i, i2);
        this.f65645.invalidate();
        this.f65645.m30537();
        this.f65645.m30427(i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m46647(int r5, int r6, int r7) {
        /*
            r4 = this;
            l.ۤᩳۢ r0 = new l.ۤᩳۢ
            java.lang.CharSequence r1 = r4.f65647
            r0.<init>(r6, r7, r1)
            r6 = 61
            boolean r7 = r0.m26309(r6)
            if (r7 == 0) goto L13
            int r5 = r5 + (-1)
            if (r5 < 0) goto L3d
        L13:
            int r7 = r5 + (-1)
            if (r5 < 0) goto L3d
        L17:
            boolean r5 = r0.m26315()
            if (r5 != 0) goto L3b
            char r5 = r0.m26313()
            if (r5 != r6) goto L24
            goto L3b
        L24:
            r2 = 34
            r3 = 0
            if (r5 != r2) goto L30
            boolean r5 = r0.m26311()
            if (r5 != 0) goto L17
            goto L3e
        L30:
            r2 = 39
            if (r5 != r2) goto L17
            boolean r5 = r0.m26317()
            if (r5 != 0) goto L17
            goto L3e
        L3b:
            r5 = r7
            goto L13
        L3d:
            r3 = 1
        L3e:
            r0.m26310()
            if (r3 == 0) goto L5c
            int r5 = r0.m26312()
            int r6 = r0.m26312()
            l.ۤᩳۢ r7 = new l.ۤᩳۢ
            int r0 = r1.length()
            r7.<init>(r6, r0, r1)
            int r6 = r7.m26308()
            r4.m46648(r5, r6)
            return
        L5c:
            int r5 = r0.m26312()
            r4.m46646(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20334.m46647(int, int, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21745 m46650(String str, String str2, String str3) {
        C12164 matcher = C5517.f17081.matcher(this.f65647);
        for (C22450 c22450 : this.f65646) {
            if (c22450.f72710 == 4 && matcher.lookingAt(c22450.f72709) && str.equals(matcher.m29597("name")) && str2.equals(matcher.m29597("parameters")) && str3.equals(matcher.m29597("type"))) {
                return new C21745(matcher);
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] m46656(String str, String str2, String str3) {
        C11459 c11459 = C5517.f17081;
        CharSequence charSequence = this.f65647;
        C12164 matcher = c11459.matcher(charSequence);
        boolean z = true;
        int i = 0;
        for (C22450 c22450 : this.f65646) {
            if (z) {
                if (c22450.f72710 == 4 && matcher.lookingAt(c22450.f72709) && str.equals(matcher.m29597("name")) && str2.equals(matcher.m29597("parameters")) && str3.equals(matcher.m29597("type"))) {
                    i = matcher.end();
                    z = false;
                }
            } else if (c22450.f72710 == 5) {
                return new int[]{i + 1, TextUtils.lastIndexOf(charSequence, '\n', c22450.f72709)};
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46655(String str, int i, String str2, String str3, int i2) {
        int i3;
        char charAt;
        C11459 c11459 = C5517.f17081;
        CharSequence charSequence = this.f65647;
        C12164 matcher = c11459.matcher(charSequence);
        Iterator it = this.f65646.iterator();
        int i4 = -1;
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C22450 c22450 = (C22450) it.next();
            int i5 = c22450.f72710;
            int i6 = c22450.f72709;
            if (i5 == 4) {
                if (matcher.lookingAt(i6) && str.equals(matcher.m29597("name"))) {
                    if (str2.equals(matcher.m29597("parameters"))) {
                        if (str3.equals(matcher.m29597("type"))) {
                            i4 = matcher.end();
                            z = true;
                        }
                    }
                }
            } else if (!z) {
                continue;
            } else if (i5 == 5) {
                while (true) {
                    int i7 = i4 + 1;
                    if (i7 >= charSequence.length()) {
                        i4 = i7;
                        break;
                    }
                    char charAt2 = charSequence.charAt(i7);
                    if ((charAt2 == '\r' || charAt2 == '\n') && (i4 = i4 + 2) < charSequence.length() && ((charAt = charSequence.charAt(i4)) == '\r' || charAt == '\n')) {
                        break;
                    } else {
                        i4 = i7;
                    }
                }
            } else if (i5 == 0 || i5 == 1) {
                i4 = i6;
            }
        }
        if (i4 == -1) {
            return;
        }
        C10456 c10456 = new C10456(i4, charSequence.length(), charSequence);
        int i8 = i;
        while (!c10456.m26315()) {
            String m26318 = c10456.m26318();
            if (m26318.length() > 0 && !m26318.startsWith(":") && !m26318.startsWith("#") && !m26318.equals("nop")) {
                char charAt3 = m26318.charAt(0);
                if ('a' <= charAt3 && charAt3 <= 'z') {
                    i3 = i8 - 1;
                    if (i8 <= 0) {
                        break;
                    }
                    i8 = i3;
                } else if (charAt3 == '.' && (m26318.startsWith(".array-data") || m26318.startsWith(".packed-switch") || m26318.startsWith(".sparse-switch"))) {
                    i3 = i8 - 1;
                    if (i8 == 0) {
                        break;
                    }
                    i8 = i3;
                }
            }
        }
        int i9 = i2;
        while (!c10456.m26315() && i9 >= 0) {
            if (!c10456.m26318().isEmpty()) {
                i9--;
            }
        }
        int m26316 = c10456.m26316();
        int m26314 = c10456.m26314();
        C10456 c104562 = new C10456(m26316, m26314, charSequence);
        if (c104562.m26309('\"')) {
            int m26312 = c104562.m26312();
            if (c104562.m26311()) {
                m46648(m26312, c104562.m26312() - 1);
                return;
            }
        }
        m46648(m26316, m26314);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21745 m46649(String str, String str2) {
        C12164 matcher = C5517.f17080.matcher(this.f65647);
        for (C22450 c22450 : this.f65646) {
            if (c22450.f72710 == 2 && matcher.lookingAt(c22450.f72709) && str.equals(matcher.m29597("name")) && str2.equals(matcher.m29597("type"))) {
                return new C21745(matcher);
            }
        }
        return null;
    }
}
