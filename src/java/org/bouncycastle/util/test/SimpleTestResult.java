package org.bouncycastle.util.test;

import l.C3200;
import l.C5368;
import l.C9045;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.util.Strings;

/* loaded from: classes2.dex */
public class SimpleTestResult implements TestResult {
    public static final String SEPARATOR = Strings.lineSeparator();
    public Throwable exception;
    public String message;
    public boolean success;

    public SimpleTestResult(boolean z, String str) {
        this.success = z;
        this.message = str;
    }

    public SimpleTestResult(boolean z, String str, Throwable th) {
        this.success = z;
        this.message = str;
        this.exception = th;
    }

    public static TestResult failed(Test test, String str) {
        return new SimpleTestResult(false, test.getName() + ": " + str);
    }

    public static TestResult failed(Test test, String str, Object obj, Object obj2) {
        StringBuilder m15339 = C5368.m15339(str);
        String str2 = SEPARATOR;
        m15339.append(str2);
        m15339.append("Expected: ");
        m15339.append(obj);
        m15339.append(str2);
        m15339.append("Found   : ");
        m15339.append(obj2);
        return failed(test, m15339.toString());
    }

    public static TestResult failed(Test test, String str, Throwable th) {
        return new SimpleTestResult(false, test.getName() + ": " + str, th);
    }

    public static String failedMessage(String str, String str2, String str3, String str4) {
        StringBuilder m9834 = C3200.m9834(str, " failing ", str2);
        String str5 = SEPARATOR;
        ASN1BMPString$$ExternalSyntheticOutline0.m(m9834, str5, "    expected: ", str3, str5);
        return C9045.m23341(m9834, "    got     : ", str4);
    }

    public static TestResult successful(Test test, String str) {
        return new SimpleTestResult(true, test.getName() + ": " + str);
    }

    @Override // org.bouncycastle.util.test.TestResult
    public Throwable getException() {
        return this.exception;
    }

    @Override // org.bouncycastle.util.test.TestResult
    public boolean isSuccessful() {
        return this.success;
    }

    @Override // org.bouncycastle.util.test.TestResult
    public String toString() {
        return this.message;
    }
}
