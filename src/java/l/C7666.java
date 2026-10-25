package l;

import java.util.ArrayList;
import java.util.List;

/* compiled from: W92O */
/* renamed from: l.۟᩵֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7666 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public StringBuilder f23664;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f23665;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public StringBuilder f23667;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public char f23670;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EnumC14015 f23671 = EnumC14015.START_DEFINITION;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23669 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f23663 = new ArrayList();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23666 = new ArrayList();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f23668 = false;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20471(C16300 c16300) {
        ArrayList arrayList = this.f23669;
        arrayList.add(c16300);
        if (this.f23671 == EnumC14015.PARAGRAPH) {
            return;
        }
        C17712 c17712 = new C17712();
        c17712.m41445(c16300);
        C9246 m23714 = C9246.m23714(c17712);
        while (m23714.m23720()) {
            int ordinal = this.f23671.ordinal();
            if (ordinal == 0) {
                m20468();
                m23714.m23729();
                if (!m23714.m23726('[')) {
                    this.f23671 = EnumC14015.PARAGRAPH;
                    m20468();
                    return;
                } else {
                    this.f23671 = EnumC14015.LABEL;
                    this.f23667 = new StringBuilder();
                    if (!m23714.m23720()) {
                        this.f23667.append('\n');
                    }
                }
            } else {
                if (ordinal == 1) {
                    C20535 m23724 = m23714.m23724();
                    if (C7746.m20777(m23714)) {
                        this.f23667.append(m23714.m23718(m23724, m23714.m23724()).m41444());
                        if (!m23714.m23720()) {
                            this.f23667.append('\n');
                        } else if (m23714.m23726(']') && m23714.m23726(':') && this.f23667.length() <= 999 && !C12047.m29419(this.f23667.toString()).isEmpty()) {
                            this.f23671 = EnumC14015.DESTINATION;
                            m23714.m23729();
                        }
                    }
                    this.f23671 = EnumC14015.PARAGRAPH;
                    m20468();
                    return;
                }
                if (ordinal == 2) {
                    m23714.m23729();
                    C20535 m237242 = m23714.m23724();
                    if (C7746.m20775(m23714)) {
                        String m41444 = m23714.m23718(m237242, m23714.m23724()).m41444();
                        if (m41444.startsWith("<")) {
                            m41444 = C15472.m36561(1, 1, m41444);
                        }
                        this.f23665 = m41444;
                        int m23729 = m23714.m23729();
                        if (!m23714.m23720()) {
                            this.f23668 = true;
                            arrayList.clear();
                        } else if (m23729 == 0) {
                        }
                        this.f23671 = EnumC14015.START_TITLE;
                    }
                    this.f23671 = EnumC14015.PARAGRAPH;
                    m20468();
                    return;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new IllegalStateException("Unknown parsing state: " + this.f23671);
                    }
                    C20535 m237243 = m23714.m23724();
                    if (C7746.m20776(m23714, this.f23670)) {
                        this.f23664.append(m23714.m23718(m237243, m23714.m23724()).m41444());
                        if (m23714.m23720()) {
                            m23714.m23723();
                            m23714.m23729();
                            if (m23714.m23720()) {
                                this.f23664 = null;
                            } else {
                                this.f23668 = true;
                                arrayList.clear();
                                this.f23671 = EnumC14015.START_DEFINITION;
                            }
                        } else {
                            this.f23664.append('\n');
                        }
                    } else {
                        this.f23664 = null;
                    }
                    this.f23671 = EnumC14015.PARAGRAPH;
                    m20468();
                    return;
                }
                m23714.m23729();
                if (m23714.m23720()) {
                    this.f23670 = (char) 0;
                    char m23725 = m23714.m23725();
                    if (m23725 == '\"' || m23725 == '\'') {
                        this.f23670 = m23725;
                    } else if (m23725 == '(') {
                        this.f23670 = ')';
                    }
                    if (this.f23670 != 0) {
                        this.f23671 = EnumC14015.TITLE;
                        this.f23664 = new StringBuilder();
                        m23714.m23723();
                        if (!m23714.m23720()) {
                            this.f23664.append('\n');
                        }
                    } else {
                        this.f23671 = EnumC14015.START_DEFINITION;
                    }
                } else {
                    this.f23671 = EnumC14015.START_DEFINITION;
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20472(C19954 c19954) {
        this.f23666.add(c19954);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17712 m20473() {
        return C17712.m41443(this.f23669);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m20474() {
        return this.f23666;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m20469() {
        m20468();
        return this.f23663;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m20470(int i) {
        ArrayList arrayList = this.f23666;
        List unmodifiableList = C20195.unmodifiableList(new ArrayList(arrayList.subList(Math.max(arrayList.size() - i, 0), arrayList.size())));
        ArrayList arrayList2 = this.f23669;
        if (i >= arrayList2.size()) {
            arrayList2.clear();
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.remove(arrayList2.size() - 1);
            }
        }
        if (i >= arrayList.size()) {
            arrayList.clear();
            return unmodifiableList;
        }
        for (int i3 = 0; i3 < i; i3++) {
            arrayList.remove(arrayList.size() - 1);
        }
        return unmodifiableList;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m20468() {
        if (this.f23668) {
            String m29420 = C12047.m29420(this.f23665);
            StringBuilder sb = this.f23664;
            C3726 c3726 = new C3726(this.f23667.toString(), m29420, sb != null ? C12047.m29420(sb.toString()) : null);
            ArrayList arrayList = this.f23666;
            c3726.m1342(arrayList);
            arrayList.clear();
            this.f23663.add(c3726);
            this.f23667 = null;
            this.f23668 = false;
            this.f23665 = null;
            this.f23664 = null;
        }
    }
}
