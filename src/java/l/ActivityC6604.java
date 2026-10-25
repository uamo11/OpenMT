package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: K5R1 */
/* renamed from: l.ۜۜᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ActivityC6604 extends AbstractActivityC3346 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public static String f20334;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f20335 = 0;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C23537 f20336;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public ListView f20337;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC15069 f20338;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C12609 f20339;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC20010 f20340;

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "ArscEditor";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20336 = (C23537) new C4741(this).m13885(C23537.class);
        C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C23328 c23328 = new C23328(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m28891(c23328);
        m10214();
        m10241(R.layout.MT_Protector_res_0x7f0d0034);
        m10241(R.string.MT_Protector_res_0x7f1200e8);
        this.f10584 = (C9762) m10241(R.id.MT_Protector_res_0x7f0a063a);
        ListView listView = (ListView) m10241(android.R.id.list);
        this.f20337 = listView;
        listView.setFastScrollEnabled(true);
        m10227(this.f10584);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC15566(0, this));
        this.f20338 = new ViewOnClickListenerC15069(this);
        this.f20340 = new ViewOnClickListenerC20010(this);
        if (this.f20336.f75570) {
            m18111();
        } else {
            if (C16999.m39873((AbstractActivityC3346) this)) {
                return;
            }
            new C14155(this).m20274();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public void m18111() {
        C19096 c19096 = new C19096(this);
        ListView listView = this.f20337;
        C12609 c12609 = new C12609(c19096);
        this.f20339 = c12609;
        listView.setAdapter((ListAdapter) c12609);
        this.f20337.setOnScrollListener(new C7806(this));
        this.f20339.m14112(this.f20337);
        this.f20339.m10504(true);
        this.f20339.m10506();
        this.f20337.setOnItemClickListener(this);
        this.f20337.setOnItemLongClickListener(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        switch (C12040.f36026[this.f20336.m52000().ordinal()]) {
            case 1:
            case 2:
            case 3:
                C23537 c23537 = this.f20336;
                if (c23537.f75580) {
                    i = c23537.f75571[i];
                }
                c23537.f75576 = c23537.f75566.getValue(i);
                C21282 c21282 = new C21282(this, view, 0);
                c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205ca, 0, R.string.MT_Protector_res_0x7f1205ca);
                c21282.m48302(new InterfaceC14930() { // from class: l.֨᩻ᩳ
                    @Override // l.InterfaceC14930
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i2 = ActivityC6604.f20335;
                        if (menuItem.getItemId() == R.string.MT_Protector_res_0x7f1205ca) {
                            final ActivityC6604 activityC6604 = ActivityC6604.this;
                            C23537 c235372 = activityC6604.f20336;
                            String m30772 = c235372.f75569.m30772(c235372.f75576.mo5006());
                            int i3 = DialogInterfaceC0206.f1451;
                            C19258 c19258 = new C19258(activityC6604);
                            c19258.m44433(R.string.MT_Protector_res_0x7f1205ca);
                            c19258.m44424(activityC6604.getString(R.string.MT_Protector_res_0x7f120870, m30772));
                            final int i4 = i;
                            c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.֡᩻ᩳ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) {
                                    ActivityC6604 activityC66042 = ActivityC6604.this;
                                    activityC66042.f20336.f75566.m43651(i4);
                                    activityC66042.f20336.f75576 = null;
                                    activityC66042.f20339.notifyDataSetChanged();
                                    activityC66042.f20336.f75587 = true;
                                }
                            });
                            c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                            c19258.m44438();
                        }
                        return true;
                    }
                });
                C18342.m42767(view, c21282);
                return true;
            case 4:
            default:
                return false;
            case 5:
            case 8:
            case 9:
                final EnumC4487 m52000 = this.f20336.m52000();
                if (m52000 == EnumC4487.CONFIG) {
                    C23537 c235372 = this.f20336;
                    c235372.f75566 = (C18906) c235372.f75579.get(c235372.f75588 ? c235372.f75582[i] : i);
                } else if (m52000 == EnumC4487.SEARCH_BY_ID) {
                    m18110((C18906) this.f20336.f75572.get(i));
                } else if (m52000 == EnumC4487.SEARCH_VALUE) {
                    m18110(((C5193) this.f20336.f75573.get(i)).f16276);
                } else {
                    throw new IllegalStateException(m52000.name());
                }
                C21282 c212822 = new C21282(this, view, 0);
                if (m52000 != EnumC4487.SEARCH_BY_ID) {
                    c212822.m48304().add(0, R.string.menu_copy_id, 0, R.string.menu_copy_id);
                }
                c212822.m48304().add(0, R.string.MT_Protector_res_0x7f1205f2, 0, R.string.MT_Protector_res_0x7f1205f2);
                c212822.m48304().add(0, R.string.MT_Protector_res_0x7f1205ca, 0, R.string.MT_Protector_res_0x7f1205ca);
                c212822.m48302(new InterfaceC14930() { // from class: l.᩵᩻ᩳ
                    @Override // l.InterfaceC14930
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i2 = ActivityC6604.f20335;
                        int itemId = menuItem.getItemId();
                        final ActivityC6604 activityC6604 = ActivityC6604.this;
                        if (itemId == R.string.menu_copy_id) {
                            C4925.m14308(R.string.MT_Protector_res_0x7f120461, activityC6604.f20336.f75566.mo47886());
                        } else if (itemId == R.string.MT_Protector_res_0x7f1205f2) {
                            activityC6604.f20338.m35670();
                        } else if (itemId == R.string.MT_Protector_res_0x7f1205ca) {
                            int i3 = DialogInterfaceC0206.f1451;
                            C19258 c19258 = new C19258(activityC6604);
                            c19258.m44433(R.string.MT_Protector_res_0x7f1205ca);
                            c19258.m44424(activityC6604.getString(R.string.MT_Protector_res_0x7f120870, activityC6604.f20336.f75566.mo29406()));
                            final EnumC4487 enumC4487 = m52000;
                            final int i4 = i;
                            c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۚ᩻ᩳ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) {
                                    ActivityC6604 activityC66042 = ActivityC6604.this;
                                    C23537 c235373 = activityC66042.f20336;
                                    c235373.f75568.m8399(c235373.f75566.mo47883());
                                    EnumC4487 enumC44872 = EnumC4487.CONFIG;
                                    EnumC4487 enumC44873 = enumC4487;
                                    int i6 = i4;
                                    if (enumC44873 == enumC44872) {
                                        C23537 c235374 = activityC66042.f20336;
                                        if (c235374.f75588) {
                                            c235374.f75584--;
                                            while (true) {
                                                C23537 c235375 = activityC66042.f20336;
                                                if (i6 >= c235375.f75584) {
                                                    break;
                                                }
                                                int[] iArr = c235375.f75582;
                                                int i7 = i6 + 1;
                                                iArr[i6] = iArr[i7] - 1;
                                                i6 = i7;
                                            }
                                        }
                                        activityC66042.f20336.m51999();
                                    } else if (enumC44873 == EnumC4487.SEARCH_BY_ID) {
                                        activityC66042.f20336.f75572.remove(i6);
                                    } else if (enumC44873 == EnumC4487.SEARCH_VALUE) {
                                        activityC66042.f20336.f75573.remove(i6);
                                    } else {
                                        throw new IllegalStateException(enumC44873.name());
                                    }
                                    activityC66042.f20336.f75566 = null;
                                    activityC66042.f20339.notifyDataSetChanged();
                                    activityC66042.f20336.f75587 = true;
                                }
                            });
                            c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                            c19258.m44438();
                        }
                        return true;
                    }
                });
                C18342.m42767(view, c212822);
                return true;
            case 6:
                if (i >= 3) {
                    C23537 c235373 = this.f20336;
                    c235373.f75577 = c235373.f75578.mo14957(i - 3);
                    C10838 c10838 = new C10838(this, this);
                    c10838.m31258(R.string.MT_Protector_res_0x7f1202dd);
                    c10838.m31250((CharSequence) this.f20336.f75577.getPackageName());
                    c10838.m31279(6);
                    c10838.m31281();
                    c10838.m31266(true);
                    return true;
                }
                return false;
            case 7:
                C23537 c235374 = this.f20336;
                c235374.f75568 = c235374.f75574.mo2877(i);
                this.f20336.m51999();
                C21282 c212823 = new C21282(this, view, 0);
                c212823.m48304().add(0, R.string.MT_Protector_res_0x7f1205c2, 0, R.string.MT_Protector_res_0x7f1205c2);
                if (this.f20336.f75574.mo2871() > 1) {
                    c212823.m48304().add(0, R.string.MT_Protector_res_0x7f1205ca, 0, R.string.MT_Protector_res_0x7f1205ca);
                }
                c212823.m48304().add(0, R.string.MT_Protector_res_0x7f1205f9, 0, R.string.MT_Protector_res_0x7f1205f9);
                c212823.m48302(new InterfaceC14930() { // from class: l.᩸᩻ᩳ
                    @Override // l.InterfaceC14930
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i2 = ActivityC6604.f20335;
                        int itemId = menuItem.getItemId();
                        final ActivityC6604 activityC6604 = ActivityC6604.this;
                        if (itemId == R.string.MT_Protector_res_0x7f1205c2) {
                            C16481 c16481 = new C16481(activityC6604, activityC6604);
                            c16481.m31258(R.string.MT_Protector_res_0x7f1205c2);
                            c16481.m31250((CharSequence) activityC6604.f20336.f75568.mo18742());
                            c16481.m31244();
                            c16481.m31279(6);
                            c16481.m31281();
                            c16481.m31266(true);
                            return true;
                        }
                        if (itemId == R.string.MT_Protector_res_0x7f1205ca) {
                            int i3 = DialogInterfaceC0206.f1451;
                            C19258 c19258 = new C19258(activityC6604);
                            c19258.m44433(R.string.MT_Protector_res_0x7f1205ca);
                            c19258.m44424(activityC6604.getString(R.string.MT_Protector_res_0x7f120870, activityC6604.f20336.f75568.mo18744()));
                            final int i4 = i;
                            c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.۬᩻ᩳ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) {
                                    ActivityC6604 activityC66042 = ActivityC6604.this;
                                    activityC66042.f20336.f75574.m46626(i4);
                                    C23537 c235375 = activityC66042.f20336;
                                    c235375.f75568 = null;
                                    c235375.f75579.clear();
                                    activityC66042.f20339.notifyDataSetChanged();
                                    activityC66042.f20336.f75587 = true;
                                }
                            });
                            c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                            c19258.m44438();
                            return true;
                        }
                        if (itemId == R.string.MT_Protector_res_0x7f1205f9) {
                            C17893 c17893 = new C17893(activityC6604, activityC6604);
                            c17893.m31258(R.string.MT_Protector_res_0x7f1205f9);
                            c17893.m31250((CharSequence) activityC6604.f20336.f75568.mo18742());
                            c17893.m31244();
                            c17893.m31279(6);
                            c17893.m31242();
                            c17893.m31266(true);
                        }
                        return true;
                    }
                });
                C18342.m42767(view, c212823);
                return true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18110(C18906 c18906) {
        C23537 c23537 = this.f20336;
        c23537.f75566 = c18906;
        c23537.f75568 = c18906.mo29410();
        C23537 c235372 = this.f20336;
        c235372.f75574 = c235372.f75568.getType();
        C23537 c235373 = this.f20336;
        c235373.f75577 = c235373.f75574.m46616();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (C12040.f36026[this.f20336.m52000().ordinal()]) {
            case 1:
            case 2:
            case 3:
                C23537 c23537 = this.f20336;
                if (c23537.f75580) {
                    i = c23537.f75571[i];
                }
                c23537.f75576 = c23537.f75566.getValue(i);
                this.f20340.m46148();
                break;
            case 4:
                C17187 c17187 = new C17187(this, this);
                c17187.m31258(R.string.MT_Protector_res_0x7f1202dd);
                c17187.m31270();
                C23537 c235372 = this.f20336;
                C13260 c13260 = c235372.f75567;
                if (c235372.f75588) {
                    i = c235372.f75582[i];
                }
                c235372.f75565 = i;
                c17187.m31250((CharSequence) c13260.m47858(i));
                c17187.m31242();
                c17187.m31266(true);
                break;
            case 5:
                if (!this.f20336.f75574.getTypeName().equals("id")) {
                    C23537 c235373 = this.f20336;
                    ArrayList arrayList = c235373.f75579;
                    if (c235373.f75588) {
                        i = c235373.f75582[i];
                    }
                    c235373.f75566 = (C18906) arrayList.get(i);
                    if (this.f20336.f75566.mo29412()) {
                        setTitle(this.f20336.f75568.mo18744() + '/' + this.f20336.f75566.mo29406());
                        m18107(EnumC4487.ENTRY);
                        break;
                    } else {
                        C23537 c235374 = this.f20336;
                        c235374.f75576 = c235374.f75566.getValue();
                        this.f20340.m46148();
                        break;
                    }
                }
                break;
            case 6:
                if (i == 0) {
                    m10241(R.string.MT_Protector_res_0x7f120a00);
                    m18107(EnumC4487.STRING_POOL);
                    break;
                } else if (i == 1) {
                    new C14364(this, this).m31332();
                    break;
                } else if (i != 2) {
                    C23537 c235375 = this.f20336;
                    c235375.f75577 = c235375.f75578.mo14957(i - 3);
                    setTitle(this.f20336.f75577.getPackageName());
                    m18107(EnumC4487.PACKAGE);
                    break;
                } else {
                    C12745 c12745 = new C12745(this, this);
                    c12745.m31258(R.string.search_by_id);
                    c12745.m31250((CharSequence) f20334);
                    c12745.m31244();
                    c12745.m31279(3);
                    String str = f20334;
                    if (str != null && str.length() > 0) {
                        c12745.m31281();
                    }
                    c12745.m31266(true);
                    break;
                }
            case 7:
                C23537 c235376 = this.f20336;
                c235376.f75568 = c235376.f75574.mo2877(i);
                this.f20336.m51999();
                setTitle(this.f20336.f75568.mo18744());
                m18107(EnumC4487.CONFIG);
                break;
            case 8:
                C23537 c235377 = this.f20336;
                c235377.f75566 = (C18906) c235377.f75572.get(i);
                if (this.f20336.f75566.mo29412()) {
                    C23537 c235378 = this.f20336;
                    c235378.f75568 = c235378.f75566.mo29410();
                    this.f20336.m51999();
                    C23537 c235379 = this.f20336;
                    c235379.f75574 = c235379.f75568.getType();
                    setTitle(this.f20336.f75568.mo18744() + '/' + this.f20336.f75566.mo29406());
                    m18107(EnumC4487.SEARCH_BY_ID_IN);
                    break;
                } else {
                    C23537 c2353710 = this.f20336;
                    c2353710.f75576 = c2353710.f75566.getValue();
                    this.f20340.m46148();
                    break;
                }
            case 9:
                m18110(((C5193) this.f20336.f75573.get(i)).f16276);
                if (this.f20336.f75566.mo29412()) {
                    setTitle(this.f20336.f75568.mo18744() + "/" + this.f20336.f75566.mo29406());
                    m18107(EnumC4487.SEARCH_VALUE_IN);
                    break;
                } else {
                    C23537 c2353711 = this.f20336;
                    c2353711.f75576 = c2353711.f75566.getValue();
                    this.f20340.m46148();
                    break;
                }
            case 10:
                C23537 c2353712 = this.f20336;
                c2353712.f75574 = c2353712.f75577.getType(i);
                if (this.f20336.f75574.mo2871() == 1 && this.f20336.f75574.getTypeName().equals("id")) {
                    C23537 c2353713 = this.f20336;
                    c2353713.f75568 = c2353713.f75574.mo2877(0);
                    this.f20336.m51999();
                    setTitle(this.f20336.f75568.mo18744());
                    m18107(EnumC4487.CONFIG);
                    break;
                } else {
                    setTitle(this.f20336.f75574.getTypeName());
                    m18107(EnumC4487.TYPE);
                    break;
                }
                break;
        }
    }

    @Override // l.ActivityC2124
    /* renamed from: ᩴ */
    public final void mo2954() {
        m18114();
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m18114() {
        if (this.f20336.f75587) {
            int i = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(this);
            c19258.m44433(R.string.MT_Protector_res_0x7f120b7b);
            c19258.m44416(R.string.MT_Protector_res_0x7f1208cd);
            c19258.m44442(R.string.MT_Protector_res_0x7f1208c6, new DialogInterface.OnClickListener() { // from class: l.ۙ᩻ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = ActivityC6604.f20335;
                    new C10629(ActivityC6604.this, true).m20274();
                }
            });
            c19258.m44434(R.string.MT_Protector_res_0x7f120319, new DialogInterfaceOnClickListenerC3573(0, this));
            c19258.m44438();
            return;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public void m18117() {
        C23537 c23537 = this.f20336;
        C8322 c8322 = c23537.f75577;
        C20317 c20317 = c23537.f75574;
        C2678 c2678 = c23537.f75568;
        C18906 c18906 = c23537.f75566;
        switch (C12040.f36026[c23537.m52000().ordinal()]) {
            case 1:
                C23537 c235372 = this.f20336;
                if (c235372.f75580) {
                    c235372.f75580 = false;
                    this.f20339.notifyDataSetChanged();
                    setTitle(c2678.mo18744() + '/' + c18906.mo29406());
                    break;
                } else {
                    setTitle(c235372.f75588 ? getString(R.string.MT_Protector_res_0x7f1203de, c235372.f75583) : c2678.mo18744());
                    m18107(EnumC4487.CONFIG);
                    break;
                }
            case 2:
                C23537 c235373 = this.f20336;
                if (c235373.f75580) {
                    c235373.f75580 = false;
                    this.f20339.notifyDataSetChanged();
                    setTitle(c2678.mo18744() + '/' + c18906.mo29406());
                    break;
                } else {
                    setTitle(f20334);
                    m18107(EnumC4487.SEARCH_BY_ID);
                    break;
                }
            case 3:
                C23537 c235374 = this.f20336;
                if (c235374.f75580) {
                    c235374.f75580 = false;
                    this.f20339.notifyDataSetChanged();
                    setTitle(c2678.mo18744() + "/" + c18906.mo29406());
                    break;
                } else {
                    setTitle(c235374.f75581);
                    m18107(EnumC4487.SEARCH_VALUE);
                    break;
                }
            case 4:
                C23537 c235375 = this.f20336;
                if (c235375.f75588) {
                    c235375.f75588 = false;
                    this.f20339.notifyDataSetChanged();
                    m10241(R.string.MT_Protector_res_0x7f120a00);
                    break;
                } else {
                    m10241(R.string.MT_Protector_res_0x7f1200e8);
                    m18107(EnumC4487.MAIN);
                    break;
                }
            case 5:
                C23537 c235376 = this.f20336;
                if (c235376.f75588) {
                    c235376.f75588 = false;
                    this.f20339.notifyDataSetChanged();
                    setTitle(c2678.mo18744());
                    break;
                } else if (c20317.mo2871() == 1 && c20317.getTypeName().equals("id")) {
                    setTitle(c8322.getPackageName());
                    m18107(EnumC4487.PACKAGE);
                    break;
                } else {
                    setTitle(c20317.getTypeName());
                    m18107(EnumC4487.TYPE);
                    break;
                }
            case 6:
                m18114();
                break;
            case 7:
                setTitle(c8322.getPackageName());
                m18107(EnumC4487.PACKAGE);
                break;
            case 8:
            case 9:
                this.f20336.f75573.clear();
                this.f20336.f75572.clear();
                m10241(R.string.MT_Protector_res_0x7f1200e8);
                m18107(EnumC4487.MAIN);
                break;
            case 10:
                m10241(R.string.MT_Protector_res_0x7f1200e8);
                m18107(EnumC4487.MAIN);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014c, code lost:
    
        if (r9.equals("array") == false) goto L59;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onOptionsItemSelected(android.view.MenuItem r9) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC6604.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector_res_0x7f0f0001, menu);
        SubMenu subMenu = menu.findItem(R.id.more).getSubMenu();
        C11003.requireNonNull(subMenu);
        final MenuItem findItem = subMenu.findItem(R.id.MT_Protector_res_0x7f0a0341);
        final MenuItem findItem2 = subMenu.findItem(R.id.MT_Protector_res_0x7f0a0372);
        final MenuItem findItem3 = subMenu.findItem(R.id.MT_Protector_res_0x7f0a0327);
        final MenuItem findItem4 = subMenu.findItem(R.id.MT_Protector_res_0x7f0a0370);
        this.f20336.f75585.m1668(this, new InterfaceC1008() { // from class: l.۠᩻ᩳ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                EnumC4487 enumC4487 = (EnumC4487) obj;
                int i = ActivityC6604.f20335;
                EnumC4487 enumC44872 = EnumC4487.STRING_POOL;
                findItem2.setVisible(enumC4487 == enumC44872);
                findItem.setVisible(enumC4487 == enumC44872 || enumC4487 == EnumC4487.CONFIG || enumC4487 == EnumC4487.ENTRY || enumC4487 == EnumC4487.SEARCH_VALUE_IN || enumC4487 == EnumC4487.SEARCH_BY_ID_IN);
                EnumC4487 enumC44873 = EnumC4487.TYPE;
                findItem3.setVisible(enumC4487 == enumC44873 || enumC4487 == EnumC4487.CONFIG || enumC4487 == EnumC4487.ENTRY);
                findItem4.setVisible(enumC4487 == enumC44873);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m18107(EnumC4487 enumC4487) {
        EnumC4487 m52000 = this.f20336.m52000();
        this.f20336.f75586[m52000.ordinal()] = this.f20337.getFirstVisiblePosition();
        this.f20336.f75585.mo1669(enumC4487);
        this.f20339.m10504(true);
        this.f20339.m10506();
        this.f20339.notifyDataSetChanged();
        if (m52000 == EnumC4487.SEARCH_VALUE || m52000 == EnumC4487.SEARCH_VALUE_IN || m52000 == EnumC4487.SEARCH_BY_ID || m52000 == EnumC4487.SEARCH_BY_ID_IN) {
            return;
        }
        this.f20337.setSelection(this.f20336.f75586[enumC4487.ordinal()]);
    }
}
