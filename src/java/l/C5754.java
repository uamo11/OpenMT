package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: L58U */
/* renamed from: l.ۛ֫ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5754 extends BaseAdapter {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC22687 f17716;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C5754(AbstractDialogInterfaceOnClickListenerC22687 abstractDialogInterfaceOnClickListenerC22687) {
        this.f17716 = abstractDialogInterfaceOnClickListenerC22687;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List list;
        list = this.f17716.f73310;
        return list.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C11399 c11399;
        List list;
        int i2;
        AbstractActivityC3346 abstractActivityC3346;
        AbstractDialogInterfaceOnClickListenerC22687 abstractDialogInterfaceOnClickListenerC22687 = this.f17716;
        if (view == null) {
            abstractActivityC3346 = abstractDialogInterfaceOnClickListenerC22687.f73313;
            view = abstractActivityC3346.getLayoutInflater().inflate(R.layout.MT_Protector_res_0x7f0d0151, viewGroup, false);
            c11399 = new C11399(view);
            view.setTag(c11399);
        } else {
            c11399 = (C11399) view.getTag();
        }
        RadioButton radioButton = c11399.f34098;
        list = abstractDialogInterfaceOnClickListenerC22687.f73310;
        radioButton.setText(((C19866) list.get(i)).m45696());
        i2 = abstractDialogInterfaceOnClickListenerC22687.f73308;
        c11399.f34098.setChecked(i2 == i);
        return view;
    }
}
