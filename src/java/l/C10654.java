package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import bin.mt.plus.R;
import java.util.HashMap;

/* compiled from: 6AY4 */
/* renamed from: l.ۧ֡᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10654 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CheckBox f32047;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final RadioButton[] f32048;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f32049;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19121 f32050;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CheckBox f32051;

    public C10654(ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        C16773 c16773;
        C16773 c167732;
        int i;
        boolean z;
        this.f32050 = viewOnClickListenerC19121;
        c16773 = viewOnClickListenerC19121.f60252;
        C11233.m27799(c16773);
        c167732 = viewOnClickListenerC19121.f60252;
        C11233.m27799(c167732);
        this.f32049 = C20094.m46315("local:", c167732.m39742());
        View m10216 = viewOnClickListenerC19121.m10216(R.layout.MT_Protector_res_0x7f0d00f9);
        RadioButton[] radioButtonArr = new RadioButton[4];
        boolean z2 = false;
        int i2 = 0;
        while (i2 < 4) {
            RadioButton radioButton = (RadioButton) (i2 != 0 ? i2 != 1 ? i2 != 2 ? m10216.findViewById(R.id.MT_Protector_res_0x7f0a0480) : m10216.findViewById(R.id.MT_Protector_res_0x7f0a047f) : m10216.findViewById(R.id.MT_Protector_res_0x7f0a047d) : m10216.findViewById(R.id.MT_Protector_res_0x7f0a047e));
            C11233.m27799((Object) radioButton);
            radioButtonArr[i2] = radioButton;
            i2++;
        }
        this.f32048 = radioButtonArr;
        int i3 = 0;
        final int i4 = 0;
        while (i3 < 4) {
            radioButtonArr[i3].setOnClickListener(new View.OnClickListener() { // from class: l.ܰ᩵᩷
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C10654.this.m26744(i4);
                }
            });
            i3++;
            i4++;
        }
        View findViewById = m10216.findViewById(R.id.MT_Protector_res_0x7f0a0540);
        C11233.m27803(findViewById, "findViewById(...)");
        CheckBox checkBox = (CheckBox) findViewById;
        this.f32047 = checkBox;
        View findViewById2 = m10216.findViewById(R.id.MT_Protector_res_0x7f0a053f);
        C11233.m27803(findViewById2, "findViewById(...)");
        CheckBox checkBox2 = (CheckBox) findViewById2;
        this.f32051 = checkBox2;
        HashMap hashMap = C19890.f64282;
        if (hashMap.containsKey(this.f32049)) {
            checkBox2.setChecked(true);
            Object obj = hashMap.get(this.f32049);
            C11233.m27799(obj);
            int intValue = ((Number) obj).intValue();
            m26744(C7489.m20112(intValue));
            checkBox.setChecked(C7489.m20122(intValue));
            z2 = true;
        } else {
            i = this.f32050.f60239;
            m26744(i);
            z = this.f32050.f60241;
            checkBox.setChecked(z);
        }
        C19258 buildDialog = this.f32050.buildDialog();
        buildDialog.m44421(m10216);
        final ViewOnClickListenerC19121 viewOnClickListenerC191212 = this.f32050;
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.۟᩵᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                C10654.m26742(C10654.this, viewOnClickListenerC191212);
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        if (!z2) {
            buildDialog.m44438();
            return;
        }
        buildDialog.m44440(R.string.MT_Protector_res_0x7f12017c, (DialogInterface.OnClickListener) null);
        Button m1448 = buildDialog.m44438().m1448();
        final ViewOnClickListenerC19121 viewOnClickListenerC191213 = this.f32050;
        m1448.setOnClickListener(new View.OnClickListener() { // from class: l.֫֡᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C10654.m26743(C10654.this, viewOnClickListenerC191213, view);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26742(C10654 c10654, ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        RadioButton[] radioButtonArr = c10654.f32048;
        CheckBox checkBox = c10654.f32051;
        CheckBox checkBox2 = c10654.f32047;
        String str = c10654.f32049;
        int i = -1;
        if (!checkBox.isChecked()) {
            int length = radioButtonArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (radioButtonArr[i2].isChecked()) {
                    i = i2;
                    break;
                }
                i2++;
            }
            ViewOnClickListenerC19121.m44129(viewOnClickListenerC19121, i);
            ViewOnClickListenerC19121.m44097(viewOnClickListenerC19121, checkBox2.isChecked());
            HashMap hashMap = C19890.f64282;
            if (hashMap.containsKey(str)) {
                hashMap.remove(str);
            }
            ViewOnClickListenerC19121.m44098(viewOnClickListenerC19121, false, (InterfaceC2123) null, 2);
        }
        HashMap hashMap2 = C19890.f64282;
        C11233.m27803(hashMap2, "sortOnlyInPathList");
        int length2 = radioButtonArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                break;
            }
            if (radioButtonArr[i3].isChecked()) {
                i = i3;
                break;
            }
            i3++;
        }
        hashMap2.put(str, Integer.valueOf(C7489.m20113(i, checkBox2.isChecked())));
        ApplicationC20075.f65008.edit().putString("sort_only_in_path_list", C19890.m45740(C19890.f64282)).apply();
        ViewOnClickListenerC19121.m44098(viewOnClickListenerC19121, false, (InterfaceC2123) null, 2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26743(C10654 c10654, ViewOnClickListenerC19121 viewOnClickListenerC19121, View view) {
        int i;
        boolean z;
        C11233.m27799((Object) view);
        view.setVisibility(8);
        i = viewOnClickListenerC19121.f60239;
        c10654.m26744(i);
        z = viewOnClickListenerC19121.f60241;
        c10654.f32047.setChecked(z);
        c10654.f32051.setChecked(false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26744(int i) {
        RadioButton[] radioButtonArr = this.f32048;
        int length = radioButtonArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            radioButtonArr[i2].setChecked(i3 == i);
            i2++;
            i3 = i4;
        }
    }
}
