package l;

import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;

/* compiled from: 81UC */
/* renamed from: l.᩵᩶ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19692 extends BaseInputConnection {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f63613;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f63614;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f63615;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f63616;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f63617;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f63618;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f63619;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0640 f63620;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f63621;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19692(C0640 c0640) {
        super(c0640, true);
        int i;
        this.f63620 = c0640;
        i = c0640.f2487;
        this.f63618 = i;
        this.f63617 = "";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m45289() {
        int i;
        if (this.f63615) {
            return false;
        }
        int i2 = this.f63618;
        C0640 c0640 = this.f63620;
        i = c0640.f2487;
        if (i2 != i) {
            return false;
        }
        c0640.f2467 = this;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        C19692 c19692;
        C19692 c196922;
        int i;
        C0640 c0640 = this.f63620;
        if (this.f63615) {
            return;
        }
        try {
            c196922 = c0640.f2467;
            if (c196922 == this) {
                int i2 = this.f63618;
                i = c0640.f2487;
                if (i2 == i) {
                    finishComposingText();
                }
            }
        } finally {
            this.f63615 = true;
            c19692 = c0640.f2467;
            if (c19692 == this) {
                c0640.f2467 = null;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                super.closeConnection();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m45292() {
        if (this.f63617.length() == 0) {
            return;
        }
        getEditable().delete(0, this.f63617.length());
        this.f63617 = "";
        this.f63621 = false;
        if (this.f63613 == 0) {
            m45296();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45288(C19692 c19692, int i, int i2) {
        if (c19692.f63619) {
            return;
        }
        if (i == 67 && i2 == 0 && c19692.f63617.length() > 0) {
            int offsetByCodePoints = Character.offsetByCodePoints(c19692.getEditable(), c19692.f63617.length(), -1);
            c19692.getEditable().delete(offsetByCodePoints, c19692.f63617.length());
            c19692.f63617 = c19692.f63617.substring(0, offsetByCodePoints);
            if (c19692.f63613 == 0) {
                c19692.m45296();
                return;
            }
            return;
        }
        c19692.m45292();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m45287(int r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19692.m45287(int, java.lang.String):void");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m45296() {
        C19692 c19692;
        C0640 c0640 = this.f63620;
        c19692 = c0640.f2467;
        if (c19692 != this) {
            return;
        }
        Editable editable = getEditable();
        InputMethodManager inputMethodManager = (InputMethodManager) c0640.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.updateSelection(c0640, Selection.getSelectionStart(editable), Selection.getSelectionEnd(editable), BaseInputConnection.getComposingSpanStart(editable), BaseInputConnection.getComposingSpanEnd(editable));
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        if (!beginBatchEdit()) {
            return false;
        }
        try {
            boolean composingText = super.setComposingText(charSequence, i);
            if (this.f63621) {
                m45287(0, getEditable().toString());
            }
            if (BaseInputConnection.getComposingSpanStart(getEditable()) < 0) {
                this.f63621 = false;
            }
            return composingText;
        } finally {
            endBatchEdit();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = false;
        if (!m45289()) {
            return false;
        }
        boolean composingRegion = super.setComposingRegion(i, i2);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(getEditable());
        if (composingSpanStart >= 0 && composingSpanStart < this.f63617.length()) {
            z = true;
        }
        this.f63621 = z;
        return composingRegion;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m45294() {
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(getEditable());
        return composingSpanStart < 0 ? this.f63617.length() : Math.min(composingSpanStart, this.f63617.length());
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        if (!beginBatchEdit()) {
            return false;
        }
        try {
            return super.setSelection(Math.max(i, m45294()), Math.max(i2, m45294()));
        } finally {
            endBatchEdit();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (m45289()) {
            return super.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        if (!m45289()) {
            return false;
        }
        this.f63613++;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        int i;
        int i2;
        if (this.f63615) {
            return false;
        }
        i = this.f63620.f2487;
        if (this.f63618 != i || (i2 = this.f63613) == 0) {
            return false;
        }
        int i3 = i2 - 1;
        this.f63613 = i3;
        if (i3 == 0) {
            Editable editable = getEditable();
            int m45294 = m45294();
            if (Selection.getSelectionStart(editable) < m45294 || Selection.getSelectionEnd(editable) < m45294) {
                Selection.setSelection(editable, m45294);
            }
            m45296();
        }
        return this.f63613 > 0;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        return m45290(i, i2, true);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        if (!beginBatchEdit()) {
            return false;
        }
        try {
            super.finishComposingText();
            this.f63621 = false;
            m45287(0, getEditable().toString());
            endBatchEdit();
            return true;
        } catch (Throwable th) {
            endBatchEdit();
            throw th;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        C17637 c17637;
        if (!beginBatchEdit()) {
            return false;
        }
        try {
            super.commitText(charSequence, i);
            this.f63621 = false;
            c17637 = this.f63620.f2465;
            if (c17637 == null) {
                return true;
            }
            m45287(0, getEditable().toString());
            return true;
        } finally {
            endBatchEdit();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return m45290(i, i2, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m45290(int i, int i2, boolean z) {
        boolean deleteSurroundingTextInCodePoints;
        if (i < 0 || i2 < 0 || !beginBatchEdit()) {
            return false;
        }
        Editable editable = getEditable();
        Object obj = new Object();
        editable.setSpan(obj, this.f63617.length(), this.f63617.length(), 17);
        int min = Math.min(Selection.getSelectionStart(editable), Selection.getSelectionEnd(editable));
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(editable);
        if (composingSpanStart >= 0) {
            min = Math.min(min, composingSpanStart);
        }
        if (z) {
            min = Character.codePointCount(editable, 0, min);
        }
        if (z) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    deleteSurroundingTextInCodePoints = super.deleteSurroundingTextInCodePoints(i, i2);
                    m45287(Math.max(0, i - min), editable.subSequence(0, editable.getSpanStart(obj)).toString());
                    return deleteSurroundingTextInCodePoints;
                }
            } finally {
                editable.removeSpan(obj);
                endBatchEdit();
            }
        }
        deleteSurroundingTextInCodePoints = super.deleteSurroundingText(i, i2);
        m45287(Math.max(0, i - min), editable.subSequence(0, editable.getSpanStart(obj)).toString());
        return deleteSurroundingTextInCodePoints;
    }
}
