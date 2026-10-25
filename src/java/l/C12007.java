package l;

import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: 97LV */
/* renamed from: l.ۨ᩺֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12007 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f35950;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f35951;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final BufferedReader f35952;

    public C12007(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f35950 = arrayDeque;
        this.f35952 = bufferedReader;
    }

    @EnsuresNonNullIf(expression = {"next"}, result = true)
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m29352() {
        String trim;
        if (this.f35951 == null) {
            ArrayDeque arrayDeque = this.f35950;
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f35951 = str;
                return true;
            }
            do {
                String readLine = this.f35952.readLine();
                this.f35951 = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f35951 = trim;
            } while (trim.isEmpty());
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m29353() {
        if (m29352()) {
            String str = this.f35951;
            this.f35951 = null;
            return str;
        }
        throw new NoSuchElementException();
    }
}
