package l;

import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: 998H */
/* renamed from: l.᩸۠ۢ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21456 extends AbstractC10065 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20956 f69079;

    @Override // l.AbstractC10065
    /* renamed from: ֫ */
    public final float mo25260() {
        return 0.35f;
    }

    @Override // l.AbstractC10065
    /* renamed from: ֫ */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC32552) {
        return false;
    }

    public C21456(C20956 c20956) {
        this.f69079 = c20956;
    }

    @Override // l.AbstractC10065
    /* renamed from: ۧ */
    public final int mo3224(AbstractC3255 abstractC3255) {
        List list;
        List list2;
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        C20956 c20956 = this.f69079;
        list = c20956.f67727;
        if (bindingAdapterPosition >= 0 && bindingAdapterPosition < ((ArrayList) list).size()) {
            list2 = c20956.f67727;
            if (((AbstractC3817) ((ArrayList) list2).get(bindingAdapterPosition)).m11516()) {
                return AbstractC10065.m25259(0, 4);
            }
        }
        return 0;
    }

    @Override // l.AbstractC10065
    /* renamed from: ܽ */
    public final void mo3226(AbstractC3255 abstractC3255) {
        List list;
        C20045 c20045;
        List list2;
        C20045 c200452;
        List list3;
        C20045 c200453;
        C20045 c200454;
        TextView textView;
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        C20956 c20956 = this.f69079;
        list = c20956.f67727;
        if (bindingAdapterPosition < 0 || bindingAdapterPosition >= ((ArrayList) list).size()) {
            c20045 = c20956.f67725;
            c20045.notifyDataSetChanged();
            return;
        }
        list2 = c20956.f67727;
        if (C15104.m35794((AbstractC3817) ((ArrayList) list2).get(bindingAdapterPosition))) {
            list3 = c20956.f67727;
            ((ArrayList) list3).remove(bindingAdapterPosition);
            c200453 = c20956.f67725;
            c200453.notifyItemRemoved(bindingAdapterPosition);
            c200454 = c20956.f67725;
            if (c200454.getItemCount() == 0) {
                textView = c20956.f67726;
                textView.setVisibility(0);
                return;
            }
            return;
        }
        c200452 = c20956.f67725;
        c200452.notifyItemChanged(bindingAdapterPosition);
    }

    @Override // l.AbstractC10065
    /* renamed from: ֫ */
    public final void mo25262(Canvas canvas, C13132 c13132, AbstractC3255 abstractC3255, float f, float f2, int i, boolean z) {
        if (i == 1) {
            View view = abstractC3255.itemView;
            float abs = 1.0f - (Math.abs(f) / (view.getWidth() / 3.0f));
            if (abs < 0.0f) {
                abs = 0.0f;
            }
            view.setAlpha(abs);
        }
        super.mo25262(canvas, c13132, abstractC3255, f, f2, i, z);
    }
}
