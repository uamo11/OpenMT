package l;

import android.net.LocalServerSocket;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.Callable;

/* compiled from: F99O */
/* renamed from: l.᩺᩸ܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC23265 implements InterfaceC0645 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static volatile boolean f74737;

    /* renamed from: ֫ */
    public abstract void mo35835(int i);

    /* renamed from: ֫ */
    public abstract void mo35836(String str, boolean z);

    /* renamed from: ᩳ */
    public abstract boolean mo35837();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51581(LocalServerSocket localServerSocket) {
        if (localServerSocket == null) {
            return;
        }
        try {
            localServerSocket.close();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19697 m51583(final boolean z) {
        Thread thread;
        boolean z2;
        final ServerSocket serverSocket;
        final C11977 c11977 = new C11977();
        LocalServerSocket localServerSocket = null;
        if (z || (!f74737 && mo35837())) {
            final LocalServerSocket localServerSocket2 = new LocalServerSocket(C13345.m32319());
            thread = new Thread(new Runnable() { // from class: l.۫᩸ܿ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC23265.m51582(localServerSocket2, c11977, z);
                }
            });
            thread.start();
            try {
                mo35836(localServerSocket2.getLocalSocketAddress().getName(), z);
                z2 = true;
                serverSocket = null;
                localServerSocket = localServerSocket2;
            } catch (IOException e) {
                c11977.m29247();
                m51581(localServerSocket2);
                thread.interrupt();
                try {
                    thread.join(100L);
                } catch (InterruptedException unused) {
                }
                throw e;
            }
        } else {
            serverSocket = new ServerSocket(0);
            serverSocket.setSoTimeout(600);
            thread = new Thread(new Runnable() { // from class: l.ۤ᩸ܿ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z3;
                    ServerSocket serverSocket2 = serverSocket;
                    C11977 c119772 = c11977;
                    try {
                        try {
                            try {
                                try {
                                    C13387 c13387 = new C13387(serverSocket2.accept());
                                    synchronized (c119772) {
                                        if (c119772.f35846) {
                                            z3 = false;
                                        } else {
                                            c119772.f35845 = c13387;
                                            z3 = true;
                                        }
                                    }
                                    if (!z3) {
                                        C0349.m1793(c13387);
                                        return;
                                    }
                                    int i = C22518.f72867;
                                    try {
                                        c119772.m29251(new C19697(c13387, false));
                                    } catch (IOException e2) {
                                        C0349.m1793(c13387);
                                        throw e2;
                                    } catch (Error e3) {
                                        e = e3;
                                        C0349.m1793(c13387);
                                        throw e;
                                    } catch (RuntimeException e4) {
                                        e = e4;
                                        C0349.m1793(c13387);
                                        throw e;
                                    }
                                } catch (RuntimeException e5) {
                                    c119772.m29250(e5);
                                }
                            } catch (IOException e6) {
                                c119772.m29248(e6);
                            }
                        } catch (Error e7) {
                            c119772.m29249(e7);
                        }
                    } finally {
                        C0349.m1793(serverSocket2);
                    }
                }
            });
            thread.start();
            if (C10975.m27284()) {
                try {
                    C1802.f6208.submit(new Callable() { // from class: l.ۛ᩸ܿ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            AbstractC23265 abstractC23265 = AbstractC23265.this;
                            abstractC23265.getClass();
                            abstractC23265.mo35835(serverSocket.getLocalPort());
                            return null;
                        }
                    }).get();
                } catch (Throwable th) {
                    c11977.m29247();
                    C0349.m1793(serverSocket);
                    thread.interrupt();
                    try {
                        thread.join(100L);
                    } catch (InterruptedException unused2) {
                    }
                    C22518.m50482(th);
                    throw null;
                }
            } else {
                try {
                    mo35835(serverSocket.getLocalPort());
                } catch (IOException e2) {
                    c11977.m29247();
                    C0349.m1793(serverSocket);
                    thread.interrupt();
                    try {
                        thread.join(100L);
                    } catch (InterruptedException unused3) {
                    }
                    throw e2;
                }
            }
            z2 = false;
        }
        try {
            thread.join(600L);
        } catch (InterruptedException unused4) {
        }
        if (c11977.f35848 != null) {
            return c11977.f35848;
        }
        if (c11977.f35850 != null) {
            throw c11977.f35850;
        }
        if (c11977.f35849 != null) {
            throw c11977.f35849;
        }
        if (c11977.f35847 != null) {
            throw c11977.f35847;
        }
        c11977.m29247();
        if (z || !mo2657() || !z2) {
            m51581(localServerSocket);
            C0349.m1793(serverSocket);
            thread.interrupt();
            try {
                thread.join(100L);
            } catch (InterruptedException unused5) {
            }
            throw new IOException("Accept timeout");
        }
        if (!f74737) {
            f74737 = true;
        }
        m51581(localServerSocket);
        thread.interrupt();
        try {
            thread.join(100L);
        } catch (InterruptedException unused6) {
        }
        C19926.m45874("switch the root connection to ServerSocket");
        return m51583(false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51582(LocalServerSocket localServerSocket, C11977 c11977, boolean z) {
        boolean z2;
        try {
            try {
                C13345 c13345 = new C13345(localServerSocket.accept());
                synchronized (c11977) {
                    if (c11977.f35846) {
                        z2 = false;
                    } else {
                        c11977.f35845 = c13345;
                        z2 = true;
                    }
                }
                if (!z2) {
                    C0349.m1793(c13345);
                    return;
                }
                int i = C22518.f72867;
                try {
                    c11977.m29251(new C19697(c13345, z));
                } catch (IOException e) {
                    C0349.m1793(c13345);
                    throw e;
                } catch (Error e2) {
                    e = e2;
                    C0349.m1793(c13345);
                    throw e;
                } catch (RuntimeException e3) {
                    e = e3;
                    C0349.m1793(c13345);
                    throw e;
                }
            } catch (IOException e4) {
                c11977.m29248(e4);
            } catch (Error e5) {
                c11977.m29249(e5);
            } catch (RuntimeException e6) {
                c11977.m29250(e6);
            }
        } finally {
            m51581(localServerSocket);
        }
    }
}
