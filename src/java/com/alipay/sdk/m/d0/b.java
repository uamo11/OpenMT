package com.alipay.sdk.m.d0;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class b {
    public static String a(String str, String str2) {
        Throwable th;
        File file;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                file = new File(str, str2);
            } catch (Throwable unused) {
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (!file.exists()) {
            return null;
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file), com.alipay.sdk.m.w.a.D));
        while (true) {
            try {
                String readLine = bufferedReader2.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            } catch (IOException unused3) {
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                return sb.toString();
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = bufferedReader2;
                if (bufferedReader == null) {
                    throw th;
                }
                try {
                    bufferedReader.close();
                    throw th;
                } catch (Throwable unused4) {
                    throw th;
                }
            }
        }
        bufferedReader2.close();
        return sb.toString();
    }
}
