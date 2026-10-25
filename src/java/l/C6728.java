package l;

import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.translation.BatchTranslationEngine;
import bin.mt.plugin.api.translation.TranslationEngine;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: 33YQ */
/* renamed from: l.ۜۧᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C6728 extends AbstractC1083 {

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static String f20889 = ApplicationC20075.f65008.getString("src_lan", null);

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static String f20890 = ApplicationC20075.f65008.getString("tar_lan", null);

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Spinner f20891;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public View f20892;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f20893;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f20895;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public View f20896;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public List f20899;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public TranslationEngine.Configuration f20900;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Spinner f20902;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TranslationEngine f20903;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f20904;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17911 f20905;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public List f20906;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f20908;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16709 f20909;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ArrayList f20898 = new ArrayList();

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ArrayList f20907 = new ArrayList();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f20897 = false;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f20894 = false;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f20901 = true;

    public C6728(AbstractActivityC3346 abstractActivityC3346, C16709 c16709, TranslationEngine translationEngine) {
        String stringNullable;
        this.f20893 = abstractActivityC3346;
        this.f20909 = c16709;
        this.f20903 = translationEngine;
        this.f20905 = new C17911(translationEngine);
        if (c16709 != null) {
            PluginContext m39304 = c16709.m39304();
            String name = translationEngine.name();
            if (name.length() >= 3 && name.charAt(0) == '{' && C7416.m19937(1, name) == '}' && (stringNullable = ((C10632) m39304).getStringNullable(name)) != null) {
                name = stringNullable;
            }
            this.f20904 = name;
        } else {
            this.f20904 = translationEngine.name();
        }
        this.f20900 = translationEngine.getConfiguration();
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d01e5);
        this.f20896 = m10216;
        ((TextView) m10216.findViewById(R.id.textView1)).setText(R.string.MT_Protector_res_0x7f1209d0);
        this.f20902 = (Spinner) m10216.findViewById(R.id.spinner1);
        View m102162 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d01e5);
        this.f20892 = m102162;
        ((TextView) m102162.findViewById(R.id.textView1)).setText(R.string.MT_Protector_res_0x7f120a20);
        this.f20891 = (Spinner) m102162.findViewById(R.id.spinner1);
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m18325() {
        C16709 c16709 = this.f20909;
        return c16709 == null ? "bin.mt.plugin.system" : c16709.m39295();
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final TranslationEngine m18324() {
        return this.f20903;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m18310() {
        /*
            r10 = this;
            r0 = 0
            r10.f20894 = r0
            r10.f20897 = r0
            java.util.ArrayList r1 = r10.f20898
            r1.clear()
            java.util.ArrayList r2 = r10.f20907
            r2.clear()
            bin.mt.plugin.api.translation.TranslationEngine$Configuration r3 = r10.f20900
            boolean r3 = r3.disableAutoHideLanguage
            if (r3 == 0) goto L18
            java.util.Set r3 = java.util.Collections.EMPTY_SET
            goto L1c
        L18:
            java.util.Set r3 = l.C1683.m5684()
        L1c:
            java.util.ArrayList r4 = new java.util.ArrayList
            bin.mt.plugin.api.translation.TranslationEngine r5 = r10.f20903
            java.util.List r6 = r5.loadSourceLanguages()
            r4.<init>(r6)
            r10.f20899 = r4
            java.util.Iterator r4 = r4.iterator()
        L2d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L4b
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r5.getLanguageDisplayName(r6)
            boolean r7 = r3.contains(r6)
            if (r7 == 0) goto L47
            r4.remove()
            goto L2d
        L47:
            r1.add(r6)
            goto L2d
        L4b:
            java.util.List r4 = r10.f20899
            boolean r4 = r4.isEmpty()
            r6 = 1
            java.lang.String r7 = "-- NULL --"
            if (r4 == 0) goto L62
            r10.f20897 = r6
            java.util.List r4 = java.util.Collections.singletonList(r7)
            r10.f20899 = r4
            r1.add(r7)
            goto L6f
        L62:
            java.lang.String r4 = l.C6728.f20889
            if (r4 == 0) goto L6f
            int r1 = r1.indexOf(r4)
            int r1 = java.lang.Math.max(r0, r1)
            goto L70
        L6f:
            r1 = 0
        L70:
            android.widget.Spinner r4 = r10.f20902
            r4.setSelection(r1)
            boolean r4 = r10.f20897
            android.widget.Spinner r8 = r10.f20891
            if (r4 == 0) goto L88
            java.util.List r1 = java.util.Collections.singletonList(r7)
            r10.f20906 = r1
            r2.add(r7)
            r8.setSelection(r0)
            return
        L88:
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r9 = r10.f20899
            java.lang.Object r1 = r9.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r1 = r5.loadTargetLanguages(r1)
            r4.<init>(r1)
            r10.f20906 = r4
            java.util.Iterator r1 = r4.iterator()
        L9f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lbd
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r5.getLanguageDisplayName(r4)
            boolean r9 = r3.contains(r4)
            if (r9 == 0) goto Lb9
            r1.remove()
            goto L9f
        Lb9:
            r2.add(r4)
            goto L9f
        Lbd:
            java.util.List r1 = r10.f20906
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Ld1
            r10.f20894 = r6
            java.util.List r1 = java.util.Collections.singletonList(r7)
            r10.f20906 = r1
            r2.add(r7)
            goto Ldd
        Ld1:
            java.lang.String r1 = l.C6728.f20890
            if (r1 == 0) goto Ldd
            int r1 = r2.indexOf(r1)
            int r0 = java.lang.Math.max(r0, r1)
        Ldd:
            r8.setSelection(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6728.m18310():void");
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m18309() {
        this.f20901 = false;
        m18310();
        ArrayList arrayList = this.f20898;
        AbstractActivityC3346 abstractActivityC3346 = this.f20893;
        C20065 c20065 = new C20065(abstractActivityC3346, arrayList);
        Spinner spinner = this.f20902;
        spinner.setAdapter((SpinnerAdapter) c20065);
        C20065 c200652 = new C20065(abstractActivityC3346, this.f20907);
        Spinner spinner2 = this.f20891;
        spinner2.setAdapter((SpinnerAdapter) c200652);
        C23661 c23661 = new C23661(this);
        spinner.setOnItemSelectedListener(c23661);
        spinner2.setOnItemSelectedListener(c23661);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m18320() {
        int i = 0;
        this.f20894 = false;
        String str = this.f20908;
        TranslationEngine translationEngine = this.f20903;
        this.f20906 = new ArrayList(translationEngine.loadTargetLanguages(str));
        Set m5684 = this.f20900.disableAutoHideLanguage ? Collections.EMPTY_SET : C1683.m5684();
        ArrayList arrayList = this.f20907;
        arrayList.clear();
        Iterator it = this.f20906.iterator();
        while (it.hasNext()) {
            String languageDisplayName = translationEngine.getLanguageDisplayName((String) it.next());
            if (m5684.contains(languageDisplayName)) {
                it.remove();
            } else {
                arrayList.add(languageDisplayName);
            }
        }
        if (this.f20906.isEmpty()) {
            this.f20894 = true;
            this.f20906 = Collections.singletonList("-- NULL --");
            arrayList.add("-- NULL --");
        } else {
            String str2 = this.f20895;
            if (str2 != null) {
                i = Math.max(0, this.f20906.indexOf(str2));
            }
        }
        Spinner spinner = this.f20891;
        ((BaseAdapter) spinner.getAdapter()).notifyDataSetChanged();
        spinner.setSelection(i);
    }

    @Override // l.AbstractC1083
    /* renamed from: ܿ */
    public final String mo3742() {
        return this.f20904;
    }

    @Override // l.AbstractC1083
    /* renamed from: ֫ */
    public final void mo3733(C10856 c10856) {
        int indexOf;
        int indexOf2;
        c10856.addView(this.f20896);
        c10856.addView(this.f20892);
        if (this.f20901) {
            try {
                m18309();
                return;
            } catch (RuntimeException e) {
                C16709 c16709 = this.f20909;
                if (c16709 != null) {
                    c16709.m39290(e);
                    return;
                } else {
                    C15297.m36311("bin.mt.plugin.system", null, e);
                    return;
                }
            }
        }
        if (this.f20897 || this.f20894) {
            return;
        }
        String str = f20889;
        String str2 = f20890;
        if (str == null || (indexOf = this.f20898.indexOf(str)) == -1) {
            return;
        }
        this.f20902.setSelection(indexOf);
        if (this.f20900.targetLanguageMutable) {
            this.f20908 = (String) this.f20899.get(indexOf);
            m18320();
        }
        if (str2 == null || (indexOf2 = this.f20907.indexOf(str2)) == -1) {
            return;
        }
        this.f20891.setSelection(indexOf2);
    }

    @Override // l.AbstractC1083
    /* renamed from: ܽ */
    public final boolean mo3741() {
        if (this.f20897 || this.f20894) {
            C21374.m48459((CharSequence) "Error!");
            return false;
        }
        int selectedItemPosition = this.f20902.getSelectedItemPosition();
        if (selectedItemPosition < 0 || selectedItemPosition >= this.f20899.size()) {
            StringBuilder m32308 = C13325.m32308(selectedItemPosition, "Error: srcLanguageCode index ", " size ");
            m32308.append(this.f20899.size());
            C21374.m48459((CharSequence) m32308.toString());
            return false;
        }
        this.f20908 = (String) this.f20899.get(selectedItemPosition);
        int selectedItemPosition2 = this.f20891.getSelectedItemPosition();
        if (selectedItemPosition2 < 0 || selectedItemPosition2 >= this.f20906.size()) {
            StringBuilder m323082 = C13325.m32308(selectedItemPosition2, "Error: tarLanguageCode index ", " size ");
            m323082.append(this.f20906.size());
            C21374.m48459((CharSequence) m323082.toString());
            return false;
        }
        String str = (String) this.f20906.get(selectedItemPosition2);
        this.f20895 = str;
        if (!this.f20908.equals(str)) {
            m18321();
            return true;
        }
        C21374.m48459((CharSequence) ("Error: " + f20889 + " >> " + f20890));
        return false;
    }

    @Override // l.AbstractC1083
    /* renamed from: ۧ */
    public final void mo3739() {
        this.f20903.beforeStart();
    }

    @Override // l.AbstractC1083
    /* renamed from: ۜ */
    public final void mo3736() {
        this.f20903.onStart();
    }

    @Override // l.AbstractC1083
    /* renamed from: ᩷ */
    public final boolean mo3744() {
        return !this.f20900.forceNotToSkipTranslated;
    }

    @Override // l.AbstractC1083
    /* renamed from: ۧ */
    public final String mo3738(String str, String str2) {
        if (this.f20900.acceptTranslated && str2 != null) {
            str = str2;
        }
        return this.f20905.m41890(str, this.f20908, this.f20895);
    }

    @Override // l.AbstractC1083
    /* renamed from: ۢ */
    public final boolean mo3737() {
        return this.f20905.m41892();
    }

    @Override // l.AbstractC1083
    /* renamed from: ᩳ */
    public final BatchTranslationEngine.BatchingStrategy mo3743() {
        return this.f20905.m41889();
    }

    @Override // l.AbstractC1083
    /* renamed from: ֫ */
    public final String[] mo3735(String[] strArr, String[] strArr2) {
        if (this.f20900.acceptTranslated) {
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr2[i];
                if (str != null) {
                    strArr[i] = str;
                }
            }
        }
        return this.f20905.m41891(strArr, this.f20908, this.f20895);
    }

    @Override // l.AbstractC1083
    /* renamed from: ֫ */
    public final String mo3731(String str, String str2) {
        return (!this.f20900.acceptTranslated || str2 == null) ? str : str2;
    }

    @Override // l.AbstractC1083
    /* renamed from: ܳ */
    public final void mo3740() {
        this.f20903.onFinish();
    }

    @Override // l.AbstractC1083
    /* renamed from: ֫ */
    public final void mo3732() {
        this.f20903.afterFinish();
    }

    @Override // l.AbstractC1083
    /* renamed from: ֫ */
    public final boolean mo3734(Exception exc) {
        try {
            return this.f20903.onError(exc);
        } catch (Throwable th) {
            C16709 c16709 = this.f20909;
            if (c16709 != null) {
                c16709.m39290(th);
                return false;
            }
            C15297.m36311("bin.mt.plugin.system", null, th);
            return false;
        }
    }

    @Override // l.AbstractC1083
    /* renamed from: ᩻ */
    public final void mo3745() {
        if (this.f20901) {
            return;
        }
        m18310();
        ((BaseAdapter) this.f20902.getAdapter()).notifyDataSetChanged();
        ((BaseAdapter) this.f20891.getAdapter()).notifyDataSetChanged();
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static void m18321() {
        ApplicationC20075.f65008.edit().putString("src_lan", f20889).putString("tar_lan", f20890).apply();
    }
}
