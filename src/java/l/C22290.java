package l;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Iterator;
import java.util.List;

/* compiled from: 28WH */
/* renamed from: l.᩹۫ᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22290 implements TextWatcher {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f72294;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f72295;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7473 f72296;

    public C22290(C7473 c7473, boolean z) {
        this.f72296 = c7473;
        this.f72294 = z;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        List list;
        list = this.f72296.f23019;
        if (list == null || list.isEmpty() || i2 == 0) {
            return;
        }
        C7744 mo26556 = ((InterfaceC20445) charSequence).mo26556();
        if (i2 == 1) {
            int i4 = i + 1;
            try {
                if (i4 < mo26556.length() && mo26556.charAt(i) == '\n' && mo26556.charAt(i4) == '\n') {
                    i = i4;
                }
            } catch (Throwable th) {
                try {
                    mo26556.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        m50010(i, i2, list);
        int m20765 = mo26556.m20765(i);
        this.f72295 = m20765;
        int m207652 = mo26556.m20765(i + i2) - m20765;
        boolean z = this.f72294;
        if (m207652 > 0) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                InterfaceC0467 interfaceC0467 = (InterfaceC0467) list.get(i5);
                int mo2066 = interfaceC0467.mo2066(z);
                if (mo2066 > m20765) {
                    interfaceC0467.mo2069(Math.max(m20765, mo2066 - m207652), z);
                }
                int mo2070 = interfaceC0467.mo2070(z);
                if (mo2070 > m20765) {
                    interfaceC0467.mo2061(Math.max(m20765, mo2070 - m207652), z);
                }
            }
        }
        C19408.m44725(z, list, new C20880(mo26556, i, i2));
        mo26556.close();
        C6055.m16891(list, new C21585());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50010(int i, int i2, List list) {
        int i3 = i + i2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0467 interfaceC0467 = (InterfaceC0467) it.next();
            boolean z = this.f72294;
            int mo15478 = interfaceC0467.mo15478(z);
            int mo15483 = interfaceC0467.mo15483(z);
            List mo2067 = interfaceC0467.mo2067();
            if (i <= mo15478 && i3 >= mo15483) {
                it.remove();
            } else if (i3 <= mo15478) {
                interfaceC0467.mo15481(mo15478 - i2, z);
                interfaceC0467.mo15488(mo15483 - i2, z);
            } else if (i < mo15483) {
                if (i > mo15478 && i3 < mo15483) {
                    interfaceC0467.mo15488(mo15483 - i2, z);
                    if (mo2067 != null) {
                        m50012(i - mo15478, i2, mo2067);
                    }
                } else if (i <= mo15478) {
                    interfaceC0467.mo15481(i, z);
                    interfaceC0467.mo15488(mo15483 - i2, z);
                    if (mo2067 != null) {
                        m50012(0, i2 - (mo15478 - i), mo2067);
                    }
                } else {
                    interfaceC0467.mo15488(i, z);
                    if (mo2067 != null) {
                        m50012(i - mo15478, mo15483 - i, mo2067);
                    }
                }
            }
            if (mo2067 != null && mo2067.isEmpty()) {
                interfaceC0467.mo2062((List) null);
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m50012(int i, int i2, List list) {
        int i3 = i + i2;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            InterfaceC18813 interfaceC18813 = (InterfaceC18813) list.get(size);
            boolean z = this.f72294;
            int mo15478 = interfaceC18813.mo15478(z);
            int mo15483 = interfaceC18813.mo15483(z);
            if (mo15478 >= 0 && mo15483 >= 0) {
                if (i3 <= mo15478) {
                    interfaceC18813.mo15481(mo15478 - i2, z);
                    interfaceC18813.mo15488(mo15483 - i2, z);
                } else if (i < mo15483) {
                    if (i <= mo15478 && i3 >= mo15483) {
                        boolean z2 = !z;
                        if (interfaceC18813.mo15478(z2) == -1 && interfaceC18813.mo15483(z2) == -1) {
                            list.remove(size);
                        } else {
                            interfaceC18813.mo15481(-1, z);
                            interfaceC18813.mo15488(-1, z);
                        }
                    } else if (i > mo15478 && i3 < mo15483) {
                        interfaceC18813.mo15488(mo15483 - i2, z);
                    } else if (i <= mo15478) {
                        interfaceC18813.mo15481(i, z);
                        interfaceC18813.mo15488(mo15483 - i2, z);
                    } else {
                        interfaceC18813.mo15488(i, z);
                    }
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        List list;
        C6062 c6062;
        int i4;
        int i5;
        int i6;
        int i7;
        C6062 c60622;
        int i8;
        list = this.f72296.f23019;
        if (list == null) {
            return;
        }
        if (i3 > 0 && !list.isEmpty()) {
            C7744 mo26556 = ((InterfaceC20445) charSequence).mo26556();
            try {
                m50011(i, i3, list);
                int m20765 = i2 > 0 ? this.f72295 : mo26556.m20765(i);
                int m207652 = mo26556.m20765(i + i3) - mo26556.m20765(i);
                if (m207652 > 0) {
                    int size = list.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        InterfaceC0467 interfaceC0467 = (InterfaceC0467) list.get(i9);
                        int mo2066 = interfaceC0467.mo2066(this.f72294);
                        if (mo2066 > m20765) {
                            interfaceC0467.mo2069(mo2066 + m207652, this.f72294);
                        }
                        int mo2070 = interfaceC0467.mo2070(this.f72294);
                        if (mo2070 > m20765) {
                            interfaceC0467.mo2061(mo2070 + m207652, this.f72294);
                        }
                    }
                }
                C19408.m44725(this.f72294, list, mo26556);
                mo26556.close();
            } catch (Throwable th) {
                try {
                    mo26556.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        c6062 = this.f72296.f23029;
        boolean z = this.f72294;
        synchronized (c6062) {
            if (z) {
                i4 = c6062.f18575;
                i5 = c6062.f18574;
            } else {
                i4 = c6062.f18577;
                i5 = c6062.f18576;
            }
            if (i4 == -1 && i5 == -1) {
                i6 = i3 + i;
            } else {
                if (i < i4) {
                    i4 = i;
                }
                if (i2 > 0 && i < i5 && (i5 = i5 - i2) < i) {
                    i5 = i;
                }
                if (i3 > 0) {
                    i6 = i3 + Math.max(i, i5);
                    i = i4;
                } else {
                    i = i4;
                    i6 = i5;
                }
            }
            if (z) {
                c6062.f18575 = i;
                c6062.f18574 = i6;
            } else {
                c6062.f18577 = i;
                c6062.f18576 = i6;
            }
        }
        i7 = this.f72296.f23023;
        if (i7 == 0) {
            this.f72296.m20082(true);
            return;
        }
        c60622 = this.f72296.f23029;
        i8 = this.f72296.f23023;
        C1802.m5990(c60622, i8, new RunnableC15048(1, this));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m50011(int i, int i2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0467 interfaceC0467 = (InterfaceC0467) it.next();
            boolean z = this.f72294;
            int mo15478 = interfaceC0467.mo15478(z);
            int mo15483 = interfaceC0467.mo15483(z);
            if (i <= mo15478) {
                interfaceC0467.mo15481(mo15478 + i2, z);
                interfaceC0467.mo15488(mo15483 + i2, z);
            } else if (i < mo15483) {
                interfaceC0467.mo15488(mo15483 + i2, z);
                List<InterfaceC18813> mo2067 = interfaceC0467.mo2067();
                if (mo2067 != null) {
                    int i3 = i - mo15478;
                    for (InterfaceC18813 interfaceC18813 : mo2067) {
                        int mo154782 = interfaceC18813.mo15478(z);
                        int mo154832 = interfaceC18813.mo15483(z);
                        if (mo154782 >= 0 && mo154832 >= 0) {
                            if (i3 <= mo154782) {
                                interfaceC18813.mo15481(mo154782 + i2, z);
                                interfaceC18813.mo15488(mo154832 + i2, z);
                            } else if (i3 < mo154832) {
                                interfaceC18813.mo15488(mo154832 + i2, z);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f72296.invalidate();
    }
}
