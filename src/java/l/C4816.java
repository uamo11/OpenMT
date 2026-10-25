package l;

import android.text.Selection;
import android.view.View;

/* compiled from: G7PV */
/* renamed from: l.ۙᩳܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4816 extends C11146 {

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C20339 f15238 = new C20339();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f15239;

    @Override // l.C11146
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean mo14042() {
        return true;
    }

    public C4816(String str) {
        super(0);
        C11003.requireNonNull(str);
        this.f15239 = str;
    }

    @Override // l.C11146
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo14039() {
        return this.f15239;
    }

    @Override // l.C11146
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14041(View view, C10235 c10235) {
        int[] m14038 = m14038(c10235.m30436());
        if (m14038 != null) {
            c10235.mo25922(m14038[0], m14038[1]);
            return;
        }
        int m30444 = c10235.m30444();
        int m30448 = c10235.m30448();
        if (m30444 != m30448) {
            c10235.mo25919(m30448);
        }
    }

    @Override // l.C11146
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14040(View view, InterfaceC1973 interfaceC1973) {
        C12392 mo6482 = interfaceC1973.mo6482();
        if (mo6482 == null) {
            return;
        }
        int[] m14038 = m14038(mo6482.m30436());
        if (m14038 != null) {
            mo6482.mo25922(m14038[0], m14038[1]);
            mo6482.m30511();
        } else {
            int m30444 = mo6482.m30444();
            int m30448 = mo6482.m30448();
            if (m30444 != m30448) {
                mo6482.mo25919(m30448);
            }
        }
        mo6482.m30345(false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int[] m14038(InterfaceC7785 interfaceC7785) {
        StringBuilder sb = new StringBuilder();
        int selectionEnd = Selection.getSelectionEnd(interfaceC7785);
        int[] iArr = {Selection.getSelectionStart(interfaceC7785), selectionEnd};
        int i = iArr[0];
        if (i > selectionEnd) {
            iArr[0] = selectionEnd;
            iArr[1] = i;
        }
        InterfaceC15194 m1828 = C0378.m1828(this.f15239.toCharArray());
        int[] iArr2 = null;
        while (m1828.hasNext()) {
            char mo7691 = m1828.mo7691();
            if (mo7691 == '$' && m1828.hasNext()) {
                char mo76912 = m1828.mo7691();
                if (mo76912 == '$') {
                    sb.append('$');
                } else if (mo76912 != 'E') {
                    if (mo76912 == 'S') {
                        iArr2 = new int[]{sb.length(), sb.length()};
                    } else if (mo76912 == 'T') {
                        sb.append(interfaceC7785.subSequence(iArr[0], iArr[1]).toString());
                    }
                } else if (iArr2 != null) {
                    iArr2[1] = sb.length();
                } else {
                    iArr2 = new int[]{sb.length(), sb.length()};
                }
            } else {
                sb.append(mo7691);
            }
        }
        interfaceC7785.replace(iArr[0], iArr[1], sb.toString());
        if (iArr2 != null) {
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[0];
        }
        return iArr2;
    }
}
