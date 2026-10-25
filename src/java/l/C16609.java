package l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: Q98G */
/* renamed from: l.ܽۧ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16609 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TextView f51016;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final TextView f51017;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final TextView f51018;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final View f51019;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final CheckBox f51020;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final TextView f51021;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f51022;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final TextView f51024;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f51025;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final TextView f51028;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final View f51029;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CheckBox f51030;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final View f51031;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f51023 = 0;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f51027 = 0;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f51026 = 0;

    public C16609(Main main) {
        View m10216 = main.m10216(R.layout.MT_Protector_res_0x7f0d00a8);
        this.f51029 = m10216;
        this.f51028 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        this.f51021 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2);
        this.f51031 = m10216.findViewById(R.id.MT_Protector_res_0x7f0a0235);
        this.f51019 = m10216.findViewById(R.id.MT_Protector_res_0x7f0a0238);
        this.f51018 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05dd);
        this.f51024 = (TextView) m10216.findViewById(R.id.textFileCount);
        this.f51017 = (TextView) m10216.findViewById(R.id.textFolderCount);
        this.f51030 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00d9);
        CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.checkBox2);
        this.f51020 = checkBox;
        TextView textView = (TextView) m10216.findViewById(R.id.textView);
        this.f51016 = textView;
        m10216.findViewById(R.id.speedModeHelp).setOnClickListener(new ViewOnClickListenerC8924(1, main));
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean("dfsmd", false));
        boolean z = ApplicationC20075.f65010.getBoolean("deletion_warning", true);
        this.f51022 = z;
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m39120() {
        CheckBox checkBox = this.f51030;
        return checkBox.getVisibility() == 0 && checkBox.isChecked();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39119(final String str, final String str2) {
        CheckBox checkBox = this.f51030;
        checkBox.setVisibility(0);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ۧۧ᩻
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C16609.m39117(C16609.this, str2, str, z);
            }
        };
        int i = C21939.f70247;
        checkBox.setChecked(C4925.f15523.getBoolean("def_mov_recycle_bin", true));
        onCheckedChangeListener.onCheckedChanged(checkBox, checkBox.isChecked());
        checkBox.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39117(C16609 c16609, String str, String str2, boolean z) {
        if (c16609.f51022) {
            c16609.f51016.setVisibility(z ? 8 : 0);
        }
        TextView textView = c16609.f51021;
        if (!z) {
            str = str2;
        }
        textView.setText(str);
        if (c16609.f51025) {
            c16609.f51019.setVisibility(z ? 8 : 0);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39118() {
        if (this.f51019.getVisibility() == 8) {
            this.f51025 = true;
            if (m39120()) {
                return;
            }
            C4925.m14315(new RunnableC19384(1, this));
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m39121() {
        if (this.f51019.getVisibility() != 0) {
            return false;
        }
        boolean isChecked = this.f51020.isChecked();
        C22870.m50970(ApplicationC20075.f65008, "dfsmd", isChecked);
        return isChecked;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39116(C16609 c16609) {
        c16609.f51018.setText(C22927.m51020(c16609.f51023));
        c16609.f51024.setText(String.valueOf(c16609.f51027));
        c16609.f51017.setText(String.valueOf(c16609.f51026));
    }
}
