package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: E7F1 */
/* renamed from: l.ܶۡۡ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C15124 extends C10235 {

    /* renamed from: ܶܿ, reason: not valid java name and contains not printable characters */
    public C7385 f46241;

    @Override // l.C10235, l.C12392
    /* renamed from: ۬ۧ */
    public final boolean mo25914() {
        return false;
    }

    public C15124(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C22686 c22686 = this.f37245;
        c22686.m50690();
        c22686.m50691(1728053247 & C21943.f70257);
    }

    public C15124(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C22686 c22686 = this.f37245;
        c22686.m50690();
        c22686.m50691(1728053247 & C21943.f70257);
    }

    @Override // l.C10235, l.C12392
    /* renamed from: ܽ */
    public final void mo25918() {
        super.mo25918();
        this.f37245.m50691(1728053247 & C21943.f70257);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35828(C7385 c7385) {
        this.f46241 = c7385;
    }

    @Override // l.C12392, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        return new C1014(this, onCreateInputConnection);
    }
}
