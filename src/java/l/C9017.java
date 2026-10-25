package l;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* compiled from: 7B23 */
/* renamed from: l.ۡܿ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9017 extends C16071 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EditText f27377;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3372 f27378;

    public C9017(EditText editText) {
        this.f27377 = editText;
        C3372 c3372 = new C3372(editText);
        this.f27378 = c3372;
        editText.addTextChangedListener(c3372);
        editText.setEditableFactory(C4078.getInstance());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputConnection m23265(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection instanceof C19601 ? inputConnection : new C19601(this.f27377, inputConnection, editorInfo);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23266(boolean z) {
        this.f27378.m10303(z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m23267() {
        return this.f27378.m10304();
    }
}
