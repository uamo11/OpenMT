package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;

/* compiled from: Q6ZJ */
/* renamed from: l.ۙۙۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4417 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C2978 f14127;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C21282 f14128;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C8650 f14129;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C2978 f14130;

    public C4417(AbstractActivityC3346 abstractActivityC3346, String str, C14293 c14293, boolean z, C8650 c8650) {
        super(abstractActivityC3346, -1);
        this.f14129 = c8650;
        m31258(R.string.MT_Protector_res_0x7f1209f3);
        m31270();
        m31274(true);
        m31252(false);
        m31243();
        m31245(C11266.m27878(6.0f));
        m31269();
        m31287(8);
        m31261(R.string.MT_Protector_res_0x7f1209f1);
        m31265("Referer: https://example.com/\nCookie: session=value\nX-Custom-Header: value");
        m31244();
        m31250((CharSequence) c14293.m34078());
        m31284();
        m31247(R.string.MT_Protector_res_0x7f12017b, new ViewOnClickListenerC20186(1, this), (ViewOnLongClickListenerC23553) null);
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00fb);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a0255).setOnClickListener(new View.OnClickListener() { // from class: l.᩵ۙۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4417.m13143(C4417.this, view);
            }
        });
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a0253).setOnClickListener(new View.OnClickListener() { // from class: l.֡ۙۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4417.this.m13144("Referer", (String) null);
            }
        });
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a024b).setOnClickListener(new ViewOnClickListenerC13129(1, this));
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a0250).setOnClickListener(new View.OnClickListener() { // from class: l.ۚۙۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4417.m13140(C4417.this, view);
            }
        });
        C2978 c2978 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a024c);
        this.f14127 = c2978;
        c2978.setChecked(c14293.m34077());
        C2978 c29782 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0252);
        this.f14130 = c29782;
        boolean z2 = str.length() <= 2000 && C10062.m25250(str) == EnumC12178.VALID;
        c29782.setEnabled(z2);
        c29782.setChecked(z2 && z);
        m31286().addView(m10216);
        m31286().setVisibility(0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13139(C4417 c4417) {
        c4417.m31250("");
        c4417.m31251((String) null);
        c4417.m13142(0, 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13140(final C4417 c4417, View view) {
        C21282 c21282 = c4417.f14128;
        if (c21282 != null) {
            c21282.m48299();
        }
        C21282 c212822 = new C21282(c4417.m31271(), view, 0);
        c4417.f14128 = c212822;
        c212822.m48301(new C22056(c4417));
        String[] strArr = {"Origin", "Authorization", "Accept", "Accept-Language"};
        for (int i = 0; i < 4; i++) {
            final String str = strArr[i];
            c212822.m48304().add(str).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.֨ۙۜ
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    C4417.this.m13144(str, (String) null);
                    return true;
                }
            });
        }
        c212822.m48305();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m13143(final C4417 c4417, View view) {
        C21282 c21282 = c4417.f14128;
        if (c21282 != null) {
            c21282.m48299();
        }
        C21282 c212822 = new C21282(c4417.m31271(), view, 0);
        c4417.f14128 = c212822;
        c212822.m48301(new C22056(c4417));
        c212822.m48304().add(R.string.MT_Protector_res_0x7f1209fb).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.۠ۙۜ
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C4417.this.m13144("User-Agent", "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36");
                return true;
            }
        });
        c212822.m48304().add(R.string.MT_Protector_res_0x7f1209fc).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.ܶۙۜ
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C4417.this.m13144("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
                return true;
            }
        });
        c212822.m48304().add(R.string.MT_Protector_res_0x7f12021d).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.᩸ۙۜ
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C4417.this.m13144("User-Agent", (String) null);
                return true;
            }
        });
        c212822.m48305();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13141(C4417 c4417, C21282 c21282) {
        if (c4417.f14128 == c21282) {
            c4417.f14128 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13144(String str, String str2) {
        String m31260 = m31260();
        int i = 0;
        while (i <= m31260.length()) {
            int indexOf = m31260.indexOf(10, i);
            if (indexOf < 0) {
                indexOf = m31260.length();
            }
            int indexOf2 = m31260.indexOf(58, i);
            if (indexOf2 >= i && indexOf2 < indexOf && str.equalsIgnoreCase(m31260.substring(i, indexOf2).trim())) {
                int i2 = indexOf2 + 1;
                while (i2 < indexOf && (m31260.charAt(i2) == ' ' || m31260.charAt(i2) == '\t')) {
                    i2++;
                }
                if (indexOf > i2 && m31260.charAt(indexOf - 1) == '\r') {
                    indexOf--;
                }
                if (str2 != null) {
                    m31267().replace(i2, indexOf, str2);
                    indexOf = str2.length() + i2;
                }
                m13142(i2, indexOf);
                return;
            }
            if (indexOf == m31260.length()) {
                break;
            } else {
                i = indexOf + 1;
            }
        }
        InterfaceC7785 m31267 = m31267();
        if (!m31260.isEmpty() && C7416.m19937(1, m31260) != '\n') {
            m31267.append('\n');
        }
        m31267.append((CharSequence) str).append(": ");
        int length = m31267.length();
        if (str2 != null) {
            m31267.append((CharSequence) str2);
        }
        m13142(length, m31267.length());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m13142(int i, int i2) {
        m31246(i, i2);
        C10235 c10235 = (C10235) m31278().m1433(R.id.MT_Protector_res_0x7f0a017d);
        if (c10235 != null) {
            c10235.requestFocus();
            C4925.m14329(c10235);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        int i;
        try {
            this.f14129.accept(C14293.m34076(m31260(), this.f14127.isChecked()), Boolean.valueOf(this.f14130.isChecked()));
            m31262();
        } catch (C17822 e) {
            int i2 = C19940.f64597[e.m41762().ordinal()];
            if (i2 == 1) {
                i = R.string.MT_Protector_res_0x7f1209eb;
            } else if (i2 == 2) {
                i = R.string.MT_Protector_res_0x7f1209ea;
            } else if (i2 == 3) {
                i = R.string.MT_Protector_res_0x7f1209ec;
            } else if (i2 == 4) {
                i = R.string.MT_Protector_res_0x7f1209e8;
            } else {
                if (i2 != 5) {
                    throw new IncompatibleClassChangeError();
                }
                i = R.string.MT_Protector_res_0x7f1209ed;
            }
            int i3 = 0;
            m31251(m31271().getString(R.string.MT_Protector_res_0x7f1209e9, Integer.valueOf(e.m41761()), m31271().getString(i)));
            String m31260 = m31260();
            for (int i4 = 1; i4 < e.m41761(); i4++) {
                int indexOf = m31260.indexOf(10, i3);
                i3 = indexOf < 0 ? m31260.length() : indexOf + 1;
            }
            int indexOf2 = m31260.indexOf(10, i3);
            if (indexOf2 < 0) {
                indexOf2 = m31260.length();
            }
            m13142(i3, indexOf2);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C21282 c21282 = this.f14128;
        if (c21282 != null) {
            c21282.m48299();
        }
    }
}
