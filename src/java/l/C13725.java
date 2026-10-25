package l;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* compiled from: FAZN */
/* renamed from: l.ܰۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13725 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2667 f40996;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EditText f40997;

    public C13725(EditText editText) {
        this.f40997 = editText;
        this.f40996 = new C2667(editText);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33024(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f40997.getContext().obtainStyledAttributes(attributeSet, C3390.f10706, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            m33025(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final KeyListener m33022(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener) ? this.f40996.m8356(keyListener) : keyListener;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33025(boolean z) {
        this.f40996.m8358(z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33026() {
        return this.f40996.m8359();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputConnection m33023(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f40996.m8357(inputConnection, editorInfo);
    }
}
