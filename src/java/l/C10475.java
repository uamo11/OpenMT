package l;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: C42E */
/* renamed from: l.ۤᩴ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10475 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m26366(URL[] urlArr) {
        for (URL url : urlArr) {
            try {
            } catch (MalformedURLException unused) {
            }
            if (m26365(new URL(url, "META-INF/services/" + InterfaceC21848.class.getName()))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26363(String str) {
        throw new C12591(InterfaceC21848.class.getName() + ": " + str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26364(URL url, String str) {
        m26363(url + ":1: " + str);
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m26365(URL url) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        String readLine;
        String trim;
        int length;
        try {
            try {
                inputStream = url.openStream();
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
            } catch (FileNotFoundException unused) {
                bufferedReader2 = null;
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        m26363(C16014.m37866(": ", e2));
                        throw null;
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        m26363(C16014.m37866(": ", e3));
                        throw null;
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            inputStream = null;
            bufferedReader2 = null;
        } catch (IOException e4) {
            e = e4;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            bufferedReader = null;
        }
        do {
            try {
                readLine = bufferedReader2.readLine();
            } catch (FileNotFoundException unused3) {
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e5) {
                        m26363(C16014.m37866(": ", e5));
                        throw null;
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e6) {
                        m26363(C16014.m37866(": ", e6));
                        throw null;
                    }
                }
                return false;
            } catch (IOException e7) {
                e = e7;
                m26363(": " + e);
                throw null;
            }
            if (readLine == null) {
                try {
                    bufferedReader2.close();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                            return false;
                        } catch (IOException e8) {
                            m26363(C16014.m37866(": ", e8));
                            throw null;
                        }
                    }
                    return false;
                } catch (IOException e9) {
                    m26363(C16014.m37866(": ", e9));
                    throw null;
                }
            }
            int indexOf = readLine.indexOf(35);
            if (indexOf >= 0) {
                readLine = readLine.substring(0, indexOf);
            }
            trim = readLine.trim();
            length = trim.length();
        } while (length == 0);
        if (trim.indexOf(32) >= 0 || trim.indexOf(9) >= 0) {
            m26364(url, "Illegal configuration-file syntax");
            throw null;
        }
        int codePointAt = trim.codePointAt(0);
        if (!Character.isJavaIdentifierStart(codePointAt)) {
            m26364(url, "Illegal provider-class name: " + trim);
            throw null;
        }
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = trim.codePointAt(charCount);
            if (!Character.isJavaIdentifierPart(codePointAt2) && codePointAt2 != 46) {
                m26364(url, "Illegal provider-class name: " + trim);
                throw null;
            }
            charCount += Character.charCount(codePointAt2);
        }
        try {
            bufferedReader2.close();
            if (inputStream == null) {
                return true;
            }
            try {
                inputStream.close();
                return true;
            } catch (IOException e10) {
                m26363(C16014.m37866(": ", e10));
                throw null;
            }
        } catch (IOException e11) {
            m26363(C16014.m37866(": ", e11));
            throw null;
        }
    }
}
