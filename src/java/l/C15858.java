package l;

import android.animation.ObjectAnimator;
import android.view.MenuItem;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: U8VQ */
/* renamed from: l.ܺۢᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C15858 extends AbstractC5447 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C5242 f49002;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C5242 f49003;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5242 f49004;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C5242 f49005;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final C5242 f49006;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C5242 f49007;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C5242 f49008;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C5242 f49009;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5242 f49010;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C5242 f49011;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5242 f49012;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5242 f49013;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C5242 f49014;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C5242 f49015;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C5242 f49016;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C5242 f49017;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C5242 f49018;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C5242 f49019;

    public C15858() {
        Boolean bool = Boolean.FALSE;
        this.f49008 = new C5242(bool);
        this.f49006 = new C5242(bool);
        this.f49019 = new C5242(bool);
        this.f49002 = new C5242(bool);
        this.f49016 = new C5242(bool);
        this.f49014 = new C5242(bool);
        this.f49011 = new C5242(bool);
        this.f49007 = new C5242(bool);
        this.f49013 = new C5242(bool);
        this.f49004 = new C5242(bool);
        this.f49012 = new C5242(bool);
        this.f49018 = new C5242();
        this.f49010 = new C5242(0);
        this.f49005 = new C5242(-1);
        this.f49017 = new C5242();
        this.f49015 = new C5242(0);
        this.f49009 = new C5242(-1);
        this.f49003 = new C5242();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37568(ActivityC1748 activityC1748, C17601 c17601) {
        this.f49008.m1668(activityC1748, c17601);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m37588(boolean z) {
        this.f49008.mo1669(Boolean.valueOf(z));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37565(ActivityC1748 activityC1748, final MenuItem menuItem, final MenuItem menuItem2, final C17061 c17061, final C17061 c170612) {
        int defaultColor = C21943.f70298.getDefaultColor();
        c17061.m40038(defaultColor);
        c170612.m40038(defaultColor);
        menuItem.setIcon(c17061);
        menuItem2.setIcon(c170612);
        this.f49019.m1668(activityC1748, new InterfaceC1008() { // from class: l.ᩳۢᩳ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                C15858.m37560(C15858.this, c17061, menuItem, (Boolean) obj);
            }
        });
        this.f49002.m1668(activityC1748, new InterfaceC1008() { // from class: l.ܿۢᩳ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                C15858.m37559(C15858.this, c170612, menuItem2, (Boolean) obj);
            }
        });
        this.f49006.m1668(activityC1748, new InterfaceC1008() { // from class: l.ܳۢᩳ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                C15858.m37558(C15858.this, menuItem, menuItem2, c17061, c170612, (Boolean) obj);
            }
        });
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37560(C15858 c15858, C17061 c17061, MenuItem menuItem, Boolean bool) {
        c17061.m40037(bool.booleanValue() ? 1.0f : 0.45f);
        if (Boolean.TRUE.equals(c15858.f49006.m1662())) {
            menuItem.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37559(C15858 c15858, C17061 c17061, MenuItem menuItem, Boolean bool) {
        c17061.m40037(bool.booleanValue() ? 1.0f : 0.45f);
        if (Boolean.TRUE.equals(c15858.f49006.m1662())) {
            menuItem.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37558(C15858 c15858, MenuItem menuItem, MenuItem menuItem2, C17061 c17061, C17061 c170612, Boolean bool) {
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            menuItem.setTitle(R.string.MT_Protector_res_0x7f1205d3);
            menuItem2.setTitle(R.string.MT_Protector_res_0x7f1205d2);
            menuItem.setEnabled(bool2.equals(c15858.f49019.m1662()));
            menuItem2.setEnabled(bool2.equals(c15858.f49002.m1662()));
            c17061.m40044(300);
            c170612.m40044(300);
            return;
        }
        menuItem.setTitle(R.string.MT_Protector_res_0x7f12079e);
        menuItem2.setTitle(R.string.MT_Protector_res_0x7f1206db);
        menuItem.setEnabled(true);
        menuItem2.setEnabled(true);
        c17061.m40036();
        c170612.m40036();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m37583() {
        Boolean bool = Boolean.FALSE;
        C5242 c5242 = this.f49006;
        c5242.mo1669(Boolean.valueOf(bool.equals(c5242.m1662())));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m37589() {
        return Boolean.TRUE.equals(this.f49006.m1662());
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m37571(boolean z) {
        C5242 c5242 = this.f49019;
        if (((Boolean) c5242.m1662()).booleanValue() != z) {
            c5242.mo1669(Boolean.valueOf(z));
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m37592(boolean z) {
        C5242 c5242 = this.f49002;
        if (((Boolean) c5242.m1662()).booleanValue() != z) {
            c5242.mo1669(Boolean.valueOf(z));
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m37591(ActivityC1748 activityC1748, MenuItem menuItem) {
        C23620 c23620 = new C23620(0, this, menuItem);
        this.f49016.m1668(activityC1748, c23620);
        this.f49014.m1668(activityC1748, c23620);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m37570(boolean z) {
        C5242 c5242 = this.f49016;
        if (((Boolean) c5242.m1662()).booleanValue() != z) {
            c5242.mo1669(Boolean.valueOf(z));
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m37590(boolean z) {
        C5242 c5242 = this.f49014;
        if (((Boolean) c5242.m1662()).booleanValue() != z) {
            c5242.mo1669(Boolean.valueOf(z));
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m37582(boolean z) {
        C5242 c5242 = this.f49011;
        if (((Boolean) c5242.m1662()).booleanValue() != z) {
            c5242.mo1669(Boolean.valueOf(z));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37564(ActivityC1748 activityC1748, final MenuItem menuItem, final MenuItem menuItem2) {
        this.f49007.m1668(activityC1748, new InterfaceC1008() { // from class: l.ۜۢᩳ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                menuItem.setChecked(((Boolean) obj).booleanValue());
                menuItem2.setEnabled(!r3.booleanValue());
            }
        });
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m37578(boolean z) {
        C5242 c5242 = this.f49007;
        if (((Boolean) c5242.m1662()).booleanValue() != z) {
            c5242.mo1669(Boolean.valueOf(z));
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m37585(boolean z) {
        C5242 c5242 = this.f49013;
        if (((Boolean) c5242.m1662()).booleanValue() != z) {
            c5242.mo1669(Boolean.valueOf(z));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37569(boolean z) {
        C5242 c5242 = this.f49004;
        if (((Boolean) c5242.m1662()).booleanValue() != z) {
            c5242.mo1669(Boolean.valueOf(z));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37576(boolean z) {
        C5242 c5242 = this.f49012;
        if (((Boolean) c5242.m1662()).booleanValue() != z) {
            c5242.mo1669(Boolean.valueOf(z));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37567(ActivityC1748 activityC1748, TextView textView, C3865 c3865) {
        C11003.requireNonNull(textView);
        this.f49018.m1668(activityC1748, new C14531(1, textView));
        this.f49010.m1668(activityC1748, new C20799(textView));
        this.f49005.m1668(activityC1748, new C9510(c3865));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37573(String str) {
        C5242 c5242 = this.f49018;
        if (C11003.equals(c5242.m1662(), str)) {
            return;
        }
        c5242.mo1669(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37572(int i) {
        C5242 c5242 = this.f49010;
        if (((Integer) c5242.m1662()).intValue() != i) {
            c5242.mo1669(Integer.valueOf(i));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37561(int i) {
        C5242 c5242 = this.f49005;
        if (((Integer) c5242.m1662()).intValue() != i) {
            c5242.mo1669(Integer.valueOf(i));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37575(ActivityC1748 activityC1748, TextView textView, C3865 c3865) {
        C11003.requireNonNull(textView);
        this.f49017.m1668(activityC1748, new C14531(1, textView));
        this.f49015.m1668(activityC1748, new C20799(textView));
        this.f49009.m1668(activityC1748, new C9510(c3865));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m37580(String str) {
        C5242 c5242 = this.f49017;
        if (C11003.equals(c5242.m1662(), str)) {
            return;
        }
        c5242.mo1669(str);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m37586(int i) {
        C5242 c5242 = this.f49015;
        if (((Integer) c5242.m1662()).intValue() != i) {
            c5242.mo1669(Integer.valueOf(i));
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m37579(int i) {
        C5242 c5242 = this.f49009;
        if (((Integer) c5242.m1662()).intValue() != i) {
            c5242.mo1669(Integer.valueOf(i));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37566(ActivityC1748 activityC1748, final TextView textView) {
        this.f49003.m1668(activityC1748, new InterfaceC1008(this) { // from class: l.ۧۢᩳ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                String str = (String) obj;
                TextView textView2 = textView;
                Object tag = textView2.getTag();
                if (tag instanceof ObjectAnimator) {
                    ((ObjectAnimator) tag).cancel();
                }
                if (str != null && !str.isEmpty()) {
                    if (textView2.getAlpha() != 1.0f) {
                        textView2.setAlpha(1.0f);
                    }
                    textView2.setText(str);
                } else {
                    ObjectAnimator duration = ObjectAnimator.ofFloat(textView2, "alpha", 1.0f, 0.1f).setDuration(200L);
                    duration.addListener(new C8804(textView2));
                    duration.start();
                    textView2.setTag(duration);
                }
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37562(String str) {
        C5242 c5242 = this.f49003;
        if (C11003.equals(c5242.m1662(), str)) {
            return;
        }
        c5242.mo1669(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37563(ActivityC1748 activityC1748, MenuItem menuItem) {
        C11003.requireNonNull(menuItem);
        this.f49004.m1668(activityC1748, new C16564(0, menuItem));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37574(ActivityC1748 activityC1748, MenuItem menuItem) {
        C11003.requireNonNull(menuItem);
        this.f49012.m1668(activityC1748, new C16564(0, menuItem));
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m37577(ActivityC1748 activityC1748, MenuItem menuItem) {
        C11003.requireNonNull(menuItem);
        this.f49014.m1668(activityC1748, new C16564(0, menuItem));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m37584(ActivityC1748 activityC1748, MenuItem menuItem) {
        C11003.requireNonNull(menuItem);
        this.f49016.m1668(activityC1748, new C16564(0, menuItem));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m37581(ActivityC1748 activityC1748, MenuItem menuItem) {
        C11003.requireNonNull(menuItem);
        this.f49011.m1668(activityC1748, new C22222(1, menuItem));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m37587(ActivityC1748 activityC1748, MenuItem menuItem) {
        C11003.requireNonNull(menuItem);
        this.f49013.m1668(activityC1748, new C22222(1, menuItem));
    }
}
