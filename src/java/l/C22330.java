package l;

import android.graphics.RectF;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.SurroundingText;
import android.view.inputmethod.TextAttribute;
import android.view.inputmethod.TextSnapshot;
import java.io.UncheckedIOException;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: 05ZM */
/* renamed from: l.᩹ܰᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22330 extends BaseInputConnection {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f72378;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f72379;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12392 f72380;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f72381;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f72382;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11042 f72383;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f72384;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f72385;

    public C22330(C12392 c12392, int i) {
        super(c12392, true);
        this.f72380 = c12392;
        this.f72382 = i;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        if (!m50066()) {
            return null;
        }
        C12392 c12392 = this.f72380;
        InterfaceC7785 m30436 = c12392.m30436();
        try {
            return super.getTextBeforeCursor(Math.min(i, 10000), i2);
        } catch (UncheckedIOException | C3966 e) {
            if (c12392.m30357(m30436, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        if (!m50066()) {
            return null;
        }
        C12392 c12392 = this.f72380;
        InterfaceC7785 m30436 = c12392.m30436();
        try {
            return super.getTextAfterCursor(Math.min(i, 10000), i2);
        } catch (UncheckedIOException | C3966 e) {
            if (c12392.m30357(m30436, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (!m50066()) {
            return null;
        }
        C12392 c12392 = this.f72380;
        InterfaceC7785 m30436 = c12392.m30436();
        try {
            int min = Math.min(c12392.m30444(), c12392.m30448());
            int max = Math.max(c12392.m30444(), c12392.m30448());
            if (min < 0 || max - min <= 10000) {
                return super.getSelectedText(i);
            }
            int i2 = min + 10000;
            return (i & 1) != 0 ? m30436.subSequence(min, i2) : TextUtils.substring(m30436, min, i2);
        } catch (UncheckedIOException | C3966 e) {
            if (c12392.m30357(m30436, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final SurroundingText getSurroundingText(int i, int i2, int i3) {
        if (!m50066()) {
            return null;
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Surrounding text lengths must be nonnegative");
        }
        C12392 c12392 = this.f72380;
        if (Math.abs(c12392.m30448() - c12392.m30444()) > 10000) {
            return null;
        }
        InterfaceC7785 m30436 = c12392.m30436();
        try {
            return super.getSurroundingText(Math.min(i, 10000), Math.min(i2, 10000), i3);
        } catch (UncheckedIOException | C3966 e) {
            if (c12392.m30357(m30436, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final TextSnapshot takeSnapshot() {
        if (!m50066()) {
            return null;
        }
        C12392 c12392 = this.f72380;
        InterfaceC7785 m30436 = c12392.m30436();
        try {
            return super.takeSnapshot();
        } catch (UncheckedIOException | C3966 e) {
            if (c12392.m30357(m30436, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return new C20486(this.f72380, this.f72382);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        if (!m50067()) {
            return false;
        }
        this.f72380.m30454();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        if (!m50066()) {
            return false;
        }
        this.f72380.m30534();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        C12392 c12392 = this.f72380;
        if (!m50067()) {
            return false;
        }
        try {
            C12392.f37169.clearMetaKeyState(c12392, getEditable(), i);
            c12392.m30400();
            c12392.invalidate();
            return true;
        } catch (AbstractMethodError unused) {
            return true;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        try {
            this.f72380.f37283.remove(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        C12392 c12392 = this.f72380;
        InterfaceC7785 m30436 = c12392.m30436();
        try {
            if (!m50067()) {
                return false;
            }
            c12392.m30466(i);
            return !c12392.m30441();
        } catch (UncheckedIOException | C3966 e) {
            if (c12392.m30357(m30436, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        C12392 c12392 = this.f72380;
        InterfaceC7785 m30436 = c12392.m30436();
        try {
            ExtractedText extractedText = new ExtractedText();
            if (c12392.m30351(extractedTextRequest, extractedText)) {
                if (c12392.m30437()) {
                    InterfaceC7785 m304362 = c12392.m30436();
                    this.f72383 = new C11042(extractedText.startOffset, extractedText.selectionStart, extractedText.selectionEnd, extractedText.text.length(), c12392.m30444(), c12392.m30448(), c12392.m30526(), m304362, m304362.mo26548());
                    this.f72381 = SystemClock.uptimeMillis();
                    return extractedText;
                }
                this.f72383 = null;
                return extractedText;
            }
            this.f72383 = null;
            return null;
        } catch (UncheckedIOException | C3966 e) {
            if (c12392.m30357(m30436, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        C12392 c12392 = this.f72380;
        InterfaceC7785 m30436 = c12392.m30436();
        try {
            if (!m50067()) {
                return false;
            }
            if (charSequence == null) {
                charSequence = "";
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f72384 = uptimeMillis;
            if (charSequence.length() == 0 && i == 1 && c12392.m30444() != c12392.m30448()) {
                this.f72378 = uptimeMillis;
            }
            C11042 c11042 = this.f72383;
            if (c11042 != null && c11042.f33200 > 0 && charSequence.length() == 2 && i == 1) {
                this.f72385 = uptimeMillis;
                this.f72379 = c12392.m30444();
            }
            return super.commitText(charSequence, i);
        } catch (UncheckedIOException | C3966 e) {
            if (c12392.m30357(m30436, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        C12392 c12392 = this.f72380;
        InterfaceC7785 m30436 = c12392.m30436();
        try {
            if (m50067()) {
                return super.setComposingText(charSequence, i);
            }
            return false;
        } catch (UncheckedIOException | C3966 e) {
            if (c12392.m30357(m30436, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean replaceText(int i, int i2, CharSequence charSequence, int i3, TextAttribute textAttribute) {
        C12392 c12392 = this.f72380;
        InterfaceC7785 m30436 = c12392.m30436();
        try {
            if (m50067()) {
                return super.replaceText(i, i2, charSequence, i3, textAttribute);
            }
            return false;
        } catch (UncheckedIOException | C3966 e) {
            if (c12392.m30357(m30436, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        C12392 c12392 = this.f72380;
        InterfaceC7785 m30436 = c12392.m30436();
        try {
            if (!m50067()) {
                return false;
            }
            if (i == 1 && i2 == 0 && SystemClock.uptimeMillis() - this.f72378 < 100) {
                return false;
            }
            return super.deleteSurroundingText(i, i2);
        } catch (UncheckedIOException | C3966 e) {
            if (c12392.m30357(m30436, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        C12392 c12392 = this.f72380;
        InterfaceC7785 m30436 = c12392.m30436();
        try {
            if (m50067()) {
                return super.deleteSurroundingTextInCodePoints(i, i2);
            }
            return false;
        } catch (UncheckedIOException | C3966 e) {
            if (c12392.m30357(m30436, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        C12392 c12392 = this.f72380;
        InterfaceC7785 m30436 = c12392.m30436();
        try {
            if (!m50067()) {
                return false;
            }
            int m50065 = m50065(i, i2);
            if (m50065 != 0) {
                i += m50065;
                i2 += m50065;
            }
            return super.setComposingRegion(i, i2);
        } catch (UncheckedIOException | C3966 e) {
            if (c12392.m30357(m30436, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        if (!m50066()) {
            return false;
        }
        Editable editable = getEditable();
        C12392 c12392 = this.f72380;
        c12392.m30454();
        try {
            BaseInputConnection.removeComposingSpans(editable);
            c12392.m30534();
            return true;
        } catch (Throwable th) {
            c12392.m30534();
            throw th;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        if (m50067()) {
            return super.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        if (m50067()) {
            return super.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        C12392 c12392 = this.f72380;
        InterfaceC7785 m30436 = c12392.m30436();
        try {
            if (!m50067()) {
                return false;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (i3 == 1 && i4 == 1 && uptimeMillis - this.f72385 < 100) {
                i3 = this.f72379 + 1;
                i4 = i3;
            } else {
                C11042 c11042 = this.f72383;
                if (c11042 != null && uptimeMillis - this.f72381 < 100) {
                    int i5 = c11042.f33202;
                    int i6 = c11042.f33203;
                    int i7 = c11042.f33200;
                    int i8 = c11042.f33198;
                    if (i7 != 0 && (Math.abs(i3 - i5) < 10 || Math.abs(i3 - i6) < 10)) {
                        i3 += i7;
                    } else if (i3 == i7 + i8 || i3 == i8) {
                        i3 = c12392.m30526();
                    }
                    if (i7 != 0 && (Math.abs(i4 - i5) < 10 || Math.abs(i4 - i6) < 10)) {
                        i4 += i7;
                    } else if (i4 == i7 + i8 || i4 == i8) {
                        i4 = c12392.m30526();
                    }
                }
            }
            if (!super.setSelection(i3, i4)) {
                return false;
            }
            if (i3 == i4) {
                c12392.m30400();
            }
            c12392.m30349(i4, false);
            if (uptimeMillis - this.f72384 >= 100) {
                return true;
            }
            c12392.m30501(false);
            return true;
        } catch (UncheckedIOException | C3966 e) {
            if (c12392.m30357(m30436, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        if (m50067()) {
            return super.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (m50067()) {
            return super.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        if (m50067()) {
            return super.reportFullscreenMode(z);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        if (m50067()) {
            return super.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        if (!m50066() || i < 0 || i > 3) {
            return false;
        }
        this.f72380.m30540(i, 0);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (m50067()) {
            return super.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        C12392 c12392 = this.f72380;
        InterfaceC7785 m30436 = c12392.m30436();
        try {
            if (m50067()) {
                return super.setComposingText(charSequence, i, textAttribute);
            }
            return false;
        } catch (UncheckedIOException | C3966 e) {
            if (c12392.m30357(m30436, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2, TextAttribute textAttribute) {
        C12392 c12392 = this.f72380;
        InterfaceC7785 m30436 = c12392.m30436();
        try {
            if (m50067()) {
                return setComposingRegion(i, i2);
            }
            return false;
        } catch (UncheckedIOException | C3966 e) {
            if (c12392.m30357(m30436, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        C12392 c12392 = this.f72380;
        InterfaceC7785 m30436 = c12392.m30436();
        try {
            if (m50067()) {
                return super.commitText(charSequence, i, textAttribute);
            }
            return false;
        } catch (UncheckedIOException | C3966 e) {
            if (c12392.m30357(m30436, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performSpellCheck() {
        if (m50067()) {
            return super.performSpellCheck();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (m50067()) {
            super.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (m50067()) {
            return super.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i, int i2) {
        if (!m50066() || i < 0 || i > 3) {
            return false;
        }
        this.f72380.m30540(i, i2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void requestTextBoundsInfo(RectF rectF, Executor executor, Consumer consumer) {
        if (m50067()) {
            super.requestTextBoundsInfo(rectF, executor, consumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setImeConsumesInput(boolean z) {
        if (m50067()) {
            return super.setImeConsumesInput(z);
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m50065(int i, int i2) {
        C11042 c11042 = this.f72383;
        if (c11042 == null) {
            return 0;
        }
        C12392 c12392 = this.f72380;
        InterfaceC7785 m30436 = c12392.m30436();
        return c11042.m27421(i, i2, c12392.m30444(), c12392.m30448(), c12392.m30526(), m30436, m30436.mo26548());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m50067() {
        return this.f72380.m30488(this.f72382);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m50066() {
        return this.f72380.m30502(this.f72382);
    }
}
