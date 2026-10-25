package l;

/* compiled from: 17QI */
/* renamed from: l.ۤ֫ۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C9976 implements InterfaceC18842 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22267 f30090;

    @Override // l.InterfaceC18842
    public final boolean apply(Object obj) {
        InterfaceC15086 interfaceC15086 = (InterfaceC15086) obj;
        if (!this.f30090.mo3775(Integer.valueOf(interfaceC15086.getPosition()))) {
            String text = interfaceC15086.getText();
            text.getClass();
            switch (text) {
                case "volatile":
                case "synchronized":
                case "native":
                case "public":
                case "sealed":
                case "static":
                case "protected":
                case "private":
                case "-":
                case "non":
                case "final":
                case "transient":
                case "default":
                case "abstract":
                case "strictfp":
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
