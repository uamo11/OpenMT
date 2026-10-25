package l;

import java.io.EOFException;

/* compiled from: O1K3 */
/* renamed from: l.ۤ᩷ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10540 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f31646;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 f31647;

    public C10540(InterfaceC7785 interfaceC7785, int i) {
        this.f31647 = interfaceC7785;
        this.f31646 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26469() {
        while (true) {
            int i = this.f31646;
            InterfaceC7785 interfaceC7785 = this.f31647;
            if (i < interfaceC7785.length()) {
                char charAt = interfaceC7785.charAt(this.f31646);
                if (charAt != ' ' && charAt != '\t' && charAt != '\n' && charAt != '\r') {
                    return;
                } else {
                    this.f31646++;
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26470(String str) {
        while (true) {
            int i = this.f31646;
            InterfaceC7785 interfaceC7785 = this.f31647;
            if (i < interfaceC7785.length()) {
                if (str.indexOf(interfaceC7785.charAt(this.f31646)) != -1) {
                    return;
                } else {
                    this.f31646++;
                }
            } else {
                throw new EOFException();
            }
        }
    }
}
