package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* compiled from: T65P */
/* renamed from: l.ܰۨ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13788 extends C22920 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C22256 f41105;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f41106;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final byte[] f41104 = {ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, 69, 76, 70};

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final byte[] f41103 = {KeyFactorySpi.x448_type, 97, 116, 10};

    public C13788(byte[] bArr) {
        super(bArr, 0);
        C22256 c22256;
        if (bArr.length < 52) {
            throw new C15199();
        }
        for (int i = 0; i < 4; i++) {
            if (bArr[i] != f41104[i]) {
                throw new C15199();
            }
        }
        byte b = bArr[4];
        if (b == 1) {
            this.f41106 = false;
        } else {
            if (b != 2) {
                throw new C8145(String.format("Invalid word-size value: %x", Byte.valueOf(bArr[5])));
            }
            this.f41106 = true;
        }
        Iterator it = ((AbstractList) m33105()).iterator();
        while (it.hasNext()) {
            AbstractC3206 abstractC3206 = (AbstractC3206) it.next();
            if (abstractC3206.f10094.mo11937(abstractC3206.f10093 + 4) == 11) {
                Iterator it2 = new C12378(new C22961(this, abstractC3206)).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        c22256 = null;
                        break;
                    }
                    AbstractC11673 abstractC11673 = (AbstractC11673) it2.next();
                    if (abstractC11673.mo16866().equals("oatdata")) {
                        try {
                            AbstractC3206 abstractC32062 = (AbstractC3206) ((C5323) abstractC11673.f34782.f73951.m33105()).get(abstractC11673.mo16867());
                            long mo9842 = abstractC32062.mo9842();
                            int mo9846 = abstractC32062.mo9846();
                            int mo9845 = abstractC32062.mo9845();
                            long mo16868 = abstractC11673.mo16868();
                            if (mo16868 < mo9842 || mo16868 >= mo9845 + mo9842) {
                                throw new C8145("symbol address lies outside it's associated section");
                            }
                            c22256 = new C22256(this, (int) ((abstractC11673.mo16868() - mo9842) + mo9846));
                        } catch (IndexOutOfBoundsException unused) {
                            throw new C8145("Section index for symbol is out of bounds");
                        }
                    }
                }
                if (c22256 == null) {
                    throw new C8145("Oat file has no oatdata symbol");
                }
                this.f41105 = c22256;
                if (!c22256.m49975()) {
                    throw new C8145("Invalid oat magic value");
                }
                C7897.m21185(c22256.m49974());
                return;
            }
        }
        throw new C8145("Oat file has no symbol table");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13788 m33100(BufferedInputStream bufferedInputStream) {
        if (!bufferedInputStream.markSupported()) {
            throw new IllegalArgumentException("InputStream must support mark");
        }
        bufferedInputStream.mark(4);
        byte[] bArr = new byte[4];
        try {
            try {
                C18366.m42795(bufferedInputStream, bArr, 0, 4);
                for (int i = 0; i < 4; i++) {
                    if (bArr[i] != f41104[i]) {
                        throw new C15199();
                    }
                }
                bufferedInputStream.reset();
                return new C13788(C18366.m42796(bufferedInputStream));
            } catch (EOFException unused) {
                throw new C15199();
            }
        } finally {
            bufferedInputStream.reset();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m33107() {
        return this.f41105.m49974();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m33106() {
        return new C0383(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public List m33105() {
        int mo11935;
        int m11936;
        int m119362;
        if (this.f41106) {
            mo11935 = m11941(40);
            m11936 = m11936(58);
            m119362 = m11936(60);
        } else {
            mo11935 = mo11935(32);
            m11936 = m11936(46);
            m119362 = m11936(48);
        }
        if ((m11936 * m119362) + mo11935 > length()) {
            throw new C8145("The ELF section headers extend past the end of the file");
        }
        return new C5323(this, m119362, mo11935, m11936);
    }
}
