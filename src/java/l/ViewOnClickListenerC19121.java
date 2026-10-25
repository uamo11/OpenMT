package l;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: 6AY4 */
/* renamed from: l.᩵֡᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC19121 extends AbstractActivityC3346 implements View.OnClickListener {

    /* renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f60235 = 0;

    /* renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public int f60236;

    /* renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public C5652 f60237;

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public boolean f60240;

    /* renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public long f60242;

    /* renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public C12346 f60243;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public View f60244;

    /* renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f60245;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public final int f60246;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public final C8817 f60247;

    /* renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public int f60249;

    /* renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public List f60251;

    /* renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public C16773 f60252;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public C5561 f60253;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public EditText f60255;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C11083 f60256;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C12623 f60257;

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public String f60258;

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public List f60259;

    /* renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public C23592 f60260;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public C19712 f60261;

    /* renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public List f60262;

    /* renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public C2447 f60263;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C14771 f60265;

    /* renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet f60250 = new HashSet();

    /* renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public final HashSet f60248 = new HashSet();

    /* renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public final C17709 f60264 = new C17709(this);

    /* renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public int f60239 = ApplicationC20075.f65008.getInt("fcsp", 0);

    /* renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public boolean f60241 = ApplicationC20075.f65008.getBoolean("fcrp", false);

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public String f60238 = "";

    /* renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public int f60254 = R.string.MT_Protector_res_0x7f12070a;

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "FilePickerActivity";
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        C11233.m27805(menu, "menu");
        getMenuInflater().inflate(R.menu.MT_Protector_res_0x7f0f000c, menu);
        SubMenu subMenu = menu.findItem(R.id.MT_Protector_res_0x7f0a0388).getSubMenu();
        C11233.m27799(subMenu);
        ArrayList arrayList = new ArrayList();
        subMenu.clear();
        MenuItem add = subMenu.add(R.id.MT_Protector_res_0x7f0a0388, R.string.MT_Protector_res_0x7f12052e, 0, R.string.MT_Protector_res_0x7f1208bf);
        C11233.m27803(add, "add(...)");
        C19883 c19883 = C19883.f64190;
        C11233.m27803(c19883, "ROOT");
        m44081(add, c19883);
        arrayList.add("/");
        MenuItem add2 = subMenu.add(R.id.MT_Protector_res_0x7f0a0388, R.string.MT_Protector_res_0x7f12052f, 0, R.string.MT_Protector_res_0x7f1209e3);
        C11233.m27803(add2, "add(...)");
        C19883 c198832 = C19883.f64180;
        C11233.m27803(c198832, "SDCARD");
        m44081(add2, c198832);
        arrayList.add(C16293.f50120.mo23554());
        Iterator it = ((ArrayList) C19739.m45451()).iterator();
        while (it.hasNext()) {
            C4216 c4216 = (C4216) it.next();
            MenuItem add3 = subMenu.add(R.id.MT_Protector_res_0x7f0a0388, arrayList.size() + R.string.MT_Protector_res_0x7f12052e, 0, c4216.f13686);
            C11233.m27803(add3, "add(...)");
            C19883 c198833 = C19883.f64180;
            C11233.m27803(c198833, "SDCARD");
            m44081(add3, c198833);
            arrayList.add(c4216.f13687.getPath());
        }
        for (C4027 c4027 : C18844.m43546()) {
            MenuItem add4 = subMenu.add(R.id.MT_Protector_res_0x7f0a0388, arrayList.size() + R.string.MT_Protector_res_0x7f12052e, 0, c4027.f12781);
            C11233.m27803(add4, "add(...)");
            C19883 c198834 = C19883.f64181;
            C11233.m27803(c198834, "FOLDER");
            m44081(add4, c198834);
            arrayList.add(c4027.m12120());
        }
        this.f60251 = arrayList;
        return true;
    }

    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C11233.m27805(bundle, "outState");
        super.onSaveInstanceState(bundle);
        C16773 c16773 = this.f60252;
        if (c16773 != null) {
            C10130 c10130 = new C10130();
            c16773.mo6004(c10130);
            bundle.putByteArray("visitorData", c10130.m25444());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44081(MenuItem menuItem, C19883 c19883) {
        C11233.m27805(c19883, "typeIcon");
        menuItem.setIcon(c19883.f64248.m28878());
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C11233.m27805(menuItem, "selectedMenuItem");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.more) {
            SubMenu subMenu = menuItem.getSubMenu();
            C11233.m27799(subMenu);
            subMenu.findItem(R.id.MT_Protector_res_0x7f0a0382).setChecked(C17315.m40631());
            subMenu.findItem(R.id.MT_Protector_res_0x7f0a0381).setChecked(C17315.m40629());
            C8058 c8058 = C8058.f24861;
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a036d) {
            m44098(this, false, (InterfaceC2123) null, 2);
            C8058 c80582 = C8058.f24861;
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a0341) {
            C5009.m14500();
            C23592 c23592 = this.f60260;
            if (c23592 == null) {
                C11233.m27804("searchView");
                throw null;
            }
            if (!c23592.m52061()) {
                C23592 c235922 = this.f60260;
                if (c235922 != null) {
                    c235922.m52054((String) null);
                } else {
                    C11233.m27804("searchView");
                    throw null;
                }
            }
            C23592 c235923 = this.f60260;
            if (c235923 == null) {
                C11233.m27804("searchView");
                throw null;
            }
            c235923.m52058(true);
            C8058 c80583 = C8058.f24861;
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a0385) {
            new C10654(this);
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a0382) {
            boolean z = !menuItem.isChecked();
            menuItem.setChecked(z);
            C17315.m40628(z);
            m44098(this, true, (InterfaceC2123) null, 4);
            C8058 c80584 = C8058.f24861;
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a0381) {
            boolean z2 = !menuItem.isChecked();
            menuItem.setChecked(z2);
            C17315.m40625(z2);
            m44098(this, true, (InterfaceC2123) null, 4);
            C8058 c80585 = C8058.f24861;
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a033c) {
            finish();
            C8058 c80586 = C8058.f24861;
            return true;
        }
        if (menuItem.getGroupId() == R.id.MT_Protector_res_0x7f0a0388) {
            int i = itemId - R.string.MT_Protector_res_0x7f12052e;
            List list = this.f60251;
            if (i >= 0 && i < list.size()) {
                m44083((String) list.get(i), (InterfaceC2123) null);
                return true;
            }
        }
        return false;
    }

    public ViewOnClickListenerC19121() {
        List list = Collections.EMPTY_LIST;
        C11233.m27803(list, "emptyList(...)");
        this.f60262 = list;
        this.f60259 = list;
        this.f60236 = -1;
        this.f60246 = ApplicationC20075.f65010.getInt("fltp", 0);
        this.f60240 = true;
        this.f60251 = list;
        this.f60245 = new AtomicInteger();
        this.f60247 = C8817.m22787();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final void m44129(ViewOnClickListenerC19121 viewOnClickListenerC19121, int i) {
        viewOnClickListenerC19121.f60239 = i;
        ApplicationC20075.f65008.edit().mo25853(i, "fcsp").apply();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m44097(ViewOnClickListenerC19121 viewOnClickListenerC19121, boolean z) {
        viewOnClickListenerC19121.f60241 = z;
        C22870.m50970(ApplicationC20075.f65008, "fcrp", z);
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10214();
        m10241(R.layout.MT_Protector_res_0x7f0d0026);
        C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C23353 c23353 = new C23353(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m28891(c23353);
        Intent intent = getIntent();
        C11233.m27803(intent, "getIntent(...)");
        if (C11233.m27802((Object) intent.getAction(), (Object) "android.intent.action.GET_CONTENT")) {
            setTitle(R.string.MT_Protector_res_0x7f12092a);
        } else {
            setTitle(getIntent().getIntExtra("title", R.string.MT_Protector_res_0x7f120393));
        }
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector_res_0x7f0a063a);
        this.f10584 = c9762;
        m10227(c9762);
        AbstractC10446 m4111 = m4111();
        if (m4111 != null) {
            m4111.mo26300(true);
        }
        c9762.setNavigationIcon(R.drawable.MT_Protector_res_0x7f0801a9);
        c9762.setNavigationOnClickListener(new ViewOnClickListenerC9264(this, 2));
        c9762.setSubtitle("...");
        TextView m34924 = C14624.m34924(c9762);
        TextView m34923 = C14624.m34923(c9762);
        m34923.setEllipsize(TextUtils.TruncateAt.START);
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: l.ۢ᩵᩷
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ViewOnClickListenerC19121.m44114(ViewOnClickListenerC19121.this);
                return true;
            }
        };
        ViewOnClickListenerC11416 viewOnClickListenerC11416 = new ViewOnClickListenerC11416(4, this);
        m34924.setOnClickListener(viewOnClickListenerC11416);
        m34923.setOnClickListener(viewOnClickListenerC11416);
        m34924.setOnLongClickListener(onLongClickListener);
        m34923.setOnLongClickListener(onLongClickListener);
        View m10241 = m10241(R.id.file_name);
        C11233.m27803(m10241, "view(...)");
        this.f60255 = (EditText) m10241;
        View m102412 = m10241(R.id.MT_Protector_res_0x7f0a0486);
        C11233.m27803(m102412, "view(...)");
        this.f60263 = (C2447) m102412;
        View m102413 = m10241(R.id.MT_Protector_res_0x7f0a04a1);
        C11233.m27803(m102413, "view(...)");
        this.f60243 = (C12346) m102413;
        View m102414 = m10241(R.id.MT_Protector_res_0x7f0a0094);
        C11233.m27803(m102414, "view(...)");
        this.f60244 = m102414;
        C12623 c12623 = new C12623(this);
        this.f60257 = c12623;
        C2447 c2447 = this.f60263;
        if (c2447 == null) {
            C11233.m27804("recyclerView");
            throw null;
        }
        c2447.setAdapter(c12623);
        C12346 c12346 = this.f60243;
        if (c12346 == null) {
            C11233.m27804("swipeRefreshLayout");
            throw null;
        }
        c12346.m29957(new C4157(this));
        C2447 c24472 = this.f60263;
        if (c24472 == null) {
            C11233.m27804("recyclerView");
            throw null;
        }
        c24472.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC18974(0, this));
        View m102415 = m10241(R.id.MT_Protector_res_0x7f0a0096);
        C11233.m27803(m102415, "view(...)");
        this.f60261 = (C19712) m102415;
        View m102416 = m10241(R.id.MT_Protector_res_0x7f0a0091);
        C11233.m27803(m102416, "view(...)");
        C14771 c14771 = (C14771) m102416;
        this.f60265 = c14771;
        final Window window = getWindow();
        final int statusBarColor = window.getStatusBarColor();
        c14771.m35117(new InterfaceC23944() { // from class: l.۠ܺ᩷
            {
                int i = 378135578;
                int i2 = C11340.f33930;
                int i3 = C4263.f13799;
                int m2566 = (i3 - C0630.m2566("ܳۙ")) * 93;
                int i4 = ((m2566 ^ i2) * (-7675)) ^ 998805692;
                int i5 = 1999966778;
                while (true) {
                    i = ((((i ^ i2) * (-30389)) >> 31) & i4) ^ (m2566 ^ i5);
                    switch (i) {
                        case -2099925983:
                        case -295996919:
                            C2958.m9034();
                            if (C3911.f12484 < 0) {
                                m2566 = C0630.m2566("۬᩹") ^ i2;
                                i4 = ((m2566 ^ i3) * 1145) ^ (-257386873);
                                i5 = 664781107;
                            } else {
                                m2566 = C2105.m6981("ۚۨ") ^ i2;
                                i4 = ((m2566 ^ i3) * (-20653)) ^ (-1660438326);
                                i5 = 1282613871;
                            }
                        case -1738940899:
                        case 677106937:
                            if (C1128.f4106 <= 0) {
                                m2566 = C0630.m2566("۬᩹") ^ i2;
                                i4 = ((m2566 ^ i3) * 1145) ^ (-257386873);
                                i5 = 664781107;
                            } else {
                                m2566 = (C0630.m2566("۠᩻") ^ i3) * (-29);
                                i4 = ((m2566 ^ i2) * (-15015)) ^ (-1121003954);
                                i5 = 1293806777;
                            }
                        case -1731225997:
                        case 1549832448:
                            if (C3663.f11553) {
                                m2566 = C0630.m2566("۬᩹") ^ i2;
                                i4 = ((m2566 ^ i3) * 1145) ^ (-257386873);
                                i5 = 664781107;
                            } else {
                                m2566 = C2105.m6981("᩹᩵") ^ i3;
                                i4 = ((m2566 ^ i2) * (-4399)) ^ (-192937458);
                                i5 = -1743703264;
                            }
                        case -1682145256:
                        case 1997411733:
                            if (C0798.m2998() != 0) {
                                m2566 = C2105.m6981("᩹᩵") ^ i3;
                                i4 = ((m2566 ^ i2) * (-4399)) ^ (-192937458);
                                i5 = -1743703264;
                            } else {
                                m2566 = (C0630.m2566("۫᩺") ^ i3) * (-121);
                                i4 = ((m2566 ^ i2) * 30729) ^ 2075912272;
                                i5 = 1585492723;
                            }
                        case -1483417427:
                        case 1393952440:
                            if (C2167.f7158 >= 0) {
                                m2566 = (C0630.m2566("۠᩻") ^ i3) * (-29);
                                i4 = ((m2566 ^ i2) * (-15015)) ^ (-1121003954);
                                i5 = 1293806777;
                            } else {
                                m2566 = C0630.m2566("ᩴۤ") ^ i2;
                                i4 = ((m2566 ^ i3) * (-29817)) ^ 537929137;
                                i5 = 1335205332;
                            }
                        case -1404152556:
                        case 1508495506:
                            C0630.m2564();
                            m2566 = C0630.m2566("۬᩹") ^ i2;
                            i4 = ((m2566 ^ i3) * 1145) ^ (-257386873);
                            i5 = 664781107;
                        case -1087935225:
                        case -197516435:
                            if (C2105.f7037 != 0) {
                                m2566 = C0630.m2566("ۨ֨") ^ i3;
                                i4 = ((m2566 ^ i2) * (-17945)) ^ (-110888860);
                                i5 = -1232511287;
                            } else {
                                m2566 = C2105.m6981("֨۬") ^ i2;
                                i4 = ((m2566 ^ i3) * (-14225)) ^ 1203229132;
                                i5 = -2065039263;
                            }
                        case -828080094:
                        case 1913811296:
                            if (C2520.f8000 >= 0) {
                                m2566 = C0630.m2566("۬᩹") ^ i2;
                                i4 = ((m2566 ^ i3) * 1145) ^ (-257386873);
                                i5 = 664781107;
                            } else {
                                m2566 = (C0630.m2566("ۤܽ") + i3) * (-55);
                                i4 = ((m2566 ^ i2) * (-23901)) ^ 609980105;
                                i5 = -1704284219;
                            }
                        case -656754227:
                        case 1492118693:
                            if (C2958.m9034() <= 0) {
                                m2566 = C0630.m2566("۬᩹") ^ i2;
                                i4 = ((m2566 ^ i3) * 1145) ^ (-257386873);
                                i5 = 664781107;
                            } else {
                                m2566 = (C0630.m2566("ۧ֡") ^ i3) * 65;
                                i4 = ((m2566 ^ i2) * (-7859)) ^ 1011723628;
                                i5 = 1459572207;
                            }
                        case -324006086:
                        case 1516837388:
                            if (C4616.f14690 <= 0) {
                                m2566 = C0630.m2566("۬᩹") ^ i2;
                                i4 = ((m2566 ^ i3) * 1145) ^ (-257386873);
                                i5 = 664781107;
                            } else {
                                m2566 = (i2 - C0630.m2566("ܽ᩵")) * (-95);
                                i4 = ((m2566 ^ i3) * (-27671)) ^ (-511741500);
                                i5 = -1671282903;
                            }
                        case -206235902:
                        case -148408492:
                            C4159.m12565();
                            throw new RuntimeException();
                        case 493277917:
                        case 1693439367:
                            if (C0050.m940() <= 0) {
                                m2566 = C2105.m6981("᩹᩵") ^ i3;
                                i4 = ((m2566 ^ i2) * (-4399)) ^ (-192937458);
                                i5 = -1743703264;
                            } else {
                                m2566 = C0630.m2566("ۛᩴ") ^ i2;
                                i4 = ((m2566 ^ i3) * (-11305)) ^ (-809773808);
                                i5 = -1567531504;
                            }
                        case 513647106:
                        case 2101298279:
                            if (RunnableC0588.f2309 >= 0) {
                                m2566 = C2105.m6981("ۚۨ") ^ i2;
                                i4 = ((m2566 ^ i3) * (-20653)) ^ (-1660438326);
                                i5 = 1282613871;
                            } else {
                                m2566 = C2105.m6981("᩵ۡ") ^ i3;
                                i4 = ((m2566 ^ i2) * (-3851)) ^ 935788946;
                                i5 = -1067110071;
                            }
                        case 659389646:
                        case 1992005589:
                            if (C0714.f2697 >= 0) {
                                m2566 = C0630.m2566("۬᩹") ^ i2;
                                i4 = ((m2566 ^ i3) * 1145) ^ (-257386873);
                                i5 = 664781107;
                            } else {
                                m2566 = (C0630.m2566("ܿ᩺") ^ i3) * (-91);
                                i4 = ((m2566 ^ i2) * 24433) ^ 348974715;
                                i5 = -568678003;
                            }
                        case 1281305189:
                        case 1354797337:
                            return;
                        default:
                            if (C0964.m3413()) {
                                m2566 = (i2 - C0630.m2566("᩻᩷")) * 67;
                                i4 = ((m2566 ^ i3) * 32059) ^ 486836045;
                                i5 = -717457128;
                            } else {
                                m2566 = C2105.m6981("᩹᩵") ^ i3;
                                i4 = ((m2566 ^ i2) * (-4399)) ^ (-192937458);
                                i5 = -1743703264;
                            }
                    }
                }
            }

            @Override // l.InterfaceC23944
            /* renamed from: ֫ */
            public final void mo18946(float f) {
                float f2 = 0.0f;
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 17589096;
                int i5 = C3746.f11829;
                int i6 = C0630.f2410;
                int m2566 = C0630.m2566("ۨᩴ") ^ i5;
                int i7 = ((m2566 ^ i6) * 20581) ^ 1912098364;
                int i8 = 50741964;
                while (true) {
                    i4 = ((((i4 ^ i6) * (-9731)) >> 31) & i7) ^ (m2566 ^ i8);
                    switch (i4) {
                        case -2042076051:
                        case -1415427393:
                            if (RunnableC1937.f6483 >= 0) {
                                m2566 = (C0630.m2566("ᩳۜ") ^ i6) * (-15);
                                i7 = ((m2566 ^ i5) * (-27785)) ^ (-205655300);
                                i8 = 81012750;
                            } else {
                                m2566 = C2105.m6981("֫ۢ") ^ i6;
                                i7 = ((m2566 ^ i5) * 12945) ^ (-1605008660);
                                i8 = -1685430923;
                            }
                        case -1889509855:
                        case -1649277381:
                            i = (int) (f * f2);
                            if (C0422.f1886 <= 0) {
                                m2566 = (C0630.m2566("ᩳۜ") ^ i6) * (-15);
                                i7 = ((m2566 ^ i5) * (-27785)) ^ (-205655300);
                                i8 = 81012750;
                            } else {
                                m2566 = C2105.m6981("᩸ۡ") ^ i5;
                                i7 = ((m2566 ^ i6) * 27803) ^ 1791791356;
                                i8 = -1396053914;
                            }
                        case -1847739401:
                        case 6905280:
                            if (C0483.f2088 < 0) {
                                m2566 = (i5 - C2105.m6981("ۙᩳ")) * 61;
                                i7 = ((m2566 ^ i6) * 27423) ^ 808652366;
                                i8 = -617143500;
                            } else {
                                m2566 = (C0630.m2566("ܰۢ") + i6) * (-33);
                                i7 = ((m2566 ^ i5) * 12567) ^ 179494554;
                                i8 = 214476848;
                            }
                        case -1415424879:
                        case 2131154139:
                            if (C3911.f12484 >= 0) {
                                m2566 = (i5 - C2105.m6981("ۙᩳ")) * 61;
                                i7 = ((m2566 ^ i6) * 27423) ^ 808652366;
                                i8 = -617143500;
                            } else {
                                m2566 = (i5 - C0630.m2566("ۘ᩵")) * 83;
                                i7 = ((m2566 ^ i6) * 23619) ^ (-403002387);
                                i8 = -906428753;
                            }
                        case -1212595423:
                        case -575964113:
                            if (C3537.f11231 >= 0) {
                                m2566 = (C0630.m2566("ܽ᩹") + i6) * 115;
                                i7 = ((m2566 ^ i5) * (-26727)) ^ 323234738;
                                i8 = 1924192070;
                            } else {
                                m2566 = (C0630.m2566("֫ܿ") + i6) * (-115);
                                i7 = ((m2566 ^ i5) * 11859) ^ 1865461197;
                                i8 = 679239961;
                            }
                        case -1071566119:
                        case -815990272:
                            ServiceConnectionC3453.m10564();
                            m2566 = (i5 - C2105.m6981("ۙᩳ")) * 61;
                            i7 = ((m2566 ^ i6) * 27423) ^ 808652366;
                            i8 = -617143500;
                        case -1053162332:
                        case -575578052:
                            if (C4263.f13799 <= 0) {
                                m2566 = (C0630.m2566("ܽ᩹") + i6) * 115;
                                i7 = ((m2566 ^ i5) * (-26727)) ^ 323234738;
                                i8 = 1924192070;
                            } else {
                                m2566 = (C0630.m2566("ᩴۙ") ^ i5) * (-61);
                                i7 = ((m2566 ^ i6) * 31995) ^ (-71421780);
                                i8 = -901016287;
                            }
                        case -904684566:
                        case 778906968:
                            i2 = Color.argb(i, 0, 0, 0);
                            if (C1294.m4372() <= 0) {
                                m2566 = (C0630.m2566("ܰۢ") + i6) * (-33);
                                i7 = ((m2566 ^ i5) * 12567) ^ 179494554;
                                i8 = 214476848;
                            } else {
                                m2566 = (C2105.m6981("ۧܰ") + i5) * (-55);
                                i7 = ((m2566 ^ i6) * 7501) ^ (-2021439419);
                                i8 = -941322319;
                            }
                        case -722886382:
                        case 1709177509:
                            if (C3683.f11629 >= 0) {
                                m2566 = (i5 - C0630.m2566("ۘ᩵")) * 83;
                                i7 = ((m2566 ^ i6) * 23619) ^ (-403002387);
                                i8 = -906428753;
                            } else {
                                m2566 = C2105.m6981("ܽᩳ") ^ i5;
                                i7 = ((m2566 ^ i6) * (-465)) ^ 496596849;
                                i8 = 121572906;
                            }
                        case -645860119:
                        case 1138435128:
                            C3663.m11168();
                            if (C11340.f33930 < 0) {
                                m2566 = (i5 - C2105.m6981("ۙᩳ")) * 61;
                                i7 = ((m2566 ^ i6) * 27423) ^ 808652366;
                                i8 = -617143500;
                            } else {
                                m2566 = (C0630.m2566("ܽ᩹") + i6) * 115;
                                i7 = ((m2566 ^ i5) * (-26727)) ^ 323234738;
                                i8 = 1924192070;
                            }
                        case -538215086:
                        case 549805391:
                            i3 = statusBarColor;
                            if (C0964.m3413()) {
                                m2566 = (i6 - C0630.m2566("֨۠")) * (-37);
                                i7 = ((m2566 ^ i5) * (-29321)) ^ (-532664170);
                                i8 = 443764472;
                            } else {
                                m2566 = (C0630.m2566("ܽ᩹") + i6) * 115;
                                i7 = ((m2566 ^ i5) * (-26727)) ^ 323234738;
                                i8 = 1924192070;
                            }
                        case -17527294:
                        case 1015015421:
                            window.setStatusBarColor(C7191.m19274(i2, i3));
                            break;
                        case 596721634:
                        case 1522163467:
                            C0382.m1848();
                            break;
                        case 845772115:
                        case 1783509739:
                            int i9 = AbstractActivityC3346.f10575;
                            if (C0483.f2088 >= 0) {
                                m2566 = (C0630.m2566("ܰۢ") + i6) * (-33);
                                i7 = ((m2566 ^ i5) * 12567) ^ 179494554;
                                i8 = 214476848;
                            } else {
                                m2566 = (i5 - C0630.m2566("ۧܳ")) * (-81);
                                i7 = ((m2566 ^ i6) * (-11253)) ^ 1501969197;
                                i8 = 1353860667;
                            }
                        case 954397971:
                        case 1642511385:
                            if (C0964.f3626 != 0) {
                                m2566 = (C0630.m2566("ܽ᩹") + i6) * 115;
                                i7 = ((m2566 ^ i5) * (-26727)) ^ 323234738;
                                i8 = 1924192070;
                            } else {
                                m2566 = (i6 - C0630.m2566("᩹ܶ")) * (-15);
                                i7 = ((m2566 ^ i5) * (-23753)) ^ 847528502;
                                i8 = 697964724;
                            }
                        default:
                            f2 = 102.0f;
                            if (C1504.f5354) {
                                m2566 = (C0630.m2566("ᩳۜ") ^ i6) * (-15);
                                i7 = ((m2566 ^ i5) * (-27785)) ^ (-205655300);
                                i8 = 81012750;
                            } else {
                                m2566 = (i6 - C0630.m2566("ۚ֨")) * 43;
                                i7 = ((m2566 ^ i5) * 1377) ^ (-582707593);
                                i8 = -1259090359;
                            }
                    }
                    return;
                }
            }
        });
        C0660 c0660 = (C0660) m10241(R.id.MT_Protector_res_0x7f0a0097);
        C19712 c19712 = this.f60261;
        if (c19712 == null) {
            C11233.m27804("bottomToolbar");
            throw null;
        }
        c0660.m2702(c19712);
        final C19712 c197122 = this.f60261;
        if (c197122 == null) {
            C11233.m27804("bottomToolbar");
            throw null;
        }
        C14771 c147712 = this.f60265;
        if (c147712 == null) {
            C11233.m27804("bottomSlideLayout");
            throw null;
        }
        c197122.m45415(c147712);
        c197122.m45413();
        c197122.m45411(R.drawable.MT_Protector_res_0x7f0802be, R.drawable.MT_Protector_res_0x7f0802c0).m38120(false);
        c197122.m45411(R.drawable.MT_Protector_res_0x7f0802bf, R.drawable.MT_Protector_res_0x7f0802c2).m38120(false);
        c197122.m45422(R.drawable.MT_Protector_res_0x7f0802bc, 45);
        C16182 m45412 = c197122.m45412(new C18682(c197122));
        m45412.m38121();
        m45412.m38120(false);
        c197122.m45411(R.drawable.MT_Protector_res_0x7f0802bd, R.drawable.MT_Protector_res_0x7f0802c1);
        c197122.setOnClickListener(new ViewOnClickListenerC19680(C8817.m22786(200), this, c197122, 0));
        c197122.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.֡᩵᩷
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ViewOnClickListenerC19121.m44099(C19712.this, this);
                return true;
            }
        });
        View m102417 = m10241(R.id.searchView);
        C11233.m27803(m102417, "view(...)");
        C23592 c23592 = (C23592) m102417;
        this.f60260 = c23592;
        c23592.m52056(true);
        C23592 c235922 = this.f60260;
        if (c235922 == null) {
            C11233.m27804("searchView");
            throw null;
        }
        c235922.m52055(new C6420(this));
        this.f60256 = new C11083(this, new Runnable() { // from class: l.ۚ᩵᩷
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC19121.m44098(ViewOnClickListenerC19121.this, true, (InterfaceC2123) null, 4);
            }
        });
        this.f60237 = C8474.m22148(this, new InterfaceC19764() { // from class: l.֨᩵᩷
            @Override // l.InterfaceC19764
            /* renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo4668(Intent intent2, int i) {
                ViewOnClickListenerC19121.m44089(ViewOnClickListenerC19121.this, i, intent2);
            }
        });
        C1204.m4047(this);
        C19890.m45743();
        if (C9255.m23781()) {
            m44080(bundle);
            return;
        }
        C13136 c13136 = new C13136(this, R.string.MT_Protector_res_0x7f120528);
        c13136.m31866(500);
        new Thread(new RunnableC8390(c13136, this, bundle, 0)).start();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m44114(ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        C16773 c16773 = viewOnClickListenerC19121.f60252;
        if (c16773 != null) {
            C4925.m14314((CharSequence) c16773.m39742());
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m44128(ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        viewOnClickListenerC19121.m44136();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44087(ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        int i = viewOnClickListenerC19121.f60236;
        long j = viewOnClickListenerC19121.f60242;
        if (i == -1 || j == 0) {
            return;
        }
        if (System.currentTimeMillis() > j) {
            viewOnClickListenerC19121.f60242 = 0L;
            return;
        }
        C2447 c2447 = viewOnClickListenerC19121.f60263;
        if (c2447 == null) {
            C11233.m27804("recyclerView");
            throw null;
        }
        if (i >= c2447.m7895()) {
            C2447 c24472 = viewOnClickListenerC19121.f60263;
            if (c24472 == null) {
                C11233.m27804("recyclerView");
                throw null;
            }
            if (i <= c24472.m7896()) {
                return;
            }
        }
        C2447 c24473 = viewOnClickListenerC19121.f60263;
        if (c24473 == null) {
            C11233.m27804("recyclerView");
            throw null;
        }
        c24473.scrollToPosition(i);
        viewOnClickListenerC19121.f60236 = -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44084(C8817 c8817, final ViewOnClickListenerC19121 viewOnClickListenerC19121, C19712 c19712) {
        C16773 c16773;
        C16773 c167732;
        C17709 c17709 = viewOnClickListenerC19121.f60264;
        if (c8817.m22793()) {
            return;
        }
        if (viewOnClickListenerC19121.m44131() && viewOnClickListenerC19121.m44119() > 0) {
            int m45427 = c19712.m45427();
            if (m45427 == 0) {
                boolean z = false;
                for (InterfaceC17889 interfaceC17889 : viewOnClickListenerC19121.f60259) {
                    if (interfaceC17889.mo36969() && !interfaceC17889.isChecked()) {
                        interfaceC17889.setChecked(true);
                        z = true;
                    }
                }
                viewOnClickListenerC19121.m44123();
                if (z) {
                    c17709.m41442(false);
                    return;
                }
                return;
            }
            if (m45427 == 1) {
                boolean z2 = false;
                for (InterfaceC17889 interfaceC178892 : viewOnClickListenerC19121.f60259) {
                    if (interfaceC178892.mo36969()) {
                        interfaceC178892.setChecked(!interfaceC178892.isChecked());
                        z2 = true;
                    }
                }
                viewOnClickListenerC19121.m44123();
                if (z2) {
                    c17709.m41442(false);
                    return;
                }
                return;
            }
            if (m45427 == 2) {
                if (viewOnClickListenerC19121.m44131()) {
                    boolean m44121 = viewOnClickListenerC19121.m44121();
                    viewOnClickListenerC19121.m44123();
                    if (m44121) {
                        c17709.m41442(false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (m45427 != 3) {
                if (m45427 != 4) {
                    return;
                }
                viewOnClickListenerC19121.m10217(R.string.MT_Protector_res_0x7f120912, R.string.MT_Protector_res_0x7f120915, false);
                return;
            }
            HashSet hashSet = new HashSet();
            for (InterfaceC17889 interfaceC178893 : viewOnClickListenerC19121.f60259) {
                if (interfaceC178893.mo36969() && interfaceC178893.isChecked()) {
                    String name = interfaceC178893.getName();
                    C11233.m27803(name, "getName(...)");
                    hashSet.add(C3451.m10553(name));
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            boolean z3 = false;
            for (InterfaceC17889 interfaceC178894 : viewOnClickListenerC19121.f60259) {
                if (interfaceC178894.mo36969() && !interfaceC178894.isChecked()) {
                    String name2 = interfaceC178894.getName();
                    C11233.m27803(name2, "getName(...)");
                    if (hashSet.contains(C3451.m10553(name2))) {
                        interfaceC178894.setChecked(true);
                        z3 = true;
                    }
                }
            }
            viewOnClickListenerC19121.m44123();
            if (z3) {
                c17709.m41442(false);
                return;
            }
            return;
        }
        int m454272 = c19712.m45427();
        if (m454272 == 0) {
            C12346 c12346 = viewOnClickListenerC19121.f60243;
            if (c12346 == null) {
                C11233.m27804("swipeRefreshLayout");
                throw null;
            }
            if (c12346.m29962() || (c16773 = viewOnClickListenerC19121.f60252) == null) {
                return;
            }
            final C2075 m27818 = c16773.f51868.m27818(viewOnClickListenerC19121.m44102());
            String m39741 = c16773.m39741();
            if (viewOnClickListenerC19121.m44131()) {
                viewOnClickListenerC19121.m44121();
                viewOnClickListenerC19121.m44123();
            }
            String str = m27818.f6926;
            String str2 = m27818.f6925;
            c16773.mo35230(str);
            String m397412 = c16773.m39741();
            final String m24404 = (m39741.length() <= m397412.length() || !m397412.equals(C9523.m24406(m39741))) ? null : C9523.m24404(m39741);
            if (m27818.f6924) {
                C23592 c23592 = viewOnClickListenerC19121.f60260;
                if (c23592 == null) {
                    C11233.m27804("searchView");
                    throw null;
                }
                c23592.m52054(str2);
                C23592 c235922 = viewOnClickListenerC19121.f60260;
                if (c235922 == null) {
                    C11233.m27804("searchView");
                    throw null;
                }
                c235922.m52058(false);
                C11233.m27803(str2, "filterText");
                viewOnClickListenerC19121.f60238 = str2;
            } else {
                C23592 c235923 = viewOnClickListenerC19121.f60260;
                if (c235923 == null) {
                    C11233.m27804("searchView");
                    throw null;
                }
                if (c235923.m52061()) {
                    viewOnClickListenerC19121.f60238 = "";
                    C23592 c235924 = viewOnClickListenerC19121.f60260;
                    if (c235924 == null) {
                        C11233.m27804("searchView");
                        throw null;
                    }
                    c235924.m52062();
                }
            }
            m44098(viewOnClickListenerC19121, true, new InterfaceC2123() { // from class: l.᩻᩵᩷
                @Override // l.InterfaceC2123
                /* renamed from: ֫ */
                public final Object mo4049() {
                    return ViewOnClickListenerC19121.m44077(ViewOnClickListenerC19121.this, m27818, m24404);
                }
            }, 2);
            viewOnClickListenerC19121.m44133();
            return;
        }
        if (m454272 != 1) {
            if (m454272 != 2) {
                if (m454272 != 4) {
                    return;
                }
                viewOnClickListenerC19121.m44120();
                return;
            }
            View m10216 = viewOnClickListenerC19121.m10216(R.layout.MT_Protector_res_0x7f0d00a0);
            final C10235 c10235 = (C10235) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
            final TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0199);
            c10235.m30313(new C17003(textView));
            C19258 buildDialog = viewOnClickListenerC19121.buildDialog();
            buildDialog.m44421(m10216);
            buildDialog.m44428(false);
            boolean z4 = viewOnClickListenerC19121.f60249 != 0;
            if (z4) {
                ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f120203);
                buildDialog.m44442(R.string.MT_Protector_res_0x7f1203fb, null);
                buildDialog.m44434(R.string.MT_Protector_res_0x7f120393, (DialogInterface.OnClickListener) null);
                buildDialog.m44440(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            } else {
                ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f1203b9);
                buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, null);
                buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            }
            final DialogInterfaceC0206 m44438 = buildDialog.m44438();
            C5088.m14637(m44438);
            C4925.m14329(c10235);
            m44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܿ᩵᩷
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewOnClickListenerC19121.m44113(C10235.this, viewOnClickListenerC19121, m44438, textView);
                }
            });
            if (z4) {
                m44438.m1446().setOnClickListener(new View.OnClickListener() { // from class: l.ܳ᩵᩷
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ViewOnClickListenerC19121.m44085(C10235.this, viewOnClickListenerC19121, m44438, textView);
                    }
                });
                return;
            }
            return;
        }
        C12346 c123462 = viewOnClickListenerC19121.f60243;
        if (c123462 == null) {
            C11233.m27804("swipeRefreshLayout");
            throw null;
        }
        if (c123462.m29962() || (c167732 = viewOnClickListenerC19121.f60252) == null) {
            return;
        }
        final C2075 m27822 = c167732.f51868.m27822(viewOnClickListenerC19121.m44102());
        String m397413 = c167732.m39741();
        if (viewOnClickListenerC19121.m44131()) {
            viewOnClickListenerC19121.m44121();
            viewOnClickListenerC19121.m44123();
        }
        String str3 = m27822.f6926;
        String str4 = m27822.f6925;
        c167732.mo35230(str3);
        String m397414 = c167732.m39741();
        final String m244042 = (m397413.length() <= m397414.length() || !m397414.equals(C9523.m24406(m397413))) ? null : C9523.m24404(m397413);
        if (m27822.f6924) {
            C23592 c235925 = viewOnClickListenerC19121.f60260;
            if (c235925 == null) {
                C11233.m27804("searchView");
                throw null;
            }
            c235925.m52054(str4);
            C23592 c235926 = viewOnClickListenerC19121.f60260;
            if (c235926 == null) {
                C11233.m27804("searchView");
                throw null;
            }
            c235926.m52058(false);
            C11233.m27803(str4, "filterText");
            viewOnClickListenerC19121.f60238 = str4;
        } else {
            C23592 c235927 = viewOnClickListenerC19121.f60260;
            if (c235927 == null) {
                C11233.m27804("searchView");
                throw null;
            }
            if (c235927.m52061()) {
                viewOnClickListenerC19121.f60238 = "";
                C23592 c235928 = viewOnClickListenerC19121.f60260;
                if (c235928 == null) {
                    C11233.m27804("searchView");
                    throw null;
                }
                c235928.m52062();
            }
        }
        m44098(viewOnClickListenerC19121, true, new InterfaceC2123() { // from class: l.ᩳ᩵᩷
            @Override // l.InterfaceC2123
            /* renamed from: ֫ */
            public final Object mo4049() {
                return ViewOnClickListenerC19121.m44112(ViewOnClickListenerC19121.this, m27822, m244042);
            }
        }, 2);
        viewOnClickListenerC19121.m44133();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44099(C19712 c19712, ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        int m45427 = c19712.m45427();
        if (viewOnClickListenerC19121.m44131() && viewOnClickListenerC19121.m44119() > 0) {
            if (m45427 != 3) {
                c19712.m45425(m45427, new int[]{R.string.MT_Protector_res_0x7f120911, R.string.MT_Protector_res_0x7f120918, R.string.MT_Protector_res_0x7f12015e, R.string.MT_Protector_res_0x7f120919, R.string.MT_Protector_res_0x7f120912}[m45427]);
                return;
            } else {
                new C5189(viewOnClickListenerC19121, new C18415(viewOnClickListenerC19121)).m14952();
                return;
            }
        }
        if (c19712.m45423()) {
            if (m45427 == 0) {
                c19712.m45425(0, R.string.MT_Protector_res_0x7f120119);
                return;
            }
            if (m45427 == 1) {
                c19712.m45425(1, R.string.MT_Protector_res_0x7f120404);
                return;
            }
            if (m45427 == 2) {
                c19712.m45425(2, R.string.MT_Protector_res_0x7f1203b9);
                return;
            }
            if (m45427 != 3) {
                if (m45427 != 4) {
                    return;
                }
                viewOnClickListenerC19121.m44136();
                return;
            }
            c19712.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
            C23592 c23592 = viewOnClickListenerC19121.f60260;
            if (c23592 == null) {
                C11233.m27804("searchView");
                throw null;
            }
            if (!c23592.m52061()) {
                C23592 c235922 = viewOnClickListenerC19121.f60260;
                if (c235922 != null) {
                    c235922.m52054((String) null);
                } else {
                    C11233.m27804("searchView");
                    throw null;
                }
            }
            C23592 c235923 = viewOnClickListenerC19121.f60260;
            if (c235923 != null) {
                c235923.m52058(true);
            } else {
                C11233.m27804("searchView");
                throw null;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44089(ViewOnClickListenerC19121 viewOnClickListenerC19121, int i, Intent intent) {
        if (i != -1 || intent == null || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Uri data = intent.getData();
        C11083 c11083 = viewOnClickListenerC19121.f60256;
        if (c11083 != null) {
            c11083.m27511(data);
        } else {
            C11233.m27804("androidDataGranter");
            throw null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44086(C13136 c13136, ViewOnClickListenerC19121 viewOnClickListenerC19121, Bundle bundle) {
        c13136.m31857();
        viewOnClickListenerC19121.m44080(bundle);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [l.᩷᩵᩷] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m44080(Bundle bundle) {
        String stringExtra;
        String[] stringArrayExtra;
        int intExtra;
        String stringExtra2;
        C16773 c16773;
        Intent intent = getIntent();
        C11233.m27799(intent);
        if (C11233.m27802((Object) intent.getAction(), (Object) "android.intent.action.GET_CONTENT")) {
            this.f60249 = (C11233.m27802((Object) intent.getAction(), (Object) "android.intent.action.GET_CONTENT") && intent.getBooleanExtra("android.intent.extra.ALLOW_MULTIPLE", false)) ? 3 : 1;
            this.f60258 = "exportSelectFile";
            stringExtra2 = C16293.f50120.mo23554();
            C11233.m27803(stringExtra2, "getPath(...)");
            stringExtra = null;
            stringArrayExtra = null;
            intExtra = 0;
        } else {
            this.f60249 = intent.getIntExtra("type", 0);
            stringExtra = intent.getStringExtra("initFilename");
            stringArrayExtra = intent.getStringArrayExtra("suffixes");
            intExtra = intent.getIntExtra("customButtonTitle", 0);
            this.f60258 = intent.getStringExtra("initPathKey");
            stringExtra2 = intent.getStringExtra("initPath");
            if (stringExtra2 == null) {
                stringExtra2 = C16293.f50120.mo23554();
                C11233.m27803(stringExtra2, "getPath(...)");
            }
            if (stringExtra2.length() == 0 || !stringExtra2.startsWith("/")) {
                stringExtra2 = C16293.f50120.mo23554();
                C11233.m27803(stringExtra2, "getPath(...)");
            }
        }
        String str = this.f60258;
        if (str != null) {
            stringExtra2 = ApplicationC20075.f65008.getString(str, stringExtra2);
            C11233.m27803(stringExtra2, "getString(...)");
        }
        if (bundle == null || !bundle.containsKey("visitorData")) {
            AbstractC15440 m39866 = C16999.m39866(stringExtra2, new String[0]);
            if (m39866.mo23120() && m39866.mo23119()) {
                stringExtra2 = m39866.m36511();
            }
            c16773 = new C16773(stringExtra2);
        } else {
            c16773 = new C16773(new C12951(bundle.getByteArray("visitorData")));
        }
        this.f60252 = c16773;
        m44133();
        if (stringExtra != null) {
            EditText editText = this.f60255;
            if (editText == null) {
                C11233.m27804("filenameEditText");
                throw null;
            }
            editText.setText(stringExtra);
        }
        if (stringArrayExtra != null) {
            for (String str2 : stringArrayExtra) {
                C11233.m27805(str2, "<this>");
                if (str2.indexOf(46, 0) >= 0) {
                    String lowerCase = str2.toLowerCase(Locale.ROOT);
                    C11233.m27803(lowerCase, "toLowerCase(...)");
                    this.f60248.add(".".concat(lowerCase));
                } else {
                    String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                    C11233.m27803(lowerCase2, "toLowerCase(...)");
                    this.f60250.add(lowerCase2);
                }
            }
        }
        int i = this.f60249;
        if (i == 0) {
            m10241(R.id.button1).setVisibility(0);
            m10241(R.id.divider).setVisibility(0);
            EditText editText2 = this.f60255;
            if (editText2 == null) {
                C11233.m27804("filenameEditText");
                throw null;
            }
            editText2.setVisibility(8);
            TextView textView = (TextView) m10241(R.id.button1);
            textView.setBackgroundTintList(ColorStateList.valueOf(C21943.f70290));
            textView.setOnClickListener(this);
            if (intExtra != 0) {
                textView.setText(intExtra);
            }
        } else if (i == 1) {
            EditText editText3 = this.f60255;
            if (editText3 == null) {
                C11233.m27804("filenameEditText");
                throw null;
            }
            editText3.setVisibility(8);
            View view = this.f60244;
            if (view == null) {
                C11233.m27804("bottomSpace");
                throw null;
            }
            view.setVisibility(8);
        } else if (i == 2) {
            m10241(R.id.button2).setVisibility(0);
            m10241(R.id.textView).setVisibility(0);
            m10241(R.id.divider).setVisibility(0);
            TextView textView2 = (TextView) m10241(R.id.button2);
            textView2.setBackgroundTintList(ColorStateList.valueOf(C21943.f70290));
            textView2.setOnClickListener(this);
            if (intExtra != 0) {
                textView2.setText(intExtra);
            }
        } else if (i == 3) {
            m10241(R.id.button1).setVisibility(0);
            m10241(R.id.divider).setVisibility(0);
            EditText editText4 = this.f60255;
            if (editText4 == null) {
                C11233.m27804("filenameEditText");
                throw null;
            }
            editText4.setVisibility(8);
            TextView textView3 = (TextView) m10241(R.id.button1);
            textView3.setBackgroundTintList(ColorStateList.valueOf(C21943.f70290));
            if (intExtra == 0) {
                intExtra = R.string.MT_Protector_res_0x7f12070a;
            }
            this.f60254 = intExtra;
            textView3.setOnClickListener(this);
            m44123();
        }
        C17709 c17709 = this.f60264;
        c17709.getClass();
        new Thread(new RunnableC6648(1, c17709.f54192, c17709)).start();
        m44098(this, false, (InterfaceC2123) null, 2);
        this.f60253 = new C5561(this, (C21091) new InterfaceC6245() { // from class: l.᩷᩵᩷
            @Override // l.InterfaceC6245
            /* renamed from: ֫ */
            public final void mo12404(String str3, C17534 c17534) {
                ViewOnClickListenerC19121.m44093(ViewOnClickListenerC19121.this, str3, c17534);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44093(ViewOnClickListenerC19121 viewOnClickListenerC19121, String str, C17534 c17534) {
        if (c17534 != null) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1206c8);
            return;
        }
        C14771 c14771 = viewOnClickListenerC19121.f60265;
        if (c14771 == null) {
            C11233.m27804("bottomSlideLayout");
            throw null;
        }
        c14771.m35122();
        AbstractC15440 m39866 = C16999.m39866(str, new String[0]);
        C4925.m14309(180L, new RunnableC17146(m39866.mo23113(), viewOnClickListenerC19121, m39866));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44100(boolean z, final ViewOnClickListenerC19121 viewOnClickListenerC19121, final AbstractC15440 abstractC15440) {
        if (z) {
            String mo23554 = abstractC15440.mo23554();
            C11233.m27803(mo23554, "getPath(...)");
            viewOnClickListenerC19121.m44083(mo23554, (InterfaceC2123) null);
            return;
        }
        viewOnClickListenerC19121.m44083(abstractC15440.m36511(), new InterfaceC2123() { // from class: l.ۖ᩵᩷
            @Override // l.InterfaceC2123
            /* renamed from: ֫ */
            public final Object mo4049() {
                return ViewOnClickListenerC19121.m44075(abstractC15440, viewOnClickListenerC19121);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8058 m44075(AbstractC15440 abstractC15440, ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        C17709 c17709 = viewOnClickListenerC19121.f60264;
        String name = abstractC15440.getName();
        C11233.m27803(name, "getName(...)");
        c17709.m41439(name);
        return C8058.f24861;
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f60240) {
            this.f60240 = false;
        } else {
            m44098(this, true, (InterfaceC2123) null, 4);
        }
        C19712 c19712 = this.f60261;
        if (c19712 != null) {
            c19712.m45418();
        } else {
            C11233.m27804("bottomToolbar");
            throw null;
        }
    }

    @Override // l.AbstractActivityC3346, l.InterfaceC13223
    /* renamed from: ۧ */
    public final void mo123(Intent intent) {
        C5652 c5652 = this.f60237;
        if (c5652 != null) {
            c5652.m15940(intent);
        } else {
            C11233.m27804("launcherForGrantPathPrimary");
            throw null;
        }
    }

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    private final void m44133() {
        C16773 c16773;
        C11248 c11248;
        C16773 c167732;
        C11248 c112482;
        C16773 c167733 = this.f60252;
        if (c167733 != null) {
            String m39741 = c167733.m39741();
            C11233.m27803(m39741, "getPath(...)");
            C9068.m23402(m39741, (C17534) null);
            this.f10584.setSubtitle(c167733.m39741());
        }
        C19712 c19712 = this.f60261;
        if (c19712 == null) {
            C11233.m27804("bottomToolbar");
            throw null;
        }
        boolean z = false;
        AbstractC9128 m45410 = c19712.m45410(0);
        m45410.getClass();
        C16182 c16182 = (C16182) m45410;
        C12346 c12346 = this.f60243;
        if (c12346 != null) {
            c16182.m38120((c12346.m29962() || (c167732 = this.f60252) == null || (c112482 = c167732.f51868) == null || !c112482.m27821()) ? false : true);
            C19712 c197122 = this.f60261;
            if (c197122 == null) {
                C11233.m27804("bottomToolbar");
                throw null;
            }
            AbstractC9128 m454102 = c197122.m45410(1);
            m454102.getClass();
            C16182 c161822 = (C16182) m454102;
            C12346 c123462 = this.f60243;
            if (c123462 != null) {
                if (!c123462.m29962() && (c16773 = this.f60252) != null && (c11248 = c16773.f51868) != null && c11248.m27823()) {
                    z = true;
                }
                c161822.m38120(z);
                return;
            }
            C11233.m27804("swipeRefreshLayout");
            throw null;
        }
        C11233.m27804("swipeRefreshLayout");
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44098(ViewOnClickListenerC19121 viewOnClickListenerC19121, boolean z, InterfaceC2123 interfaceC2123, int i) {
        boolean z2 = (i & 2) == 0;
        if ((i & 4) != 0) {
            interfaceC2123 = null;
        }
        InterfaceC2123 interfaceC21232 = interfaceC2123;
        AtomicInteger atomicInteger = viewOnClickListenerC19121.f60245;
        C16773 c16773 = viewOnClickListenerC19121.f60252;
        if (c16773 == null) {
            return;
        }
        AbstractC7379 lifecycle = viewOnClickListenerC19121.getLifecycle();
        C11233.m27803(lifecycle, "<get-lifecycle>(...)");
        new C2187(z2, viewOnClickListenerC19121, c16773, (C20765) lifecycle, z2 ? atomicInteger.get() : atomicInteger.incrementAndGet(), interfaceC21232, z).m20274();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m44094(ViewOnClickListenerC19121 viewOnClickListenerC19121, List list) {
        Set set;
        if (viewOnClickListenerC19121.m44131()) {
            set = viewOnClickListenerC19121.m44107();
        } else {
            set = C2619.f8251;
        }
        viewOnClickListenerC19121.f60262 = list;
        if (viewOnClickListenerC19121.m44131()) {
            for (InterfaceC17889 interfaceC17889 : viewOnClickListenerC19121.f60262) {
                if (!interfaceC17889.mo36981()) {
                    interfaceC17889.setChecked(interfaceC17889.mo36969() && set.contains(interfaceC17889.getPath()));
                }
            }
        }
        if (viewOnClickListenerC19121.f60238.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                InterfaceC17889 interfaceC178892 = (InterfaceC17889) obj;
                if (!interfaceC178892.mo36982()) {
                    String name = interfaceC178892.getName();
                    C11233.m27803(name, "getName(...)");
                    if (C3016.m9237((CharSequence) name, (CharSequence) viewOnClickListenerC19121.f60238, true)) {
                        arrayList.add(obj);
                    }
                }
            }
            list = arrayList;
        }
        viewOnClickListenerC19121.f60259 = list;
        viewOnClickListenerC19121.m44123();
        viewOnClickListenerC19121.f60264.m41442(true);
    }

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    private final boolean m44131() {
        return this.f60249 == 3;
    }

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    private final HashSet m44107() {
        HashSet hashSet = new HashSet();
        for (InterfaceC17889 interfaceC17889 : this.f60262) {
            if (interfaceC17889.mo36969() && interfaceC17889.isChecked()) {
                hashSet.add(interfaceC17889.getPath());
            }
        }
        return hashSet;
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    private final int m44119() {
        int i = 0;
        for (InterfaceC17889 interfaceC17889 : this.f60262) {
            if (interfaceC17889.mo36969() && interfaceC17889.isChecked()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private final boolean m44121() {
        boolean z = false;
        for (InterfaceC17889 interfaceC17889 : this.f60262) {
            if (!interfaceC17889.mo36981() && interfaceC17889.isChecked()) {
                interfaceC17889.setChecked(false);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m44088(ViewOnClickListenerC19121 viewOnClickListenerC19121, int i) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC17889 interfaceC17889 : viewOnClickListenerC19121.f60259) {
            if (interfaceC17889.mo36969() && interfaceC17889.isChecked()) {
                arrayList.add(C5189.m14949(i, interfaceC17889.getTime()));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z = false;
        for (InterfaceC17889 interfaceC178892 : viewOnClickListenerC19121.f60259) {
            if (interfaceC178892.mo36969() && !interfaceC178892.isChecked()) {
                Iterator it = arrayList.iterator();
                C11233.m27803(it, "iterator(...)");
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        C11233.m27803(next, "next(...)");
                        long[] jArr = (long[]) next;
                        if (jArr[0] <= interfaceC178892.getTime() && interfaceC178892.getTime() < jArr[1]) {
                            interfaceC178892.setChecked(true);
                            z = true;
                            break;
                        }
                    }
                }
            }
        }
        viewOnClickListenerC19121.m44101(z, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m44116(ViewOnClickListenerC19121 viewOnClickListenerC19121, long j, long j2) {
        boolean z = false;
        for (InterfaceC17889 interfaceC17889 : viewOnClickListenerC19121.f60259) {
            if (interfaceC17889.mo36969()) {
                boolean z2 = j <= interfaceC17889.getTime() && interfaceC17889.getTime() < j2;
                if (interfaceC17889.isChecked() != z2) {
                    interfaceC17889.setChecked(z2);
                    z = true;
                }
            }
        }
        viewOnClickListenerC19121.m44101(z, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m44091(ViewOnClickListenerC19121 viewOnClickListenerC19121, long j, long j2) {
        boolean z = false;
        for (InterfaceC17889 interfaceC17889 : viewOnClickListenerC19121.f60259) {
            if (interfaceC17889.mo36969()) {
                boolean z2 = interfaceC17889.mo24437() && j <= interfaceC17889.getSize() && interfaceC17889.getSize() < j2;
                if (interfaceC17889.isChecked() != z2) {
                    interfaceC17889.setChecked(z2);
                    z = true;
                }
            }
        }
        viewOnClickListenerC19121.m44101(z, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m44095(ViewOnClickListenerC19121 viewOnClickListenerC19121, C3598 c3598) {
        boolean z = false;
        for (InterfaceC17889 interfaceC17889 : viewOnClickListenerC19121.f60259) {
            if (interfaceC17889.mo36969()) {
                String name = interfaceC17889.getName();
                C11233.m27803(name, "getName(...)");
                boolean booleanValue = ((Boolean) c3598.invoke(name)).booleanValue();
                if (interfaceC17889.isChecked() != booleanValue) {
                    interfaceC17889.setChecked(booleanValue);
                    z = true;
                }
            }
        }
        viewOnClickListenerC19121.m44101(z, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m44101(boolean z, boolean z2) {
        m44123();
        if (z) {
            this.f60264.m41442(false);
        }
        if (z2 && m44119() == 0) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1206ef);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final void m44123() {
        if (m44131()) {
            int m44119 = m44119();
            TextView textView = (TextView) m10241(R.id.button1);
            textView.setText(getString(this.f60254) + MotionUtils.EASING_TYPE_FORMAT_START + m44119 + MotionUtils.EASING_TYPE_FORMAT_END);
            textView.setEnabled(m44119 > 0);
            if (m44119 > 0) {
                C19712 c19712 = this.f60261;
                if (c19712 != null) {
                    c19712.m45419();
                    return;
                } else {
                    C11233.m27804("bottomToolbar");
                    throw null;
                }
            }
            C19712 c197122 = this.f60261;
            if (c197122 != null) {
                c197122.m45428();
            } else {
                C11233.m27804("bottomToolbar");
                throw null;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m44096(ViewOnClickListenerC19121 viewOnClickListenerC19121, ViewOnClickListenerC10507 viewOnClickListenerC10507) {
        viewOnClickListenerC10507.m26409().setBackgroundColor(viewOnClickListenerC19121.m44131() && viewOnClickListenerC10507.m26406().mo36969() && viewOnClickListenerC10507.m26406().isChecked() ? C21943.f70286 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m44143() {
        final C16773 c16773;
        C12346 c12346 = this.f60243;
        if (c12346 == null) {
            C11233.m27804("swipeRefreshLayout");
            throw null;
        }
        if (c12346.m29962() || (c16773 = this.f60252) == null) {
            return;
        }
        String m39741 = c16773.m39741();
        final String m24404 = C9523.m24404(m39741);
        final String m24406 = C9523.m24406(m39741);
        if (m24406 == null) {
            if (this.f60247.m22791()) {
                C21374.m48457(R.string.MT_Protector_res_0x7f12079b);
                return;
            } else {
                C21374.m48465();
                finish();
                return;
            }
        }
        m44083(m24406, new InterfaceC2123() { // from class: l.ۜ᩵᩷
            @Override // l.InterfaceC2123
            /* renamed from: ֫ */
            public final Object mo4049() {
                return ViewOnClickListenerC19121.m44076(C16773.this, m24406, this, m24404);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8058 m44076(C16773 c16773, String str, ViewOnClickListenerC19121 viewOnClickListenerC19121, String str2) {
        viewOnClickListenerC19121.f60264.m41438((Integer) c16773.f51868.f33716.getOrDefault(str, null), str2);
        return C8058.f24861;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m44120() {
        if (m44131() && !m44107().isEmpty()) {
            if (m44131()) {
                boolean m44121 = m44121();
                m44123();
                if (m44121) {
                    this.f60264.m41442(false);
                    return;
                }
                return;
            }
            return;
        }
        C23592 c23592 = this.f60260;
        if (c23592 == null) {
            C11233.m27804("searchView");
            throw null;
        }
        if (c23592.m52061()) {
            C23592 c235922 = this.f60260;
            if (c235922 != null) {
                c235922.m52057();
                return;
            } else {
                C11233.m27804("searchView");
                throw null;
            }
        }
        m44143();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8058 m44077(ViewOnClickListenerC19121 viewOnClickListenerC19121, C2075 c2075, String str) {
        viewOnClickListenerC19121.f60264.m41438(Integer.valueOf(c2075.f6927), str);
        return C8058.f24861;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C8058 m44112(ViewOnClickListenerC19121 viewOnClickListenerC19121, C2075 c2075, String str) {
        viewOnClickListenerC19121.f60264.m41438(Integer.valueOf(c2075.f6927), str);
        return C8058.f24861;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m44082(TextView textView, int i) {
        textView.setVisibility(0);
        textView.setText(i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m44113(C10235 c10235, final ViewOnClickListenerC19121 viewOnClickListenerC19121, DialogInterfaceC0206 dialogInterfaceC0206, TextView textView) {
        String obj = c10235.m30436().toString();
        if (C3016.m9237((CharSequence) obj, (CharSequence) "\\", false) || C3016.m9237((CharSequence) obj, (CharSequence) "/", false)) {
            m44082(textView, R.string.MT_Protector_res_0x7f1203ae);
            return;
        }
        C16773 c16773 = viewOnClickListenerC19121.f60252;
        C11233.m27799(c16773);
        final AbstractC15440 m39866 = C16999.m39866(c16773.m39741(), obj);
        if (m39866.mo23120()) {
            if (m39866.mo23113()) {
                m44082(textView, R.string.MT_Protector_res_0x7f1203fc);
                return;
            } else {
                m44082(textView, R.string.MT_Protector_res_0x7f1208c1);
                return;
            }
        }
        try {
            C16773 c167732 = viewOnClickListenerC19121.f60252;
            C11233.m27799(c167732);
            C17721.m41503(c167732.mo39507(), EnumC16309.MODIFY_DIRECTORY_LINKED);
        } catch (C1637 e) {
            e = e;
        }
        try {
            m39866.m36508();
            m44098(viewOnClickListenerC19121, false, new InterfaceC2123() { // from class: l.ܺ᩵᩷
                @Override // l.InterfaceC2123
                /* renamed from: ֫ */
                public final Object mo4049() {
                    return ViewOnClickListenerC19121.m44134(m39866, viewOnClickListenerC19121);
                }
            }, 2);
            dialogInterfaceC0206.dismiss();
        } catch (Exception e2) {
            e = e2;
            viewOnClickListenerC19121.m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C8058 m44134(AbstractC15440 abstractC15440, ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        C17709 c17709 = viewOnClickListenerC19121.f60264;
        String name = abstractC15440.getName();
        C11233.m27803(name, "getName(...)");
        c17709.m41439(name);
        return C8058.f24861;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44085(C10235 c10235, final ViewOnClickListenerC19121 viewOnClickListenerC19121, DialogInterfaceC0206 dialogInterfaceC0206, TextView textView) {
        String obj = c10235.m30436().toString();
        if (C3016.m9237((CharSequence) obj, (CharSequence) "\\", false) || C3016.m9237((CharSequence) obj, (CharSequence) "/", false)) {
            m44082(textView, R.string.MT_Protector_res_0x7f1203ae);
            return;
        }
        C16773 c16773 = viewOnClickListenerC19121.f60252;
        C11233.m27799(c16773);
        final AbstractC15440 m39866 = C16999.m39866(c16773.m39741(), obj);
        if (m39866.mo23120()) {
            if (m39866.mo23113()) {
                m44082(textView, R.string.MT_Protector_res_0x7f1208c2);
                return;
            } else {
                m44082(textView, R.string.MT_Protector_res_0x7f1203a1);
                return;
            }
        }
        try {
            C16773 c167732 = viewOnClickListenerC19121.f60252;
            C11233.m27799(c167732);
            C17721.m41503(c167732.mo39507(), EnumC16309.MODIFY_DIRECTORY_LINKED);
        } catch (C1637 e) {
            e = e;
        }
        try {
            if (m39866.mo23545()) {
                m44098(viewOnClickListenerC19121, false, new InterfaceC2123() { // from class: l.ۡ᩵᩷
                    @Override // l.InterfaceC2123
                    /* renamed from: ֫ */
                    public final Object mo4049() {
                        return ViewOnClickListenerC19121.m44111(m39866, viewOnClickListenerC19121);
                    }
                }, 2);
                dialogInterfaceC0206.dismiss();
                return;
            }
            throw new Exception("Failed to create file: ".concat(obj));
        } catch (Exception e2) {
            e = e2;
            viewOnClickListenerC19121.m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C8058 m44111(AbstractC15440 abstractC15440, ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        C17709 c17709 = viewOnClickListenerC19121.f60264;
        String name = abstractC15440.getName();
        C11233.m27803(name, "getName(...)");
        c17709.m41439(name);
        return C8058.f24861;
    }

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    private final C2075 m44102() {
        C16773 c16773 = this.f60252;
        C11233.m27799(c16773);
        String m39741 = c16773.m39741();
        int m41436 = this.f60264.m41436();
        C23592 c23592 = this.f60260;
        if (c23592 != null) {
            return new C2075(m39741, m41436, this.f60238, c23592.m52061());
        }
        C11233.m27804("searchView");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44083(String str, InterfaceC2123 interfaceC2123) {
        C16773 c16773 = this.f60252;
        C11233.m27799(c16773);
        c16773.f51868.m27825(m44102());
        if (m44131()) {
            m44121();
            m44123();
        }
        final C23932 c23932 = new C23932();
        if (!C3016.m9240(str, "/", false) && c16773.mo6014(str)) {
            c23932.f77612 = C9523.m24404(str);
            str = C9523.m24406(str);
            C11233.m27803(str, "getParent(...)");
        }
        c16773.mo35230(str);
        C23592 c23592 = this.f60260;
        if (c23592 == null) {
            C11233.m27804("searchView");
            throw null;
        }
        if (c23592.m52061()) {
            this.f60238 = "";
            C23592 c235922 = this.f60260;
            if (c235922 == null) {
                C11233.m27804("searchView");
                throw null;
            }
            c235922.m52062();
        }
        if (interfaceC2123 == null) {
            interfaceC2123 = new InterfaceC2123() { // from class: l.ܽ᩵᩷
                @Override // l.InterfaceC2123
                /* renamed from: ֫ */
                public final Object mo4049() {
                    return ViewOnClickListenerC19121.m44078(C23932.this, this);
                }
            };
        }
        m44098(this, true, interfaceC2123, 2);
        m44133();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8058 m44078(C23932 c23932, ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        C17709 c17709 = viewOnClickListenerC19121.f60264;
        Object obj = c23932.f77612;
        if (obj == null) {
            c17709.m41437(0);
        } else {
            c17709.m41439((String) obj);
        }
        return C8058.f24861;
    }

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    private final void m44136() {
        C16773 c16773 = this.f60252;
        if (c16773 == null) {
            return;
        }
        Object systemService = C4925.m14335().getSystemService("clipboard");
        C11233.m27800(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        C14180 c14180 = new C14180(this);
        c14180.m31258(R.string.MT_Protector_res_0x7f1204cb);
        c14180.m31250((CharSequence) C6554.m18061(2000, c16773.m39742()));
        c14180.m31281();
        c14180.m31279(2);
        c14180.m31266(true);
        c14180.m31282().setOnClickListener(new ViewOnClickListenerC20178(1, (ClipboardManager) systemService, c14180));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent putStringArrayListExtra;
        String m34214;
        C16773 c16773 = this.f60252;
        if (c16773 == null) {
            return;
        }
        int i = this.f60249;
        if (i == 0) {
            String m39741 = c16773.m39741();
            C11233.m27803(m39741, "getPath(...)");
            m44126(m39741);
            return;
        }
        int i2 = 0;
        int i3 = 3;
        ClipData clipData = null;
        if (i == 2) {
            String m397412 = c16773.m39741();
            EditText editText = this.f60255;
            if (editText == null) {
                C11233.m27804("filenameEditText");
                throw null;
            }
            AbstractC15440 m39866 = C16999.m39866(m397412, editText.getText().toString());
            if (m39866.mo23120()) {
                C19258 buildDialog = buildDialog();
                buildDialog.m44433(R.string.MT_Protector_res_0x7f120b7b);
                buildDialog.m44424(getString(R.string.MT_Protector_res_0x7f1203b5, m39866.getName()));
                buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC11543(i3, m39866, this));
                buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                buildDialog.m44438();
                return;
            }
            String mo23554 = m39866.mo23554();
            C11233.m27803(mo23554, "getPath(...)");
            C9068.m23402(mo23554, (C17534) null);
            String mo235542 = m39866.mo23554();
            C11233.m27803(mo235542, "getPath(...)");
            m44126(mo235542);
            return;
        }
        if (i == 3) {
            ArrayList<String> arrayList = new ArrayList<>();
            for (InterfaceC17889 interfaceC17889 : this.f60262) {
                if (interfaceC17889.mo36969() && interfaceC17889.isChecked()) {
                    arrayList.add(interfaceC17889.getPath());
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            String str = this.f60258;
            if (str != null) {
                C16773 c167732 = this.f60252;
                if (c167732 == null || (m34214 = c167732.m39741()) == null) {
                    m34214 = C14336.m34214(arrayList.get(0));
                }
                ApplicationC20075.f65008.edit().putString(str, m34214).apply();
            }
            Intent intent = getIntent();
            C11233.m27803(intent, "getIntent(...)");
            if (!C11233.m27802((Object) intent.getAction(), (Object) "android.intent.action.GET_CONTENT")) {
                putStringArrayListExtra = new Intent().putStringArrayListExtra("paths", arrayList);
                C11233.m27803(putStringArrayListExtra, "putStringArrayListExtra(...)");
            } else {
                putStringArrayListExtra = new Intent();
                if (arrayList.size() == 1) {
                    putStringArrayListExtra.setData(C11914.m29045(arrayList.get(0)));
                } else {
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        int i4 = i2 + 1;
                        Uri m29045 = C11914.m29045(it.next());
                        if (i2 == 0) {
                            clipData = ClipData.newRawUri("paths", m29045);
                        } else if (clipData != null) {
                            clipData.addItem(new ClipData.Item(m29045));
                        }
                        i2 = i4;
                    }
                    putStringArrayListExtra.setClipData(clipData);
                }
                if (!arrayList.isEmpty()) {
                    putStringArrayListExtra.addFlags(1);
                    putStringArrayListExtra.addFlags(2);
                }
            }
            setResult(-1, putStringArrayListExtra);
            finish();
            return;
        }
        throw new RuntimeException();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m44127(AbstractC15440 abstractC15440, ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        String mo23554 = abstractC15440.mo23554();
        C11233.m27803(mo23554, "getPath(...)");
        C9068.m23402(mo23554, (C17534) null);
        String mo235542 = abstractC15440.mo23554();
        C11233.m27803(mo235542, "getPath(...)");
        viewOnClickListenerC19121.m44126(mo235542);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44126(String str) {
        String str2 = this.f60258;
        if (str2 != null) {
            ApplicationC20075.f65008.edit().putString(str2, C14336.m34214(str)).apply();
        }
        Intent intent = new Intent();
        Intent intent2 = getIntent();
        C11233.m27803(intent2, "getIntent(...)");
        if (C11233.m27802((Object) intent2.getAction(), (Object) "android.intent.action.GET_CONTENT")) {
            intent.setData(C11914.m29045(str));
            intent.addFlags(1);
            intent.addFlags(2);
        } else {
            intent.putExtra(MotionUtils.EASING_TYPE_PATH, str);
            Bundle bundleExtra = getIntent().getBundleExtra("extra");
            if (bundleExtra != null) {
                intent.putExtra("extra", bundleExtra);
            }
        }
        setResult(-1, intent);
        finish();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C6273 m44074(AbstractC19619 abstractC19619, String str, InterfaceC23206 interfaceC23206) {
        C11233.m27805(abstractC19619, "registry");
        C11233.m27805(str, "key");
        return new C6273(C8474.m22147(abstractC19619, str, new C12874(interfaceC23206)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C6273 m44072(AbstractActivityC3346 abstractActivityC3346, final InterfaceC23206 interfaceC23206) {
        return new C6273(C8474.m22148(abstractActivityC3346, new InterfaceC19764() { // from class: l.ۙ᩵᩷
            @Override // l.InterfaceC19764
            /* renamed from: ֫ */
            public final void mo4668(Intent intent, int i) {
                String stringExtra;
                InterfaceC23206 interfaceC232062 = InterfaceC23206.this;
                if (i == 0) {
                    interfaceC232062.onCanceled();
                } else {
                    if (i != -1 || intent == null || (stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH)) == null) {
                        return;
                    }
                    interfaceC232062.mo8486(stringExtra);
                }
            }
        }));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C6273 m44073(ComponentCallbacksC9205 componentCallbacksC9205, final InterfaceC23206 interfaceC23206) {
        return new C6273(C8474.m22146(componentCallbacksC9205, new InterfaceC19764() { // from class: l.᩶᩵᩷
            @Override // l.InterfaceC19764
            /* renamed from: ֫ */
            public final void mo4668(Intent intent, int i) {
                String stringExtra;
                InterfaceC23206 interfaceC232062 = InterfaceC23206.this;
                if (i == 0) {
                    interfaceC232062.onCanceled();
                } else {
                    if (i != -1 || intent == null || (stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH)) == null) {
                        return;
                    }
                    interfaceC232062.mo8486(stringExtra);
                }
            }
        }));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C13328 m44079(ComponentCallbacksC9205 componentCallbacksC9205, final InterfaceC11918 interfaceC11918) {
        return new C13328(C8474.m22146(componentCallbacksC9205, new InterfaceC19764() { // from class: l.᩸᩵᩷
            @Override // l.InterfaceC19764
            /* renamed from: ֫ */
            public final void mo4668(Intent intent, int i) {
                String stringExtra;
                InterfaceC11918 interfaceC119182 = InterfaceC11918.this;
                if (i == 0) {
                    interfaceC119182.onCanceled();
                    return;
                }
                if (i != -1 || intent == null || (stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH)) == null) {
                    return;
                }
                Bundle bundleExtra = intent.getBundleExtra("extra");
                C11233.m27799(bundleExtra);
                interfaceC119182.onGetPath(bundleExtra, stringExtra);
            }
        }));
    }
}
