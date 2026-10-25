package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.editor.TextEditorFunction;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;

/* compiled from: J7R3 */
/* renamed from: l.ۨᩳܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11872 extends C11146 {

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C10461 f35407 = new C10461();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f35408;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f35409;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f35410;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f35411;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final JSONObject f35412;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f35413;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C10220 f35414;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f35415;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private synchronized C10220 m28996() {
        String stringNullable;
        String string = this.f35412.getString(am.av);
        String string2 = this.f35412.getString("b");
        C16709 m32219 = C13265.m32219(string);
        if (m32219 == null) {
            throw new C14501(C4925.m14306(R.string.MT_Protector_res_0x7f120778, string));
        }
        if (!m32219.m39301()) {
            throw new C14501(C4925.m14306(R.string.MT_Protector_res_0x7f120776, m32219.m39302()));
        }
        if (!m32219.m39321()) {
            throw new C14501(C4925.m14306(R.string.MT_Protector_res_0x7f12076d, m32219.m39302()));
        }
        C10220 c10220 = this.f35414;
        if (c10220 != null && c10220.f30697 == m32219 && ((TextEditorFunction) c10220.f30698).getContext() == m32219.m39304()) {
            return this.f35414;
        }
        Class m39305 = m32219.m39305(string2);
        if (m39305 == null) {
            throw new C14501(C4925.m14306(R.string.MT_Protector_res_0x7f120769, "[" + m32219.m39302() + "] " + string2));
        }
        try {
            TextEditorFunction textEditorFunction = (TextEditorFunction) m39305.newInstance();
            textEditorFunction.init(m32219.m39304());
            if (textEditorFunction.isEnabled()) {
                C10220 c102202 = new C10220(m32219, textEditorFunction);
                this.f35414 = c102202;
                return c102202;
            }
            PluginContext m39304 = m32219.m39304();
            String name = textEditorFunction.name();
            if (name.length() >= 3 && name.charAt(0) == '{' && name.charAt(name.length() - 1) == '}' && (stringNullable = ((C10632) m39304).getStringNullable(name)) != null) {
                name = stringNullable;
            }
            throw new C14501(C4925.m14306(R.string.MT_Protector_res_0x7f120768, "[" + m32219.m39302() + "] " + name));
        } catch (Exception e) {
            if (e instanceof C14501) {
                throw ((C14501) e);
            }
            m32219.m39290(e);
            throw new C14501(C4925.m14306(R.string.MT_Protector_res_0x7f12076d, m32219.m39302()));
        }
    }

    public C11872(JSONObject jSONObject, C10220 c10220) {
        super(34);
        boolean z;
        boolean z2;
        String stringNullable;
        this.f35412 = jSONObject;
        this.f35414 = c10220;
        boolean z3 = false;
        if (c10220 == null) {
            try {
                c10220 = m28996();
            } catch (C14501 e) {
                e = e;
                z = false;
                z2 = z3;
                this.f35409 = e.getMessage();
                this.f35415 = "❌ " + this.f35409;
                this.f35411 = C15297.m36319();
                this.f35410 = C13265.m32218();
                this.f35413 = z2;
                this.f35408 = z;
            } catch (Throwable th) {
                th = th;
                z = false;
                z2 = z3;
                this.f35409 = th.toString();
                this.f35415 = "❌ " + this.f35409;
                this.f35411 = C15297.m36319();
                this.f35410 = C13265.m32218();
                this.f35413 = z2;
                this.f35408 = z;
            }
        }
        C16709 c16709 = (C16709) c10220.f30697;
        TextEditorFunction textEditorFunction = (TextEditorFunction) c10220.f30698;
        z2 = textEditorFunction.supportEditTextView();
        try {
            z = textEditorFunction.supportRepeat();
            try {
                PluginContext m39304 = c16709.m39304();
                String name = textEditorFunction.name();
                if (name.length() >= 3 && name.charAt(0) == '{' && name.charAt(name.length() - 1) == '}' && (stringNullable = ((C10632) m39304).getStringNullable(name)) != null) {
                    name = stringNullable;
                }
                this.f35409 = name;
                this.f35415 = "⚡ [" + c16709.m39302() + "] " + this.f35409;
            } catch (C14501 e2) {
                e = e2;
                this.f35409 = e.getMessage();
                this.f35415 = "❌ " + this.f35409;
                this.f35411 = C15297.m36319();
                this.f35410 = C13265.m32218();
                this.f35413 = z2;
                this.f35408 = z;
            } catch (Throwable th2) {
                th = th2;
                this.f35409 = th.toString();
                this.f35415 = "❌ " + this.f35409;
                this.f35411 = C15297.m36319();
                this.f35410 = C13265.m32218();
                this.f35413 = z2;
                this.f35408 = z;
            }
        } catch (C14501 e3) {
            e = e3;
            z3 = z2;
            z = false;
            z2 = z3;
            this.f35409 = e.getMessage();
            this.f35415 = "❌ " + this.f35409;
            this.f35411 = C15297.m36319();
            this.f35410 = C13265.m32218();
            this.f35413 = z2;
            this.f35408 = z;
        } catch (Throwable th3) {
            th = th3;
            z3 = z2;
            z = false;
            z2 = z3;
            this.f35409 = th.toString();
            this.f35415 = "❌ " + this.f35409;
            this.f35411 = C15297.m36319();
            this.f35410 = C13265.m32218();
            this.f35413 = z2;
            this.f35408 = z;
        }
        this.f35411 = C15297.m36319();
        this.f35410 = C13265.m32218();
        this.f35413 = z2;
        this.f35408 = z;
    }

    @Override // l.C11146
    /* renamed from: ۧ */
    public final String mo27660() {
        m28997();
        return this.f35409;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m28998() {
        m28997();
        return this.f35415;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m28997() {
        C10220 m28996;
        C16709 c16709;
        String stringNullable;
        String m36319 = C15297.m36319();
        int m32218 = C13265.m32218();
        if (m36319.equals(this.f35411) && m32218 == this.f35410) {
            return;
        }
        C16709 c167092 = null;
        try {
            try {
                m28996 = m28996();
                c16709 = (C16709) m28996.f30697;
            } catch (Throwable th) {
                th = th;
            }
        } catch (C14501 e) {
            String message = e.getMessage();
            this.f35415 = message;
            this.f35409 = message;
        }
        try {
            TextEditorFunction textEditorFunction = (TextEditorFunction) m28996.f30698;
            this.f35413 = textEditorFunction.supportEditTextView();
            this.f35408 = textEditorFunction.supportRepeat();
            PluginContext m39304 = c16709.m39304();
            String name = textEditorFunction.name();
            if (name.length() >= 3 && name.charAt(0) == '{' && name.charAt(name.length() - 1) == '}' && (stringNullable = ((C10632) m39304).getStringNullable(name)) != null) {
                name = stringNullable;
            }
            this.f35409 = name;
            this.f35415 = "⚡ [" + c16709.m39302() + "] " + this.f35409;
        } catch (Throwable th2) {
            th = th2;
            c167092 = c16709;
            String th3 = th.toString();
            this.f35415 = th3;
            this.f35409 = th3;
            if (c167092 != null) {
                c167092.m39290(th);
            }
            this.f35411 = m36319;
            this.f35410 = m32218;
        }
        this.f35411 = m36319;
        this.f35410 = m32218;
    }

    @Override // l.C11146
    /* renamed from: ᩳ */
    public final JSONObject mo27664() {
        return this.f35412;
    }

    @Override // l.C11146
    /* renamed from: ܳ */
    public final boolean mo27661() {
        if (this.f35410 != C13265.m32218()) {
            m28997();
        }
        return this.f35413;
    }

    @Override // l.C11146
    /* renamed from: ᩻ */
    public final boolean mo14042() {
        if (this.f35410 != C13265.m32218()) {
            m28997();
        }
        return this.f35408;
    }

    @Override // l.C11146
    /* renamed from: ֫ */
    public final void mo14040(View view, InterfaceC1973 interfaceC1973) {
        C16709 c16709;
        if (interfaceC1973.mo6482() == null) {
            return;
        }
        AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) C5350.m15313(view.getContext());
        if (abstractActivityC3346 == null) {
            C21374.m48464("Cannot get the activity");
            return;
        }
        try {
            try {
                C10220 m28996 = m28996();
                c16709 = (C16709) m28996.f30697;
                try {
                    ((TextEditorFunction) m28996.f30698).doFunction(new C17979(c16709.m39304(), abstractActivityC3346), new C17351(interfaceC1973.mo6482()), this.f35412.getJSONObject(am.aF));
                } catch (Throwable th) {
                    th = th;
                    abstractActivityC3346.m10223(th, (DialogInterface.OnDismissListener) null);
                    if (c16709 != null) {
                        c16709.m39290(th);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                c16709 = null;
            }
        } catch (C14501 e) {
            C21374.m48459((CharSequence) e.getMessage());
        }
    }

    @Override // l.C11146
    /* renamed from: ֫ */
    public final void mo14041(View view, C10235 c10235) {
        if (!this.f35413) {
            throw new IllegalStateException();
        }
        AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) C5350.m15313(view.getContext());
        if (abstractActivityC3346 == null) {
            C21374.m48464("Cannot get the activity");
            return;
        }
        try {
            C10220 m28996 = m28996();
            ((TextEditorFunction) m28996.f30698).doFunction(new C17979(((C16709) m28996.f30697).m39304(), abstractActivityC3346), new C17351(c10235), this.f35412.getJSONObject(am.aF));
        } catch (C14501 e) {
            C21374.m48459((CharSequence) e.getMessage());
        } catch (Throwable th) {
            abstractActivityC3346.m10223(th, (DialogInterface.OnDismissListener) null);
        }
    }
}
