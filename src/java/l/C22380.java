package l;

/* compiled from: V627 */
/* renamed from: l.᩹ܺ֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C22380 implements InterfaceC15323 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f72526 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C22380 f72527;

    @Override // l.InterfaceC15323
    /* renamed from: ֫ */
    public AbstractC5447 mo5214(Class cls, C16344 c16344) {
        return mo5213(cls);
    }

    @Override // l.InterfaceC15323
    /* renamed from: ֫ */
    public AbstractC5447 mo5213(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            C11233.m27803(newInstance, "{\n                modelC…wInstance()\n            }");
            return (AbstractC5447) newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        }
    }
}
