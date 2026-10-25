package l;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* compiled from: SBMC */
/* renamed from: l.᩸ܿۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21724 extends BaseAdapter {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f69686;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC20313 f69687;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C21724(ViewOnClickListenerC20313 viewOnClickListenerC20313) {
        this.f69687 = viewOnClickListenerC20313;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49051(String str) {
        this.f69686 = str;
        m49050();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49050() {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        List list9;
        List<C9545> list10;
        List list11;
        List list12;
        String str = this.f69686;
        ViewOnClickListenerC20313 viewOnClickListenerC20313 = this.f69687;
        if (str == null || str.isEmpty()) {
            list = viewOnClickListenerC20313.f65604;
            ((ArrayList) list).clear();
            list2 = viewOnClickListenerC20313.f65604;
            list3 = viewOnClickListenerC20313.f65594;
            ((ArrayList) list2).addAll(list3);
            list4 = viewOnClickListenerC20313.f65597;
            ((ArrayList) list4).clear();
            list5 = viewOnClickListenerC20313.f65597;
            list6 = viewOnClickListenerC20313.f65586;
            ((ArrayList) list5).addAll(list6);
            notifyDataSetChanged();
            return;
        }
        list7 = viewOnClickListenerC20313.f65597;
        ((ArrayList) list7).clear();
        list8 = viewOnClickListenerC20313.f65604;
        ((ArrayList) list8).clear();
        try {
            String str2 = this.f69686;
            list9 = viewOnClickListenerC20313.f65586;
            for (Object obj : list9) {
                if (ViewOnClickListenerC20313.m46567(viewOnClickListenerC20313, obj, str2)) {
                    list12 = viewOnClickListenerC20313.f65597;
                    ((ArrayList) list12).add(obj);
                }
            }
            list10 = viewOnClickListenerC20313.f65594;
            for (C9545 c9545 : list10) {
                if (C9679.m24616((CharSequence) c9545.m24417(), (CharSequence) str2)) {
                    list11 = viewOnClickListenerC20313.f65604;
                    ((ArrayList) list11).add(c9545);
                }
            }
        } catch (ConcurrentModificationException unused) {
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        boolean z;
        ViewOnClickListenerC20313 viewOnClickListenerC20313 = this.f69687;
        z = viewOnClickListenerC20313.f65596;
        return ((ArrayList) (z ? viewOnClickListenerC20313.f65604 : viewOnClickListenerC20313.f65597)).size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        boolean z;
        ViewOnClickListenerC20313 viewOnClickListenerC20313 = this.f69687;
        z = viewOnClickListenerC20313.f65596;
        return ((ArrayList) (z ? viewOnClickListenerC20313.f65604 : viewOnClickListenerC20313.f65597)).get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C22429 c22429;
        boolean z;
        List list;
        AbstractC2489 abstractC2489;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        ListView listView;
        List list2;
        C9545 c9545;
        Bitmap bitmap4;
        if (view != null) {
            c22429 = (C22429) view.getTag();
        } else {
            view = C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d0150, viewGroup, false);
            c22429 = new C22429();
            c22429.f72675 = (TextView) view.findViewById(R.id.textView);
            c22429.f72673 = (TextView) view.findViewById(R.id.textView2);
            c22429.f72674 = (ImageView) view.findViewById(R.id.icon);
            view.setTag(c22429);
        }
        ViewOnClickListenerC20313 viewOnClickListenerC20313 = this.f69687;
        z = viewOnClickListenerC20313.f65596;
        if (z) {
            list2 = viewOnClickListenerC20313.f65604;
            C9545 c95452 = (C9545) ((ArrayList) list2).get(i);
            c9545 = viewOnClickListenerC20313.f65590;
            if (c95452 == c9545) {
                view.setBackgroundColor(C21943.f70286);
            } else {
                view.setBackgroundColor(0);
            }
            ImageView imageView = c22429.f72674;
            bitmap4 = viewOnClickListenerC20313.f65584;
            imageView.setImageBitmap(bitmap4);
            c22429.f72675.setText(C6554.m18061(200, c95452.m24417().replace('\n', ' ').replace('\r', ' ')));
            c22429.f72675.setSingleLine(false);
            c22429.f72673.setVisibility(8);
        } else {
            list = viewOnClickListenerC20313.f65597;
            Object obj = ((ArrayList) list).get(i);
            abstractC2489 = viewOnClickListenerC20313.f65598;
            if (obj == abstractC2489.mo7979()) {
                view.setBackgroundColor(C21943.f70286);
            } else {
                view.setBackgroundColor(0);
            }
            c22429.f72675.setSingleLine(true);
            c22429.f72673.setVisibility(0);
            if (obj instanceof C8839) {
                C8839 c8839 = (C8839) obj;
                ImageView imageView2 = c22429.f72674;
                bitmap3 = viewOnClickListenerC20313.f65591;
                imageView2.setImageBitmap(bitmap3);
                c22429.f72675.setText(C6554.m18061(100, c8839.m22833()));
                c22429.f72673.setText(C6554.m18061(200, c8839.m22835()));
            } else if (obj instanceof C14482) {
                C14482 c14482 = (C14482) obj;
                ImageView imageView3 = c22429.f72674;
                bitmap2 = viewOnClickListenerC20313.f65595;
                imageView3.setImageBitmap(bitmap2);
                c22429.f72675.setText(C6554.m18061(100, c14482.m34581()));
                c22429.f72673.setText(C6554.m18061(200, c14482.m34576()));
            } else {
                C23655 c23655 = (C23655) obj;
                ImageView imageView4 = c22429.f72674;
                bitmap = viewOnClickListenerC20313.f65589;
                imageView4.setImageBitmap(bitmap);
                c22429.f72675.setText(C6554.m18061(100, c23655.m52181()));
                c22429.f72673.setText(C6554.m18061(200, c23655.m52178()));
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        listView = viewOnClickListenerC20313.f65599;
        int width = listView.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
