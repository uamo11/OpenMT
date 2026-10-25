package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: F1FR */
/* renamed from: l.ۙ᩺᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C4966 extends AbstractC14346 implements InterfaceC0440 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C18683 f15647 = new C18683();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C19452 f15648;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC4474 f15649;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C0452 f15650;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C3764 f15651;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f15652;

    @Override // l.AbstractC14346
    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean mo14418() {
        return false;
    }

    @Override // l.AbstractC14346
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String mo14419() {
        return null;
    }

    @Override // l.AbstractC14346
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo14420() {
        return R.drawable.MT_Protector_res_0x7f0802a2;
    }

    public C4966() {
        super(R.layout.MT_Protector_res_0x7f0d0047);
        setHasOptionsMenu(true);
        m34234("000000-0000-0000-0000-000000000001");
    }

    @Override // l.AbstractC14346
    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String mo14421() {
        return C4925.m14327(R.string.MT_Protector_res_0x7f1200e9);
    }

    @Override // l.AbstractC14346
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String mo14422() {
        return C4925.m14327(R.string.MT_Protector_res_0x7f1200e9);
    }

    @Override // l.AbstractC14346, l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3764 c3764 = (C3764) new C4741(requireActivity()).m13885(C3764.class);
        this.f15651 = c3764;
        c3764.m11411().m1668(this, new InterfaceC1008() { // from class: l.ܶ᩺᩷
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                C4966.m14415(C4966.this, (C19452) obj);
            }
        });
        this.f15649 = new C21900(this, getChildFragmentManager());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14415(C4966 c4966, C19452 c19452) {
        c4966.f15648 = c19452;
        c4966.f15652 = c19452.m44837();
        if (c4966.isHidden()) {
            return;
        }
        c4966.m34227(new C8494(c4966, false));
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        C0452 c0452 = (C0452) view.findViewById(R.id.MT_Protector_res_0x7f0a0685);
        this.f15650 = c0452;
        c0452.m2029(this.f15649);
        this.f15650.m2028(new C22605(this));
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(this.f15650);
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C20489(this));
        C3764 c3764 = this.f15651;
        InterfaceC23586 viewLifecycleOwner = getViewLifecycleOwner();
        C0452 c04522 = this.f15650;
        C11003.requireNonNull(c04522);
        c3764.m11409(viewLifecycleOwner, new C7516(2, c04522));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14416(C4966 c4966, boolean z, ActivityC17169 activityC17169) {
        if (!z) {
            activityC17169.setTitle(R.string.MT_Protector_res_0x7f1200e9);
            activityC17169.m40340((CharSequence) c4966.f15652);
        } else {
            activityC17169.m40340((CharSequence) null);
        }
    }

    @Override // l.AbstractC14346, l.ComponentCallbacksC9205
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        m34227(new C8494(this, z));
    }

    @Override // l.AbstractC14346, l.ComponentCallbacksC9205
    public final void onResume() {
        super.onResume();
        if (isHidden()) {
            return;
        }
        m34227(new C8494(this, false));
    }

    @Override // l.InterfaceC0440
    /* renamed from: ֫ */
    public final boolean mo1996() {
        if (this.f15650 == null) {
            return false;
        }
        InterfaceC4557 m14899 = getChildFragmentManager().m14899("android:switcher:" + this.f15650.getId() + ":" + this.f15650.m2038());
        return (m14899 instanceof InterfaceC0440) && ((InterfaceC0440) m14899).mo1996();
    }

    @Override // l.ComponentCallbacksC9205
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        ActivityC17169 activityC17169 = (ActivityC17169) requireActivity();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector_res_0x7f0a0375) {
            activityC17169.m40357();
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a0378) {
            activityC17169.m40361();
            return true;
        }
        boolean z = false;
        if (itemId == R.id.more) {
            boolean z2 = this.f15648 != null && this.f15650.m2038() == 0;
            MenuItem findItem = menuItem.getSubMenu().findItem(R.id.MT_Protector_res_0x7f0a033f);
            if (z2 && !this.f15648.m44852().isEmpty()) {
                z = true;
            }
            findItem.setVisible(z);
            menuItem.getSubMenu().findItem(R.id.MT_Protector_res_0x7f0a0354).setVisible(z2);
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a033f || itemId == R.id.MT_Protector_res_0x7f0a0354) {
            this.f15651.m11382(itemId);
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a033c) {
            activityC17169.m40345(false);
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a032d) {
            C19452 c19452 = this.f15648;
            if (c19452 != null) {
                c19452.m36264(activityC17169);
            }
            return true;
        }
        if (itemId != R.id.MT_Protector_res_0x7f0a0380) {
            if (itemId == R.id.MT_Protector_res_0x7f0a0373) {
                activityC17169.m40352();
                return true;
            }
            return super.onOptionsItemSelected(menuItem);
        }
        ActivityC17169 activityC171692 = (ActivityC17169) requireActivity();
        View m10216 = activityC171692.m10216(R.layout.MT_Protector_res_0x7f0d0087);
        C2978 c2978 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a045f);
        c2978.setChecked(ApplicationC20075.f65008.getBoolean("psri", true));
        C19258 buildDialog = activityC171692.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC21028(3, c2978));
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        C5088.m14637(buildDialog.m44438());
        return true;
    }

    @Override // l.ComponentCallbacksC9205
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.MT_Protector_res_0x7f0f0002, menu);
        MenuItem findItem = ((InterfaceMenuC23000) menu).findItem(R.id.more).getSubMenu().findItem(R.id.MT_Protector_res_0x7f0a0378);
        C5242 m11418 = this.f15651.m11418();
        InterfaceC23586 viewLifecycleOwner = getViewLifecycleOwner();
        C11003.requireNonNull(findItem);
        m11418.m1668(viewLifecycleOwner, new C19323(findItem));
    }
}
