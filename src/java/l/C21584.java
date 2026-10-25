package l;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.c;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: G7AW */
/* renamed from: l.᩸۫ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21584 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f69318 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f69319;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean f69321;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int f69322;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C0123 f69323;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Set f69324 = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final BroadcastReceiver f69320 = new C1122();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48757(final AbstractActivityC3346 abstractActivityC3346, int i) {
        final C21584 c21584 = new C21584();
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00e8);
        final TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2);
        final TextView textView2 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02a3);
        final View findViewById = m10216.findViewById(R.id.MT_Protector_res_0x7f0a008b);
        final ImageView imageView = (ImageView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0470);
        final View findViewById2 = m10216.findViewById(R.id.MT_Protector_res_0x7f0a0439);
        final TextView textView3 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0421);
        final View findViewById3 = m10216.findViewById(R.id.MT_Protector_res_0x7f0a0422);
        final C22289 c22289 = (C22289) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0423);
        final ImageView imageView2 = (ImageView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0288);
        RadioGroup radioGroup = (RadioGroup) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0466);
        int i2 = i == 1 ? 1 : 0;
        final int[] iArr = {i2};
        final String[] strArr = {null};
        final boolean[] zArr = {true};
        final long[] jArr = {0};
        final Runnable[] runnableArr = new Runnable[1];
        int i3 = i2;
        runnableArr[0] = new Runnable() { // from class: l.ۧ۫ܿ
            @Override // java.lang.Runnable
            public final void run() {
                long m5493 = ServiceC1618.m5493();
                long max = Math.max(jArr[0] - System.currentTimeMillis(), 0L);
                C22289 c222892 = c22289;
                c222892.m50009(max, m5493);
                if (zArr[0] && findViewById3.getVisibility() == 0 && max > 0) {
                    c222892.postDelayed(runnableArr[0], 200L);
                }
            }
        };
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120818, null);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12081a, (DialogInterface.OnClickListener) null);
        buildDialog.m44440(R.string.MT_Protector_res_0x7f12081b, (DialogInterface.OnClickListener) null);
        buildDialog.m44420(new DialogInterface.OnDismissListener() { // from class: l.ۢ۫ܿ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C21584.m48758(zArr, c22289, runnableArr, abstractActivityC3346);
            }
        });
        DialogInterfaceC0206 m44415 = buildDialog.m44415();
        m44415.m1438(new DialogInterfaceOnShowListenerC8884());
        m44415.m1449();
        final RunnableC10560 m17596 = C6326.m17596(m10216.findViewById(R.id.MT_Protector_res_0x7f0a02e9), abstractActivityC3346, m44415);
        ViewOnClickListenerC14813.m35215(textView2);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: l.ܺ۫ܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21584.m48756(AbstractActivityC3346.this);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener(c21584) { // from class: l.ۖ۫ܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC3346 abstractActivityC33462 = abstractActivityC3346;
                int i4 = iArr[0];
                String str = strArr[0];
                if (!C21584.m48759(i4, str, i4 == 0 ? ServiceC1618.m5485() : ServiceC7926.m21228())) {
                    C21374.m48457(R.string.MT_Protector_res_0x7f120848);
                    return;
                }
                try {
                    View m102162 = abstractActivityC33462.m10216(R.layout.MT_Protector_res_0x7f0d00e9);
                    ImageView imageView3 = (ImageView) m102162.findViewById(R.id.MT_Protector_res_0x7f0a046f);
                    TextView textView4 = (TextView) m102162.findViewById(R.id.MT_Protector_res_0x7f0a0471);
                    imageView3.setImageBitmap(C21584.m48751(C11266.m27878(220.0f), str));
                    ViewOnClickListenerC14813.m35216(textView4, str);
                    int i5 = DialogInterfaceC0206.f1451;
                    C19258 c19258 = new C19258(abstractActivityC33462);
                    c19258.m44433(R.string.MT_Protector_res_0x7f120847);
                    c19258.m44421(m102162);
                    c19258.m44442(R.string.MT_Protector_res_0x7f120189, null);
                    c19258.m44438();
                } catch (RuntimeException | C9456 unused) {
                    C21374.m48457(R.string.MT_Protector_res_0x7f120848);
                }
            }
        });
        m44415.m1446().setOnClickListener(new View.OnClickListener() { // from class: l.ۘ۫ܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = iArr[0];
                final AbstractActivityC3346 abstractActivityC33462 = abstractActivityC3346;
                if (i4 == 0) {
                    View m102162 = abstractActivityC33462.m10216(R.layout.MT_Protector_res_0x7f0d00ea);
                    final EditText editText = (EditText) m102162.findViewById(R.id.MT_Protector_res_0x7f0a017d);
                    final EditText editText2 = (EditText) m102162.findViewById(R.id.editText4);
                    final TextInputLayout textInputLayout = (TextInputLayout) m102162.findViewById(R.id.textInputLayout4);
                    final EditText editText3 = (EditText) m102162.findViewById(R.id.MT_Protector_res_0x7f0a0181);
                    final TextInputLayout textInputLayout2 = (TextInputLayout) m102162.findViewById(R.id.MT_Protector_res_0x7f0a05d5);
                    ((TextView) m102162.findViewById(R.id.textView1)).setText(R.string.MT_Protector_res_0x7f1206bd);
                    m102162.findViewById(R.id.textView2).setVisibility(8);
                    m102162.findViewById(R.id.editText2).setVisibility(8);
                    m102162.findViewById(R.id.textView3).setVisibility(8);
                    m102162.findViewById(R.id.editText3).setVisibility(8);
                    ((TextView) m102162.findViewById(R.id.textView5)).setText(R.string.MT_Protector_res_0x7f120833);
                    ((TextView) m102162.findViewById(R.id.textView6)).setVisibility(0);
                    Button button = (Button) m102162.findViewById(R.id.MT_Protector_res_0x7f0a0149);
                    button.setVisibility(0);
                    final C21584 c215842 = C21584.this;
                    button.setOnClickListener(new View.OnClickListener() { // from class: l.ܿ۫ܿ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            final AbstractActivityC3346 abstractActivityC33463 = abstractActivityC33462;
                            View m102163 = abstractActivityC33463.m10216(R.layout.MT_Protector_res_0x7f0d00cc);
                            ((TextView) m102163.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f12083e);
                            ListView listView = (ListView) m102163.findViewById(R.id.MT_Protector_res_0x7f0a02e0);
                            final C8178 c8178 = new C8178(abstractActivityC33463);
                            listView.setAdapter((ListAdapter) c8178);
                            C4915.m14284(listView);
                            final C21584 c215843 = C21584.this;
                            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.᩻۫ܿ
                                @Override // android.widget.AdapterView.OnItemClickListener
                                public final void onItemClick(AdapterView adapterView, View view3, int i5, long j) {
                                    C8178 c81782 = c8178;
                                    if (c81782.m21664()) {
                                        return;
                                    }
                                    C16826 m21663 = c81782.m21663(i5);
                                    AbstractActivityC3346 abstractActivityC33464 = abstractActivityC33463;
                                    View m102164 = abstractActivityC33464.m10216(R.layout.MT_Protector_res_0x7f0d00e7);
                                    String string = abstractActivityC33464.getString(m21663.m39573() ? R.string.MT_Protector_res_0x7f12083f : R.string.MT_Protector_res_0x7f120840);
                                    String m39568 = m21663.m39568();
                                    if (TextUtils.isEmpty(m39568)) {
                                        m39568 = abstractActivityC33464.getString(R.string.MT_Protector_res_0x7f12084a);
                                    }
                                    ((TextView) m102164.findViewById(R.id.MT_Protector_res_0x7f0a014a)).setText(m39568);
                                    ((TextView) m102164.findViewById(R.id.MT_Protector_res_0x7f0a0656)).setText(string);
                                    long m39570 = m21663.m39570();
                                    ((TextView) m102164.findViewById(R.id.MT_Protector_res_0x7f0a01f7)).setText(m39570 <= 0 ? abstractActivityC33464.getString(R.string.MT_Protector_res_0x7f120842) : C17283.m40572(m39570));
                                    long m39572 = m21663.m39572();
                                    ((TextView) m102164.findViewById(R.id.MT_Protector_res_0x7f0a02c8)).setText(m39572 <= 0 ? abstractActivityC33464.getString(R.string.MT_Protector_res_0x7f120842) : C17283.m40572(m39572));
                                    String m39571 = m21663.m39571();
                                    if (TextUtils.isEmpty(m39571)) {
                                        m39571 = abstractActivityC33464.getString(R.string.MT_Protector_res_0x7f120843);
                                    }
                                    ((TextView) m102164.findViewById(R.id.MT_Protector_res_0x7f0a02cb)).setText(m39571);
                                    String m39569 = m21663.m39569();
                                    if (TextUtils.isEmpty(m39569)) {
                                        m39569 = abstractActivityC33464.getString(R.string.MT_Protector_res_0x7f120843);
                                    }
                                    ((TextView) m102164.findViewById(R.id.MT_Protector_res_0x7f0a066e)).setText(m39569);
                                    int i6 = DialogInterfaceC0206.f1451;
                                    C19258 c19258 = new C19258(abstractActivityC33464);
                                    c19258.m44421(m102164);
                                    c19258.m44442(R.string.MT_Protector_res_0x7f120836, null);
                                    c19258.m44434(R.string.MT_Protector_res_0x7f120189, (DialogInterface.OnClickListener) null);
                                    DialogInterfaceC0206 m44438 = c19258.m44438();
                                    m44438.m1447().setOnClickListener(new View.OnClickListener(C21584.this, abstractActivityC33464, m21663, c81782, m44438) { // from class: l.ۜ۫ܿ

                                        /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
                                        public final /* synthetic */ DialogInterfaceC0206 f21016;

                                        /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
                                        public final /* synthetic */ C8178 f21017;

                                        /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                                        public final /* synthetic */ AbstractActivityC3346 f21018;

                                        /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
                                        public final /* synthetic */ C16826 f21019;

                                        {
                                            this.f21018 = abstractActivityC33464;
                                            this.f21019 = m21663;
                                            this.f21017 = c81782;
                                            this.f21016 = m44438;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view4) {
                                            final C16826 c16826 = this.f21019;
                                            String m395682 = c16826.m39568();
                                            boolean isEmpty = TextUtils.isEmpty(m395682);
                                            AbstractActivityC3346 abstractActivityC33465 = this.f21018;
                                            if (isEmpty) {
                                                m395682 = abstractActivityC33465.getString(R.string.MT_Protector_res_0x7f12084a);
                                            }
                                            int i7 = DialogInterfaceC0206.f1451;
                                            C19258 c192582 = new C19258(abstractActivityC33465);
                                            c192582.m44433(R.string.MT_Protector_res_0x7f120836);
                                            c192582.m44424(abstractActivityC33465.getString(R.string.MT_Protector_res_0x7f120837, m395682));
                                            final DialogInterfaceC0206 m19253 = C7187.m19253(c192582, R.string.MT_Protector_res_0x7f120836, (DialogInterface.OnClickListener) null, R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                                            Button m1447 = m19253.m1447();
                                            final DialogInterfaceC0206 dialogInterfaceC0206 = this.f21016;
                                            final C8178 c81783 = this.f21017;
                                            m1447.setOnClickListener(new View.OnClickListener() { // from class: l.᩷۫ܿ
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view5) {
                                                    DialogInterfaceC0206.this.dismiss();
                                                    if (ServiceC1618.m5484(c16826.m39567())) {
                                                        dialogInterfaceC0206.dismiss();
                                                        c81783.m21665();
                                                    } else {
                                                        C21374.m48457(R.string.MT_Protector_res_0x7f120838);
                                                    }
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                            int i5 = DialogInterfaceC0206.f1451;
                            C19258 c19258 = new C19258(abstractActivityC33463);
                            c19258.m44421(m102163);
                            c19258.m44442(R.string.MT_Protector_res_0x7f120189, null);
                            c19258.m44438();
                        }
                    });
                    editText.setText(C3735.m11349().mo23554());
                    editText2.setText(String.valueOf(C3735.m11350()));
                    editText3.setHint(R.string.MT_Protector_res_0x7f120728);
                    editText3.setInputType(2);
                    editText3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                    editText3.setText(C3735.m11346());
                    C13841.m33200(abstractActivityC33462, (TextInputLayout) m102162.findViewById(R.id.MT_Protector_res_0x7f0a05d0), editText, (RunnableC20884) null);
                    C10309.m26062(textInputLayout);
                    C10309.m26062(textInputLayout2);
                    int i5 = DialogInterfaceC0206.f1451;
                    C19258 c19258 = new C19258(abstractActivityC33462);
                    c19258.m44433(R.string.MT_Protector_res_0x7f120849);
                    c19258.m44421(m102162);
                    c19258.m44442(R.string.MT_Protector_res_0x7f12070a, null);
                    c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                    c19258.m44428(false);
                    final DialogInterfaceC0206 m44438 = c19258.m44438();
                    m44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܳ۫ܿ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C21584.m48755(TextInputLayout.this, editText2, editText3, textInputLayout2, editText, m44438);
                        }
                    });
                    C5088.m14637(m44438);
                    return;
                }
                View m102163 = abstractActivityC33462.m10216(R.layout.MT_Protector_res_0x7f0d00ea);
                final EditText editText4 = (EditText) m102163.findViewById(R.id.MT_Protector_res_0x7f0a017d);
                final EditText editText5 = (EditText) m102163.findViewById(R.id.editText2);
                final EditText editText6 = (EditText) m102163.findViewById(R.id.editText3);
                final EditText editText7 = (EditText) m102163.findViewById(R.id.editText4);
                final TextInputLayout textInputLayout3 = (TextInputLayout) m102163.findViewById(R.id.textInputLayout4);
                final EditText editText8 = (EditText) m102163.findViewById(R.id.MT_Protector_res_0x7f0a0181);
                editText4.setText(C14981.m35468().mo23554());
                editText5.setText(C14981.m35467());
                editText6.setText(C14981.m35470());
                editText8.setText(C14981.m35466());
                editText7.setText(String.valueOf(C14981.m35469()));
                AbstractC3577.m10936(editText8, abstractActivityC33462);
                C13841.m33200(abstractActivityC33462, (TextInputLayout) m102163.findViewById(R.id.MT_Protector_res_0x7f0a05d0), editText4, (RunnableC20884) null);
                C10309.m26062(textInputLayout3);
                int i6 = DialogInterfaceC0206.f1451;
                C19258 c192582 = new C19258(abstractActivityC33462);
                c192582.m44433(R.string.MT_Protector_res_0x7f120832);
                c192582.m44421(m102163);
                c192582.m44442(R.string.MT_Protector_res_0x7f12070a, null);
                c192582.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                c192582.m44428(false);
                final DialogInterfaceC0206 m444382 = c192582.m44438();
                m444382.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܽ۫ܿ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C21584.m48754(TextInputLayout.this, editText7, editText4, editText5, editText6, editText8, m444382);
                    }
                });
                C5088.m14637(m444382);
            }
        });
        final Button m1448 = m44415.m1448();
        final Button m1447 = m44415.m1447();
        m1448.setOnClickListener(new ViewOnClickListenerC19197(1, iArr));
        radioGroup.check(i3 == 1 ? R.id.MT_Protector_res_0x7f0a0465 : R.id.MT_Protector_res_0x7f0a0467);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.ᩴ۫ܿ
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i4) {
                C21584.m48753(i4, iArr);
            }
        });
        Runnable runnable = new Runnable(c21584) { // from class: l.᩵۫ܿ
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:43:0x0142  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x015f  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x014b  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 357
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: l.RunnableC19468.run():void");
            }
        };
        m10216.setTag(runnable);
        f69324.add(runnable);
        m48767();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48758(boolean[] zArr, C22289 c22289, Runnable[] runnableArr, AbstractActivityC3346 abstractActivityC3346) {
        zArr[0] = false;
        c22289.removeCallbacks(runnableArr[0]);
        int i = f69322;
        if (i != 0) {
            int i2 = i - 1;
            f69322 = i2;
            if (i2 == 0) {
                f69323.m1193();
                f69323 = null;
                C4925.m14310(f69320);
            }
        }
        if (abstractActivityC3346 instanceof ActivityC15465) {
            abstractActivityC3346.finish();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48756(AbstractActivityC3346 abstractActivityC3346) {
        abstractActivityC3346.m10219(new RunnableC18056());
        C11287.m27901(abstractActivityC3346);
        m48767();
        C4925.m14316(new RunnableC0416(), 1000L);
        C4925.m14316(new RunnableC0416(), c.a);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48753(int i, int[] iArr) {
        int i2 = i == R.id.MT_Protector_res_0x7f0a0465 ? 1 : 0;
        iArr[0] = i2;
        ApplicationC20075.f65010.edit().putInt("remote_manager_last_protocol", i2 != 1 ? 0 : 1).apply();
        m48767();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48752() {
        m48767();
        C4925.m14316(new RunnableC0416(), 1000L);
        C4925.m14316(new RunnableC0416(), c.a);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m48759(int i, String str, boolean z) {
        if (i != 0 || !z || TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toString().toLowerCase(Locale.ROOT);
        return lowerCase.startsWith("http://") || lowerCase.startsWith("https://");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m48751(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException("size must be greater than 0");
        }
        EnumC20745 enumC20745 = EnumC20745.AZTEC;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i);
        }
        C22155 m29809 = C4516.m13290(str, EnumC0282.L).m29809();
        if (m29809 == null) {
            throw new IllegalStateException();
        }
        int m49774 = m29809.m49774();
        int m49773 = m29809.m49773();
        int i2 = m49774 + 8;
        int i3 = m49773 + 8;
        int max = Math.max(i, i2);
        int max2 = Math.max(i, i3);
        int min = Math.min(max / i2, max2 / i3);
        int i4 = (max - (m49774 * min)) / 2;
        int i5 = (max2 - (m49773 * min)) / 2;
        C15804 c15804 = new C15804(max, max2);
        int i6 = 0;
        while (i6 < m49773) {
            int i7 = 0;
            int i8 = i4;
            while (i7 < m49774) {
                if (m29809.m49768(i7, i6) == 1) {
                    c15804.m37442(i8, i5, min, min);
                }
                i7++;
                i8 += min;
            }
            i6++;
            i5 += min;
        }
        int[] iArr = new int[i * i];
        for (int i9 = 0; i9 < i; i9++) {
            int i10 = i9 * i;
            for (int i11 = 0; i11 < i; i11++) {
                iArr[i10 + i11] = c15804.m37443(i11, i9) ? -16777216 : -1;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, i, 0, 0, i, i);
        return createBitmap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48755(TextInputLayout textInputLayout, EditText editText, EditText editText2, TextInputLayout textInputLayout2, EditText editText3, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (m48760(textInputLayout, editText)) {
            String obj = editText2.getText().toString();
            if (!C3735.m11348(obj)) {
                textInputLayout2.setError(C4925.m14327(R.string.MT_Protector_res_0x7f120834));
                editText2.requestFocus();
                return;
            }
            textInputLayout2.setError(null);
            textInputLayout2.setErrorEnabled(false);
            C3735.m11347(editText3.getText().toString(), editText.getText().toString(), obj);
            if (ServiceC1618.m5485()) {
                f69321 = true;
                Application m14335 = C4925.m14335();
                m14335.stopService(new Intent(m14335, (Class<?>) ServiceC1618.class));
            }
            dialogInterfaceC0206.dismiss();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48754(TextInputLayout textInputLayout, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (m48760(textInputLayout, editText)) {
            C14981.m35463(editText2.getText().toString(), editText3.getText().toString(), editText4.getText().toString(), editText5.getText().toString(), editText.getText().toString());
            if (ServiceC7926.m21228()) {
                f69319 = true;
                Application m14335 = C4925.m14335();
                m14335.stopService(new Intent(m14335, (Class<?>) ServiceC7926.class));
            }
            dialogInterfaceC0206.dismiss();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m48760(TextInputLayout textInputLayout, EditText editText) {
        if (C21311.m48346(editText.getText().toString()) == null) {
            textInputLayout.setError(C4925.m14327(R.string.MT_Protector_res_0x7f12085b));
            editText.requestFocus();
            return false;
        }
        textInputLayout.setError(null);
        textInputLayout.setErrorEnabled(false);
        return true;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m48767() {
        Iterator it = f69324.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48762() {
        if (f69322 == 0) {
            f69323 = new C0123(C4925.m14335(), new RunnableC0416());
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_STARTED");
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_STOPPED");
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_FAILED_TO_START");
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_PAIRING_CODE_CHANGED");
            intentFilter.addAction("bin.mt.plus.FTP_SERVER_STARTED");
            intentFilter.addAction("bin.mt.plus.FTP_SERVER_STOPPED");
            intentFilter.addAction("bin.mt.plus.FTP_SERVER_FAILED_TO_START");
            C4925.m14311(f69320, intentFilter);
        }
        f69322++;
    }
}
