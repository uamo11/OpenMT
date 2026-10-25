package net.sf.sevenzipjbinding;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import l.C16014;
import l.C20177;
import l.C21194;
import l.C7082;
import l.EnumC0121;

/* loaded from: classes.dex */
public class SevenZipException extends IOException {
    public static final String NEW_LINE = System.getProperty("line.separator");
    public static final long serialVersionUID = 42;
    public Throwable causeFirstPotentialThrown;
    public Throwable causeLastPotentialThrown;
    public Throwable causeLastThrown;

    public SevenZipException() {
    }

    public SevenZipException(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    public SevenZipException(String str) {
        super(str);
    }

    public SevenZipException(Throwable th) {
        initCause(th);
    }

    private void setCauseLastThrown(Throwable th) {
        this.causeLastThrown = th;
    }

    private void setCauseFirstPotentialThrown(Throwable th) {
        this.causeFirstPotentialThrown = th;
    }

    private void setCauseLastPotentialThrown(Throwable th) {
        this.causeLastPotentialThrown = th;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return getMessage(false);
    }

    public String getSevenZipExceptionMessage() {
        return super.getMessage();
    }

    private String getMessage(boolean z) {
        if (this.causeLastThrown == null && this.causeFirstPotentialThrown == null && this.causeLastPotentialThrown == null) {
            return super.getMessage();
        }
        StringBuilder sb = new StringBuilder();
        printToStringBuilder("", sb, z);
        return sb.toString();
    }

    private void printToStringBuilder(String str, StringBuilder sb, boolean z) {
        String message = super.getMessage();
        if (message == null) {
            sb.append("No message");
        } else {
            sb.append(message);
        }
        if (str.length() == 0 && !z) {
            sb.append(NEW_LINE);
            sb.append("This SevenZipException has multiple 'cause by' exceptions. Use one of the SevenZipException.printStackTraceExtended(..) methods to get stack trace of last thrown and first/last potiential thrown 'cause by' exceptions.");
        }
        Throwable cause = getCause();
        if (cause != null) {
            C20177.m46410(sb, NEW_LINE, str, "Caused by (first thrown): ");
            printMessageToStringBuilder(str, sb, cause);
        }
        if (this.causeLastThrown != null) {
            C20177.m46410(sb, NEW_LINE, str, "Caused by (last thrown): ");
            printMessageToStringBuilder(str, sb, this.causeLastThrown);
        }
        if (this.causeFirstPotentialThrown != null) {
            C20177.m46410(sb, NEW_LINE, str, "Caused by (first potential thrown): ");
            printMessageToStringBuilder(str, sb, this.causeFirstPotentialThrown);
        }
        if (this.causeLastPotentialThrown != null) {
            C20177.m46410(sb, NEW_LINE, str, "Caused by (last potential thrown): ");
            printMessageToStringBuilder(str, sb, this.causeLastPotentialThrown);
        }
    }

    private void printMessageToStringBuilder(String str, StringBuilder sb, Throwable th) {
        sb.append(th.getClass().getCanonicalName());
        sb.append(": ");
        if (th instanceof SevenZipException) {
            ((SevenZipException) th).printToStringBuilder(C16014.m37867(str, EnumC0121.f1143), sb, false);
        } else {
            sb.append(th.getMessage());
        }
    }

    public void printStackTraceExtended() {
        printStackTraceExtended(System.err);
    }

    public void printStackTraceExtended(PrintStream printStream) {
        synchronized (printStream) {
            printStackTraceToPrintWriter(new PrintWriter(new C7082(printStream)), this, null);
        }
    }

    public void printStackTraceExtended(PrintWriter printWriter) {
        synchronized (printWriter) {
            printStackTraceToPrintWriter(printWriter, this, null);
        }
    }

    public static void printStackTraceOfThrowable(PrintWriter printWriter, Throwable th, Throwable th2) {
        if (th instanceof SevenZipException) {
            printStackTraceToPrintWriter(printWriter, (SevenZipException) th, th2);
        } else {
            printStackTraceRecursive(printWriter, th, th2);
        }
    }

    public static void printStackTraceToPrintWriter(PrintWriter printWriter, SevenZipException sevenZipException, Throwable th) {
        if (sevenZipException.causeLastThrown == null && sevenZipException.causeFirstPotentialThrown == null && sevenZipException.causeLastPotentialThrown == null) {
            printStackTraceRecursive(printWriter, sevenZipException, th);
        }
        printWriter.println("+------ SevenZipException with multiple 'cause by' exceptions. Stacktraces for all involved exceptions:");
        printWriter.println("+-- The SevenZipException itself with first thrown 'cause by' exception (first cause): ");
        printStackTraceRecursive(new PrintWriter(new C21194(printWriter, "  FIRST THROWN CAUSE ")), sevenZipException, th);
        if (sevenZipException.causeLastThrown != null) {
            printWriter.println("+-- Last thrown 'cause by' exception (last cause): ");
            printStackTraceOfThrowable(new PrintWriter(new C21194(printWriter, "  LAST THROWN CAUSE ")), sevenZipException.causeLastThrown, sevenZipException);
        }
        if (sevenZipException.causeFirstPotentialThrown != null) {
            printWriter.println("+-- First thrown potential 'cause by' exception, thrown in an other thread (first possible cause): ");
            printStackTraceOfThrowable(new PrintWriter(new C21194(printWriter, "  FIRST THROWN POTENTIAL CAUSE ")), sevenZipException.causeFirstPotentialThrown, sevenZipException);
        }
        if (sevenZipException.causeLastPotentialThrown != null) {
            printWriter.println("+-- Last thrown potential 'cause by' exception, thrown in an other thread (last possible cause): ");
            printStackTraceOfThrowable(new PrintWriter(new C21194(printWriter, "  LAST THROWN POTENTIAL CAUSE ")), sevenZipException.causeLastPotentialThrown, sevenZipException);
        }
        printWriter.println("+------ End of stacktrace of SevenZipException with multiple 'cause by' exceptions");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r6 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void printStackTraceRecursive(java.io.PrintWriter r9, java.lang.Throwable r10, java.lang.Throwable r11) {
        /*
            java.lang.StackTraceElement[] r0 = r10.getStackTrace()
            r1 = 3
            r2 = 0
            if (r11 == 0) goto L28
            java.lang.StackTraceElement[] r3 = r11.getStackTrace()
            int r4 = r3.length
            int r4 = r4 + (-1)
            int r5 = r0.length
            int r5 = r5 + (-1)
            r6 = 0
        L13:
            if (r4 < r1) goto L29
            if (r5 < r1) goto L29
            r7 = r3[r4]
            r8 = r0[r5]
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L29
            int r4 = r4 + (-1)
            int r5 = r5 + (-1)
            int r6 = r6 + 1
            goto L13
        L28:
            r6 = 0
        L29:
            if (r6 > r1) goto L2c
            r6 = 0
        L2c:
            if (r11 != 0) goto L36
            java.lang.String r11 = getMessageForPrintStackTraceExtended(r10)
            r9.println(r11)
            goto L4b
        L36:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "Caused by: "
            r11.<init>(r1)
            java.lang.String r1 = getMessageForPrintStackTraceExtended(r10)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            r9.println(r11)
        L4b:
            int r11 = r0.length
            int r11 = r11 - r6
            if (r2 >= r11) goto L65
            r11 = r0[r2]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "\tat "
            r1.<init>(r3)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r9.println(r11)
            int r2 = r2 + 1
            goto L4b
        L65:
            if (r6 <= 0) goto L7d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "\t... "
            r11.<init>(r0)
            r11.append(r6)
            java.lang.String r0 = " more"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r9.println(r11)
        L7d:
            java.lang.Throwable r11 = r10.getCause()
            if (r11 == 0) goto L8a
            java.lang.Throwable r11 = r10.getCause()
            printStackTraceOfThrowable(r9, r11, r10)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sf.sevenzipjbinding.SevenZipException.printStackTraceRecursive(java.io.PrintWriter, java.lang.Throwable, java.lang.Throwable):void");
    }

    public static String getMessageForPrintStackTraceExtended(Throwable th) {
        if (th instanceof SevenZipException) {
            return ((SevenZipException) th).getMessage(true);
        }
        return th.toString();
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return super.getCause();
    }

    public Throwable getCauseLastThrown() {
        return this.causeLastThrown;
    }

    public Throwable getCauseLastPotentialThrown() {
        return this.causeLastPotentialThrown;
    }

    public Throwable getCauseFirstPotentialThrown() {
        return this.causeFirstPotentialThrown;
    }
}
