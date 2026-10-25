package com.amazonaws.handlers;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.ClassLoaderHelper;
import com.amazonaws.util.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class HandlerChainFactory {
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList m237() {
        return m235(RequestHandler.class, "/com/amazonaws/services/s3/request.handlers");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m236() {
        return m235(RequestHandler2.class, "/com/amazonaws/services/s3/request.handler2s");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m235(Class cls, String str) {
        BufferedReader bufferedReader;
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                InputStream resourceAsStream = getClass().getResourceAsStream(str);
                if (resourceAsStream == null) {
                    return arrayList;
                }
                bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, StringUtils.f844));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            String trim = readLine.trim();
                            if (!"".equals(trim)) {
                                Object newInstance = ClassLoaderHelper.m760(trim, cls, getClass()).newInstance();
                                if (cls.isInstance(newInstance)) {
                                    if (cls == RequestHandler2.class) {
                                        arrayList.add((RequestHandler2) newInstance);
                                    } else if (cls == RequestHandler.class) {
                                        arrayList.add(new RequestHandler2Adaptor((RequestHandler) newInstance));
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                } else {
                                    throw new AmazonClientException("Unable to instantiate request handler chain for client.  Listed request handler ('" + trim + "') does not implement the " + cls + " API.");
                                }
                            }
                        } else {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused) {
                            }
                            return arrayList;
                        }
                    } catch (Exception e) {
                        e = e;
                        bufferedReader2 = bufferedReader;
                        throw new AmazonClientException("Unable to instantiate request handler chain for client: " + e.getMessage(), e);
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = bufferedReader2;
        }
    }
}
