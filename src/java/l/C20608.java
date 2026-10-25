package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: 8AJ9 */
/* renamed from: l.᩷ۗܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20608 implements InterfaceC21601 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f66318;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f66319;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile boolean f66320;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f66321;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f66322;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f66323;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f66324 = false;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f66325;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f66326;

    @Override // l.InterfaceC21601
    /* renamed from: ֫ */
    public final /* synthetic */ int mo13490(String str, C22306 c22306, C22306 c223062, boolean z, boolean z2) {
        return C4248.m12788(this, str, c22306, c223062, z, z2);
    }

    @Override // l.InterfaceC21601
    /* renamed from: ֫ */
    public final boolean mo13492(boolean z) {
        return !z && mo13496();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (l.C4925.f15523.getBoolean("def_mov_recycle_bin", true) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C20608(l.AbstractActivityC3346 r5) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f66324 = r0
            boolean r1 = l.C21939.m49417()
            if (r1 == 0) goto L18
            android.content.SharedPreferences r1 = l.C4925.f15523
            java.lang.String r2 = "def_mov_recycle_bin"
            r3 = 1
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 == 0) goto L18
            goto L19
        L18:
            r3 = 0
        L19:
            r4.f66321 = r3
            r4.f66325 = r0
            r4.f66326 = r5
            r4.f66322 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20608.<init>(l.ۗܺ᩷):void");
    }

    @Override // l.InterfaceC21601
    /* renamed from: ܿ֫ */
    public final void mo13495() {
        this.f66322 = true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47155() {
        this.f66318 = true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m47157() {
        this.f66323 = true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m47156(String str) {
        C22306 c22306 = C22306.f72317;
        mo13491(str, c22306, c22306, false);
    }

    @Override // l.InterfaceC21601
    /* renamed from: ֫ */
    public final void mo13491(final String str, final C22306 c22306, final C22306 c223062, final boolean z) {
        C10975.m27286();
        this.f66320 = true;
        C4925.m14315(new Runnable() { // from class: l.ܳۗܳ
            @Override // java.lang.Runnable
            public final void run() {
                C20608.m47153(C20608.this, str, c22306, c223062, z);
            }
        });
        while (this.f66320) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47153(final C20608 c20608, String str, C22306 c22306, C22306 c223062, boolean z) {
        AbstractActivityC3346 abstractActivityC3346 = c20608.f66326;
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00af);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2)).setText(str);
        C4667.m13724(m10216, c22306, c223062);
        int i = 3;
        final RadioButton[] radioButtonArr = {(RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0479), (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a047a), (RadioButton) m10216.findViewById(R.id.radioButton3)};
        if (c20608.f66322) {
            radioButtonArr[0].setText(R.string.MT_Protector_res_0x7f1203ab);
            radioButtonArr[2].setText(R.string.MT_Protector_res_0x7f1203ac);
        }
        if (c20608.f66323) {
            radioButtonArr[2].setVisibility(8);
        }
        final CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00da);
        if (c20608.f66318) {
            checkBox.setVisibility(8);
            m10216.findViewById(R.id.MT_Protector_res_0x7f0a0543).setVisibility(8);
        }
        final CheckBox checkBox2 = (CheckBox) m10216.findViewById(R.id.checkBox2);
        checkBox2.setChecked(c20608.f66321);
        final boolean z2 = z && C21939.m49417();
        if (z2) {
            checkBox2.setVisibility(c20608.f66325 == 0 ? 0 : 8);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.᩻ۗܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RadioButton[] radioButtonArr2 = radioButtonArr;
                int length = radioButtonArr2.length;
                for (int i2 = 0; i2 < length; i2++) {
                    RadioButton radioButton = radioButtonArr2[i2];
                    radioButton.setChecked(radioButton == view);
                }
                if (z2) {
                    checkBox2.setVisibility(view.getId() != R.id.MT_Protector_res_0x7f0a0479 ? 8 : 0);
                }
            }
        };
        int i2 = 0;
        while (i2 < 3) {
            radioButtonArr[i2].setChecked(i2 == c20608.f66325);
            radioButtonArr[i2].setOnClickListener(onClickListener);
            i2++;
        }
        int i3 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(m10216);
        c19258.m44428(false);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۜۗܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C20608.m47154(C20608.this, radioButtonArr, checkBox, checkBox2);
            }
        });
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterfaceOnClickListenerC18322(i, c20608));
        c19258.m44438();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47154(C20608 c20608, RadioButton[] radioButtonArr, CheckBox checkBox, CheckBox checkBox2) {
        c20608.f66320 = false;
        if (radioButtonArr[0].isChecked()) {
            c20608.f66325 = 0;
        } else if (radioButtonArr[1].isChecked()) {
            c20608.f66325 = 1;
        } else {
            c20608.f66325 = 2;
        }
        c20608.f66324 = checkBox.isChecked();
        c20608.f66321 = checkBox2.isChecked();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47152(C20608 c20608) {
        c20608.f66319 = true;
        c20608.f66320 = false;
    }

    @Override // l.InterfaceC21601
    /* renamed from: ᩵ */
    public final boolean mo13496() {
        return !this.f66324;
    }

    @Override // l.InterfaceC21601
    /* renamed from: ܶ */
    public final boolean mo13494() {
        return this.f66321;
    }

    @Override // l.InterfaceC21601
    /* renamed from: ۬ */
    public final int mo13493() {
        return this.f66325;
    }

    @Override // l.InterfaceC17066
    /* renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f66319;
    }
}
