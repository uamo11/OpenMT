package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: P676 */
/* renamed from: l.۟᩹ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7763 extends BaseAdapter {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Bitmap f23997;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f23998;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f23999;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Bitmap f24000;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Bitmap f24001;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Bitmap f24002;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Bitmap f24003;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Bitmap f24004;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C7763(ActivityC21107 activityC21107) {
        AbstractC21294[] abstractC21294Arr;
        AbstractC21294[] abstractC21294Arr2;
        this.f23999 = activityC21107;
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        int m27878 = C11266.m27878(32.0f);
        int m278782 = C11266.m27878(16.0f);
        int m278783 = C11266.m27878(15.0f);
        paint.setStyle(Paint.Style.FILL);
        if (C21943.f70270) {
            paint.setShadowLayer(2.5f, 1.0f, 1.0f, 1342177280);
        }
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(Typeface.MONOSPACE);
        paint2.setTextSize(C11266.m27880(20.0f));
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        float f3 = m278783;
        float f4 = (f3 - f2) - ((f - f2) / 2.0f);
        String[] strArr = {"C", "S", "I", "F", "M", "J"};
        Bitmap[] bitmapArr = new Bitmap[6];
        int i = 0;
        for (int i2 = 6; i < i2; i2 = 6) {
            abstractC21294Arr = activityC21107.f68090;
            paint.setColor(abstractC21294Arr[i].mo7429());
            abstractC21294Arr2 = activityC21107.f68090;
            paint2.setColor(abstractC21294Arr2[i].mo7430());
            Bitmap createBitmap = Bitmap.createBitmap(m27878, m27878, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            float f5 = m278782;
            canvas.drawCircle(f5, f5, f3, paint);
            canvas.drawText(strArr[i], f5, f4, paint2);
            bitmapArr[i] = createBitmap;
            i++;
        }
        this.f24003 = bitmapArr[0];
        this.f24000 = bitmapArr[1];
        this.f24004 = bitmapArr[2];
        this.f24002 = bitmapArr[3];
        this.f24001 = bitmapArr[4];
        this.f23997 = bitmapArr[5];
        AbstractC21294 abstractC21294 = C19883.f64184;
        paint.setColor(abstractC21294.mo7429());
        this.f23998 = Bitmap.createBitmap(m27878, m27878, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(this.f23998);
        float f6 = m278782;
        canvas2.drawCircle(f6, f6, f3, paint);
        Drawable m14305 = C4925.m14305(R.drawable.MT_Protector_res_0x7f080121);
        int i3 = (m27878 - m278782) / 2;
        int i4 = m278782 + i3;
        m14305.setBounds(i3, i3, i4, i4);
        m14305.setTint(abstractC21294.mo7430());
        m14305.draw(canvas2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C18284 c18284;
        C18284 c182842;
        C18284 c182843;
        C18284 c182844;
        C18284 c182845;
        C18284 c182846;
        C18284 c182847;
        C18284 c182848;
        C18284 c182849;
        C18284 c1828410;
        C18284 c1828411;
        C18284 c1828412;
        ActivityC21107 activityC21107 = this.f23999;
        c18284 = activityC21107.f68093;
        switch (C15523.f47451[c18284.m42621().ordinal()]) {
            case 1:
                return 2;
            case 2:
                c182842 = activityC21107.f68093;
                if (c182842.f56843 == null) {
                    return 0;
                }
                c182843 = activityC21107.f68093;
                int size = c182843.f56843.f77603.size();
                c182844 = activityC21107.f68093;
                return c182844.f56843.f77604.size() + size;
            case 3:
                c182845 = activityC21107.f68093;
                return ((C0644) c182845.f56846.peek()).f2492.size();
            case 4:
                return 4;
            case 5:
                c182846 = activityC21107.f68093;
                int size2 = c182846.f56852.size();
                c182847 = activityC21107.f68093;
                return c182847.f56850.size() + size2;
            case 6:
                c182848 = activityC21107.f68093;
                return ((C0644) c182848.f56854.peek()).f2492.size();
            case 7:
                c182849 = activityC21107.f68093;
                boolean z = c182849.f56830;
                c1828410 = activityC21107.f68093;
                return z ? c1828410.f56845 : c1828410.f56839.length;
            case 8:
                c1828411 = activityC21107.f68093;
                int size3 = c1828411.f56836.size();
                c1828412 = activityC21107.f68093;
                return c1828412.f56835.size() + size3;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C18284 c18284;
        C18284 c182842;
        C18284 c182843;
        C18284 c182844;
        C18284 c182845;
        C18284 c182846;
        C18284 c182847;
        C18284 c182848;
        ArrayList arrayList;
        C18284 c182849;
        C18284 c1828410;
        C18284 c1828411;
        C18284 c1828412;
        C18284 c1828413;
        C18284 c1828414;
        C18284 c1828415;
        C18284 c1828416;
        ArrayList arrayList2;
        C18284 c1828417;
        C18284 c1828418;
        ActivityC21107 activityC21107 = this.f23999;
        View view2 = view;
        if (view == null) {
            View inflate = activityC21107.getLayoutInflater().inflate(R.layout.MT_Protector_res_0x7f0d014f, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.textView1);
            inflate.setTag(findViewById);
            View findViewById2 = inflate.findViewById(R.id.icon);
            findViewById.setTag(findViewById2);
            findViewById2.setTag(inflate.findViewById(R.id.textView2));
            view2 = inflate;
        }
        TextView textView = (TextView) view2.getTag();
        ImageView imageView = (ImageView) textView.getTag();
        TextView textView2 = (TextView) imageView.getTag();
        imageView.setVisibility(0);
        textView2.setVisibility(8);
        c18284 = activityC21107.f68093;
        switch (C15523.f47451[c18284.m42621().ordinal()]) {
            case 1:
                if (i == 0) {
                    textView.setText(R.string.MT_Protector_res_0x7f120170);
                    imageView.setImageBitmap(this.f24003);
                } else if (i == 1) {
                    textView.setText(R.string.MT_Protector_res_0x7f120a00);
                    imageView.setImageBitmap(this.f24000);
                    return view2;
                }
                return view2;
            case 2:
                c182842 = activityC21107.f68093;
                if (i < c182842.f56843.f77603.size()) {
                    c182845 = activityC21107.f68093;
                    textView.setText(((C23928) c182845.f56843.f77603.get(i)).f77602);
                    imageView.setImageBitmap(this.f23998);
                    return view2;
                }
                c182843 = activityC21107.f68093;
                int size = i - c182843.f56843.f77603.size();
                c182844 = activityC21107.f68093;
                textView.setText((CharSequence) c182844.f56843.f77604.get(size));
                imageView.setImageBitmap(this.f24003);
                return view2;
            case 3:
                c182846 = activityC21107.f68093;
                String m50835 = ((C11258) ((C0644) c182846.f56846.peek()).f2492.get(i)).m27862().m50835();
                textView.setText(m50835.substring(1, m50835.length() - 1));
                imageView.setImageBitmap(this.f24003);
                return view2;
            case 4:
                if (i == 0) {
                    textView.setText(R.string.MT_Protector_res_0x7f12016f);
                    imageView.setImageBitmap(this.f24004);
                    return view2;
                }
                if (i == 1) {
                    textView.setText(R.string.MT_Protector_res_0x7f120389);
                    imageView.setImageBitmap(this.f24002);
                    return view2;
                }
                if (i == 2) {
                    textView.setText(R.string.MT_Protector_res_0x7f12061c);
                    imageView.setImageBitmap(this.f24001);
                    return view2;
                }
                if (i == 3) {
                    textView.setText(R.string.MT_Protector_res_0x7f12022e);
                    imageView.setImageBitmap(this.f23997);
                    return view2;
                }
                return view2;
            case 5:
                textView2.setVisibility(0);
                c182847 = activityC21107.f68093;
                if (i >= c182847.f56852.size()) {
                    c182849 = activityC21107.f68093;
                    arrayList = c182849.f56850;
                    c1828410 = activityC21107.f68093;
                    i -= c1828410.f56852.size();
                } else {
                    c182848 = activityC21107.f68093;
                    arrayList = c182848.f56852;
                }
                C13889 c13889 = (C13889) arrayList.get(i);
                textView.setText(c13889.f41402.f70681.m28273());
                textView2.setText(c13889.f41402.f70680.m31312());
                imageView.setImageBitmap(this.f24001);
                return view2;
            case 6:
                textView2.setVisibility(0);
                c1828411 = activityC21107.f68093;
                C13889 c138892 = (C13889) ((C0644) c1828411.f56854.peek()).f2492.get(i);
                textView.setText(c138892.f41402.f70681.m28273());
                textView2.setText(c138892.f41402.f70680.m31312());
                imageView.setImageBitmap(this.f24001);
                return view2;
            case 7:
                c1828412 = activityC21107.f68093;
                C11467[] c11467Arr = c1828412.f56839;
                c1828413 = activityC21107.f68093;
                if (c1828413.f56830) {
                    c1828414 = activityC21107.f68093;
                    i = c1828414.f56853[i];
                }
                textView.setText(c11467Arr[i].m28273());
                imageView.setVisibility(8);
                return view2;
            case 8:
                textView2.setVisibility(0);
                c1828415 = activityC21107.f68093;
                if (i >= c1828415.f56836.size()) {
                    c1828417 = activityC21107.f68093;
                    arrayList2 = c1828417.f56835;
                    c1828418 = activityC21107.f68093;
                    i -= c1828418.f56836.size();
                } else {
                    c1828416 = activityC21107.f68093;
                    arrayList2 = c1828416.f56836;
                }
                C23062 c23062 = (C23062) arrayList2.get(i);
                textView.setText(c23062.f74187.f57398.m28273());
                textView2.setText(c23062.f74187.f57397.m50835());
                imageView.setImageBitmap(this.f24002);
                return view2;
            default:
                return view2;
        }
    }
}
