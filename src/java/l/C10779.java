package l;

/* compiled from: T12U */
/* renamed from: l.ۧۙ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10779 extends AbstractC13591 {
    @Override // l.AbstractC10065
    /* renamed from: ܽ */
    public final void mo3226(AbstractC3255 abstractC3255) {
    }

    @Override // l.AbstractC10065
    /* renamed from: ֫ */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC32552) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int adapterPosition = abstractC3255.getAdapterPosition();
        int adapterPosition2 = abstractC32552.getAdapterPosition();
        iArr = DialogInterfaceOnDismissListenerC17128.f52477;
        int i = iArr[adapterPosition];
        if (adapterPosition > adapterPosition2) {
            iArr5 = DialogInterfaceOnDismissListenerC17128.f52477;
            iArr6 = DialogInterfaceOnDismissListenerC17128.f52477;
            System.arraycopy(iArr5, adapterPosition2, iArr6, adapterPosition2 + 1, adapterPosition - adapterPosition2);
        } else {
            iArr2 = DialogInterfaceOnDismissListenerC17128.f52477;
            iArr3 = DialogInterfaceOnDismissListenerC17128.f52477;
            System.arraycopy(iArr2, adapterPosition + 1, iArr3, adapterPosition, adapterPosition2 - adapterPosition);
        }
        iArr4 = DialogInterfaceOnDismissListenerC17128.f52477;
        iArr4[adapterPosition2] = i;
        c13132.getAdapter().notifyItemMoved(adapterPosition, adapterPosition2);
        return true;
    }
}
