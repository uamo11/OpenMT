package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.UMConfigure;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* compiled from: SBMC */
/* renamed from: l.᩶ܿۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC20313 implements AdapterView.OnItemClickListener, View.OnClickListener, AdapterView.OnItemLongClickListener {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public Bitmap f65584;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public List f65585;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f65586;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f65587;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public C3764 f65588;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Bitmap f65589;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9545 f65590;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public Bitmap f65591;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C12392 f65592;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f65593;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f65594;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Bitmap f65595;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f65596;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f65597;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public AbstractC2489 f65598;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public ListView f65599;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f65600;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ActivityC17169 f65601;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C21724 f65602;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC14346 f65603;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f65604;

    public ViewOnClickListenerC20313(AbstractC14346 abstractC14346, C12392 c12392, AbstractC2489 abstractC2489) {
        List list = Collections.EMPTY_LIST;
        this.f65593 = list;
        this.f65600 = list;
        this.f65585 = list;
        this.f65586 = list;
        this.f65594 = list;
        this.f65597 = new ArrayList();
        this.f65604 = new ArrayList();
        this.f65596 = false;
        ActivityC17169 activityC17169 = (ActivityC17169) abstractC14346.requireActivity();
        this.f65601 = activityC17169;
        this.f65603 = abstractC14346;
        this.f65592 = c12392;
        this.f65598 = abstractC2489;
        this.f65588 = (C3764) new C4741(activityC17169).m13885(C3764.class);
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        if (C21943.f70270) {
            paint.setShadowLayer(2.5f, 1.0f, 1.0f, 1342177280);
        }
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(Typeface.MONOSPACE);
        paint2.setTextSize(C11266.m27880(13.0f));
        int m27878 = C11266.m27878(25.0f);
        int m278782 = C11266.m27878(12.5f);
        int m278783 = C11266.m27878(11.0f);
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        float f3 = m278782;
        float f4 = (f3 - f2) - ((f - f2) / 2.0f);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f65591 = Bitmap.createBitmap(m27878, m27878, config);
        Canvas canvas = new Canvas(this.f65591);
        AbstractC21294 abstractC21294 = C19883.f64226;
        paint.setColor(abstractC21294.mo7429());
        paint2.setColor(abstractC21294.mo7430());
        float f5 = m278783;
        canvas.drawCircle(f3, f3, f5, paint);
        canvas.drawText("C", f3, f4, paint2);
        this.f65589 = Bitmap.createBitmap(m27878, m27878, config);
        Canvas canvas2 = new Canvas(this.f65589);
        AbstractC21294 abstractC212942 = C19883.f64218;
        paint.setColor(abstractC212942.mo7429());
        paint2.setColor(abstractC212942.mo7430());
        canvas2.drawCircle(f3, f3, f5, paint);
        canvas2.drawText("M", f3, f4, paint2);
        this.f65595 = Bitmap.createBitmap(m27878, m27878, config);
        Canvas canvas3 = new Canvas(this.f65595);
        AbstractC21294 abstractC212943 = C19883.f64230;
        paint.setColor(abstractC212943.mo7429());
        paint2.setColor(abstractC212943.mo7430());
        canvas3.drawCircle(f3, f3, f5, paint);
        canvas3.drawText("F", f3, f4, paint2);
        this.f65584 = Bitmap.createBitmap(m27878, m27878, config);
        Canvas canvas4 = new Canvas(this.f65584);
        AbstractC21294 abstractC212944 = C19883.f64244;
        paint.setColor(abstractC212944.mo7429());
        paint2.setColor(abstractC212944.mo7430());
        canvas4.drawCircle(f3, f3, f5, paint);
        canvas4.drawText("S", f3, f4, paint2);
        View m10216 = activityC17169.m10216(R.layout.MT_Protector_res_0x7f0d00cd);
        C23592 c23592 = (C23592) m10216.findViewById(R.id.searchView);
        TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        ListView listView = (ListView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02e0);
        this.f65599 = listView;
        C21724 c21724 = new C21724(this);
        this.f65602 = c21724;
        listView.setAdapter((ListAdapter) c21724);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
        listView.setFastScrollEnabled(true);
        C4915.m14284(listView);
        textView.setText(R.string.MT_Protector_res_0x7f1206b3);
        c23592.m52055(new C15372(this, textView));
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(activityC17169);
        c19258.m44421(m10216);
        c19258.m44440(R.string.MT_Protector_res_0x7f120a0c, (DialogInterface.OnClickListener) null);
        c19258.m44434(R.string.MT_Protector_res_0x7f120949, (DialogInterface.OnClickListener) null);
        c19258.m44442(R.string.MT_Protector_res_0x7f120189, null);
        this.f65587 = c19258.m44415();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46590(List list, List list2, List list3, List list4) {
        this.f65593 = list;
        this.f65600 = list2;
        this.f65585 = list3;
        ArrayList arrayList = new ArrayList(list3.size() + list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        C6083.sort(arrayList, new Comparator() { // from class: l.ۡܿۢ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                ViewOnClickListenerC20313.this.getClass();
                boolean z = obj instanceof C8839;
                boolean z2 = obj2 instanceof C8839;
                int compare = Integer.compare(z ? ((C8839) obj).m22834() : obj instanceof C14482 ? ((C14482) obj).m34580() : ((C23655) obj).m52184(), z2 ? ((C8839) obj2).m22834() : obj2 instanceof C14482 ? ((C14482) obj2).m34580() : ((C23655) obj2).m52184());
                if (compare != 0) {
                    return compare;
                }
                int i = 2;
                int i2 = z ? 0 : obj instanceof C14482 ? 1 : 2;
                if (z2) {
                    i = 0;
                } else if (obj2 instanceof C14482) {
                    i = 1;
                }
                int compare2 = Integer.compare(i2, i);
                if (compare2 != 0) {
                    return compare2;
                }
                return Integer.compare(z2 ? ((C8839) obj2).m22832() : obj2 instanceof C14482 ? ((C14482) obj2).m34577() : ((C23655) obj2).m52180(), z ? ((C8839) obj).m22832() : obj instanceof C14482 ? ((C14482) obj).m34577() : ((C23655) obj).m52180());
            }
        });
        this.f65586 = arrayList;
        this.f65594 = list4;
        this.f65602.m49050();
        if (this.f65587.m1442()) {
            if (this.f65596) {
                m46580();
            } else {
                m46584();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46567(ViewOnClickListenerC20313 viewOnClickListenerC20313, Object obj, String str) {
        if (obj instanceof C8839) {
            C8839 c8839 = (C8839) obj;
            return C9679.m24616((CharSequence) c8839.m22833(), (CharSequence) str) || C9679.m24616((CharSequence) c8839.m22835(), (CharSequence) str);
        }
        if (obj instanceof C14482) {
            C14482 c14482 = (C14482) obj;
            return C9679.m24616((CharSequence) c14482.m34581(), (CharSequence) str) || C9679.m24616((CharSequence) c14482.m34576(), (CharSequence) str);
        }
        C23655 c23655 = (C23655) obj;
        return C9679.m24616((CharSequence) c23655.m52181(), (CharSequence) str) || C9679.m24616((CharSequence) c23655.m52178(), (CharSequence) str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46591() {
        this.f65602.notifyDataSetChanged();
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f65587;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1448().setOnClickListener(this);
        dialogInterfaceC0206.m1446().setOnClickListener(new View.OnClickListener() { // from class: l.ۖܿۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC20313.m46581(ViewOnClickListenerC20313.this);
            }
        });
        if (this.f65596) {
            m46580();
        } else {
            m46584();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m46584() {
        Object mo7979 = this.f65598.mo7979();
        if (mo7979 == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f65597;
            if (i >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i) == mo7979) {
                this.f65599.setSelection(i);
                return;
            }
            i++;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m46580() {
        this.f65590 = null;
        C12392 c12392 = this.f65592;
        int m30444 = c12392.m30444();
        int m30448 = c12392.m30448();
        if (m30444 <= m30448) {
            m30444 = m30448;
            m30448 = m30444;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f65604;
            if (i >= arrayList.size()) {
                return;
            }
            C9545 c9545 = (C9545) arrayList.get(i);
            int m24416 = c9545.m24416();
            int m24415 = c9545.m24415();
            if (m24416 > m30444) {
                return;
            }
            if (m30448 >= m24416 && m30444 <= m24415) {
                this.f65590 = c9545;
                this.f65599.setSelection(i);
                return;
            }
            i++;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m46581(ViewOnClickListenerC20313 viewOnClickListenerC20313) {
        ActivityC17169 activityC17169 = viewOnClickListenerC20313.f65601;
        final View m10216 = activityC17169.m10216(R.layout.MT_Protector_res_0x7f0d0097);
        final int[] iArr = {R.id.MT_Protector_res_0x7f0a057d, R.id.MT_Protector_res_0x7f0a057e, R.id.MT_Protector_res_0x7f0a057f, R.id.MT_Protector_res_0x7f0a0580, R.id.MT_Protector_res_0x7f0a0581, R.id.MT_Protector_res_0x7f0a0584, R.id.MT_Protector_res_0x7f0a0585, R.id.MT_Protector_res_0x7f0a0586, R.id.MT_Protector_res_0x7f0a0587, R.id.MT_Protector_res_0x7f0a0588, R.id.MT_Protector_res_0x7f0a0589, R.id.MT_Protector_res_0x7f0a058b, R.id.MT_Protector_res_0x7f0a058d, R.id.MT_Protector_res_0x7f0a058e, R.id.MT_Protector_res_0x7f0a058f, R.id.MT_Protector_res_0x7f0a0590, R.id.MT_Protector_res_0x7f0a0591, R.id.MT_Protector_res_0x7f0a0592, R.id.MT_Protector_res_0x7f0a0593, R.id.MT_Protector_res_0x7f0a0594, R.id.MT_Protector_res_0x7f0a058c};
        int i = ApplicationC20075.f65008.getInt("dnm", 0);
        for (int i2 = 0; i2 < 21; i2++) {
            C2978 c2978 = (C2978) m10216.findViewById(iArr[i2]);
            boolean z = true;
            if (((1 << i2) & i) != 0) {
                z = false;
            }
            c2978.setChecked(z);
        }
        C19258 buildDialog = activityC17169.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f1205ac);
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.۠ܿۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = 0;
                for (int i5 = 0; i5 < 21; i5++) {
                    if (!((C2978) m10216.findViewById(iArr[i5])).isChecked()) {
                        i4 |= 1 << i5;
                    }
                }
                ApplicationC20075.f65008.edit().mo25853(i4, "dnm").apply();
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z = this.f65596;
        C12392 c12392 = this.f65592;
        if (z) {
            C9545 c9545 = (C9545) this.f65604.get(i);
            c12392.mo25922(c9545.m24416(), c9545.m24415());
        } else {
            Object obj = this.f65597.get(i);
            if (obj instanceof C8839) {
                c12392.mo25919(((C8839) obj).m22834());
            } else if (obj instanceof C14482) {
                c12392.mo25919(((C14482) obj).m34580());
            } else {
                c12392.mo25919(((C23655) obj).m52184());
            }
        }
        c12392.m30430(false);
        this.f65587.dismiss();
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        C21282 c21282 = new C21282(view.getContext(), view, 0);
        if (this.f65596) {
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205c2, 0, R.string.MT_Protector_res_0x7f1205c2);
            c21282.m48302(new InterfaceC14930() { // from class: l.ۜܿۢ
                @Override // l.InterfaceC14930
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    C4925.m14314((CharSequence) ((C9545) ViewOnClickListenerC20313.this.f65604.get(i)).m24417());
                    return true;
                }
            });
        } else {
            Object obj = this.f65597.get(i);
            final C8839 c8839 = obj instanceof C8839 ? (C8839) obj : null;
            final C14482 c14482 = obj instanceof C14482 ? (C14482) obj : null;
            final C23655 c23655 = obj instanceof C23655 ? (C23655) obj : null;
            int i2 = ApplicationC20075.f65008.getInt("dnm", 0);
            if (c8839 != null) {
                if ((i2 & 1) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1203e8, 0, R.string.MT_Protector_res_0x7f1203e8);
                }
                if ((i2 & 2) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1203e7, 0, R.string.MT_Protector_res_0x7f1203e7);
                }
                if ((i2 & 4) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1201f7, 0, R.string.MT_Protector_res_0x7f1201f7);
                }
                if ((i2 & 8) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1201f4, 0, R.string.MT_Protector_res_0x7f1201f4);
                }
                if ((i2 & 16) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1201f5, 0, R.string.MT_Protector_res_0x7f1201f5);
                }
            } else if (c14482 != null) {
                if ((i2 & 32) == 0) {
                    SubMenu addSubMenu = c21282.m48304().addSubMenu(R.string.MT_Protector_res_0x7f1203e8);
                    String[] stringArray = this.f65601.getResources().getStringArray(R.array.MT_Protector_res_0x7f030016);
                    addSubMenu.add(R.string.MT_Protector_res_0x7f1203e8, 0, 0, stringArray[0]);
                    addSubMenu.add(R.string.MT_Protector_res_0x7f1203e8, 1, 0, stringArray[1]);
                    addSubMenu.add(R.string.MT_Protector_res_0x7f1203e8, 2, 0, stringArray[2]);
                }
                if ((i2 & 64) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1201fa, 0, R.string.MT_Protector_res_0x7f1201fa);
                }
                if ((i2 & 128) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1201f8, 0, R.string.MT_Protector_res_0x7f1201f8);
                }
                if ((i2 & 256) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1201f9, 0, R.string.MT_Protector_res_0x7f1201f9);
                }
                if ((i2 & 512) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1201f4, 0, R.string.MT_Protector_res_0x7f1201f4).setEnabled(!this.f65593.isEmpty());
                }
                if ((i2 & 1024) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1201f5, 0, R.string.MT_Protector_res_0x7f1201f5).setEnabled(!this.f65593.isEmpty());
                }
            } else if (c23655 != null) {
                if ((i2 & 2048) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1203e8, 0, R.string.MT_Protector_res_0x7f1203e8);
                }
                if ((i2 & 4096) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1203e5, 0, R.string.MT_Protector_res_0x7f1203e5);
                }
                if ((i2 & 8192) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1201fd, 0, R.string.MT_Protector_res_0x7f1201fd);
                }
                int i3 = i2 & 16384;
                AbstractC14346 abstractC14346 = this.f65603;
                if (i3 == 0 && (abstractC14346 instanceof C6306)) {
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1201fb, 0, R.string.MT_Protector_res_0x7f1201fb);
                }
                if ((32768 & i2) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1201fc, 0, R.string.MT_Protector_res_0x7f1201fc);
                }
                if ((65536 & i2) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1201f4, 0, R.string.MT_Protector_res_0x7f1201f4).setEnabled(!this.f65593.isEmpty());
                }
                if ((131072 & i2) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1201f5, 0, R.string.MT_Protector_res_0x7f1201f5).setEnabled((this.f65593.isEmpty() || c23655.m52181().equals("<clinit>")) ? false : true);
                }
                if (abstractC14346 instanceof C6306) {
                    if ((262144 & i2) == 0) {
                        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f120b60, 0, R.string.MT_Protector_res_0x7f120b60);
                    }
                    if ((524288 & i2) == 0) {
                        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1209ad, 0, R.string.MT_Protector_res_0x7f1209ad);
                    }
                    if ((i2 & 1048576) == 0) {
                        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f12017d, 0, R.string.MT_Protector_res_0x7f12017d);
                    }
                }
            }
            c21282.m48302(new InterfaceC14930() { // from class: l.ܺܿۢ
                @Override // l.InterfaceC14930
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return ViewOnClickListenerC20313.m46568(ViewOnClickListenerC20313.this, c8839, c14482, c23655, menuItem);
                }
            });
        }
        c21282.m48305();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46568(final ViewOnClickListenerC20313 viewOnClickListenerC20313, final C8839 c8839, final C14482 c14482, final C23655 c23655, MenuItem menuItem) {
        String str;
        char c;
        char c2;
        char c3;
        char c4;
        String m28975;
        String m33379;
        AbstractC14346 abstractC14346 = viewOnClickListenerC20313.f65603;
        DialogInterfaceC0206 dialogInterfaceC0206 = viewOnClickListenerC20313.f65587;
        C12392 c12392 = viewOnClickListenerC20313.f65592;
        ActivityC17169 activityC17169 = viewOnClickListenerC20313.f65601;
        final int itemId = menuItem.getItemId();
        int groupId = menuItem.getGroupId();
        if (itemId == R.string.MT_Protector_res_0x7f1201f4) {
            if (c8839 != null) {
                m33379 = C13940.m33377(c8839);
            } else if (c14482 != null) {
                C8839 m46560 = viewOnClickListenerC20313.m46560(c14482.m34580(), c14482.m34577(), c14482.m34579());
                if (m46560 != null) {
                    m33379 = C13940.m33378(m46560, c14482, viewOnClickListenerC20313.m46558(m46560.m22835()));
                }
            } else if (c23655 != null) {
                C8839 m465602 = viewOnClickListenerC20313.m46560(c23655.m52184(), c23655.m52180(), c23655.m52182());
                if (m465602 != null) {
                    m33379 = C13940.m33379(m465602, c23655, viewOnClickListenerC20313.m46558(m465602.m22835()));
                }
            }
            C4925.m14314((CharSequence) m33379);
            return true;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1201f5) {
            if (c8839 != null) {
                m28975 = C11867.m28973(c8839);
            } else if (c14482 != null) {
                C8839 m465603 = viewOnClickListenerC20313.m46560(c14482.m34580(), c14482.m34577(), c14482.m34579());
                if (m465603 != null) {
                    m28975 = C11867.m28974(m465603, c14482);
                }
            } else if (c23655 != null) {
                C8839 m465604 = viewOnClickListenerC20313.m46560(c23655.m52184(), c23655.m52180(), c23655.m52182());
                if (m465604 != null) {
                    m28975 = C11867.m28975(m465604, c23655);
                }
            }
            C4925.m14314((CharSequence) m28975);
            return true;
        }
        if (itemId == R.string.MT_Protector_res_0x7f120b60) {
            activityC17169.m40341(((C6306) abstractC14346).m17420(), c23655.m52183());
            dialogInterfaceC0206.dismiss();
            return true;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1209ad) {
            activityC17169.m40342(((C6306) abstractC14346).m17420(), c23655.m52183(), (ArrayList) null, false);
            dialogInterfaceC0206.dismiss();
            return true;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1201f7) {
            C4925.m14314((CharSequence) c8839.m22835());
            return true;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1201fd) {
            String m46557 = viewOnClickListenerC20313.m46557(c23655);
            StringBuilder m19190 = C7166.m19190(m46557 != null ? m46557 : "???", "->");
            m19190.append(c23655.m52183());
            C4925.m14314((CharSequence) m19190.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1201fa) {
            String m46556 = viewOnClickListenerC20313.m46556(c14482);
            StringBuilder m191902 = C7166.m19190(m46556 != null ? m46556 : "???", "->");
            m191902.append(c14482.m34582());
            C4925.m14314((CharSequence) m191902.toString());
            return true;
        }
        str = "???";
        if (itemId == R.string.MT_Protector_res_0x7f1201f8) {
            String m465562 = viewOnClickListenerC20313.m46556(c14482);
            if (m465562 == null) {
                m465562 = str;
            }
            CharSequence m46574 = viewOnClickListenerC20313.m46574(viewOnClickListenerC20313.m46556(c14482));
            boolean contains = (m46574 != null ? C4811.m14020(m46574, c14482) : "").contains("static");
            StringBuilder sb = new StringBuilder(contains ? "sget" : "iget");
            if (c14482.m34578().length() <= 1) {
                String m34578 = c14482.m34578();
                m34578.getClass();
                switch (m34578.hashCode()) {
                    case 66:
                        if (m34578.equals("B")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 67:
                        if (m34578.equals("C")) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 68:
                        if (m34578.equals("D")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 74:
                        if (m34578.equals("J")) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                        if (m34578.equals("S")) {
                            c4 = 4;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 90:
                        if (m34578.equals("Z")) {
                            c4 = 5;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                switch (c4) {
                    case 0:
                        sb.append("-byte");
                        break;
                    case 1:
                        sb.append("-char");
                        break;
                    case 2:
                    case 3:
                        sb.append("-wide");
                        break;
                    case 4:
                        sb.append("-short");
                        break;
                    case 5:
                        sb.append("-boolean");
                        break;
                }
            } else {
                sb.append("-object");
            }
            sb.append(" v0, ");
            if (!contains) {
                sb.append("v1, ");
            }
            sb.append(m465562);
            sb.append("->");
            sb.append(c14482.m34582());
            sb.append("\n");
            C4925.m14314((CharSequence) sb.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1201f9) {
            String m465563 = viewOnClickListenerC20313.m46556(c14482);
            str = m465563 != null ? m465563 : "???";
            CharSequence m465742 = viewOnClickListenerC20313.m46574(viewOnClickListenerC20313.m46556(c14482));
            boolean contains2 = (m465742 != null ? C4811.m14020(m465742, c14482) : "").contains("static");
            StringBuilder sb2 = new StringBuilder(contains2 ? "sput" : "iput");
            if (c14482.m34578().length() <= 1) {
                String m345782 = c14482.m34578();
                m345782.getClass();
                switch (m345782.hashCode()) {
                    case 66:
                        if (m345782.equals("B")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 67:
                        if (m345782.equals("C")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 68:
                        if (m345782.equals("D")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 74:
                        if (m345782.equals("J")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                        if (m345782.equals("S")) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 90:
                        if (m345782.equals("Z")) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 0:
                        sb2.append("-byte");
                        break;
                    case 1:
                        sb2.append("-char");
                        break;
                    case 2:
                    case 3:
                        sb2.append("-wide");
                        break;
                    case 4:
                        sb2.append("-short");
                        break;
                    case 5:
                        sb2.append("-boolean");
                        break;
                }
            } else {
                sb2.append("-object");
            }
            sb2.append(" v0, ");
            if (!contains2) {
                sb2.append("v1, ");
            }
            sb2.append(str);
            sb2.append("->");
            sb2.append(c14482.m34582());
            sb2.append("\n");
            C4925.m14314((CharSequence) sb2.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1201fc) {
            String m465572 = viewOnClickListenerC20313.m46557(c23655);
            if (m465572 == null) {
                m465572 = str;
            }
            CharSequence m465743 = viewOnClickListenerC20313.m46574(viewOnClickListenerC20313.m46557(c23655));
            String[] strArr = m465743 != null ? new String[]{C4811.m14025(m465743), C4811.m14021(m465743, c23655)} : new String[]{"", ""};
            String str2 = strArr[0];
            String str3 = strArr[1];
            StringBuilder sb3 = new StringBuilder("invoke");
            if (str3.contains("static")) {
                sb3.append("-static");
            } else if (str3.contains("private") || str3.contains("constructor")) {
                sb3.append("-direct");
            } else if (str2.contains("interface")) {
                sb3.append("-interface");
            } else {
                sb3.append("-virtual");
            }
            String m52176 = c23655.m52176();
            int i = !str3.contains("static") ? 1 : 0;
            C13277 c13277 = new C13277(m52176);
            while (true) {
                String m32240 = c13277.m32240();
                if (m32240 == null) {
                    break;
                }
                i = (m32240.equals("D") || m32240.equals("J")) ? i + 2 : i + 1;
            }
            if (i > 5) {
                sb3.append("/range {v0 .. v");
                sb3.append(i - 1);
                sb3.append("}, ");
            } else {
                sb3.append(" {");
                for (int i2 = 0; i2 < i; i2++) {
                    if (i2 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append('v');
                    sb3.append(i2);
                }
                sb3.append("}, ");
            }
            sb3.append(m465572);
            sb3.append("->");
            sb3.append(c23655.m52183());
            sb3.append("\n");
            String m52179 = c23655.m52179();
            if (m52179.length() <= 1) {
                switch (m52179.hashCode()) {
                    case 68:
                        if (m52179.equals("D")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 74:
                        if (m52179.equals("J")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case HRSS1373Polynomial.K /* 86 */:
                        if (m52179.equals("V")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                    case 1:
                        sb3.append("move-result-wide v0\n");
                        break;
                    case 2:
                        break;
                    default:
                        sb3.append("move-result v0\n");
                        break;
                }
            } else {
                sb3.append("move-result-object v0\n");
            }
            C4925.m14314((CharSequence) sb3.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1201fb) {
            C4925.m14314((CharSequence) c12392.m30436().mo26557(c23655.m52184(), c23655.m52180()));
            return true;
        }
        if (itemId != R.string.MT_Protector_res_0x7f12017d) {
            if (itemId == R.string.MT_Protector_res_0x7f1203e5) {
                activityC17169.m40363(new Runnable() { // from class: l.ᩴܿۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC20313.m46577(ViewOnClickListenerC20313.this, c23655);
                    }
                });
                return true;
            }
            if (itemId == R.string.MT_Protector_res_0x7f1203e7) {
                activityC17169.m40363(new Runnable() { // from class: l.᩵ܿۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC20313.m46563(ViewOnClickListenerC20313.this, c8839);
                    }
                });
                return true;
            }
            if (groupId == R.string.MT_Protector_res_0x7f1203e8) {
                activityC17169.m40363(new Runnable() { // from class: l.֡ܿۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC20313.m46565(ViewOnClickListenerC20313.this, c14482, itemId);
                    }
                });
                return true;
            }
            if (itemId == R.string.MT_Protector_res_0x7f1203e8) {
                if (c8839 != null) {
                    activityC17169.m40363(new Runnable() { // from class: l.ۚܿۢ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC20313.m46576(ViewOnClickListenerC20313.this, c8839);
                        }
                    });
                    return true;
                }
                activityC17169.m40363(new Runnable() { // from class: l.֨ܿۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC20313.m46566(ViewOnClickListenerC20313.this, c23655);
                    }
                });
            }
            return true;
        }
        InterfaceC7785 m30436 = c12392.m30436();
        int indexOf = TextUtils.indexOf((CharSequence) m30436, '\n', c23655.m52184() + 1);
        int lastIndexOf = TextUtils.lastIndexOf(m30436, '\n', c23655.m52180() - 1);
        String m14022 = C4811.m14022(m30436.mo26557(c23655.m52184(), indexOf).trim());
        boolean contains3 = m14022.contains("static");
        boolean z = m14022.contains(UMConfigure.WRAPER_TYPE_NATIVE) || m14022.contains("abstract");
        String m24607 = C9679.m24607(' ', c12392.m30361());
        StringBuilder sb4 = new StringBuilder();
        if (!z) {
            String m521762 = c23655.m52176();
            int i3 = !contains3 ? 1 : 0;
            C13277 c132772 = new C13277(m521762);
            while (true) {
                String m322402 = c132772.m32240();
                if (m322402 == null) {
                    break;
                }
                i3 = (m322402.equals("D") || m322402.equals("J")) ? i3 + 2 : i3 + 1;
            }
            String m521792 = c23655.m52179();
            m521792.getClass();
            switch (m521792.hashCode()) {
                case 66:
                    if (m521792.equals("B")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 67:
                    if (m521792.equals("C")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 68:
                    if (m521792.equals("D")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 70:
                    if (m521792.equals("F")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 73:
                    if (m521792.equals("I")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 74:
                    if (m521792.equals("J")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                    if (m521792.equals("S")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case HRSS1373Polynomial.K /* 86 */:
                    if (m521792.equals("V")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 90:
                    if (m521792.equals("Z")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 3:
                case 4:
                case 6:
                case '\b':
                    sb4.append(m24607);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 1));
                    ASN1BMPString$$ExternalSyntheticOutline0.m(sb4, "\n\n", m24607, "const/4 v0, 0x0\n\n", m24607);
                    sb4.append("return v0\n");
                    break;
                case 2:
                case 5:
                    sb4.append(m24607);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 2));
                    ASN1BMPString$$ExternalSyntheticOutline0.m(sb4, "\n\n", m24607, "const-wide/16 v0, 0x0\n\n", m24607);
                    sb4.append("return-wide v0\n");
                    break;
                case 7:
                    sb4.append(m24607);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 1));
                    C20177.m46410(sb4, "\n\n", m24607, "return-void\n");
                    break;
                default:
                    sb4.append(m24607);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 1));
                    ASN1BMPString$$ExternalSyntheticOutline0.m(sb4, "\n\n", m24607, "const/4 v0, 0x0\n\n", m24607);
                    sb4.append("return-object v0\n");
                    break;
            }
        }
        if (indexOf != -1 && lastIndexOf != -1) {
            m30436.replace(indexOf + 1, lastIndexOf + 1, sb4);
            c12392.mo25922(c23655.m52184(), sb4.length() + (c23655.m52180() - (lastIndexOf - indexOf)));
            c12392.m30430(false);
        }
        dialogInterfaceC0206.dismiss();
        return true;
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46577(ViewOnClickListenerC20313 viewOnClickListenerC20313, C23655 c23655) {
        C11825 c11825 = new C11825();
        c11825.f35279 = 1;
        c11825.f35280 = c23655.m52183();
        String m46557 = viewOnClickListenerC20313.m46557(c23655);
        if (m46557 == null) {
            C21374.m48459((CharSequence) "Can not detect the class name.");
            return;
        }
        viewOnClickListenerC20313.f65587.dismiss();
        c11825.f35277 = m46557;
        viewOnClickListenerC20313.f65588.m11387(c11825);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46563(ViewOnClickListenerC20313 viewOnClickListenerC20313, C8839 c8839) {
        C11825 c11825 = new C11825();
        c11825.f35279 = 0;
        c11825.f35277 = c8839.m22835();
        viewOnClickListenerC20313.f65587.dismiss();
        viewOnClickListenerC20313.f65588.m11407(c11825);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46565(ViewOnClickListenerC20313 viewOnClickListenerC20313, C14482 c14482, int i) {
        C11825 c11825 = new C11825();
        String m46556 = viewOnClickListenerC20313.m46556(c14482);
        if (m46556 == null) {
            C21374.m48459((CharSequence) "Can not detect the class name.");
            return;
        }
        c11825.f35279 = 2;
        c11825.f35280 = c14482.m34582();
        c11825.f35276 = i;
        c11825.f35277 = m46556;
        viewOnClickListenerC20313.f65587.dismiss();
        viewOnClickListenerC20313.f65588.m11414(c11825);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46576(ViewOnClickListenerC20313 viewOnClickListenerC20313, C8839 c8839) {
        C11825 c11825 = new C11825();
        c11825.f35279 = 0;
        c11825.f35277 = c8839.m22835();
        viewOnClickListenerC20313.f65587.dismiss();
        viewOnClickListenerC20313.f65588.m11414(c11825);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46566(ViewOnClickListenerC20313 viewOnClickListenerC20313, C23655 c23655) {
        final C11825 c11825 = new C11825();
        String m46557 = viewOnClickListenerC20313.m46557(c23655);
        if (m46557 == null) {
            C21374.m48459((CharSequence) "Can not detect the class name.");
            return;
        }
        c11825.f35279 = 1;
        c11825.f35277 = m46557;
        c11825.f35280 = c23655.m52183();
        final RunnableC21019 runnableC21019 = new RunnableC21019(viewOnClickListenerC20313, c11825);
        if (!c23655.m52177()) {
            runnableC21019.run();
            return;
        }
        C19258 buildDialog = viewOnClickListenerC20313.f65601.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120491);
        buildDialog.m44416(R.string.MT_Protector_res_0x7f120b81);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120b8b, new DialogInterfaceOnClickListenerC19257(1, runnableC21019));
        buildDialog.m44434(R.string.MT_Protector_res_0x7f1206e7, new DialogInterface.OnClickListener() { // from class: l.ۢܿۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C11825.this.f35278 = true;
                runnableC21019.run();
            }
        });
        buildDialog.m44440(R.string.MT_Protector_res_0x7f12042f, (DialogInterface.OnClickListener) null);
        buildDialog.m44438().m1448().setOnClickListener(new ViewOnClickListenerC21640(1, viewOnClickListenerC20313));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46564(ViewOnClickListenerC20313 viewOnClickListenerC20313, C11825 c11825) {
        viewOnClickListenerC20313.f65587.dismiss();
        viewOnClickListenerC20313.f65588.m11414(c11825);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private CharSequence m46574(String str) {
        AbstractC14346 abstractC14346 = this.f65603;
        if (abstractC14346 instanceof C6306) {
            return this.f65592.m30436();
        }
        if (!(abstractC14346 instanceof C16475)) {
            return null;
        }
        try {
            String m38819 = ((C16475) abstractC14346).m38819();
            if (!TextUtils.isEmpty(str) && str.startsWith("L") && str.endsWith(l.b)) {
                m38819 = str.substring(1, str.length() - 1);
            }
            return this.f65601.m40362(m38819);
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m46589() {
        if (this.f65593.isEmpty()) {
            CharSequence m46574 = m46574((String) null);
            if (m46574 != null) {
                return AbstractC2489.m7978(m46574);
            }
            return null;
        }
        return ((C8839) this.f65593.get(0)).m22835();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m46556(C14482 c14482) {
        String m34579 = c14482.m34579();
        int m34580 = c14482.m34580();
        int m34577 = c14482.m34577();
        if (!TextUtils.isEmpty(m34579)) {
            return m34579;
        }
        C8839 m46559 = m46559(m34580, m34577);
        if (m46559 != null) {
            return m46559.m22835();
        }
        return m46589();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m46557(C23655 c23655) {
        String m52182 = c23655.m52182();
        int m52184 = c23655.m52184();
        int m52180 = c23655.m52180();
        if (!TextUtils.isEmpty(m52182)) {
            return m52182;
        }
        C8839 m46559 = m46559(m52184, m52180);
        if (m46559 != null) {
            return m46559.m22835();
        }
        return m46589();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private List m46558(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.f65585;
        }
        ArrayList arrayList = new ArrayList();
        for (C23655 c23655 : this.f65585) {
            if (str.equals(c23655.m52182())) {
                arrayList.add(c23655);
            }
        }
        return arrayList.isEmpty() ? this.f65585 : arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C8839 m46560(int i, int i2, String str) {
        if (!TextUtils.isEmpty(str)) {
            for (C8839 c8839 : this.f65593) {
                if (str.equals(c8839.m22835())) {
                    break;
                }
            }
        }
        c8839 = null;
        if (c8839 != null) {
            return c8839;
        }
        C8839 m46559 = m46559(i, i2);
        if (m46559 != null) {
            return m46559;
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("L") || !str.endsWith(l.b)) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(47) + 1;
        if (lastIndexOf == 0) {
            lastIndexOf = 1;
        }
        return new C8839(str, C15472.m36561(1, lastIndexOf, str));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C8839 m46559(int i, int i2) {
        int m22832;
        C8839 c8839 = null;
        int i3 = Integer.MAX_VALUE;
        for (C8839 c88392 : this.f65593) {
            if (i >= c88392.m22834() && i2 <= c88392.m22832() && (m22832 = c88392.m22832() - c88392.m22834()) < i3) {
                c8839 = c88392;
                i3 = m22832;
            }
        }
        return c8839;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.f65596 && this.f65604.isEmpty()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1206f5);
            return;
        }
        boolean z = this.f65596;
        this.f65596 = !z;
        if (!z) {
            m46580();
        }
        this.f65592.postDelayed(new Runnable() { // from class: l.ۘܿۢ
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC20313.m46575(ViewOnClickListenerC20313.this);
            }
        }, 100L);
        this.f65602.notifyDataSetChanged();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46575(ViewOnClickListenerC20313 viewOnClickListenerC20313) {
        if (viewOnClickListenerC20313.f65596) {
            viewOnClickListenerC20313.m46580();
        } else {
            viewOnClickListenerC20313.m46584();
        }
    }
}
