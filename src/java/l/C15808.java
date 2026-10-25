package l;

/* compiled from: 37P4 */
/* renamed from: l.ܺ۠۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15808 extends AbstractC18632 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC18632
    /* renamed from: ֫ */
    public final void mo19151(InterfaceC8754 interfaceC8754, AbstractC9460 abstractC9460, AbstractC9460 abstractC94602, Object obj) {
        InterfaceC2404 interfaceC2404 = (InterfaceC2404) abstractC9460;
        InterfaceC2404 interfaceC24042 = (InterfaceC2404) abstractC94602;
        StringBuilder sb = (StringBuilder) obj;
        sb.append(interfaceC2404.hashCode() + " -> " + interfaceC24042.hashCode());
        sb.append(interfaceC2404.mo5712(interfaceC24042, interfaceC8754).toString().replaceAll(",", " ").replaceAll("\\{", "[").replaceAll("\\}", "]"));
        sb.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC18632
    /* renamed from: ֫ */
    public final void mo19152(AbstractC9460 abstractC9460, Object obj) {
        InterfaceC2404 interfaceC2404 = (InterfaceC2404) abstractC9460;
        StringBuilder sb = (StringBuilder) obj;
        sb.append(interfaceC2404.hashCode() + " ");
        sb.append(interfaceC2404.mo5711().toString().replaceAll(",", " ").replaceAll("\\{", "[").replaceAll("\\}", "]"));
        sb.append('\n');
    }
}
