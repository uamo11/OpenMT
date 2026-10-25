package l;

/* compiled from: 657B */
/* renamed from: l.ۚۙ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5134 extends AbstractC13591 {
    @Override // l.AbstractC10065
    /* renamed from: ܽ */
    public final void mo3226(AbstractC3255 abstractC3255) {
    }

    @Override // l.AbstractC10065
    /* renamed from: ֫ */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC32552) {
        int[] iArr;
        int[] iArr2;
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC32552.getBindingAdapterPosition();
        iArr = DialogInterfaceOnDismissListenerC15010.f45772;
        int[] iArr3 = (int[]) iArr.clone();
        iArr2 = DialogInterfaceOnDismissListenerC15010.f45772;
        int i = iArr2[bindingAdapterPosition];
        iArr2[bindingAdapterPosition] = iArr2[bindingAdapterPosition2];
        iArr2[bindingAdapterPosition2] = i;
        C20649.m47228(new C0194(iArr3)).m40148(c13132.getAdapter());
        return true;
    }
}
