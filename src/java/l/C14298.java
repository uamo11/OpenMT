package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;
import java.util.regex.PatternSyntaxException;

/* compiled from: X5LN */
/* renamed from: l.ܳۙܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14298 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f43089;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static final ArrayList f43090;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static boolean f43091;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public long f43092;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EnumC8655 f43093;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5062 f43094;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public List f43095 = Collections.singletonList("");

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public EnumC9361 f43096;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f43097;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC16891 f43098;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final TextView f43099;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final View f43100;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public Runnable f43101;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CheckBox f43102;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final View f43103;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final TextView f43104;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f43105;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final CheckBox f43106;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final C16560 f43107;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C5062 f43108;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public List f43109;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC19944 f43110;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CheckBox f43111;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final TextView f43112;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View f43113;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CheckBox f43114;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f43115;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final TextView f43116;

    static {
        ArrayList arrayList = new ArrayList();
        f43090 = arrayList;
        arrayList.addAll(C23471.m51911(ApplicationC20075.f65008.mo18253("sir", (byte[]) null)));
        f43089 = Executors.newFixedThreadPool(Math.min(C17615.f53826, 3));
    }

    public C14298(C16560 c16560, InterfaceC19944 interfaceC19944) {
        EnumC8655 enumC8655;
        this.f43107 = c16560;
        this.f43110 = interfaceC19944;
        this.f43098 = c16560.m39044();
        View m10216 = c16560.m39056().m10216(R.layout.MT_Protector_res_0x7f0d00b1);
        this.f43099 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        View findViewById = m10216.findViewById(R.id.MT_Protector_res_0x7f0a01ef);
        this.f43103 = findViewById;
        this.f43104 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a01ee);
        this.f43108 = (C5062) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        C5062 c5062 = (C5062) m10216.findViewById(R.id.editText2);
        this.f43094 = c5062;
        CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00da);
        this.f43106 = checkBox;
        this.f43114 = (CheckBox) m10216.findViewById(R.id.checkBox2);
        CheckBox checkBox2 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00df);
        this.f43102 = checkBox2;
        CheckBox checkBox3 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00e0);
        this.f43111 = checkBox3;
        this.f43116 = (TextView) m10216.findViewById(R.id.textView1);
        this.f43112 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0630);
        View findViewById2 = m10216.findViewById(R.id.MT_Protector_res_0x7f0a052d);
        View findViewById3 = m10216.findViewById(R.id.MT_Protector_res_0x7f0a062f);
        this.f43113 = m10216.findViewById(R.id.MT_Protector_res_0x7f0a04d4);
        View findViewById4 = m10216.findViewById(R.id.MT_Protector_res_0x7f0a0265);
        this.f43100 = findViewById4;
        findViewById4.setOnClickListener(new ViewOnClickListenerC13382(3, this));
        findViewById4.setEnabled(!f43090.isEmpty());
        findViewById.setOnClickListener(new ViewOnClickListenerC10893(2, this));
        if (ApplicationC20075.f65008.contains("fsnm")) {
            enumC8655 = EnumC8655.m22414(ApplicationC20075.f65008.getInt("fsnm", EnumC8655.CONTAINS.m22418()));
        } else if (ApplicationC20075.f65008.contains("sir") || ApplicationC20075.f65008.contains("file_search_record") || ApplicationC20075.f65008.contains("file_search_record_empty")) {
            enumC8655 = EnumC8655.WILDCARD;
        } else {
            enumC8655 = EnumC8655.CONTAINS;
        }
        m34086(enumC8655);
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۬᩶ܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C14298.this.f43094.m14609(z);
            }
        });
        c5062.m14601(ApplicationC20075.f65008.getString("file_advanced_search", ""));
        checkBox2.setChecked(!ApplicationC20075.f65008.getBoolean("file_search_ignore_case", true));
        checkBox3.setChecked(ApplicationC20075.f65008.getBoolean("file_search_regex", false));
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean("file_search_sub", true));
        c5062.m14607().m25903(3);
        c5062.m14607().m30475(17.0f);
        c5062.m14598();
        try {
            this.f43115 = Long.parseLong(ApplicationC20075.f65008.getString("file_search_max_size", "-1"));
        } catch (NumberFormatException unused) {
            this.f43115 = -1L;
        }
        try {
            this.f43097 = Long.parseLong(ApplicationC20075.f65008.getString("file_search_min_size", "-1"));
        } catch (NumberFormatException unused2) {
            this.f43097 = -1L;
        }
        long j = this.f43097;
        if (j >= 0) {
            long j2 = this.f43115;
            if (j == j2 && j2 != C13132.FOREVER_NS) {
                this.f43115 = j2 + 1;
            }
        }
        this.f43116.setText(EnumC20650.m47232(j, this.f43115));
        findViewById2.setOnClickListener(new ViewOnClickListenerC12637(0, this));
        try {
            this.f43105 = Long.parseLong(ApplicationC20075.f65008.getString("fsmaxt", "-1"));
        } catch (NumberFormatException unused3) {
            this.f43105 = -1L;
        }
        try {
            this.f43092 = Long.parseLong(ApplicationC20075.f65008.getString("fsmint", "-1"));
        } catch (NumberFormatException unused4) {
            this.f43092 = -1L;
        }
        this.f43096 = EnumC9361.m24181(ApplicationC20075.f65008.getInt("fstp", 0));
        m34117();
        findViewById3.setOnClickListener(new ViewOnClickListenerC20259(2, this));
        this.f43114.setOnCheckedChangeListener(this);
        this.f43114.setChecked(f43091);
        C19258 buildDialog = c16560.m39056().buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterfaceOnClickListenerC18322(2, this));
        buildDialog.m44419(new DialogInterface.OnCancelListener() { // from class: l.ۢ᩶ܳ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C14298.m34087(C14298.this);
            }
        });
        DialogInterfaceC0206 m44438 = buildDialog.m44438();
        m44438.m1447().setOnClickListener(new ViewOnClickListenerC9110(0, this, m44438));
        C4925.m14329(this.f43108.m14607());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34119(List list) {
        this.f43095 = list;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34118(ArrayList arrayList, Runnable runnable) {
        this.f43109 = arrayList;
        this.f43101 = runnable;
        this.f43099.setText(R.string.MT_Protector_res_0x7f12090f);
        this.f43106.setVisibility(8);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34087(C14298 c14298) {
        c14298.m34108();
        Runnable runnable = c14298.f43101;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m34112(C14298 c14298) {
        c14298.m34108();
        Runnable runnable = c14298.f43101;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m34086(EnumC8655 enumC8655) {
        this.f43093 = enumC8655;
        int m22417 = enumC8655.m22417();
        TextView textView = this.f43104;
        textView.setText(m22417);
        this.f43103.setContentDescription(textView.getText());
        this.f43108.m14609(enumC8655 == EnumC8655.REGEX);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m34114(final C14298 c14298) {
        final EnumC8655[] values = EnumC8655.values();
        View view = c14298.f43103;
        C21282 c21282 = new C21282(view.getContext(), view, 0);
        C3060 m48304 = c21282.m48304();
        C12937.m31442(m48304, R.string.MT_Protector_res_0x7f12090a);
        for (int i = 0; i < values.length; i++) {
            m48304.add(0, i, i, values[i].m22416()).setCheckable(true);
        }
        m48304.setGroupCheckable(0, true, true);
        m48304.getItem(c14298.f43093.ordinal()).setChecked(true);
        c21282.m48302(new InterfaceC14930() { // from class: l.ܺ᩶ܳ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C14298.this.m34086(values[menuItem.getItemId()]);
                return true;
            }
        });
        C19871.m45698(c21282).m42637();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m34104(final C14298 c14298) {
        final EnumC20650[] values = EnumC20650.values();
        final int length = values.length;
        TextView textView = c14298.f43116;
        C21282 c21282 = new C21282(textView.getContext(), textView, 0);
        C3060 m48304 = c21282.m48304();
        m48304.add(0, length, 1, R.string.MT_Protector_res_0x7f12021d).setCheckable(true);
        int i = 0;
        while (i < values.length) {
            m48304.add(0, i, i == 0 ? 0 : i + 1, values[i].m47238()).setCheckable(true);
            i++;
        }
        m48304.setGroupCheckable(0, true, true);
        EnumC20650 m47231 = EnumC20650.m47231(c14298.f43097, c14298.f43115);
        m48304.findItem(m47231 == null ? length : m47231.ordinal()).setChecked(true);
        c21282.m48302(new InterfaceC14930() { // from class: l.ᩴ᩶ܳ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C14298.m34091(C14298.this, length, values, menuItem);
                return true;
            }
        });
        C19871.m45698(c21282).m42637();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34091(C14298 c14298, int i, EnumC20650[] enumC20650Arr, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == i) {
            C5189.m14943(c14298.f43107.m39056(), c14298.f43097, c14298.f43115, new C13970(c14298));
            return;
        }
        EnumC20650 enumC20650 = enumC20650Arr[itemId];
        long m47240 = enumC20650.m47240();
        long m47239 = enumC20650.m47239();
        c14298.f43097 = m47240;
        c14298.f43115 = m47239;
        c14298.f43116.setText(EnumC20650.m47232(m47240, m47239));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m34110(final C14298 c14298) {
        final EnumC9361[] values = EnumC9361.values();
        final int length = values.length;
        TextView textView = c14298.f43112;
        C21282 c21282 = new C21282(textView.getContext(), textView, 0);
        C3060 m48304 = c21282.m48304();
        m48304.add(0, length, 1, R.string.MT_Protector_res_0x7f12021d).setCheckable(true);
        int i = 0;
        while (i < values.length) {
            m48304.add(0, i, i == 0 ? 0 : i + 1, values[i].m24183()).setCheckable(true);
            i++;
        }
        m48304.setGroupCheckable(0, true, true);
        EnumC9361 enumC9361 = c14298.f43096;
        if (enumC9361 == null && c14298.f43092 == -1 && c14298.f43105 == -1) {
            enumC9361 = EnumC9361.ANY;
        }
        m48304.findItem(enumC9361 == null ? length : enumC9361.ordinal()).setChecked(true);
        c21282.m48302(new InterfaceC14930() { // from class: l.ۘ᩶ܳ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C14298.m34090(C14298.this, length, values, menuItem);
                return true;
            }
        });
        C19871.m45698(c21282).m42637();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34090(C14298 c14298, int i, EnumC9361[] enumC9361Arr, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == i) {
            c14298.m34113();
            C5189.m14942(c14298.f43107.m39056(), c14298.f43092, c14298.f43105, new C11505(c14298));
            return;
        }
        EnumC9361 enumC9361 = enumC9361Arr[itemId];
        if (enumC9361 != EnumC9361.ANY) {
            c14298.f43096 = enumC9361;
            c14298.m34113();
            c14298.m34117();
        } else {
            c14298.f43096 = null;
            c14298.f43092 = -1L;
            c14298.f43105 = -1L;
            c14298.m34117();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34092(C14298 c14298, long j, long j2) {
        c14298.f43097 = j;
        c14298.f43115 = j2;
        c14298.f43116.setText(EnumC20650.m47232(j, j2));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m34105(C14298 c14298, long j, long j2) {
        c14298.f43096 = null;
        c14298.f43092 = j;
        c14298.f43105 = j2;
        c14298.m34117();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m34117() {
        EnumC9361 enumC9361 = this.f43096;
        this.f43112.setText(enumC9361 == null ? EnumC9361.m24180(this.f43092, this.f43105) : enumC9361.m24183());
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m34113() {
        EnumC9361 enumC9361 = this.f43096;
        if (enumC9361 != null) {
            long[] m24184 = enumC9361.m24184(System.currentTimeMillis());
            this.f43092 = m24184[0];
            this.f43105 = m24184[1];
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m34111() {
        ApplicationC20075.f65008.edit().mo25855("sir", C23471.m51910(f43090)).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.֨᩶ܳ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m34085(final View view) {
        final CharSequence[] charSequenceArr = (CharSequence[]) C5378.stream(f43090).map(new C19694(0)).toArray(new C0642());
        C19258 buildDialog = this.f43107.m39056().buildDialog();
        C2072 c2072 = new C2072(R.layout.MT_Protector_res_0x7f0d0155, buildDialog.m44432(), Arrays.asList(charSequenceArr));
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120456);
        buildDialog.m44422(c2072, (DialogInterfaceOnClickListenerC1348) new DialogInterface.OnClickListener() { // from class: l.֨᩶ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C14298.m34088(C14298.this, i);
            }
        });
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        buildDialog.m44440(R.string.MT_Protector_res_0x7f1205b2, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 m44438 = buildDialog.m44438();
        m44438.m1443().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.۠᩶ܳ
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view2, int i, long j) {
                C14298.m34097(C14298.this, charSequenceArr, m44438, view, i);
                return true;
            }
        });
        m44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ܶ᩶ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C14298.m34095(C14298.this, m44438, view);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34088(C14298 c14298, int i) {
        C23471 c23471 = (C23471) f43090.get(i);
        c14298.m34086(c23471.m51919());
        c14298.f43108.m14601(c23471.m51924());
        c14298.f43106.setChecked(c23471.m51920());
        c14298.f43114.setChecked(c23471.m51914());
        c14298.f43097 = c23471.m51917();
        c14298.f43115 = c23471.m51918();
        c14298.f43092 = c23471.m51923();
        c14298.f43105 = c23471.m51916();
        c14298.f43096 = c23471.m51925();
        c14298.f43094.m14601(c23471.m51922());
        c14298.f43102.setChecked(c23471.m51926());
        c14298.f43111.setChecked(c23471.m51913());
        c14298.f43116.setText(EnumC20650.m47232(c14298.f43097, c14298.f43115));
        c14298.m34117();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34097(final C14298 c14298, CharSequence[] charSequenceArr, final DialogInterfaceC0206 dialogInterfaceC0206, final View view, final int i) {
        C19258 buildDialog = c14298.f43107.m39056().buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f1205ca);
        buildDialog.m44424(charSequenceArr[i]);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.᩸᩶ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C14298.m34089(C14298.this, i, dialogInterfaceC0206, view);
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34089(C14298 c14298, int i, DialogInterfaceC0206 dialogInterfaceC0206, View view) {
        ArrayList arrayList = f43090;
        arrayList.remove(i);
        m34111();
        dialogInterfaceC0206.dismiss();
        if (arrayList.isEmpty()) {
            c14298.f43100.setEnabled(false);
        } else {
            c14298.m34085(view);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34095(C14298 c14298, DialogInterfaceC0206 dialogInterfaceC0206, View view) {
        C10521 c10521 = new C10521(c14298, c14298.f43107.m39056(), dialogInterfaceC0206, view);
        c10521.m31258(R.string.MT_Protector_res_0x7f1205b2);
        c10521.m31261(R.string.MT_Protector_res_0x7f1204ab);
        c10521.m31265(C4925.m14327(R.string.MT_Protector_res_0x7f1204ac));
        c10521.m31276(2);
        c10521.m31268(2);
        c10521.m31244();
        c10521.m31266(true);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m34108() {
        InterfaceC13049 putString = ApplicationC20075.f65008.edit().putString("file_advanced_search", this.f43094.m14611().toString()).mo25853(this.f43093.m22418(), "fsnm").putBoolean("file_search_ignore_case", !this.f43102.isChecked()).putBoolean("file_search_regex", this.f43111.isChecked()).putBoolean("file_search_sub", this.f43106.isChecked()).putString("file_search_max_size", Long.toString(this.f43115)).putString("file_search_min_size", Long.toString(this.f43097)).putString("fsmaxt", Long.toString(this.f43105)).putString("fsmint", Long.toString(this.f43092));
        EnumC9361 enumC9361 = this.f43096;
        putString.mo25853(enumC9361 == null ? 0 : enumC9361.m24185(), "fstp").apply();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34094(C14298 c14298, DialogInterfaceC0206 dialogInterfaceC0206) {
        DialogInterface.OnDismissListener onDismissListener;
        C11459 c11459;
        long j;
        long j2;
        long j3;
        long j4;
        C16560 c16560;
        DialogInterface.OnDismissListener onDismissListener2;
        long j5;
        C11459 m28259;
        C11459 c114592;
        DialogInterface.OnDismissListener onDismissListener3;
        CheckBox checkBox = c14298.f43106;
        C16560 c165602 = c14298.f43107;
        CheckBox checkBox2 = c14298.f43102;
        CheckBox checkBox3 = c14298.f43111;
        C5062 c5062 = c14298.f43094;
        c14298.m34113();
        C5062 c50622 = c14298.f43108;
        String obj = c50622.m14611().toString();
        CheckBox checkBox4 = c14298.f43114;
        if (checkBox4.isChecked()) {
            long j6 = c14298.f43115;
            j = EnumC20650.m47236(c14298.f43097, j6);
            long j7 = c14298.f43092;
            j2 = j6;
            long j8 = c14298.f43105;
            if (c5062.m14614() == 0) {
                onDismissListener3 = null;
                c114592 = null;
                j5 = j8;
            } else {
                String obj2 = c5062.m14611().toString();
                if (!checkBox3.isChecked()) {
                    obj2 = C3939.m11985(obj2);
                }
                try {
                    if (checkBox2.isChecked()) {
                        j5 = j8;
                        m28259 = C11459.m28259(8, obj2);
                    } else {
                        j5 = j8;
                        m28259 = C11459.m28259(74, obj2);
                    }
                    c114592 = m28259;
                    onDismissListener3 = null;
                } catch (PatternSyntaxException e) {
                    c165602.m39056().m10223(e, (DialogInterface.OnDismissListener) null);
                    return;
                }
            }
            c11459 = c114592;
            j4 = j5;
            j3 = j7;
            onDismissListener = onDismissListener3;
        } else {
            onDismissListener = null;
            c11459 = null;
            j = -1;
            j2 = -1;
            j3 = -1;
            j4 = -1;
        }
        try {
            c16560 = c165602;
            onDismissListener2 = onDismissListener;
            try {
                C17079 c17079 = new C17079(obj, c14298.f43093, checkBox.isChecked(), j, j2, j3, j4, c11459);
                if (checkBox4.isChecked()) {
                    c5062.m14610();
                }
                c50622.m14610();
                c14298.m34108();
                final C23471 c23471 = new C23471(c50622.m14611().toString(), c14298.f43093, checkBox.isChecked(), checkBox4.isChecked(), c14298.f43097, c14298.f43115, c14298.f43092, c14298.f43105, c14298.f43096, c5062.m14611().toString(), checkBox2.isChecked(), checkBox3.isChecked());
                Predicate predicate = new Predicate() { // from class: l.ۖ᩶ܳ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate2) {
                        return C19285.$default$and(this, predicate2);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public /* synthetic */ Predicate mo4928negate() {
                        return C19285.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate2) {
                        return C19285.$default$or(this, predicate2);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj3) {
                        return C23471.this.m51915((C23471) obj3);
                    }
                };
                ArrayList arrayList = f43090;
                C5378.removeIf(arrayList, predicate);
                arrayList.add(0, c23471);
                while (arrayList.size() > 100) {
                    C18473.m42953(arrayList, 1);
                }
                m34111();
                dialogInterfaceC0206.dismiss();
                new C7698(c14298, c17079).m20274();
            } catch (PatternSyntaxException e2) {
                e = e2;
                c16560.m39056().m10223(e, onDismissListener2);
            }
        } catch (PatternSyntaxException e3) {
            e = e3;
            c16560 = c165602;
            onDismissListener2 = onDismissListener;
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f43113.setVisibility(z ? 0 : 8);
        f43091 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34099(final C16560 c16560, final InterfaceC19944 interfaceC19944, final C16415 c16415) {
        View m10216 = c16560.m39056().m10216(R.layout.MT_Protector_res_0x7f0d00cc);
        int i = 0;
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(C4925.m14306(R.string.MT_Protector_res_0x7f120901, Integer.valueOf(c16415.f50492.size())));
        C9503 c9503 = (C9503) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02e0);
        C4915.m14284(c9503);
        final C10772 c10772 = new C10772(c16415, c16560, c9503);
        c9503.setAdapter((ListAdapter) c10772);
        c9503.setSelection(c16415.f50491);
        c9503.setFastScrollEnabled(true);
        C19258 buildDialog = c16560.m39056().buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        buildDialog.m44420(new DialogInterfaceOnDismissListenerC21105(i, c16415, c9503));
        String str = c16415.f50493;
        if (str.equals("local")) {
            buildDialog.m44434(R.string.MT_Protector_res_0x7f12017b, new DialogInterfaceOnClickListenerC5582(i, c16415, c10772));
            buildDialog.m44437("↕", new DialogInterface.OnClickListener() { // from class: l.᩹᩶ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C16560.this.m39033("//SEARCH//" + c16415.hashCode(), true);
                }
            });
        } else {
            buildDialog.m44440(R.string.MT_Protector_res_0x7f12017b, new DialogInterface.OnClickListener() { // from class: l.᩶᩶ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C16415 c164152 = C16415.this;
                    BaseAdapter baseAdapter = c10772;
                    synchronized (c164152) {
                        c164152.f50492.clear();
                    }
                    baseAdapter.notifyDataSetChanged();
                }
            });
        }
        final DialogInterfaceC0206 m44438 = buildDialog.m44438();
        ImageView imageView = (ImageView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0640);
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.MT_Protector_res_0x7f080237);
        C17648.m41327(imageView, C4925.m14333(R.string.MT_Protector_res_0x7f12090f));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ۙ᩶ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC19944.this.mo13541(c16560, view, c16415, new C1599(m44438));
            }
        });
        if (str.equals("local")) {
            Drawable mutate = c16560.m39056().getResources().getDrawable(R.drawable.MT_Protector_res_0x7f08021e).mutate();
            mutate.setColorFilter(C14096.m33704(C21943.f70257));
            Button m1448 = m44438.m1448();
            int textSize = (int) m1448.getTextSize();
            mutate.setBounds(0, 0, textSize, textSize);
            SpannableString spannableString = new SpannableString("↕");
            spannableString.setSpan(new ImageSpan(mutate), 0, 1, 33);
            m1448.setText(spannableString);
        }
        c9503.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۗ᩶ܳ
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                DialogInterfaceC0206.this.dismiss();
                C16415 c164152 = c16415;
                C12182 c12182 = (C12182) c164152.f50492.get(i2);
                c12182.f36324 = true;
                InterfaceC17889 m29658 = c12182.m29658();
                String name = m29658.getName();
                C16560 c165602 = c16560;
                c165602.m39053(name);
                c165602.m39033(m29658.getParent(), c164152.f50493.equals("local"));
            }
        });
        C8960.m23097(m44438);
    }
}
