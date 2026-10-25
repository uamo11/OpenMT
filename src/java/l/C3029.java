package l;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Field;

/* compiled from: B99D */
/* renamed from: l.ۗۚۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3029 extends Thread {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f9557 = -1;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C12906 f9558;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f9559;

    public C3029(C12906 c12906) {
        this.f9558 = c12906;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9276() {
        C12906 c12906;
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2;
        C19926.m45878("Shell.verify");
        start();
        int i = 0;
        while (true) {
            c12906 = this.f9558;
            if (i >= 9) {
                break;
            }
            try {
                C19926.m45878("Shell.verify write");
                bufferedWriter = c12906.f38723;
                bufferedWriter.write("echo Started\n");
                bufferedWriter2 = c12906.f38723;
                bufferedWriter2.flush();
                join(1000L);
                if (!isAlive()) {
                    break;
                } else {
                    i++;
                }
            } catch (InterruptedException e) {
                throw new IOException(e);
            }
        }
        C19926.m45878("Shell.verify result " + this.f9557);
        int i2 = this.f9557;
        if (i2 == -1) {
            c12906.close();
            throw new IOException("Shell verify timeout.");
        }
        if (i2 != -2) {
            return;
        }
        c12906.close();
        throw new IOException(this.f9559);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        BufferedReader bufferedReader;
        while (true) {
            try {
                bufferedReader = this.f9558.f38725;
                String readLine = bufferedReader.readLine();
                C19926.m45878("Shell.verify read [" + readLine + "]");
                if (readLine == null) {
                    throw new EOFException();
                }
                if (!"".equals(readLine)) {
                    if ("Started".equals(readLine)) {
                        this.f9557 = 0;
                        m9275();
                        return;
                    } else {
                        this.f9559 = "Unknown error occurred. Line: " + readLine;
                    }
                }
            } catch (IOException e) {
                this.f9557 = -2;
                if (e.getMessage() != null) {
                    this.f9559 = e.getMessage();
                    return;
                } else {
                    this.f9559 = "Root Access Denied.";
                    return;
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m9275() {
        Process process;
        Field declaredField;
        Process process2;
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2;
        BufferedWriter bufferedWriter3;
        C12906 c12906 = this.f9558;
        try {
            process = c12906.f38727;
            Class<?> cls = process.getClass();
            try {
                declaredField = cls.getDeclaredField("pid");
            } catch (NoSuchFieldException unused) {
                declaredField = cls.getDeclaredField("id");
            }
            declaredField.setAccessible(true);
            process2 = c12906.f38727;
            int intValue = ((Integer) declaredField.get(process2)).intValue();
            bufferedWriter = c12906.f38723;
            bufferedWriter.write("(echo -17 > /proc/" + intValue + "/oom_adj) &> /dev/null\n");
            bufferedWriter2 = c12906.f38723;
            bufferedWriter2.write("(echo -17 > /proc/$$/oom_adj) &> /dev/null\n");
            bufferedWriter3 = c12906.f38723;
            bufferedWriter3.flush();
        } catch (Exception unused2) {
        }
    }
}
