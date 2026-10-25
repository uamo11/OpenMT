.class public Lcom/umeng/umzid/Spy;
.super Ljava/lang/Object;
.source ""

# static fields
.field public static initSuccess:Z

# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/umeng/umzid/Spy;->initSuccess:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getID()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static getNativeID()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
