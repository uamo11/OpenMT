package l;

import android.text.TextWatcher;
import android.view.ViewParent;
import android.widget.EditText;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: 5AG9 */
/* renamed from: l.ۗ᩻᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC3577 implements Cloneable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f11347;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f11348;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f11349;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f11350;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f11351;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f11352;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f11353;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f11354;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashMap f11355;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f11356;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f11357;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f11358;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f11359;

    public abstract C19883 getIcon();

    public abstract String getName();

    /* renamed from: ֫ */
    public abstract String mo6365();

    /* renamed from: ֫ */
    public abstract AbstractC3163 mo6366(int i);

    /* renamed from: ֫ */
    public abstract void mo6367(AbstractActivityC3346 abstractActivityC3346);

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean mo10944() {
        return this instanceof C1936;
    }

    /* renamed from: ܽ */
    public abstract String mo6370();

    /* renamed from: ܿ */
    public abstract String mo6371();

    /* renamed from: ᩳ */
    public abstract String mo6372();

    public AbstractC3577(int i) {
        this.f11359 = "";
        this.f11354 = "";
        this.f11358 = false;
        this.f11349 = true;
        this.f11357 = true;
        this.f11353 = true;
        this.f11352 = true;
        this.f11348 = "10MB";
        this.f11347 = m10932("10MB");
        this.f11351 = 10;
        this.f11350 = false;
        this.f11355 = new HashMap();
        this.f11356 = i;
    }

    public AbstractC3577(JSONObject jSONObject) {
        this.f11359 = "";
        this.f11354 = "";
        this.f11358 = false;
        this.f11349 = true;
        this.f11357 = true;
        this.f11353 = true;
        this.f11352 = true;
        this.f11348 = "10MB";
        this.f11347 = m10932("10MB");
        this.f11351 = 10;
        this.f11350 = false;
        this.f11355 = new HashMap();
        this.f11356 = jSONObject.getInt("id");
        this.f11359 = jSONObject.getString("rk");
        this.f11354 = jSONObject.getString("ip");
        if (jSONObject.contains("hs")) {
            this.f11358 = jSONObject.getBoolean("hs");
        }
        if (jSONObject.contains("mt")) {
            this.f11349 = jSONObject.getBoolean("mt");
        }
        if (jSONObject.contains("fg")) {
            this.f11357 = jSONObject.getBoolean("fg");
        }
        if (jSONObject.contains("lt")) {
            this.f11353 = jSONObject.getBoolean("lt");
        }
        if (jSONObject.contains("ow")) {
            this.f11352 = jSONObject.getBoolean("ow");
        }
        if (jSONObject.contains("il")) {
            String string = jSONObject.getString("il");
            this.f11348 = string;
            this.f11347 = m10932(string);
        }
        if (jSONObject.contains("tl")) {
            this.f11351 = jSONObject.getInt("tl");
        }
        if (mo10944() && jSONObject.contains("sp")) {
            this.f11350 = jSONObject.getBoolean("sp");
        }
        if (jSONObject.contains("sm")) {
            JSONArray jSONArray = jSONObject.getJSONArray("sm");
            int size = jSONArray.size();
            for (int i = 0; i < size; i += 2) {
                this.f11355.put(jSONArray.getString(i), Integer.valueOf(jSONArray.getInt(i + 1)));
            }
        }
    }

    /* renamed from: ֫ */
    public void mo6368(AbstractC3577 abstractC3577) {
        this.f11359 = abstractC3577.f11359;
        this.f11354 = abstractC3577.f11354;
        this.f11358 = abstractC3577.f11358;
        this.f11349 = abstractC3577.f11349;
        this.f11350 = abstractC3577.f11350;
        HashMap hashMap = this.f11355;
        hashMap.clear();
        hashMap.putAll(abstractC3577.f11355);
        m10945(abstractC3577);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10945(AbstractC3577 abstractC3577) {
        this.f11357 = abstractC3577.f11357;
        this.f11353 = abstractC3577.f11353;
        this.f11352 = abstractC3577.f11352;
        String str = abstractC3577.f11348;
        this.f11348 = str;
        this.f11351 = abstractC3577.f11351;
        this.f11347 = m10932(str);
    }

    /* renamed from: ܳ */
    public JSONObject mo6369() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f11356);
        jSONObject.put("rk", this.f11359);
        jSONObject.put("ip", this.f11354);
        jSONObject.put("hs", this.f11358);
        jSONObject.put("mt", this.f11349);
        jSONObject.put("fg", this.f11357);
        jSONObject.put("lt", this.f11353);
        jSONObject.put("ow", this.f11352);
        jSONObject.put("il", this.f11348);
        jSONObject.put("tl", this.f11351);
        if (mo10944()) {
            jSONObject.put("sp", this.f11350);
        }
        HashMap hashMap = this.f11355;
        if (!hashMap.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONArray.add((String) entry.getKey());
                jSONArray.add(((Integer) entry.getValue()).intValue());
            }
            jSONObject.put("sm", jSONArray);
        }
        return jSONObject;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m10933(EditText editText, String str) {
        return editText.length() > 0 ? editText.getText().toString() : str;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m10943() {
        return C12749.m31040();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10938(EditText editText) {
        if (editText.length() <= 0) {
            return true;
        }
        try {
            Charset.forName(editText.getText().toString());
            return true;
        } catch (Exception unused) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1206ce);
            editText.requestFocus();
            return false;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10942(EditText editText) {
        if (!m10939(editText, R.string.MT_Protector_res_0x7f1206cf)) {
            return false;
        }
        String obj = editText.getText().toString();
        int indexOf = obj.indexOf("://");
        if (indexOf != -1) {
            editText.getText().delete(0, indexOf + 3);
            obj = editText.getText().toString();
        }
        int indexOf2 = obj.indexOf(47, indexOf);
        if (indexOf2 <= 0) {
            return true;
        }
        m10940(editText, R.string.MT_Protector_res_0x7f1202c1);
        editText.setSelection(indexOf2, editText.length());
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10939(EditText editText, int i) {
        if (editText.length() != 0) {
            return true;
        }
        m10940(editText, i);
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m10940(EditText editText, int i) {
        TextInputLayout textInputLayout;
        editText.requestFocus();
        ViewParent parent = editText.getParent();
        while (true) {
            if (parent == null) {
                textInputLayout = null;
                break;
            } else {
                if (parent instanceof TextInputLayout) {
                    textInputLayout = (TextInputLayout) parent;
                    break;
                }
                parent = parent.getParent();
            }
        }
        C11003.requireNonNull(textInputLayout);
        textInputLayout.setErrorEnabled(true);
        textInputLayout.setError(C4925.m14333(i));
        if (textInputLayout.getTag() instanceof TextWatcher) {
            return;
        }
        C4283 c4283 = new C4283(textInputLayout);
        textInputLayout.setTag(c4283);
        editText.addTextChangedListener(c4283);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10936(EditText editText, AbstractActivityC3346 abstractActivityC3346) {
        TextInputLayout textInputLayout;
        ViewParent parent = editText.getParent();
        while (true) {
            if (parent == null) {
                textInputLayout = null;
                break;
            } else {
                if (parent instanceof TextInputLayout) {
                    textInputLayout = (TextInputLayout) parent;
                    break;
                }
                parent = parent.getParent();
            }
        }
        C11003.requireNonNull(textInputLayout);
        textInputLayout.setEndIconMode(-1);
        textInputLayout.setEndIconDrawable(R.drawable.MT_Protector_res_0x7f080221);
        textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC23705(editText, abstractActivityC3346));
    }

    @Override // 
    public final AbstractC3577 clone() {
        try {
            return (AbstractC3577) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC3577 abstractC3577 = (AbstractC3577) obj;
            if (this.f11356 == abstractC3577.f11356 && C11003.equals(this.f11359, abstractC3577.f11359) && C11003.equals(this.f11354, abstractC3577.f11354) && this.f11358 == abstractC3577.f11358 && this.f11349 == abstractC3577.f11349 && this.f11350 == abstractC3577.f11350 && this.f11357 == abstractC3577.f11357 && this.f11353 == abstractC3577.f11353 && this.f11352 == abstractC3577.f11352 && this.f11347 == abstractC3577.f11347 && this.f11351 == abstractC3577.f11351) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int m46680 = (((((((((C20361.m46680(C20361.m46680(this.f11356 * 31, 31, this.f11359), 31, this.f11354) + (this.f11358 ? 1231 : 1237)) * 31) + (this.f11349 ? 1231 : 1237)) * 31) + (this.f11350 ? 1231 : 1237)) * 31) + (this.f11357 ? 1231 : 1237)) * 31) + (this.f11353 ? 1231 : 1237)) * 31;
        int i = this.f11352 ? 1231 : 1237;
        long j = this.f11347;
        return ((((m46680 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f11351;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10934(EditText editText, EditText editText2) {
        m10935(editText, editText2, new C11539(3));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m10932(String str) {
        long j;
        long j2 = str.endsWith("KB") ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS : 1048576L;
        try {
            j = Integer.parseInt(str.substring(0, str.length() - 2));
        } catch (NumberFormatException unused) {
            j = 10;
        }
        return j2 * j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10935(EditText editText, EditText editText2, Function function) {
        editText2.setHint(((CharSequence) function.apply(editText.getText())).toString());
        editText.addTextChangedListener(new C19100(editText2, function));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10937(JSONObject jSONObject, String str, String str2) {
        if (jSONObject.contains(str) || !jSONObject.contains(str2)) {
            return;
        }
        jSONObject.put(str, jSONObject.getBoolean(str2));
        jSONObject.remove(str2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m10941(JSONObject jSONObject, String str, String str2) {
        if (jSONObject.contains(str) || !jSONObject.contains(str2)) {
            return;
        }
        jSONObject.put(str, jSONObject.getString(str2));
        jSONObject.remove(str2);
    }
}
