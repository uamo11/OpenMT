package l;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import java.lang.reflect.Array;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;

/* compiled from: CB2D */
/* renamed from: l.ۤ᩸ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C10567 implements InterfaceC20445, AutoCloseable {

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final InputFilter[] f31701 = new InputFilter[0];

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f31702;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f31703;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputFilter[] f31704;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f31705;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f31706;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C18077 f31707;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C23721 f31708;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile int f31709;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC0897 f31710;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C10776 f31711;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock.ReadLock f31712;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C11978 f31713;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock.WriteLock f31714;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2827 f31715;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f31716;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f31717;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f31718;

    @Override // android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Editable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // android.text.Editable
    public final /* bridge */ /* synthetic */ Editable insert(int i, CharSequence charSequence) {
        insert(i, charSequence);
        return this;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0897 m26561() {
        return this.f31710;
    }

    public C10567() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f31705 = reentrantReadWriteLock;
        this.f31712 = reentrantReadWriteLock.readLock();
        this.f31714 = reentrantReadWriteLock.writeLock();
        this.f31710 = new C13388(this);
        this.f31704 = f31701;
        C11999.m29337(0, 0, 0);
        this.f31708 = null;
        C2827 c2827 = new C2827("");
        this.f31715 = c2827;
        c2827.m8725(new C9883(0, 0, "", 0, 0), null);
        this.f31713 = new C11978(this, "", 0);
    }

    public C10567(C23721 c23721) {
        this(c23721, null);
    }

    public C10567(C23721 c23721, CharSequence charSequence) {
        C11978 c11978;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f31705 = reentrantReadWriteLock;
        this.f31712 = reentrantReadWriteLock.readLock();
        this.f31714 = reentrantReadWriteLock.writeLock();
        this.f31710 = new C13388(this);
        this.f31704 = f31701;
        this.f31708 = c23721;
        this.f31715 = null;
        if (charSequence == null) {
            c11978 = new C11978(this, null, 0);
        } else {
            c11978 = new C11978(this, charSequence, charSequence.length());
        }
        this.f31713 = c11978;
        C5089 m52359 = c23721.m52359();
        this.f31702 = true;
        try {
            if (m52359.m14642() >= 0) {
                setSpan(Selection.SELECTION_START, m52359.m14642(), m52359.m14642(), 34);
            }
            if (m52359.m14640() >= 0) {
                setSpan(Selection.SELECTION_END, m52359.m14640(), m52359.m14640(), 34);
            }
        } finally {
            this.f31702 = false;
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C12704 m26565() {
        m26546();
        C23721 c23721 = this.f31708;
        return c23721 == null ? this.f31715.m8724() : c23721.m52357();
    }

    @Override // l.InterfaceC20445
    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final C7744 mo26556() {
        return m26544(false);
    }

    @Override // l.InterfaceC20445
    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C7744 mo26562() {
        return m26544(true);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C7744 m26544(boolean z) {
        C23721 c23721;
        this.f31712.lock();
        try {
            if (this.f31718 != 0) {
                throw new IllegalStateException("Text replacement is not published");
            }
            m26546();
            C12704 m26565 = (!z || (c23721 = this.f31708) == null) ? m26565() : c23721.m52367();
            int i = this.f31709;
            this.f31712.unlock();
            return C7744.m20754(m26565, i);
        } catch (Throwable th) {
            this.f31712.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0032, code lost:
    
        if (r4.m52346(r0) != false) goto L22;
     */
    @Override // l.InterfaceC20445
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo26553(l.C7744 r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            l.۫᩹ᩳ r0 = r4.m20764()
        L8:
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r3.f31712
            r2.lock()
            boolean r2 = r3.f31716     // Catch: java.lang.Throwable -> L3b
            if (r2 != 0) goto L35
            int r2 = r3.f31718     // Catch: java.lang.Throwable -> L3b
            if (r2 != 0) goto L35
            int r4 = r4.m20767()     // Catch: java.lang.Throwable -> L3b
            int r2 = r3.f31709     // Catch: java.lang.Throwable -> L3b
            if (r4 != r2) goto L35
            l.᩻۬ᩳ r4 = r3.f31708     // Catch: java.lang.Throwable -> L3b
            if (r4 != 0) goto L2e
            l.ۖ᩹ᩳ r4 = r3.f31715     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r4.m8726(r0)     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L35
            goto L34
        L2e:
            boolean r4 = r4.m52346(r0)     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L35
        L34:
            r1 = 1
        L35:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r3.f31712
            r4.unlock()
            return r1
        L3b:
            r4 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.f31712
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10567.mo26553(l.۟᩸ᩳ):boolean");
    }

    /* renamed from: ۤ֫ */
    public EnumC16665 mo1599() {
        return m26545(false);
    }

    /* renamed from: ۗ֫ */
    public EnumC16665 mo1597() {
        return m26545(true);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26560(Runnable runnable) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f31714;
        writeLock.lock();
        try {
            m26546();
            C23721 c23721 = this.f31708;
            if (c23721 == null) {
                throw new IllegalStateException("History requires a text session");
            }
            int i = this.f31703;
            if (i != 0 || this.f31706 != 0) {
                throw new IllegalStateException("Cannot group history during text callbacks");
            }
            this.f31703 = i + 1;
            try {
                m26555();
                c23721.m52335(runnable);
            } finally {
                this.f31703--;
            }
        } finally {
            writeLock.unlock();
        }
    }

    /* renamed from: ۬ */
    public int mo13049() {
        return hashCode();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private EnumC16665 m26545(boolean z) {
        EnumC16665 m52333;
        this.f31714.lock();
        try {
            if (this.f31716) {
                m52333 = EnumC16665.UNAVAILABLE;
            } else {
                m26546();
                if (this.f31708 == null) {
                    throw new IllegalStateException("History requires a text session");
                }
                int i = this.f31703;
                if (i != 0 || this.f31706 != 0) {
                    throw new IllegalStateException("Cannot replay history during text callbacks");
                }
                this.f31703 = i + 1;
                try {
                    m26555();
                    m52333 = this.f31708.m52333(z, new C12683(this));
                } finally {
                    this.f31703--;
                }
            }
            return m52333;
        } finally {
            this.f31714.unlock();
        }
    }

    /* renamed from: ֫ */
    public void mo13046(boolean z) {
        close();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26551(C23721 c23721) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f31714;
        writeLock.lock();
        try {
            m26546();
            if (this.f31708 != c23721) {
                throw new IllegalArgumentException("Text batch belongs to another session");
            }
            if (this.f31706 != 0 || this.f31703 != 0) {
                throw new IllegalStateException("Cannot publish text load during callbacks");
            }
        } finally {
            writeLock.unlock();
        }
    }

    /* renamed from: ֫ */
    public C5131 mo13045(C18495 c18495) {
        return c18495.m42996(this.f31710);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m26554(C23721 c23721, C0149 c0149, char[] cArr, int i, C5131 c5131, int i2) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f31714;
        writeLock.lock();
        try {
            m26551(c23721);
            return this.f31708.m52345(this.f31710, c0149, cArr, i, c5131, i2);
        } finally {
            writeLock.unlock();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26550(C18077 c18077) {
        int length = length();
        C18077 c180772 = this.f31707;
        this.f31707 = c18077;
        this.f31706++;
        try {
            this.f31713.m29278(length, length, (CharSequence) CharBuffer.wrap(c18077.m42138(), 0, c18077.m42139()), 0, c18077.m42139(), true);
            this.f31713.getClass();
        } finally {
            this.f31707 = c180772;
            this.f31706--;
        }
    }

    @Override // l.InterfaceC20445
    public final void setSelection(int i) {
        setSelection(i, i);
    }

    @Override // l.InterfaceC20445
    public final void setSelection(int i, int i2) {
        this.f31714.lock();
        try {
            if (!this.f31716) {
                Selection.setSelection(this, Math.min(i, length()), Math.min(i2, length()));
            }
        } finally {
            this.f31714.unlock();
        }
    }

    @Override // android.text.Editable
    public C10567 replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m26540(i, i2, charSequence, i3, i4, (C10776) null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m26540(int i, int i2, CharSequence charSequence, int i3, int i4, C10776 c10776) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f31714;
        if (this.f31716) {
            return;
        }
        int length = charSequence.length();
        if (this.f31716) {
            return;
        }
        if (i3 < 0 || i4 < i3 || i4 > length) {
            StringBuilder m46682 = C20361.m46682("start = ", i3, ", end = ", ", length = ", i4);
            m46682.append(length);
            throw new IndexOutOfBoundsException(m46682.toString());
        }
        CharSequence charSequence2 = charSequence;
        int i5 = i3;
        int i6 = i4;
        for (InputFilter inputFilter : this.f31704) {
            if (this.f31716) {
                return;
            }
            CharSequence filter = inputFilter.filter(charSequence2, i5, i6, this, i, i2);
            if (this.f31716) {
                return;
            }
            if (filter != null) {
                charSequence2 = filter;
                i6 = filter.length();
                i5 = 0;
            }
        }
        writeLock.lock();
        try {
            if (m26543()) {
                m26555();
                C11999.m29337(i, i2, length());
                C11999.m29338(length(), i2 - i, i6 - i5);
                this.f31706++;
                C10776 c107762 = this.f31711;
                C18077 c18077 = this.f31707;
                this.f31711 = c10776;
                this.f31707 = null;
                try {
                    this.f31713.m29278(i, i2, charSequence2, i5, i6, false);
                    this.f31713.getClass();
                } finally {
                    this.f31711 = c107762;
                    this.f31707 = c18077;
                    this.f31706--;
                }
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // l.InterfaceC20445
    /* renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public final int mo26548() {
        return this.f31709;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m26564() {
        if (this.f31705.isWriteLockedByCurrentThread()) {
            return (this.f31706 == 0 && this.f31703 == 0) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.ۗ᩸ᩳ] */
    /* JADX WARN: Type inference failed for: r8v0, types: [l.ۙ᩸ᩳ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26549(final int i, final int i2, final CharSequence charSequence, final int i3, final int i4) {
        this.f31718++;
        if (i != i2 || i3 != i4) {
            try {
                this.f31709++;
            } finally {
                this.f31718--;
            }
        }
        C23721 c23721 = this.f31708;
        if (c23721 == 0) {
            C2827 c2827 = this.f31715;
            c2827.getClass();
            c2827.m8725(new C9883(i, i2, charSequence, i3, i4), null);
        } else {
            C18077 c18077 = this.f31707;
            if (c18077 != null) {
                c23721.m52342(c18077);
            } else {
                C10776 c10776 = this.f31711;
                if (c10776 != null) {
                    c23721.m52340(c10776, (C4922) new Consumer() { // from class: l.ۙ᩸ᩳ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C23517.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((C16231) obj).m38194(i, i2, charSequence, i3, i4);
                        }
                    });
                } else {
                    c23721.m52339((C3511) new Consumer() { // from class: l.ۗ᩸ᩳ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C23517.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((C16231) obj).m38194(i, i2, charSequence, i3, i4);
                        }
                    });
                }
            }
        }
    }

    @Override // android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        return replace(i, i, charSequence, i2, i3);
    }

    @Override // android.text.Editable
    public final Editable delete(int i, int i2) {
        return replace(i, i2, "");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26558(int i) {
        replace(0, i, "");
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final void append(CharSequence charSequence) {
        insert(length(), charSequence);
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        int length = length();
        replace(length, length, charSequence, i, i2);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        int length = length();
        replace(length, length, charSequence, i, i2);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        insert(length(), (CharSequence) String.valueOf(c));
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        insert(length(), (CharSequence) String.valueOf(c));
        return this;
    }

    @Override // android.text.Editable
    public final void clear() {
        m26558(length());
    }

    @Override // android.text.Editable
    public final void setFilters(InputFilter[] inputFilterArr) {
        this.f31714.lock();
        try {
            if (!this.f31716) {
                if (inputFilterArr == null) {
                    throw new IllegalArgumentException();
                }
                this.f31704 = inputFilterArr;
            }
        } finally {
            this.f31714.unlock();
        }
    }

    @Override // android.text.Editable
    public final InputFilter[] getFilters() {
        return this.f31704;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        ReentrantReadWriteLock.ReadLock readLock = this.f31712;
        readLock.lock();
        try {
            m26541(i, i2, cArr, i3);
        } finally {
            readLock.unlock();
        }
    }

    @Override // l.InterfaceC20445
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo26559(int i, int i2, char[] cArr, int i3) {
        m26541(i, i2, cArr, i3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26541(int i, int i2, char[] cArr, int i3) {
        C12704 m26547 = m26547();
        try {
            if (m26547 != null) {
                m26547.getChars(i, i2, cArr, i3);
            } else {
                int i4 = i2 - i;
                if (i < 0 || i2 < i || i3 < 0 || i4 > cArr.length - i3) {
                    throw new IndexOutOfBoundsException("Invalid character copy range");
                }
                Arrays.fill(cArr, i3, i4 + i3, (char) 0);
            }
            if (m26547 != null) {
                m26547.close();
            }
        } catch (Throwable th) {
            if (m26547 != null) {
                try {
                    m26547.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        try {
            if (this.f31716) {
                return (char) 0;
            }
            C23721 c23721 = this.f31708;
            if (c23721 == null) {
                C11999 m8723 = this.f31715.m8723(i);
                C21605 c21605 = m8723.f35930;
                try {
                    return m8723.m29340(i);
                } finally {
                    if (c21605 != null) {
                        c21605.m48812();
                    }
                }
            }
            return c23721.m52330(i);
        } catch (C2121 e) {
            if (this.f31716) {
                return (char) 0;
            }
            throw e;
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        try {
            if (this.f31716) {
                return this.f31717;
            }
            C23721 c23721 = this.f31708;
            return c23721 == null ? this.f31715.length() : c23721.length();
        } catch (C2121 e) {
            if (!this.f31716) {
                throw e;
            }
            return this.f31717;
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        char[] cArr = new char[i2 - i];
        getChars(i, i2, cArr, 0);
        return new String(cArr);
    }

    @Override // l.InterfaceC20445
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo26557(int i, int i2) {
        return ((String) subSequence(i, i2)).toString();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        C12704 m26547 = m26547();
        try {
            String str = m26547 == null ? new String(new char[this.f31717]) : m26547.toString();
            if (m26547 != null) {
                m26547.close();
            }
            return str;
        } catch (Throwable th) {
            if (m26547 != null) {
                try {
                    m26547.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.text.Editable
    public final void clearSpans() {
        C11978 c11978 = this.f31713;
        ReentrantReadWriteLock.WriteLock writeLock = this.f31714;
        writeLock.lock();
        try {
            if (m26543()) {
                c11978.m29277();
                m26555();
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        C11978 c11978 = this.f31713;
        ReentrantReadWriteLock.WriteLock writeLock = this.f31714;
        writeLock.lock();
        try {
            if (m26543()) {
                c11978.m29279(obj, i, i2, i3);
                m26555();
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        C11978 c11978 = this.f31713;
        ReentrantReadWriteLock.WriteLock writeLock = this.f31714;
        writeLock.lock();
        try {
            if (m26543()) {
                c11978.m29284(obj);
                m26555();
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        Object[] m29280;
        this.f31712.lock();
        try {
            if (this.f31716) {
                if (cls == null) {
                    cls = Object.class;
                }
                m29280 = (Object[]) Array.newInstance((Class<?>) cls, 0);
            } else {
                m29280 = this.f31713.m29280(i, i2, cls);
            }
            return m29280;
        } finally {
            this.f31712.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        this.f31712.lock();
        try {
            if (!this.f31716) {
                return this.f31713.m29283(obj);
            }
            this.f31712.unlock();
            return -1;
        } finally {
            this.f31712.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        this.f31712.lock();
        try {
            if (!this.f31716) {
                return this.f31713.m29276(obj);
            }
            this.f31712.unlock();
            return -1;
        } finally {
            this.f31712.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        this.f31712.lock();
        try {
            if (!this.f31716) {
                return this.f31713.m29282(obj);
            }
            this.f31712.unlock();
            return 0;
        } finally {
            this.f31712.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        this.f31712.lock();
        try {
            return this.f31716 ? i2 : this.f31713.m29281(i, i2, cls);
        } finally {
            this.f31712.unlock();
        }
    }

    public final boolean equals(Object obj) {
        char m48115;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C10567 c10567 = (C10567) obj;
                C12704 m26547 = m26547();
                try {
                    C12704 m265472 = c10567.m26547();
                    try {
                        int length = m26547 == null ? this.f31717 : m26547.length();
                        if (length != (m265472 == null ? c10567.f31717 : m265472.length())) {
                            if (m265472 != null) {
                                m265472.close();
                            }
                            if (m26547 != null) {
                                m26547.close();
                                return false;
                            }
                        } else {
                            C21172 c21172 = null;
                            C21172 mo27940 = m26547 == null ? null : m26547.mo27940(0);
                            if (m265472 != null) {
                                try {
                                    c21172 = m265472.mo27940(0);
                                } finally {
                                }
                            }
                            if (mo27940 == null && c21172 == null) {
                                if (c21172 != null) {
                                    c21172.close();
                                }
                                if (mo27940 != null) {
                                    mo27940.close();
                                }
                                if (m265472 != null) {
                                    m265472.close();
                                }
                                if (m26547 != null) {
                                    m26547.close();
                                    return true;
                                }
                            } else {
                                for (int i = 0; i < length; i++) {
                                    char m481152 = mo27940 == null ? (char) 0 : mo27940.m48115();
                                    if (c21172 == null) {
                                        m48115 = 0;
                                    } else {
                                        try {
                                            m48115 = c21172.m48115();
                                        } finally {
                                        }
                                    }
                                    if (m481152 != m48115) {
                                        if (c21172 != null) {
                                            c21172.close();
                                        }
                                        if (mo27940 != null) {
                                            mo27940.close();
                                        }
                                        if (m265472 != null) {
                                            m265472.close();
                                        }
                                        if (m26547 != null) {
                                            m26547.close();
                                            return false;
                                        }
                                    }
                                }
                                if (c21172 != null) {
                                    c21172.close();
                                }
                                if (mo27940 != null) {
                                    mo27940.close();
                                }
                                if (m265472 != null) {
                                    m265472.close();
                                }
                                if (m26547 != null) {
                                    m26547.close();
                                }
                            }
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (m26547 != null) {
                        try {
                            m26547.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C12704 m26547 = m26547();
        int i = 0;
        if (m26547 == null) {
            if (m26547 != null) {
                m26547.close();
            }
            return 0;
        }
        try {
            C21172 mo27940 = m26547.mo27940(0);
            while (mo27940.m48114()) {
                try {
                    i = (i * 31) + mo27940.m48115();
                } finally {
                }
            }
            mo27940.close();
            m26547.close();
            return i;
        } catch (Throwable th) {
            try {
                m26547.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final C21856 m26563() {
        return new C21856(this, -1);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m26555() {
        C23721 c23721 = this.f31708;
        if (c23721 == null || this.f31702) {
            return;
        }
        c23721.m52334(Selection.getSelectionStart(this), Selection.getSelectionEnd(this));
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private boolean m26543() {
        if (this.f31716) {
            return false;
        }
        C23721 c23721 = this.f31708;
        if (c23721 == null || this.f31702) {
            return true;
        }
        c23721.m52347();
        return true;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private C12704 m26547() {
        if (this.f31716) {
            return null;
        }
        try {
            return m26565();
        } catch (C2121 e) {
            if (this.f31716) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.text.Editable
    public final void insert(int i, CharSequence charSequence) {
        if (this.f31716) {
            return;
        }
        replace(i, i, charSequence, 0, charSequence.length());
    }

    @Override // android.text.Editable
    public final C10567 replace(int i, int i2, CharSequence charSequence) {
        return this.f31716 ? this : replace(i, i2, charSequence, 0, charSequence.length());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m26552() {
        return this.f31716;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m26546() {
        if (this.f31716) {
            throw new C2121("Editable is closed");
        }
    }

    public void close() {
        this.f31714.lock();
        try {
            if (!this.f31716) {
                if (this.f31706 != 0 || this.f31703 != 0) {
                    throw new IllegalStateException("Cannot close during editable replacement");
                }
                C23721 c23721 = this.f31708;
                this.f31717 = c23721 == null ? this.f31715.length() : c23721.length();
                this.f31716 = true;
                C2827 c2827 = this.f31715;
                if (c2827 != null) {
                    c2827.close();
                }
            }
        } finally {
            this.f31714.unlock();
        }
    }
}
