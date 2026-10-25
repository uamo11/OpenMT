package l;

import java.util.ArrayList;
import java.util.List;

/* compiled from: Y660 */
/* renamed from: l.ۖܿ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC2665 implements InterfaceC22420 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f8370;

    @Override // l.InterfaceC22420
    public int getLine() {
        return 0;
    }

    @Override // l.InterfaceC22420
    public InterfaceC22420 getParent() {
        return null;
    }

    @Override // l.InterfaceC22420
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo8349() {
        return 0;
    }

    @Override // l.InterfaceC22420
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int mo8352() {
        return 0;
    }

    @Override // l.InterfaceC22420
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo8353(InterfaceC22420 interfaceC22420) {
    }

    @Override // l.InterfaceC22420
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo8354(int i) {
    }

    @Override // l.InterfaceC22420
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean mo8355() {
        return false;
    }

    @Override // l.InterfaceC22420
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC22420 mo8350(int i) {
        List list = this.f8370;
        if (list == null || i >= list.size()) {
            return null;
        }
        return (InterfaceC22420) this.f8370.get(i);
    }

    @Override // l.InterfaceC22420
    public final int getChildCount() {
        List list = this.f8370;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // l.InterfaceC22420
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8351(InterfaceC22420 interfaceC22420) {
        if (interfaceC22420 == null) {
            return;
        }
        AbstractC2665 abstractC2665 = (AbstractC2665) interfaceC22420;
        if (abstractC2665.mo8355()) {
            List list = this.f8370;
            if (list != null && list == abstractC2665.f8370) {
                throw new RuntimeException("attempt to add child list to itself");
            }
            List list2 = abstractC2665.f8370;
            if (list2 != null) {
                int i = 0;
                if (list != null) {
                    int size = list2.size();
                    while (i < size) {
                        InterfaceC22420 interfaceC224202 = (InterfaceC22420) abstractC2665.f8370.get(i);
                        this.f8370.add(interfaceC224202);
                        interfaceC224202.mo8353(this);
                        interfaceC224202.mo8354(this.f8370.size() - 1);
                        i++;
                    }
                    return;
                }
                this.f8370 = list2;
                int childCount = getChildCount();
                while (i < childCount) {
                    InterfaceC22420 mo8350 = mo8350(i);
                    mo8350.mo8354(i);
                    mo8350.mo8353(this);
                    i++;
                }
                return;
            }
            return;
        }
        if (this.f8370 == null) {
            this.f8370 = new ArrayList();
        }
        this.f8370.add(interfaceC22420);
        abstractC2665.mo8353(this);
        abstractC2665.mo8354(this.f8370.size() - 1);
    }
}
