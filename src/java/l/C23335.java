package l;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* compiled from: 88WZ */
/* renamed from: l.᩻֡֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23335 implements InterfaceC0072 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char f74993;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f74994 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public LinkedList f74995 = new LinkedList();

    public C23335(char c) {
        this.f74993 = c;
    }

    @Override // l.InterfaceC0072
    /* renamed from: ܽ */
    public final char mo1023() {
        return this.f74993;
    }

    @Override // l.InterfaceC0072
    /* renamed from: ֫ */
    public final char mo1020() {
        return this.f74993;
    }

    @Override // l.InterfaceC0072
    /* renamed from: ۧ */
    public final int mo1022() {
        return this.f74994;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51737(InterfaceC0072 interfaceC0072) {
        int mo1022 = interfaceC0072.mo1022();
        LinkedList linkedList = this.f74995;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            InterfaceC0072 interfaceC00722 = (InterfaceC0072) listIterator.next();
            int mo10222 = interfaceC00722.mo1022();
            if (mo1022 > mo10222) {
                listIterator.previous();
                listIterator.add(interfaceC0072);
                return;
            } else if (mo1022 == mo10222) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f74993 + "' and minimum length " + mo1022 + "; conflicting processors: " + interfaceC00722 + ", " + interfaceC0072);
            }
        }
        linkedList.add(interfaceC0072);
        this.f74994 = mo1022;
    }

    @Override // l.InterfaceC0072
    /* renamed from: ֫ */
    public final int mo1021(C16132 c16132, C16132 c161322) {
        InterfaceC0072 interfaceC0072;
        int size = c16132.f49701.size();
        LinkedList linkedList = this.f74995;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                interfaceC0072 = (InterfaceC0072) it.next();
                if (interfaceC0072.mo1022() <= size) {
                    break;
                }
            } else {
                interfaceC0072 = (InterfaceC0072) linkedList.getFirst();
                break;
            }
        }
        return interfaceC0072.mo1021(c16132, c161322);
    }
}
