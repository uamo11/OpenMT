package l;

import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.w.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;

/* compiled from: R9TK */
/* renamed from: l.ۜۚ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC6567 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f20262;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7127 f20263;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Socket f20264;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        f20262 = simpleDateFormat;
        simpleDateFormat.setTimeZone(C3261.getTimeZone("GMT"));
    }

    public RunnableC6567(Socket socket, C7127 c7127) {
        this.f20264 = socket;
        this.f20263 = c7127;
        C1802.f6208.execute(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef A[Catch: Exception -> 0x0214, ֫ۚ᩻ -> 0x0217, TRY_ENTER, TRY_LEAVE, TryCatch #6 {֫ۚ᩻ -> 0x0217, blocks: (B:41:0x00ef, B:44:0x0137, B:46:0x013d, B:51:0x0159, B:55:0x0170, B:56:0x0175, B:65:0x017c), top: B:39:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017c A[Catch: Exception -> 0x0214, ֫ۚ᩻ -> 0x0217, TRY_LEAVE, TryCatch #6 {֫ۚ᩻ -> 0x0217, blocks: (B:41:0x00ef, B:44:0x0137, B:46:0x013d, B:51:0x0159, B:55:0x0170, B:56:0x0175, B:65:0x017c), top: B:39:0x00ed }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.RunnableC6567.run():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18082(BufferedReader bufferedReader, HashMap hashMap, HashMap hashMap2) {
        try {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(readLine);
            if (!stringTokenizer.hasMoreTokens()) {
                throw new C1628("400 Bad Request", "BAD REQUEST: Syntax error");
            }
            hashMap.put(e.s, stringTokenizer.nextToken());
            if (!stringTokenizer.hasMoreTokens()) {
                throw new C1628("400 Bad Request", "BAD REQUEST: Missing URI");
            }
            try {
                hashMap.put("uri", C2912.decode(stringTokenizer.nextToken(), a.D));
                if (stringTokenizer.hasMoreTokens()) {
                    String readLine2 = bufferedReader.readLine();
                    while (readLine2 != null && readLine2.trim().length() > 0) {
                        int indexOf = readLine2.indexOf(58);
                        if (indexOf >= 0) {
                            hashMap2.put(readLine2.substring(0, indexOf).trim().toLowerCase(), readLine2.substring(indexOf + 1).trim());
                        }
                        readLine2 = bufferedReader.readLine();
                    }
                }
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e2) {
            throw new C1628("500 Internal Server Error", C5127.m14678(e2, new StringBuilder("SERVER INTERNAL ERROR: IOException: ")));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18083(String str, String str2, LinkedHashMap linkedHashMap, InterfaceC23500 interfaceC23500) {
        Socket socket = this.f20264;
        try {
            try {
                if (str == null) {
                    throw new Error("sendResponse(): Status can't be null.");
                }
                OutputStream outputStream = socket.getOutputStream();
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.print("HTTP/1.0 " + str + " \r\n");
                if (str2 != null) {
                    printWriter.print("Content-Type: " + str2 + "\r\n");
                }
                if (linkedHashMap == null || !linkedHashMap.containsKey("Date")) {
                    printWriter.print("Date: " + f20262.format(new Date()) + "\r\n");
                }
                if (linkedHashMap != null) {
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        printWriter.print(((String) entry.getKey()) + ": " + ((String) entry.getValue()) + "\r\n");
                    }
                }
                printWriter.print("\r\n");
                printWriter.flush();
                if (interfaceC23500 != null) {
                    interfaceC23500.mo34196(outputStream);
                }
                outputStream.flush();
                outputStream.close();
            } catch (Throwable unused) {
            }
        } catch (IOException unused2) {
            socket.close();
        }
    }
}
