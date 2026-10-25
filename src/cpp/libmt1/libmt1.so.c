/* Decompiled from: libmt1.so */
/* Target Architecture: ARM64 */

#include <stdint.h>
#include <stdbool.h>

// Address: 0x12670 | Function: sub_12670
__int64 sub_12670()
{
  return __cxa_finalize(&off_36AB0);
}


// Address: 0x12680 | Function: sub_12680
void sub_12680()
{
  ;
}


// Address: 0x12688 | Function: sub_12688
__int64 sub_12688()
{
  return sub_2E108();
}


// Address: 0x12690 | Function: sub_12690
__int64 (*__fastcall sub_12690(__int64 (*result)(void)))(void)
{
  if ( result != nullptr )
    return (__int64 (*)(void))result();
  return result;
}


// Address: 0x126A4 | Function: sub_126A4
__int64 __fastcall sub_126A4(void *obj)
{
  return __cxa_atexit((void (*)(void *))sub_12690, obj, &off_36AB0);
}


// Address: 0x126C0 | Function: sub_126C0
DIR *__fastcall sub_126C0(const char *a1)
{
  DIR *result; // x0
  DIR *v4; // x20
  struct dirent *v5; // x0
  int v6; // w8
  int v7; // w9
  int v8; // w0
  int *v9; // x19
  int v10; // w22
  _WORD v11[67]; // [xsp+0h] [xbp-1090h] BYREF
  _BYTE v12[4097]; // [xsp+87h] [xbp-1009h] BYREF
  __int64 v13; // [xsp+1088h] [xbp-8h]

  v13 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( lstat(a1, (struct stat *)v11) != 0 )
    return (DIR *)(*(_DWORD *)__errno() == 2);
  if ( (v11[8] & 0xF000) != 0x4000 )
  {
    v8 = unlink(a1);
    return (DIR *)(v8 == 0);
  }
  result = opendir(a1);
  if ( result != nullptr )
  {
    v4 = result;
    while ( 1 )
    {
      while ( 1 )
      {
        v5 = readdir(v4);
        if ( v5 == nullptr )
        {
          if ( closedir(v4) < 0 )
            return nullptr;
          v8 = rmdir(a1);
          return (DIR *)(v8 == 0);
        }
        v6 = (unsigned __int8)v5->d_name[0] - 46;
        if ( v5->d_name[0] == 46 )
          break;
LABEL_8:
        if ( v6 != 0 )
        {
          sub_12804(v12);
          if ( (sub_126C0(v12) & 1) == 0 )
          {
            v9 = (int *)__errno();
            v10 = *v9;
            closedir(v4);
            *v9 = v10;
            return nullptr;
          }
        }
      }
      v7 = (unsigned __int8)v5->d_name[1] - 46;
      if ( v5->d_name[1] == 46 )
        v7 = (unsigned __int8)v5->d_name[2];
      if ( v7 != 0 )
      {
        v6 = (unsigned __int8)v5->d_name[1];
        goto LABEL_8;
      }
    }
  }
  return result;
}


// Address: 0x12804 | Function: sub_12804
__int64 sub_12804(__int64 a1, __int64 a2, __int64 a3, ...)
{
  gcc_va_list va1; // [xsp+B0h] [xbp-50h] BYREF
  gcc_va_list va; // [xsp+D8h] [xbp-28h] BYREF
  __int64 v6; // [xsp+F8h] [xbp-8h]

  va_start(va, a3);
  v6 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  va_copy(va1, va);
  return __vsprintf_chk(a1, 0, 4097, "%s/%s", va1);
}


// Address: 0x128A8 | Function: Java_bin_mt_plus_Features_getABI
__int64 __fastcall Java_bin_mt_plus_Features_getABI(__int64 a1)
{
  return (*(__int64 (__fastcall **)(__int64, const char *))(*(_QWORD *)a1 + 1336LL))(a1, "arm64-v8a");
}


// Address: 0x128BC | Function: Java_bin_mt_plus_Features_uid2name
__int64 __fastcall Java_bin_mt_plus_Features_uid2name(__int64 a1, int a2, signed int uid)
{
  struct passwd *v5; // x0
  struct group *v6; // x0

  v5 = getpwuid(uid);
  if ( v5 != nullptr && v5->pw_name != nullptr )
    return (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1336LL))(a1);
  if ( uid >= 20000 && (v6 = getgrgid(uid)) != nullptr && v6->gr_name != nullptr )
    return (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1336LL))(a1);
  else
    return 0;
}


// Address: 0x1292C | Function: Java_bin_mt_plus_Features_deleteFile
__int64 __fastcall Java_bin_mt_plus_Features_deleteFile(__int64 a1, __int64 a2, __int64 a3)
{
  const char *v5; // x21
  unsigned __int8 v6; // w22

  v5 = (const char *)(*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1352LL))(a1, a3, 0);
  v6 = (unsigned __int8)sub_126C0(v5);
  (*(void (__fastcall **)(__int64, __int64, const char *))(*(_QWORD *)a1 + 1360LL))(a1, a3, v5);
  return v6 & 1;
}


// Address: 0x12990 | Function: Java_bin_mt_plus_Features_analyze
__int64 __fastcall Java_bin_mt_plus_Features_analyze(__int64 a1, __int64 a2, __int64 a3)
{
  __int64 v5; // x21
  unsigned int v6; // w0
  unsigned int v7; // w20
  __int64 v8; // x1
  int v9; // w9
  _BYTE *v10; // x0
  __int64 v11; // x1
  int v12; // kr10_4
  __int64 v13; // kr18_8
  unsigned int v14; // w21
  unsigned int v15; // w8
  unsigned int v16; // w9
  unsigned int v17; // w0
  __int16 v18; // w0
  unsigned int v19; // w0
  unsigned int v20; // w0
  __int64 v21; // x1
  _BYTE *v22; // x0
  unsigned int v23; // w0
  unsigned __int64 v24; // x21
  bool v25; // cf
  unsigned int v26; // w0
  int v27; // w9
  unsigned int v28; // w8
  char v29; // w9
  unsigned int v30; // w9
  unsigned int v31; // w9
  char v32; // w9
  unsigned int v33; // w0
  unsigned int v34; // w0
  unsigned __int64 v35; // x21
  char v36; // w9
  unsigned __int8 v37; // w0
  char v38; // w8
  char v39; // w9
  unsigned int v40; // w10
  _BYTE *v41; // x8
  unsigned int v42; // w0
  unsigned int v43; // w0
  int v44; // w21
  int v45; // w24
  int v46; // w0
  __int64 v47; // x0
  __int64 v48; // x21
  __int64 v49; // x1
  __int64 v50; // x22
  unsigned int v51; // w0
  __int64 v52; // x1
  __int64 v53; // x22
  unsigned int v54; // w0
  int v55; // w0
  unsigned __int16 v56; // w24
  int v57; // w22
  int v58; // w23
  __int64 v59; // x0
  __int64 v60; // x21
  unsigned int v61; // w0
  __int64 v62; // x22
  void *v63; // x23
  __int64 v64; // x1
  const void *v65; // x24
  unsigned int v66; // w0
  unsigned int v67; // w0
  unsigned int v68; // w0
  __int64 v69; // x23
  void *v70; // x24
  __int64 v71; // x1
  const void *v72; // x25
  unsigned int v73; // w0
  unsigned int v74; // w0
  unsigned int v75; // w0
  __int64 v76; // x24
  void *v77; // x25
  __int64 v78; // x1
  const void *v79; // x26
  unsigned int v80; // w0
  unsigned int v81; // w0
  int v82; // w0
  __int64 v83; // x25
  unsigned int *v84; // x26
  __int64 v85; // x1
  const void *v86; // x20
  unsigned int v87; // w0
  int v88; // w0
  _BYTE v90[16]; // [xsp+8h] [xbp-98h] BYREF
  _BYTE v91[16]; // [xsp+18h] [xbp-88h] BYREF
  _BYTE v92[16]; // [xsp+28h] [xbp-78h] BYREF
  _BYTE v93[16]; // [xsp+38h] [xbp-68h] BYREF
  _BYTE v94[16]; // [xsp+48h] [xbp-58h] BYREF
  _BYTE v95[16]; // [xsp+58h] [xbp-48h] BYREF
  _BYTE v96[16]; // [xsp+68h] [xbp-38h] BYREF
  _BYTE v97[32]; // [xsp+78h] [xbp-28h] BYREF
  __int64 v98; // [xsp+98h] [xbp-8h]

  v98 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v5 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1472LL))(a1, a3, 0);
  v6 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1368LL))(a1, a3);
  sub_13B40(v96, v5, v6);
  sub_13700(v95, 32);
  sub_13700(v94, 32);
  sub_13700(v93, 32);
  sub_13700(v92, 32);
  sub_13700(v91, 32);
  v7 = 0;
LABEL_4:
  while ( 2 )
  {
    if ( (unsigned int)sub_13E08(v96) != 0 )
    {
      v9 = (unsigned __int16)sub_13B7C(v96);
      v10 = v95;
      v12 = v9;
      v13 = v11;
      v8 = 26;
      switch ( v9 )
      {
        case 256:
          v14 = (__int16)sub_13B7C(v96);
          if ( (v14 & 0x80000000) != 0 )
          {
            sub_13744(v95, 17);
            v14 &= 0x7FFFu;
          }
          else
          {
            sub_13744(v95, 64);
          }
          goto LABEL_132;
        case 257:
          v14 = (__int16)sub_13B7C(v96);
          if ( (v14 & 0x80000000) != 0 )
          {
            sub_13744(v95, 49);
            v14 &= 0x7FFFu;
          }
          else
          {
            sub_13744(v95, 78);
          }
          goto LABEL_132;
        case 258:
          goto LABEL_3;
        case 259:
          v14 = (__int16)sub_13B7C(v96);
          if ( (v14 & 0x80000000) != 0 )
          {
            sub_13744(v95, 47);
            v14 &= 0x7FFFu;
          }
          else
          {
            sub_13744(v95, 0);
          }
          goto LABEL_132;
        case 260:
          v19 = sub_13B7C(v96);
          sub_13884(v93, v19);
          v20 = sub_13B30(v95);
          sub_13928(v93, v20);
          v21 = (unsigned int)sub_13B30(v94);
          v22 = v93;
          goto LABEL_110;
        case 261:
          sub_13744(v95, 18);
          v33 = sub_13B30(v94);
          sub_13928(v92, v33);
          v18 = sub_13B7C(v96);
          goto LABEL_90;
        case 262:
          sub_13744(v95, 50);
          v23 = sub_13B30(v94);
          sub_13928(v92, v23);
          v18 = sub_13B7C(v96);
          goto LABEL_90;
        case 263:
          sub_13744(v95, 52);
          v34 = sub_13B30(v94);
          sub_13928(v92, v34);
          v18 = sub_13B7C(v96);
          goto LABEL_90;
        case 264:
          v14 = (__int16)sub_13B7C(v96);
          if ( (v14 & 0x80000000) != 0 )
          {
            sub_13744(v95, 69);
            v14 &= 0x7FFFu;
          }
          else
          {
            sub_13744(v95, 72);
          }
          goto LABEL_132;
        case 265:
          v14 = (__int16)sub_13B7C(v96);
          if ( (v14 & 0x80000000) != 0 )
          {
            sub_13744(v95, 57);
            v14 &= 0x7FFFu;
          }
          else
          {
            sub_13744(v95, 22);
          }
          goto LABEL_132;
        case 266:
          v14 = (__int16)sub_13B7C(v96);
          if ( (v14 & 0x80000000) != 0 )
          {
            sub_13744(v95, 81);
            v14 &= 0x7FFFu;
          }
          else
          {
            sub_13744(v95, 36);
          }
          goto LABEL_132;
        case 267:
        case 268:
        case 272:
        case 273:
        case 274:
        case 275:
        case 276:
        case 277:
        case 278:
        case 279:
        case 280:
        case 281:
        case 282:
        case 283:
        case 284:
        case 285:
        case 286:
        case 287:
        case 288:
        case 289:
        case 290:
        case 291:
        case 292:
        case 293:
        case 294:
        case 295:
        case 296:
        case 297:
        case 298:
        case 299:
        case 300:
        case 301:
        case 302:
        case 303:
        case 304:
        case 305:
        case 306:
        case 307:
        case 308:
        case 309:
        case 310:
        case 311:
        case 312:
        case 313:
        case 314:
        case 315:
        case 316:
        case 317:
        case 318:
        case 319:
        case 320:
        case 321:
        case 322:
        case 323:
        case 324:
        case 325:
        case 326:
        case 327:
        case 328:
        case 329:
        case 330:
        case 331:
        case 332:
        case 333:
        case 334:
        case 335:
        case 336:
        case 337:
        case 338:
        case 339:
        case 340:
        case 341:
        case 342:
        case 343:
        case 344:
        case 345:
        case 346:
        case 347:
        case 348:
        case 349:
        case 350:
        case 351:
        case 352:
        case 353:
        case 354:
        case 355:
        case 356:
        case 357:
        case 358:
        case 359:
        case 360:
        case 361:
        case 362:
        case 363:
        case 364:
        case 365:
        case 366:
        case 367:
        case 368:
        case 369:
        case 370:
        case 371:
        case 372:
        case 373:
        case 374:
        case 375:
        case 376:
        case 377:
        case 378:
        case 379:
        case 380:
        case 381:
        case 382:
        case 383:
        case 384:
        case 385:
        case 386:
        case 387:
        case 388:
        case 389:
        case 390:
        case 391:
        case 392:
        case 393:
        case 394:
        case 395:
        case 396:
        case 397:
        case 398:
        case 399:
        case 400:
        case 401:
        case 402:
        case 403:
        case 404:
        case 405:
        case 406:
        case 407:
        case 408:
        case 409:
        case 410:
        case 411:
        case 412:
        case 413:
        case 414:
        case 415:
        case 416:
        case 417:
        case 418:
        case 419:
        case 420:
        case 421:
        case 422:
        case 423:
        case 424:
        case 425:
        case 426:
        case 427:
        case 428:
        case 429:
        case 430:
        case 431:
        case 432:
        case 433:
        case 434:
        case 435:
        case 436:
        case 437:
        case 438:
        case 439:
        case 440:
        case 441:
        case 442:
        case 443:
        case 444:
        case 445:
        case 446:
        case 447:
        case 448:
        case 449:
        case 450:
        case 451:
        case 452:
        case 453:
        case 454:
        case 455:
        case 456:
        case 457:
        case 458:
        case 459:
        case 460:
        case 461:
        case 462:
        case 463:
        case 464:
        case 465:
        case 466:
        case 467:
        case 468:
        case 469:
        case 470:
        case 471:
        case 472:
        case 473:
        case 474:
        case 475:
        case 476:
        case 477:
        case 478:
        case 479:
        case 480:
        case 481:
        case 482:
        case 483:
        case 484:
        case 485:
        case 486:
        case 487:
        case 488:
        case 489:
        case 490:
        case 491:
        case 492:
        case 493:
        case 494:
        case 495:
        case 496:
        case 497:
        case 498:
        case 499:
        case 500:
        case 501:
        case 502:
        case 503:
        case 504:
        case 505:
        case 506:
        case 507:
        case 508:
        case 509:
        case 510:
        case 511:
        case 535:
        case 536:
        case 537:
        case 538:
        case 539:
        case 540:
        case 541:
        case 542:
        case 543:
          goto LABEL_133;
        case 269:
          sub_13744(v95, 24);
          sub_13744(v94, 0);
          v35 = 0;
          do
          {
            v37 = sub_13B4C(v96);
            v38 = v37 & 0x1F;
            if ( (v37 & 0x1Fu) > 0x19 )
            {
              if ( (v37 & 1) != 0 )
                v39 = v38 + 71;
              else
                v39 = v38 + 39;
            }
            else if ( (v37 & 1) != 0 )
            {
              v39 = v38 + 65;
            }
            else
            {
              v39 = v37 & 0x1E | 0x61;
            }
            v40 = v37 >> 3;
            v41 = &v97[v35];
            v97[v35] = v39;
            if ( v40 > 0x19 )
            {
              if ( (v37 & 8) != 0 )
                v36 = v40 + 71;
              else
                v36 = v40 + 39;
            }
            else if ( (v37 & 8) != 0 )
            {
              v36 = v40 + 65;
            }
            else
            {
              v36 = v40 | 0x61;
            }
            v25 = v35 >= 0x1E;
            v35 += 2LL;
            v41[1] = v36;
          }
          while ( !v25 );
          goto LABEL_92;
        case 270:
          sub_13744(v95, 6);
          sub_13744(v94, 0);
          v24 = 0;
          break;
        case 271:
          v8 = 46;
          goto LABEL_3;
        case 512:
          v8 = 42;
          goto LABEL_3;
        case 513:
          v8 = 20;
          goto LABEL_3;
        case 514:
          v8 = 66;
          goto LABEL_3;
        case 515:
          v8 = 58;
          goto LABEL_3;
        case 516:
          v8 = 44;
          goto LABEL_3;
        case 517:
          v8 = 4;
          goto LABEL_3;
        case 518:
          v8 = 68;
          goto LABEL_3;
        case 519:
          v8 = 28;
          goto LABEL_3;
        case 520:
          v8 = 48;
          goto LABEL_3;
        case 521:
          v8 = 54;
          goto LABEL_3;
        case 522:
          v8 = 12;
          goto LABEL_3;
        case 523:
          sub_13744(v95, 2);
          v17 = sub_13B30(v94);
          sub_13928(v92, v17);
          v18 = sub_13B7C(v96);
          goto LABEL_90;
        case 524:
          sub_13744(v95, 32);
          v42 = sub_13B30(v94);
          sub_13928(v92, v42);
          v18 = sub_13B7C(v96);
LABEL_90:
          v21 = (unsigned int)v18;
LABEL_109:
          v22 = v94;
LABEL_110:
          sub_13928(v22, v21);
          continue;
        case 525:
          v8 = 38;
          goto LABEL_3;
        case 526:
          v8 = 30;
          goto LABEL_3;
        case 527:
          v8 = 74;
          goto LABEL_3;
        case 528:
          v8 = 80;
          goto LABEL_3;
        case 529:
          v8 = 60;
          goto LABEL_3;
        case 530:
          v8 = 56;
          goto LABEL_3;
        case 531:
          v8 = 16;
          goto LABEL_3;
        case 532:
          v8 = 34;
          goto LABEL_3;
        case 533:
          v14 = (__int16)sub_13B7C(v96);
          if ( (v14 & 0x80000000) != 0 )
          {
            sub_13744(v95, 29);
            v14 &= 0x7FFFu;
          }
          else
          {
            sub_13744(v95, 40);
          }
          goto LABEL_132;
        case 534:
          v14 = (__int16)sub_13B7C(v96);
          if ( (v14 & 0x80000000) != 0 )
          {
            sub_13744(v95, 37);
            v14 &= 0x7FFFu;
          }
          else
          {
            sub_13744(v95, 70);
          }
LABEL_132:
          sub_13884(v94, v14);
          continue;
        case 544:
          v8 = 55;
          goto LABEL_3;
        case 545:
          v8 = 77;
          goto LABEL_3;
        case 546:
          v8 = 53;
          goto LABEL_3;
        case 547:
          v8 = 39;
          goto LABEL_3;
        case 548:
          v8 = 1;
          goto LABEL_3;
        case 549:
          v8 = 75;
          goto LABEL_3;
        case 550:
          v8 = 41;
          goto LABEL_3;
        case 551:
          v8 = 73;
          goto LABEL_3;
        case 552:
          v8 = 23;
          goto LABEL_3;
        case 553:
          v8 = 45;
          goto LABEL_3;
        case 554:
          v8 = 61;
LABEL_3:
          sub_13744(v10, v8);
          continue;
        default:
          v15 = 62;
          v8 = 8;
          v16 = 14;
          switch ( v12 )
          {
            case 768:
              goto LABEL_98;
            case 769:
              v8 = 76;
              goto LABEL_98;
            case 770:
              sub_13744(v95, 10);
              v8 = (unsigned int)sub_13B4C(v96);
              v10 = v94;
LABEL_98:
              sub_13744(v10, v8);
              v8 = (unsigned int)sub_13B4C(v96);
              v10 = v94;
              goto LABEL_3;
            case 771:
              goto LABEL_108;
            case 772:
              goto LABEL_113;
            case 773:
              sub_13744(v95, 63);
              v43 = sub_13B7C(v96);
              sub_13884(v94, v43);
              continue;
            case 774:
              sub_13744(v95, 43);
              v44 = sub_13BD8(v96);
              sub_13928(v91, (unsigned int)v44);
              v45 = v44;
              if ( v44 >= 1 )
              {
                do
                {
                  v46 = sub_13B4C(v96);
                  sub_13744(v91, v44 ^ (unsigned int)~v46);
                  --v45;
                }
                while ( v45 != 0 );
              }
              sub_13928(v94, v7++);
              continue;
            case 775:
              v16 = 31;
LABEL_108:
              sub_13744(v95, v16);
              v21 = (unsigned int)sub_13BD8(v96);
              goto LABEL_109;
            case 776:
              v15 = 59;
LABEL_113:
              sub_13744(v95, v15);
              v47 = sub_13C90(v96);
              sub_139FC(v94, v47);
              continue;
            case 777:
            case 778:
            case 779:
            case 780:
            case 781:
            case 782:
            case 783:
            case 792:
            case 793:
            case 794:
            case 795:
            case 796:
            case 797:
            case 798:
            case 799:
            case 800:
            case 801:
            case 802:
            case 803:
            case 804:
            case 805:
            case 806:
            case 807:
            case 808:
            case 809:
            case 810:
            case 811:
            case 812:
            case 813:
            case 814:
            case 815:
            case 816:
            case 817:
            case 818:
            case 819:
            case 820:
            case 821:
            case 822:
            case 823:
            case 824:
            case 825:
            case 826:
            case 827:
            case 828:
            case 829:
            case 830:
            case 831:
            case 832:
            case 833:
            case 834:
            case 835:
            case 836:
            case 837:
            case 838:
            case 839:
            case 840:
            case 841:
            case 842:
            case 843:
            case 844:
            case 845:
            case 846:
            case 847:
            case 848:
            case 849:
            case 850:
            case 851:
            case 852:
            case 853:
            case 854:
            case 855:
            case 856:
            case 857:
            case 858:
            case 859:
            case 860:
            case 861:
            case 862:
            case 863:
            case 864:
            case 865:
            case 866:
            case 867:
            case 868:
            case 869:
            case 870:
            case 871:
            case 872:
            case 873:
            case 874:
            case 875:
            case 876:
            case 877:
            case 878:
            case 879:
            case 880:
            case 881:
            case 882:
            case 883:
            case 884:
            case 885:
            case 886:
            case 887:
            case 888:
            case 889:
            case 890:
            case 891:
            case 892:
            case 893:
            case 894:
            case 895:
            case 896:
            case 897:
            case 898:
            case 899:
            case 900:
            case 901:
            case 902:
            case 903:
            case 904:
            case 905:
            case 906:
            case 907:
            case 908:
            case 909:
            case 910:
            case 911:
            case 912:
            case 913:
            case 914:
            case 915:
            case 916:
            case 917:
            case 918:
            case 919:
            case 920:
            case 921:
            case 922:
            case 923:
            case 924:
            case 925:
            case 926:
            case 927:
            case 928:
            case 929:
            case 930:
            case 931:
            case 932:
            case 933:
            case 934:
            case 935:
            case 936:
            case 937:
            case 938:
            case 939:
            case 940:
            case 941:
            case 942:
            case 943:
            case 944:
            case 945:
            case 946:
            case 947:
            case 948:
            case 949:
            case 950:
            case 951:
            case 952:
            case 953:
            case 954:
            case 955:
            case 956:
            case 957:
            case 958:
            case 959:
            case 960:
            case 961:
            case 962:
            case 963:
            case 964:
            case 965:
            case 966:
            case 967:
            case 968:
            case 969:
            case 970:
            case 971:
            case 972:
            case 973:
            case 974:
            case 975:
            case 976:
            case 977:
            case 978:
            case 979:
            case 980:
            case 981:
            case 982:
            case 983:
            case 984:
            case 985:
            case 986:
            case 987:
            case 988:
            case 989:
            case 990:
            case 991:
            case 992:
            case 993:
            case 994:
            case 995:
            case 996:
            case 997:
            case 998:
            case 999:
            case 1000:
            case 1001:
            case 1002:
            case 1003:
            case 1004:
            case 1005:
            case 1006:
            case 1007:
            case 1008:
            case 1009:
            case 1010:
            case 1011:
            case 1012:
            case 1013:
            case 1014:
            case 1015:
            case 1016:
            case 1017:
            case 1018:
            case 1019:
            case 1020:
            case 1021:
            case 1022:
            case 1023:
              goto LABEL_133;
            case 784:
              v8 = 21;
              goto LABEL_3;
            case 785:
              v8 = 3;
              goto LABEL_3;
            case 786:
              v8 = 11;
              goto LABEL_3;
            case 787:
              v8 = 51;
              goto LABEL_3;
            case 788:
              v8 = 33;
              goto LABEL_3;
            case 789:
              v8 = 25;
              goto LABEL_3;
            case 790:
              v8 = 13;
              goto LABEL_3;
            case 791:
              v8 = 67;
              goto LABEL_3;
            case 1024:
              v8 = 15;
              goto LABEL_3;
            case 1025:
              v8 = 71;
              goto LABEL_3;
            case 1026:
              v8 = 27;
              goto LABEL_3;
            case 1027:
              v8 = 7;
              goto LABEL_3;
            case 1028:
              v8 = 5;
              goto LABEL_3;
            case 1029:
              v8 = 79;
              goto LABEL_3;
            case 1030:
              v8 = 9;
              goto LABEL_3;
            case 1031:
              v8 = 19;
              goto LABEL_3;
            case 1032:
              v8 = 35;
              goto LABEL_3;
            case 1033:
              v8 = 65;
              goto LABEL_3;
            default:
              v8 = v13;
              goto LABEL_133;
          }
      }
      while ( 1 )
      {
        v26 = sub_13B4C(v96);
        v27 = v26 ^ (v26 >> 3);
        v28 = v27 & 0x1F;
        if ( v28 > 0x19 )
        {
          v30 = v28 - 10 * ((26 * v28) >> 8);
          v28 = (unsigned __int8)(v28 - 10 * ((unsigned __int16)(26 * v28) >> 8));
          v29 = v30 | 0x30;
        }
        else
        {
          if ( (v27 & 1) != 0 )
          {
            v97[v24] = v28 + 97;
            goto LABEL_55;
          }
          v29 = v27 & 0x1E | 0x41;
        }
        v97[v24] = v29;
LABEL_55:
        v31 = (unsigned __int8)v26 >> 3;
        if ( v31 > 0x19 )
        {
          v97[v24 + 1] = ((v28 ^ v31) - 10 * ((205 * (v28 ^ v31)) >> 11)) | 0x30;
        }
        else
        {
          if ( (v26 & 8) != 0 )
            v32 = v31 + 65;
          else
            v32 = v31 | 0x61;
          v97[v24 + 1] = v32;
        }
        v25 = v24 >= 0x1E;
        v24 += 2LL;
        if ( v25 )
        {
LABEL_92:
          sub_137E0(v94, v97, 32);
          goto LABEL_4;
        }
      }
    }
    break;
  }
LABEL_133:
  v48 = sub_13B38(v94, v8);
  v50 = sub_13B38(v92, v49);
  v51 = sub_13B30(v92);
  sub_13B40(v97, v50, v51);
  v53 = sub_13B38(v93, v52);
  v54 = sub_13B30(v93);
  sub_13B40(v90, v53, v54);
  while ( (unsigned int)sub_13E08(v97) != 0 )
  {
    v55 = sub_13BD8(v97);
    v56 = *(_WORD *)(v48 + v55);
    v57 = v55;
    sub_13B74(v90);
    v58 = 0;
    while ( (unsigned int)sub_13E08(v90) != 0 && (unsigned __int16)sub_13B7C(v90) != v56 )
    {
      sub_13C90(v90);
      ++v58;
    }
    if ( (unsigned int)sub_13E08(v90) != 0 )
      *(_DWORD *)(v48 + v57) = v58;
  }
  v59 = (*(__int64 (__fastcall **)(__int64, const char *))(*(_QWORD *)a1 + 48LL))(a1, "[B");
  v60 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, _QWORD))(*(_QWORD *)a1 + 1376LL))(a1, 4, v59, 0);
  v61 = sub_13B30(v94);
  v62 = (*(__int64 (__fastcall **)(__int64, _QWORD))(*(_QWORD *)a1 + 1408LL))(a1, v61);
  if ( (unsigned int)sub_13B30(v94) != 0 )
  {
    v63 = (void *)(*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1472LL))(a1, v62, 0);
    v65 = (const void *)sub_13B38(v94, v64);
    v66 = sub_13B30(v94);
    memcpy(v63, v65, v66);
    v67 = sub_13B30(v94);
    (*(void (__fastcall **)(__int64, __int64, _QWORD, _QWORD, void *))(*(_QWORD *)a1 + 1664LL))(a1, v62, 0, v67, v63);
  }
  v68 = sub_13B30(v95);
  v69 = (*(__int64 (__fastcall **)(__int64, _QWORD))(*(_QWORD *)a1 + 1408LL))(a1, v68);
  if ( (unsigned int)sub_13B30(v95) != 0 )
  {
    v70 = (void *)(*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1472LL))(a1, v69, 0);
    v72 = (const void *)sub_13B38(v95, v71);
    v73 = sub_13B30(v95);
    memcpy(v70, v72, v73);
    v74 = sub_13B30(v95);
    (*(void (__fastcall **)(__int64, __int64, _QWORD, _QWORD, void *))(*(_QWORD *)a1 + 1664LL))(a1, v69, 0, v74, v70);
  }
  v75 = sub_13B30(v93);
  v76 = (*(__int64 (__fastcall **)(__int64, _QWORD))(*(_QWORD *)a1 + 1408LL))(a1, v75);
  if ( (unsigned int)sub_13B30(v93) != 0 )
  {
    v77 = (void *)(*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1472LL))(a1, v76, 0);
    v79 = (const void *)sub_13B38(v93, v78);
    v80 = sub_13B30(v93);
    memcpy(v77, v79, v80);
    v81 = sub_13B30(v93);
    (*(void (__fastcall **)(__int64, __int64, _QWORD, _QWORD, void *))(*(_QWORD *)a1 + 1664LL))(a1, v76, 0, v81, v77);
  }
  v82 = sub_13B30(v91);
  v83 = (*(__int64 (__fastcall **)(__int64, _QWORD))(*(_QWORD *)a1 + 1408LL))(a1, (unsigned int)(v82 + 4));
  v84 = (unsigned int *)(*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1472LL))(a1, v83, 0);
  *v84 = v7;
  if ( (unsigned int)sub_13B30(v91) != 0 )
  {
    v86 = (const void *)sub_13B38(v91, v85);
    v87 = sub_13B30(v91);
    memcpy(v84 + 1, v86, v87);
  }
  v88 = sub_13B30(v91);
  (*(void (__fastcall **)(__int64, __int64, _QWORD, _QWORD, unsigned int *))(*(_QWORD *)a1 + 1664LL))(
    a1,
    v83,
    0,
    (unsigned int)(v88 + 4),
    v84);
  (*(void (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)a1 + 1392LL))(a1, v60, 0, v62);
  (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1392LL))(a1, v60, 1, v69);
  (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1392LL))(a1, v60, 2, v76);
  (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1392LL))(a1, v60, 3, v83);
  sub_13730(v91);
  sub_13730(v92);
  sub_13730(v93);
  sub_13730(v94);
  sub_13730(v95);
  return v60;
}


// Address: 0x13700 | Function: sub_13700
__int64 __fastcall sub_13700(__int64 a1, unsigned int a2)
{
  __int64 result; // x0

  result = sub_326B4(a2);
  *(_DWORD *)a1 = 0;
  *(_DWORD *)(a1 + 4) = a2;
  *(_QWORD *)(a1 + 8) = result;
  return result;
}


// Address: 0x13730 | Function: sub_13730
__int64 __fastcall sub_13730(__int64 a1)
{
  __int64 result; // x0

  result = *(_QWORD *)(a1 + 8);
  if ( result != 0 )
    return sub_13E30(result, 1);
  return result;
}


// Address: 0x13744 | Function: sub_13744
unsigned int *__fastcall sub_13744(unsigned int *result, char a2)
{
  size_t v2; // x20
  unsigned int *v3; // x19
  char v4; // w23
  __int64 v5; // x0
  void *v6; // x0
  const void *v7; // x22
  void *v8; // x21
  __int64 v9; // x8

  v2 = *result;
  v3 = result;
  if ( (_DWORD)v2 == result[1] )
  {
    if ( (_DWORD)v2 == -1 )
    {
      LODWORD(v2) = -1;
    }
    else
    {
      v4 = a2;
      v5 = (unsigned int)(2 * v2 + 2);
      v3[1] = v5;
      v6 = (void *)sub_326B4(v5);
      v7 = *((const void **)v3 + 1);
      v8 = v6;
      result = (unsigned int *)memcpy(v6, v7, v2);
      if ( v7 != nullptr )
      {
        result = (unsigned int *)sub_13E30(v7, 1);
        LODWORD(v2) = *v3;
      }
      a2 = v4;
      *((_QWORD *)v3 + 1) = v8;
    }
  }
  v9 = *((_QWORD *)v3 + 1);
  *v3 = v2 + 1;
  *(_BYTE *)(v9 + (unsigned int)v2) = a2;
  return result;
}


// Address: 0x137E0 | Function: sub_137E0
unsigned int *__fastcall sub_137E0(unsigned int *result, const void *a2, int a3)
{
  size_t v3; // x21
  unsigned int *v5; // x20
  __int64 v6; // x0
  const void *v7; // x24
  char *v8; // x0
  const void *v9; // x23
  char *v10; // x22

  if ( a3 != 0 )
  {
    v3 = *result;
    v5 = result;
    if ( (int)v3 + a3 <= result[1] )
    {
      v10 = *((char **)result + 1);
    }
    else
    {
      v6 = (unsigned int)(2 * (v3 + a3));
      v7 = a2;
      v5[1] = v6;
      v8 = (char *)sub_326B4(v6);
      v9 = *((const void **)v5 + 1);
      v10 = v8;
      memcpy(v8, v9, v3);
      if ( v9 != nullptr )
      {
        sub_13E30(v9, 1);
        LODWORD(v3) = *v5;
      }
      a2 = v7;
      *((_QWORD *)v5 + 1) = v10;
    }
    result = (unsigned int *)memcpy(&v10[(unsigned int)v3], a2, a3);
    *v5 += a3;
  }
  return result;
}


// Address: 0x13884 | Function: sub_13884
unsigned int *__fastcall sub_13884(unsigned int *result, __int16 a2)
{
  size_t v2; // x21
  unsigned int *v3; // x19
  __int64 v5; // x0
  _BYTE *v6; // x0
  const void *v7; // x23
  _BYTE *v8; // x22
  __int64 v9; // x8
  __int64 v10; // x9

  v2 = *result;
  v3 = result;
  if ( (int)v2 + 2 <= result[1] )
  {
    v8 = *((_BYTE **)result + 1);
  }
  else
  {
    v5 = (unsigned int)(2 * (v2 + 2));
    v3[1] = v5;
    v6 = (_BYTE *)sub_326B4(v5);
    v7 = *((const void **)v3 + 1);
    v8 = v6;
    result = (unsigned int *)memcpy(v6, v7, v2);
    if ( v7 != nullptr )
    {
      result = (unsigned int *)sub_13E30(v7, 1);
      LODWORD(v2) = *v3;
    }
    *((_QWORD *)v3 + 1) = v8;
  }
  *v3 = v2 + 1;
  v8[(unsigned int)v2] = a2;
  v9 = *v3;
  v10 = *((_QWORD *)v3 + 1);
  *v3 = v9 + 1;
  *(_BYTE *)(v10 + v9) = HIBYTE(a2);
  return result;
}


// Address: 0x13928 | Function: sub_13928
unsigned int *__fastcall sub_13928(unsigned int *result, int a2)
{
  size_t v2; // x21
  unsigned int *v3; // x19
  __int64 v5; // x0
  _BYTE *v6; // x0
  const void *v7; // x23
  _BYTE *v8; // x22
  __int64 v9; // x8
  __int64 v10; // x9
  __int64 v11; // x8
  __int64 v12; // x9
  __int64 v13; // x8
  __int64 v14; // x9

  v2 = *result;
  v3 = result;
  if ( (int)v2 + 4 <= result[1] )
  {
    v8 = *((_BYTE **)result + 1);
  }
  else
  {
    v5 = (unsigned int)(2 * (v2 + 4));
    v3[1] = v5;
    v6 = (_BYTE *)sub_326B4(v5);
    v7 = *((const void **)v3 + 1);
    v8 = v6;
    result = (unsigned int *)memcpy(v6, v7, v2);
    if ( v7 != nullptr )
    {
      result = (unsigned int *)sub_13E30(v7, 1);
      LODWORD(v2) = *v3;
    }
    *((_QWORD *)v3 + 1) = v8;
  }
  *v3 = v2 + 1;
  v8[(unsigned int)v2] = a2;
  v9 = *v3;
  v10 = *((_QWORD *)v3 + 1);
  *v3 = v9 + 1;
  *(_BYTE *)(v10 + v9) = BYTE1(a2);
  v11 = *v3;
  v12 = *((_QWORD *)v3 + 1);
  *v3 = v11 + 1;
  *(_BYTE *)(v12 + v11) = BYTE2(a2);
  v13 = *v3;
  v14 = *((_QWORD *)v3 + 1);
  *v3 = v13 + 1;
  *(_BYTE *)(v14 + v13) = HIBYTE(a2);
  return result;
}


// Address: 0x139FC | Function: sub_139FC
unsigned int *__fastcall sub_139FC(unsigned int *result, __int64 a2)
{
  size_t v2; // x21
  unsigned int *v3; // x19
  __int64 v5; // x0
  _BYTE *v6; // x0
  const void *v7; // x23
  _BYTE *v8; // x22
  __int64 v9; // x8
  __int64 v10; // x9
  __int64 v11; // x8
  __int64 v12; // x9
  __int64 v13; // x8
  __int64 v14; // x9
  __int64 v15; // x8
  __int64 v16; // x9
  __int64 v17; // x8
  __int64 v18; // x9
  __int64 v19; // x8
  __int64 v20; // x9
  __int64 v21; // x8
  __int64 v22; // x9

  v2 = *result;
  v3 = result;
  if ( (int)v2 + 8 <= result[1] )
  {
    v8 = *((_BYTE **)result + 1);
  }
  else
  {
    v5 = (unsigned int)(2 * (v2 + 8));
    v3[1] = v5;
    v6 = (_BYTE *)sub_326B4(v5);
    v7 = *((const void **)v3 + 1);
    v8 = v6;
    result = (unsigned int *)memcpy(v6, v7, v2);
    if ( v7 != nullptr )
    {
      result = (unsigned int *)sub_13E30(v7, 1);
      LODWORD(v2) = *v3;
    }
    *((_QWORD *)v3 + 1) = v8;
  }
  *v3 = v2 + 1;
  v8[(unsigned int)v2] = a2;
  v9 = *v3;
  v10 = *((_QWORD *)v3 + 1);
  *v3 = v9 + 1;
  *(_BYTE *)(v10 + v9) = BYTE1(a2);
  v11 = *v3;
  v12 = *((_QWORD *)v3 + 1);
  *v3 = v11 + 1;
  *(_BYTE *)(v12 + v11) = BYTE2(a2);
  v13 = *v3;
  v14 = *((_QWORD *)v3 + 1);
  *v3 = v13 + 1;
  *(_BYTE *)(v14 + v13) = BYTE3(a2);
  v15 = *v3;
  v16 = *((_QWORD *)v3 + 1);
  *v3 = v15 + 1;
  *(_BYTE *)(v16 + v15) = BYTE4(a2);
  v17 = *v3;
  v18 = *((_QWORD *)v3 + 1);
  *v3 = v17 + 1;
  *(_BYTE *)(v18 + v17) = BYTE5(a2);
  v19 = *v3;
  v20 = *((_QWORD *)v3 + 1);
  *v3 = v19 + 1;
  *(_BYTE *)(v20 + v19) = BYTE6(a2);
  v21 = *v3;
  v22 = *((_QWORD *)v3 + 1);
  *v3 = v21 + 1;
  *(_BYTE *)(v22 + v21) = HIBYTE(a2);
  return result;
}


// Address: 0x13B30 | Function: sub_13B30
__int64 __fastcall sub_13B30(unsigned int *a1)
{
  return *a1;
}


// Address: 0x13B38 | Function: sub_13B38
__int64 __fastcall sub_13B38(__int64 a1)
{
  return *(_QWORD *)(a1 + 8);
}


// Address: 0x13B40 | Function: sub_13B40
__int64 __fastcall sub_13B40(__int64 result, __int64 a2, int a3)
{
  *(_QWORD *)(result + 8) = a2;
  *(_DWORD *)result = 0;
  *(_DWORD *)(result + 4) = a3;
  return result;
}


// Address: 0x13B4C | Function: sub_13B4C
__int64 __fastcall sub_13B4C(unsigned int *a1)
{
  __int64 v1; // x8
  __int64 v2; // x9

  v1 = *a1;
  if ( (unsigned int)v1 >= a1[1] )
    return 0xFFFFFFFFLL;
  v2 = *((_QWORD *)a1 + 1);
  *a1 = v1 + 1;
  return *(unsigned __int8 *)(v2 + v1);
}


// Address: 0x13B74 | Function: sub_13B74
_DWORD *__fastcall sub_13B74(_DWORD *result)
{
  *result = 0;
  return result;
}


// Address: 0x13B7C | Function: sub_13B7C
__int64 __fastcall sub_13B7C(unsigned int *a1)
{
  unsigned int v1; // w9
  unsigned int v2; // w10
  __int64 v3; // x8
  int v4; // w8
  unsigned int v5; // w9
  __int64 v7; // x10

  v1 = *a1;
  v2 = a1[1];
  if ( *a1 >= v2 )
  {
    v4 = 0xFFFF;
    return v4 | 0xFF00u;
  }
  v3 = *((_QWORD *)a1 + 1);
  *a1 = v1 + 1;
  v4 = *(unsigned __int8 *)(v3 + v1);
  v5 = v1 + 1;
  if ( v5 >= v2 )
    return v4 | 0xFF00u;
  v7 = *((_QWORD *)a1 + 1);
  *a1 = v5 + 1;
  return (*(unsigned __int8 *)(v7 + v5) << 8) | (unsigned int)v4;
}


// Address: 0x13BD8 | Function: sub_13BD8
__int64 __fastcall sub_13BD8(unsigned int *a1)
{
  unsigned int v1; // w9
  unsigned int v2; // w10
  __int64 v3; // x8
  int v4; // w8
  int v5; // w11
  int v6; // w12
  int v7; // w9
  __int64 v8; // x11
  __int64 v9; // x12
  __int64 v10; // x9

  v2 = *a1;
  v1 = a1[1];
  if ( *a1 >= v1 )
  {
    v4 = -1;
LABEL_3:
    v5 = -256;
    if ( v2 >= v1 )
      goto LABEL_4;
LABEL_8:
    v9 = *((_QWORD *)a1 + 1);
    *a1 = v2 + 1;
    v6 = *(unsigned __int8 *)(v9 + v2++) << 16;
    if ( v2 >= v1 )
      goto LABEL_5;
LABEL_9:
    v10 = *((_QWORD *)a1 + 1);
    *a1 = v2 + 1;
    v7 = *(unsigned __int8 *)(v10 + v2) << 24;
    return v5 | v4 | v6 | (unsigned int)v7;
  }
  v3 = *((_QWORD *)a1 + 1);
  *a1 = v2 + 1;
  v4 = *(unsigned __int8 *)(v3 + v2++);
  if ( v2 >= v1 )
    goto LABEL_3;
  v8 = *((_QWORD *)a1 + 1);
  *a1 = v2 + 1;
  v5 = *(unsigned __int8 *)(v8 + v2++) << 8;
  if ( v2 < v1 )
    goto LABEL_8;
LABEL_4:
  v6 = -65536;
  if ( v2 < v1 )
    goto LABEL_9;
LABEL_5:
  v7 = -16777216;
  return v5 | v4 | v6 | (unsigned int)v7;
}


// Address: 0x13C90 | Function: sub_13C90
unsigned __int64 __fastcall sub_13C90(unsigned int *a1)
{
  unsigned int v1; // w9
  unsigned int v2; // w11
  __int64 v3; // x8
  __int64 v4; // x8
  __int64 v5; // x10
  unsigned __int64 v6; // x12
  unsigned __int64 v7; // x13
  unsigned __int64 v8; // x14
  unsigned __int64 v9; // x15
  unsigned __int64 v10; // x16
  unsigned __int64 v11; // x9
  __int64 v12; // x10
  __int64 v13; // x10
  __int64 v14; // x12
  __int64 v15; // x13
  __int64 v16; // x14
  __int64 v17; // x15
  __int64 v18; // x16
  __int64 v19; // x9

  v2 = *a1;
  v1 = a1[1];
  if ( *a1 >= v1 )
  {
    v4 = -1;
LABEL_3:
    v5 = -256;
    if ( v2 >= v1 )
      goto LABEL_4;
    goto LABEL_12;
  }
  v3 = *((_QWORD *)a1 + 1);
  *a1 = v2 + 1;
  v4 = *(unsigned __int8 *)(v3 + v2++);
  if ( v2 >= v1 )
    goto LABEL_3;
  v12 = *((_QWORD *)a1 + 1);
  *a1 = v2 + 1;
  v13 = *(unsigned __int8 *)(v12 + v2++);
  v5 = v13 << 8;
  if ( v2 >= v1 )
  {
LABEL_4:
    v6 = -65536;
    if ( v2 >= v1 )
      goto LABEL_5;
    goto LABEL_13;
  }
LABEL_12:
  v14 = *((_QWORD *)a1 + 1);
  *a1 = v2 + 1;
  v6 = (unsigned __int64)*(unsigned __int8 *)(v14 + v2++) << 16;
  if ( v2 >= v1 )
  {
LABEL_5:
    v7 = -16777216;
    if ( v2 >= v1 )
      goto LABEL_6;
    goto LABEL_14;
  }
LABEL_13:
  v15 = *((_QWORD *)a1 + 1);
  *a1 = v2 + 1;
  v7 = (unsigned __int64)*(unsigned __int8 *)(v15 + v2++) << 24;
  if ( v2 >= v1 )
  {
LABEL_6:
    v8 = 0xFFFFFFFF00000000LL;
    if ( v2 >= v1 )
      goto LABEL_7;
    goto LABEL_15;
  }
LABEL_14:
  v16 = *((_QWORD *)a1 + 1);
  *a1 = v2 + 1;
  v8 = (unsigned __int64)*(unsigned __int8 *)(v16 + v2++) << 32;
  if ( v2 >= v1 )
  {
LABEL_7:
    v9 = 0xFFFFFF0000000000LL;
    if ( v2 >= v1 )
      goto LABEL_8;
LABEL_16:
    v18 = *((_QWORD *)a1 + 1);
    *a1 = v2 + 1;
    v10 = (unsigned __int64)*(unsigned __int8 *)(v18 + v2++) << 48;
    if ( v2 >= v1 )
      goto LABEL_9;
LABEL_17:
    v19 = *((_QWORD *)a1 + 1);
    *a1 = v2 + 1;
    v11 = (unsigned __int64)*(unsigned __int8 *)(v19 + v2) << 56;
    return v5 | v4 | v6 | v7 | v8 | v9 | v10 | v11;
  }
LABEL_15:
  v17 = *((_QWORD *)a1 + 1);
  *a1 = v2 + 1;
  v9 = (unsigned __int64)*(unsigned __int8 *)(v17 + v2++) << 40;
  if ( v2 < v1 )
    goto LABEL_16;
LABEL_8:
  v10 = 0xFFFF000000000000LL;
  if ( v2 < v1 )
    goto LABEL_17;
LABEL_9:
  v11 = 0xFF00000000000000LL;
  return v5 | v4 | v6 | v7 | v8 | v9 | v10 | v11;
}


// Address: 0x13E08 | Function: sub_13E08
__int64 __fastcall sub_13E08(_DWORD *a1)
{
  return (unsigned int)(a1[1] - *a1);
}


// Address: 0x13E14 | Function: sub_13E14
void sub_13E14()
{
  __int64 v0; // x0
  void *v1; // x0

  v0 = sub_2D19C();
  v1 = (void *)sub_13E4C(v0);
  free(v1);
}


// Address: 0x13E30 | Function: sub_13E30
void sub_13E30()
{
  JUMPOUT(0x13E28);
}


// Address: 0x13E38 | Function: sub_13E38
unsigned __int64 sub_13E38()
{
  return atomic_load((unsigned __int64 *)&off_3DAF8);
}


// Address: 0x13E4C | Function: sub_13E4C
void __noreturn sub_13E4C()
{
  __int64 *v0; // x0
  __int64 v1; // x19
  unsigned __int64 v2; // x0

  v0 = (__int64 *)sub_14038();
  if ( v0 != nullptr )
  {
    v1 = *v0;
    if ( *v0 != 0 && (sub_2D128(v1 + 96) & 1) != 0 )
      sub_13EA0(*(_QWORD *)(v1 + 40));
  }
  v2 = atomic_load((unsigned __int64 *)off_3DAF0);
  sub_13EA0(v2);
}


// Address: 0x13E8C | Function: sub_13E8C
unsigned __int64 sub_13E8C()
{
  return atomic_load((unsigned __int64 *)off_3DAF0);
}


// Address: 0x13EA0 | Function: sub_13EA0
void __fastcall __noreturn sub_13EA0(void (*a1)(void))
{
  a1();
  sub_1405C("terminate_handler unexpectedly returned");
}


// Address: 0x13ED0 | Function: sub_13ED0
unsigned __int64 sub_13ED0()
{
  return atomic_load((unsigned __int64 *)&qword_3DB40);
}


// Address: 0x13EE4 | Function: sub_13EE4
void __noreturn sub_13EE4()
{
  __int64 *v0; // x0
  __int64 v1; // x19
  __int64 v2; // x8
  __int64 v3; // x20
  const char *v4; // x19
  __int64 v5; // x0
  const char *v6; // x20
  const char *v7; // x0
  __int64 v8; // [xsp+8h] [xbp-8h] BYREF

  v0 = (__int64 *)sub_14038();
  if ( v0 == nullptr || (v1 = *v0, *v0 == 0) )
    sub_1405C("terminating");
  if ( (sub_2D128(v1 + 96) & 1) != 0 )
  {
    if ( sub_2D11C(v1 + 96) == 0x434C4E47432B2B01LL )
      v2 = *(_QWORD *)(v1 + 8);
    else
      v2 = v1 + 128;
    v3 = *(_QWORD *)(v1 + 16);
    v8 = v2;
    v4 = *(const char **)(v3 + 8);
    v5 = sub_14160(v4, 0, 0, 0);
    if ( v5 != 0 )
      v4 = (const char *)v5;
    if ( (sub_2C77C(&`typeinfo for'std::exception, v3, &v8) & 1) != 0 )
    {
      v6 = off_3DB00;
      v7 = (const char *)(*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v8 + 16LL))(v8);
      sub_1405C("terminating due to %s exception of type %s: %s", v6, v4, v7);
    }
    sub_1405C("terminating due to %s exception of type %s", off_3DB00, v4);
  }
  sub_1405C("terminating due to %s foreign exception", off_3DB00);
}


// Address: 0x13FF4 | Function: sub_13FF4
void __noreturn sub_13FF4()
{
  off_3DB00 = "unexpected";
  sub_13E4C();
}


// Address: 0x14014 | Function: sub_14014
__int64 sub_14014()
{
  return sub_2DF1C(&unk_3DB08);
}


// Address: 0x14038 | Function: sub_14038
__int64 sub_14038()
{
  return sub_2DF1C(&unk_3DB08);
}


// Address: 0x1405C | Function: sub_1405C
void __noreturn sub_1405C(const char *a1, ...)
{
  gcc_va_list va1; // [xsp+C0h] [xbp-60h] BYREF
  gcc_va_list arg; // [xsp+E0h] [xbp-40h] BYREF
  gcc_va_list va; // [xsp+100h] [xbp-20h] BYREF
  char *ptr; // [xsp+138h] [xbp+18h] BYREF

  va_start(va, a1);
  fwrite("libc++abi: ", 0xBu, 1u, (FILE *)((char *)&_sF + 304));
  va_copy(arg, va);
  vfprintf((FILE *)((char *)&_sF + 304), a1, arg);
  fputc(10, (FILE *)((char *)&_sF + 304));
  va_end(va);
  va_start(va, a1);
  va_copy(va1, va);
  vasprintf(&ptr, a1, va1);
  android_set_abort_message(ptr);
  openlog("libc++abi", 0, 0);
  syslog(2, "%s", ptr);
  closelog();
  abort();
}


// Address: 0x14160 | Function: sub_14160
void *__fastcall sub_14160(__int64 a1, void *a2, unsigned __int64 *a3, int *a4)
{
  void *v7; // x20
  size_t v9; // x0
  bool v10; // zf
  void *v12; // x0
  int v13; // w8
  _QWORD *i; // x0
  _QWORD *v15; // x8
  __int64 v17; // x9
  unsigned __int8 *v18; // x28
  signed __int64 v19; // x11
  _QWORD *v20; // x10
  __int64 v21; // x8
  _QWORD *v22; // x0
  __int64 v23; // x9
  char *v24; // x8
  __int64 v25; // x9
  unsigned __int8 *v26; // x10
  unsigned __int8 *v28; // x9
  int v29; // w10
  int v30; // w11
  unsigned __int8 *v31; // x11
  unsigned __int8 *v32; // x12
  unsigned __int64 v33; // x8
  void *v34; // x21
  unsigned __int64 v35; // x8
  void *v36; // x0
  unsigned __int64 v37; // x9
  size_t v38; // x1
  _QWORD *v39; // [xsp+0h] [xbp-1390h]
  signed __int64 v40; // [xsp+8h] [xbp-1388h]
  void *v41; // [xsp+10h] [xbp-1380h]
  void *v42; // [xsp+18h] [xbp-1378h] BYREF
  unsigned __int64 v43; // [xsp+20h] [xbp-1370h]
  unsigned __int64 v44; // [xsp+28h] [xbp-1368h]
  __int64 v45; // [xsp+30h] [xbp-1360h]
  int v46; // [xsp+38h] [xbp-1358h]
  unsigned __int8 *v47; // [xsp+40h] [xbp-1350h] BYREF
  unsigned __int8 *v48; // [xsp+48h] [xbp-1348h]
  void *v49; // [xsp+50h] [xbp-1340h]
  _QWORD *v50; // [xsp+58h] [xbp-1338h]
  void **v51; // [xsp+60h] [xbp-1330h]
  _QWORD v52[32]; // [xsp+68h] [xbp-1328h] BYREF
  void *v53[3]; // [xsp+168h] [xbp-1228h] BYREF
  _BYTE v54[256]; // [xsp+180h] [xbp-1210h] BYREF
  void *v55[3]; // [xsp+280h] [xbp-1110h] BYREF
  _BYTE v56[64]; // [xsp+298h] [xbp-10F8h] BYREF
  void *v57[3]; // [xsp+2D8h] [xbp-10B8h] BYREF
  _BYTE v58[32]; // [xsp+2F0h] [xbp-10A0h] BYREF
  void *ptr; // [xsp+310h] [xbp-1080h] BYREF
  _BYTE *v60; // [xsp+318h] [xbp-1078h]
  __int16 *v61; // [xsp+320h] [xbp-1070h]
  _BYTE v62[32]; // [xsp+328h] [xbp-1068h] BYREF
  __int16 v63; // [xsp+348h] [xbp-1048h] BYREF
  char v64; // [xsp+34Ah] [xbp-1046h]
  __int64 v65; // [xsp+350h] [xbp-1040h]
  __int64 v66; // [xsp+358h] [xbp-1038h]
  int v67; // [xsp+360h] [xbp-1030h]
  _QWORD v68[512]; // [xsp+370h] [xbp-1020h] BYREF
  _QWORD *v69; // [xsp+1370h] [xbp-20h]

  if ( a1 == 0 || a2 != nullptr && a3 == nullptr )
  {
    v7 = nullptr;
    if ( a4 != nullptr )
      *a4 = -3;
    return v7;
  }
  v9 = strlen((const char *)a1);
  v47 = (unsigned __int8 *)a1;
  v48 = (unsigned __int8 *)(a1 + v9);
  v51 = v53;
  v53[2] = v55;
  v55[2] = v57;
  v57[2] = &ptr;
  v61 = &v63;
  v63 = 1;
  v49 = v52;
  v50 = v52;
  memset(v52, 0, sizeof(v52));
  v53[0] = v54;
  v53[1] = v54;
  memset(v54, 0, sizeof(v54));
  v55[0] = v56;
  v55[1] = v56;
  memset(v56, 0, sizeof(v56));
  v57[0] = v58;
  v57[1] = v58;
  memset(v58, 0, sizeof(v58));
  ptr = v62;
  v60 = v62;
  memset(v62, 0, sizeof(v62));
  v64 = 0;
  v65 = -1;
  v67 = 0;
  v66 = 0;
  *(_OWORD *)v68 = 0u;
  v69 = v68;
  if ( v9 < 2 )
  {
LABEL_20:
    v12 = (void *)sub_1544C(&v47);
    if ( v48 != v47 )
      goto LABEL_21;
LABEL_78:
    if ( v12 != nullptr )
      goto LABEL_79;
    goto LABEL_21;
  }
  if ( *(_WORD *)a1 == 23135 )
  {
    v17 = 2;
  }
  else
  {
    if ( v9 == 2 )
      goto LABEL_20;
    v10 = *(_WORD *)a1 == 24415 && *(_BYTE *)(a1 + 2) == 90;
    if ( !v10 )
    {
      if ( v9 < 4 )
        goto LABEL_20;
      if ( *(_DWORD *)a1 == 1516199775 )
      {
        v25 = 4;
      }
      else
      {
        if ( v9 == 4 )
          goto LABEL_20;
        if ( *(_DWORD *)a1 != 1600085855 || *(_BYTE *)(a1 + 4) != 90 )
          goto LABEL_20;
        v25 = 5;
      }
      v47 = (unsigned __int8 *)(a1 + v25);
      v12 = (void *)sub_14858(&v47);
      v42 = v12;
      if ( v12 == nullptr )
        goto LABEL_78;
      v26 = v47;
      if ( (unsigned __int64)(v48 - v47) >= 0xD
        && *(_QWORD *)v47 == 0x695F6B636F6C625FLL
        && *(_QWORD *)(v47 + 5) == 0x656B6F766E695F6BLL )
      {
        v28 = v47 + 13;
        v47 += 13;
        if ( v26 + 13 == v48 || *v28 != 95 )
        {
          v29 = 0;
        }
        else
        {
          v28 = v26 + 14;
          v29 = 1;
          v47 = v28;
        }
        if ( v48 == v28 || (unsigned int)*v28 - 58 < 0xFFFFFFF6 )
        {
          v30 = 1;
        }
        else
        {
          v31 = v28;
          while ( (unsigned int)*v31 - 58 >= 0xFFFFFFF6 )
          {
            v47 = ++v31;
            if ( v31 == v48 )
            {
              v32 = v48;
              goto LABEL_69;
            }
          }
          v32 = v31;
LABEL_69:
          v10 = v32 == v28;
          v28 = v31;
          v30 = v10;
        }
        if ( (v29 & v30 & 1) == 0 )
        {
          if ( v48 == v28 )
          {
LABEL_76:
            v12 = (void *)sub_15398((int)&v47, "invocation function for block in ");
            goto LABEL_78;
          }
          if ( *v28 == 46 )
          {
            v47 = v48;
            goto LABEL_76;
          }
        }
      }
      v12 = nullptr;
      goto LABEL_78;
    }
    v17 = 3;
  }
  v47 = (unsigned __int8 *)(a1 + v17);
  v12 = (void *)sub_14858(&v47);
  if ( v12 != nullptr )
  {
    v18 = v47;
    v19 = v48 - v47;
    if ( v48 == v47 )
      goto LABEL_79;
    if ( *v47 == 46 )
    {
      v20 = v69;
      v21 = v69[1];
      if ( (unsigned __int64)(v21 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v41 = v12;
        v39 = v69;
        v40 = v48 - v47;
        v22 = malloc(0x1000u);
        if ( v22 == nullptr )
          sub_13E4C();
        v19 = v40;
        v20 = v22;
        v69 = v22;
        v21 = 0;
        *v22 = v39;
        v22[1] = 0;
        v12 = v41;
      }
      v23 = v21 + 48;
      v24 = (char *)v20 + v21;
      v20[1] = v23;
      *((_QWORD *)v24 + 2) = off_38D58;
      v24 += 16;
      LOWORD(v23) = *(_WORD *)(v24 + 9);
      *((_QWORD *)v24 + 2) = v12;
      *((_QWORD *)v24 + 3) = v18;
      v12 = v24;
      v24[8] = 1;
      *((_QWORD *)v24 + 4) = v19;
      *(_WORD *)(v24 + 9) = v23 & 0xF000 | 0x540;
      v47 = v48;
LABEL_79:
      if ( a2 != nullptr )
        v33 = *a3;
      else
        v33 = 0;
      v44 = v33;
      v42 = a2;
      v43 = 0;
      v46 = 1;
      v45 = -1;
      if ( ptr != v60 )
        sub_1405C("%s:%d: %s", "out/llvm-project/libcxxabi/src/cxa_demangle.cpp", 400, (const char *)&unk_9335);
      v34 = v12;
      (*(void (__fastcall **)(void *, void **))(*(_QWORD *)v12 + 32LL))(v12, &v42);
      if ( (*(_WORD *)((_BYTE *)v34 + 9) & 0xC0) != 0x40 )
        (*(void (__fastcall **)(void *, void **))(*(_QWORD *)v34 + 40LL))(v34, &v42);
      v35 = v43;
      v36 = v42;
      v37 = v43 + 1;
      if ( v43 + 1 > v44 )
      {
        if ( 2 * v44 <= v43 + 993 )
          v38 = v43 + 993;
        else
          v38 = 2 * v44;
        v44 = v38;
        v36 = realloc(v42, v38);
        v42 = v36;
        if ( v36 == nullptr )
          abort();
        v35 = v43;
        v37 = v43 + 1;
      }
      v43 = v37;
      *((_BYTE *)v36 + v35) = 0;
      if ( a3 != nullptr )
        *a3 = v43;
      v7 = v42;
      v13 = 0;
      if ( a4 == nullptr )
        goto LABEL_23;
      goto LABEL_22;
    }
  }
LABEL_21:
  v7 = nullptr;
  v13 = -2;
  if ( a4 != nullptr )
LABEL_22:
    *a4 = v13;
LABEL_23:
  for ( i = v69; v69 != nullptr; i = v69 )
  {
    while ( 1 )
    {
      v15 = (_QWORD *)*i;
      v69 = (_QWORD *)*i;
      if ( i != v68 )
        break;
      i = v15;
      if ( v15 == nullptr )
        goto LABEL_28;
    }
    free(i);
  }
LABEL_28:
  v68[0] = 0;
  v68[1] = 0;
  v69 = v68;
  if ( ptr != v62 )
    free(ptr);
  if ( v57[0] != v58 )
    free(v57[0]);
  if ( v55[0] != v56 )
    free(v55[0]);
  if ( v53[0] != v54 )
    free(v53[0]);
  if ( v49 != v52 )
    free(v49);
  return v7;
}


// Address: 0x14728 | Function: sub_14728
void __fastcall sub_14728(_QWORD *a1)
{
  _QWORD *v2; // x0
  _QWORD *v3; // x20
  _QWORD *v4; // x8
  _QWORD *v5; // x0
  _QWORD *v6; // x0
  _QWORD *v7; // x0
  _QWORD *v8; // x0
  _QWORD *v9; // x0

  v2 = (_QWORD *)a1[614];
  v3 = a1 + 102;
  if ( v2 != nullptr )
  {
    do
    {
      while ( 1 )
      {
        v4 = (_QWORD *)*v2;
        a1[614] = *v2;
        if ( v2 == v3 )
          break;
        free(v2);
        v2 = (_QWORD *)a1[614];
        if ( v2 == nullptr )
          goto LABEL_6;
      }
      v2 = v4;
    }
    while ( v4 != nullptr );
  }
LABEL_6:
  v5 = (_QWORD *)a1[90];
  *v3 = 0;
  a1[103] = 0;
  a1[614] = v3;
  if ( v5 != a1 + 93 )
    free(v5);
  v6 = (_QWORD *)a1[83];
  if ( v6 != a1 + 86 )
    free(v6);
  v7 = (_QWORD *)a1[72];
  if ( v7 != a1 + 75 )
    free(v7);
  v8 = (_QWORD *)a1[37];
  if ( v8 != a1 + 40 )
    free(v8);
  v9 = (_QWORD *)a1[2];
  if ( v9 != a1 + 5 )
    free(v9);
}


// Address: 0x147F8 | Function: sub_147F8
__int64 __fastcall sub_147F8(const void **a1, const void *a2, size_t a3)
{
  char *v3; // x19

  v3 = (char *)*a1;
  if ( a3 > (_BYTE *)a1[1] - (_BYTE *)*a1 || memcmp(*a1, a2, a3) != 0 )
    return 0;
  *a1 = &v3[a3];
  return 1;
}


// Address: 0x14858 | Function: sub_14858
__int64 __fastcall sub_14858(unsigned __int8 **a1)
{
  unsigned __int8 *v2; // x8
  unsigned __int8 *v3; // x9
  unsigned __int64 v4; // x10
  int v5; // w11
  unsigned int v6; // w10
  __int64 v7; // x20
  unsigned __int8 *v8; // x8
  unsigned __int8 *v9; // x9
  unsigned __int8 *v10; // x8
  unsigned __int64 v11; // x9
  unsigned __int64 v12; // x10
  unsigned __int8 *v13; // x11
  __int64 v14; // x12
  __int64 v15; // x13
  unsigned __int64 v16; // x15
  unsigned __int64 v17; // x16
  unsigned __int64 v18; // x14
  int v19; // w9
  __int64 v20; // x0
  unsigned __int8 *v21; // x21
  __int64 v22; // x8
  __int64 v23; // x20
  unsigned __int8 *v24; // x0
  __int16 v25; // w9
  __int64 v26; // x11
  const char *v27; // x8
  unsigned __int8 *v28; // x8
  unsigned __int8 *v29; // x9
  unsigned int v30; // w11
  bool v31; // zf
  __int64 v32; // x22
  __int64 v33; // x26
  __int64 v34; // x1
  unsigned __int8 *v35; // x8
  unsigned __int8 *v36; // x8
  unsigned __int8 *v37; // x9
  unsigned int v38; // w10
  int v39; // w10
  unsigned int v40; // w10
  __int64 v41; // x21
  unsigned __int8 *v42; // x22
  __int64 v43; // x8
  unsigned __int8 *v44; // x0
  unsigned __int8 *v45; // x8
  _BOOL4 v46; // w20
  unsigned __int8 *v47; // x10
  unsigned __int8 *v48; // x11
  unsigned __int8 *v49; // x9
  unsigned __int8 **v50; // x25
  __int64 v51; // x21
  char *v52; // x0
  unsigned __int8 *v53; // x24
  unsigned __int8 *v54; // x8
  __int64 v55; // x0
  unsigned __int8 *v56; // x23
  __int64 v57; // x26
  __int64 v58; // x22
  size_t v59; // x2
  char *v60; // x24
  __int64 v61; // x1
  unsigned __int8 *v62; // x8
  unsigned __int8 *v63; // x9
  __int64 v64; // x23
  __int64 v65; // x24
  unsigned __int8 *v66; // x9
  unsigned __int8 **v67; // x21
  __int64 v68; // x28
  __int64 v69; // x24
  unsigned __int8 *v70; // x27
  unsigned __int8 *v71; // x25
  __int64 v72; // x8
  unsigned __int8 *v73; // x0
  __int64 v74; // x9
  __int64 v75; // x8
  unsigned __int8 *v76; // x26
  __int64 v77; // x25
  char *v78; // x0
  size_t v79; // x2
  char *v80; // x27
  unsigned int v81; // w8
  __int64 v82; // x0
  __int64 v83; // x1
  char v84; // w21
  __int64 v85; // x25
  unsigned __int8 *v87; // x21
  __int64 v88; // x8
  unsigned __int8 *v89; // x0
  __int64 v90; // x9
  __int64 v91; // x8
  int v92; // w10
  char v93; // w12
  __int64 v94; // [xsp+8h] [xbp-E8h]
  _QWORD v95[2]; // [xsp+20h] [xbp-D0h] BYREF
  __int64 v96; // [xsp+30h] [xbp-C0h] BYREF
  char v97; // [xsp+38h] [xbp-B8h]
  unsigned __int64 v98; // [xsp+40h] [xbp-B0h]
  char v99; // [xsp+48h] [xbp-A8h]
  _BYTE v100[160]; // [xsp+50h] [xbp-A0h] BYREF

  sub_167EC(v100, a1);
  v2 = *a1;
  v3 = a1[1];
  v4 = v3 - *a1;
  if ( v3 == *a1 )
  {
LABEL_14:
    v8 = a1[91];
    v9 = a1[90];
    LOWORD(v96) = 0;
    HIDWORD(v96) = 0;
    v97 = 0;
    v99 = 0;
    v98 = (v8 - v9) >> 3;
    v7 = sub_16998(a1, &v96);
    if ( v7 == 0 )
      goto LABEL_148;
    v10 = a1[90];
    v11 = v98;
    v12 = (a1[91] - v10) >> 3;
    if ( v98 >= v12 )
    {
      if ( v98 > v12 )
        sub_1405C(
          "%s:%d: %s",
          "out/llvm-project/libcxxabi/src/demangle/ItaniumDemangle.h",
          134,
          "shrinkToSize() can't expand!");
LABEL_35:
      a1[91] = &v10[8 * v11];
    }
    else
    {
      v13 = a1[83];
      if ( v13 == a1[84] )
        goto LABEL_147;
      if ( *(_QWORD *)v13 == 0 )
        goto LABEL_147;
      v14 = *(_QWORD *)&v10[8 * v98];
      v15 = **(_QWORD **)v13;
      v16 = *(_QWORD *)(v14 + 16);
      if ( v16 >= (*(_QWORD *)(*(_QWORD *)v13 + 8LL) - v15) >> 3 )
        goto LABEL_147;
      v17 = v98 + 1;
      do
      {
        *(_QWORD *)(v14 + 24) = *(_QWORD *)(v15 + 8 * v16);
        if ( v12 == v17 )
          goto LABEL_35;
        v18 = v17;
        if ( *(_QWORD *)v13 == 0 )
          break;
        v14 = *(_QWORD *)&v10[8 * v17];
        v15 = **(_QWORD **)v13;
        v16 = *(_QWORD *)(v14 + 16);
        ++v17;
      }
      while ( v16 < (*(_QWORD *)(*(_QWORD *)v13 + 8LL) - v15) >> 3 );
      if ( v18 < v12 )
        goto LABEL_147;
    }
    v29 = *a1;
    v28 = a1[1];
    if ( v28 == *a1 )
      goto LABEL_148;
    v30 = *v29 - 46;
    if ( v30 <= 0x31 && ((1LL << v30) & 0x2000000800001LL) != 0 )
      goto LABEL_148;
    if ( (unsigned __int64)(v28 - *a1) >= 0xD
      && (*(_QWORD *)v29 == 0x6C62616E65396155LL ? (v31 = *(_QWORD *)(v29 + 5) == 0x4966695F656C6261LL) : (v31 = false),
          v31) )
    {
      v48 = a1[2];
      v47 = a1[3];
      v49 = v29 + 13;
      v50 = a1 + 5;
      *a1 = v49;
      v51 = (v47 - v48) >> 3;
      while ( v49 == v28 || *v49 != 69 )
      {
        v55 = sub_170C0(a1);
        if ( v55 == 0 )
          goto LABEL_147;
        v53 = a1[3];
        if ( v53 == a1[4] )
        {
          v56 = a1[2];
          v57 = v55;
          v58 = v53 - v56;
          if ( v56 == (unsigned __int8 *)v50 )
          {
            v52 = (char *)malloc(2 * (v53 - v56));
            if ( v52 == nullptr )
              abort();
            if ( v53 != (unsigned __int8 *)v50 )
            {
              v59 = v53 - v56;
              v60 = v52;
              memmove(v52, v56, v59);
              v52 = v60;
            }
            a1[2] = (unsigned __int8 *)v52;
          }
          else
          {
            v52 = (char *)realloc(a1[2], 2 * (v53 - v56));
            a1[2] = (unsigned __int8 *)v52;
            if ( v52 == nullptr )
              abort();
          }
          v53 = (unsigned __int8 *)&v52[v58];
          v54 = (unsigned __int8 *)&v52[8 * (v58 >> 2)];
          v55 = v57;
          a1[3] = v53;
          a1[4] = v54;
        }
        a1[3] = v53 + 8;
        *(_QWORD *)v53 = v55;
        v49 = *a1;
        v28 = a1[1];
      }
      *a1 = v49 + 1;
      v95[0] = sub_17574(a1, v51);
      v95[1] = v61;
      v32 = sub_174D4(a1, v95);
      if ( (v96 & 1) != 0 )
        goto LABEL_119;
    }
    else
    {
      v32 = 0;
      if ( (v96 & 1) != 0 )
        goto LABEL_119;
    }
    if ( BYTE1(v96) == 1 )
    {
      v33 = sub_1544C(a1);
      if ( v33 == 0 )
        goto LABEL_147;
      goto LABEL_120;
    }
LABEL_119:
    v33 = 0;
LABEL_120:
    v63 = *a1;
    v62 = a1[1];
    if ( *a1 == v62 || *v63 != 118 )
    {
      v67 = a1 + 5;
      v94 = v33;
      v68 = a1[3] - a1[2];
      do
      {
        v69 = sub_1544C(a1);
        if ( v69 == 0 )
          goto LABEL_147;
        v70 = a1[3];
        if ( v68 == v70 - a1[2] && (v99 & 1) != 0 )
        {
          v71 = a1[614];
          v72 = *((_QWORD *)v71 + 1);
          if ( (unsigned __int64)(v72 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
          {
            v73 = (unsigned __int8 *)malloc(0x1000u);
            if ( v73 == nullptr )
              goto LABEL_155;
            v72 = 0;
            *(_QWORD *)v73 = v71;
            *((_QWORD *)v73 + 1) = 0;
            v71 = v73;
            a1[614] = v73;
          }
          v74 = v72 + 32;
          v75 = (__int64)&v71[v72];
          *((_QWORD *)v71 + 1) = v74;
          *(_QWORD *)(v75 + 16) = off_38C78;
          v75 += 16;
          LOWORD(v74) = *(_WORD *)(v75 + 9);
          *(_BYTE *)(v75 + 8) = 87;
          *(_QWORD *)(v75 + 16) = v69;
          v69 = v75;
          *(_WORD *)(v75 + 9) = v74 & 0xF000 | 0x540;
          v70 = a1[3];
        }
        if ( v70 == a1[4] )
        {
          v76 = a1[2];
          v77 = v70 - v76;
          if ( v76 == (unsigned __int8 *)v67 )
          {
            v78 = (char *)malloc(2 * (v70 - v76));
            if ( v78 == nullptr )
              abort();
            if ( v70 != (unsigned __int8 *)v67 )
            {
              v79 = v70 - v76;
              v80 = v78;
              memmove(v78, v76, v79);
              v78 = v80;
            }
            a1[2] = (unsigned __int8 *)v78;
          }
          else
          {
            v78 = (char *)realloc(a1[2], 2 * (v70 - v76));
            a1[2] = (unsigned __int8 *)v78;
            if ( v78 == nullptr )
              abort();
          }
          v70 = (unsigned __int8 *)&v78[v77];
          a1[3] = (unsigned __int8 *)&v78[v77];
          a1[4] = (unsigned __int8 *)&v78[8 * (v77 >> 2)];
        }
        a1[3] = v70 + 8;
        *(_QWORD *)v70 = v69;
        if ( a1[1] == *a1 )
          break;
        v81 = **a1 - 46;
      }
      while ( v81 > 0x31 || ((1LL << v81) & 0x2000800800001LL) == 0 );
      v82 = sub_17574(a1, v68 >> 3);
      v66 = *a1;
      v62 = a1[1];
      v64 = v82;
      v33 = v94;
      v65 = v83;
    }
    else
    {
      v64 = 0;
      v65 = 0;
      v66 = v63 + 1;
      *a1 = v66;
    }
    if ( v66 == v62 || *v66 != 81 )
    {
      v85 = 0;
    }
    else
    {
      v84 = *((_BYTE *)a1 + 778);
      *a1 = v66 + 1;
      *((_BYTE *)a1 + 778) = 1;
      v85 = sub_1A440(a1);
      *((_BYTE *)a1 + 778) = v84;
      if ( v85 == 0 )
        goto LABEL_147;
    }
    v87 = a1[614];
    v88 = *((_QWORD *)v87 + 1);
    if ( (unsigned __int64)(v88 - 4000) > 0xFFFFFFFFFFFFF00FLL )
    {
LABEL_153:
      v90 = v88 + 80;
      v91 = (__int64)&v87[v88];
      *((_QWORD *)v87 + 1) = v90;
      *(_QWORD *)(v91 + 16) = off_38CE8;
      v91 += 16;
      LOWORD(v90) = *(_WORD *)(v91 + 9);
      v92 = HIDWORD(v96);
      v93 = v97;
      *(_BYTE *)(v91 + 8) = 19;
      *(_QWORD *)(v91 + 16) = v33;
      *(_QWORD *)(v91 + 24) = v7;
      v7 = v91;
      *(_QWORD *)(v91 + 32) = v64;
      *(_QWORD *)(v91 + 40) = v65;
      *(_WORD *)(v91 + 9) = v90 & 0xF000 | 0x100;
      *(_QWORD *)(v91 + 48) = v32;
      *(_QWORD *)(v91 + 56) = v85;
      *(_DWORD *)(v91 + 64) = v92;
      *(_BYTE *)(v91 + 68) = v93;
      goto LABEL_148;
    }
    v89 = (unsigned __int8 *)malloc(0x1000u);
    if ( v89 != nullptr )
    {
      v88 = 0;
      *(_QWORD *)v89 = v87;
      *((_QWORD *)v89 + 1) = 0;
      v87 = v89;
      a1[614] = v89;
      goto LABEL_153;
    }
LABEL_155:
    sub_13E4C();
  }
  v5 = *v2;
  if ( v5 == 71 )
  {
    if ( v4 < 2 )
      goto LABEL_147;
    v19 = v2[1];
    if ( v19 == 73 )
    {
      *a1 = v2 + 2;
      v96 = 0;
      v7 = 0;
      if ( (sub_18224(a1, &v96) & 1) != 0 )
        goto LABEL_148;
      v41 = v96;
      if ( v96 == 0 )
        goto LABEL_148;
      v42 = a1[614];
      v43 = *((_QWORD *)v42 + 1);
      if ( (unsigned __int64)(v43 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v44 = (unsigned __int8 *)malloc(0x1000u);
        if ( v44 == nullptr )
          goto LABEL_155;
        v43 = 0;
        *(_QWORD *)v44 = v42;
        *((_QWORD *)v44 + 1) = 0;
        v42 = v44;
        a1[614] = v44;
      }
      *((_QWORD *)v42 + 1) = v43 + 48;
      *(_QWORD *)&v42[v43 + 16] = off_36AC8;
      v7 = (__int64)&v42[v43 + 16];
      v25 = *(_WORD *)&v42[v43 + 25];
      v26 = 23;
      *(_QWORD *)(v7 + 32) = v41;
      *(_BYTE *)(v7 + 8) = 21;
      v27 = "initializer for module ";
LABEL_78:
      *(_QWORD *)(v7 + 16) = v27;
      *(_QWORD *)(v7 + 24) = v26;
      *(_WORD *)(v7 + 9) = v25 & 0xF000 | 0x540;
      goto LABEL_148;
    }
    if ( v19 != 82 )
    {
      if ( v19 != 86 )
        goto LABEL_147;
      *a1 = v2 + 2;
      v20 = sub_16998(a1, 0);
      if ( v20 == 0 )
        goto LABEL_147;
      v21 = a1[614];
      v22 = *((_QWORD *)v21 + 1);
      if ( (unsigned __int64)(v22 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v23 = v20;
        v24 = (unsigned __int8 *)malloc(0x1000u);
        if ( v24 == nullptr )
          goto LABEL_155;
        v22 = 0;
        *(_QWORD *)v24 = v21;
        *((_QWORD *)v24 + 1) = 0;
        v21 = v24;
        a1[614] = v24;
        v20 = v23;
      }
      *((_QWORD *)v21 + 1) = v22 + 48;
      *(_QWORD *)&v21[v22 + 16] = off_36AC8;
      v7 = (__int64)&v21[v22 + 16];
      v25 = *(_WORD *)&v21[v22 + 25];
      v26 = 19;
      *(_QWORD *)(v7 + 32) = v20;
      *(_BYTE *)(v7 + 8) = 21;
      v27 = "guard variable for ";
      goto LABEL_78;
    }
    *a1 = v2 + 2;
    v96 = sub_16998(a1, 0);
    if ( v96 == 0 )
      goto LABEL_147;
    v36 = *a1;
    v37 = a1[1];
    if ( v37 == *a1 || (v38 = *v36) < 0x30 || v38 >= 0x3A && v38 - 65 > 0x19 )
    {
      v39 = 1;
      if ( v36 == v37 )
        goto LABEL_70;
    }
    else
    {
      do
      {
        v40 = *v36;
        if ( v40 < 0x30 || v40 >= 0x3A && v40 - 65 > 0x19 )
          break;
        *a1 = ++v36;
      }
      while ( v36 != v37 );
      v39 = 0;
      if ( v36 == v37 )
        goto LABEL_70;
    }
    if ( *v36 == 95 )
    {
      *a1 = v36 + 1;
      goto LABEL_71;
    }
LABEL_70:
    if ( v39 == 0 )
      goto LABEL_147;
LABEL_71:
    v7 = sub_18174(a1, &v96);
    goto LABEL_148;
  }
  if ( v5 != 84 )
    goto LABEL_14;
  if ( v4 >= 2 )
  {
    v6 = v2[1];
    if ( v6 <= 0x52 )
    {
      if ( v2[1] > 0x47u )
      {
        if ( v6 == 72 )
        {
          *a1 = v2 + 2;
          v96 = sub_16998(a1, 0);
          if ( v96 != 0 )
          {
            v7 = sub_17F68(a1, &v96);
            goto LABEL_148;
          }
          goto LABEL_147;
        }
        if ( v6 == 73 )
        {
          *a1 = v2 + 2;
          v96 = sub_1544C(a1);
          if ( v96 != 0 )
          {
            v7 = sub_17AC8(a1, &v96);
            goto LABEL_148;
          }
          goto LABEL_147;
        }
      }
      else
      {
        if ( v6 == 65 )
        {
          *a1 = v2 + 2;
          v96 = sub_170C0(a1);
          if ( v96 != 0 )
          {
            v7 = sub_178B8(a1, &v96);
            goto LABEL_148;
          }
          goto LABEL_147;
        }
        if ( v6 == 67 )
        {
          *a1 = v2 + 2;
          v96 = sub_1544C(a1);
          if ( v96 != 0 )
          {
            sub_1530C(a1, 1);
            if ( v34 != 0 )
            {
              v35 = *a1;
              if ( *a1 != a1[1] && *v35 == 95 )
              {
                *a1 = v35 + 1;
                v95[0] = sub_1544C(a1);
                if ( v95[0] != 0 )
                {
                  v7 = sub_17EC0(a1, v95, &v96);
                  goto LABEL_148;
                }
              }
            }
          }
          goto LABEL_147;
        }
      }
    }
    else if ( v2[1] <= 0x55u )
    {
      if ( v6 == 83 )
      {
        *a1 = v2 + 2;
        v96 = sub_1544C(a1);
        if ( v96 != 0 )
        {
          v7 = sub_17B78(a1, &v96);
          goto LABEL_148;
        }
        goto LABEL_147;
      }
      if ( v6 == 84 )
      {
        *a1 = v2 + 2;
        v96 = sub_1544C(a1);
        if ( v96 != 0 )
        {
          v7 = sub_17A18(a1, &v96);
          goto LABEL_148;
        }
        goto LABEL_147;
      }
    }
    else
    {
      switch ( v6 )
      {
        case 'V':
          *a1 = v2 + 2;
          v96 = sub_1544C(a1);
          if ( v96 != 0 )
          {
            v7 = sub_17968(a1, &v96);
            goto LABEL_148;
          }
          goto LABEL_147;
        case 'W':
          *a1 = v2 + 2;
          v96 = sub_16998(a1, 0);
          if ( v96 != 0 )
          {
            v7 = sub_15398((int)a1, "thread-local wrapper routine for ");
            goto LABEL_148;
          }
          goto LABEL_147;
        case 'c':
          *a1 = v2 + 2;
          if ( (sub_17C28(a1) & 1) == 0 && (sub_17C28(a1) & 1) == 0 )
          {
            v96 = sub_14858(a1);
            if ( v96 != 0 )
            {
              v7 = sub_17E10(a1, &v96);
              goto LABEL_148;
            }
          }
LABEL_147:
          v7 = 0;
          goto LABEL_148;
        default:
          break;
      }
    }
  }
  v45 = v2 + 1;
  *a1 = v45;
  v46 = v3 != v45 && *v45 == 118;
  if ( (sub_17C28(a1) & 1) != 0 )
    goto LABEL_147;
  v96 = sub_14858(a1);
  if ( v96 == 0 )
    goto LABEL_147;
  if ( v46 )
    v7 = sub_18018(a1, &v96);
  else
    v7 = sub_180C8(a1, &v96);
LABEL_148:
  sub_176D0(v100);
  return v7;
}


// Address: 0x152D4 | Function: sub_152D4
void __fastcall __noreturn sub_152D4(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        __int64 a9,
        __int64 a10,
        __int64 a11,
        __int64 a12,
        __int64 a13,
        __int64 a14,
        __int64 a15,
        __int64 a16,
        __int64 a17,
        __int64 a18,
        char a19)
{
  sub_176D0(&a19);
  sub_2E950(a1);
}


// Address: 0x1530C | Function: sub_1530C
unsigned __int8 *__fastcall sub_1530C(unsigned __int8 **a1, char a2)
{
  unsigned __int8 *result; // x0
  unsigned __int8 *v4; // x9
  unsigned __int8 *v5; // x10

  result = *a1;
  v4 = a1[1];
  v5 = result;
  if ( (a2 & 1) != 0 )
  {
    v5 = result;
    if ( result != v4 )
    {
      v5 = result;
      if ( *result == 110 )
      {
        v5 = result + 1;
        *a1 = result + 1;
      }
    }
  }
  if ( v4 == v5 || (unsigned int)*v5 - 58 < 0xFFFFFFF6 )
    return nullptr;
  do
  {
    if ( (unsigned int)*v5 - 58 < 0xFFFFFFF6 )
      break;
    *a1 = ++v5;
  }
  while ( v5 != v4 );
  return result;
}


// Address: 0x15398 | Function: sub_15398
char *__fastcall sub_15398(__int64 a1, char *s, __int64 *a3)
{
  _QWORD *v3; // x22
  __int64 v6; // x8
  _QWORD *v8; // x0
  char *v9; // x21
  size_t v10; // x0
  __int64 v11; // x10
  __int16 v12; // w9

  v3 = *(_QWORD **)(a1 + 4912);
  v6 = v3[1];
  if ( (unsigned __int64)(v6 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v8 = malloc(0x1000u);
    if ( v8 == nullptr )
      sub_13E4C();
    v6 = 0;
    *v8 = v3;
    v8[1] = 0;
    v3 = v8;
    *(_QWORD *)(a1 + 4912) = v8;
  }
  v9 = (char *)v3 + v6;
  v3[1] = v6 + 48;
  v10 = strlen(s);
  v11 = *a3;
  *((_QWORD *)v9 + 2) = off_36AC8;
  v9 += 16;
  v12 = *(_WORD *)(v9 + 9);
  *((_QWORD *)v9 + 2) = s;
  *((_QWORD *)v9 + 3) = v10;
  v9[8] = 21;
  *(_WORD *)(v9 + 9) = v12 & 0xF000 | 0x540;
  *((_QWORD *)v9 + 4) = v11;
  return v9;
}


// Address: 0x1544C | Function: sub_1544C
__int64 __fastcall sub_1544C(__int64 a1, size_t a2)
{
  unsigned __int8 *v2; // x8
  unsigned __int8 *v3; // x10
  unsigned __int64 v5; // x9
  int v6; // w11
  unsigned __int64 v7; // x10
  int v8; // w11
  unsigned __int64 v9; // x11
  int v10; // w11
  unsigned __int64 v11; // x10
  unsigned int v12; // w8
  __int64 result; // x0
  _QWORD *v14; // x20
  __int64 v15; // x8
  _QWORD *v16; // x0
  __int16 v17; // w8
  const char *v18; // x9
  __int64 v19; // x8
  _QWORD *v20; // x20
  __int64 v21; // x8
  _QWORD *v22; // x0
  __int16 v23; // w8
  _QWORD *v24; // x20
  __int64 v25; // x8
  _QWORD *v26; // x0
  __int16 v27; // w8
  _QWORD *v28; // x20
  __int64 v29; // x8
  _QWORD *v30; // x0
  __int16 v31; // w8
  _QWORD *v32; // x20
  __int64 v33; // x8
  _QWORD *v34; // x0
  __int16 v35; // w8
  _QWORD *v36; // x20
  __int64 v37; // x8
  _QWORD *v38; // x0
  __int16 v39; // w8
  unsigned int v40; // w8
  _QWORD *v41; // x20
  __int64 v42; // x8
  _QWORD *v43; // x0
  _QWORD *v44; // x20
  __int64 v45; // x8
  _QWORD *v46; // x0
  __int16 v47; // w8
  _QWORD *v48; // x20
  __int64 v49; // x8
  _QWORD *v50; // x0
  __int16 v51; // w8
  _QWORD *v52; // x20
  __int64 v53; // x8
  _QWORD *v54; // x0
  __int16 v55; // w8
  _BYTE *v56; // x9
  unsigned __int8 *v57; // x8
  _QWORD *v58; // x20
  __int64 v59; // x8
  _QWORD *v60; // x0
  _QWORD *v61; // x20
  __int64 v62; // x8
  _QWORD *v63; // x0
  __int16 v64; // w8
  _QWORD *v65; // x20
  __int64 v66; // x8
  _QWORD *v67; // x0
  _QWORD *v68; // x20
  __int64 v69; // x8
  _QWORD *v70; // x0
  __int64 v71; // x17
  unsigned __int64 v72; // x14
  unsigned __int64 v73; // x12
  __int64 v74; // x11
  unsigned __int8 *v75; // x15
  __int64 v76; // x13
  unsigned __int8 *v77; // x9
  unsigned __int8 *v78; // x8
  __int64 *v79; // x22
  __int64 *v80; // x21
  __int64 v81; // x23
  __int64 v82; // x20
  char *v83; // x0
  size_t v84; // x2
  char *v85; // x22
  char *v86; // x8
  int v87; // w9
  _QWORD *v88; // x20
  __int64 v89; // x8
  _QWORD *v90; // x0
  _QWORD *v91; // x20
  __int64 v92; // x8
  _QWORD *v93; // x0
  __int16 v94; // w8
  _QWORD *v95; // x20
  __int64 v96; // x8
  _QWORD *v97; // x0
  __int16 v98; // w8
  _QWORD *v99; // x20
  __int64 v100; // x8
  _QWORD *v101; // x0
  __int16 v102; // w8
  _QWORD *v103; // x20
  __int64 v104; // x8
  _QWORD *v105; // x0
  __int16 v106; // w8
  _QWORD *v107; // x20
  __int64 v108; // x8
  _QWORD *v109; // x0
  _QWORD *v110; // x20
  __int64 v111; // x8
  _QWORD *v112; // x0
  unsigned __int8 *v113; // x8
  unsigned __int64 v114; // x1
  __int64 v115; // x0
  unsigned __int8 *v116; // x8
  unsigned __int8 *v117; // x9
  bool v118; // zf
  unsigned __int8 *v119; // x8
  const char *v120; // x9
  __int64 v121; // x10
  unsigned __int8 *v122; // x8
  unsigned __int64 v123; // x1
  __int64 v124; // x0
  unsigned __int8 *v125; // x8
  unsigned __int8 *v126; // x9
  char *v127; // x1
  char *v128; // x1
  unsigned __int64 v129; // x1
  unsigned __int8 *v130; // x8
  __int64 v131; // [xsp+8h] [xbp-18h] BYREF
  unsigned __int8 *v132; // [xsp+10h] [xbp-10h] BYREF
  unsigned __int64 v133; // [xsp+18h] [xbp-8h]
  __int64 v134; // [xsp+38h] [xbp+18h] BYREF

  v2 = *(unsigned __int8 **)a1;
  v3 = *(unsigned __int8 **)(a1 + 8);
  v131 = 0;
  v5 = v3 - v2;
  if ( v3 == v2 )
  {
LABEL_116:
    result = sub_29AB4(a1);
LABEL_117:
    if ( result == 0 )
      return result;
    goto LABEL_118;
  }
  v6 = *v2;
  switch ( *v2 )
  {
    case 'A':
      v56 = v2 + 1;
      v134 = 0;
      *(_QWORD *)a1 = v2 + 1;
      if ( v3 == v2 + 1 )
        goto LABEL_179;
      if ( (unsigned int)(unsigned __int8)*v56 - 58 >= 0xFFFFFFF6 )
      {
        v132 = sub_1530C((unsigned __int8 **)a1, 0);
        v133 = v114;
        v115 = sub_19F90(a1, &v132);
        v116 = *(unsigned __int8 **)a1;
        v117 = *(unsigned __int8 **)(a1 + 8);
        v134 = v115;
        if ( v116 != v117 && *v116 == 95 )
        {
          v57 = v116 + 1;
LABEL_186:
          *(_QWORD *)a1 = v57;
          result = sub_1544C(a1);
          v132 = (unsigned __int8 *)result;
          if ( result == 0 )
            goto LABEL_117;
          result = sub_2B5B8(a1, &v132, &v134);
          if ( result == 0 )
            return result;
LABEL_118:
          v79 = *(__int64 **)(a1 + 304);
          if ( v79 == *(__int64 **)(a1 + 312) )
          {
            v80 = *(__int64 **)(a1 + 296);
            v81 = result;
            v82 = (char *)v79 - (char *)v80;
            if ( v80 == (__int64 *)(a1 + 320) )
            {
              v83 = (char *)malloc(2 * ((char *)v79 - (char *)v80));
              if ( v83 == nullptr )
                abort();
              if ( v79 != v80 )
              {
                v84 = (char *)v79 - (char *)v80;
                v85 = v83;
                memmove(v83, v80, v84);
                v83 = v85;
              }
              *(_QWORD *)(a1 + 296) = v83;
            }
            else
            {
              v83 = (char *)realloc(*(void **)(a1 + 296), 2 * ((char *)v79 - (char *)v80));
              *(_QWORD *)(a1 + 296) = v83;
              if ( v83 == nullptr )
                abort();
            }
            v79 = (__int64 *)&v83[v82];
            v86 = &v83[8 * (v82 >> 2)];
            result = v81;
            *(_QWORD *)(a1 + 312) = v86;
          }
          *(_QWORD *)(a1 + 304) = v79 + 1;
          *v79 = result;
          return result;
        }
      }
      else
      {
        if ( *v56 == 95 )
        {
          v57 = v2 + 2;
          goto LABEL_186;
        }
LABEL_179:
        result = sub_1A440(a1);
        if ( result == 0 )
          goto LABEL_117;
        v113 = *(unsigned __int8 **)a1;
        if ( *(_QWORD *)a1 != *(_QWORD *)(a1 + 8) && *v113 == 95 )
        {
          v57 = v113 + 1;
          v134 = result;
          goto LABEL_186;
        }
      }
      return 0;
    case 'C':
      *(_QWORD *)a1 = v2 + 1;
      result = sub_1544C(a1);
      v132 = (unsigned __int8 *)result;
      if ( result == 0 )
        return result;
      result = sub_29D68(a1, &v132);
      goto LABEL_118;
    case 'D':
      if ( v5 < 2 )
        return 0;
      v87 = v2[1];
      result = 0;
      switch ( v2[1] )
      {
        case 'B':
        case 'U':
          v122 = v2 + 2;
          *(_QWORD *)a1 = v122;
          LOBYTE(v134) = v87 == 66;
          if ( v3 == v122 || (unsigned int)*v122 - 58 < 0xFFFFFFF6 )
          {
            result = sub_1A440(a1);
            v132 = (unsigned __int8 *)result;
            if ( result == 0 )
              return result;
          }
          else
          {
            v132 = sub_1530C((unsigned __int8 **)a1, 0);
            v133 = v129;
            v132 = (unsigned __int8 *)sub_19F90(a1, &v132);
          }
          v130 = *(unsigned __int8 **)a1;
          if ( *(_QWORD *)a1 == *(_QWORD *)(a1 + 8) || *v130 != 95 )
            return 0;
          *(_QWORD *)a1 = v130 + 1;
          result = sub_296A8(a1, &v132, &v134);
          break;
        case 'F':
          *(_QWORD *)a1 = v2 + 2;
          v132 = sub_1530C((unsigned __int8 **)a1, 0);
          v133 = v123;
          v124 = sub_19F90(a1, &v132);
          v125 = *(unsigned __int8 **)a1;
          v126 = *(unsigned __int8 **)(a1 + 8);
          v132 = (unsigned __int8 *)v124;
          if ( v125 == v126 || *v125 != 95 )
            return 0;
          *(_QWORD *)a1 = v125 + 1;
          return sub_29608(a1, &v132);
        case 'K':
        case 'k':
          v118 = v87 == 107;
          v119 = v2 + 2;
          if ( v87 == 107 )
            v120 = " auto";
          else
            v120 = " decltype(auto)";
          v121 = 15;
          if ( v118 )
            v121 = 5;
          v132 = (unsigned __int8 *)v120;
          v133 = v121;
          *(_QWORD *)a1 = v119;
          result = sub_16998(a1, 0);
          v134 = result;
          if ( result != 0 )
            return sub_29754(a1, &v134, &v132);
          return result;
        case 'O':
        case 'o':
        case 'w':
        case 'x':
          goto LABEL_130;
        case 'T':
        case 't':
          result = sub_19618(a1);
          if ( result == 0 )
            return result;
          goto LABEL_118;
        case 'a':
          v127 = "auto";
          goto LABEL_221;
        case 'c':
          v128 = "decltype(auto)";
          goto LABEL_225;
        case 'd':
        case 'f':
          *(_QWORD *)a1 = v2 + 2;
          JUMPOUT(0x29358);
        case 'e':
          *(_QWORD *)a1 = v2 + 2;
          JUMPOUT(0x294B0);
        case 'h':
          v127 = "half";
LABEL_221:
          *(_QWORD *)a1 = v2 + 2;
          return sub_1A108(a1, v127);
        case 'i':
        case 's':
          *(_QWORD *)a1 = v2 + 2;
          JUMPOUT(0x29404);
        case 'n':
          v128 = "std::nullptr_t";
LABEL_225:
          *(_QWORD *)a1 = v2 + 2;
          return sub_27A60(a1, v128);
        case 'p':
          *(_QWORD *)a1 = v2 + 2;
          result = sub_1544C(a1);
          v132 = (unsigned __int8 *)result;
          if ( result == 0 )
            return result;
          result = sub_1D8E4(a1, &v132);
          goto LABEL_118;
        case 'u':
          *(_QWORD *)a1 = v2 + 2;
          JUMPOUT(0x20B74);
        case 'v':
          result = sub_29800(a1);
          if ( result == 0 )
            return result;
          goto LABEL_118;
        default:
          return result;
      }
      return result;
    case 'F':
      goto LABEL_130;
    case 'G':
      *(_QWORD *)a1 = v2 + 1;
      result = sub_1544C(a1);
      v132 = (unsigned __int8 *)result;
      if ( result == 0 )
        return result;
      result = sub_29E18(a1, &v132);
      goto LABEL_118;
    case 'K':
    case 'V':
    case 'r':
      v7 = v6 == 114;
      if ( v5 > v7 )
      {
        v8 = v6 == 114 ? 2 : 1;
        if ( v2[v7] == 86 )
          LODWORD(v7) = v8;
      }
      v9 = (unsigned int)v7;
      if ( v5 > (unsigned int)v7 )
      {
        if ( v2[(unsigned int)v7] == 75 )
          v9 = (unsigned int)(v7 + 1);
        else
          v9 = (unsigned int)v7;
        LODWORD(v7) = v9;
      }
      if ( v5 <= v9 )
        goto LABEL_20;
      v10 = v2[v9];
      if ( v10 != 70 )
      {
        if ( v10 != 68 )
          goto LABEL_20;
        v11 = (unsigned int)v7 + 1LL;
        if ( v5 <= v11 )
          goto LABEL_20;
        v12 = v2[v11] - 79;
        if ( v12 > 0x29 || ((1LL << v12) & 0x30100000001LL) == 0 )
          goto LABEL_20;
      }
LABEL_130:
      result = sub_289D8(a1);
      if ( result == 0 )
        return result;
      goto LABEL_118;
    case 'M':
      *(_QWORD *)a1 = v2 + 1;
      result = sub_1544C(a1);
      v132 = (unsigned __int8 *)result;
      if ( result == 0 )
        goto LABEL_117;
      result = sub_1544C(a1);
      v134 = result;
      if ( result == 0 )
        goto LABEL_117;
      result = sub_2B838(a1, &v132, &v134);
      if ( result == 0 )
        return result;
      goto LABEL_118;
    case 'O':
      *(_QWORD *)a1 = v2 + 1;
      result = sub_1544C(a1);
      v132 = (unsigned __int8 *)result;
      if ( result == 0 )
        return result;
      LODWORD(v134) = 1;
      goto LABEL_153;
    case 'P':
      *(_QWORD *)a1 = v2 + 1;
      result = sub_1544C(a1);
      v132 = (unsigned __int8 *)result;
      if ( result == 0 )
        return result;
      result = sub_29C00(a1, &v132);
      goto LABEL_118;
    case 'R':
      *(_QWORD *)a1 = v2 + 1;
      result = sub_1544C(a1);
      v132 = (unsigned __int8 *)result;
      if ( result == 0 )
        return result;
      LODWORD(v134) = 0;
LABEL_153:
      result = sub_29CAC(a1, &v132, &v134);
      goto LABEL_118;
    case 'S':
      if ( v5 >= 2 && v2[1] == 116 )
        goto LABEL_116;
      LOBYTE(v134) = 0;
      result = sub_18B58(a1, 0, &v134);
      v131 = result;
      if ( result == 0 )
        return 0;
      if ( *(_QWORD *)(a1 + 8) != *(_QWORD *)a1 )
      {
        if ( **(_BYTE **)a1 != 73 )
          goto LABEL_177;
        if ( (v134 & 1) != 0 )
        {
          if ( (*(_BYTE *)(a1 + 776) & 1) == 0 )
          {
LABEL_177:
            if ( (v134 & 1) == 0 )
              goto LABEL_118;
            return result;
          }
        }
        else
        {
          sub_173FC(a1 + 296, (size_t)&v131);
        }
        v132 = (unsigned __int8 *)sub_18CC8(a1, 0);
        if ( v132 == nullptr )
          return 0;
LABEL_194:
        result = sub_191A4(a1, &v131, &v132);
        goto LABEL_118;
      }
      if ( (v134 & 1) == 0 )
        goto LABEL_118;
      return result;
    case 'T':
      if ( v5 >= 2 )
      {
        v40 = v2[1] - 101;
        if ( v40 <= 0x10 && ((1 << v40) & 0x14001) != 0 )
          goto LABEL_116;
      }
      result = sub_1924C(a1, a2);
      v131 = result;
      if ( result == 0 )
        return result;
      if ( *(_BYTE *)(a1 + 776) != 1 || *(_QWORD *)(a1 + 8) == *(_QWORD *)a1 || **(_BYTE **)a1 != 73 )
        goto LABEL_118;
      result = sub_18CC8(a1, 0);
      v132 = (unsigned __int8 *)result;
      if ( result == 0 )
        return result;
      goto LABEL_194;
    case 'U':
LABEL_20:
      result = sub_28F80(a1);
      if ( result == 0 )
        return result;
      goto LABEL_118;
    case 'a':
      v107 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v108 = v107[1];
      if ( (unsigned __int64)(v108 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v109 = malloc(0x1000u);
        if ( v109 == nullptr )
          goto LABEL_231;
        v108 = 0;
        *v109 = v107;
        v109[1] = 0;
        v107 = v109;
        *(_QWORD *)(a1 + 4912) = v109;
      }
      v107[1] = v108 + 32;
      *(_QWORD *)((char *)v107 + v108 + 16) = off_36BB8;
      result = (__int64)v107 + v108 + 16;
      v94 = *(_WORD *)((char *)v107 + v108 + 25);
      *(_BYTE *)(result + 8) = 8;
      v18 = "signed char";
      goto LABEL_164;
    case 'b':
      v41 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v42 = v41[1];
      if ( (unsigned __int64)(v42 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v43 = malloc(0x1000u);
        if ( v43 == nullptr )
          goto LABEL_231;
        v42 = 0;
        *v43 = v41;
        v43[1] = 0;
        v41 = v43;
        *(_QWORD *)(a1 + 4912) = v43;
      }
      v41[1] = v42 + 32;
      *(_QWORD *)((char *)v41 + v42 + 16) = off_36BB8;
      result = (__int64)v41 + v42 + 16;
      v23 = *(_WORD *)((char *)v41 + v42 + 25);
      *(_BYTE *)(result + 8) = 8;
      v18 = "bool";
      goto LABEL_169;
    case 'c':
      v110 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v111 = v110[1];
      if ( (unsigned __int64)(v111 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v112 = malloc(0x1000u);
        if ( v112 == nullptr )
          goto LABEL_231;
        v111 = 0;
        *v112 = v110;
        v112[1] = 0;
        v110 = v112;
        *(_QWORD *)(a1 + 4912) = v112;
      }
      v110[1] = v111 + 32;
      *(_QWORD *)((char *)v110 + v111 + 16) = off_36BB8;
      result = (__int64)v110 + v111 + 16;
      v23 = *(_WORD *)((char *)v110 + v111 + 25);
      *(_BYTE *)(result + 8) = 8;
      v18 = "char";
      goto LABEL_169;
    case 'd':
      v48 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v49 = v48[1];
      if ( (unsigned __int64)(v49 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v50 = malloc(0x1000u);
        if ( v50 == nullptr )
          goto LABEL_231;
        v49 = 0;
        *v50 = v48;
        v50[1] = 0;
        v48 = v50;
        *(_QWORD *)(a1 + 4912) = v50;
      }
      v48[1] = v49 + 32;
      *(_QWORD *)((char *)v48 + v49 + 16) = off_36BB8;
      result = (__int64)v48 + v49 + 16;
      v51 = *(_WORD *)((_BYTE *)v48 + v49 + 25) & 0xF000;
      *(_BYTE *)(result + 8) = 8;
      v18 = "double";
      *(_WORD *)(result + 9) = v51 | 0x540;
      v19 = 6;
      goto LABEL_170;
    case 'e':
      v91 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v92 = v91[1];
      if ( (unsigned __int64)(v92 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v93 = malloc(0x1000u);
        if ( v93 == nullptr )
          goto LABEL_231;
        v92 = 0;
        *v93 = v91;
        v93[1] = 0;
        v91 = v93;
        *(_QWORD *)(a1 + 4912) = v93;
      }
      v91[1] = v92 + 32;
      *(_QWORD *)((char *)v91 + v92 + 16) = off_36BB8;
      result = (__int64)v91 + v92 + 16;
      v94 = *(_WORD *)((char *)v91 + v92 + 25);
      *(_BYTE *)(result + 8) = 8;
      v18 = "long double";
LABEL_164:
      *(_WORD *)(result + 9) = v94 & 0xF000 | 0x540;
      v19 = 11;
      goto LABEL_170;
    case 'f':
      v36 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v37 = v36[1];
      if ( (unsigned __int64)(v37 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v38 = malloc(0x1000u);
        if ( v38 == nullptr )
          goto LABEL_231;
        v37 = 0;
        *v38 = v36;
        v38[1] = 0;
        v36 = v38;
        *(_QWORD *)(a1 + 4912) = v38;
      }
      v36[1] = v37 + 32;
      *(_QWORD *)((char *)v36 + v37 + 16) = off_36BB8;
      result = (__int64)v36 + v37 + 16;
      v39 = *(_WORD *)((char *)v36 + v37 + 25);
      *(_BYTE *)(result + 8) = 8;
      v18 = "float";
      goto LABEL_100;
    case 'g':
      v52 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v53 = v52[1];
      if ( (unsigned __int64)(v53 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v54 = malloc(0x1000u);
        if ( v54 == nullptr )
          goto LABEL_231;
        v53 = 0;
        *v54 = v52;
        v54[1] = 0;
        v52 = v54;
        *(_QWORD *)(a1 + 4912) = v54;
      }
      v52[1] = v53 + 32;
      *(_QWORD *)((char *)v52 + v53 + 16) = off_36BB8;
      result = (__int64)v52 + v53 + 16;
      v55 = *(_WORD *)((_BYTE *)v52 + v53 + 25) & 0xF000;
      *(_BYTE *)(result + 8) = 8;
      v18 = "__float128";
      *(_WORD *)(result + 9) = v55 | 0x540;
      v19 = 10;
      goto LABEL_170;
    case 'h':
      v88 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v89 = v88[1];
      if ( (unsigned __int64)(v89 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v90 = malloc(0x1000u);
        if ( v90 == nullptr )
          goto LABEL_231;
        v89 = 0;
        *v90 = v88;
        v90[1] = 0;
        v88 = v90;
        *(_QWORD *)(a1 + 4912) = v90;
      }
      v88[1] = v89 + 32;
      *(_QWORD *)((char *)v88 + v89 + 16) = off_36BB8;
      result = (__int64)v88 + v89 + 16;
      v35 = *(_WORD *)((char *)v88 + v89 + 25);
      *(_BYTE *)(result + 8) = 8;
      v18 = "unsigned char";
      goto LABEL_136;
    case 'i':
      v65 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v66 = v65[1];
      if ( (unsigned __int64)(v66 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v67 = malloc(0x1000u);
        if ( v67 == nullptr )
          goto LABEL_231;
        v66 = 0;
        *v67 = v65;
        v67[1] = 0;
        v65 = v67;
        *(_QWORD *)(a1 + 4912) = v67;
      }
      v65[1] = v66 + 32;
      *(_QWORD *)((char *)v65 + v66 + 16) = off_36BB8;
      result = (__int64)v65 + v66 + 16;
      v27 = *(_WORD *)((char *)v65 + v66 + 25);
      *(_BYTE *)(result + 8) = 8;
      v18 = "int";
      goto LABEL_87;
    case 'j':
      v95 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v96 = v95[1];
      if ( (unsigned __int64)(v96 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v97 = malloc(0x1000u);
        if ( v97 == nullptr )
          goto LABEL_231;
        v96 = 0;
        *v97 = v95;
        v97[1] = 0;
        v95 = v97;
        *(_QWORD *)(a1 + 4912) = v97;
      }
      v95[1] = v96 + 32;
      *(_QWORD *)((char *)v95 + v96 + 16) = off_36BB8;
      result = (__int64)v95 + v96 + 16;
      v98 = *(_WORD *)((_BYTE *)v95 + v96 + 25) & 0xF000;
      *(_BYTE *)(result + 8) = 8;
      v18 = "unsigned int";
      *(_WORD *)(result + 9) = v98 | 0x540;
      v19 = 12;
      goto LABEL_170;
    case 'l':
      v58 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v59 = v58[1];
      if ( (unsigned __int64)(v59 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v60 = malloc(0x1000u);
        if ( v60 == nullptr )
          goto LABEL_231;
        v59 = 0;
        *v60 = v58;
        v60[1] = 0;
        v58 = v60;
        *(_QWORD *)(a1 + 4912) = v60;
      }
      v58[1] = v59 + 32;
      *(_QWORD *)((char *)v58 + v59 + 16) = off_36BB8;
      result = (__int64)v58 + v59 + 16;
      v23 = *(_WORD *)((char *)v58 + v59 + 25);
      *(_BYTE *)(result + 8) = 8;
      v18 = "long";
      goto LABEL_169;
    case 'm':
      v32 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v33 = v32[1];
      if ( (unsigned __int64)(v33 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v34 = malloc(0x1000u);
        if ( v34 == nullptr )
          goto LABEL_231;
        v33 = 0;
        *v34 = v32;
        v34[1] = 0;
        v32 = v34;
        *(_QWORD *)(a1 + 4912) = v34;
      }
      v32[1] = v33 + 32;
      *(_QWORD *)((char *)v32 + v33 + 16) = off_36BB8;
      result = (__int64)v32 + v33 + 16;
      v35 = *(_WORD *)((char *)v32 + v33 + 25);
      *(_BYTE *)(result + 8) = 8;
      v18 = "unsigned long";
LABEL_136:
      *(_WORD *)(result + 9) = v35 & 0xF000 | 0x540;
      v19 = 13;
      goto LABEL_170;
    case 'n':
      v28 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v29 = v28[1];
      if ( (unsigned __int64)(v29 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v30 = malloc(0x1000u);
        if ( v30 == nullptr )
          goto LABEL_231;
        v29 = 0;
        *v30 = v28;
        v30[1] = 0;
        v28 = v30;
        *(_QWORD *)(a1 + 4912) = v30;
      }
      v28[1] = v29 + 32;
      *(_QWORD *)((char *)v28 + v29 + 16) = off_36BB8;
      result = (__int64)v28 + v29 + 16;
      v31 = *(_WORD *)((_BYTE *)v28 + v29 + 25) & 0xF000;
      *(_BYTE *)(result + 8) = 8;
      *(_WORD *)(result + 9) = v31 | 0x540;
      *(_QWORD *)(result + 16) = "__int128";
      *(_QWORD *)(result + 24) = 8;
      return result;
    case 'o':
      v61 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v62 = v61[1];
      if ( (unsigned __int64)(v62 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v63 = malloc(0x1000u);
        if ( v63 == nullptr )
          goto LABEL_231;
        v62 = 0;
        *v63 = v61;
        v63[1] = 0;
        v61 = v63;
        *(_QWORD *)(a1 + 4912) = v63;
      }
      v61[1] = v62 + 32;
      *(_QWORD *)((char *)v61 + v62 + 16) = off_36BB8;
      result = (__int64)v61 + v62 + 16;
      v64 = *(_WORD *)((_BYTE *)v61 + v62 + 25) & 0xF000;
      *(_BYTE *)(result + 8) = 8;
      v18 = "unsigned __int128";
      *(_WORD *)(result + 9) = v64 | 0x540;
      v19 = 17;
      goto LABEL_170;
    case 's':
      v68 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v69 = v68[1];
      if ( (unsigned __int64)(v69 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v70 = malloc(0x1000u);
        if ( v70 == nullptr )
          goto LABEL_231;
        v69 = 0;
        *v70 = v68;
        v70[1] = 0;
        v68 = v70;
        *(_QWORD *)(a1 + 4912) = v70;
      }
      v68[1] = v69 + 32;
      *(_QWORD *)((char *)v68 + v69 + 16) = off_36BB8;
      result = (__int64)v68 + v69 + 16;
      v39 = *(_WORD *)((char *)v68 + v69 + 25);
      *(_BYTE *)(result + 8) = 8;
      v18 = "short";
LABEL_100:
      *(_WORD *)(result + 9) = v39 & 0xF000 | 0x540;
      v19 = 5;
      goto LABEL_170;
    case 't':
      v99 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v100 = v99[1];
      if ( (unsigned __int64)(v100 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v101 = malloc(0x1000u);
        if ( v101 == nullptr )
          goto LABEL_231;
        v100 = 0;
        *v101 = v99;
        v101[1] = 0;
        v99 = v101;
        *(_QWORD *)(a1 + 4912) = v101;
      }
      v99[1] = v100 + 32;
      *(_QWORD *)((char *)v99 + v100 + 16) = off_36BB8;
      result = (__int64)v99 + v100 + 16;
      v102 = *(_WORD *)((_BYTE *)v99 + v100 + 25) & 0xF000;
      *(_BYTE *)(result + 8) = 8;
      v18 = "unsigned short";
      *(_WORD *)(result + 9) = v102 | 0x540;
      v19 = 14;
      goto LABEL_170;
    case 'u':
      *(_QWORD *)a1 = v2 + 1;
      if ( v3 == v2 + 1 || (unsigned int)v2[1] - 58 < 0xFFFFFFF6 )
        return 0;
      v71 = 0;
      v72 = 0;
      do
      {
        v73 = v72;
        v74 = v71;
        v75 = &v2[v71 + 2];
        *(_QWORD *)a1 = v75;
        v76 = v2[v71 + 1];
        v72 = v76 + 10 * v72 - 48;
        if ( v75 == v3 )
          break;
        ++v71;
      }
      while ( (unsigned int)*v75 - 48 <= 9 );
      if ( v5 - v74 - 2 < v72 )
        return 0;
      v132 = v75;
      v133 = v72;
      v77 = &v2[10 * v73 - 46 + v74 + v76];
      *(_QWORD *)a1 = v77;
      if ( v72 == 0 )
        return 0;
      if ( v77 == v3 || *v77 != 73 )
      {
        result = sub_188C8(a1, &v132);
        goto LABEL_118;
      }
      *(_QWORD *)a1 = &v2[10 * v73 - 45 + v74 + v76];
      v134 = sub_1544C(a1);
      if ( v134 != 0 )
      {
        v78 = *(unsigned __int8 **)a1;
        if ( *(_QWORD *)a1 != *(_QWORD *)(a1 + 8) && *v78 == 69 )
        {
          *(_QWORD *)a1 = v78 + 1;
          result = sub_2955C(a1, &v132, &v134);
          goto LABEL_118;
        }
      }
      return 0;
    case 'v':
      v20 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v21 = v20[1];
      if ( (unsigned __int64)(v21 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v22 = malloc(0x1000u);
        if ( v22 == nullptr )
          goto LABEL_231;
        v21 = 0;
        *v22 = v20;
        v22[1] = 0;
        v20 = v22;
        *(_QWORD *)(a1 + 4912) = v22;
      }
      v20[1] = v21 + 32;
      *(_QWORD *)((char *)v20 + v21 + 16) = off_36BB8;
      result = (__int64)v20 + v21 + 16;
      v23 = *(_WORD *)((char *)v20 + v21 + 25);
      *(_BYTE *)(result + 8) = 8;
      v18 = "void";
LABEL_169:
      *(_WORD *)(result + 9) = v23 & 0xF000 | 0x540;
      v19 = 4;
      goto LABEL_170;
    case 'w':
      v44 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v45 = v44[1];
      if ( (unsigned __int64)(v45 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v46 = malloc(0x1000u);
        if ( v46 == nullptr )
          goto LABEL_231;
        v45 = 0;
        *v46 = v44;
        v46[1] = 0;
        v44 = v46;
        *(_QWORD *)(a1 + 4912) = v46;
      }
      v44[1] = v45 + 32;
      *(_QWORD *)((char *)v44 + v45 + 16) = off_36BB8;
      result = (__int64)v44 + v45 + 16;
      v47 = *(_WORD *)((_BYTE *)v44 + v45 + 25) & 0xF000;
      *(_BYTE *)(result + 8) = 8;
      v18 = "wchar_t";
      *(_WORD *)(result + 9) = v47 | 0x540;
      v19 = 7;
      goto LABEL_170;
    case 'x':
      v103 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v104 = v103[1];
      if ( (unsigned __int64)(v104 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v105 = malloc(0x1000u);
        if ( v105 == nullptr )
          goto LABEL_231;
        v104 = 0;
        *v105 = v103;
        v105[1] = 0;
        v103 = v105;
        *(_QWORD *)(a1 + 4912) = v105;
      }
      v103[1] = v104 + 32;
      *(_QWORD *)((char *)v103 + v104 + 16) = off_36BB8;
      result = (__int64)v103 + v104 + 16;
      v106 = *(_WORD *)((_BYTE *)v103 + v104 + 25) & 0xF000;
      *(_BYTE *)(result + 8) = 8;
      v18 = "long long";
      *(_WORD *)(result + 9) = v106 | 0x540;
      v19 = 9;
      goto LABEL_170;
    case 'y':
      v14 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v15 = v14[1];
      if ( (unsigned __int64)(v15 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v16 = malloc(0x1000u);
        if ( v16 == nullptr )
          goto LABEL_231;
        v15 = 0;
        *v16 = v14;
        v16[1] = 0;
        v14 = v16;
        *(_QWORD *)(a1 + 4912) = v16;
      }
      v14[1] = v15 + 32;
      *(_QWORD *)((char *)v14 + v15 + 16) = off_36BB8;
      result = (__int64)v14 + v15 + 16;
      v17 = *(_WORD *)((_BYTE *)v14 + v15 + 25) & 0xF000;
      *(_BYTE *)(result + 8) = 8;
      v18 = "unsigned long long";
      *(_WORD *)(result + 9) = v17 | 0x540;
      v19 = 18;
      goto LABEL_170;
    case 'z':
      v24 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v2 + 1;
      v25 = v24[1];
      if ( (unsigned __int64)(v25 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v26 = malloc(0x1000u);
        if ( v26 == nullptr )
LABEL_231:
          sub_13E4C();
        v25 = 0;
        *v26 = v24;
        v26[1] = 0;
        v24 = v26;
        *(_QWORD *)(a1 + 4912) = v26;
      }
      v24[1] = v25 + 32;
      *(_QWORD *)((char *)v24 + v25 + 16) = off_36BB8;
      result = (__int64)v24 + v25 + 16;
      v27 = *(_WORD *)((char *)v24 + v25 + 25);
      *(_BYTE *)(result + 8) = 8;
      v18 = "...";
LABEL_87:
      *(_WORD *)(result + 9) = v27 & 0xF000 | 0x540;
      v19 = 3;
LABEL_170:
      *(_QWORD *)(result + 16) = v18;
      *(_QWORD *)(result + 24) = v19;
      return result;
    default:
      goto LABEL_116;
  }
}


// Address: 0x167EC | Function: sub_167EC
char *__fastcall sub_167EC(__int64 *a1, _QWORD *a2)
{
  __int64 *v2; // x24
  _QWORD *v4; // x8
  __int64 *v6; // x21
  char *v7; // x23
  void **v8; // x22
  _QWORD *v9; // x1
  _BYTE *v10; // x8
  _BYTE *v11; // x8
  char *v12; // x1
  _QWORD *v13; // x8
  char *result; // x0
  __int64 v15; // x8
  __int64 v16; // x9
  __int64 v17; // x8
  __int64 v18; // x9
  __int64 v19; // x8
  char *v20; // x8
  char *v21; // x8
  __int64 v22; // x8
  __int64 v23; // x10

  v2 = a1 + 19;
  v4 = a2 + 86;
  *((_OWORD *)a1 + 2) = 0u;
  v6 = a1 + 4;
  *a1 = (__int64)a2;
  a1[1] = (__int64)(a1 + 4);
  *(_OWORD *)(a1 + 11) = 0u;
  v7 = (char *)(a1 + 11);
  a1[8] = (__int64)(a1 + 11);
  v8 = (void **)(a1 + 8);
  a1[2] = (__int64)(a1 + 4);
  a1[3] = (__int64)(a1 + 8);
  *((_OWORD *)a1 + 3) = 0u;
  a1[9] = (__int64)(a1 + 11);
  a1[10] = (__int64)(a1 + 19);
  *(_OWORD *)(a1 + 13) = 0u;
  *(_OWORD *)(a1 + 15) = 0u;
  *(_OWORD *)(a1 + 17) = 0u;
  v9 = (_QWORD *)a2[83];
  if ( v9 == v4 )
  {
    v10 = (_BYTE *)a2[84];
    if ( v10 == (_BYTE *)v9 )
    {
      v11 = v9;
    }
    else
    {
      memmove(a1 + 4, v9, v10 - (_BYTE *)v9);
      v11 = (_BYTE *)a2[84];
      v9 = (_QWORD *)a2[83];
    }
    a1[2] = (__int64)v6 + v11 - (_BYTE *)v9;
    a2[84] = v9;
  }
  else
  {
    a1[1] = (__int64)v9;
    *((_OWORD *)a1 + 1) = *((_OWORD *)a2 + 42);
    a2[83] = v4;
    a2[84] = v4;
    a2[85] = a2 + 90;
  }
  v12 = (char *)a2[72];
  v13 = a2 + 75;
  result = (char *)*v8;
  if ( v12 == (char *)(a2 + 75) )
  {
    if ( result != v7 )
    {
      free(result);
      a1[8] = (__int64)v7;
      a1[9] = (__int64)v7;
      result = v7;
      v12 = (char *)a2[72];
      a1[10] = (__int64)v2;
    }
    v20 = (char *)a2[73];
    if ( v20 == v12 )
    {
      v21 = v12;
    }
    else
    {
      memmove(result, v12, v20 - v12);
      result = (char *)*v8;
      v21 = (char *)a2[73];
      v12 = (char *)a2[72];
    }
    a1[9] = (__int64)&result[v21 - v12];
    a2[73] = v12;
  }
  else
  {
    *v8 = v12;
    if ( result == v7 )
    {
      *(_OWORD *)(a1 + 9) = *(_OWORD *)(a2 + 73);
      a2[72] = v13;
      a2[73] = v13;
      a2[74] = a2 + 83;
    }
    else
    {
      v15 = a2[73];
      a2[72] = result;
      v16 = a1[9];
      a1[9] = v15;
      v17 = a2[74];
      a2[73] = v16;
      v18 = a1[10];
      a1[10] = v17;
      v19 = a2[72];
      a2[74] = v18;
      a2[73] = v19;
    }
  }
  v22 = *a1;
  v23 = *(_QWORD *)(*a1 + 576);
  *(_QWORD *)(v22 + 672) = *(_QWORD *)(*a1 + 664);
  *(_QWORD *)(v22 + 584) = v23;
  return result;
}


// Address: 0x16998 | Function: sub_16998
__int64 __fastcall sub_16998(unsigned __int8 **a1, size_t a2, __int64 a3)
{
  unsigned __int8 *v3; // x9
  unsigned __int8 *v4; // x10
  int v7; // w8
  unsigned __int8 *v8; // x8
  char v9; // w10
  __int64 v10; // x11
  __int64 v11; // x0
  __int64 *v12; // x23
  unsigned __int8 **v13; // x22
  __int64 v14; // x24
  __int64 v15; // x21
  char *v16; // x0
  __int64 v17; // x21
  unsigned __int8 *v18; // x1
  unsigned __int8 *v19; // x8
  int v20; // w10
  __int64 *v21; // x25
  unsigned __int64 v22; // x9
  unsigned int v23; // w10
  __int64 v24; // x3
  __int64 v25; // x0
  __int64 v26; // x22
  unsigned __int8 *v27; // x23
  __int64 v28; // x8
  unsigned __int8 *v29; // x0
  __int64 v30; // x9
  __int64 v31; // x8
  __int64 v32; // x0
  __int64 *v33; // x24
  unsigned __int8 *v34; // x23
  __int64 v35; // x22
  char *v36; // x0
  unsigned __int8 *v37; // x22
  __int64 v38; // x8
  unsigned __int8 *v39; // x0
  __int16 v40; // w8
  size_t v41; // x2
  char *v42; // x24
  __int64 v43; // x0
  unsigned __int8 *v44; // x8
  unsigned __int8 *v45; // x8
  unsigned __int8 *v46; // x8
  size_t v47; // x2
  char *v48; // x23
  unsigned __int8 *v49; // x8
  __int64 v50; // x21
  __int64 v51; // x0
  unsigned __int8 *v52; // x20
  __int64 v53; // x8
  __int64 v54; // x22
  unsigned __int8 *v55; // x0
  __int64 v56; // x9
  __int16 v58; // w8
  __int64 v59; // [xsp+0h] [xbp-B0h] BYREF
  __int64 v60[19]; // [xsp+8h] [xbp-A8h] BYREF
  _QWORD v61[2]; // [xsp+A0h] [xbp-10h] BYREF

  v4 = *a1;
  v3 = a1[1];
  if ( v3 == *a1 )
    goto LABEL_8;
  v7 = *v4;
  if ( v7 == 90 )
  {
    *a1 = v4 + 1;
    v61[0] = sub_14858(a1);
    if ( v61[0] == 0 )
      return 0;
    v19 = *a1;
    v18 = a1[1];
    if ( *a1 == v18 || *v19 != 69 )
      return 0;
    *a1 = v19 + 1;
    if ( v19 + 1 != v18 && v19[1] == 115 )
    {
      *a1 = v19 + 2;
      *a1 = (unsigned __int8 *)sub_279B0(v19 + 2, v18);
      v60[0] = sub_27A60((int)a1, "string literal");
      return sub_27B0C(a1, v61, v60);
    }
    sub_167EC(v60, a1);
    v45 = *a1;
    if ( *a1 == a1[1] || *v45 != 100 )
    {
      v59 = sub_16998(a1, a2);
      if ( v59 == 0 )
      {
LABEL_110:
        v17 = 0;
        goto LABEL_111;
      }
      *a1 = (unsigned __int8 *)sub_279B0(*a1, a1[1]);
    }
    else
    {
      *a1 = v45 + 1;
      sub_1530C(a1, 1);
      v46 = *a1;
      if ( *a1 == a1[1] )
        goto LABEL_110;
      if ( *v46 != 95 )
        goto LABEL_110;
      *a1 = v46 + 1;
      v59 = sub_16998(a1, a2);
      if ( v59 == 0 )
        goto LABEL_110;
    }
    v17 = sub_27B0C(a1, v61, &v59);
LABEL_111:
    sub_176D0(v60);
    return v17;
  }
  if ( v7 != 78 )
  {
LABEL_8:
    LOBYTE(v60[0]) = 0;
    v11 = sub_18B58(a1, a2, v60);
    if ( v11 == 0 )
      return 0;
    if ( a1[1] == *a1 || **a1 != 73 )
    {
      if ( LOBYTE(v60[0]) != 0 )
        return 0;
      else
        return v11;
    }
    else
    {
      if ( (v60[0] & 1) == 0 )
      {
        v12 = (__int64 *)a1[38];
        if ( v12 == (__int64 *)a1[39] )
        {
          v13 = (unsigned __int8 **)a1[37];
          v14 = v11;
          v15 = (char *)v12 - (char *)v13;
          if ( v13 == a1 + 40 )
          {
            v16 = (char *)malloc(2 * ((char *)v12 - (char *)v13));
            if ( v16 == nullptr )
              abort();
            if ( v12 != (__int64 *)(a1 + 40) )
            {
              v47 = (char *)v12 - (char *)v13;
              v48 = v16;
              memmove(v16, v13, v47);
              v16 = v48;
            }
            a1[37] = (unsigned __int8 *)v16;
          }
          else
          {
            v16 = (char *)realloc(a1[37], 2 * ((char *)v12 - (char *)v13));
            a1[37] = (unsigned __int8 *)v16;
            if ( v16 == nullptr )
              abort();
          }
          v12 = (__int64 *)&v16[v15];
          v49 = (unsigned __int8 *)&v16[8 * (v15 >> 2)];
          v11 = v14;
          a1[38] = (unsigned __int8 *)v12;
          a1[39] = v49;
        }
        a1[38] = (unsigned __int8 *)(v12 + 1);
        *v12 = v11;
      }
      v50 = v11;
      v51 = sub_18CC8(a1, a2 != 0);
      if ( v51 == 0 )
        return 0;
      if ( a2 != 0 )
        *(_BYTE *)(a2 + 1) = 1;
      v52 = a1[614];
      v53 = *((_QWORD *)v52 + 1);
      if ( (unsigned __int64)(v53 - 4048) > 0xFFFFFFFFFFFFF00FLL )
      {
        v56 = v50;
      }
      else
      {
        v54 = v51;
        v55 = (unsigned __int8 *)malloc(0x1000u);
        if ( v55 == nullptr )
LABEL_129:
          sub_13E4C();
        v53 = 0;
        *(_QWORD *)v55 = v52;
        *((_QWORD *)v55 + 1) = 0;
        v52 = v55;
        a1[614] = v55;
        v56 = v50;
        v51 = v54;
      }
      *((_QWORD *)v52 + 1) = v53 + 32;
      *(_QWORD *)&v52[v53 + 16] = off_38AB8;
      v17 = (__int64)&v52[v53 + 16];
      v58 = *(_WORD *)&v52[v53 + 25];
      *(_QWORD *)(v17 + 16) = v56;
      *(_QWORD *)(v17 + 24) = v51;
      *(_BYTE *)(v17 + 8) = 45;
      *(_WORD *)(v17 + 9) = v58 & 0xF000 | 0x540;
    }
    return v17;
  }
  v8 = v4 + 1;
  *a1 = v4 + 1;
  if ( v4 + 1 == v3 )
    goto LABEL_27;
  if ( *v8 != 72 )
  {
    if ( *v8 == 114 )
    {
      v8 = v4 + 2;
      v20 = 4;
      *a1 = v8;
LABEL_28:
      if ( v8 != v3 && *v8 == 86 )
      {
        ++v8;
        v20 |= 2u;
        *a1 = v8;
      }
      if ( v8 != v3 && *v8 == 75 )
      {
        ++v8;
        v20 |= 1u;
        *a1 = v8;
      }
      if ( a2 != 0 )
        *(_DWORD *)(a2 + 4) = v20;
      if ( v8 != v3 )
      {
        if ( *v8 == 79 )
        {
          *a1 = ++v8;
          if ( a2 == 0 )
            goto LABEL_47;
          v9 = 2;
LABEL_45:
          v10 = 8;
          goto LABEL_46;
        }
        if ( *v8 == 82 )
        {
          *a1 = ++v8;
          if ( a2 == 0 )
            goto LABEL_47;
          v9 = 1;
          goto LABEL_45;
        }
      }
      if ( a2 == 0 )
        goto LABEL_47;
      v9 = 0;
      goto LABEL_45;
    }
LABEL_27:
    v20 = 0;
    goto LABEL_28;
  }
  v8 = v4 + 2;
  *a1 = v4 + 2;
  if ( a2 != 0 )
  {
    v9 = 1;
    v10 = 24;
LABEL_46:
    *(_BYTE *)(a2 + v10) = v9;
  }
LABEL_47:
  v17 = 0;
  v21 = (__int64 *)(a1 + 40);
  while ( v8 == v3 || *v8 != 69 )
  {
    if ( a2 != 0 )
      *(_BYTE *)(a2 + 1) = 0;
    v22 = v3 - v8;
    if ( v22 == 0 )
      goto LABEL_73;
    v23 = *v8;
    v24 = 0;
    if ( v23 > 0x52 )
    {
      if ( v23 != 83 )
      {
        if ( v23 == 84 )
        {
          if ( v17 != 0 )
            return 0;
          v32 = sub_1924C((int)a1, a2);
          goto LABEL_75;
        }
LABEL_74:
        v32 = sub_19A20(a1, a2, v17, v24);
        goto LABEL_75;
      }
      if ( v22 >= 2 && v8[1] == 116 )
      {
        v37 = a1[614];
        *a1 = v8 + 2;
        v38 = *((_QWORD *)v37 + 1);
        if ( (unsigned __int64)(v38 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
        {
          v39 = (unsigned __int8 *)malloc(0x1000u);
          if ( v39 == nullptr )
            goto LABEL_129;
          v38 = 0;
          *(_QWORD *)v39 = v37;
          *((_QWORD *)v39 + 1) = 0;
          v37 = v39;
          a1[614] = v39;
        }
        *((_QWORD *)v37 + 1) = v38 + 32;
        *(_QWORD *)&v37[v38 + 16] = off_36BB8;
        v24 = (__int64)&v37[v38 + 16];
        v40 = *(_WORD *)&v37[v38 + 25];
        *(_BYTE *)(v24 + 8) = 8;
        *(_WORD *)(v24 + 9) = v40 & 0xF000 | 0x540;
        *(_QWORD *)(v24 + 16) = "std";
        *(_QWORD *)(v24 + 24) = 3;
      }
      else
      {
        v43 = sub_19748(a1, a2, a3, 0);
        if ( v43 == 0 )
          return 0;
        v24 = v43;
        if ( *(_BYTE *)(v43 + 8) == 27 )
          goto LABEL_74;
      }
      if ( v17 != 0 )
        return 0;
      v8 = *a1;
      v3 = a1[1];
      v17 = v24;
    }
    else
    {
      if ( v23 == 68 )
      {
        if ( v22 >= 2 && (v8[1] | 0x20) == 0x74 )
        {
          if ( v17 != 0 )
            return 0;
          v32 = sub_19618(a1);
LABEL_75:
          v17 = v32;
          if ( v32 == 0 )
            return v17;
          goto LABEL_76;
        }
LABEL_73:
        v24 = 0;
        goto LABEL_74;
      }
      if ( v23 != 73 )
        goto LABEL_74;
      if ( v17 == 0 )
        return v17;
      v25 = sub_18CC8(a1, a2 != 0);
      if ( v25 == 0 || *(_BYTE *)(v17 + 8) == 45 )
        return 0;
      v26 = v25;
      if ( a2 != 0 )
        *(_BYTE *)(a2 + 1) = 1;
      v27 = a1[614];
      v28 = *((_QWORD *)v27 + 1);
      if ( (unsigned __int64)(v28 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v29 = (unsigned __int8 *)malloc(0x1000u);
        if ( v29 == nullptr )
          goto LABEL_129;
        v28 = 0;
        *(_QWORD *)v29 = v27;
        *((_QWORD *)v29 + 1) = 0;
        v27 = v29;
        a1[614] = v29;
      }
      v30 = v28 + 32;
      v31 = (__int64)&v27[v28];
      *((_QWORD *)v27 + 1) = v30;
      *(_QWORD *)(v31 + 16) = off_38AB8;
      v31 += 16;
      LOWORD(v30) = *(_WORD *)(v31 + 9);
      *(_QWORD *)(v31 + 16) = v17;
      *(_QWORD *)(v31 + 24) = v26;
      v17 = v31;
      *(_BYTE *)(v31 + 8) = 45;
      *(_WORD *)(v31 + 9) = v30 & 0xF000 | 0x540;
LABEL_76:
      v33 = (__int64 *)a1[38];
      if ( v33 == (__int64 *)a1[39] )
      {
        v34 = a1[37];
        v35 = (char *)v33 - (char *)v34;
        if ( v34 == (unsigned __int8 *)v21 )
        {
          v36 = (char *)malloc(2 * ((char *)v33 - (char *)v34));
          if ( v36 == nullptr )
            abort();
          if ( v33 != v21 )
          {
            v41 = (char *)v33 - (char *)v34;
            v42 = v36;
            memmove(v36, v34, v41);
            v36 = v42;
          }
          a1[37] = (unsigned __int8 *)v36;
        }
        else
        {
          v36 = (char *)realloc(a1[37], 2 * ((char *)v33 - (char *)v34));
          a1[37] = (unsigned __int8 *)v36;
          if ( v36 == nullptr )
            abort();
        }
        v33 = (__int64 *)&v36[v35];
        a1[38] = (unsigned __int8 *)&v36[v35];
        a1[39] = (unsigned __int8 *)&v36[8 * (v35 >> 2)];
      }
      a1[38] = (unsigned __int8 *)(v33 + 1);
      *v33 = v17;
      v8 = *a1;
      v3 = *a1;
      if ( *a1 != a1[1] )
      {
        v3 = a1[1];
        if ( *v8 == 77 )
        {
          ++v8;
          v3 = a1[1];
          *a1 = v8;
        }
      }
    }
  }
  *a1 = v8 + 1;
  if ( v17 != 0 )
  {
    v44 = a1[38];
    if ( a1[37] != v44 )
    {
      a1[38] = v44 - 8;
      return v17;
    }
    return 0;
  }
  return v17;
}


// Address: 0x170A8 | Function: sub_170A8
void __fastcall __noreturn sub_170A8(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        __int64 a9,
        char a10)
{
  sub_176D0(&a10);
  sub_2E950(a1);
}


// Address: 0x170C0 | Function: sub_170C0
__int64 __fastcall sub_170C0(__int64 a1, size_t a2)
{
  unsigned __int8 *v2; // x8
  unsigned __int8 *v3; // x9
  unsigned __int64 v5; // x10
  int v6; // w11
  int v7; // w11
  unsigned __int64 v8; // t2
  __int64 result; // x0
  unsigned __int8 *v10; // x8
  __int64 v11; // x10
  __int64 v12; // x11
  unsigned __int8 *v13; // x8
  __int64 *v14; // x24
  __int64 v15; // x20
  char *v16; // x0
  __int64 *v17; // x23
  char *v18; // x8
  __int64 *v19; // x22
  __int64 v20; // x25
  __int64 v21; // x21
  size_t v22; // x2
  char *v23; // x23
  int v24; // w1
  __int64 v25; // x0
  _QWORD *v26; // x22
  __int64 v27; // x20
  __int64 v28; // x1
  __int64 v29; // x21
  __int64 v30; // x8
  _QWORD *v31; // x0
  __int64 v32; // x9
  char *v33; // x0
  __int64 (__fastcall **v34)(); // x8
  char v35; // w9
  __int16 v36; // w8
  _BYTE *v37; // x0
  _QWORD *v38; // x22
  __int64 v39; // x8
  _QWORD *v40; // x0
  __int64 v41; // x9

  v2 = *(unsigned __int8 **)a1;
  v3 = *(unsigned __int8 **)(a1 + 8);
  v5 = (unsigned __int64)&v3[-*(_QWORD *)a1];
  if ( v3 == *(unsigned __int8 **)a1 )
    v6 = 0;
  else
    v6 = *v2;
  HIDWORD(v8) = v6 - 74;
  LODWORD(v8) = v6 - 74;
  v7 = v8 >> 1;
  if ( v7 > 4 )
  {
    if ( v7 != 5 )
    {
      if ( v7 == 7 )
      {
        *(_QWORD *)a1 = v2 + 1;
        result = sub_1A440(a1);
        if ( result == 0 )
          return result;
        goto LABEL_14;
      }
      return sub_1544C(a1, a2);
    }
    if ( v3 == v2 || *v2 != 84 )
      return sub_1544C(a1, a2);
    v24 = v5 < 2 ? 0 : v2[1];
    v37 = memchr("yptnk", v24, 5u);
    if ( v37 == nullptr || v37 - "yptnk" == -1 )
      return sub_1544C(a1, a2);
    result = sub_2205C(a1, 0);
    if ( result == 0 )
      return result;
    v27 = result;
    result = sub_170C0(a1);
    if ( result == 0 )
      return result;
    v38 = *(_QWORD **)(a1 + 4912);
    v29 = result;
    v39 = v38[1];
    if ( (unsigned __int64)(v39 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
    {
      v40 = malloc(0x1000u);
      if ( v40 == nullptr )
        goto LABEL_54;
      v39 = 0;
      *v40 = v38;
      v40[1] = 0;
      v38 = v40;
      *(_QWORD *)(a1 + 4912) = v40;
    }
    v41 = v39 + 32;
    v33 = (char *)v38 + v39;
    v34 = off_38B98;
    v38[1] = v41;
    v35 = 34;
    goto LABEL_40;
  }
  if ( v7 == 0 )
  {
    v12 = *(_QWORD *)(a1 + 16);
    v11 = *(_QWORD *)(a1 + 24);
    v13 = v2 + 1;
    v14 = (__int64 *)(a1 + 40);
    *(_QWORD *)a1 = v13;
    v15 = (v11 - v12) >> 3;
    while ( v13 == v3 || *v13 != 69 )
    {
      result = sub_170C0(a1);
      if ( result == 0 )
        return result;
      v17 = *(__int64 **)(a1 + 24);
      if ( v17 == *(__int64 **)(a1 + 32) )
      {
        v19 = *(__int64 **)(a1 + 16);
        v20 = result;
        v21 = (char *)v17 - (char *)v19;
        if ( v19 == v14 )
        {
          v16 = (char *)malloc(2 * ((char *)v17 - (char *)v19));
          if ( v16 == nullptr )
            abort();
          if ( v17 != v14 )
          {
            v22 = (char *)v17 - (char *)v19;
            v23 = v16;
            memmove(v16, v19, v22);
            v16 = v23;
          }
          *(_QWORD *)(a1 + 16) = v16;
        }
        else
        {
          v16 = (char *)realloc(*(void **)(a1 + 16), 2 * ((char *)v17 - (char *)v19));
          *(_QWORD *)(a1 + 16) = v16;
          if ( v16 == nullptr )
            abort();
        }
        v17 = (__int64 *)&v16[v21];
        v18 = &v16[8 * (v21 >> 2)];
        result = v20;
        *(_QWORD *)(a1 + 32) = v18;
      }
      *(_QWORD *)(a1 + 24) = v17 + 1;
      *v17 = result;
      v13 = *(unsigned __int8 **)a1;
      v3 = *(unsigned __int8 **)(a1 + 8);
    }
    *(_QWORD *)a1 = v13 + 1;
    v25 = sub_17574(a1, v15);
    v26 = *(_QWORD **)(a1 + 4912);
    v27 = v25;
    v29 = v28;
    v30 = v26[1];
    if ( (unsigned __int64)(v30 - 4048) > 0xFFFFFFFFFFFFF00FLL )
      goto LABEL_39;
    v31 = malloc(0x1000u);
    if ( v31 != nullptr )
    {
      v30 = 0;
      *v31 = v26;
      v31[1] = 0;
      v26 = v31;
      *(_QWORD *)(a1 + 4912) = v31;
LABEL_39:
      v32 = v30 + 32;
      v33 = (char *)v26 + v30;
      v34 = off_38B28;
      v26[1] = v32;
      v35 = 41;
LABEL_40:
      *((_QWORD *)v33 + 2) = v34;
      result = (__int64)(v33 + 16);
      v36 = *(_WORD *)(result + 9) & 0xF000;
      *(_BYTE *)(result + 8) = v35;
      *(_QWORD *)(result + 16) = v27;
      *(_QWORD *)(result + 24) = v29;
      *(_WORD *)(result + 9) = v36 | 0x540;
      return result;
    }
LABEL_54:
    sub_13E4C();
  }
  if ( v7 != 1 )
    return sub_1544C(a1, a2);
  if ( v5 < 2 || v2[1] != 90 )
    JUMPOUT(0x1BE34);
  *(_QWORD *)a1 = v2 + 2;
  result = sub_14858((unsigned __int8 **)a1);
  if ( result != 0 )
  {
LABEL_14:
    v10 = *(unsigned __int8 **)a1;
    if ( *(_QWORD *)a1 == *(_QWORD *)(a1 + 8) || *v10 != 69 )
      return 0;
    else
      *(_QWORD *)a1 = v10 + 1;
  }
  return result;
}


// Address: 0x173FC | Function: sub_173FC
_QWORD *__fastcall sub_173FC(_QWORD *result, _QWORD *size)
{
  char *v2; // x21
  _QWORD *v3; // x22
  _QWORD *v4; // x23
  char *v5; // x20
  signed __int64 v6; // x19
  char *v7; // x8
  char *v8; // x0
  char *v9; // x21
  __int64 v10; // x8

  v2 = (char *)result[1];
  if ( v2 == (char *)result[2] )
  {
    v3 = size;
    v4 = result;
    v5 = (char *)*result;
    v6 = (signed __int64)&v2[-*result];
    if ( (_QWORD *)*result == result + 3 )
    {
      v8 = (char *)malloc(2 * v6);
      if ( v8 == nullptr )
        abort();
      v7 = v8;
      if ( v2 != v5 )
      {
        v9 = v8;
        memmove(v8, v5, v6);
        v7 = v9;
      }
      result = v4;
      *v4 = v7;
    }
    else
    {
      v7 = (char *)realloc((void *)*result, 2 * v6);
      result = v4;
      *v4 = v7;
      if ( v7 == nullptr )
        abort();
    }
    v2 = &v7[v6];
    size = v3;
    result[1] = &v7[v6];
    result[2] = &v7[8 * (v6 >> 2)];
  }
  v10 = *size;
  result[1] = v2 + 8;
  *(_QWORD *)v2 = v10;
  return result;
}


// Address: 0x174D4 | Function: sub_174D4
long double __fastcall sub_174D4(__int64 a1, long double *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x0
  __int16 v8; // w8
  long double result; // q0

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 32;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_38C08;
  v7 = (__int64)v2 + v4 + 16;
  v8 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(v7 + 8) = 10;
  result = *a2;
  *(_WORD *)(v7 + 9) = v8 & 0xF000 | 0x540;
  *(long double *)(v7 + 16) = result;
  return result;
}


// Address: 0x17574 | Function: sub_17574
char *__fastcall sub_17574(_QWORD *a1, unsigned __int64 a2)
{
  __int64 v2; // x24
  _BYTE *v3; // x26
  unsigned __int64 v4; // x25
  _BYTE *v5; // x22
  _QWORD *v6; // x23
  __int64 v9; // x8
  unsigned __int64 v10; // x27
  _QWORD *v11; // x0
  char *v12; // x23
  _QWORD *v13; // x0

  v2 = a1[2];
  v3 = (_BYTE *)a1[3];
  v4 = (__int64)&v3[-v2] >> 3;
  if ( a2 > v4 )
    sub_1405C("%s:%d: %s", "out/llvm-project/libcxxabi/src/demangle/ItaniumDemangle.h", 2719, (const char *)&unk_9335);
  v5 = (_BYTE *)(v2 + 8 * a2);
  v6 = (_QWORD *)a1[614];
  v9 = v6[1];
  v10 = ((_DWORD)v3 - (_DWORD)v5 + 15) & 0xFFFFFFF0;
  if ( v9 + v10 < 0xFF0 )
    goto LABEL_9;
  if ( v10 < 0xFF1 )
  {
    v13 = malloc(0x1000u);
    if ( v13 == nullptr )
LABEL_15:
      sub_13E4C();
    v9 = 0;
    *v13 = v6;
    v13[1] = 0;
    v6 = v13;
    a1[614] = v13;
LABEL_9:
    v6[1] = v9 + v10;
    v12 = (char *)v6 + v9 + 16;
    if ( v3 == v5 )
      goto LABEL_11;
    goto LABEL_10;
  }
  v11 = malloc(v10 + 16);
  if ( v11 == nullptr )
    goto LABEL_15;
  *v11 = *v6;
  v11[1] = 0;
  *v6 = v11;
  v12 = (char *)(v11 + 2);
  if ( v3 != v5 )
  {
LABEL_10:
    memmove(v12, v5, v3 - v5);
    v2 = a1[2];
    v4 = (a1[3] - v2) >> 3;
  }
LABEL_11:
  if ( a2 > v4 )
    sub_1405C(
      "%s:%d: %s",
      "out/llvm-project/libcxxabi/src/demangle/ItaniumDemangle.h",
      134,
      "shrinkToSize() can't expand!");
  a1[3] = v2 + 8 * a2;
  return v12;
}


// Address: 0x176D0 | Function: sub_176D0
void __fastcall sub_176D0(_QWORD *a1)
{
  _QWORD *v1; // x1
  _QWORD *v2; // x21
  _QWORD *v4; // x20
  char *v5; // x0
  char *v6; // x22
  __int64 v7; // x8
  __int64 v8; // x9
  __int64 v9; // x8
  __int64 v10; // x9
  _BYTE *v11; // x8
  _BYTE *v12; // x8
  _QWORD *v13; // x22
  char *v14; // x1
  char *v15; // x21
  char *v16; // x0
  __int64 v17; // x23
  __int64 v18; // x8
  __int64 v19; // x9
  __int64 v20; // x8
  __int64 v21; // x9
  char *v22; // x8
  char *v23; // x8
  _QWORD *v24; // x0

  v2 = (_QWORD *)*a1;
  v1 = (_QWORD *)a1[1];
  v4 = a1 + 4;
  v5 = *(char **)(*a1 + 664LL);
  v6 = (char *)(v2 + 86);
  if ( v1 == v4 )
  {
    if ( v5 != v6 )
    {
      free(v5);
      v2[83] = v6;
      v5 = (char *)(v2 + 86);
      v1 = (_QWORD *)a1[1];
      v2[84] = v6;
      v2[85] = v2 + 90;
    }
    v11 = (_BYTE *)a1[2];
    if ( v11 == (_BYTE *)v1 )
    {
      v12 = v1;
    }
    else
    {
      memmove(v5, v1, v11 - (_BYTE *)v1);
      v1 = (_QWORD *)a1[1];
      v12 = (_BYTE *)a1[2];
      v5 = (char *)v2[83];
    }
    v2[84] = &v5[v12 - (_BYTE *)v1];
    a1[2] = v1;
  }
  else
  {
    v2[83] = v1;
    if ( v5 == v6 )
    {
      *((_OWORD *)v2 + 42) = *((_OWORD *)a1 + 1);
      a1[1] = v4;
      a1[2] = v4;
      a1[3] = a1 + 8;
    }
    else
    {
      v7 = a1[2];
      a1[1] = v5;
      v8 = v2[84];
      v2[84] = v7;
      v9 = a1[3];
      a1[2] = v8;
      v10 = v2[85];
      v2[85] = v9;
      a1[2] = a1[1];
      a1[3] = v10;
    }
  }
  v13 = (_QWORD *)*a1;
  v14 = (char *)a1[8];
  v15 = (char *)(a1 + 11);
  v16 = *(char **)(*a1 + 576LL);
  v17 = *a1 + 600LL;
  if ( v14 == (char *)(a1 + 11) )
  {
    if ( v16 != (char *)v17 )
    {
      free(v16);
      v13[72] = v17;
      v16 = (char *)v17;
      v14 = (char *)a1[8];
      v13[73] = v17;
      v13[74] = v13 + 83;
    }
    v22 = (char *)a1[9];
    if ( v22 == v14 )
    {
      v23 = v14;
    }
    else
    {
      memmove(v16, v14, v22 - v14);
      v14 = (char *)a1[8];
      v23 = (char *)a1[9];
      v16 = (char *)v13[72];
    }
    v13[73] = &v16[v23 - v14];
  }
  else
  {
    v13[72] = v14;
    if ( v16 == (char *)v17 )
    {
      *(_OWORD *)(v13 + 73) = *(_OWORD *)(a1 + 9);
      a1[8] = v15;
      a1[9] = v15;
      a1[10] = a1 + 19;
      goto LABEL_23;
    }
    v18 = a1[9];
    a1[8] = v16;
    v19 = v13[73];
    v13[73] = v18;
    v20 = a1[10];
    a1[9] = v19;
    v21 = v13[74];
    v13[74] = v20;
    v14 = (char *)a1[8];
    a1[10] = v21;
  }
  a1[9] = v14;
  if ( v14 != v15 )
    free(v14);
LABEL_23:
  v24 = (_QWORD *)a1[1];
  if ( v24 != v4 )
    free(v24);
}


// Address: 0x178B8 | Function: sub_178B8
__int64 __fastcall sub_178B8(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x9
  __int64 result; // x0
  __int16 v9; // w10

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 48;
  v7 = *a2;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_36AC8;
  result = (__int64)v2 + v4 + 16;
  v9 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 21;
  *(_QWORD *)(result + 16) = "template parameter object for ";
  *(_QWORD *)(result + 24) = 30;
  *(_QWORD *)(result + 32) = v7;
  *(_WORD *)(result + 9) = v9 & 0xF000 | 0x540;
  return result;
}


// Address: 0x17968 | Function: sub_17968
__int64 __fastcall sub_17968(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x9
  __int64 result; // x0
  __int16 v9; // w10

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 48;
  v7 = *a2;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_36AC8;
  result = (__int64)v2 + v4 + 16;
  v9 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 21;
  *(_QWORD *)(result + 16) = "vtable for ";
  *(_QWORD *)(result + 24) = 11;
  *(_QWORD *)(result + 32) = v7;
  *(_WORD *)(result + 9) = v9 & 0xF000 | 0x540;
  return result;
}


// Address: 0x17A18 | Function: sub_17A18
__int64 __fastcall sub_17A18(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x9
  __int64 result; // x0
  __int16 v9; // w10

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 48;
  v7 = *a2;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_36AC8;
  result = (__int64)v2 + v4 + 16;
  v9 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 21;
  *(_QWORD *)(result + 16) = "VTT for ";
  *(_QWORD *)(result + 24) = 8;
  *(_QWORD *)(result + 32) = v7;
  *(_WORD *)(result + 9) = v9 & 0xF000 | 0x540;
  return result;
}


// Address: 0x17AC8 | Function: sub_17AC8
__int64 __fastcall sub_17AC8(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x9
  __int64 result; // x0
  __int16 v9; // w10

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 48;
  v7 = *a2;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_36AC8;
  result = (__int64)v2 + v4 + 16;
  v9 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 21;
  *(_QWORD *)(result + 16) = "typeinfo for ";
  *(_QWORD *)(result + 24) = 13;
  *(_QWORD *)(result + 32) = v7;
  *(_WORD *)(result + 9) = v9 & 0xF000 | 0x540;
  return result;
}


// Address: 0x17B78 | Function: sub_17B78
__int64 __fastcall sub_17B78(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x9
  __int64 result; // x0
  __int16 v9; // w10

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 48;
  v7 = *a2;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_36AC8;
  result = (__int64)v2 + v4 + 16;
  v9 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 21;
  *(_QWORD *)(result + 16) = "typeinfo name for ";
  *(_QWORD *)(result + 24) = 18;
  *(_QWORD *)(result + 32) = v7;
  *(_WORD *)(result + 9) = v9 & 0xF000 | 0x540;
  return result;
}


// Address: 0x17C28 | Function: sub_17C28
__int64 __fastcall sub_17C28(__int64 a1)
{
  _BYTE *v1; // x9
  _BYTE *v2; // x12
  _BYTE *v3; // x8
  _BYTE *v4; // x10
  _BYTE *v5; // x8
  _BYTE *v6; // x11
  _BYTE *v7; // x11
  _BYTE *v8; // x10

  v2 = *(_BYTE **)a1;
  v1 = *(_BYTE **)(a1 + 8);
  if ( *(_BYTE **)a1 != v1 )
  {
    if ( *v2 == 104 )
    {
      v3 = v2 + 1;
      *(_QWORD *)a1 = v2 + 1;
      if ( v2 + 1 == v1 )
        return 1;
      v4 = v2 + 1;
      if ( *v3 == 110 )
      {
        v4 = v2 + 2;
        *(_QWORD *)a1 = v2 + 2;
      }
      if ( v1 == v4 || (unsigned int)(unsigned __int8)*v4 - 58 < 0xFFFFFFF6 )
        return 1;
      while ( (unsigned int)(unsigned __int8)*v4 - 58 >= 0xFFFFFFF6 )
      {
        *(_QWORD *)a1 = ++v4;
        if ( v4 == v1 )
          goto LABEL_18;
      }
    }
    else
    {
      if ( *v2 != 118 )
        return 1;
      v5 = v2 + 1;
      *(_QWORD *)a1 = v2 + 1;
      if ( v2 + 1 == v1 )
        return 1;
      v6 = v2 + 1;
      if ( *v5 == 110 )
      {
        v6 = v2 + 2;
        *(_QWORD *)a1 = v2 + 2;
      }
      if ( v1 == v6 || (unsigned int)(unsigned __int8)*v6 - 58 < 0xFFFFFFF6 )
        return 1;
      while ( (unsigned int)(unsigned __int8)*v6 - 58 >= 0xFFFFFFF6 )
      {
        *(_QWORD *)a1 = ++v6;
        if ( v6 == v1 )
        {
          v8 = v1;
          goto LABEL_25;
        }
      }
      v8 = v6;
LABEL_25:
      if ( v8 == v5 || v6 == v1 || *v6 != 95 )
        return 1;
      v3 = v6 + 1;
      *(_QWORD *)a1 = v6 + 1;
      if ( v6 + 1 == v1 )
      {
        v4 = v6 + 1;
      }
      else
      {
        v4 = v6 + 1;
        if ( *v3 == 110 )
        {
          v4 = v6 + 2;
          *(_QWORD *)a1 = v6 + 2;
        }
      }
      if ( v1 == v4 || (unsigned int)(unsigned __int8)*v4 - 58 < 0xFFFFFFF6 )
        return 1;
      while ( (unsigned int)(unsigned __int8)*v4 - 58 >= 0xFFFFFFF6 )
      {
        *(_QWORD *)a1 = ++v4;
        if ( v4 == v1 )
        {
LABEL_18:
          v7 = v1;
          goto LABEL_38;
        }
      }
    }
    v7 = v4;
LABEL_38:
    if ( v7 != v3 && v4 != v1 && *v4 == 95 )
    {
      *(_QWORD *)a1 = v4 + 1;
      return 0;
    }
  }
  return 1;
}


// Address: 0x17E10 | Function: sub_17E10
__int64 __fastcall sub_17E10(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x9
  __int64 result; // x0
  __int16 v9; // w10

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 48;
  v7 = *a2;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_36AC8;
  result = (__int64)v2 + v4 + 16;
  v9 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 21;
  *(_QWORD *)(result + 16) = "covariant return thunk to ";
  *(_QWORD *)(result + 24) = 26;
  *(_QWORD *)(result + 32) = v7;
  *(_WORD *)(result + 9) = v9 & 0xF000 | 0x540;
  return result;
}


// Address: 0x17EC0 | Function: sub_17EC0
__int64 __fastcall sub_17EC0(__int64 a1, __int64 *a2, __int64 *a3)
{
  _QWORD *v3; // x22
  __int64 v6; // x8
  _QWORD *v8; // x0
  __int64 result; // x0
  __int16 v10; // w8
  __int64 v11; // x9
  __int64 v12; // x10

  v3 = *(_QWORD **)(a1 + 4912);
  v6 = v3[1];
  if ( (unsigned __int64)(v6 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v8 = malloc(0x1000u);
    if ( v8 == nullptr )
      sub_13E4C();
    v6 = 0;
    *v8 = v3;
    v8[1] = 0;
    v3 = v8;
    *(_QWORD *)(a1 + 4912) = v8;
  }
  v3[1] = v6 + 32;
  *(_QWORD *)((char *)v3 + v6 + 16) = off_36B48;
  result = (__int64)v3 + v6 + 16;
  v10 = *(_WORD *)((char *)v3 + v6 + 25);
  *(_BYTE *)(result + 8) = 22;
  v11 = *a2;
  v12 = *a3;
  *(_WORD *)(result + 9) = v10 & 0xF000 | 0x540;
  *(_QWORD *)(result + 16) = v11;
  *(_QWORD *)(result + 24) = v12;
  return result;
}


// Address: 0x17F68 | Function: sub_17F68
__int64 __fastcall sub_17F68(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x9
  __int64 result; // x0
  __int16 v9; // w10

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 48;
  v7 = *a2;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_36AC8;
  result = (__int64)v2 + v4 + 16;
  v9 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 21;
  *(_QWORD *)(result + 16) = "thread-local initialization routine for ";
  *(_QWORD *)(result + 24) = 40;
  *(_QWORD *)(result + 32) = v7;
  *(_WORD *)(result + 9) = v9 & 0xF000 | 0x540;
  return result;
}


// Address: 0x18018 | Function: sub_18018
__int64 __fastcall sub_18018(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x9
  __int64 result; // x0
  __int16 v9; // w10

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 48;
  v7 = *a2;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_36AC8;
  result = (__int64)v2 + v4 + 16;
  v9 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 21;
  *(_QWORD *)(result + 16) = "virtual thunk to ";
  *(_QWORD *)(result + 24) = 17;
  *(_QWORD *)(result + 32) = v7;
  *(_WORD *)(result + 9) = v9 & 0xF000 | 0x540;
  return result;
}


// Address: 0x180C8 | Function: sub_180C8
__int64 __fastcall sub_180C8(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x10
  __int64 result; // x0
  __int16 v9; // w8

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 48;
  v7 = *a2;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_36AC8;
  result = (__int64)v2 + v4 + 16;
  v9 = *(_WORD *)((_BYTE *)v2 + v4 + 25) & 0xF000;
  *(_BYTE *)(result + 8) = 21;
  *(_QWORD *)(result + 16) = "non-virtual thunk to ";
  *(_QWORD *)(result + 24) = 21;
  *(_WORD *)(result + 9) = v9 | 0x540;
  *(_QWORD *)(result + 32) = v7;
  return result;
}


// Address: 0x18174 | Function: sub_18174
__int64 __fastcall sub_18174(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x9
  __int64 result; // x0
  __int16 v9; // w10

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 48;
  v7 = *a2;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_36AC8;
  result = (__int64)v2 + v4 + 16;
  v9 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 21;
  *(_QWORD *)(result + 16) = "reference temporary for ";
  *(_QWORD *)(result + 24) = 24;
  *(_QWORD *)(result + 32) = v7;
  *(_WORD *)(result + 9) = v9 & 0xF000 | 0x540;
  return result;
}


// Address: 0x18224 | Function: sub_18224
__int64 __fastcall sub_18224(__int64 a1, char **a2)
{
  _BYTE *v2; // x8
  _BYTE *v3; // x9
  char *v6; // x25
  __int64 v7; // x9
  char *v8; // x28
  char *v9; // x8
  char *v10; // x28
  char *v11; // x23
  char v12; // w22
  __int64 v13; // x0
  _QWORD *v14; // x23
  __int64 v15; // x21
  __int64 v16; // x8
  _QWORD *v17; // x0
  char *v18; // x22
  __int64 v19; // x21
  char *v20; // x0
  size_t v21; // x2
  char *v22; // x23

  v2 = *(_BYTE **)a1;
  v3 = *(_BYTE **)(a1 + 8);
  if ( *(_BYTE **)a1 != v3 )
  {
    v6 = (char *)(a1 + 320);
    while ( *v2 == 87 )
    {
      *(_QWORD *)a1 = v2 + 1;
      if ( v2 + 1 == v3 || v2[1] != 80 )
      {
        v12 = 0;
      }
      else
      {
        v12 = 1;
        *(_QWORD *)a1 = v2 + 2;
      }
      v13 = sub_1869C(a1);
      if ( v13 == 0 )
        return 1;
      v14 = *(_QWORD **)(a1 + 4912);
      v15 = v13;
      v16 = v14[1];
      if ( (unsigned __int64)(v16 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v17 = malloc(0x1000u);
        if ( v17 == nullptr )
          sub_13E4C();
        v16 = 0;
        *v17 = v14;
        v17[1] = 0;
        v14 = v17;
        *(_QWORD *)(a1 + 4912) = v17;
      }
      v7 = v16 + 48;
      v8 = (char *)v14 + v16;
      v9 = *a2;
      v14[1] = v7;
      *((_QWORD *)v8 + 2) = off_36C28;
      v10 = v8 + 16;
      LOWORD(v7) = *(_WORD *)(v10 + 9);
      *((_QWORD *)v10 + 2) = v9;
      *((_QWORD *)v10 + 3) = v15;
      v10[8] = 27;
      v10[32] = v12;
      *(_WORD *)(v10 + 9) = v7 & 0xF000 | 0x540;
      *a2 = v10;
      v11 = *(char **)(a1 + 304);
      if ( v11 == *(char **)(a1 + 312) )
      {
        v18 = *(char **)(a1 + 296);
        v19 = v11 - v18;
        if ( v18 == v6 )
        {
          v20 = (char *)malloc(2 * (v11 - v18));
          if ( v20 == nullptr )
            abort();
          if ( v11 != v6 )
          {
            v21 = v11 - v18;
            v22 = v20;
            memmove(v20, v18, v21);
            v20 = v22;
          }
          *(_QWORD *)(a1 + 296) = v20;
        }
        else
        {
          v20 = (char *)realloc(*(void **)(a1 + 296), 2 * (v11 - v18));
          *(_QWORD *)(a1 + 296) = v20;
          if ( v20 == nullptr )
            abort();
        }
        v11 = &v20[v19];
        *(_QWORD *)(a1 + 312) = &v20[8 * (v19 >> 2)];
      }
      *(_QWORD *)(a1 + 304) = v11 + 8;
      *(_QWORD *)v11 = v10;
      v2 = *(_BYTE **)a1;
      v3 = *(_BYTE **)(a1 + 8);
      if ( *(_BYTE **)a1 == v3 )
        return 0;
    }
  }
  return 0;
}


// Address: 0x183E8 | Function: sub_183E8
__int64 sub_183E8()
{
  return 0;
}


// Address: 0x183F4 | Function: sub_183F4
__int64 sub_183F4()
{
  return 0;
}


// Address: 0x18400 | Function: sub_18400
__int64 sub_18400()
{
  return 0;
}


// Address: 0x1840C | Function: sub_1840C
void sub_1840C()
{
  ;
}


// Address: 0x18414 | Function: sub_18414
__int64 __fastcall sub_18414(_QWORD *a1, char **a2)
{
  size_t v2; // x21
  char *v5; // x8
  size_t v6; // x9
  char *v7; // x0
  const void *v8; // x22
  char *v9; // x10
  size_t v10; // x1
  __int64 v11; // x20
  __int64 result; // x0

  v2 = a1[3];
  if ( v2 != 0 )
  {
    v5 = a2[1];
    v6 = (size_t)a2[2];
    v7 = *a2;
    v8 = (const void *)a1[2];
    v9 = &v5[v2];
    if ( (unsigned __int64)&v5[v2] > v6 )
    {
      if ( 2 * v6 <= (unsigned __int64)(v9 + 992) )
        v10 = (size_t)(v9 + 992);
      else
        v10 = 2 * v6;
      a2[2] = (char *)v10;
      v7 = (char *)realloc(v7, v10);
      *a2 = v7;
      if ( v7 == nullptr )
        abort();
      v5 = a2[1];
    }
    memcpy(&v5[(_QWORD)v7], v8, v2);
    a2[1] += v2;
  }
  v11 = a1[4];
  result = (*(__int64 (__fastcall **)(__int64, char **))(*(_QWORD *)v11 + 32LL))(v11, a2);
  if ( (*(_WORD *)(v11 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64, char **))(*(_QWORD *)v11 + 40LL))(v11, a2);
  return result;
}


// Address: 0x184F4 | Function: sub_184F4
void sub_184F4()
{
  ;
}


// Address: 0x184FC | Function: sub_184FC
__int64 sub_184FC()
{
  return 0;
}


// Address: 0x1850C | Function: sub_1850C
void sub_1850C()
{
  sub_13E30();
}


// Address: 0x18518 | Function: sub_18518
__int64 __fastcall sub_18518(__int64 a1, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  void *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  __int64 *v12; // x21
  __int64 v13; // x9
  char *v14; // x8
  unsigned __int64 v15; // x9
  char *v16; // x0
  unsigned __int64 v17; // x9
  size_t v18; // x8
  size_t v19; // x1
  __int64 *v20; // x20
  __int64 v21; // x9
  __int64 result; // x0

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  if ( (unsigned __int64)(v2 + 24) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 1016);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (void *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = v11;
  }
  qmemcpy(&v2[(_QWORD)v5], "construction vtable for ", 24);
  v12 = *(__int64 **)(a1 + 16);
  v13 = *v12;
  a2[1] = (char *)a2[1] + 24;
  (*(void (__fastcall **)(__int64 *, void **))(v13 + 32))(v12, a2);
  if ( (*(_WORD *)((_BYTE *)v12 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64 *, void **))(*v12 + 40))(v12, a2);
  v14 = (char *)a2[1];
  v15 = (unsigned __int64)a2[2];
  v16 = (char *)*a2;
  if ( (unsigned __int64)(v14 + 4) > v15 )
  {
    v17 = 2 * v15;
    v18 = (size_t)(v14 + 996);
    if ( v17 <= v18 )
      v19 = v18;
    else
      v19 = v17;
    a2[2] = (void *)v19;
    v16 = (char *)realloc(v16, v19);
    *a2 = v16;
    if ( v16 == nullptr )
      abort();
    v14 = (char *)a2[1];
  }
  *(_DWORD *)&v14[(_QWORD)v16] = 762210605;
  v20 = *(__int64 **)(a1 + 24);
  v21 = *v20;
  a2[1] = (char *)a2[1] + 4;
  result = (*(__int64 (__fastcall **)(__int64 *, void **))(v21 + 32))(v20, a2);
  if ( (*(_WORD *)((_BYTE *)v20 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64 *, void **))(*v20 + 40))(v20, a2);
  return result;
}


// Address: 0x18690 | Function: sub_18690
void sub_18690()
{
  sub_13E30();
}


// Address: 0x1869C | Function: sub_1869C
__int64 __fastcall sub_1869C(unsigned __int8 **a1)
{
  unsigned __int8 *v1; // x8
  unsigned __int8 *v2; // x9
  const char *v3; // x13
  unsigned __int64 v4; // x19
  unsigned __int8 *v5; // x14
  unsigned __int8 *v6; // x9
  unsigned __int64 v7; // x11
  __int64 v8; // x12
  const char *v9; // x20
  __int64 v10; // x8
  int v11; // w9
  bool v12; // zf
  unsigned __int8 *v13; // x21
  __int64 v14; // x8
  unsigned __int8 **v15; // x22
  unsigned __int8 *v16; // x0
  __int64 result; // x0
  __int16 v18; // w8

  v2 = *a1;
  v1 = a1[1];
  if ( v1 != *a1 && (unsigned int)*v2 - 58 >= 0xFFFFFFF6 )
  {
    v3 = (const char *)(v2 + 1);
    v4 = 0;
    v5 = v2 + 1;
    do
    {
      *a1 = v5;
      v6 = v5;
      v7 = v4;
      v8 = *(v5 - 1);
      v9 = v3;
      v4 = v8 + 10 * v4 - 48;
      if ( v5 == v1 )
        break;
      ++v5;
      ++v3;
    }
    while ( (unsigned int)*v6 - 48 <= 9 );
    if ( v4 - 1 < v1 - (unsigned __int8 *)v9 )
    {
      *a1 = &v6[10 * v7 - 48 + v8];
      if ( v4 >= 0xA
        && ((v10 = *(_QWORD *)v6, v11 = *((unsigned __int16 *)v6 + 4), v10 == 0x5F4C41424F4C475FLL)
          ? (v12 = v11 == 20063)
          : (v12 = false),
            v12) )
      {
        v13 = a1[614];
        v14 = *((_QWORD *)v13 + 1);
        if ( (unsigned __int64)(v14 - 4048) > 0xFFFFFFFFFFFFF00FLL )
        {
          v9 = "(anonymous namespace)";
          v4 = 21;
          goto LABEL_16;
        }
        v15 = a1;
        v16 = (unsigned __int8 *)malloc(0x1000u);
        if ( v16 != nullptr )
        {
          v14 = 0;
          *(_QWORD *)v16 = v13;
          *((_QWORD *)v16 + 1) = 0;
          v9 = "(anonymous namespace)";
          v4 = 21;
          goto LABEL_15;
        }
      }
      else
      {
        v13 = a1[614];
        v14 = *((_QWORD *)v13 + 1);
        if ( (unsigned __int64)(v14 - 4048) > 0xFFFFFFFFFFFFF00FLL )
        {
LABEL_16:
          *((_QWORD *)v13 + 1) = v14 + 32;
          *(_QWORD *)&v13[v14 + 16] = off_36BB8;
          result = (__int64)&v13[v14 + 16];
          v18 = *(_WORD *)&v13[v14 + 25];
          *(_QWORD *)(result + 16) = v9;
          *(_QWORD *)(result + 24) = v4;
          *(_BYTE *)(result + 8) = 8;
          *(_WORD *)(result + 9) = v18 & 0xF000 | 0x540;
          return result;
        }
        v15 = a1;
        v16 = (unsigned __int8 *)malloc(0x1000u);
        if ( v16 != nullptr )
        {
          v14 = 0;
          *(_QWORD *)v16 = v13;
          *((_QWORD *)v16 + 1) = 0;
LABEL_15:
          v13 = v16;
          v15[614] = v16;
          goto LABEL_16;
        }
      }
      sub_13E4C();
    }
  }
  return 0;
}


// Address: 0x18848 | Function: sub_18848
__int64 __fastcall sub_18848(unsigned __int8 **a1, __int64 *a2)
{
  unsigned __int8 *v2; // x8
  unsigned __int8 *v3; // x9
  __int64 v5; // x10
  unsigned __int8 *v6; // x9
  __int64 v7; // x10
  int v8; // t1

  v3 = *a1;
  v2 = a1[1];
  *a2 = 0;
  if ( v2 == v3 || (unsigned int)*v3 - 58 < 0xFFFFFFF6 )
    return 1;
  v5 = 0;
  v6 = v3 + 1;
  do
  {
    *a1 = v6;
    v7 = 10 * v5;
    *a2 = v7;
    v5 = v7 + *(v6 - 1) - 48;
    *a2 = v5;
    if ( v6 == v2 )
      break;
    v8 = *v6++;
  }
  while ( (unsigned int)(v8 - 48) <= 9 );
  return 0;
}


// Address: 0x188C8 | Function: sub_188C8
long double __fastcall sub_188C8(__int64 a1, long double *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x0
  __int16 v8; // w8
  long double result; // q0

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 32;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_36BB8;
  v7 = (__int64)v2 + v4 + 16;
  v8 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(v7 + 8) = 8;
  result = *a2;
  *(_WORD *)(v7 + 9) = v8 & 0xF000 | 0x540;
  *(long double *)(v7 + 16) = result;
  return result;
}


// Address: 0x18968 | Function: sub_18968
_QWORD *__fastcall sub_18968(_QWORD *result, char **a2)
{
  size_t v2; // x20
  char *v3; // x9
  size_t v4; // x10
  _QWORD *v5; // x8
  char *v6; // x0
  const void *v7; // x21
  char *v9; // x11
  size_t v10; // x1

  v2 = result[3];
  if ( v2 != 0 )
  {
    v3 = a2[1];
    v4 = (size_t)a2[2];
    v5 = result;
    v6 = *a2;
    v7 = (const void *)v5[2];
    v9 = &v3[v2];
    if ( (unsigned __int64)&v3[v2] > v4 )
    {
      if ( 2 * v4 <= (unsigned __int64)(v9 + 992) )
        v10 = (size_t)(v9 + 992);
      else
        v10 = 2 * v4;
      a2[2] = (char *)v10;
      v6 = (char *)realloc(v6, v10);
      *a2 = v6;
      if ( v6 == nullptr )
        abort();
      v3 = a2[1];
    }
    result = memcpy(&v3[(_QWORD)v6], v7, v2);
    a2[1] += v2;
  }
  return result;
}


// Address: 0x189FC | Function: sub_189FC
__int64 __fastcall sub_189FC(__int64 a1)
{
  return *(_QWORD *)(a1 + 16);
}


// Address: 0x18A0C | Function: sub_18A0C
void sub_18A0C()
{
  sub_13E30();
}


// Address: 0x18A18 | Function: sub_18A18
__int64 __fastcall sub_18A18(__int64 a1, __int64 a2)
{
  __int64 v2; // x21
  char v5; // w21
  __int64 v6; // x8
  unsigned __int64 v7; // x10
  void *v8; // x0
  __int64 v9; // x9
  unsigned __int64 v10; // x8
  size_t v11; // x1
  __int64 v12; // x20
  __int64 result; // x0

  v2 = *(_QWORD *)(a1 + 16);
  if ( v2 == 0 )
    goto LABEL_8;
  (*(void (__fastcall **)(_QWORD, __int64))(*(_QWORD *)v2 + 32LL))(*(_QWORD *)(a1 + 16), a2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v2 + 40LL))(v2, a2);
  if ( *(_QWORD *)(a1 + 16) != 0 )
  {
    if ( (*(_BYTE *)(a1 + 32) & 1) != 0 )
      v5 = 58;
    else
      v5 = 46;
  }
  else
  {
LABEL_8:
    if ( *(_BYTE *)(a1 + 32) != 1 )
      goto LABEL_17;
    v5 = 58;
  }
  v6 = *(_QWORD *)(a2 + 8);
  v7 = *(_QWORD *)(a2 + 16);
  v8 = *(void **)a2;
  v9 = v6 + 1;
  if ( v6 + 1 > v7 )
  {
    v10 = v6 + 993;
    if ( 2 * v7 <= v10 )
      v11 = v10;
    else
      v11 = 2 * v7;
    *(_QWORD *)(a2 + 16) = v11;
    v8 = realloc(v8, v11);
    *(_QWORD *)a2 = v8;
    if ( v8 == nullptr )
      abort();
    v6 = *(_QWORD *)(a2 + 8);
    v9 = v6 + 1;
  }
  *(_QWORD *)(a2 + 8) = v9;
  *((_BYTE *)v8 + v6) = v5;
LABEL_17:
  v12 = *(_QWORD *)(a1 + 24);
  result = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v12 + 32LL))(v12, a2);
  if ( (*(_WORD *)(v12 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v12 + 40LL))(v12, a2);
  return result;
}


// Address: 0x18B4C | Function: sub_18B4C
void sub_18B4C()
{
  sub_13E30();
}


// Address: 0x18B58 | Function: sub_18B58
__int64 __fastcall sub_18B58(__int64 a1, __int64 a2, _BYTE *a3, __int64 a4)
{
  _WORD *v4; // x8
  _WORD *v5; // x9
  __int64 v6; // x19
  __int64 v7; // x22
  _BYTE *v8; // x20
  __int64 v9; // x21
  __int64 result; // x0
  __int64 v11; // x3
  _QWORD *v12; // x20
  __int64 v13; // x9
  __int64 v14; // x22
  __int64 v15; // x21
  _BYTE *v16; // x19
  _QWORD *v17; // x0
  _QWORD *v18; // x8
  __int16 v19; // w8

  v4 = *(_WORD **)a1;
  v5 = *(_WORD **)(a1 + 8);
  if ( (unsigned __int64)v5 - *(_QWORD *)a1 >= 2 && *v4 == 29779 )
  {
    v12 = *(_QWORD **)(a1 + 4912);
    *(_QWORD *)a1 = v4 + 1;
    v13 = v12[1];
    if ( (unsigned __int64)(v13 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
    {
      v14 = a1;
      v15 = a2;
      v16 = a3;
      v17 = malloc(0x1000u);
      if ( v17 == nullptr )
        sub_13E4C();
      v18 = v17;
      v13 = 0;
      *v17 = v12;
      v17[1] = 0;
      v12 = v17;
      a1 = v14;
      a3 = v16;
      a2 = v15;
      *(_QWORD *)(v14 + 4912) = v18;
    }
    v12[1] = v13 + 32;
    *(_QWORD *)((char *)v12 + v13 + 16) = off_36BB8;
    v6 = (__int64)v12 + v13 + 16;
    v19 = *(_WORD *)((char *)v12 + v13 + 25);
    *(_QWORD *)(v6 + 24) = 3;
    *(_WORD *)(v6 + 9) = v19 & 0xF000 | 0x540;
    *(_QWORD *)(v6 + 16) = "std";
    *(_BYTE *)(v6 + 8) = 8;
    v4 = *(_WORD **)a1;
    if ( *(_QWORD *)(a1 + 8) == *(_QWORD *)a1 )
      goto LABEL_12;
  }
  else
  {
    v6 = 0;
    if ( v5 == v4 )
    {
LABEL_12:
      v11 = 0;
      return sub_19A20(a1, a2, v6, v11);
    }
  }
  if ( *(_BYTE *)v4 != 83 )
    goto LABEL_12;
  v7 = a2;
  v8 = a3;
  v9 = a1;
  result = sub_19748(a1, a2, a3, a4);
  if ( result != 0 )
  {
    v11 = result;
    if ( *(_BYTE *)(result + 8) == 27 )
    {
      a2 = v7;
      a1 = v9;
      return sub_19A20(a1, a2, v6, v11);
    }
    result = 0;
    if ( v8 != nullptr && v6 == 0 )
    {
      result = v11;
      *v8 = 1;
    }
  }
  return result;
}


// Address: 0x18CC8 | Function: sub_18CC8
__int64 __fastcall sub_18CC8(__int64 a1, size_t a2)
{
  _BYTE *v2; // x8
  _BYTE *v3; // x9
  char v5; // w20
  _BYTE *v6; // x8
  _QWORD *v7; // x0
  _QWORD *v8; // x8
  __int64 *v9; // x26
  __int64 *v10; // x27
  __int64 v11; // x0
  __int64 v12; // x22
  __int64 *v13; // x25
  __int64 *v14; // x24
  __int64 v15; // x23
  char *v16; // x0
  __int64 *v17; // x25
  __int64 *v18; // x24
  __int64 v19; // x23
  char *v20; // x0
  size_t v21; // x2
  char *v22; // x25
  int v23; // w8
  _QWORD *v24; // x25
  __int64 v25; // x23
  __int64 v26; // x24
  __int64 v27; // x8
  _QWORD *v28; // x0
  __int64 v29; // x9
  __int16 v30; // w8
  __int16 v31; // w10
  __int16 v32; // w8
  __int64 v33; // x11
  __int64 v34; // x12
  __int64 v35; // x10
  __int64 v36; // x11
  __int64 *v37; // x24
  __int64 v38; // x23
  char *v39; // x0
  size_t v40; // x2
  char *v41; // x25
  size_t v42; // x2
  char *v43; // x25
  char v44; // w21
  __int64 v45; // x20
  __int64 result; // x0
  char *v47; // x0
  _QWORD *v48; // x23
  char *v49; // x21
  __int64 v50; // x1
  __int64 v51; // x22
  __int64 v52; // x8
  _QWORD *v53; // x0
  __int16 v54; // w8
  unsigned __int64 v55; // [xsp+8h] [xbp-8h]

  v2 = *(_BYTE **)a1;
  v3 = *(_BYTE **)(a1 + 8);
  if ( *(_BYTE **)a1 == v3 || *v2 != 73 )
    return 0;
  v5 = a2;
  v6 = v2 + 1;
  *(_QWORD *)a1 = v6;
  if ( (a2 & 1) != 0 )
  {
    v7 = *(_QWORD **)(a1 + 664);
    v8 = *(_QWORD **)(a1 + 680);
    *(_QWORD *)(a1 + 672) = v7;
    if ( v7 == v8 )
    {
      if ( v7 == (_QWORD *)(a1 + 688) )
      {
        v7 = malloc(0);
        if ( v7 == nullptr )
          abort();
        *(_QWORD *)(a1 + 664) = v7;
      }
      else
      {
        v7 = realloc(v7, 0);
        *(_QWORD *)(a1 + 664) = v7;
        if ( v7 == nullptr )
          abort();
      }
      *(_QWORD *)(a1 + 672) = v7;
      *(_QWORD *)(a1 + 680) = v7;
    }
    *(_QWORD *)(a1 + 672) = v7 + 1;
    *v7 = a1 + 576;
    v6 = *(_BYTE **)a1;
    v3 = *(_BYTE **)(a1 + 8);
    *(_QWORD *)(a1 + 584) = *(_QWORD *)(a1 + 576);
  }
  v9 = (__int64 *)(a1 + 40);
  v10 = (__int64 *)(a1 + 600);
  v55 = (__int64)(*(_QWORD *)(a1 + 24) - *(_QWORD *)(a1 + 16)) >> 3;
  do
  {
    if ( v6 != v3 && *v6 == 69 )
    {
      v45 = 0;
      goto LABEL_74;
    }
    v11 = sub_170C0(a1, a2);
    v12 = v11;
    if ( (v5 & 1) != 0 )
    {
      if ( v11 == 0 )
        return 0;
      v13 = *(__int64 **)(a1 + 24);
      if ( v13 == *(__int64 **)(a1 + 32) )
      {
        v14 = *(__int64 **)(a1 + 16);
        v15 = (char *)v13 - (char *)v14;
        if ( v14 == v9 )
        {
          v16 = (char *)malloc(2 * ((char *)v13 - (char *)v14));
          if ( v16 == nullptr )
            abort();
          if ( v13 != v9 )
          {
            v21 = (char *)v13 - (char *)v14;
            v22 = v16;
            memmove(v16, v14, v21);
            v16 = v22;
          }
          *(_QWORD *)(a1 + 16) = v16;
        }
        else
        {
          v16 = (char *)realloc(*(void **)(a1 + 16), 2 * ((char *)v13 - (char *)v14));
          *(_QWORD *)(a1 + 16) = v16;
          if ( v16 == nullptr )
            abort();
        }
        v13 = (__int64 *)&v16[v15];
        *(_QWORD *)(a1 + 24) = &v16[v15];
        *(_QWORD *)(a1 + 32) = &v16[8 * (v15 >> 2)];
      }
      v23 = *(unsigned __int8 *)(v12 + 8);
      *(_QWORD *)(a1 + 24) = v13 + 1;
      *v13 = v12;
      if ( v23 == 41 )
      {
        v24 = *(_QWORD **)(a1 + 4912);
        v25 = *(_QWORD *)(v12 + 16);
        v26 = *(_QWORD *)(v12 + 24);
        v27 = v24[1];
        if ( (unsigned __int64)(v27 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
        {
          v28 = malloc(0x1000u);
          if ( v28 == nullptr )
            goto LABEL_78;
          v27 = 0;
          *v28 = v24;
          v28[1] = 0;
          v24 = v28;
          *(_QWORD *)(a1 + 4912) = v28;
        }
        v24[1] = v27 + 32;
        v29 = 8 * v26;
        *(_QWORD *)((char *)v24 + v27 + 16) = off_389D8;
        v12 = (__int64)v24 + v27 + 16;
        v30 = *(_WORD *)((char *)v24 + v27 + 25);
        *(_BYTE *)(v12 + 8) = 40;
        v31 = v30 & 0xF000;
        *(_QWORD *)(v12 + 16) = v25;
        *(_QWORD *)(v12 + 24) = v26;
        v32 = v30 & 0xF000 | 0xA80;
        *(_WORD *)(v12 + 9) = v31 | 0xA80;
        if ( v26 != 0 )
        {
          v33 = 8 * v26;
          v34 = v25;
          while ( (*(_WORD *)(*(_QWORD *)v34 + 9LL) & 0x300) == 0x100 )
          {
            v33 -= 8;
            v34 += 8;
            if ( v33 == 0 )
              goto LABEL_41;
          }
        }
        else
        {
LABEL_41:
          v32 = v31 | 0x980;
          *(_WORD *)(v12 + 9) = v31 | 0x980;
        }
        if ( v26 != 0 )
        {
          v35 = 8 * v26;
          v36 = v25;
          while ( (*(_WORD *)(*(_QWORD *)v36 + 9LL) & 0xC00) == 0x400 )
          {
            v35 -= 8;
            v36 += 8;
            if ( v35 == 0 )
              goto LABEL_46;
          }
        }
        else
        {
LABEL_46:
          v32 = v32 & 0xF3FF | 0x400;
          *(_WORD *)(v12 + 9) = v32;
        }
        if ( v26 != 0 )
        {
          while ( (*(_WORD *)(*(_QWORD *)v25 + 9LL) & 0xC0) == 0x40 )
          {
            v29 -= 8;
            v25 += 8;
            if ( v29 == 0 )
              goto LABEL_50;
          }
        }
        else
        {
LABEL_50:
          *(_WORD *)(v12 + 9) = v32 & 0xFF3F | 0x40;
        }
      }
      else if ( v23 == 34 )
      {
        v12 = *(_QWORD *)(v12 + 24);
      }
      v17 = *(__int64 **)(a1 + 584);
      if ( v17 == *(__int64 **)(a1 + 592) )
      {
        v37 = *(__int64 **)(a1 + 576);
        v38 = (char *)v17 - (char *)v37;
        if ( v37 == v10 )
        {
          v39 = (char *)malloc(2 * ((char *)v17 - (char *)v37));
          if ( v39 == nullptr )
            abort();
          if ( v17 != v10 )
          {
            v42 = (char *)v17 - (char *)v37;
            v43 = v39;
            memmove(v39, v37, v42);
            v39 = v43;
          }
          *(_QWORD *)(a1 + 576) = v39;
        }
        else
        {
          v39 = (char *)realloc(*(void **)(a1 + 576), 2 * ((char *)v17 - (char *)v37));
          *(_QWORD *)(a1 + 576) = v39;
          if ( v39 == nullptr )
            abort();
        }
        v17 = (__int64 *)&v39[v38];
        *(_QWORD *)(a1 + 584) = &v39[v38];
        *(_QWORD *)(a1 + 592) = &v39[8 * (v38 >> 2)];
      }
      *(_QWORD *)(a1 + 584) = v17 + 1;
    }
    else
    {
      if ( v11 == 0 )
        return 0;
      v17 = *(__int64 **)(a1 + 24);
      if ( v17 == *(__int64 **)(a1 + 32) )
      {
        v18 = *(__int64 **)(a1 + 16);
        v19 = (char *)v17 - (char *)v18;
        if ( v18 == v9 )
        {
          v20 = (char *)malloc(2 * ((char *)v17 - (char *)v18));
          if ( v20 == nullptr )
            abort();
          if ( v17 != v9 )
          {
            v40 = (char *)v17 - (char *)v18;
            v41 = v20;
            memmove(v20, v18, v40);
            v20 = v41;
          }
          *(_QWORD *)(a1 + 16) = v20;
        }
        else
        {
          v20 = (char *)realloc(*(void **)(a1 + 16), 2 * ((char *)v17 - (char *)v18));
          *(_QWORD *)(a1 + 16) = v20;
          if ( v20 == nullptr )
            abort();
        }
        v17 = (__int64 *)&v20[v19];
        *(_QWORD *)(a1 + 24) = &v20[v19];
        *(_QWORD *)(a1 + 32) = &v20[8 * (v19 >> 2)];
      }
      *(_QWORD *)(a1 + 24) = v17 + 1;
    }
    *v17 = v12;
    v6 = *(_BYTE **)a1;
    v3 = *(_BYTE **)(a1 + 8);
  }
  while ( *(_BYTE **)a1 == v3 || *v6 != 81 );
  v44 = *(_BYTE *)(a1 + 778);
  *(_QWORD *)a1 = v6 + 1;
  *(_BYTE *)(a1 + 778) = 1;
  v45 = sub_1A440(a1);
  *(_BYTE *)(a1 + 778) = v44;
  if ( v45 == 0 )
    return 0;
  v6 = *(_BYTE **)a1;
  if ( *(_QWORD *)a1 == *(_QWORD *)(a1 + 8) || *v6 != 69 )
    return 0;
LABEL_74:
  *(_QWORD *)a1 = v6 + 1;
  v47 = sub_17574((_QWORD *)a1, v55);
  v48 = *(_QWORD **)(a1 + 4912);
  v49 = v47;
  v51 = v50;
  v52 = v48[1];
  if ( (unsigned __int64)(v52 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v53 = malloc(0x1000u);
    if ( v53 == nullptr )
LABEL_78:
      sub_13E4C();
    v52 = 0;
    *v53 = v48;
    v53[1] = 0;
    v48 = v53;
    *(_QWORD *)(a1 + 4912) = v53;
  }
  v48[1] = v52 + 48;
  *(_QWORD *)((char *)v48 + v52 + 16) = off_38A48;
  result = (__int64)v48 + v52 + 16;
  v54 = *(_WORD *)((char *)v48 + v52 + 25);
  *(_BYTE *)(result + 8) = 43;
  *(_QWORD *)(result + 16) = v49;
  *(_QWORD *)(result + 24) = v51;
  *(_QWORD *)(result + 32) = v45;
  *(_WORD *)(result + 9) = v54 & 0xF000 | 0x540;
  return result;
}


// Address: 0x1919C | Function: sub_1919C
void __fastcall __noreturn sub_1919C(__int64 a1)
{
  __int64 v1; // x19
  char v2; // w21

  *(_BYTE *)(v1 + 778) = v2;
  sub_2E950(a1);
}


// Address: 0x191A4 | Function: sub_191A4
__int64 __fastcall sub_191A4(__int64 a1, __int64 *a2, __int64 *a3)
{
  _QWORD *v3; // x22
  __int64 v6; // x8
  _QWORD *v8; // x0
  __int64 result; // x0
  __int16 v10; // w8
  __int64 v11; // x9
  __int64 v12; // x10

  v3 = *(_QWORD **)(a1 + 4912);
  v6 = v3[1];
  if ( (unsigned __int64)(v6 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v8 = malloc(0x1000u);
    if ( v8 == nullptr )
      sub_13E4C();
    v6 = 0;
    *v8 = v3;
    v8[1] = 0;
    v3 = v8;
    *(_QWORD *)(a1 + 4912) = v8;
  }
  v3[1] = v6 + 32;
  *(_QWORD *)((char *)v3 + v6 + 16) = off_38AB8;
  result = (__int64)v3 + v6 + 16;
  v10 = *(_WORD *)((char *)v3 + v6 + 25);
  *(_BYTE *)(result + 8) = 45;
  v11 = *a2;
  v12 = *a3;
  *(_WORD *)(result + 9) = v10 & 0xF000 | 0x540;
  *(_QWORD *)(result + 16) = v11;
  *(_QWORD *)(result + 24) = v12;
  return result;
}


// Address: 0x1924C | Function: sub_1924C
__int64 __fastcall sub_1924C(__int64 a1, size_t size)
{
  _BYTE *v2; // x8
  _BYTE *v3; // x20
  _BYTE *v4; // x21
  __int64 v5; // x9
  _BYTE *v6; // x12
  _BYTE *v7; // x11
  unsigned __int64 v8; // x9
  unsigned __int64 v9; // x22
  int v10; // w8
  _QWORD *v11; // x22
  __int64 v12; // x8
  __int64 v13; // x19
  _QWORD *v14; // x0
  __int64 v15; // x19
  __int16 v16; // w8
  __int64 v17; // x10
  _BYTE *v18; // x12
  _QWORD *v20; // x19
  __int64 v21; // x9
  __int64 v22; // x20
  _QWORD *v23; // x0
  _QWORD *v24; // x8
  char *v25; // x19
  __int16 v26; // w8
  __int64 *v27; // x23
  __int64 *v28; // x8
  __int64 *v29; // x22
  __int64 v30; // x24
  __int64 v31; // x20
  char *v32; // x21
  __int64 v33; // x10
  unsigned __int64 v34; // x8
  _QWORD *v35; // x10
  __int64 v36; // x10
  _QWORD *v37; // t2
  int v38; // w19
  char *v39; // x0
  __int64 v40; // [xsp+8h] [xbp-8h] BYREF

  v3 = *(_BYTE **)a1;
  v2 = *(_BYTE **)(a1 + 8);
  if ( *(_BYTE **)a1 == v2 || *v3 != 84 )
    return 0;
  v4 = v3 + 1;
  *(_QWORD *)a1 = v3 + 1;
  if ( v3 + 1 == v2 || *v4 != 76 )
  {
    v8 = 0;
    if ( v4 == v2 )
      return 0;
  }
  else
  {
    *(_QWORD *)a1 = v3 + 2;
    if ( v2 == v3 + 2 || (unsigned int)(unsigned __int8)v3[2] - 58 < 0xFFFFFFF6 )
      return 0;
    v5 = 0;
    v6 = v3 + 4;
    do
    {
      v7 = v6 - 1;
      v4 = v6;
      *(_QWORD *)a1 = v6 - 1;
      v5 = (unsigned __int8)*(v6 - 2) + 10 * v5 - 48;
      if ( v6 - 1 == v2 )
        break;
      ++v6;
    }
    while ( (unsigned int)(unsigned __int8)*(v4 - 1) - 48 <= 9 );
    if ( v7 == v2 )
      return 0;
    if ( *(v4 - 1) != 95 )
      return 0;
    v8 = v5 + 1;
    *(_QWORD *)a1 = v4;
    if ( v4 == v2 )
      return 0;
  }
  if ( *v4 == 95 )
  {
    v9 = 0;
    goto LABEL_17;
  }
  if ( (unsigned int)(unsigned __int8)*v4 - 58 < 0xFFFFFFF6 )
    return 0;
  v17 = 0;
  v18 = v4 + 1;
  do
  {
    *(_QWORD *)a1 = v18;
    v4 = v18;
    v17 = (unsigned __int8)*(v18 - 1) + 10 * v17 - 48;
    if ( v18 == v2 )
      break;
    ++v18;
  }
  while ( (unsigned int)(unsigned __int8)*v4 - 48 <= 9 );
  if ( v4 == v2 || *v4 != 95 )
    return 0;
  v9 = v17 + 1;
LABEL_17:
  v10 = *(unsigned __int8 *)(a1 + 778);
  *(_QWORD *)a1 = v4 + 1;
  if ( v10 == 1 )
  {
    v11 = *(_QWORD **)(a1 + 4912);
    v12 = v11[1];
    if ( (unsigned __int64)(v12 - 4048) > 0xFFFFFFFFFFFFF00FLL )
    {
LABEL_21:
      v11[1] = v12 + 32;
      *(_QWORD *)((char *)v11 + v12 + 16) = off_36BB8;
      v15 = (__int64)v11 + v12 + 16;
      v16 = *(_WORD *)((_BYTE *)v11 + v12 + 25) & 0xF000;
      *(_BYTE *)(v15 + 8) = 8;
      *(_WORD *)(v15 + 9) = v16 | 0x540;
      *(_QWORD *)(v15 + 16) = v3;
      *(_QWORD *)(v15 + 24) = v4 - v3;
      return v15;
    }
    v13 = a1;
    v14 = malloc(0x1000u);
    if ( v14 != nullptr )
    {
      v12 = 0;
      *v14 = v11;
      v14[1] = 0;
      v11 = v14;
      *(_QWORD *)(v13 + 4912) = v14;
      goto LABEL_21;
    }
LABEL_55:
    sub_13E4C();
  }
  if ( *(_BYTE *)(a1 + 777) == 1 && v8 == 0 )
  {
    v20 = *(_QWORD **)(a1 + 4912);
    v21 = v20[1];
    if ( (unsigned __int64)(v21 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
    {
      v22 = a1;
      v23 = malloc(0x1000u);
      if ( v23 == nullptr )
        goto LABEL_55;
      v24 = v23;
      v21 = 0;
      *v23 = v20;
      v23[1] = 0;
      v20 = v23;
      a1 = v22;
      *(_QWORD *)(v22 + 4912) = v24;
    }
    v20[1] = v21 + 48;
    v25 = (char *)v20 + v21;
    *((_QWORD *)v25 + 2) = off_36C98;
    v15 = (__int64)(v25 + 16);
    v26 = *(_WORD *)(v15 + 9);
    *(_QWORD *)(v15 + 16) = v9;
    *(_QWORD *)(v15 + 24) = 0;
    *(_BYTE *)(v15 + 32) = 0;
    *(_WORD *)(v15 + 9) = v26 & 0xF000 | 0xA80;
    v27 = *(__int64 **)(a1 + 728);
    v28 = *(__int64 **)(a1 + 736);
    *(_BYTE *)(v15 + 8) = 44;
    if ( v27 == v28 )
    {
      v29 = *(__int64 **)(a1 + 720);
      v30 = a1;
      v31 = (char *)v27 - (char *)v29;
      if ( v29 == (__int64 *)(a1 + 744) )
      {
        v39 = (char *)malloc(2 * ((char *)v27 - (char *)v29));
        if ( v39 == nullptr )
          abort();
        v32 = v39;
        if ( v27 != v29 )
          memmove(v39, v29, (char *)v27 - (char *)v29);
        a1 = v30;
        *(_QWORD *)(v30 + 720) = v32;
      }
      else
      {
        v32 = (char *)realloc(*(void **)(a1 + 720), 2 * ((char *)v27 - (char *)v29));
        a1 = v30;
        *(_QWORD *)(v30 + 720) = v32;
        if ( v32 == nullptr )
          abort();
      }
      v27 = (__int64 *)&v32[v31];
      *(_QWORD *)(a1 + 736) = &v32[8 * (v31 >> 2)];
    }
    *(_QWORD *)(a1 + 728) = v27 + 1;
    *v27 = v15;
    return v15;
  }
  v33 = *(_QWORD *)(a1 + 664);
  v34 = (*(_QWORD *)(a1 + 672) - v33) >> 3;
  if ( v8 < v34 )
  {
    v35 = *(_QWORD **)(v33 + 8 * v8);
    if ( v35 != nullptr )
    {
      v37 = v35;
      v36 = *v35;
      if ( v9 < (v37[1] - v36) >> 3 )
        return *(_QWORD *)(v36 + 8 * v9);
    }
  }
  v15 = 0;
  if ( v8 > v34 || *(_QWORD *)(a1 + 784) != v8 )
    return v15;
  if ( v8 == v34 )
  {
    v38 = a1;
    v40 = 0;
    sub_1A030(a1 + 664, (size_t)&v40);
    LODWORD(a1) = v38;
  }
  return sub_1A108(a1, "auto");
}


// Address: 0x19618 | Function: sub_19618
__int64 __fastcall sub_19618(__int64 a1)
{
  _BYTE *v1; // x8
  _BYTE *v2; // x10
  _BYTE *v3; // x9
  __int64 result; // x0
  _BYTE *v6; // x10
  _QWORD *v7; // x20
  __int64 v8; // x8
  __int64 v9; // x21
  _QWORD *v10; // x0
  __int64 v11; // x9
  char *v12; // x8

  v1 = *(_BYTE **)a1;
  v2 = *(_BYTE **)(a1 + 8);
  if ( *(_BYTE **)a1 == v2 )
    return 0;
  if ( *v1 != 68 )
    return 0;
  v3 = v1 + 1;
  *(_QWORD *)a1 = v1 + 1;
  if ( v1 + 1 == v2 || *v3 != 116 && *v3 != 84 )
    return 0;
  *(_QWORD *)a1 = v1 + 2;
  result = sub_1A440(a1);
  if ( result == 0 )
    return result;
  v6 = *(_BYTE **)a1;
  if ( *(_QWORD *)a1 == *(_QWORD *)(a1 + 8) || *v6 != 69 )
    return 0;
  v7 = *(_QWORD **)(a1 + 4912);
  *(_QWORD *)a1 = v6 + 1;
  v8 = v7[1];
  if ( (unsigned __int64)(v8 - 4016) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v9 = result;
    v10 = malloc(0x1000u);
    if ( v10 == nullptr )
      sub_13E4C();
    v8 = 0;
    *v10 = v7;
    v10[1] = 0;
    v7 = v10;
    *(_QWORD *)(a1 + 4912) = v10;
    result = v9;
  }
  v11 = v8 + 64;
  v12 = (char *)v7 + v8;
  v7[1] = v11;
  *((_QWORD *)v12 + 2) = off_375B8;
  v12 += 16;
  v12[8] = 60;
  LOWORD(v11) = *(_WORD *)(v12 + 9);
  *((_QWORD *)v12 + 4) = result;
  *((_QWORD *)v12 + 2) = "decltype";
  *((_QWORD *)v12 + 3) = 8;
  *((_QWORD *)v12 + 5) = 0;
  *((_QWORD *)v12 + 6) = 0;
  *(_WORD *)(v12 + 9) = v11 & 0xF000 | 0x540;
  return (__int64)v12;
}


// Address: 0x19748 | Function: sub_19748
__int64 __fastcall sub_19748(_QWORD *a1)
{
  _BYTE *v1; // x8
  _BYTE *v2; // x10
  _BYTE *v3; // x9
  unsigned int v4; // w11
  __int64 v5; // x19
  int v6; // w19
  __int64 v7; // x9
  __int64 v8; // x10
  __int64 v9; // x8
  __int64 v10; // x13
  __int64 v11; // x12
  __int64 v12; // x10
  __int64 v13; // x11
  unsigned __int64 v14; // x8
  _QWORD *v16; // x20
  __int64 v17; // x9
  _QWORD *v18; // x21
  _QWORD *v19; // x0
  _QWORD *v20; // x8
  char *v21; // x20
  _QWORD *v22; // x23
  __int16 v23; // w8
  __int64 v24; // x0
  char *v25; // x22
  _QWORD *v26; // x8
  char *v27; // x21
  __int64 v28; // x20
  char *v29; // x0
  size_t v30; // x2
  char *v31; // x22

  v1 = (_BYTE *)*a1;
  v2 = (_BYTE *)a1[1];
  if ( (_BYTE *)*a1 == v2 )
    return 0;
  if ( *v1 != 83 )
    return 0;
  v3 = v1 + 1;
  *a1 = v1 + 1;
  if ( v2 == v1 + 1 )
    return 0;
  v4 = (unsigned __int8)*v3;
  if ( v4 < 0x61 )
  {
    if ( v4 == 95 )
    {
      v7 = a1[37];
      v8 = a1[38];
      *a1 = v1 + 2;
      if ( v7 != v8 )
        return *(_QWORD *)v7;
      return 0;
    }
    if ( v4 < 0x30 )
      return 0;
LABEL_15:
    if ( v4 < 0x3A || v4 - 65 <= 0x19 )
    {
      v9 = 0;
      do
      {
        v11 = (unsigned __int8)*v3;
        if ( (unsigned int)v11 < 0x30 )
          break;
        if ( (unsigned int)v11 < 0x3A )
        {
          v10 = -48;
        }
        else
        {
          if ( (unsigned int)(v11 - 65) > 0x19 )
            break;
          v10 = -55;
        }
        *a1 = ++v3;
        v9 = v11 + 36 * v9 + v10;
      }
      while ( v3 != v2 );
      if ( v3 != v2 && *v3 == 95 )
      {
        v12 = a1[37];
        v13 = a1[38];
        v14 = v9 + 1;
        *a1 = v3 + 1;
        if ( v14 < (v13 - v12) >> 3 )
          return *(_QWORD *)(v12 + 8 * v14);
      }
    }
    return 0;
  }
  if ( v4 > 0x7A )
    goto LABEL_15;
  v5 = 0;
  if ( (unsigned __int8)*v3 > 0x68u )
  {
    switch ( v4 )
    {
      case 'i':
        v6 = 3;
        break;
      case 'o':
        v6 = 4;
        break;
      case 's':
        v6 = 2;
        break;
      default:
        return v5;
    }
  }
  else
  {
    switch ( v4 )
    {
      case 'a':
        v6 = 0;
        break;
      case 'b':
        v6 = 1;
        break;
      case 'd':
        v6 = 5;
        break;
      default:
        return v5;
    }
  }
  v16 = (_QWORD *)a1[614];
  *a1 = v1 + 2;
  v17 = v16[1];
  if ( (unsigned __int64)(v17 - 4064) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v18 = a1;
    v19 = malloc(0x1000u);
    if ( v19 == nullptr )
      sub_13E4C();
    v20 = v19;
    v17 = 0;
    *v19 = v16;
    v19[1] = 0;
    v16 = v19;
    a1 = v18;
    v18[614] = v20;
  }
  v16[1] = v17 + 16;
  v21 = (char *)v16 + v17 + 16;
  v22 = a1;
  v23 = *(_WORD *)(v21 + 9);
  v21[8] = 48;
  *((_DWORD *)v21 + 3) = v6;
  *(_WORD *)(v21 + 9) = v23 & 0xF000 | 0x540;
  *(_QWORD *)v21 = off_385E8;
  v24 = sub_26ADC();
  if ( (char *)v24 == v21 )
    return (__int64)v21;
  v25 = (char *)v22[38];
  v5 = v24;
  v26 = v22;
  if ( v25 == (char *)v22[39] )
  {
    v27 = (char *)v22[37];
    v28 = v25 - v27;
    if ( v27 == (char *)(v22 + 40) )
    {
      v29 = (char *)malloc(2 * (v25 - v27));
      if ( v29 == nullptr )
        abort();
      if ( v25 != v27 )
      {
        v30 = v25 - v27;
        v31 = v29;
        memmove(v29, v27, v30);
        v29 = v31;
      }
      v26 = v22;
      v22[37] = v29;
    }
    else
    {
      v29 = (char *)realloc(v27, 2 * (v25 - v27));
      v26 = v22;
      v22[37] = v29;
      if ( v29 == nullptr )
        abort();
    }
    v25 = &v29[v28];
    v26[39] = &v29[8 * (v28 >> 2)];
  }
  v26[38] = v25 + 8;
  *(_QWORD *)v25 = v5;
  return v5;
}


// Address: 0x19A20 | Function: sub_19A20
__int64 __fastcall sub_19A20(__int64 a1, _BYTE *a2, __int64 a3, char *a4)
{
  __int64 v5; // x19
  __int64 v7; // x2
  __int64 result; // x0
  unsigned __int8 *v9; // x8
  unsigned __int8 *v10; // x9
  char v11; // w26
  unsigned int v12; // w11
  __int64 v13; // x0
  __int64 v14; // x0
  unsigned __int8 *v15; // x10
  int v16; // w8
  __int64 v17; // x21
  char *v18; // x22
  _QWORD *v19; // x23
  __int64 v20; // x8
  _QWORD *v21; // x0
  __int64 v22; // x9
  __int64 v23; // x8
  char v24; // w8
  _QWORD *v25; // x21
  __int64 v26; // x8
  __int64 v27; // x22
  _QWORD *v28; // x0
  __int64 (__fastcall **v29)(); // x9
  char v30; // w10
  __int64 v31; // x21
  __int64 v32; // x23
  __int64 v33; // x22
  __int64 *v34; // x27
  unsigned __int64 v35; // x21
  __int64 *v36; // x25
  __int64 *v37; // x24
  __int64 v38; // x23
  char *v39; // x0
  size_t v40; // x2
  char *v41; // x25
  unsigned __int8 *v42; // x8
  char *v43; // x0
  _QWORD *v44; // x24
  char *v45; // x22
  __int64 v46; // x1
  __int64 v47; // x23
  __int64 v48; // x8
  _QWORD *v49; // x0
  __int16 v50; // w8
  __int64 v51; // x11
  __int64 v52; // x8
  __int16 v53; // w9
  unsigned int v54; // w9
  int v55; // w9
  char *v56; // [xsp+8h] [xbp-18h] BYREF
  __int64 v57; // [xsp+10h] [xbp-10h] BYREF
  char v58[4]; // [xsp+1Ch] [xbp-4h] BYREF
  __int64 v59; // [xsp+38h] [xbp+18h] BYREF

  v5 = a3;
  v56 = a4;
  v57 = a3;
  if ( (sub_18224(a1, &v56) & 1) != 0 )
    return 0;
  v9 = *(unsigned __int8 **)a1;
  v10 = *(unsigned __int8 **)(a1 + 8);
  if ( v5 == 0 )
    goto LABEL_8;
  if ( v9 == v10 )
  {
    v11 = 1;
    goto LABEL_31;
  }
  if ( *v9 == 70 )
  {
    v11 = 0;
    *(_QWORD *)a1 = ++v9;
    if ( v9 == v10 )
      goto LABEL_11;
  }
  else
  {
LABEL_8:
    v11 = 1;
    if ( v9 == v10 )
      goto LABEL_11;
  }
  if ( *v9 == 76 )
    *(_QWORD *)a1 = ++v9;
LABEL_11:
  if ( v10 != v9 )
  {
    v12 = *v9;
    if ( v12 >= 0x31 )
    {
      if ( v12 <= 0x39 )
      {
        v13 = sub_1869C((unsigned __int8 **)a1);
LABEL_32:
        v17 = v13;
        goto LABEL_33;
      }
      if ( v12 == 85 )
      {
        v13 = sub_20C20(a1, (size_t)a2);
        goto LABEL_32;
      }
    }
  }
  if ( (unsigned __int64)(v10 - v9) >= 2 && *(_WORD *)v9 == 17220 )
  {
    v32 = *(_QWORD *)(a1 + 16);
    v31 = *(_QWORD *)(a1 + 24);
    *(_QWORD *)a1 = v9 + 2;
    result = sub_1869C((unsigned __int8 **)a1);
    if ( result == 0 )
      return result;
    v33 = result;
    v34 = (__int64 *)(a1 + 40);
    v35 = (v31 - v32) >> 3;
    while ( 1 )
    {
      v36 = *(__int64 **)(a1 + 24);
      if ( v36 == *(__int64 **)(a1 + 32) )
      {
        v37 = *(__int64 **)(a1 + 16);
        v38 = (char *)v36 - (char *)v37;
        if ( v37 == v34 )
        {
          v39 = (char *)malloc(2 * ((char *)v36 - (char *)v37));
          if ( v39 == nullptr )
            abort();
          if ( v36 != v34 )
          {
            v40 = (char *)v36 - (char *)v37;
            v41 = v39;
            memmove(v39, v37, v40);
            v39 = v41;
          }
          *(_QWORD *)(a1 + 16) = v39;
        }
        else
        {
          v39 = (char *)realloc(*(void **)(a1 + 16), 2 * ((char *)v36 - (char *)v37));
          *(_QWORD *)(a1 + 16) = v39;
          if ( v39 == nullptr )
            abort();
        }
        v36 = (__int64 *)&v39[v38];
        *(_QWORD *)(a1 + 32) = &v39[8 * (v38 >> 2)];
      }
      *(_QWORD *)(a1 + 24) = v36 + 1;
      *v36 = v33;
      v42 = *(unsigned __int8 **)a1;
      if ( *(_QWORD *)a1 != *(_QWORD *)(a1 + 8) && *v42 == 69 )
        break;
      v33 = sub_1869C((unsigned __int8 **)a1);
      result = 0;
      if ( v33 == 0 )
        return result;
    }
    *(_QWORD *)a1 = v42 + 1;
    v43 = sub_17574((_QWORD *)a1, v35);
    v44 = *(_QWORD **)(a1 + 4912);
    v45 = v43;
    v47 = v46;
    v48 = v44[1];
    if ( (unsigned __int64)(v48 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
    {
      v49 = malloc(0x1000u);
      if ( v49 == nullptr )
        goto LABEL_92;
      v48 = 0;
      *v49 = v44;
      v49[1] = 0;
      v44 = v49;
      *(_QWORD *)(a1 + 4912) = v49;
    }
    v44[1] = v48 + 32;
    *(_QWORD *)((char *)v44 + v48 + 16) = off_38738;
    v17 = (__int64)v44 + v48 + 16;
    v50 = *(_WORD *)((char *)v44 + v48 + 25);
    *(_QWORD *)(v17 + 16) = v45;
    *(_QWORD *)(v17 + 24) = v47;
    *(_BYTE *)(v17 + 8) = 53;
    *(_WORD *)(v17 + 9) = v50 & 0xF000 | 0x540;
    goto LABEL_33;
  }
  if ( v10 == v9 || (unsigned int)*v9 - 67 > 1 )
  {
LABEL_31:
    v13 = sub_2640C(a1, a2);
    goto LABEL_32;
  }
  result = 0;
  if ( v5 == 0 || v56 != nullptr )
    return result;
  if ( *(_BYTE *)(v5 + 8) == 48 )
  {
    v59 = v5;
    v14 = sub_273BC(a1, &v59);
    v9 = *(unsigned __int8 **)a1;
    v10 = *(unsigned __int8 **)(a1 + 8);
    v5 = v14;
    v57 = v14;
  }
  if ( v9 == v10 )
    return 0;
  if ( *v9 != 67 )
  {
    result = 0;
    if ( (unsigned __int64)(v10 - v9) < 2 )
      return result;
    if ( *v9 != 68 )
      return result;
    v54 = v9[1];
    result = 0;
    if ( v54 > 0x35 || ((1LL << v54) & 0x37000000000000LL) == 0 )
      return result;
    LODWORD(v59) = v54 - 48;
    *(_QWORD *)a1 = v9 + 2;
    if ( a2 != nullptr )
      *a2 = 1;
    v58[0] = 1;
    goto LABEL_90;
  }
  v15 = v9 + 1;
  *(_QWORD *)a1 = v9 + 1;
  if ( v9 + 1 == v10 || *v15 != 73 )
  {
    v16 = 0;
  }
  else
  {
    v15 = v9 + 2;
    v16 = 1;
    *(_QWORD *)a1 = v15;
  }
  if ( v10 == v15 )
    return 0;
  v55 = *v15;
  if ( (unsigned int)(v55 - 49) > 4 )
    return 0;
  LODWORD(v59) = v55 - 48;
  *(_QWORD *)a1 = v15 + 1;
  if ( a2 != nullptr )
    *a2 = 1;
  if ( v16 == 0 || sub_16998((unsigned __int8 **)a1, (size_t)a2, v7) != 0 )
  {
    v58[0] = 0;
LABEL_90:
    v13 = sub_27460(a1, &v57, v58, &v59);
    goto LABEL_32;
  }
  v17 = 0;
LABEL_33:
  if ( v17 != 0 && (v18 = v56, v56 != nullptr) )
  {
    v19 = *(_QWORD **)(a1 + 4912);
    v20 = v19[1];
    if ( (unsigned __int64)(v20 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
    {
      v21 = malloc(0x1000u);
      if ( v21 == nullptr )
        goto LABEL_92;
      v20 = 0;
      *v21 = v19;
      v21[1] = 0;
      v19 = v21;
      *(_QWORD *)(a1 + 4912) = v21;
    }
    v22 = v20 + 32;
    v23 = (__int64)v19 + v20;
    v19[1] = v22;
    *(_QWORD *)(v23 + 16) = off_38818;
    v23 += 16;
    LOWORD(v22) = *(_WORD *)(v23 + 9);
    *(_QWORD *)(v23 + 16) = v18;
    *(_QWORD *)(v23 + 24) = v17;
    v17 = v23;
    *(_BYTE *)(v23 + 8) = 28;
    *(_WORD *)(v23 + 9) = v22 & 0xF000 | 0x540;
  }
  else if ( v17 == 0 )
  {
    return 0;
  }
  result = sub_26ADC(a1, v17);
  if ( result != 0 )
    v24 = v11;
  else
    v24 = 1;
  if ( (v24 & 1) == 0 )
  {
    v25 = *(_QWORD **)(a1 + 4912);
    v26 = v25[1];
    if ( (unsigned __int64)(v26 - 4048) > 0xFFFFFFFFFFFFF00FLL )
    {
      v29 = off_38888;
      v30 = 25;
      goto LABEL_73;
    }
    v27 = result;
    v28 = malloc(0x1000u);
    if ( v28 != nullptr )
    {
      v26 = 0;
      *v28 = v25;
      v28[1] = 0;
      v29 = off_38888;
      v30 = 25;
      goto LABEL_52;
    }
LABEL_92:
    sub_13E4C();
  }
  if ( result != 0 && v5 != 0 )
  {
    v25 = *(_QWORD **)(a1 + 4912);
    v26 = v25[1];
    if ( (unsigned __int64)(v26 - 4048) > 0xFFFFFFFFFFFFF00FLL )
    {
      v29 = off_388F8;
      v30 = 24;
      goto LABEL_73;
    }
    v27 = result;
    v28 = malloc(0x1000u);
    if ( v28 != nullptr )
    {
      v26 = 0;
      v29 = off_388F8;
      v30 = 24;
      *v28 = v25;
      v28[1] = 0;
LABEL_52:
      v25 = v28;
      *(_QWORD *)(a1 + 4912) = v28;
      result = v27;
LABEL_73:
      v51 = v26 + 32;
      v52 = (__int64)v25 + v26;
      v25[1] = v51;
      *(_QWORD *)(v52 + 16) = v29;
      v52 += 16;
      v53 = *(_WORD *)(v52 + 9);
      *(_QWORD *)(v52 + 16) = v5;
      *(_QWORD *)(v52 + 24) = result;
      result = v52;
      *(_BYTE *)(v52 + 8) = v30;
      *(_WORD *)(v52 + 9) = v53 & 0xF000 | 0x540;
      return result;
    }
    goto LABEL_92;
  }
  return result;
}


// Address: 0x19F90 | Function: sub_19F90
long double __fastcall sub_19F90(__int64 a1, long double *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x0
  __int16 v8; // w8
  long double result; // q0

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 32;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_36BB8;
  v7 = (__int64)v2 + v4 + 16;
  v8 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(v7 + 8) = 8;
  result = *a2;
  *(_WORD *)(v7 + 9) = v8 & 0xF000 | 0x540;
  *(long double *)(v7 + 16) = result;
  return result;
}


// Address: 0x1A030 | Function: sub_1A030
_QWORD *__fastcall sub_1A030(_QWORD *result, _QWORD *size)
{
  char *v2; // x21
  _QWORD *v3; // x22
  _QWORD *v4; // x23
  char *v5; // x20
  signed __int64 v6; // x19
  char *v7; // x8
  char *v8; // x0
  char *v9; // x21
  __int64 v10; // x8

  v2 = (char *)result[1];
  if ( v2 == (char *)result[2] )
  {
    v3 = size;
    v4 = result;
    v5 = (char *)*result;
    v6 = (signed __int64)&v2[-*result];
    if ( (_QWORD *)*result == result + 3 )
    {
      v8 = (char *)malloc(2 * v6);
      if ( v8 == nullptr )
        abort();
      v7 = v8;
      if ( v2 != v5 )
      {
        v9 = v8;
        memmove(v8, v5, v6);
        v7 = v9;
      }
      result = v4;
      *v4 = v7;
    }
    else
    {
      v7 = (char *)realloc((void *)*result, 2 * v6);
      result = v4;
      *v4 = v7;
      if ( v7 == nullptr )
        abort();
    }
    v2 = &v7[v6];
    size = v3;
    result[1] = &v7[v6];
    result[2] = &v7[8 * (v6 >> 2)];
  }
  v10 = *size;
  result[1] = v2 + 8;
  *(_QWORD *)v2 = v10;
  return result;
}


// Address: 0x1A108 | Function: sub_1A108
char *__fastcall sub_1A108(__int64 a1, char *s)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  char *v7; // x20
  size_t v8; // x0
  size_t v9; // x8
  __int16 v11; // w9

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v7 = (char *)v2 + v4;
  v2[1] = v4 + 32;
  v8 = strlen(s);
  *((_QWORD *)v7 + 2) = off_36BB8;
  v9 = v8;
  v11 = *(_WORD *)(v7 + 25) & 0xF000;
  v7[24] = 8;
  *((_QWORD *)v7 + 4) = s;
  *((_QWORD *)v7 + 5) = v9;
  *(_WORD *)(v7 + 25) = v11 | 0x540;
  return v7 + 16;
}


// Address: 0x1A1B4 | Function: sub_1A1B4
__int64 __fastcall sub_1A1B4(__int64 a1)
{
  char v1; // w19
  char v2; // w8
  __int64 v3; // x8
  unsigned int v4; // w9
  __int64 v5; // x20

  v1 = *(_BYTE *)(a1 + 32);
  if ( (v1 & 1) != 0 )
  {
    v2 = 0;
  }
  else
  {
    v3 = *(_QWORD *)(a1 + 24);
    *(_BYTE *)(a1 + 32) = 1;
    v4 = *(unsigned __int8 *)(v3 + 9);
    if ( (v4 & 0xC0) == 0x80 )
    {
      v5 = a1;
      v2 = (**(__int64 (__fastcall ***)(__int64))v3)(v3);
      a1 = v5;
    }
    else
    {
      v2 = v4 < 0x40;
    }
    *(_BYTE *)(a1 + 32) = v1;
  }
  return v2 & 1;
}


// Address: 0x1A230 | Function: sub_1A230
void __fastcall __noreturn sub_1A230(__int64 a1)
{
  char v1; // w19
  __int64 v2; // x20

  *(_BYTE *)(v2 + 32) = v1;
  sub_2E950(a1);
}


// Address: 0x1A238 | Function: sub_1A238
__int64 __fastcall sub_1A238(__int64 a1)
{
  char v1; // w19
  char v2; // w8
  _BYTE *v3; // x8
  int v4; // w9
  __int64 v5; // x20

  v1 = *(_BYTE *)(a1 + 32);
  if ( (v1 & 1) != 0 )
  {
    v2 = 0;
  }
  else
  {
    v3 = *(_BYTE **)(a1 + 24);
    *(_BYTE *)(a1 + 32) = 1;
    v4 = v3[10] & 3;
    if ( v4 == 2 )
    {
      v5 = a1;
      v2 = (*(__int64 (__fastcall **)(_BYTE *))(*(_QWORD *)v3 + 8LL))(v3);
      a1 = v5;
    }
    else
    {
      v2 = v4 == 0;
    }
    *(_BYTE *)(a1 + 32) = v1;
  }
  return v2 & 1;
}


// Address: 0x1A2B4 | Function: sub_1A2B4
void __fastcall __noreturn sub_1A2B4(__int64 a1)
{
  char v1; // w19
  __int64 v2; // x20

  *(_BYTE *)(v2 + 32) = v1;
  sub_2E950(a1);
}


// Address: 0x1A2BC | Function: sub_1A2BC
__int64 __fastcall sub_1A2BC(__int64 a1)
{
  char v1; // w19
  char v2; // w8
  __int64 v3; // x8
  int v4; // w9
  __int64 v5; // x20

  v1 = *(_BYTE *)(a1 + 32);
  if ( (v1 & 1) != 0 )
  {
    v2 = 0;
  }
  else
  {
    v3 = *(_QWORD *)(a1 + 24);
    *(_BYTE *)(a1 + 32) = 1;
    v4 = (*(unsigned __int16 *)(v3 + 9) >> 10) & 3;
    if ( v4 == 2 )
    {
      v5 = a1;
      v2 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v3 + 16LL))(v3);
      a1 = v5;
    }
    else
    {
      v2 = v4 == 0;
    }
    *(_BYTE *)(a1 + 32) = v1;
  }
  return v2 & 1;
}


// Address: 0x1A338 | Function: sub_1A338
void __fastcall __noreturn sub_1A338(__int64 a1)
{
  char v1; // w19
  __int64 v2; // x20

  *(_BYTE *)(v2 + 32) = v1;
  sub_2E950(a1);
}


// Address: 0x1A340 | Function: sub_1A340
__int64 __fastcall sub_1A340(__int64 result)
{
  char v1; // w19
  __int64 v2; // x8
  __int64 v3; // x20

  v1 = *(_BYTE *)(result + 32);
  if ( (v1 & 1) == 0 )
  {
    v2 = *(_QWORD *)(result + 24);
    v3 = result;
    *(_BYTE *)(result + 32) = 1;
    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v2 + 24LL))(v2);
    *(_BYTE *)(v3 + 32) = v1;
  }
  return result;
}


// Address: 0x1A38C | Function: sub_1A38C
void __fastcall __noreturn sub_1A38C(__int64 a1)
{
  char v1; // w19
  __int64 v2; // x20

  *(_BYTE *)(v2 + 32) = v1;
  sub_2E950(a1);
}


// Address: 0x1A394 | Function: sub_1A394
__int64 __fastcall sub_1A394(__int64 result)
{
  char v1; // w20
  __int64 v2; // x19
  __int64 v3; // x0

  v1 = *(_BYTE *)(result + 32);
  if ( (v1 & 1) == 0 )
  {
    v2 = result;
    v3 = *(_QWORD *)(result + 24);
    *(_BYTE *)(v2 + 32) = 1;
    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v3 + 32LL))(v3);
    *(_BYTE *)(v2 + 32) = v1;
  }
  return result;
}


// Address: 0x1A3DC | Function: sub_1A3DC
void __fastcall __noreturn sub_1A3DC(__int64 a1)
{
  __int64 v1; // x19
  char v2; // w20

  *(_BYTE *)(v1 + 32) = v2;
  sub_2E950(a1);
}


// Address: 0x1A3E4 | Function: sub_1A3E4
__int64 __fastcall sub_1A3E4(__int64 result)
{
  char v1; // w20
  __int64 v2; // x19
  __int64 v3; // x0

  v1 = *(_BYTE *)(result + 32);
  if ( (v1 & 1) == 0 )
  {
    v2 = result;
    v3 = *(_QWORD *)(result + 24);
    *(_BYTE *)(v2 + 32) = 1;
    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v3 + 40LL))(v3);
    *(_BYTE *)(v2 + 32) = v1;
  }
  return result;
}


// Address: 0x1A42C | Function: sub_1A42C
void __fastcall __noreturn sub_1A42C(__int64 a1)
{
  __int64 v1; // x19
  char v2; // w20

  *(_BYTE *)(v1 + 32) = v2;
  sub_2E950(a1);
}


// Address: 0x1A434 | Function: sub_1A434
void sub_1A434()
{
  sub_13E30();
}


// Address: 0x1A440 | Function: sub_1A440
__int64 __fastcall sub_1A440(__int64 a1, size_t a2)
{
  unsigned __int8 *v2; // x21
  unsigned __int8 *v3; // x22
  unsigned __int64 v4; // x10
  __int64 result; // x0
  char v7; // w23
  unsigned __int64 v8; // x12
  __int64 v9; // x13
  unsigned __int8 *v10; // x9
  unsigned int v11; // w11
  unsigned __int64 v12; // x14
  unsigned __int8 *v13; // x15
  unsigned int v14; // w16
  unsigned __int8 *v15; // x25
  const char *v16; // x20
  unsigned __int8 *v17; // x27
  size_t v18; // x0
  size_t v19; // x1
  __int64 v20; // x8
  size_t v21; // x26
  const char *v22; // x24
  int v23; // w11
  unsigned __int64 v24; // x8
  unsigned int v25; // w21
  _QWORD *v26; // x22
  __int64 v27; // x20
  __int64 v28; // x8
  _QWORD *v29; // x0
  __int16 v30; // w8
  int v31; // w9
  int v32; // w23
  int v33; // w24
  __int64 *v34; // x24
  unsigned __int8 *v35; // x8
  unsigned __int64 v36; // x20
  char *v37; // x0
  __int64 *v38; // x23
  char *v39; // x8
  __int64 *v40; // x22
  __int64 v41; // x25
  __int64 v42; // x21
  size_t v43; // x2
  char *v44; // x23
  __int64 v45; // x1
  size_t v46; // x1
  unsigned int v47; // w21
  __int64 v48; // x0
  char v49; // w20
  unsigned __int8 *v50; // x8
  unsigned __int64 v51; // x20
  char v52; // w24
  int v53; // w9
  int v54; // w8
  _QWORD *v55; // x22
  unsigned int v56; // w21
  __int64 v57; // x20
  __int64 v58; // x8
  _QWORD *v59; // x0
  __int16 v60; // w8
  __int64 *v61; // x26
  unsigned __int64 v62; // x20
  char *v63; // x0
  __int64 *v64; // x23
  char *v65; // x8
  __int64 *v66; // x22
  __int64 v67; // x24
  __int64 v68; // x21
  size_t v69; // x2
  char *v70; // x23
  __int64 *v71; // x24
  unsigned __int64 v72; // x20
  char *v73; // x0
  __int64 *v74; // x23
  char *v75; // x8
  unsigned __int8 *v76; // x8
  __int64 *v77; // x22
  __int64 v78; // x26
  __int64 v79; // x21
  size_t v80; // x2
  char *v81; // x23
  size_t v82; // x1
  __int64 *v83; // x24
  unsigned __int64 v84; // x20
  char *v85; // x0
  __int64 *v86; // x23
  char *v87; // x8
  unsigned __int8 *v88; // x8
  __int64 *v89; // x22
  __int64 v90; // x25
  __int64 v91; // x21
  size_t v92; // x2
  char *v93; // x23
  __int64 v94; // x20
  _QWORD *v95; // x22
  __int64 v96; // x8
  _QWORD *v97; // x0
  __int16 v98; // w8
  __int64 *v99; // x26
  char *v100; // x0
  __int64 *v101; // x23
  char *v102; // x8
  unsigned __int8 *v103; // x8
  __int64 *v104; // x22
  __int64 v105; // x27
  __int64 v106; // x21
  size_t v107; // x2
  char *v108; // x23
  size_t v109; // x1
  char v110; // w21
  unsigned __int64 v111; // x20
  char *v112; // x0
  __int64 *v113; // x24
  char *v114; // x8
  unsigned __int8 *v115; // x8
  __int64 *v116; // x23
  __int64 v117; // x27
  __int64 v118; // x22
  size_t v119; // x2
  char *v120; // x24
  size_t v121; // x1
  unsigned __int64 v122; // x20
  unsigned __int8 *v123; // x8
  unsigned int v124; // w9
  unsigned __int64 v125; // x10
  __int64 v126; // x11
  unsigned __int64 v127; // x12
  unsigned __int8 *v128; // x13
  unsigned int v129; // w14
  unsigned __int8 *v130; // x25
  int v131; // w8
  const char *v132; // x20
  __int64 v133; // x20
  __int64 v134; // x22
  char *v135; // x0
  int v136; // w8
  __int64 v137; // x1
  _QWORD *v138; // x1
  int v139; // w8
  __int64 v140; // x1
  __int64 v141; // x1
  char *v142; // x0
  int v143; // w8
  __int64 v144; // x1
  unsigned __int8 *v145; // x8
  _QWORD *v146; // x0
  size_t v147; // x1
  __int64 v148; // x21
  unsigned __int8 *v149; // x8
  __int64 v150; // x1
  const char *v151; // x21
  size_t v152; // x0
  size_t v153; // x25
  _BYTE *v154; // x24
  _QWORD *v155; // x21
  __int64 v156; // x8
  _QWORD *v157; // x0
  __int16 v158; // w8
  char *v159; // x0
  __int64 v160; // x1
  unsigned __int8 *v161; // x8
  int v162; // w9
  char v163[4]; // [xsp+4h] [xbp-3Ch] BYREF
  _QWORD v164[2]; // [xsp+8h] [xbp-38h] BYREF
  _QWORD v165[2]; // [xsp+18h] [xbp-28h] BYREF
  __int64 v166; // [xsp+28h] [xbp-18h] BYREF
  _QWORD v167[2]; // [xsp+30h] [xbp-10h] BYREF
  char v168[4]; // [xsp+58h] [xbp+18h] BYREF
  int v169; // [xsp+5Ch] [xbp+1Ch] BYREF

  v2 = *(unsigned __int8 **)a1;
  v3 = *(unsigned __int8 **)(a1 + 8);
  v4 = (unsigned __int64)&v3[-*(_QWORD *)a1];
  if ( v4 < 2 )
    return 0;
  if ( *(_WORD *)v2 == 29543 )
  {
    v2 += 2;
    v7 = 1;
    v4 = v3 - v2;
    *(_QWORD *)a1 = v2;
    v168[0] = 1;
    if ( (unsigned __int64)(v3 - v2) < 2 )
      return 0;
  }
  else
  {
    v7 = 0;
    v168[0] = 0;
  }
  v8 = 0;
  v9 = 61;
  v10 = v2 + 1;
  v11 = *v2;
  do
  {
    v12 = (v8 + v9) >> 1;
    v13 = (unsigned __int8 *)&unk_36CF8 + 16 * v12;
    v14 = *v13;
    if ( v14 < v11 )
    {
      v8 = v12 + 1;
    }
    else if ( v14 == v11 )
    {
      if ( v13[1] >= (unsigned int)*v10 )
        v9 = (v8 + v9) >> 1;
      else
        v8 = v12 + 1;
    }
    else
    {
      v9 = (v8 + v9) >> 1;
    }
  }
  while ( v9 != v8 );
  v15 = (unsigned __int8 *)&unk_36CF8 + 16 * v8;
  if ( *v15 == v11 && v15[1] == *v10 )
  {
    v16 = *((const char **)v15 + 1);
    v17 = v2 + 2;
    *(_QWORD *)a1 = v2 + 2;
    v18 = strlen(v16);
    v20 = v15[2];
    if ( (unsigned int)v20 > 0xA )
    {
      v22 = v16;
      v21 = v18;
      goto LABEL_41;
    }
    if ( v18 >= 8 && *(_QWORD *)v16 == 0x726F74617265706FLL )
    {
      v21 = v18 - 8;
      v22 = v16 + 8;
      if ( v18 != 8 && *v22 == 32 )
      {
        v22 = v16 + 9;
        v21 = v18 - 9;
      }
LABEL_41:
      v165[0] = v22;
      v165[1] = v21;
      if ( (unsigned int)v20 > 0xC )
      {
        *(_BYTE *)(a1 + 776) = (_BYTE)v16;
        sub_2E950(v18);
      }
      result = 0;
      switch ( v20 )
      {
        case 0LL:
          v25 = v15[3];
          result = sub_1A440(a1);
          if ( result == 0 )
            return result;
          v26 = *(_QWORD **)(a1 + 4912);
          v27 = result;
          v28 = v26[1];
          if ( (unsigned __int64)(v28 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
          {
            v29 = malloc(0x1000u);
            if ( v29 == nullptr )
              goto LABEL_287;
            v28 = 0;
            *v29 = v26;
            v29[1] = 0;
            v26 = v29;
            *(_QWORD *)(a1 + 4912) = v29;
          }
          v26[1] = v28 + 48;
          *(_QWORD *)((char *)v26 + v28 + 16) = off_37158;
          result = (__int64)v26 + v28 + 16;
          v30 = *(_WORD *)((char *)v26 + v28 + 25);
          *(_BYTE *)(result + 8) = 66;
          *(_QWORD *)(result + 16) = v22;
          *(_QWORD *)(result + 24) = v21;
          *(_QWORD *)(result + 32) = v27;
          *(_WORD *)(result + 9) = v30 & 0xF000 | (v25 >> 1) | 0x540;
          return result;
        case 1LL:
          if ( v17 == v3 || *v17 != 95 )
          {
            result = sub_1A440(a1);
            v167[0] = result;
            if ( result != 0 )
            {
              LODWORD(v164[0]) = (char)v15[3] >> 1;
              return sub_1B7F0(a1, v167, v165, v164);
            }
          }
          else
          {
            v53 = (char)v15[3];
            *(_QWORD *)a1 = v2 + 3;
            v167[0] = v22;
            v167[1] = v21;
            LODWORD(v166) = v53 >> 1;
            result = sub_1A440(a1);
            v164[0] = result;
            if ( result != 0 )
              return sub_1E984(a1, v167, v164, &v166);
          }
          return result;
        case 2LL:
          v54 = (char)v15[3];
          v167[0] = v22;
          v167[1] = v21;
          v169 = v54 >> 1;
          result = sub_1A440(a1);
          v164[0] = result;
          if ( result != 0 )
          {
            result = sub_1A440(a1);
            v166 = result;
            if ( result != 0 )
              return sub_1E3A0(a1, v164, v167, &v166, &v169);
          }
          return result;
        case 3LL:
          result = sub_1A440(a1);
          v167[0] = result;
          if ( result != 0 )
          {
            result = sub_1A440(a1);
            v164[0] = result;
            if ( result != 0 )
            {
              LODWORD(v166) = (char)v15[3] >> 1;
              return sub_1B8B0(a1, v167, v164, &v166);
            }
          }
          return result;
        case 4LL:
          result = sub_1A440(a1);
          v167[0] = result;
          if ( result != 0 )
          {
            result = sub_1A440(a1);
            v164[0] = result;
            if ( result != 0 )
            {
              LODWORD(v166) = (char)v15[3] >> 1;
              return sub_1B96C(a1, v167, v165, v164, &v166);
            }
          }
          return result;
        case 5LL:
          v61 = (__int64 *)(a1 + 40);
          v62 = (__int64)(*(_QWORD *)(a1 + 24) - *(_QWORD *)(a1 + 16)) >> 3;
          while ( 2 )
          {
            if ( v17 != v3 && *v17 == 95 )
            {
              *(_QWORD *)a1 = v17 + 1;
              v167[0] = sub_17574((_QWORD *)a1, v62);
              v167[1] = v109;
              result = sub_1544C(a1, v109);
              v166 = result;
              if ( result == 0 )
                return result;
              v110 = sub_147F8((const void **)a1, "pi", 2u);
              v111 = (__int64)(*(_QWORD *)(a1 + 24) - *(_QWORD *)(a1 + 16)) >> 3;
              while ( 1 )
              {
                v115 = *(unsigned __int8 **)a1;
                if ( *(_QWORD *)a1 != *(_QWORD *)(a1 + 8) && *v115 == 69 )
                {
                  *(_QWORD *)a1 = v115 + 1;
                  v142 = sub_17574((_QWORD *)a1, v111);
                  v143 = (char)v15[3];
                  v164[0] = v142;
                  v164[1] = v144;
                  v163[0] = v143 & 1;
                  v169 = v143 >> 1;
                  return sub_1BA38(a1, v167, &v166, v164, v168, v163, &v169);
                }
                if ( (v110 & 1) == 0 )
                  return 0;
                result = sub_1A440(a1);
                if ( result == 0 )
                  break;
                v113 = *(__int64 **)(a1 + 24);
                if ( v113 == *(__int64 **)(a1 + 32) )
                {
                  v116 = *(__int64 **)(a1 + 16);
                  v117 = result;
                  v118 = (char *)v113 - (char *)v116;
                  if ( v116 == v61 )
                  {
                    v112 = (char *)malloc(2 * ((char *)v113 - (char *)v116));
                    if ( v112 == nullptr )
                      abort();
                    if ( v113 != v61 )
                    {
                      v119 = (char *)v113 - (char *)v116;
                      v120 = v112;
                      memmove(v112, v116, v119);
                      v112 = v120;
                    }
                    *(_QWORD *)(a1 + 16) = v112;
                  }
                  else
                  {
                    v112 = (char *)realloc(*(void **)(a1 + 16), 2 * ((char *)v113 - (char *)v116));
                    *(_QWORD *)(a1 + 16) = v112;
                    if ( v112 == nullptr )
                      abort();
                  }
                  v113 = (__int64 *)&v112[v118];
                  v114 = &v112[8 * (v118 >> 2)];
                  result = v117;
                  *(_QWORD *)(a1 + 24) = v113;
                  *(_QWORD *)(a1 + 32) = v114;
                }
                *(_QWORD *)(a1 + 24) = v113 + 1;
                *v113 = result;
              }
            }
            else
            {
              result = sub_1A440(a1);
              if ( result != 0 )
              {
                v64 = *(__int64 **)(a1 + 24);
                if ( v64 == *(__int64 **)(a1 + 32) )
                {
                  v66 = *(__int64 **)(a1 + 16);
                  v67 = result;
                  v68 = (char *)v64 - (char *)v66;
                  if ( v66 == v61 )
                  {
                    v63 = (char *)malloc(2 * ((char *)v64 - (char *)v66));
                    if ( v63 == nullptr )
                      abort();
                    if ( v64 != v61 )
                    {
                      v69 = (char *)v64 - (char *)v66;
                      v70 = v63;
                      memmove(v63, v66, v69);
                      v63 = v70;
                    }
                    *(_QWORD *)(a1 + 16) = v63;
                  }
                  else
                  {
                    v63 = (char *)realloc(*(void **)(a1 + 16), 2 * ((char *)v64 - (char *)v66));
                    *(_QWORD *)(a1 + 16) = v63;
                    if ( v63 == nullptr )
                      abort();
                  }
                  v64 = (__int64 *)&v63[v68];
                  v65 = &v63[8 * (v68 >> 2)];
                  result = v67;
                  *(_QWORD *)(a1 + 24) = v64;
                  *(_QWORD *)(a1 + 32) = v65;
                }
                *(_QWORD *)(a1 + 24) = v64 + 1;
                *v64 = result;
                v17 = *(unsigned __int8 **)a1;
                v3 = *(unsigned __int8 **)(a1 + 8);
                continue;
              }
            }
            break;
          }
          return result;
        case 6LL:
          result = sub_1A440(a1);
          if ( result == 0 )
            return result;
          v55 = *(_QWORD **)(a1 + 4912);
          v56 = v15[3];
          v57 = result;
          v58 = v55[1];
          if ( (unsigned __int64)(v58 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
          {
            v59 = malloc(0x1000u);
            if ( v59 == nullptr )
              goto LABEL_287;
            v58 = 0;
            *v59 = v55;
            v59[1] = 0;
            v55 = v59;
            *(_QWORD *)(a1 + 4912) = v59;
          }
          v55[1] = v58 + 32;
          *(_QWORD *)((char *)v55 + v58 + 16) = off_37388;
          result = (__int64)v55 + v58 + 16;
          v60 = *(_WORD *)((char *)v55 + v58 + 25);
          *(_BYTE *)(result + 8) = 65;
          *(_QWORD *)(result + 16) = v57;
          *(_BYTE *)(result + 24) = v7;
          *(_WORD *)(result + 9) = v60 & 0xF000 | (v56 >> 1) | 0x540;
          *(_BYTE *)(result + 25) = v56 & 1;
          return result;
        case 7LL:
          result = sub_1A440(a1);
          v164[0] = result;
          if ( result == 0 )
            return result;
          v71 = (__int64 *)(a1 + 40);
          v72 = (__int64)(*(_QWORD *)(a1 + 24) - *(_QWORD *)(a1 + 16)) >> 3;
          while ( 2 )
          {
            v76 = *(unsigned __int8 **)a1;
            if ( *(_QWORD *)a1 != *(_QWORD *)(a1 + 8) && *v76 == 69 )
            {
              *(_QWORD *)a1 = v76 + 1;
              v135 = sub_17574((_QWORD *)a1, v72);
              v136 = (char)v15[3];
              v167[0] = v135;
              v167[1] = v137;
              v138 = v164;
              v139 = v136 >> 1;
              goto LABEL_233;
            }
            result = sub_1A440(a1);
            if ( result != 0 )
            {
              v74 = *(__int64 **)(a1 + 24);
              if ( v74 == *(__int64 **)(a1 + 32) )
              {
                v77 = *(__int64 **)(a1 + 16);
                v78 = result;
                v79 = (char *)v74 - (char *)v77;
                if ( v77 == v71 )
                {
                  v73 = (char *)malloc(2 * ((char *)v74 - (char *)v77));
                  if ( v73 == nullptr )
                    abort();
                  if ( v74 != v71 )
                  {
                    v80 = (char *)v74 - (char *)v77;
                    v81 = v73;
                    memmove(v73, v77, v80);
                    v73 = v81;
                  }
                  *(_QWORD *)(a1 + 16) = v73;
                }
                else
                {
                  v73 = (char *)realloc(*(void **)(a1 + 16), 2 * ((char *)v74 - (char *)v77));
                  *(_QWORD *)(a1 + 16) = v73;
                  if ( v73 == nullptr )
                    abort();
                }
                v74 = (__int64 *)&v73[v79];
                v75 = &v73[8 * (v79 >> 2)];
                result = v78;
                *(_QWORD *)(a1 + 24) = v74;
                *(_QWORD *)(a1 + 32) = v75;
              }
              *(_QWORD *)(a1 + 24) = v74 + 1;
              *v74 = result;
              continue;
            }
            return result;
          }
        case 8LL:
          v49 = *(_BYTE *)(a1 + 776);
          *(_BYTE *)(a1 + 776) = 0;
          result = sub_1544C(a1, v19);
          v164[0] = result;
          *(_BYTE *)(a1 + 776) = v49;
          if ( result == 0 )
            return result;
          v50 = *(unsigned __int8 **)a1;
          v51 = (__int64)(*(_QWORD *)(a1 + 24) - *(_QWORD *)(a1 + 16)) >> 3;
          if ( *(_QWORD *)a1 == *(_QWORD *)(a1 + 8) || *v50 != 95 )
          {
            v52 = 0;
          }
          else
          {
            v52 = 1;
            *(_QWORD *)a1 = v50 + 1;
          }
          v99 = (__int64 *)(a1 + 40);
          break;
        case 9LL:
          result = sub_1A440(a1);
          v167[0] = result;
          if ( result != 0 )
          {
            result = sub_1A440(a1);
            v164[0] = result;
            if ( result != 0 )
            {
              result = sub_1A440(a1);
              v166 = result;
              if ( result != 0 )
              {
                v169 = (char)v15[3] >> 1;
                return sub_1BCA4(a1, v167, v164, &v166, &v169);
              }
            }
          }
          return result;
        case 10LL:
          return result;
        case 11LL:
          result = sub_1544C(a1, v19);
          v167[0] = result;
          if ( result != 0 )
          {
            result = sub_1A440(a1);
            v164[0] = result;
            if ( result != 0 )
            {
              LODWORD(v166) = (char)v15[3] >> 1;
              return sub_1BD6C(a1, v165, v167, v164, &v166);
            }
          }
          return result;
        case 12LL:
          v47 = v15[3];
          if ( (v47 & 1) != 0 )
            v48 = sub_1544C(a1, v19);
          else
            v48 = sub_1A440(a1);
          v94 = v48;
          if ( v48 == 0 )
            return 0;
          v95 = *(_QWORD **)(a1 + 4912);
          v96 = v95[1];
          if ( (unsigned __int64)(v96 - 4016) <= 0xFFFFFFFFFFFFF00FLL )
          {
            v97 = malloc(0x1000u);
            if ( v97 == nullptr )
              goto LABEL_287;
            v96 = 0;
            *v97 = v95;
            v97[1] = 0;
            v95 = v97;
            *(_QWORD *)(a1 + 4912) = v97;
          }
          v95[1] = v96 + 64;
          *(_QWORD *)((char *)v95 + v96 + 16) = off_375B8;
          result = (__int64)v95 + v96 + 16;
          *(_BYTE *)(result + 8) = 60;
          v98 = *(_WORD *)((char *)v95 + v96 + 25);
          *(_QWORD *)(result + 16) = v22;
          *(_QWORD *)(result + 24) = v21;
          *(_QWORD *)(result + 40) = 0;
          *(_QWORD *)(result + 48) = 0;
          *(_QWORD *)(result + 32) = v94;
          *(_WORD *)(result + 9) = v98 & 0xF000 | (v47 >> 1) | 0x540;
          return result;
      }
      while ( 1 )
      {
        v103 = *(unsigned __int8 **)a1;
        if ( *(_QWORD *)a1 != *(_QWORD *)(a1 + 8) && *v103 == 69 )
          break;
        result = sub_1A440(a1);
        if ( result == 0 )
          return result;
        v101 = *(__int64 **)(a1 + 24);
        if ( v101 == *(__int64 **)(a1 + 32) )
        {
          v104 = *(__int64 **)(a1 + 16);
          v105 = result;
          v106 = (char *)v101 - (char *)v104;
          if ( v104 == v99 )
          {
            v100 = (char *)malloc(2 * ((char *)v101 - (char *)v104));
            if ( v100 == nullptr )
              abort();
            if ( v101 != v99 )
            {
              v107 = (char *)v101 - (char *)v104;
              v108 = v100;
              memmove(v100, v104, v107);
              v100 = v108;
            }
            *(_QWORD *)(a1 + 16) = v100;
          }
          else
          {
            v100 = (char *)realloc(*(void **)(a1 + 16), 2 * ((char *)v101 - (char *)v104));
            *(_QWORD *)(a1 + 16) = v100;
            if ( v100 == nullptr )
              abort();
          }
          v101 = (__int64 *)&v100[v106];
          v102 = &v100[8 * (v106 >> 2)];
          result = v105;
          *(_QWORD *)(a1 + 24) = v101;
          *(_QWORD *)(a1 + 32) = v102;
        }
        *(_QWORD *)(a1 + 24) = v101 + 1;
        *v101 = result;
        if ( (v52 & 1) == 0 )
        {
          v167[0] = sub_17574((_QWORD *)a1, v51);
          v167[1] = v140;
          goto LABEL_238;
        }
      }
      *(_QWORD *)a1 = v103 + 1;
      v167[0] = sub_17574((_QWORD *)a1, v51);
      v167[1] = v140;
      if ( (v52 & 1) == 0 )
      {
LABEL_238:
        if ( v140 != 1 )
          return 0;
      }
      LODWORD(v166) = (char)v15[3] >> 1;
      return sub_1BBE4(a1, v164, v167, &v166);
    }
LABEL_278:
    sub_1405C(
      "%s:%d: %s",
      "out/llvm-project/libcxxabi/src/demangle/ItaniumDemangle.h",
      2888,
      "operator name does not start with 'operator'");
  }
  switch ( v11 )
  {
    case 'f':
      v23 = *v10;
      if ( v23 == 112 || v4 != 2 && v23 == 76 && (unsigned int)v2[2] - 58 >= 0xFFFFFFF6 )
        return sub_1C7B8(a1);
      if ( v2 == v3 )
        return 0;
      *(_QWORD *)a1 = v10;
      if ( v3 == v10 )
        return 0;
      v31 = *v10;
      result = 0;
      if ( v31 > 107 )
      {
        if ( v31 == 108 )
        {
          v33 = 0;
          v32 = 1;
        }
        else
        {
          if ( v31 != 114 )
            return result;
          v32 = 0;
          v33 = 0;
        }
      }
      else if ( v31 == 76 )
      {
        v32 = 1;
        v33 = 1;
      }
      else
      {
        if ( v31 != 82 )
          return result;
        v32 = 0;
        v33 = 1;
      }
      *(_QWORD *)a1 = v2 + 2;
      if ( (unsigned __int64)(v3 - (v2 + 2)) < 2 )
        return 0;
      v124 = v2[2];
      v125 = 0;
      v126 = 61;
      do
      {
        v127 = (v125 + v126) >> 1;
        v128 = (unsigned __int8 *)&unk_36CF8 + 16 * v127;
        v129 = *v128;
        if ( v129 < v124 )
        {
          v125 = v127 + 1;
        }
        else if ( v129 == v124 )
        {
          if ( v128[1] >= (unsigned int)v2[3] )
            v126 = (v125 + v126) >> 1;
          else
            v125 = v127 + 1;
        }
        else
        {
          v126 = (v125 + v126) >> 1;
        }
      }
      while ( v126 != v125 );
      v130 = (unsigned __int8 *)&unk_36CF8 + 16 * v125;
      if ( *v130 != v124 )
        return 0;
      if ( v130[1] != v2[3] )
        return 0;
      v131 = v130[2];
      *(_QWORD *)a1 = v2 + 4;
      if ( v131 != 2 )
      {
        if ( v131 != 4 )
          return 0;
        v132 = *((const char **)v130 + 1);
        if ( v132[strlen(v132) - 1] != 42 )
          return 0;
      }
      result = sub_1A440(a1);
      if ( result != 0 )
      {
        v133 = result;
        if ( v33 != 0 )
        {
          result = sub_1A440(a1);
          if ( result == 0 )
            return result;
          if ( v32 != 0 )
            v134 = v133;
          else
            v134 = result;
          if ( v32 != 0 )
            v133 = result;
        }
        else
        {
          v134 = 0;
        }
        v151 = *((const char **)v130 + 1);
        v152 = strlen(v151);
        if ( v152 >= 8 && *(_QWORD *)v151 == 0x726F74617265706FLL )
        {
          v153 = v152 - 8;
          v154 = v151 + 8;
          if ( v152 != 8 && *v154 == 32 )
          {
            v154 = v151 + 9;
            v153 = v152 - 9;
          }
          v155 = *(_QWORD **)(a1 + 4912);
          v156 = v155[1];
          if ( (unsigned __int64)(v156 - 4016) <= 0xFFFFFFFFFFFFF00FLL )
          {
            v157 = malloc(0x1000u);
            if ( v157 == nullptr )
LABEL_287:
              sub_13E4C();
            v156 = 0;
            *v157 = v155;
            v157[1] = 0;
            v155 = v157;
            *(_QWORD *)(a1 + 4912) = v157;
          }
          v155[1] = v156 + 64;
          *(_QWORD *)((char *)v155 + v156 + 16) = off_37D98;
          result = (__int64)v155 + v156 + 16;
          v158 = *(_WORD *)((char *)v155 + v156 + 25);
          *(_BYTE *)(result + 8) = 71;
          *(_QWORD *)(result + 16) = v133;
          *(_QWORD *)(result + 24) = v134;
          *(_QWORD *)(result + 32) = v154;
          *(_QWORD *)(result + 40) = v153;
          *(_WORD *)(result + 9) = v158 & 0xF000 | 0x540;
          *(_BYTE *)(result + 48) = v32;
          return result;
        }
        goto LABEL_278;
      }
      return result;
    case 'T':
      return sub_1924C(a1, a2);
    case 'L':
      JUMPOUT(0x1BE34);
    default:
      break;
  }
  if ( *(_WORD *)v2 == 27753 )
  {
    v34 = (__int64 *)(a1 + 40);
    v35 = v2 + 2;
    v36 = (__int64)(*(_QWORD *)(a1 + 24) - *(_QWORD *)(a1 + 16)) >> 3;
    *(_QWORD *)a1 = v2 + 2;
    while ( v35 == v3 || *v35 != 69 )
    {
      result = sub_1CB7C(a1);
      if ( result == 0 )
        return result;
      v38 = *(__int64 **)(a1 + 24);
      if ( v38 == *(__int64 **)(a1 + 32) )
      {
        v40 = *(__int64 **)(a1 + 16);
        v41 = result;
        v42 = (char *)v38 - (char *)v40;
        if ( v40 == v34 )
        {
          v37 = (char *)malloc(2 * ((char *)v38 - (char *)v40));
          if ( v37 == nullptr )
            abort();
          if ( v38 != v34 )
          {
            v43 = (char *)v38 - (char *)v40;
            v44 = v37;
            memmove(v37, v40, v43);
            v37 = v44;
          }
          *(_QWORD *)(a1 + 16) = v37;
        }
        else
        {
          v37 = (char *)realloc(*(void **)(a1 + 16), 2 * ((char *)v38 - (char *)v40));
          *(_QWORD *)(a1 + 16) = v37;
          if ( v37 == nullptr )
            abort();
        }
        v38 = (__int64 *)&v37[v42];
        v39 = &v37[8 * (v42 >> 2)];
        result = v41;
        *(_QWORD *)(a1 + 24) = v38;
        *(_QWORD *)(a1 + 32) = v39;
      }
      *(_QWORD *)(a1 + 24) = v38 + 1;
      *v38 = result;
      v35 = *(unsigned __int8 **)a1;
      v3 = *(unsigned __int8 **)(a1 + 8);
    }
    *(_QWORD *)a1 = v35 + 1;
    v167[0] = sub_17574((_QWORD *)a1, v36);
    v167[1] = v45;
    return sub_1CDD8(a1, v167);
  }
  v24 = v3 - v2;
  if ( (unsigned __int64)(v3 - v2) >= 2 )
  {
    if ( *(_WORD *)v2 == 25453 )
    {
      *(_QWORD *)a1 = v2 + 2;
      JUMPOUT(0x1CE7C);
    }
    if ( *(_WORD *)v2 == 30830 )
    {
      *(_QWORD *)a1 = v2 + 2;
      result = sub_1A440(a1);
      v167[0] = result;
      if ( result != 0 )
      {
        LODWORD(v165[0]) = 2;
        return sub_1CFEC(a1, v167, v165);
      }
      return result;
    }
  }
  if ( v3 == v2 || v24 < 2 || v11 != 114 )
  {
    if ( v24 < 2 )
      goto LABEL_72;
  }
  else if ( (*v10 | 0x20) == 0x71 )
  {
    JUMPOUT(0x1D0AC);
  }
  if ( *(_WORD *)v2 == 28531 )
  {
    *(_QWORD *)a1 = v2 + 2;
    return sub_1D584(a1);
  }
LABEL_72:
  if ( (sub_147F8((const void **)a1, "sp", 2u) & 1) != 0 )
  {
    result = sub_1A440(a1);
    v167[0] = result;
    if ( result != 0 )
      return sub_1D8E4(a1, v167);
    return result;
  }
  if ( (sub_147F8((const void **)a1, "sZ", 2u) & 1) != 0 )
  {
    if ( *(_QWORD *)(a1 + 8) != *(_QWORD *)a1 && **(_BYTE **)a1 == 84 )
    {
      result = sub_1924C(a1, v46);
      v167[0] = result;
      if ( result != 0 )
        return sub_1D984(a1, v167);
      return result;
    }
    result = sub_1C7B8(a1);
    v167[0] = result;
    if ( result == 0 )
      return result;
    return sub_1DA24(a1, v167);
  }
  if ( (sub_147F8((const void **)a1, "sP", 2u) & 1) != 0 )
  {
    v83 = (__int64 *)(a1 + 40);
    v84 = (__int64)(*(_QWORD *)(a1 + 24) - *(_QWORD *)(a1 + 16)) >> 3;
    while ( 1 )
    {
      v88 = *(unsigned __int8 **)a1;
      if ( *(_QWORD *)a1 != *(_QWORD *)(a1 + 8) && *v88 == 69 )
        break;
      result = sub_170C0(a1, v82);
      if ( result == 0 )
        return result;
      v86 = *(__int64 **)(a1 + 24);
      if ( v86 == *(__int64 **)(a1 + 32) )
      {
        v89 = *(__int64 **)(a1 + 16);
        v90 = result;
        v91 = (char *)v86 - (char *)v89;
        if ( v89 == v83 )
        {
          v85 = (char *)malloc(2 * ((char *)v86 - (char *)v89));
          if ( v85 == nullptr )
            abort();
          if ( v86 != v83 )
          {
            v92 = (char *)v86 - (char *)v89;
            v93 = v85;
            memmove(v85, v89, v92);
            v85 = v93;
          }
          *(_QWORD *)(a1 + 16) = v85;
        }
        else
        {
          v85 = (char *)realloc(*(void **)(a1 + 16), 2 * ((char *)v86 - (char *)v89));
          *(_QWORD *)(a1 + 16) = v85;
          if ( v85 == nullptr )
            abort();
        }
        v86 = (__int64 *)&v85[v91];
        v87 = &v85[8 * (v91 >> 2)];
        result = v90;
        *(_QWORD *)(a1 + 24) = v86;
        *(_QWORD *)(a1 + 32) = v87;
      }
      *(_QWORD *)(a1 + 24) = v86 + 1;
      *v86 = result;
    }
    *(_QWORD *)a1 = v88 + 1;
    v167[0] = sub_17574((_QWORD *)a1, v84);
    v167[1] = v141;
    v167[0] = sub_1DAD8(a1, v167);
    return sub_1DA24(a1, v167);
  }
  if ( (sub_147F8((const void **)a1, "tl", 2u) & 1) != 0 )
  {
    result = sub_1544C(a1, v121);
    v165[0] = result;
    if ( result != 0 )
    {
      v122 = (__int64)(*(_QWORD *)(a1 + 24) - *(_QWORD *)(a1 + 16)) >> 3;
      while ( 1 )
      {
        v123 = *(unsigned __int8 **)a1;
        if ( *(_QWORD *)a1 != *(_QWORD *)(a1 + 8) && *v123 == 69 )
          break;
        result = sub_1CB7C(a1);
        v167[0] = result;
        if ( result == 0 )
          return result;
        sub_173FC((_QWORD *)(a1 + 16), v167);
      }
      *(_QWORD *)a1 = v123 + 1;
      v167[0] = sub_17574((_QWORD *)a1, v122);
      v167[1] = v150;
      return sub_1DB74(a1, v165, v167);
    }
    return result;
  }
  if ( (sub_147F8((const void **)a1, "tr", 2u) & 1) != 0 )
    JUMPOUT(0x1DC20);
  if ( (sub_147F8((const void **)a1, "tw", 2u) & 1) != 0 )
  {
    result = sub_1A440(a1);
    v167[0] = result;
    if ( result != 0 )
      return sub_1DCCC(a1, v167);
    return result;
  }
  v145 = *(unsigned __int8 **)a1;
  if ( *(_QWORD *)a1 == *(_QWORD *)(a1 + 8) || *v145 != 117 )
    JUMPOUT(0x1DD6C);
  *(_QWORD *)a1 = v145 + 1;
  result = sub_1869C((unsigned __int8 **)a1);
  v165[0] = result;
  if ( result != 0 )
  {
    v146 = (_QWORD *)(*(__int64 (__fastcall **)(__int64))(*(_QWORD *)result + 48LL))(result);
    if ( v147 == 8 && *v146 == 0x666F646975755F5FLL )
    {
      v161 = *(unsigned __int8 **)a1;
      if ( *(_QWORD *)a1 != *(_QWORD *)(a1 + 8) )
      {
        v162 = *v161;
        if ( v162 == 122 )
        {
          *(_QWORD *)a1 = v161 + 1;
          result = sub_1A440(a1);
          goto LABEL_275;
        }
        if ( v162 == 116 )
        {
          *(_QWORD *)a1 = v161 + 1;
          result = sub_1544C(a1, 8u);
LABEL_275:
          v164[0] = result;
          if ( result == 0 )
            return result;
          v148 = *(_QWORD *)(a1 + 24) - *(_QWORD *)(a1 + 16);
          sub_173FC((_QWORD *)(a1 + 16), v164);
          goto LABEL_269;
        }
      }
    }
    v148 = *(_QWORD *)(a1 + 24) - *(_QWORD *)(a1 + 16);
    while ( 1 )
    {
      v149 = *(unsigned __int8 **)a1;
      if ( *(_QWORD *)a1 != *(_QWORD *)(a1 + 8) && *v149 == 69 )
        break;
      result = sub_170C0(a1, v147);
      v167[0] = result;
      if ( result == 0 )
        return result;
      sub_173FC((_QWORD *)(a1 + 16), v167);
    }
    *(_QWORD *)a1 = v149 + 1;
LABEL_269:
    v159 = sub_17574((_QWORD *)a1, v148 >> 3);
    v139 = 1;
    v167[0] = v159;
    v167[1] = v160;
    v138 = v165;
LABEL_233:
    LODWORD(v166) = v139;
    return sub_1BB24(a1, v138, v167, &v166);
  }
  return result;
}


// Address: 0x1B7F0 | Function: sub_1B7F0
long double __fastcall sub_1B7F0(__int64 a1, _QWORD *a2, long double *a3, _WORD *a4)
{
  _QWORD *v4; // x23
  __int64 v8; // x8
  _QWORD *v10; // x0
  __int64 v11; // x0
  __int16 v12; // w8
  char v13; // w9
  long double result; // q0

  v4 = *(_QWORD **)(a1 + 4912);
  v8 = v4[1];
  if ( (unsigned __int64)(v8 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v10 = malloc(0x1000u);
    if ( v10 == nullptr )
      sub_13E4C();
    v8 = 0;
    *v10 = v4;
    v10[1] = 0;
    v4 = v10;
    *(_QWORD *)(a1 + 4912) = v10;
  }
  v4[1] = v8 + 48;
  *(_QWORD *)((char *)v4 + v8 + 16) = off_371C8;
  v11 = (__int64)v4 + v8 + 16;
  v12 = *(_WORD *)((char *)v4 + v8 + 25);
  v13 = *a4;
  *(_BYTE *)(v11 + 8) = 56;
  result = *a3;
  *(_QWORD *)(v11 + 16) = *a2;
  *(_WORD *)(v11 + 9) = v12 & 0xF000 | v13 & 0x3F | 0x540;
  *(long double *)(v11 + 24) = result;
  return result;
}


// Address: 0x1B8B0 | Function: sub_1B8B0
__int64 __fastcall sub_1B8B0(__int64 a1, __int64 *a2, __int64 *a3, _WORD *a4)
{
  _QWORD *v4; // x23
  __int64 v8; // x8
  _QWORD *v10; // x0
  __int64 result; // x0
  __int64 v12; // x11
  __int16 v13; // w8
  __int64 v14; // x9

  v4 = *(_QWORD **)(a1 + 4912);
  v8 = v4[1];
  if ( (unsigned __int64)(v8 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v10 = malloc(0x1000u);
    if ( v10 == nullptr )
      sub_13E4C();
    v8 = 0;
    *v10 = v4;
    v10[1] = 0;
    v4 = v10;
    *(_QWORD *)(a1 + 4912) = v10;
  }
  v4[1] = v8 + 32;
  *(_QWORD *)((char *)v4 + v8 + 16) = off_37238;
  result = (__int64)v4 + v8 + 16;
  v12 = *a2;
  v13 = *(_WORD *)((_BYTE *)v4 + v8 + 25) & 0xF000 | *a4 & 0x3F;
  *(_BYTE *)(result + 8) = 55;
  v14 = *a3;
  *(_WORD *)(result + 9) = v13 | 0x540;
  *(_QWORD *)(result + 16) = v12;
  *(_QWORD *)(result + 24) = v14;
  return result;
}


// Address: 0x1B96C | Function: sub_1B96C
long double __fastcall sub_1B96C(__int64 a1, _QWORD *a2, long double *a3, __int64 *a4, _WORD *a5)
{
  _QWORD *v5; // x24
  __int64 v10; // x8
  _QWORD *v12; // x0
  __int64 v13; // x0
  __int16 v14; // w8
  char v15; // w10
  long double result; // q0
  __int64 v17; // x9

  v5 = *(_QWORD **)(a1 + 4912);
  v10 = v5[1];
  if ( (unsigned __int64)(v10 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v12 = malloc(0x1000u);
    if ( v12 == nullptr )
      sub_13E4C();
    v10 = 0;
    *v12 = v5;
    v12[1] = 0;
    v5 = v12;
    *(_QWORD *)(a1 + 4912) = v12;
  }
  v5[1] = v10 + 48;
  *(_QWORD *)((char *)v5 + v10 + 16) = off_372A8;
  v13 = (__int64)v5 + v10 + 16;
  v14 = *(_WORD *)((char *)v5 + v10 + 25);
  v15 = *a5;
  *(_BYTE *)(v13 + 8) = 58;
  result = *a3;
  v17 = *a4;
  *(_QWORD *)(v13 + 16) = *a2;
  *(long double *)(v13 + 24) = result;
  *(_WORD *)(v13 + 9) = v14 & 0xF000 | v15 & 0x3F | 0x540;
  *(_QWORD *)(v13 + 40) = v17;
  return result;
}


// Address: 0x1BA38 | Function: sub_1BA38
long double __fastcall sub_1BA38(__int64 a1, long double *a2, __int64 *a3, __int128 *a4, char *a5, char *a6, _WORD *a7)
{
  _QWORD *v7; // x26
  __int64 v13; // x8
  _QWORD *v16; // x0
  __int64 v17; // x10
  __int64 v18; // x0
  char v19; // w9
  long double result; // q0
  char v21; // w11
  char v22; // w12
  __int16 v23; // w8
  __int128 v24; // q1

  v7 = *(_QWORD **)(a1 + 4912);
  v13 = v7[1];
  if ( (unsigned __int64)(v13 - 4016) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v16 = malloc(0x1000u);
    if ( v16 == nullptr )
      sub_13E4C();
    v13 = 0;
    *v16 = v7;
    v16[1] = 0;
    v7 = v16;
    *(_QWORD *)(a1 + 4912) = v16;
  }
  v7[1] = v13 + 64;
  v17 = *a3;
  *(_QWORD *)((char *)v7 + v13 + 16) = off_37318;
  v18 = (__int64)v7 + v13 + 16;
  v19 = *a7;
  *(_BYTE *)(v18 + 8) = 64;
  result = *a2;
  v21 = *a5;
  v22 = *a6;
  v23 = *(_WORD *)((_BYTE *)v7 + v13 + 25) & 0xF000;
  v24 = *a4;
  *(_QWORD *)(v18 + 32) = v17;
  *(long double *)(v18 + 16) = result;
  *(_BYTE *)(v18 + 56) = v21;
  *(_OWORD *)(v18 + 40) = v24;
  *(_WORD *)(v18 + 9) = v23 & 0xFFC0 | v19 & 0x3F | 0x540;
  *(_BYTE *)(v18 + 57) = v22;
  return result;
}


// Address: 0x1BB24 | Function: sub_1BB24
long double __fastcall sub_1BB24(__int64 a1, _QWORD *a2, long double *a3, _WORD *a4)
{
  _QWORD *v4; // x23
  __int64 v8; // x8
  _QWORD *v10; // x0
  __int64 v11; // x0
  __int16 v12; // w8
  char v13; // w9
  long double result; // q0

  v4 = *(_QWORD **)(a1 + 4912);
  v8 = v4[1];
  if ( (unsigned __int64)(v8 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v10 = malloc(0x1000u);
    if ( v10 == nullptr )
      sub_13E4C();
    v8 = 0;
    *v10 = v4;
    v10[1] = 0;
    v4 = v10;
    *(_QWORD *)(a1 + 4912) = v10;
  }
  v4[1] = v8 + 48;
  *(_QWORD *)((char *)v4 + v8 + 16) = off_373F8;
  v11 = (__int64)v4 + v8 + 16;
  v12 = *(_WORD *)((char *)v4 + v8 + 25);
  v13 = *a4;
  *(_BYTE *)(v11 + 8) = 63;
  result = *a3;
  *(_QWORD *)(v11 + 16) = *a2;
  *(_WORD *)(v11 + 9) = v12 & 0xF000 | v13 & 0x3F | 0x540;
  *(long double *)(v11 + 24) = result;
  return result;
}


// Address: 0x1BBE4 | Function: sub_1BBE4
long double __fastcall sub_1BBE4(__int64 a1, _QWORD *a2, long double *a3, _WORD *a4)
{
  _QWORD *v4; // x23
  __int64 v8; // x8
  _QWORD *v10; // x0
  __int64 v11; // x0
  __int16 v12; // w8
  char v13; // w9
  long double result; // q0

  v4 = *(_QWORD **)(a1 + 4912);
  v8 = v4[1];
  if ( (unsigned __int64)(v8 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v10 = malloc(0x1000u);
    if ( v10 == nullptr )
      sub_13E4C();
    v8 = 0;
    *v10 = v4;
    v10[1] = 0;
    v4 = v10;
    *(_QWORD *)(a1 + 4912) = v10;
  }
  v4[1] = v8 + 48;
  *(_QWORD *)((char *)v4 + v8 + 16) = off_37468;
  v11 = (__int64)v4 + v8 + 16;
  v12 = *(_WORD *)((char *)v4 + v8 + 25);
  v13 = *a4;
  *(_BYTE *)(v11 + 8) = 68;
  result = *a3;
  *(_QWORD *)(v11 + 16) = *a2;
  *(_WORD *)(v11 + 9) = v12 & 0xF000 | v13 & 0x3F | 0x540;
  *(long double *)(v11 + 24) = result;
  return result;
}


// Address: 0x1BCA4 | Function: sub_1BCA4
__int64 __fastcall sub_1BCA4(__int64 a1, __int64 *a2, __int64 *a3, __int64 *a4, _WORD *a5)
{
  _QWORD *v5; // x24
  __int64 v10; // x8
  _QWORD *v12; // x0
  __int64 result; // x0
  char v14; // w9
  __int64 v15; // x10
  __int64 v16; // x12
  __int16 v17; // w8
  __int16 v18; // w8
  __int64 v19; // x9

  v5 = *(_QWORD **)(a1 + 4912);
  v10 = v5[1];
  if ( (unsigned __int64)(v10 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v12 = malloc(0x1000u);
    if ( v12 == nullptr )
      sub_13E4C();
    v10 = 0;
    *v12 = v5;
    v12[1] = 0;
    v5 = v12;
    *(_QWORD *)(a1 + 4912) = v12;
  }
  v5[1] = v10 + 48;
  *(_QWORD *)((char *)v5 + v10 + 16) = off_374D8;
  result = (__int64)v5 + v10 + 16;
  v14 = *a5;
  v15 = *a2;
  v16 = *a3;
  v17 = *(_WORD *)((_BYTE *)v5 + v10 + 25) & 0xF000;
  *(_BYTE *)(result + 8) = 57;
  v18 = v17 & 0xFFC0 | v14 & 0x3F;
  v19 = *a4;
  *(_QWORD *)(result + 16) = v15;
  *(_QWORD *)(result + 24) = v16;
  *(_WORD *)(result + 9) = v18 | 0x540;
  *(_QWORD *)(result + 32) = v19;
  return result;
}


// Address: 0x1BD6C | Function: sub_1BD6C
long double __fastcall sub_1BD6C(__int64 a1, long double *a2, __int64 *a3, __int64 *a4, _WORD *a5)
{
  _QWORD *v5; // x24
  __int64 v10; // x8
  _QWORD *v12; // x0
  __int64 v13; // x0
  __int16 v14; // w8
  char v15; // w10
  __int64 v16; // x9
  long double result; // q0
  __int64 v18; // x11

  v5 = *(_QWORD **)(a1 + 4912);
  v10 = v5[1];
  if ( (unsigned __int64)(v10 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v12 = malloc(0x1000u);
    if ( v12 == nullptr )
      sub_13E4C();
    v10 = 0;
    *v12 = v5;
    v12[1] = 0;
    v5 = v12;
    *(_QWORD *)(a1 + 4912) = v12;
  }
  v5[1] = v10 + 48;
  *(_QWORD *)((char *)v5 + v10 + 16) = off_37548;
  v13 = (__int64)v5 + v10 + 16;
  v14 = *(_WORD *)((char *)v5 + v10 + 25);
  v15 = *a5;
  *(_BYTE *)(v13 + 8) = 61;
  v16 = *a3;
  result = *a2;
  v18 = *a4;
  *(long double *)(v13 + 16) = *a2;
  *(_WORD *)(v13 + 9) = v14 & 0xF000 | v15 & 0x3F | 0x540;
  *(_QWORD *)(v13 + 32) = v16;
  *(_QWORD *)(v13 + 40) = v18;
  return result;
}


// Address: 0x1C7B8 | Function: sub_1C7B8
__int64 __fastcall sub_1C7B8(__int64 *a1)
{
  unsigned __int8 *v1; // x9
  __int64 v2; // x10
  unsigned __int64 v3; // x8
  bool v4; // zf
  unsigned __int8 *v5; // x8
  unsigned __int8 *v6; // x10
  unsigned __int8 *v7; // x11
  unsigned __int8 *v8; // x8
  unsigned __int8 *v9; // x19
  __int64 v10; // x20
  _QWORD *v11; // x19
  __int64 v12; // x8
  _QWORD *v14; // x0
  __int64 v15; // x9
  char *v16; // x8
  __int64 v17; // x8
  unsigned __int8 *v18; // x11
  unsigned __int8 *v19; // x10
  _QWORD *v20; // x21
  __int64 v21; // x9
  _QWORD *v23; // x0
  __int16 v24; // w9
  unsigned __int8 *v25; // x8
  unsigned __int8 *v26; // x12
  __int64 v27; // x11
  unsigned __int8 *v28; // x11
  unsigned __int8 *v29; // x10
  _QWORD v31[2]; // [xsp+0h] [xbp-10h] BYREF

  v2 = *a1;
  v1 = (unsigned __int8 *)a1[1];
  v3 = (unsigned __int64)&v1[-*a1];
  if ( v3 >= 3 )
  {
    v4 = *(_WORD *)v2 == 28774 && *(_BYTE *)(v2 + 2) == 84;
    if ( v4 )
    {
      v11 = (_QWORD *)a1[614];
      *a1 = v2 + 3;
      v12 = v11[1];
      if ( (unsigned __int64)(v12 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v14 = malloc(0x1000u);
        if ( v14 == nullptr )
          goto LABEL_69;
        v12 = 0;
        *v14 = v11;
        v14[1] = 0;
        v11 = v14;
        a1[614] = (__int64)v14;
      }
      v15 = v12 + 32;
      v16 = (char *)v11 + v12;
      v11[1] = v15;
      *((_QWORD *)v16 + 2) = off_36BB8;
      v17 = (__int64)(v16 + 16);
      LOWORD(v15) = *(_WORD *)(v17 + 9) & 0xF000;
      *(_BYTE *)(v17 + 8) = 8;
      *(_WORD *)(v17 + 9) = v15 | 0x540;
      *(_QWORD *)(v17 + 16) = "this";
      *(_QWORD *)(v17 + 24) = 4;
      return v17;
    }
  }
  else if ( v3 != 2 )
  {
    return 0;
  }
  if ( *(_WORD *)v2 == 28774 )
  {
    v8 = (unsigned __int8 *)(v2 + 2);
    *a1 = v2 + 2;
    if ( (unsigned __int8 *)(v2 + 2) != v1 && *v8 == 114 )
    {
      v8 = (unsigned __int8 *)(v2 + 3);
      *a1 = v2 + 3;
    }
    if ( v8 != v1 && *v8 == 86 )
      *a1 = (__int64)++v8;
    if ( v8 != v1 && *v8 == 75 )
      *a1 = (__int64)++v8;
    if ( v1 == v8 || (unsigned int)*v8 - 58 < 0xFFFFFFF6 )
    {
      v9 = nullptr;
      v10 = 0;
      if ( v8 == v1 )
        return 0;
    }
    else
    {
      v18 = v8;
      v19 = v8;
      while ( (unsigned int)*v19 - 58 >= 0xFFFFFFF6 )
      {
        ++v19;
        ++v18;
        *a1 = (__int64)v19;
        if ( v19 == v1 )
        {
          v18 = v1;
          break;
        }
      }
      v9 = v8;
      v10 = v18 - v8;
      v8 = v19;
      if ( v19 == v1 )
        return 0;
    }
    if ( *v8 != 95 )
      return 0;
    v20 = (_QWORD *)a1[614];
    *a1 = (__int64)(v8 + 1);
    v21 = v20[1];
    if ( (unsigned __int64)(v21 - 4048) > 0xFFFFFFFFFFFFF00FLL )
      goto LABEL_42;
    v23 = malloc(0x1000u);
    if ( v23 != nullptr )
    {
      v21 = 0;
      *v23 = v20;
      v23[1] = 0;
      v20 = v23;
      a1[614] = (__int64)v23;
LABEL_42:
      v20[1] = v21 + 32;
      *(_QWORD *)((char *)v20 + v21 + 16) = off_37D28;
      v17 = (__int64)v20 + v21 + 16;
      v24 = *(_WORD *)((char *)v20 + v21 + 25);
      *(_QWORD *)(v17 + 16) = v9;
      *(_QWORD *)(v17 + 24) = v10;
      *(_BYTE *)(v17 + 8) = 67;
      *(_WORD *)(v17 + 9) = v24 & 0xF000 | 0x540;
      return v17;
    }
LABEL_69:
    sub_13E4C();
  }
  if ( *(_WORD *)v2 != 19558 )
    return 0;
  v5 = (unsigned __int8 *)(v2 + 2);
  *a1 = v2 + 2;
  if ( v1 == (unsigned __int8 *)(v2 + 2) || (unsigned int)*v5 - 58 < 0xFFFFFFF6 )
    return 0;
  v6 = (unsigned __int8 *)(v2 + 2);
  while ( (unsigned int)*v6 - 58 >= 0xFFFFFFF6 )
  {
    *a1 = (__int64)++v6;
    if ( v6 == v1 )
    {
      v7 = v1;
      goto LABEL_44;
    }
  }
  v7 = v6;
LABEL_44:
  v4 = v7 == v5;
  v17 = 0;
  if ( !v4 && v6 != v1 )
  {
    if ( *v6 != 112 )
      return 0;
    v25 = v6 + 1;
    *a1 = (__int64)(v6 + 1);
    if ( v6 + 1 != v1 && *v25 == 114 )
    {
      v25 = v6 + 2;
      *a1 = (__int64)(v6 + 2);
    }
    if ( v25 != v1 && *v25 == 86 )
      *a1 = (__int64)++v25;
    if ( v25 != v1 && *v25 == 75 )
      *a1 = (__int64)++v25;
    if ( v1 == v25 || (unsigned int)*v25 - 58 < 0xFFFFFFF6 )
    {
      v26 = nullptr;
      v27 = 0;
    }
    else
    {
      v28 = v25;
      v29 = v25;
      while ( (unsigned int)*v29 - 58 >= 0xFFFFFFF6 )
      {
        ++v29;
        ++v28;
        *a1 = (__int64)v29;
        if ( v29 == v1 )
        {
          v28 = v1;
          break;
        }
      }
      v26 = v25;
      v27 = v28 - v25;
      v25 = v29;
    }
    v31[0] = v26;
    v31[1] = v27;
    if ( v25 == v1 || *v25 != 95 )
      return 0;
    *a1 = (__int64)(v25 + 1);
    return sub_23DB8(a1, v31);
  }
  return v17;
}


// Address: 0x1CB7C | Function: sub_1CB7C
__int64 __fastcall sub_1CB7C(__int64 a1, size_t a2)
{
  unsigned __int8 *v2; // x8
  int v3; // w9
  __int64 result; // x0
  __int64 v6; // x19
  _QWORD *v7; // x22
  __int64 v8; // x20
  __int64 v9; // x8
  _QWORD *v10; // x0
  __int16 v11; // w8
  __int16 v12; // w8
  __int64 v14; // x19
  _QWORD *v15; // x22
  __int64 v16; // x20
  __int64 v17; // x8
  _QWORD *v18; // x0
  __int16 v19; // w8
  size_t v21; // x1
  __int64 v22; // x19
  __int64 v23; // x20
  _QWORD *v24; // x23
  __int64 v25; // x21
  __int64 v26; // x8
  _QWORD *v27; // x0
  __int16 v28; // w8

  v2 = *(unsigned __int8 **)a1;
  if ( *(_QWORD *)(a1 + 8) - *(_QWORD *)a1 < 2u || *v2 != 100 )
    return sub_1A440(a1, a2);
  v3 = v2[1];
  if ( v3 != 88 )
  {
    if ( v3 == 120 )
    {
      *(_QWORD *)a1 = v2 + 2;
      result = sub_1A440(a1, a2);
      if ( result != 0 )
      {
        v14 = result;
        result = sub_1CB7C(a1);
        if ( result != 0 )
        {
          v15 = *(_QWORD **)(a1 + 4912);
          v16 = result;
          v17 = v15[1];
          if ( (unsigned __int64)(v17 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
          {
            v18 = malloc(0x1000u);
            if ( v18 == nullptr )
              goto LABEL_28;
            v17 = 0;
            *v18 = v15;
            v18[1] = 0;
            v15 = v18;
            *(_QWORD *)(a1 + 4912) = v18;
          }
          v15[1] = v17 + 48;
          *(_QWORD *)((char *)v15 + v17 + 16) = off_37E78;
          result = (__int64)v15 + v17 + 16;
          v19 = *(_WORD *)((char *)v15 + v17 + 25);
          *(_BYTE *)(result + 8) = 81;
          *(_QWORD *)(result + 16) = v14;
          *(_QWORD *)(result + 24) = v16;
          *(_WORD *)(result + 9) = v19 & 0xF000 | 0x540;
          *(_BYTE *)(result + 32) = 1;
          return result;
        }
      }
      return result;
    }
    if ( v3 == 105 )
    {
      *(_QWORD *)a1 = v2 + 2;
      result = sub_1869C((unsigned __int8 **)a1);
      if ( result != 0 )
      {
        v6 = result;
        result = sub_1CB7C(a1);
        if ( result != 0 )
        {
          v7 = *(_QWORD **)(a1 + 4912);
          v8 = result;
          v9 = v7[1];
          if ( (unsigned __int64)(v9 - 4032) > 0xFFFFFFFFFFFFF00FLL )
          {
LABEL_11:
            v7[1] = v9 + 48;
            *(_QWORD *)((char *)v7 + v9 + 16) = off_37E78;
            result = (__int64)v7 + v9 + 16;
            v11 = *(_WORD *)((char *)v7 + v9 + 25);
            *(_BYTE *)(result + 8) = 81;
            *(_QWORD *)(result + 16) = v6;
            *(_QWORD *)(result + 24) = v8;
            v12 = v11 & 0xF000 | 0x540;
            *(_BYTE *)(result + 32) = 0;
LABEL_26:
            *(_WORD *)(result + 9) = v12;
            return result;
          }
          v10 = malloc(0x1000u);
          if ( v10 != nullptr )
          {
            v9 = 0;
            *v10 = v7;
            v10[1] = 0;
            v7 = v10;
            *(_QWORD *)(a1 + 4912) = v10;
            goto LABEL_11;
          }
LABEL_28:
          sub_13E4C();
        }
      }
      return result;
    }
    return sub_1A440(a1, a2);
  }
  *(_QWORD *)a1 = v2 + 2;
  result = sub_1A440(a1, a2);
  if ( result != 0 )
  {
    v22 = result;
    result = sub_1A440(a1, v21);
    if ( result != 0 )
    {
      v23 = result;
      result = sub_1CB7C(a1);
      if ( result != 0 )
      {
        v24 = *(_QWORD **)(a1 + 4912);
        v25 = result;
        v26 = v24[1];
        if ( (unsigned __int64)(v26 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
        {
          v27 = malloc(0x1000u);
          if ( v27 == nullptr )
            goto LABEL_28;
          v26 = 0;
          *v27 = v24;
          v27[1] = 0;
          v24 = v27;
          *(_QWORD *)(a1 + 4912) = v27;
        }
        v24[1] = v26 + 48;
        *(_QWORD *)((char *)v24 + v26 + 16) = off_37EE8;
        result = (__int64)v24 + v26 + 16;
        v28 = *(_WORD *)((char *)v24 + v26 + 25);
        *(_BYTE *)(result + 8) = 82;
        *(_QWORD *)(result + 16) = v22;
        *(_QWORD *)(result + 24) = v23;
        v12 = v28 & 0xF000 | 0x540;
        *(_QWORD *)(result + 32) = v25;
        goto LABEL_26;
      }
    }
  }
  return result;
}


// Address: 0x1CDD8 | Function: sub_1CDD8
long double __fastcall sub_1CDD8(__int64 a1, long double *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x0
  __int16 v8; // w8
  long double result; // q0

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 48;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_37F58;
  v7 = (__int64)v2 + v4 + 16;
  v8 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(v7 + 8) = 70;
  result = *a2;
  *(_QWORD *)(v7 + 16) = 0;
  *(_WORD *)(v7 + 9) = v8 & 0xF000 | 0x540;
  *(long double *)(v7 + 24) = result;
  return result;
}


// Address: 0x1CFEC | Function: sub_1CFEC
__int64 __fastcall sub_1CFEC(__int64 a1, __int64 *a2, _WORD *a3)
{
  _QWORD *v3; // x22
  __int64 v6; // x8
  _QWORD *v8; // x0
  __int64 result; // x0
  __int16 v10; // w8
  char v11; // w11
  __int64 v12; // x10

  v3 = *(_QWORD **)(a1 + 4912);
  v6 = v3[1];
  if ( (unsigned __int64)(v6 - 4016) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v8 = malloc(0x1000u);
    if ( v8 == nullptr )
      sub_13E4C();
    v6 = 0;
    *v8 = v3;
    v8[1] = 0;
    v3 = v8;
    *(_QWORD *)(a1 + 4912) = v8;
  }
  v3[1] = v6 + 64;
  *(_QWORD *)((char *)v3 + v6 + 16) = off_375B8;
  result = (__int64)v3 + v6 + 16;
  v10 = *(_WORD *)((char *)v3 + v6 + 25);
  v11 = *a3;
  *(_BYTE *)(result + 8) = 60;
  v12 = *a2;
  *(_QWORD *)(result + 40) = 0;
  *(_QWORD *)(result + 48) = 0;
  *(_QWORD *)(result + 16) = "noexcept ";
  *(_QWORD *)(result + 24) = 9;
  *(_QWORD *)(result + 32) = v12;
  *(_WORD *)(result + 9) = v10 & 0xF000 | v11 & 0x3F | 0x540;
  return result;
}


// Address: 0x1D584 | Function: sub_1D584
__int64 __fastcall sub_1D584(__int64 a1, size_t a2)
{
  __int64 result; // x0
  size_t v4; // x1
  unsigned __int8 *v5; // x8
  unsigned __int8 *v6; // x24
  unsigned __int8 *v7; // x9
  __int64 v8; // x26
  unsigned __int8 *v9; // x10
  __int64 v10; // x11
  __int64 v11; // x12
  __int64 *v12; // x27
  __int64 v13; // x8
  _QWORD *v14; // x23
  __int64 v15; // x19
  __int16 v16; // w8
  __int64 *v17; // x23
  unsigned __int8 *v18; // x21
  __int64 v19; // x22
  __int64 *v20; // x22
  __int64 v21; // x21
  char *v22; // x0
  unsigned __int8 *v23; // x9
  _QWORD *v24; // x0
  size_t v25; // x2
  char *v26; // x23
  char v27; // w23
  __int64 v28; // x25
  char *v29; // x0
  _QWORD *v30; // x19
  char *v31; // x21
  __int64 v32; // x1
  __int64 v33; // x22
  __int64 v34; // x8
  _QWORD *v35; // x0
  __int16 v36; // w8
  __int64 v37; // [xsp+8h] [xbp-28h]
  __int64 v38; // [xsp+10h] [xbp-20h]
  __int64 v39; // [xsp+20h] [xbp-10h]
  __int64 v40; // [xsp+28h] [xbp-8h]

  result = sub_1544C(a1, a2);
  if ( result == 0 )
    return result;
  v40 = result;
  result = sub_1A440(a1, v4);
  if ( result == 0 )
    return result;
  v6 = *(unsigned __int8 **)a1;
  v5 = *(unsigned __int8 **)(a1 + 8);
  v7 = *(unsigned __int8 **)a1;
  if ( *(unsigned __int8 **)a1 != v5 )
  {
    v7 = *(unsigned __int8 **)a1;
    if ( *v6 == 110 )
    {
      v7 = v6 + 1;
      *(_QWORD *)a1 = v6 + 1;
    }
  }
  if ( v5 == v7 || (unsigned int)*v7 - 58 < 0xFFFFFFF6 )
  {
    v6 = nullptr;
    v8 = 0;
  }
  else
  {
    while ( (unsigned int)*v7 - 58 >= 0xFFFFFFF6 )
    {
      *(_QWORD *)a1 = ++v7;
      if ( v7 == v5 )
      {
        v9 = v5;
        goto LABEL_13;
      }
    }
    v9 = v7;
LABEL_13:
    v8 = v9 - v6;
  }
  v11 = *(_QWORD *)(a1 + 16);
  v10 = *(_QWORD *)(a1 + 24);
  if ( v7 != v5 )
  {
    v12 = (__int64 *)(a1 + 40);
    v37 = *(_QWORD *)(a1 + 16);
    v38 = *(_QWORD *)(a1 + 24);
    v39 = result;
    while ( *v7 == 95 )
    {
      v18 = v7 + 1;
      *(_QWORD *)a1 = v7 + 1;
      if ( v5 == v7 + 1 || (unsigned int)*v18 - 58 < 0xFFFFFFF6 )
      {
        v18 = nullptr;
        v19 = 0;
      }
      else
      {
        v23 = v7 + 1;
        while ( (unsigned int)*v23 - 58 >= 0xFFFFFFF6 )
        {
          *(_QWORD *)a1 = ++v23;
          if ( v23 == v5 )
          {
            v23 = v5;
            break;
          }
        }
        v19 = v23 - v18;
      }
      v14 = *(_QWORD **)(a1 + 4912);
      v13 = v14[1];
      if ( (unsigned __int64)(v13 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v24 = malloc(0x1000u);
        if ( v24 == nullptr )
          goto LABEL_52;
        v13 = 0;
        *v24 = v14;
        v24[1] = 0;
        v14 = v24;
        *(_QWORD *)(a1 + 4912) = v24;
      }
      v14[1] = v13 + 32;
      *(_QWORD *)((char *)v14 + v13 + 16) = off_36BB8;
      v15 = (__int64)v14 + v13 + 16;
      v16 = *(_WORD *)((char *)v14 + v13 + 25);
      *(_QWORD *)(v15 + 16) = v18;
      *(_BYTE *)(v15 + 8) = 8;
      *(_QWORD *)(v15 + 24) = v19;
      *(_WORD *)(v15 + 9) = v16 & 0xF000 | 0x540;
      v17 = *(__int64 **)(a1 + 24);
      if ( v17 == *(__int64 **)(a1 + 32) )
      {
        v20 = *(__int64 **)(a1 + 16);
        v21 = (char *)v17 - (char *)v20;
        if ( v20 == v12 )
        {
          v22 = (char *)malloc(2 * ((char *)v17 - (char *)v20));
          if ( v22 == nullptr )
            abort();
          if ( v17 != v12 )
          {
            v25 = (char *)v17 - (char *)v20;
            v26 = v22;
            memmove(v22, v20, v25);
            v22 = v26;
          }
          *(_QWORD *)(a1 + 16) = v22;
        }
        else
        {
          v22 = (char *)realloc(*(void **)(a1 + 16), 2 * ((char *)v17 - (char *)v20));
          *(_QWORD *)(a1 + 16) = v22;
          if ( v22 == nullptr )
            abort();
        }
        v17 = (__int64 *)&v22[v21];
        *(_QWORD *)(a1 + 32) = &v22[8 * (v21 >> 2)];
      }
      *(_QWORD *)(a1 + 24) = v17 + 1;
      *v17 = v15;
      v7 = *(unsigned __int8 **)a1;
      v5 = *(unsigned __int8 **)(a1 + 8);
      if ( *(unsigned __int8 **)a1 == v5 )
        return 0;
    }
    v10 = v38;
    result = v39;
    v11 = v37;
  }
  if ( v7 == v5 || *v7 != 112 )
  {
    v27 = 0;
    if ( v7 == v5 )
      return 0;
  }
  else
  {
    ++v7;
    v27 = 1;
    *(_QWORD *)a1 = v7;
    if ( v7 == v5 )
      return 0;
  }
  if ( *v7 != 69 )
    return 0;
  v28 = result;
  *(_QWORD *)a1 = v7 + 1;
  v29 = sub_17574((_QWORD *)a1, (v10 - v11) >> 3);
  v30 = *(_QWORD **)(a1 + 4912);
  v31 = v29;
  v33 = v32;
  v34 = v30[1];
  if ( (unsigned __int64)(v34 - 4000) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v35 = malloc(0x1000u);
    if ( v35 == nullptr )
LABEL_52:
      sub_13E4C();
    v34 = 0;
    *v35 = v30;
    v35[1] = 0;
    v30 = v35;
    *(_QWORD *)(a1 + 4912) = v35;
  }
  v30[1] = v34 + 80;
  *(_QWORD *)((char *)v30 + v34 + 16) = off_381F8;
  result = (__int64)v30 + v34 + 16;
  v36 = *(_WORD *)((char *)v30 + v34 + 25);
  *(_BYTE *)(result + 8) = 59;
  *(_QWORD *)(result + 32) = v6;
  *(_QWORD *)(result + 40) = v8;
  *(_QWORD *)(result + 16) = v40;
  *(_QWORD *)(result + 24) = v28;
  *(_WORD *)(result + 9) = v36 & 0xF000 | 0x540;
  *(_QWORD *)(result + 48) = v31;
  *(_QWORD *)(result + 56) = v33;
  *(_BYTE *)(result + 64) = v27;
  return result;
}


// Address: 0x1D8E4 | Function: sub_1D8E4
__int64 __fastcall sub_1D8E4(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 result; // x0
  __int16 v8; // w8
  __int64 v9; // x9

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 32;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_37E08;
  result = (__int64)v2 + v4 + 16;
  v8 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 42;
  v9 = *a2;
  *(_WORD *)(result + 9) = v8 & 0xF000 | 0x540;
  *(_QWORD *)(result + 16) = v9;
  return result;
}


// Address: 0x1D984 | Function: sub_1D984
__int64 __fastcall sub_1D984(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 result; // x0
  __int16 v8; // w8
  __int64 v9; // x9

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 32;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_38268;
  result = (__int64)v2 + v4 + 16;
  v8 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 62;
  v9 = *a2;
  *(_WORD *)(result + 9) = v8 & 0xF000 | 0x540;
  *(_QWORD *)(result + 16) = v9;
  return result;
}


// Address: 0x1DA24 | Function: sub_1DA24
__int64 __fastcall sub_1DA24(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 result; // x0
  __int64 v8; // x10
  __int16 v9; // w8

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4016) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 64;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_375B8;
  result = (__int64)v2 + v4 + 16;
  v8 = *a2;
  *(_BYTE *)(result + 8) = 60;
  v9 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_QWORD *)(result + 16) = "sizeof... ";
  *(_QWORD *)(result + 24) = 10;
  *(_QWORD *)(result + 40) = 0;
  *(_QWORD *)(result + 48) = 0;
  *(_QWORD *)(result + 32) = v8;
  *(_WORD *)(result + 9) = v9 & 0xF000 | 0x540;
  return result;
}


// Address: 0x1DAD8 | Function: sub_1DAD8
long double __fastcall sub_1DAD8(__int64 a1, long double *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x0
  __int16 v8; // w8
  long double result; // q0

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 32;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_382D8;
  v7 = (__int64)v2 + v4 + 16;
  v8 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(v7 + 8) = 0;
  result = *a2;
  *(_WORD *)(v7 + 9) = v8 & 0xF000 | 0x540;
  *(long double *)(v7 + 16) = result;
  return result;
}


// Address: 0x1DB74 | Function: sub_1DB74
long double __fastcall sub_1DB74(__int64 a1, _QWORD *a2, long double *a3)
{
  _QWORD *v3; // x22
  __int64 v6; // x8
  _QWORD *v8; // x0
  __int64 v9; // x0
  __int16 v10; // w8
  long double result; // q0

  v3 = *(_QWORD **)(a1 + 4912);
  v6 = v3[1];
  if ( (unsigned __int64)(v6 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v8 = malloc(0x1000u);
    if ( v8 == nullptr )
      sub_13E4C();
    v6 = 0;
    *v8 = v3;
    v8[1] = 0;
    v3 = v8;
    *(_QWORD *)(a1 + 4912) = v8;
  }
  v3[1] = v6 + 48;
  *(_QWORD *)((char *)v3 + v6 + 16) = off_37F58;
  v9 = (__int64)v3 + v6 + 16;
  v10 = *(_WORD *)((char *)v3 + v6 + 25);
  *(_BYTE *)(v9 + 8) = 70;
  result = *a3;
  *(_QWORD *)(v9 + 16) = *a2;
  *(_WORD *)(v9 + 9) = v10 & 0xF000 | 0x540;
  *(long double *)(v9 + 24) = result;
  return result;
}


// Address: 0x1DCCC | Function: sub_1DCCC
__int64 __fastcall sub_1DCCC(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 result; // x0
  __int16 v8; // w8
  __int64 v9; // x9

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 32;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_38348;
  result = (__int64)v2 + v4 + 16;
  v8 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 72;
  v9 = *a2;
  *(_WORD *)(result + 9) = v8 & 0xF000 | 0x540;
  *(_QWORD *)(result + 16) = v9;
  return result;
}


// Address: 0x1E3A0 | Function: sub_1E3A0
long double __fastcall sub_1E3A0(__int64 a1, _QWORD *a2, long double *a3, __int64 *a4, _WORD *a5)
{
  _QWORD *v5; // x24
  __int64 v10; // x8
  _QWORD *v12; // x0
  __int64 v13; // x0
  __int16 v14; // w8
  char v15; // w10
  long double result; // q0
  __int64 v17; // x9

  v5 = *(_QWORD **)(a1 + 4912);
  v10 = v5[1];
  if ( (unsigned __int64)(v10 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v12 = malloc(0x1000u);
    if ( v12 == nullptr )
      sub_13E4C();
    v10 = 0;
    *v12 = v5;
    v12[1] = 0;
    v5 = v12;
    *(_QWORD *)(a1 + 4912) = v12;
  }
  v5[1] = v10 + 48;
  *(_QWORD *)((char *)v5 + v10 + 16) = off_370E8;
  v13 = (__int64)v5 + v10 + 16;
  v14 = *(_WORD *)((char *)v5 + v10 + 25);
  v15 = *a5;
  *(_BYTE *)(v13 + 8) = 54;
  result = *a3;
  v17 = *a4;
  *(_QWORD *)(v13 + 16) = *a2;
  *(long double *)(v13 + 24) = result;
  *(_WORD *)(v13 + 9) = v14 & 0xF000 | v15 & 0x3F | 0x540;
  *(_QWORD *)(v13 + 40) = v17;
  return result;
}


// Address: 0x1E46C | Function: sub_1E46C
__int64 __fastcall sub_1E46C(__int64 a1, char **a2)
{
  int v4; // w23
  int v5; // w8
  __int64 *v6; // x21
  __int16 v7; // w24
  int v8; // w8
  unsigned int v9; // w8
  char *v10; // x8
  unsigned __int64 v11; // x10
  void *v12; // x0
  char *v13; // x9
  unsigned __int64 v14; // x8
  size_t v15; // x1
  __int64 v16; // x9
  char *v17; // x8
  unsigned __int64 v18; // x10
  void *v19; // x0
  char *v20; // x9
  unsigned __int64 v21; // x8
  size_t v22; // x1
  const void *v23; // x22
  size_t v24; // x21
  char *v25; // x8
  unsigned __int64 v26; // x9
  void *v27; // x0
  unsigned __int64 v28; // x9
  size_t v29; // x8
  size_t v30; // x1
  char *v31; // x8
  size_t v32; // x9
  char *v33; // x0
  char *v34; // x10
  size_t v35; // x1
  size_t v36; // x8
  _BYTE *v37; // x8
  __int64 v38; // x9
  unsigned __int64 v39; // x9
  char *v40; // x0
  unsigned __int64 v41; // x9
  size_t v42; // x8
  size_t v43; // x1
  char *v44; // x9
  __int64 *v45; // x21
  char *v46; // x8
  unsigned int v47; // w10
  __int64 result; // x0
  unsigned __int64 v49; // x11
  char *v50; // x10
  void *v51; // x0
  unsigned __int64 v52; // x9
  size_t v53; // x1
  __int64 v54; // x9
  char *v55; // x8
  unsigned __int64 v56; // x10
  char *v57; // x9
  unsigned __int64 v58; // x8
  size_t v59; // x1
  char *v60; // x8
  unsigned __int64 v61; // x10
  char *v62; // x9
  unsigned __int64 v63; // x8
  size_t v64; // x1
  char *v65; // x8
  unsigned __int64 v66; // x10
  void *v67; // x0
  char *v68; // x9
  unsigned __int64 v69; // x8
  size_t v70; // x1

  if ( *((_DWORD *)a2 + 8) != 0 )
    goto LABEL_2;
  v37 = *(_BYTE **)(a1 + 24);
  v38 = *(_QWORD *)(a1 + 32);
  if ( v38 != 2 )
  {
    if ( v38 == 1 && *v37 == 62 )
      goto LABEL_84;
LABEL_2:
    v4 = 0;
    goto LABEL_3;
  }
  if ( *(_WORD *)v37 != 15934 )
    goto LABEL_2;
LABEL_84:
  v65 = a2[1];
  v66 = (unsigned __int64)a2[2];
  v67 = *a2;
  *((_DWORD *)a2 + 8) = 1;
  v68 = v65 + 1;
  if ( (unsigned __int64)(v65 + 1) > v66 )
  {
    v69 = (unsigned __int64)(v65 + 993);
    if ( 2 * v66 <= v69 )
      v70 = v69;
    else
      v70 = 2 * v66;
    a2[2] = (char *)v70;
    v67 = realloc(v67, v70);
    *a2 = (char *)v67;
    if ( v67 == nullptr )
      abort();
    v65 = a2[1];
    v68 = v65 + 1;
  }
  v4 = 1;
  a2[1] = v68;
  v65[(_QWORD)v67] = 40;
LABEL_3:
  v5 = *(unsigned __int16 *)(a1 + 9);
  v6 = *(__int64 **)(a1 + 16);
  v7 = (_WORD)v5 << 10;
  v8 = v5 << 26 >> 26;
  if ( (v7 & 0xFC00) == 0x4400 )
    v9 = 15;
  else
    v9 = v8 + 1;
  if ( v9 <= *(unsigned __int16 *)((char *)v6 + 9) << 26 >> 26 )
  {
    v10 = a2[1];
    v11 = (unsigned __int64)a2[2];
    v12 = *a2;
    v13 = v10 + 1;
    ++*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v10 + 1) > v11 )
    {
      v14 = (unsigned __int64)(v10 + 993);
      if ( 2 * v11 <= v14 )
        v15 = v14;
      else
        v15 = 2 * v11;
      a2[2] = (char *)v15;
      v12 = realloc(v12, v15);
      *a2 = (char *)v12;
      if ( v12 == nullptr )
        abort();
      v10 = a2[1];
      v13 = v10 + 1;
    }
    a2[1] = v13;
    v16 = *v6;
    v10[(_QWORD)v12] = 40;
    (*(void (__fastcall **)(__int64 *, char **))(v16 + 32))(v6, a2);
    if ( (*(_WORD *)((_BYTE *)v6 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, char **))(*v6 + 40))(v6, a2);
    v17 = a2[1];
    v18 = (unsigned __int64)a2[2];
    v19 = *a2;
    v20 = v17 + 1;
    --*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v17 + 1) > v18 )
    {
      v21 = (unsigned __int64)(v17 + 993);
      if ( 2 * v18 <= v21 )
        v22 = v21;
      else
        v22 = 2 * v18;
      a2[2] = (char *)v22;
      v19 = realloc(v19, v22);
      *a2 = (char *)v19;
      if ( v19 == nullptr )
        abort();
      v17 = a2[1];
      v20 = v17 + 1;
    }
    a2[1] = v20;
    v17[(_QWORD)v19] = 41;
  }
  else
  {
    (*(void (__fastcall **)(_QWORD, char **))(*v6 + 32))(*(_QWORD *)(a1 + 16), a2);
    if ( (*(_WORD *)((_BYTE *)v6 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, char **))(*v6 + 40))(v6, a2);
  }
  if ( *(_QWORD *)(a1 + 32) == 1 && *(_BYTE *)(v23 = *(const void **)(a1 + 24)) == 44 )
  {
    v24 = 1;
  }
  else
  {
    v25 = a2[1];
    v26 = (unsigned __int64)a2[2];
    v27 = *a2;
    if ( (unsigned __int64)(v25 + 1) > v26 )
    {
      v28 = 2 * v26;
      v29 = (size_t)(v25 + 993);
      if ( v28 <= v29 )
        v30 = v29;
      else
        v30 = v28;
      a2[2] = (char *)v30;
      v27 = realloc(v27, v30);
      *a2 = (char *)v27;
      if ( v27 == nullptr )
        abort();
      v25 = a2[1];
    }
    v25[(_QWORD)v27] = 32;
    ++a2[1];
    v24 = *(_QWORD *)(a1 + 32);
    if ( v24 == 0 )
    {
      v36 = (size_t)a2[1];
      goto LABEL_47;
    }
    v23 = *(const void **)(a1 + 24);
  }
  v31 = a2[1];
  v32 = (size_t)a2[2];
  v33 = *a2;
  v34 = &v31[v24];
  if ( (unsigned __int64)&v31[v24] > v32 )
  {
    if ( 2 * v32 <= (unsigned __int64)(v34 + 992) )
      v35 = (size_t)(v34 + 992);
    else
      v35 = 2 * v32;
    a2[2] = (char *)v35;
    v33 = (char *)realloc(v33, v35);
    *a2 = v33;
    if ( v33 == nullptr )
      abort();
    v31 = a2[1];
  }
  memcpy(&v31[(_QWORD)v33], v23, v24);
  v36 = (size_t)&a2[1][v24];
  a2[1] = (char *)v36;
LABEL_47:
  v39 = (unsigned __int64)a2[2];
  v40 = *a2;
  if ( v36 + 1 > v39 )
  {
    v41 = 2 * v39;
    v42 = v36 + 993;
    if ( v41 <= v42 )
      v43 = v42;
    else
      v43 = v41;
    a2[2] = (char *)v43;
    v40 = (char *)realloc(v40, v43);
    *a2 = v40;
    if ( v40 == nullptr )
      abort();
    v36 = (size_t)a2[1];
  }
  v40[v36] = 32;
  v44 = a2[1];
  v45 = *(__int64 **)(a1 + 40);
  v46 = v44 + 1;
  a2[1] = v44 + 1;
  v47 = *(unsigned __int16 *)(a1 + 9) << 26 >> 26;
  if ( v7 == 17408 )
    ++v47;
  if ( v47 > *(unsigned __int16 *)((char *)v45 + 9) << 26 >> 26 )
  {
    result = (*(__int64 (__fastcall **)(__int64 *, char **))(*v45 + 32))(v45, a2);
    if ( (*(_WORD *)((_BYTE *)v45 + 9) & 0xC0) != 0x40 )
      result = (*(__int64 (__fastcall **)(__int64 *, char **))(*v45 + 40))(v45, a2);
    if ( v4 == 0 )
      return result;
LABEL_75:
    v60 = a2[1];
    v61 = (unsigned __int64)a2[2];
    result = (__int64)*a2;
    v62 = v60 + 1;
    --*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v60 + 1) > v61 )
    {
      v63 = (unsigned __int64)(v60 + 993);
      if ( 2 * v61 <= v63 )
        v64 = v63;
      else
        v64 = 2 * v61;
      a2[2] = (char *)v64;
      result = (__int64)realloc((void *)result, v64);
      *a2 = (char *)result;
      if ( result == 0 )
        abort();
      v60 = a2[1];
      v62 = v60 + 1;
    }
    a2[1] = v62;
    v60[result] = 41;
    return result;
  }
  v49 = (unsigned __int64)a2[2];
  v50 = v44 + 2;
  v51 = *a2;
  ++*((_DWORD *)a2 + 8);
  if ( (unsigned __int64)(v44 + 2) > v49 )
  {
    v52 = (unsigned __int64)(v44 + 994);
    if ( 2 * v49 <= v52 )
      v53 = v52;
    else
      v53 = 2 * v49;
    a2[2] = (char *)v53;
    v51 = realloc(v51, v53);
    *a2 = (char *)v51;
    if ( v51 == nullptr )
      abort();
    v46 = a2[1];
    v50 = v46 + 1;
  }
  v54 = *v45;
  a2[1] = v50;
  v46[(_QWORD)v51] = 40;
  (*(void (__fastcall **)(__int64 *, char **))(v54 + 32))(v45, a2);
  if ( (*(_WORD *)((_BYTE *)v45 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64 *, char **))(*v45 + 40))(v45, a2);
  v55 = a2[1];
  v56 = (unsigned __int64)a2[2];
  result = (__int64)*a2;
  v57 = v55 + 1;
  --*((_DWORD *)a2 + 8);
  if ( (unsigned __int64)(v55 + 1) > v56 )
  {
    v58 = (unsigned __int64)(v55 + 993);
    if ( 2 * v56 <= v58 )
      v59 = v58;
    else
      v59 = 2 * v56;
    a2[2] = (char *)v59;
    result = (__int64)realloc((void *)result, v59);
    *a2 = (char *)result;
    if ( result == 0 )
      abort();
    v55 = a2[1];
    v57 = v55 + 1;
  }
  a2[1] = v57;
  v55[result] = 41;
  if ( v4 != 0 )
    goto LABEL_75;
  return result;
}


// Address: 0x1E978 | Function: sub_1E978
void sub_1E978()
{
  sub_13E30();
}


// Address: 0x1E984 | Function: sub_1E984
long double __fastcall sub_1E984(__int64 a1, long double *a2, __int64 *a3, _WORD *a4)
{
  _QWORD *v4; // x23
  __int64 v8; // x8
  _QWORD *v10; // x0
  __int64 v11; // x0
  __int16 v12; // w8
  char v13; // w10
  long double result; // q0
  __int16 v15; // w8
  __int64 v16; // x10

  v4 = *(_QWORD **)(a1 + 4912);
  v8 = v4[1];
  if ( (unsigned __int64)(v8 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v10 = malloc(0x1000u);
    if ( v10 == nullptr )
      sub_13E4C();
    v8 = 0;
    *v10 = v4;
    v10[1] = 0;
    v4 = v10;
    *(_QWORD *)(a1 + 4912) = v10;
  }
  v4[1] = v8 + 48;
  *(_QWORD *)((char *)v4 + v8 + 16) = off_37158;
  v11 = (__int64)v4 + v8 + 16;
  v12 = *(_WORD *)((char *)v4 + v8 + 25);
  v13 = *a4;
  *(_BYTE *)(v11 + 8) = 66;
  result = *a2;
  v15 = v12 & 0xF000 | v13 & 0x3F;
  v16 = *a3;
  *(long double *)(v11 + 16) = *a2;
  *(_WORD *)(v11 + 9) = v15 | 0x540;
  *(_QWORD *)(v11 + 32) = v16;
  return result;
}


// Address: 0x1EA44 | Function: sub_1EA44
__int64 __fastcall sub_1EA44(__int64 a1, char **a2)
{
  size_t v2; // x20
  char *v5; // x8
  size_t v6; // x9
  char *v7; // x0
  const void *v8; // x22
  char *v9; // x10
  size_t v10; // x1
  __int64 *v11; // x20
  __int64 result; // x0
  char *v13; // x8
  unsigned __int64 v14; // x10
  char *v15; // x0
  char *v16; // x9
  unsigned __int64 v17; // x8
  size_t v18; // x1
  __int64 v19; // x9
  char *v20; // x8
  unsigned __int64 v21; // x10
  char *v22; // x9
  unsigned __int64 v23; // x8
  size_t v24; // x1

  v2 = *(_QWORD *)(a1 + 24);
  if ( v2 != 0 )
  {
    v5 = a2[1];
    v6 = (size_t)a2[2];
    v7 = *a2;
    v8 = *(const void **)(a1 + 16);
    v9 = &v5[v2];
    if ( (unsigned __int64)&v5[v2] > v6 )
    {
      if ( 2 * v6 <= (unsigned __int64)(v9 + 992) )
        v10 = (size_t)(v9 + 992);
      else
        v10 = 2 * v6;
      a2[2] = (char *)v10;
      v7 = (char *)realloc(v7, v10);
      *a2 = v7;
      if ( v7 == nullptr )
        abort();
      v5 = a2[1];
    }
    memcpy(&v5[(_QWORD)v7], v8, v2);
    a2[1] += v2;
  }
  v11 = *(__int64 **)(a1 + 32);
  if ( (unsigned __int8)(*(_WORD *)(a1 + 9) & 0x3F) << 10 <= (*(_WORD *)((_BYTE *)v11 + 9) & 0x3Fu) << 10 )
  {
    v13 = a2[1];
    v14 = (unsigned __int64)a2[2];
    v15 = *a2;
    v16 = v13 + 1;
    ++*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v13 + 1) > v14 )
    {
      v17 = (unsigned __int64)(v13 + 993);
      if ( 2 * v14 <= v17 )
        v18 = v17;
      else
        v18 = 2 * v14;
      a2[2] = (char *)v18;
      v15 = (char *)realloc(v15, v18);
      *a2 = v15;
      if ( v15 == nullptr )
        abort();
      v13 = a2[1];
      v16 = v13 + 1;
    }
    a2[1] = v16;
    v19 = *v11;
    v13[(_QWORD)v15] = 40;
    (*(void (__fastcall **)(__int64 *, char **))(v19 + 32))(v11, a2);
    if ( (*(_WORD *)((_BYTE *)v11 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, char **))(*v11 + 40))(v11, a2);
    v20 = a2[1];
    v21 = (unsigned __int64)a2[2];
    result = (__int64)*a2;
    v22 = v20 + 1;
    --*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v20 + 1) > v21 )
    {
      v23 = (unsigned __int64)(v20 + 993);
      if ( 2 * v21 <= v23 )
        v24 = v23;
      else
        v24 = 2 * v21;
      a2[2] = (char *)v24;
      result = (__int64)realloc((void *)result, v24);
      *a2 = (char *)result;
      if ( result == 0 )
        abort();
      v20 = a2[1];
      v22 = v20 + 1;
    }
    a2[1] = v22;
    v20[result] = 41;
  }
  else
  {
    result = (*(__int64 (__fastcall **)(_QWORD, char **))(*v11 + 32))(*(_QWORD *)(a1 + 32), a2);
    if ( (*(_WORD *)((_BYTE *)v11 + 9) & 0xC0) != 0x40 )
      return (*(__int64 (__fastcall **)(__int64 *, char **))(*v11 + 40))(v11, a2);
  }
  return result;
}


// Address: 0x1EC24 | Function: sub_1EC24
void sub_1EC24()
{
  sub_13E30();
}


// Address: 0x1EC30 | Function: sub_1EC30
__int64 __fastcall sub_1EC30(__int64 a1, char **a2)
{
  __int64 *v2; // x21
  __int64 result; // x0
  size_t v6; // x21
  char *v7; // x8
  unsigned __int64 v8; // x10
  char *v9; // x0
  char *v10; // x9
  unsigned __int64 v11; // x8
  size_t v12; // x1
  __int64 v13; // x9
  char *v14; // x8
  unsigned __int64 v15; // x10
  char *v16; // x9
  unsigned __int64 v17; // x8
  size_t v18; // x1
  char *v19; // x8
  size_t v20; // x9
  char *v21; // x0
  const void *v22; // x20
  char *v23; // x10
  size_t v24; // x1

  v2 = *(__int64 **)(a1 + 16);
  if ( (*(unsigned __int16 *)(a1 + 9) << 26 >> 26) + 1 > (unsigned int)(*(unsigned __int16 *)((char *)v2 + 9) << 26 >> 26) )
  {
    result = (*(__int64 (__fastcall **)(_QWORD, char **))(*v2 + 32))(*(_QWORD *)(a1 + 16), a2);
    if ( (*(_WORD *)((_BYTE *)v2 + 9) & 0xC0) != 0x40 )
      result = (*(__int64 (__fastcall **)(__int64 *, char **))(*v2 + 40))(v2, a2);
    v6 = *(_QWORD *)(a1 + 32);
    if ( v6 == 0 )
      return result;
LABEL_21:
    v19 = a2[1];
    v20 = (size_t)a2[2];
    v21 = *a2;
    v22 = *(const void **)(a1 + 24);
    v23 = &v19[v6];
    if ( (unsigned __int64)&v19[v6] > v20 )
    {
      if ( 2 * v20 <= (unsigned __int64)(v23 + 992) )
        v24 = (size_t)(v23 + 992);
      else
        v24 = 2 * v20;
      a2[2] = (char *)v24;
      v21 = (char *)realloc(v21, v24);
      *a2 = v21;
      if ( v21 == nullptr )
        abort();
      v19 = a2[1];
    }
    result = (__int64)memcpy(&v19[(_QWORD)v21], v22, v6);
    a2[1] += v6;
    return result;
  }
  v7 = a2[1];
  v8 = (unsigned __int64)a2[2];
  v9 = *a2;
  v10 = v7 + 1;
  ++*((_DWORD *)a2 + 8);
  if ( (unsigned __int64)(v7 + 1) > v8 )
  {
    v11 = (unsigned __int64)(v7 + 993);
    if ( 2 * v8 <= v11 )
      v12 = v11;
    else
      v12 = 2 * v8;
    a2[2] = (char *)v12;
    v9 = (char *)realloc(v9, v12);
    *a2 = v9;
    if ( v9 == nullptr )
      abort();
    v7 = a2[1];
    v10 = v7 + 1;
  }
  a2[1] = v10;
  v13 = *v2;
  v7[(_QWORD)v9] = 40;
  (*(void (__fastcall **)(__int64 *, char **))(v13 + 32))(v2, a2);
  if ( (*(_WORD *)((_BYTE *)v2 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64 *, char **))(*v2 + 40))(v2, a2);
  v14 = a2[1];
  v15 = (unsigned __int64)a2[2];
  result = (__int64)*a2;
  v16 = v14 + 1;
  --*((_DWORD *)a2 + 8);
  if ( (unsigned __int64)(v14 + 1) > v15 )
  {
    v17 = (unsigned __int64)(v14 + 993);
    if ( 2 * v15 <= v17 )
      v18 = v17;
    else
      v18 = 2 * v15;
    a2[2] = (char *)v18;
    result = (__int64)realloc((void *)result, v18);
    *a2 = (char *)result;
    if ( result == 0 )
      abort();
    v14 = a2[1];
    v16 = v14 + 1;
  }
  a2[1] = v16;
  v14[result] = 41;
  v6 = *(_QWORD *)(a1 + 32);
  if ( v6 != 0 )
    goto LABEL_21;
  return result;
}


// Address: 0x1EE10 | Function: sub_1EE10
void sub_1EE10()
{
  sub_13E30();
}


// Address: 0x1EE1C | Function: sub_1EE1C
void *__fastcall sub_1EE1C(__int64 a1, __int64 a2)
{
  __int64 *v2; // x21
  __int64 v5; // x8
  unsigned __int64 v6; // x10
  void *v7; // x0
  __int64 v8; // x9
  unsigned __int64 v9; // x8
  size_t v10; // x1
  __int64 v11; // x9
  __int64 v12; // x8
  unsigned __int64 v13; // x10
  void *v14; // x0
  __int64 v15; // x9
  unsigned __int64 v16; // x8
  size_t v17; // x1
  __int64 v18; // x8
  unsigned __int64 v19; // x10
  void *v20; // x0
  __int64 v21; // x9
  unsigned __int64 v22; // x8
  size_t v23; // x1
  __int64 *v24; // x20
  __int64 v25; // x8
  unsigned __int64 v26; // x10
  void *v27; // x0
  __int64 v28; // x9
  unsigned __int64 v29; // x8
  size_t v30; // x1
  __int64 v31; // x9
  __int64 v32; // x8
  unsigned __int64 v33; // x10
  void *v34; // x0
  __int64 v35; // x9
  unsigned __int64 v36; // x8
  size_t v37; // x1
  __int64 v38; // x8
  unsigned __int64 v39; // x10
  void *result; // x0
  __int64 v41; // x9
  unsigned __int64 v42; // x8
  size_t v43; // x1

  v2 = *(__int64 **)(a1 + 16);
  if ( (unsigned __int8)(*(_WORD *)(a1 + 9) & 0x3F) << 10 <= (*(_WORD *)((_BYTE *)v2 + 9) & 0x3Fu) << 10 )
  {
    v5 = *(_QWORD *)(a2 + 8);
    v6 = *(_QWORD *)(a2 + 16);
    v7 = *(void **)a2;
    v8 = v5 + 1;
    ++*(_DWORD *)(a2 + 32);
    if ( v5 + 1 > v6 )
    {
      v9 = v5 + 993;
      if ( 2 * v6 <= v9 )
        v10 = v9;
      else
        v10 = 2 * v6;
      *(_QWORD *)(a2 + 16) = v10;
      v7 = realloc(v7, v10);
      *(_QWORD *)a2 = v7;
      if ( v7 == nullptr )
        abort();
      v5 = *(_QWORD *)(a2 + 8);
      v8 = v5 + 1;
    }
    *(_QWORD *)(a2 + 8) = v8;
    v11 = *v2;
    *((_BYTE *)v7 + v5) = 40;
    (*(void (__fastcall **)(__int64 *, __int64))(v11 + 32))(v2, a2);
    if ( (*(_WORD *)((_BYTE *)v2 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, __int64))(*v2 + 40))(v2, a2);
    v12 = *(_QWORD *)(a2 + 8);
    v13 = *(_QWORD *)(a2 + 16);
    v14 = *(void **)a2;
    v15 = v12 + 1;
    --*(_DWORD *)(a2 + 32);
    if ( v12 + 1 > v13 )
    {
      v16 = v12 + 993;
      if ( 2 * v13 <= v16 )
        v17 = v16;
      else
        v17 = 2 * v13;
      *(_QWORD *)(a2 + 16) = v17;
      v14 = realloc(v14, v17);
      *(_QWORD *)a2 = v14;
      if ( v14 == nullptr )
        abort();
      v12 = *(_QWORD *)(a2 + 8);
      v15 = v12 + 1;
    }
    *(_QWORD *)(a2 + 8) = v15;
    *((_BYTE *)v14 + v12) = 41;
  }
  else
  {
    (*(void (__fastcall **)(_QWORD, __int64))(*v2 + 32))(*(_QWORD *)(a1 + 16), a2);
    if ( (*(_WORD *)((_BYTE *)v2 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, __int64))(*v2 + 40))(v2, a2);
  }
  v18 = *(_QWORD *)(a2 + 8);
  v19 = *(_QWORD *)(a2 + 16);
  v20 = *(void **)a2;
  v21 = v18 + 1;
  ++*(_DWORD *)(a2 + 32);
  if ( v18 + 1 > v19 )
  {
    v22 = v18 + 993;
    if ( 2 * v19 <= v22 )
      v23 = v22;
    else
      v23 = 2 * v19;
    *(_QWORD *)(a2 + 16) = v23;
    v20 = realloc(v20, v23);
    *(_QWORD *)a2 = v20;
    if ( v20 == nullptr )
      abort();
    v18 = *(_QWORD *)(a2 + 8);
    v21 = v18 + 1;
  }
  *(_QWORD *)(a2 + 8) = v21;
  *((_BYTE *)v20 + v18) = 91;
  v24 = *(__int64 **)(a1 + 24);
  if ( (*(_WORD *)((_BYTE *)v24 + 9) & 0x3Fu) >= 0x13 )
  {
    v25 = *(_QWORD *)(a2 + 8);
    v26 = *(_QWORD *)(a2 + 16);
    v27 = *(void **)a2;
    v28 = v25 + 1;
    ++*(_DWORD *)(a2 + 32);
    if ( v25 + 1 > v26 )
    {
      v29 = v25 + 993;
      if ( 2 * v26 <= v29 )
        v30 = v29;
      else
        v30 = 2 * v26;
      *(_QWORD *)(a2 + 16) = v30;
      v27 = realloc(v27, v30);
      *(_QWORD *)a2 = v27;
      if ( v27 == nullptr )
        abort();
      v25 = *(_QWORD *)(a2 + 8);
      v28 = v25 + 1;
    }
    *(_QWORD *)(a2 + 8) = v28;
    v31 = *v24;
    *((_BYTE *)v27 + v25) = 40;
    (*(void (__fastcall **)(__int64 *, __int64))(v31 + 32))(v24, a2);
    if ( (*(_WORD *)((_BYTE *)v24 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, __int64))(*v24 + 40))(v24, a2);
    v32 = *(_QWORD *)(a2 + 8);
    v33 = *(_QWORD *)(a2 + 16);
    v34 = *(void **)a2;
    v35 = v32 + 1;
    --*(_DWORD *)(a2 + 32);
    if ( v32 + 1 > v33 )
    {
      v36 = v32 + 993;
      if ( 2 * v33 <= v36 )
        v37 = v36;
      else
        v37 = 2 * v33;
      *(_QWORD *)(a2 + 16) = v37;
      v34 = realloc(v34, v37);
      *(_QWORD *)a2 = v34;
      if ( v34 == nullptr )
        abort();
      v32 = *(_QWORD *)(a2 + 8);
      v35 = v32 + 1;
    }
    *(_QWORD *)(a2 + 8) = v35;
    *((_BYTE *)v34 + v32) = 41;
  }
  else
  {
    (*(void (__fastcall **)(__int64 *, __int64))(*v24 + 32))(v24, a2);
    if ( (*(_WORD *)((_BYTE *)v24 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, __int64))(*v24 + 40))(v24, a2);
  }
  v38 = *(_QWORD *)(a2 + 8);
  v39 = *(_QWORD *)(a2 + 16);
  result = *(void **)a2;
  v41 = v38 + 1;
  --*(_DWORD *)(a2 + 32);
  if ( v38 + 1 > v39 )
  {
    v42 = v38 + 993;
    if ( 2 * v39 <= v42 )
      v43 = v42;
    else
      v43 = 2 * v39;
    *(_QWORD *)(a2 + 16) = v43;
    result = realloc(result, v43);
    *(_QWORD *)a2 = result;
    if ( result == nullptr )
      abort();
    v38 = *(_QWORD *)(a2 + 8);
    v41 = v38 + 1;
  }
  *(_QWORD *)(a2 + 8) = v41;
  *((_BYTE *)result + v38) = 93;
  return result;
}


// Address: 0x1F174 | Function: sub_1F174
void sub_1F174()
{
  sub_13E30();
}


// Address: 0x1F180 | Function: sub_1F180
__int64 __fastcall sub_1F180(__int64 a1, char **a2)
{
  __int64 *v2; // x21
  size_t v5; // x21
  char *v6; // x8
  unsigned __int64 v7; // x10
  char *v8; // x0
  char *v9; // x9
  unsigned __int64 v10; // x8
  size_t v11; // x1
  __int64 v12; // x9
  char *v13; // x8
  unsigned __int64 v14; // x10
  char *v15; // x0
  char *v16; // x9
  unsigned __int64 v17; // x8
  size_t v18; // x1
  char *v19; // x8
  size_t v20; // x9
  char *v21; // x0
  const void *v22; // x22
  char *v23; // x10
  size_t v24; // x1
  __int64 *v25; // x21
  __int64 result; // x0
  char *v27; // x8
  unsigned __int64 v28; // x10
  void *v29; // x0
  char *v30; // x9
  unsigned __int64 v31; // x8
  size_t v32; // x1
  __int64 v33; // x9
  char *v34; // x8
  unsigned __int64 v35; // x10
  char *v36; // x9
  unsigned __int64 v37; // x8
  size_t v38; // x1

  v2 = *(__int64 **)(a1 + 16);
  if ( (*(unsigned __int16 *)(a1 + 9) << 26 >> 26) + 1 > (unsigned int)(*(unsigned __int16 *)((char *)v2 + 9) << 26 >> 26) )
  {
    (*(void (__fastcall **)(_QWORD, char **))(*v2 + 32))(*(_QWORD *)(a1 + 16), a2);
    if ( (*(_WORD *)((_BYTE *)v2 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, char **))(*v2 + 40))(v2, a2);
    v5 = *(_QWORD *)(a1 + 32);
    if ( v5 == 0 )
      goto LABEL_28;
LABEL_21:
    v19 = a2[1];
    v20 = (size_t)a2[2];
    v21 = *a2;
    v22 = *(const void **)(a1 + 24);
    v23 = &v19[v5];
    if ( (unsigned __int64)&v19[v5] > v20 )
    {
      if ( 2 * v20 <= (unsigned __int64)(v23 + 992) )
        v24 = (size_t)(v23 + 992);
      else
        v24 = 2 * v20;
      a2[2] = (char *)v24;
      v21 = (char *)realloc(v21, v24);
      *a2 = v21;
      if ( v21 == nullptr )
        abort();
      v19 = a2[1];
    }
    memcpy(&v19[(_QWORD)v21], v22, v5);
    a2[1] += v5;
    goto LABEL_28;
  }
  v6 = a2[1];
  v7 = (unsigned __int64)a2[2];
  v8 = *a2;
  v9 = v6 + 1;
  ++*((_DWORD *)a2 + 8);
  if ( (unsigned __int64)(v6 + 1) > v7 )
  {
    v10 = (unsigned __int64)(v6 + 993);
    if ( 2 * v7 <= v10 )
      v11 = v10;
    else
      v11 = 2 * v7;
    a2[2] = (char *)v11;
    v8 = (char *)realloc(v8, v11);
    *a2 = v8;
    if ( v8 == nullptr )
      abort();
    v6 = a2[1];
    v9 = v6 + 1;
  }
  a2[1] = v9;
  v12 = *v2;
  v6[(_QWORD)v8] = 40;
  (*(void (__fastcall **)(__int64 *, char **))(v12 + 32))(v2, a2);
  if ( (*(_WORD *)((_BYTE *)v2 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64 *, char **))(*v2 + 40))(v2, a2);
  v13 = a2[1];
  v14 = (unsigned __int64)a2[2];
  v15 = *a2;
  v16 = v13 + 1;
  --*((_DWORD *)a2 + 8);
  if ( (unsigned __int64)(v13 + 1) > v14 )
  {
    v17 = (unsigned __int64)(v13 + 993);
    if ( 2 * v14 <= v17 )
      v18 = v17;
    else
      v18 = 2 * v14;
    a2[2] = (char *)v18;
    v15 = (char *)realloc(v15, v18);
    *a2 = v15;
    if ( v15 == nullptr )
      abort();
    v13 = a2[1];
    v16 = v13 + 1;
  }
  a2[1] = v16;
  v13[(_QWORD)v15] = 41;
  v5 = *(_QWORD *)(a1 + 32);
  if ( v5 != 0 )
    goto LABEL_21;
LABEL_28:
  v25 = *(__int64 **)(a1 + 40);
  if ( (unsigned __int8)(*(_WORD *)(a1 + 9) & 0x3F) << 10 <= (*(_WORD *)((_BYTE *)v25 + 9) & 0x3Fu) << 10 )
  {
    v27 = a2[1];
    v28 = (unsigned __int64)a2[2];
    v29 = *a2;
    v30 = v27 + 1;
    ++*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v27 + 1) > v28 )
    {
      v31 = (unsigned __int64)(v27 + 993);
      if ( 2 * v28 <= v31 )
        v32 = v31;
      else
        v32 = 2 * v28;
      a2[2] = (char *)v32;
      v29 = realloc(v29, v32);
      *a2 = (char *)v29;
      if ( v29 == nullptr )
        abort();
      v27 = a2[1];
      v30 = v27 + 1;
    }
    a2[1] = v30;
    v33 = *v25;
    v27[(_QWORD)v29] = 40;
    (*(void (__fastcall **)(__int64 *, char **))(v33 + 32))(v25, a2);
    if ( (*(_WORD *)((_BYTE *)v25 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, char **))(*v25 + 40))(v25, a2);
    v34 = a2[1];
    v35 = (unsigned __int64)a2[2];
    result = (__int64)*a2;
    v36 = v34 + 1;
    --*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v34 + 1) > v35 )
    {
      v37 = (unsigned __int64)(v34 + 993);
      if ( 2 * v35 <= v37 )
        v38 = v37;
      else
        v38 = 2 * v35;
      a2[2] = (char *)v38;
      result = (__int64)realloc((void *)result, v38);
      *a2 = (char *)result;
      if ( result == 0 )
        abort();
      v34 = a2[1];
      v36 = v34 + 1;
    }
    a2[1] = v36;
    v34[result] = 41;
  }
  else
  {
    result = (*(__int64 (__fastcall **)(_QWORD, char **))(*v25 + 32))(*(_QWORD *)(a1 + 40), a2);
    if ( (*(_WORD *)((_BYTE *)v25 + 9) & 0xC0) != 0x40 )
      return (*(__int64 (__fastcall **)(__int64 *, char **))(*v25 + 40))(v25, a2);
  }
  return result;
}


// Address: 0x1F4AC | Function: sub_1F4AC
void sub_1F4AC()
{
  sub_13E30();
}


// Address: 0x1F4B8 | Function: sub_1F4B8
__int64 __fastcall sub_1F4B8(__int64 a1, char **a2)
{
  __int64 v2; // x8
  unsigned __int64 v5; // x9
  char *v6; // x0
  unsigned __int64 v7; // x9
  size_t v8; // x8
  size_t v9; // x1
  unsigned __int64 v10; // x9
  char *v11; // x0
  unsigned __int64 v12; // x9
  size_t v13; // x8
  size_t v14; // x1
  char *v15; // x8
  char *v16; // x9
  int v17; // w10
  __int64 v18; // x8
  unsigned __int64 v19; // x10
  char *v20; // x0
  unsigned __int64 v21; // x9
  size_t v22; // x1
  unsigned __int64 v23; // x10
  __int64 v24; // x9
  char *v25; // x0
  unsigned __int64 v26; // x8
  size_t v27; // x1
  char *v28; // x8
  unsigned __int64 v29; // x10
  void *v30; // x0
  char *v31; // x9
  unsigned __int64 v32; // x8
  size_t v33; // x1
  unsigned __int64 v34; // x9
  char *v35; // x0
  unsigned __int64 v36; // x9
  size_t v37; // x8
  size_t v38; // x1
  __int64 *v39; // x21
  __int64 v40; // x9
  __int64 result; // x0
  char *v42; // x8
  unsigned __int64 v43; // x10
  void *v44; // x0
  char *v45; // x9
  unsigned __int64 v46; // x8
  size_t v47; // x1
  char *v48; // x8
  unsigned __int64 v49; // x10
  char *v50; // x9
  unsigned __int64 v51; // x8
  size_t v52; // x1

  v2 = (__int64)a2[1];
  if ( *(_BYTE *)(a1 + 56) == 1 )
  {
    v5 = (unsigned __int64)a2[2];
    v6 = *a2;
    if ( v2 + 2 > v5 )
    {
      v7 = 2 * v5;
      v8 = v2 + 994;
      if ( v7 <= v8 )
        v9 = v8;
      else
        v9 = v7;
      a2[2] = (char *)v9;
      v6 = (char *)realloc(v6, v9);
      *a2 = v6;
      if ( v6 == nullptr )
        abort();
      v2 = (__int64)a2[1];
    }
    *(_WORD *)&v6[v2] = 14906;
    v2 = (__int64)(a2[1] + 2);
    a2[1] = (char *)v2;
  }
  v10 = (unsigned __int64)a2[2];
  v11 = *a2;
  if ( v2 + 3 > v10 )
  {
    v12 = 2 * v10;
    v13 = v2 + 995;
    if ( v12 <= v13 )
      v14 = v13;
    else
      v14 = v12;
    a2[2] = (char *)v14;
    v11 = (char *)realloc(v11, v14);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (__int64)a2[1];
  }
  v15 = &v11[v2];
  v15[2] = 119;
  *(_WORD *)v15 = 25966;
  v16 = a2[1];
  v17 = *(unsigned __int8 *)(a1 + 57);
  v18 = (__int64)(v16 + 3);
  a2[1] = v16 + 3;
  if ( v17 == 1 )
  {
    v19 = (unsigned __int64)a2[2];
    v20 = *a2;
    if ( (unsigned __int64)(v16 + 5) > v19 )
    {
      v21 = (unsigned __int64)(v16 + 997);
      if ( 2 * v19 <= v21 )
        v22 = v21;
      else
        v22 = 2 * v19;
      a2[2] = (char *)v22;
      v20 = (char *)realloc(v20, v22);
      *a2 = v20;
      if ( v20 == nullptr )
        abort();
      v18 = (__int64)a2[1];
    }
    *(_WORD *)&v20[v18] = 23899;
    v18 = (__int64)(a2[1] + 2);
    a2[1] = (char *)v18;
  }
  if ( *(_QWORD *)(a1 + 24) != 0 )
  {
    v23 = (unsigned __int64)a2[2];
    v24 = v18 + 1;
    v25 = *a2;
    ++*((_DWORD *)a2 + 8);
    if ( v18 + 1 > v23 )
    {
      v26 = v18 + 993;
      if ( 2 * v23 <= v26 )
        v27 = v26;
      else
        v27 = 2 * v23;
      a2[2] = (char *)v27;
      v25 = (char *)realloc(v25, v27);
      *a2 = v25;
      if ( v25 == nullptr )
        abort();
      v18 = (__int64)a2[1];
      v24 = v18 + 1;
    }
    a2[1] = (char *)v24;
    v25[v18] = 40;
    sub_1F824(a1 + 16, a2);
    v28 = a2[1];
    v29 = (unsigned __int64)a2[2];
    v30 = *a2;
    v31 = v28 + 1;
    --*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v28 + 1) > v29 )
    {
      v32 = (unsigned __int64)(v28 + 993);
      if ( 2 * v29 <= v32 )
        v33 = v32;
      else
        v33 = 2 * v29;
      a2[2] = (char *)v33;
      v30 = realloc(v30, v33);
      *a2 = (char *)v30;
      if ( v30 == nullptr )
        abort();
      v28 = a2[1];
      v31 = v28 + 1;
    }
    a2[1] = v31;
    v28[(_QWORD)v30] = 41;
    v18 = (__int64)a2[1];
  }
  v34 = (unsigned __int64)a2[2];
  v35 = *a2;
  if ( v18 + 1 > v34 )
  {
    v36 = 2 * v34;
    v37 = v18 + 993;
    if ( v36 <= v37 )
      v38 = v37;
    else
      v38 = v36;
    a2[2] = (char *)v38;
    v35 = (char *)realloc(v35, v38);
    *a2 = v35;
    if ( v35 == nullptr )
      abort();
    v18 = (__int64)a2[1];
  }
  v35[v18] = 32;
  v39 = *(__int64 **)(a1 + 32);
  v40 = *v39;
  ++a2[1];
  result = (*(__int64 (__fastcall **)(__int64 *, char **))(v40 + 32))(v39, a2);
  if ( (*(_WORD *)((_BYTE *)v39 + 9) & 0xC0) != 0x40 )
    result = (*(__int64 (__fastcall **)(__int64 *, char **))(*v39 + 40))(v39, a2);
  if ( *(_QWORD *)(a1 + 48) != 0 )
  {
    v42 = a2[1];
    v43 = (unsigned __int64)a2[2];
    v44 = *a2;
    v45 = v42 + 1;
    ++*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v42 + 1) > v43 )
    {
      v46 = (unsigned __int64)(v42 + 993);
      if ( 2 * v43 <= v46 )
        v47 = v46;
      else
        v47 = 2 * v43;
      a2[2] = (char *)v47;
      v44 = realloc(v44, v47);
      *a2 = (char *)v44;
      if ( v44 == nullptr )
        abort();
      v42 = a2[1];
      v45 = v42 + 1;
    }
    a2[1] = v45;
    v42[(_QWORD)v44] = 40;
    sub_1F824(a1 + 40, a2);
    v48 = a2[1];
    v49 = (unsigned __int64)a2[2];
    result = (__int64)*a2;
    v50 = v48 + 1;
    --*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v48 + 1) > v49 )
    {
      v51 = (unsigned __int64)(v48 + 993);
      if ( 2 * v49 <= v51 )
        v52 = v51;
      else
        v52 = 2 * v49;
      a2[2] = (char *)v52;
      result = (__int64)realloc((void *)result, v52);
      *a2 = (char *)result;
      if ( result == 0 )
        abort();
      v48 = a2[1];
      v50 = v48 + 1;
    }
    a2[1] = v50;
    v48[result] = 41;
  }
  return result;
}


// Address: 0x1F818 | Function: sub_1F818
void sub_1F818()
{
  sub_13E30();
}


// Address: 0x1F824 | Function: sub_1F824
_QWORD *__fastcall sub_1F824(_QWORD *result, __int64 a2)
{
  __int64 v2; // x24
  _QWORD *v3; // x19
  __int64 v5; // x22
  char v6; // w23
  __int64 v7; // x28
  unsigned __int64 v8; // x8
  _QWORD *v9; // x0
  unsigned __int64 v10; // x8
  size_t v11; // x1
  __int64 v12; // x8
  __int64 *v13; // x21
  unsigned __int64 v14; // x9
  __int64 v15; // x8
  _QWORD *v16; // x0
  size_t v17; // x1
  __int64 v18; // x9
  __int64 v19; // x8
  __int64 v20; // x8
  unsigned __int64 v21; // x10
  __int64 v22; // x9
  unsigned __int64 v23; // x8
  size_t v24; // x1

  if ( result[1] != 0 )
  {
    v2 = *(_QWORD *)(a2 + 8);
    v3 = result;
    v5 = 0;
    v6 = 1;
    do
    {
      v7 = v2;
      if ( (v6 & 1) == 0 )
      {
        v8 = *(_QWORD *)(a2 + 16);
        v9 = *(_QWORD **)a2;
        if ( v2 + 2 <= v8 )
        {
          v12 = v2;
        }
        else
        {
          v10 = 2 * v8;
          if ( v10 <= v2 + 994 )
            v11 = v2 + 994;
          else
            v11 = v10;
          *(_QWORD *)(a2 + 16) = v11;
          v9 = realloc(v9, v11);
          *(_QWORD *)a2 = v9;
          if ( v9 == nullptr )
            abort();
          v12 = *(_QWORD *)(a2 + 8);
        }
        *(_WORD *)((char *)v9 + v12) = 8236;
        v7 = *(_QWORD *)(a2 + 8) + 2LL;
        *(_QWORD *)(a2 + 8) = v7;
      }
      v13 = *(__int64 **)(*v3 + 8 * v5);
      if ( ((*(unsigned __int16 *)((char *)v13 + 9) >> 1) & 0x1Fu) >= 9 )
      {
        v14 = *(_QWORD *)(a2 + 16);
        v15 = v7 + 1;
        v16 = *(_QWORD **)a2;
        ++*(_DWORD *)(a2 + 32);
        if ( v7 + 1 <= v14 )
        {
          v18 = v7;
        }
        else
        {
          if ( 2 * v14 <= v7 + 993 )
            v17 = v7 + 993;
          else
            v17 = 2 * v14;
          *(_QWORD *)(a2 + 16) = v17;
          v16 = realloc(v16, v17);
          *(_QWORD *)a2 = v16;
          if ( v16 == nullptr )
            abort();
          v18 = *(_QWORD *)(a2 + 8);
          v15 = v18 + 1;
        }
        *(_QWORD *)(a2 + 8) = v15;
        v19 = *v13;
        *((_BYTE *)v16 + v18) = 40;
        (*(void (__fastcall **)(__int64 *, __int64))(v19 + 32))(v13, a2);
        if ( (*(_WORD *)((_BYTE *)v13 + 9) & 0xC0) != 0x40 )
          (*(void (__fastcall **)(__int64 *, __int64))(*v13 + 40))(v13, a2);
        v20 = *(_QWORD *)(a2 + 8);
        v21 = *(_QWORD *)(a2 + 16);
        result = *(_QWORD **)a2;
        v22 = v20 + 1;
        --*(_DWORD *)(a2 + 32);
        if ( v20 + 1 > v21 )
        {
          v23 = v20 + 993;
          if ( 2 * v21 <= v23 )
            v24 = v23;
          else
            v24 = 2 * v21;
          *(_QWORD *)(a2 + 16) = v24;
          result = realloc(result, v24);
          *(_QWORD *)a2 = result;
          if ( result == nullptr )
            abort();
          v20 = *(_QWORD *)(a2 + 8);
          v22 = v20 + 1;
        }
        *(_QWORD *)(a2 + 8) = v22;
        *((_BYTE *)result + v20) = 41;
      }
      else
      {
        result = (_QWORD *)(*(__int64 (__fastcall **)(_QWORD, __int64))(*v13 + 32))(*(_QWORD *)(*v3 + 8 * v5), a2);
        if ( (*(_WORD *)((_BYTE *)v13 + 9) & 0xC0) != 0x40 )
          result = (_QWORD *)(*(__int64 (__fastcall **)(__int64 *, __int64))(*v13 + 40))(v13, a2);
      }
      if ( v7 == *(_QWORD *)(a2 + 8) )
      {
        *(_QWORD *)(a2 + 8) = v2;
      }
      else
      {
        v6 = 0;
        v2 = *(_QWORD *)(a2 + 8);
      }
      ++v5;
    }
    while ( v5 != v3[1] );
  }
  return result;
}


// Address: 0x1FA54 | Function: sub_1FA54
__int64 __fastcall sub_1FA54(__int64 a1, char **a2)
{
  __int64 v2; // x8
  unsigned __int64 v5; // x9
  char *v6; // x0
  unsigned __int64 v7; // x9
  size_t v8; // x8
  size_t v9; // x1
  unsigned __int64 v10; // x9
  char *v11; // x0
  unsigned __int64 v12; // x9
  size_t v13; // x8
  size_t v14; // x1
  char *v15; // x8
  char *v16; // x9
  int v17; // w10
  __int64 v18; // x8
  unsigned __int64 v19; // x10
  char *v20; // x0
  unsigned __int64 v21; // x9
  size_t v22; // x1
  unsigned __int64 v23; // x10
  __int64 v24; // x9
  char *v25; // x0
  unsigned __int64 v26; // x8
  size_t v27; // x1
  __int64 v28; // x20
  __int64 result; // x0

  v2 = (__int64)a2[1];
  if ( *(_BYTE *)(a1 + 24) == 1 )
  {
    v5 = (unsigned __int64)a2[2];
    v6 = *a2;
    if ( v2 + 2 > v5 )
    {
      v7 = 2 * v5;
      v8 = v2 + 994;
      if ( v7 <= v8 )
        v9 = v8;
      else
        v9 = v7;
      a2[2] = (char *)v9;
      v6 = (char *)realloc(v6, v9);
      *a2 = v6;
      if ( v6 == nullptr )
        abort();
      v2 = (__int64)a2[1];
    }
    *(_WORD *)&v6[v2] = 14906;
    v2 = (__int64)(a2[1] + 2);
    a2[1] = (char *)v2;
  }
  v10 = (unsigned __int64)a2[2];
  v11 = *a2;
  if ( v2 + 6 > v10 )
  {
    v12 = 2 * v10;
    v13 = v2 + 998;
    if ( v12 <= v13 )
      v14 = v13;
    else
      v14 = v12;
    a2[2] = (char *)v14;
    v11 = (char *)realloc(v11, v14);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (__int64)a2[1];
  }
  v15 = &v11[v2];
  *((_WORD *)v15 + 2) = 25972;
  *(_DWORD *)v15 = 1701602660;
  v16 = a2[1];
  v17 = *(unsigned __int8 *)(a1 + 25);
  v18 = (__int64)(v16 + 6);
  a2[1] = v16 + 6;
  if ( v17 == 1 )
  {
    v19 = (unsigned __int64)a2[2];
    v20 = *a2;
    if ( (unsigned __int64)(v16 + 8) > v19 )
    {
      v21 = (unsigned __int64)(v16 + 1000);
      if ( 2 * v19 <= v21 )
        v22 = v21;
      else
        v22 = 2 * v19;
      a2[2] = (char *)v22;
      v20 = (char *)realloc(v20, v22);
      *a2 = v20;
      if ( v20 == nullptr )
        abort();
      v18 = (__int64)a2[1];
    }
    *(_WORD *)&v20[v18] = 23899;
    v18 = (__int64)(a2[1] + 2);
    a2[1] = (char *)v18;
  }
  v23 = (unsigned __int64)a2[2];
  v24 = v18 + 1;
  v25 = *a2;
  if ( v18 + 1 > v23 )
  {
    v26 = v18 + 993;
    if ( 2 * v23 <= v26 )
      v27 = v26;
    else
      v27 = 2 * v23;
    a2[2] = (char *)v27;
    v25 = (char *)realloc(v25, v27);
    *a2 = v25;
    if ( v25 == nullptr )
      abort();
    v18 = (__int64)a2[1];
    v24 = v18 + 1;
  }
  a2[1] = (char *)v24;
  v25[v18] = 32;
  v28 = *(_QWORD *)(a1 + 16);
  result = (*(__int64 (__fastcall **)(__int64, char **))(*(_QWORD *)v28 + 32LL))(v28, a2);
  if ( (*(_WORD *)(v28 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64, char **))(*(_QWORD *)v28 + 40LL))(v28, a2);
  return result;
}


// Address: 0x1FC2C | Function: sub_1FC2C
void sub_1FC2C()
{
  sub_13E30();
}


// Address: 0x1FC38 | Function: sub_1FC38
void *__fastcall sub_1FC38(__int64 a1, __int64 a2)
{
  __int64 v2; // x21
  __int64 v5; // x8
  unsigned __int64 v6; // x10
  void *v7; // x0
  __int64 v8; // x9
  unsigned __int64 v9; // x8
  size_t v10; // x1
  __int64 v11; // x8
  unsigned __int64 v12; // x10
  void *result; // x0
  __int64 v14; // x9
  unsigned __int64 v15; // x8
  size_t v16; // x1

  v2 = *(_QWORD *)(a1 + 16);
  (*(void (__fastcall **)(__int64))(*(_QWORD *)v2 + 32LL))(v2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v2 + 40LL))(v2, a2);
  v5 = *(_QWORD *)(a2 + 8);
  v6 = *(_QWORD *)(a2 + 16);
  v7 = *(void **)a2;
  v8 = v5 + 1;
  ++*(_DWORD *)(a2 + 32);
  if ( v5 + 1 > v6 )
  {
    v9 = v5 + 993;
    if ( 2 * v6 <= v9 )
      v10 = v9;
    else
      v10 = 2 * v6;
    *(_QWORD *)(a2 + 16) = v10;
    v7 = realloc(v7, v10);
    *(_QWORD *)a2 = v7;
    if ( v7 == nullptr )
      abort();
    v5 = *(_QWORD *)(a2 + 8);
    v8 = v5 + 1;
  }
  *(_QWORD *)(a2 + 8) = v8;
  *((_BYTE *)v7 + v5) = 40;
  sub_1F824((_QWORD *)(a1 + 24), a2);
  v11 = *(_QWORD *)(a2 + 8);
  v12 = *(_QWORD *)(a2 + 16);
  result = *(void **)a2;
  v14 = v11 + 1;
  --*(_DWORD *)(a2 + 32);
  if ( v11 + 1 > v12 )
  {
    v15 = v11 + 993;
    if ( 2 * v12 <= v15 )
      v16 = v15;
    else
      v16 = 2 * v12;
    *(_QWORD *)(a2 + 16) = v16;
    result = realloc(result, v16);
    *(_QWORD *)a2 = result;
    if ( result == nullptr )
      abort();
    v11 = *(_QWORD *)(a2 + 8);
    v14 = v11 + 1;
  }
  *(_QWORD *)(a2 + 8) = v14;
  *((_BYTE *)result + v11) = 41;
  return result;
}


// Address: 0x1FD5C | Function: sub_1FD5C
void sub_1FD5C()
{
  sub_13E30();
}


// Address: 0x1FD68 | Function: sub_1FD68
void *__fastcall sub_1FD68(__int64 a1, __int64 a2)
{
  __int64 v2; // x8
  unsigned __int64 v3; // x10
  void *v5; // x0
  __int64 v7; // x9
  unsigned __int64 v8; // x8
  size_t v9; // x1
  __int64 v10; // x21
  __int64 v11; // x8
  unsigned __int64 v12; // x10
  void *v13; // x0
  __int64 v14; // x9
  unsigned __int64 v15; // x8
  size_t v16; // x1
  __int64 v17; // x8
  unsigned __int64 v18; // x10
  void *v19; // x0
  __int64 v20; // x9
  unsigned __int64 v21; // x8
  size_t v22; // x1
  __int64 v23; // x8
  unsigned __int64 v24; // x10
  void *result; // x0
  __int64 v26; // x9
  unsigned __int64 v27; // x8
  size_t v28; // x1

  v2 = *(_QWORD *)(a2 + 8);
  v3 = *(_QWORD *)(a2 + 16);
  v5 = *(void **)a2;
  v7 = v2 + 1;
  ++*(_DWORD *)(a2 + 32);
  if ( v2 + 1 > v3 )
  {
    v8 = v2 + 993;
    if ( 2 * v3 <= v8 )
      v9 = v8;
    else
      v9 = 2 * v3;
    *(_QWORD *)(a2 + 16) = v9;
    v5 = realloc(v5, v9);
    *(_QWORD *)a2 = v5;
    if ( v5 == nullptr )
      abort();
    v2 = *(_QWORD *)(a2 + 8);
    v7 = v2 + 1;
  }
  *(_QWORD *)(a2 + 8) = v7;
  *((_BYTE *)v5 + v2) = 40;
  v10 = *(_QWORD *)(a1 + 16);
  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v10 + 32LL))(v10, a2);
  if ( (*(_WORD *)(v10 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v10 + 40LL))(v10, a2);
  v11 = *(_QWORD *)(a2 + 8);
  v12 = *(_QWORD *)(a2 + 16);
  v13 = *(void **)a2;
  v14 = v11 + 1;
  --*(_DWORD *)(a2 + 32);
  if ( v11 + 1 > v12 )
  {
    v15 = v11 + 993;
    if ( 2 * v12 <= v15 )
      v16 = v15;
    else
      v16 = 2 * v12;
    *(_QWORD *)(a2 + 16) = v16;
    v13 = realloc(v13, v16);
    *(_QWORD *)a2 = v13;
    if ( v13 == nullptr )
      abort();
    v11 = *(_QWORD *)(a2 + 8);
    v14 = v11 + 1;
  }
  *(_QWORD *)(a2 + 8) = v14;
  *((_BYTE *)v13 + v11) = 41;
  v17 = *(_QWORD *)(a2 + 8);
  v18 = *(_QWORD *)(a2 + 16);
  v19 = *(void **)a2;
  v20 = v17 + 1;
  ++*(_DWORD *)(a2 + 32);
  if ( v17 + 1 > v18 )
  {
    v21 = v17 + 993;
    if ( 2 * v18 <= v21 )
      v22 = v21;
    else
      v22 = 2 * v18;
    *(_QWORD *)(a2 + 16) = v22;
    v19 = realloc(v19, v22);
    *(_QWORD *)a2 = v19;
    if ( v19 == nullptr )
      abort();
    v17 = *(_QWORD *)(a2 + 8);
    v20 = v17 + 1;
  }
  *(_QWORD *)(a2 + 8) = v20;
  *((_BYTE *)v19 + v17) = 40;
  sub_1F824((_QWORD *)(a1 + 24), a2);
  v23 = *(_QWORD *)(a2 + 8);
  v24 = *(_QWORD *)(a2 + 16);
  result = *(void **)a2;
  v26 = v23 + 1;
  --*(_DWORD *)(a2 + 32);
  if ( v23 + 1 > v24 )
  {
    v27 = v23 + 993;
    if ( 2 * v24 <= v27 )
      v28 = v27;
    else
      v28 = 2 * v24;
    *(_QWORD *)(a2 + 16) = v28;
    result = realloc(result, v28);
    *(_QWORD *)a2 = result;
    if ( result == nullptr )
      abort();
    v23 = *(_QWORD *)(a2 + 8);
    v26 = v23 + 1;
  }
  *(_QWORD *)(a2 + 8) = v26;
  *((_BYTE *)result + v23) = 41;
  return result;
}


// Address: 0x1FF40 | Function: sub_1FF40
void sub_1FF40()
{
  sub_13E30();
}


// Address: 0x1FF4C | Function: sub_1FF4C
__int64 __fastcall sub_1FF4C(__int64 a1, char **a2)
{
  __int64 *v2; // x21
  char *v5; // x8
  unsigned __int64 v6; // x10
  char *v7; // x0
  char *v8; // x9
  unsigned __int64 v9; // x8
  size_t v10; // x1
  __int64 v11; // x9
  char *v12; // x8
  unsigned __int64 v13; // x10
  void *v14; // x0
  char *v15; // x9
  unsigned __int64 v16; // x8
  size_t v17; // x1
  char *v18; // x8
  unsigned __int64 v19; // x9
  char *v20; // x0
  unsigned __int64 v21; // x9
  size_t v22; // x8
  size_t v23; // x1
  char *v24; // x8
  char *v25; // x9
  __int64 *v26; // x21
  char *v27; // x8
  unsigned __int64 v28; // x11
  char *v29; // x10
  void *v30; // x0
  unsigned __int64 v31; // x9
  size_t v32; // x1
  __int64 v33; // x9
  char *v34; // x8
  unsigned __int64 v35; // x10
  void *v36; // x0
  char *v37; // x9
  unsigned __int64 v38; // x8
  size_t v39; // x1
  char *v40; // x8
  unsigned __int64 v41; // x9
  char *v42; // x0
  unsigned __int64 v43; // x9
  size_t v44; // x8
  size_t v45; // x1
  char *v46; // x8
  char *v47; // x9
  __int64 *v48; // x20
  char *v49; // x8
  __int64 result; // x0
  unsigned __int64 v51; // x11
  char *v52; // x10
  void *v53; // x0
  unsigned __int64 v54; // x9
  size_t v55; // x1
  __int64 v56; // x9
  char *v57; // x8
  unsigned __int64 v58; // x10
  char *v59; // x9
  unsigned __int64 v60; // x8
  size_t v61; // x1

  v2 = *(__int64 **)(a1 + 16);
  if ( (unsigned __int8)(*(_WORD *)(a1 + 9) & 0x3F) << 10 <= (*(_WORD *)((_BYTE *)v2 + 9) & 0x3Fu) << 10 )
  {
    v5 = a2[1];
    v6 = (unsigned __int64)a2[2];
    v7 = *a2;
    v8 = v5 + 1;
    ++*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v5 + 1) > v6 )
    {
      v9 = (unsigned __int64)(v5 + 993);
      if ( 2 * v6 <= v9 )
        v10 = v9;
      else
        v10 = 2 * v6;
      a2[2] = (char *)v10;
      v7 = (char *)realloc(v7, v10);
      *a2 = v7;
      if ( v7 == nullptr )
        abort();
      v5 = a2[1];
      v8 = v5 + 1;
    }
    a2[1] = v8;
    v11 = *v2;
    v5[(_QWORD)v7] = 40;
    (*(void (__fastcall **)(__int64 *, char **))(v11 + 32))(v2, a2);
    if ( (*(_WORD *)((_BYTE *)v2 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, char **))(*v2 + 40))(v2, a2);
    v12 = a2[1];
    v13 = (unsigned __int64)a2[2];
    v14 = *a2;
    v15 = v12 + 1;
    --*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v12 + 1) > v13 )
    {
      v16 = (unsigned __int64)(v12 + 993);
      if ( 2 * v13 <= v16 )
        v17 = v16;
      else
        v17 = 2 * v13;
      a2[2] = (char *)v17;
      v14 = realloc(v14, v17);
      *a2 = (char *)v14;
      if ( v14 == nullptr )
        abort();
      v12 = a2[1];
      v15 = v12 + 1;
    }
    a2[1] = v15;
    v12[(_QWORD)v14] = 41;
  }
  else
  {
    (*(void (__fastcall **)(_QWORD, char **))(*v2 + 32))(*(_QWORD *)(a1 + 16), a2);
    if ( (*(_WORD *)((_BYTE *)v2 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, char **))(*v2 + 40))(v2, a2);
  }
  v18 = a2[1];
  v19 = (unsigned __int64)a2[2];
  v20 = *a2;
  if ( (unsigned __int64)(v18 + 3) > v19 )
  {
    v21 = 2 * v19;
    v22 = (size_t)(v18 + 995);
    if ( v21 <= v22 )
      v23 = v22;
    else
      v23 = v21;
    a2[2] = (char *)v23;
    v20 = (char *)realloc(v20, v23);
    *a2 = v20;
    if ( v20 == nullptr )
      abort();
    v18 = a2[1];
  }
  v24 = &v18[(_QWORD)v20];
  v24[2] = 32;
  *(_WORD *)v24 = 16160;
  v25 = a2[1];
  v26 = *(__int64 **)(a1 + 24);
  v27 = v25 + 3;
  a2[1] = v25 + 3;
  if ( (*(_WORD *)((_BYTE *)v26 + 9) & 0x3Fu) >= 0x13 )
  {
    v28 = (unsigned __int64)a2[2];
    v29 = v25 + 4;
    v30 = *a2;
    ++*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v25 + 4) > v28 )
    {
      v31 = (unsigned __int64)(v25 + 996);
      if ( 2 * v28 <= v31 )
        v32 = v31;
      else
        v32 = 2 * v28;
      a2[2] = (char *)v32;
      v30 = realloc(v30, v32);
      *a2 = (char *)v30;
      if ( v30 == nullptr )
        abort();
      v27 = a2[1];
      v29 = v27 + 1;
    }
    v33 = *v26;
    a2[1] = v29;
    v27[(_QWORD)v30] = 40;
    (*(void (__fastcall **)(__int64 *, char **))(v33 + 32))(v26, a2);
    if ( (*(_WORD *)((_BYTE *)v26 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, char **))(*v26 + 40))(v26, a2);
    v34 = a2[1];
    v35 = (unsigned __int64)a2[2];
    v36 = *a2;
    v37 = v34 + 1;
    --*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v34 + 1) > v35 )
    {
      v38 = (unsigned __int64)(v34 + 993);
      if ( 2 * v35 <= v38 )
        v39 = v38;
      else
        v39 = 2 * v35;
      a2[2] = (char *)v39;
      v36 = realloc(v36, v39);
      *a2 = (char *)v36;
      if ( v36 == nullptr )
        abort();
      v34 = a2[1];
      v37 = v34 + 1;
    }
    a2[1] = v37;
    v34[(_QWORD)v36] = 41;
  }
  else
  {
    (*(void (__fastcall **)(__int64 *, char **))(*v26 + 32))(v26, a2);
    if ( (*(_WORD *)((_BYTE *)v26 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, char **))(*v26 + 40))(v26, a2);
  }
  v40 = a2[1];
  v41 = (unsigned __int64)a2[2];
  v42 = *a2;
  if ( (unsigned __int64)(v40 + 3) > v41 )
  {
    v43 = 2 * v41;
    v44 = (size_t)(v40 + 995);
    if ( v43 <= v44 )
      v45 = v44;
    else
      v45 = v43;
    a2[2] = (char *)v45;
    v42 = (char *)realloc(v42, v45);
    *a2 = v42;
    if ( v42 == nullptr )
      abort();
    v40 = a2[1];
  }
  v46 = &v40[(_QWORD)v42];
  v46[2] = 32;
  *(_WORD *)v46 = 14880;
  v47 = a2[1];
  v48 = *(__int64 **)(a1 + 32);
  v49 = v47 + 3;
  a2[1] = v47 + 3;
  if ( ((*(unsigned __int16 *)((char *)v48 + 9) >> 1) & 0x1Fu) >= 9 )
  {
    v51 = (unsigned __int64)a2[2];
    v52 = v47 + 4;
    v53 = *a2;
    ++*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v47 + 4) > v51 )
    {
      v54 = (unsigned __int64)(v47 + 996);
      if ( 2 * v51 <= v54 )
        v55 = v54;
      else
        v55 = 2 * v51;
      a2[2] = (char *)v55;
      v53 = realloc(v53, v55);
      *a2 = (char *)v53;
      if ( v53 == nullptr )
        abort();
      v49 = a2[1];
      v52 = v49 + 1;
    }
    v56 = *v48;
    a2[1] = v52;
    v49[(_QWORD)v53] = 40;
    (*(void (__fastcall **)(__int64 *, char **))(v56 + 32))(v48, a2);
    if ( (*(_WORD *)((_BYTE *)v48 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, char **))(*v48 + 40))(v48, a2);
    v57 = a2[1];
    v58 = (unsigned __int64)a2[2];
    result = (__int64)*a2;
    v59 = v57 + 1;
    --*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v57 + 1) > v58 )
    {
      v60 = (unsigned __int64)(v57 + 993);
      if ( 2 * v58 <= v60 )
        v61 = v60;
      else
        v61 = 2 * v58;
      a2[2] = (char *)v61;
      result = (__int64)realloc((void *)result, v61);
      *a2 = (char *)result;
      if ( result == 0 )
        abort();
      v57 = a2[1];
      v59 = v57 + 1;
    }
    a2[1] = v59;
    v57[result] = 41;
  }
  else
  {
    result = (*(__int64 (__fastcall **)(__int64 *, char **))(*v48 + 32))(v48, a2);
    if ( (*(_WORD *)((_BYTE *)v48 + 9) & 0xC0) != 0x40 )
      return (*(__int64 (__fastcall **)(__int64 *, char **))(*v48 + 40))(v48, a2);
  }
  return result;
}


// Address: 0x203F0 | Function: sub_203F0
void sub_203F0()
{
  sub_13E30();
}


// Address: 0x203FC | Function: sub_203FC
char *__fastcall sub_203FC(_QWORD *a1, char **a2)
{
  size_t v2; // x21
  size_t v3; // x8
  size_t v6; // x10
  const void *v7; // x22
  char *v8; // x0
  size_t v9; // x1
  unsigned __int64 v10; // x9
  int v11; // w21
  char *v12; // x0
  unsigned __int64 v13; // x9
  size_t v14; // x8
  size_t v15; // x1
  __int64 *v16; // x0
  __int64 v17; // x9
  char *v18; // x8
  unsigned __int64 v19; // x9
  void *v20; // x0
  unsigned __int64 v21; // x9
  size_t v22; // x8
  size_t v23; // x1
  char *v24; // x10
  unsigned __int64 v25; // x11
  void *v26; // x0
  char *v27; // x9
  char *v28; // x8
  size_t v29; // x1
  __int64 *v30; // x20
  char *v31; // x8
  unsigned __int64 v32; // x10
  void *v33; // x0
  char *v34; // x9
  unsigned __int64 v35; // x8
  size_t v36; // x1
  __int64 v37; // x9
  char *v38; // x8
  unsigned __int64 v39; // x10
  void *v40; // x0
  char *v41; // x9
  unsigned __int64 v42; // x8
  size_t v43; // x1
  char *v44; // x8
  unsigned __int64 v45; // x10
  char *result; // x0
  char *v47; // x9
  unsigned __int64 v48; // x8
  size_t v49; // x1

  v2 = a1[3];
  v3 = (size_t)a2[1];
  if ( v2 != 0 )
  {
    v6 = (size_t)a2[2];
    v7 = (const void *)a1[2];
    v8 = *a2;
    if ( v3 + v2 > v6 )
    {
      if ( 2 * v6 <= v3 + v2 + 992 )
        v9 = v3 + v2 + 992;
      else
        v9 = 2 * v6;
      a2[2] = (char *)v9;
      v8 = (char *)realloc(v8, v9);
      *a2 = v8;
      if ( v8 == nullptr )
        abort();
      v3 = (size_t)a2[1];
    }
    memcpy(&v8[v3], v7, v2);
    v3 = (size_t)&a2[1][v2];
    a2[1] = (char *)v3;
  }
  v10 = (unsigned __int64)a2[2];
  v11 = *((_DWORD *)a2 + 8);
  v12 = *a2;
  *((_DWORD *)a2 + 8) = 0;
  if ( v3 + 1 > v10 )
  {
    v13 = 2 * v10;
    v14 = v3 + 993;
    if ( v13 <= v14 )
      v15 = v14;
    else
      v15 = v13;
    a2[2] = (char *)v15;
    v12 = (char *)realloc(v12, v15);
    *a2 = v12;
    if ( v12 == nullptr )
      abort();
    v3 = (size_t)a2[1];
  }
  v12[v3] = 60;
  v16 = (__int64 *)a1[4];
  v17 = *v16;
  ++a2[1];
  (*(void (__fastcall **)(__int64 *, char **))(v17 + 32))(v16, a2);
  v18 = a2[1];
  v19 = (unsigned __int64)a2[2];
  v20 = *a2;
  if ( (unsigned __int64)(v18 + 1) > v19 )
  {
    v21 = 2 * v19;
    v22 = (size_t)(v18 + 993);
    if ( v21 <= v22 )
      v23 = v22;
    else
      v23 = v21;
    a2[2] = (char *)v23;
    v20 = realloc(v20, v23);
    *a2 = (char *)v20;
    if ( v20 == nullptr )
      abort();
    v18 = a2[1];
  }
  v18[(_QWORD)v20] = 62;
  v24 = a2[1];
  v25 = (unsigned __int64)a2[2];
  v26 = *a2;
  *((_DWORD *)a2 + 8) = v11 + 1;
  v27 = v24 + 2;
  v28 = v24 + 1;
  a2[1] = v24 + 1;
  if ( (unsigned __int64)(v24 + 2) > v25 )
  {
    if ( 2 * v25 <= (unsigned __int64)(v24 + 994) )
      v29 = (size_t)(v24 + 994);
    else
      v29 = 2 * v25;
    a2[2] = (char *)v29;
    v26 = realloc(v26, v29);
    *a2 = (char *)v26;
    if ( v26 == nullptr )
      abort();
    v28 = a2[1];
    v27 = v28 + 1;
  }
  a2[1] = v27;
  v28[(_QWORD)v26] = 40;
  v30 = (__int64 *)a1[5];
  if ( (*(_WORD *)((_BYTE *)v30 + 9) & 0x3Fu) >= 0x13 )
  {
    v31 = a2[1];
    v32 = (unsigned __int64)a2[2];
    v33 = *a2;
    v34 = v31 + 1;
    ++*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v31 + 1) > v32 )
    {
      v35 = (unsigned __int64)(v31 + 993);
      if ( 2 * v32 <= v35 )
        v36 = v35;
      else
        v36 = 2 * v32;
      a2[2] = (char *)v36;
      v33 = realloc(v33, v36);
      *a2 = (char *)v33;
      if ( v33 == nullptr )
        abort();
      v31 = a2[1];
      v34 = v31 + 1;
    }
    a2[1] = v34;
    v37 = *v30;
    v31[(_QWORD)v33] = 40;
    (*(void (__fastcall **)(__int64 *, char **))(v37 + 32))(v30, a2);
    if ( (*(_WORD *)((_BYTE *)v30 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, char **))(*v30 + 40))(v30, a2);
    v38 = a2[1];
    v39 = (unsigned __int64)a2[2];
    v40 = *a2;
    v41 = v38 + 1;
    --*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v38 + 1) > v39 )
    {
      v42 = (unsigned __int64)(v38 + 993);
      if ( 2 * v39 <= v42 )
        v43 = v42;
      else
        v43 = 2 * v39;
      a2[2] = (char *)v43;
      v40 = realloc(v40, v43);
      *a2 = (char *)v40;
      if ( v40 == nullptr )
        abort();
      v38 = a2[1];
      v41 = v38 + 1;
    }
    a2[1] = v41;
    v38[(_QWORD)v40] = 41;
  }
  else
  {
    (*(void (__fastcall **)(__int64 *, char **))(*v30 + 32))(v30, a2);
    if ( (*(_WORD *)((_BYTE *)v30 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, char **))(*v30 + 40))(v30, a2);
  }
  v44 = a2[1];
  v45 = (unsigned __int64)a2[2];
  result = *a2;
  v47 = v44 + 1;
  --*((_DWORD *)a2 + 8);
  if ( (unsigned __int64)(v44 + 1) > v45 )
  {
    v48 = (unsigned __int64)(v44 + 993);
    if ( 2 * v45 <= v48 )
      v49 = v48;
    else
      v49 = 2 * v45;
    a2[2] = (char *)v49;
    result = (char *)realloc(result, v49);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v44 = a2[1];
    v47 = v44 + 1;
  }
  a2[1] = v47;
  v44[(_QWORD)result] = 41;
  return result;
}


// Address: 0x20730 | Function: sub_20730
void __fastcall __noreturn sub_20730(__int64 a1)
{
  __int64 v1; // x19
  int v2; // w21

  *(_DWORD *)(v1 + 32) = v2;
  sub_2E950(a1);
}


// Address: 0x20738 | Function: sub_20738
void sub_20738()
{
  sub_13E30();
}


// Address: 0x20744 | Function: sub_20744
char *__fastcall sub_20744(_QWORD *a1, char **a2)
{
  size_t v2; // x21
  size_t v3; // x8
  size_t v6; // x10
  const void *v7; // x22
  char *v8; // x0
  size_t v9; // x1
  unsigned __int64 v10; // x10
  size_t v11; // x9
  char *v12; // x0
  unsigned __int64 v13; // x8
  size_t v14; // x1
  __int64 v15; // x21
  char *v16; // x8
  unsigned __int64 v17; // x10
  char *result; // x0
  char *v19; // x9
  unsigned __int64 v20; // x8
  size_t v21; // x1
  size_t v22; // x21
  char *v23; // x8
  size_t v24; // x9
  char *v25; // x0
  const void *v26; // x20
  char *v27; // x10
  size_t v28; // x1

  v2 = a1[3];
  v3 = (size_t)a2[1];
  if ( v2 != 0 )
  {
    v6 = (size_t)a2[2];
    v7 = (const void *)a1[2];
    v8 = *a2;
    if ( v3 + v2 > v6 )
    {
      if ( 2 * v6 <= v3 + v2 + 992 )
        v9 = v3 + v2 + 992;
      else
        v9 = 2 * v6;
      a2[2] = (char *)v9;
      v8 = (char *)realloc(v8, v9);
      *a2 = v8;
      if ( v8 == nullptr )
        abort();
      v3 = (size_t)a2[1];
    }
    memcpy(&v8[v3], v7, v2);
    v3 = (size_t)&a2[1][v2];
    a2[1] = (char *)v3;
  }
  v10 = (unsigned __int64)a2[2];
  v11 = v3 + 1;
  v12 = *a2;
  ++*((_DWORD *)a2 + 8);
  if ( v3 + 1 > v10 )
  {
    v13 = v3 + 993;
    if ( 2 * v10 <= v13 )
      v14 = v13;
    else
      v14 = 2 * v10;
    a2[2] = (char *)v14;
    v12 = (char *)realloc(v12, v14);
    *a2 = v12;
    if ( v12 == nullptr )
      abort();
    v3 = (size_t)a2[1];
    v11 = v3 + 1;
  }
  a2[1] = (char *)v11;
  v12[v3] = 40;
  v15 = a1[4];
  (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v15 + 32LL))(v15, a2);
  if ( (*(_WORD *)(v15 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v15 + 40LL))(v15, a2);
  v16 = a2[1];
  v17 = (unsigned __int64)a2[2];
  result = *a2;
  v19 = v16 + 1;
  --*((_DWORD *)a2 + 8);
  if ( (unsigned __int64)(v16 + 1) > v17 )
  {
    v20 = (unsigned __int64)(v16 + 993);
    if ( 2 * v17 <= v20 )
      v21 = v20;
    else
      v21 = 2 * v17;
    a2[2] = (char *)v21;
    result = (char *)realloc(result, v21);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v16 = a2[1];
    v19 = v16 + 1;
  }
  a2[1] = v19;
  v16[(_QWORD)result] = 41;
  v22 = a1[6];
  if ( v22 != 0 )
  {
    v23 = a2[1];
    v24 = (size_t)a2[2];
    v25 = *a2;
    v26 = (const void *)a1[5];
    v27 = &v23[v22];
    if ( (unsigned __int64)&v23[v22] > v24 )
    {
      if ( 2 * v24 <= (unsigned __int64)(v27 + 992) )
        v28 = (size_t)(v27 + 992);
      else
        v28 = 2 * v24;
      a2[2] = (char *)v28;
      v25 = (char *)realloc(v25, v28);
      *a2 = v25;
      if ( v25 == nullptr )
        abort();
      v23 = a2[1];
    }
    result = (char *)memcpy(&v23[(_QWORD)v25], v26, v22);
    a2[1] += v22;
  }
  return result;
}


// Address: 0x2092C | Function: sub_2092C
void sub_2092C()
{
  sub_13E30();
}


// Address: 0x20938 | Function: sub_20938
char *__fastcall sub_20938(__int64 a1, __int64 a2, __int64 a3)
{
  unsigned __int8 *v6; // x0
  __int64 v7; // x1
  unsigned __int8 *v8; // x9
  _QWORD *v9; // x22
  __int64 v10; // x8
  unsigned __int8 *v11; // x23
  __int64 v12; // x24
  _QWORD *v13; // x0
  __int64 v14; // x9
  char *v15; // x8

  v6 = sub_1530C((unsigned __int8 **)a1, 1);
  if ( v7 == 0 )
    return nullptr;
  v8 = *(unsigned __int8 **)a1;
  if ( *(_QWORD *)a1 == *(_QWORD *)(a1 + 8) || *v8 != 69 )
    return nullptr;
  v9 = *(_QWORD **)(a1 + 4912);
  *(_QWORD *)a1 = v8 + 1;
  v10 = v9[1];
  if ( (unsigned __int64)(v10 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v11 = v6;
    v12 = v7;
    v13 = malloc(0x1000u);
    if ( v13 == nullptr )
      sub_13E4C();
    v10 = 0;
    *v13 = v9;
    v13[1] = 0;
    v9 = v13;
    *(_QWORD *)(a1 + 4912) = v13;
    v7 = v12;
    v6 = v11;
  }
  v14 = v10 + 48;
  v15 = (char *)v9 + v10;
  v9[1] = v14;
  *((_QWORD *)v15 + 2) = off_37628;
  v15 += 16;
  LOWORD(v14) = *(_WORD *)(v15 + 9);
  v15[8] = 77;
  *((_QWORD *)v15 + 4) = v6;
  *((_QWORD *)v15 + 5) = v7;
  *((_QWORD *)v15 + 2) = a2;
  *((_QWORD *)v15 + 3) = a3;
  *(_WORD *)(v15 + 9) = v14 & 0xF000 | 0x540;
  return v15;
}


// Address: 0x20A2C | Function: sub_20A2C
char *__fastcall sub_20A2C(__int64 a1, int *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x8
  int v8; // w10
  char *result; // x0
  __int16 v10; // w9

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4064) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v7 = v4 + 16;
  v8 = *a2;
  v2[1] = v7;
  result = (char *)v2 + v7;
  v10 = *(_WORD *)((char *)v2 + v7 + 9);
  result[8] = 73;
  *(_QWORD *)result = off_37698;
  *(_WORD *)(result + 9) = v10 & 0xF000 | 0x540;
  result[11] = v8 != 0;
  return result;
}


// Address: 0x20AD4 | Function: sub_20AD4
__int64 __fastcall sub_20AD4(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 result; // x0
  __int16 v8; // w8
  __int64 v9; // x9

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 32;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_37858;
  result = (__int64)v2 + v4 + 16;
  v8 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 74;
  v9 = *a2;
  *(_WORD *)(result + 9) = v8 & 0xF000 | 0x540;
  *(_QWORD *)(result + 16) = v9;
  return result;
}


// Address: 0x20C20 | Function: sub_20C20
unsigned __int8 *__fastcall sub_20C20(unsigned __int8 **a1, size_t size)
{
  unsigned __int8 *v3; // x8
  unsigned __int8 *v4; // x10
  unsigned __int8 *result; // x0
  unsigned __int8 *v6; // x9
  unsigned __int8 *v7; // x20
  __int64 v8; // x8
  unsigned __int8 *v9; // x0
  __int16 v10; // w8
  unsigned __int8 *v11; // x9
  unsigned __int8 *v12; // x20
  signed __int64 v13; // x21
  void ***v14; // x22
  unsigned __int8 **v15; // x21
  __int64 v16; // x20
  unsigned __int8 *v17; // x9
  unsigned __int8 *v18; // x8
  char *v19; // x0
  unsigned __int8 *v20; // x11
  unsigned __int8 *v21; // x10
  unsigned __int8 *v22; // x22
  __int64 v23; // x8
  unsigned __int8 *v24; // x0
  __int16 v25; // w8
  size_t v26; // x2
  char *v27; // x22
  unsigned __int8 *v28; // x8
  unsigned __int8 *v29; // x27
  unsigned __int8 *v30; // x28
  unsigned __int64 v31; // x9
  unsigned __int8 **v32; // x25
  char *v33; // x0
  unsigned __int8 *v34; // x24
  unsigned __int8 *v35; // x8
  int v36; // w1
  _BYTE *v37; // x0
  unsigned __int8 *v38; // x23
  __int64 v39; // x26
  __int64 v40; // x22
  size_t v41; // x2
  char *v42; // x24
  size_t v43; // x1
  unsigned __int8 *v44; // x8
  unsigned __int8 *v45; // x8
  unsigned __int8 *v46; // x9
  char v47; // w21
  unsigned __int8 **v48; // x24
  int v49; // w8
  unsigned __int8 *v50; // x23
  unsigned __int8 *v51; // x22
  __int64 v52; // x25
  __int64 v53; // x21
  char *v54; // x0
  size_t v55; // x2
  char *v56; // x23
  unsigned __int8 *v57; // x8
  char *v58; // x0
  size_t v59; // x1
  unsigned __int8 *v60; // x8
  unsigned __int8 *v61; // x9
  char v62; // w21
  unsigned __int8 *v63; // x9
  unsigned __int8 *v64; // x11
  signed __int64 v65; // x12
  unsigned __int8 *v66; // x10
  unsigned __int8 *v67; // x12
  unsigned __int8 *v68; // x11
  void *v69; // x8
  bool v70; // zf
  __int64 v71; // x20
  unsigned __int8 *v72; // [xsp+8h] [xbp-B8h]
  _QWORD v73[2]; // [xsp+10h] [xbp-B0h] BYREF
  __int64 v74; // [xsp+20h] [xbp-A0h] BYREF
  _QWORD v75[2]; // [xsp+28h] [xbp-98h] BYREF
  __int64 v76; // [xsp+38h] [xbp-88h] BYREF
  _QWORD v77[2]; // [xsp+40h] [xbp-80h] BYREF
  unsigned __int8 **v78; // [xsp+50h] [xbp-70h]
  unsigned __int64 v79; // [xsp+58h] [xbp-68h]
  void *ptr[3]; // [xsp+60h] [xbp-60h] BYREF
  _QWORD v81[8]; // [xsp+78h] [xbp-48h] BYREF
  __int64 v82; // [xsp+B8h] [xbp-8h] BYREF

  if ( size != 0 )
    a1[84] = a1[83];
  v4 = *a1;
  v3 = a1[1];
  if ( (unsigned __int64)(v3 - *a1) < 2 )
    return nullptr;
  if ( *(_WORD *)v4 != 29781 )
  {
    if ( *(_WORD *)v4 != 27733 )
    {
      if ( *(_WORD *)v4 == 25173 )
      {
        v6 = v4 + 2;
        *a1 = v4 + 2;
        if ( v3 != v4 + 2 && (unsigned int)*v6 - 58 >= 0xFFFFFFF6 )
        {
          do
          {
            if ( (unsigned int)*v6 - 58 < 0xFFFFFFF6 )
              break;
            *a1 = ++v6;
          }
          while ( v6 != v3 );
        }
        if ( v6 != v3 && *v6 == 95 )
        {
          v7 = a1[614];
          *a1 = v6 + 1;
          v8 = *((_QWORD *)v7 + 1);
          if ( (unsigned __int64)(v8 - 4048) > 0xFFFFFFFFFFFFF00FLL )
          {
LABEL_17:
            *((_QWORD *)v7 + 1) = v8 + 32;
            *(_QWORD *)&v7[v8 + 16] = off_36BB8;
            result = &v7[v8 + 16];
            v10 = *(_WORD *)&v7[v8 + 25] & 0xF000;
            result[8] = 8;
            *(_WORD *)(result + 9) = v10 | 0x540;
            *((_QWORD *)result + 2) = "'block-literal'";
            *((_QWORD *)result + 3) = 15;
            return result;
          }
          v9 = (unsigned __int8 *)malloc(0x1000u);
          if ( v9 != nullptr )
          {
            v8 = 0;
            *(_QWORD *)v9 = v7;
            *((_QWORD *)v9 + 1) = 0;
            v7 = v9;
            a1[614] = v9;
            goto LABEL_17;
          }
LABEL_111:
          sub_13E4C();
        }
      }
      return nullptr;
    }
    v14 = (void ***)a1[84];
    v15 = (unsigned __int8 **)a1[83];
    *a1 = v4 + 2;
    v16 = (char *)v14 - (char *)v15;
    ptr[0] = v81;
    ptr[1] = v81;
    v17 = a1[98];
    a1[98] = (unsigned __int8 *)(((char *)v14 - (char *)v15) >> 3);
    v78 = a1;
    v79 = ((char *)v14 - (char *)v15) >> 3;
    v18 = a1[85];
    v72 = v17;
    ptr[2] = &v82;
    memset(v81, 0, sizeof(v81));
    if ( v14 == (void ***)v18 )
    {
      if ( v15 == a1 + 86 )
      {
        v19 = (char *)malloc(2 * v16);
        if ( v19 == nullptr )
          abort();
        if ( v14 != (void ***)v15 )
        {
          v26 = (char *)v14 - (char *)v15;
          v27 = v19;
          memmove(v19, v15, v26);
          v19 = v27;
        }
        a1[83] = (unsigned __int8 *)v19;
      }
      else
      {
        v19 = (char *)realloc(v15, 2 * v16);
        a1[83] = (unsigned __int8 *)v19;
        if ( v19 == nullptr )
          abort();
      }
      v14 = (void ***)&v19[v16];
      a1[84] = (unsigned __int8 *)&v19[v16];
      a1[85] = (unsigned __int8 *)&v19[8 * (v16 >> 2)];
    }
    a1[84] = (unsigned __int8 *)(v14 + 1);
    *v14 = ptr;
    v28 = *a1;
    v30 = a1[2];
    v29 = a1[3];
    v31 = a1[1] - *a1;
    if ( v31 != 0 )
    {
      v32 = a1 + 5;
      do
      {
        if ( *v28 != 84 )
          break;
        v36 = v31 < 2 ? 0 : v28[1];
        v37 = memchr("yptnk", v36, 5u);
        if ( v37 == nullptr || v37 - "yptnk" == -1 )
          break;
        result = (unsigned __int8 *)sub_2205C(a1, ptr);
        if ( result == nullptr )
          goto LABEL_103;
        v34 = a1[3];
        if ( v34 == a1[4] )
        {
          v38 = a1[2];
          v39 = (__int64)result;
          v40 = v34 - v38;
          if ( v38 == (unsigned __int8 *)v32 )
          {
            v33 = (char *)malloc(2 * (v34 - v38));
            if ( v33 == nullptr )
              abort();
            if ( v34 != (unsigned __int8 *)v32 )
            {
              v41 = v34 - v38;
              v42 = v33;
              memmove(v33, v38, v41);
              v33 = v42;
            }
            a1[2] = (unsigned __int8 *)v33;
          }
          else
          {
            v33 = (char *)realloc(a1[2], 2 * (v34 - v38));
            a1[2] = (unsigned __int8 *)v33;
            if ( v33 == nullptr )
              abort();
          }
          v34 = (unsigned __int8 *)&v33[v40];
          v35 = (unsigned __int8 *)&v33[8 * (v40 >> 2)];
          result = (unsigned __int8 *)v39;
          a1[3] = v34;
          a1[4] = v35;
        }
        a1[3] = v34 + 8;
        *(_QWORD *)v34 = result;
        v28 = *a1;
        v31 = a1[1] - *a1;
      }
      while ( v31 != 0 );
    }
    v77[0] = sub_17574(a1, (v29 - v30) >> 3);
    v77[1] = v43;
    if ( v43 == 0 )
    {
      v44 = a1[84];
      if ( v44 == a1[83] )
        sub_1405C(
          "%s:%d: %s",
          "out/llvm-project/libcxxabi/src/demangle/ItaniumDemangle.h",
          129,
          "Popping empty vector!");
      a1[84] = v44 - 8;
    }
    v45 = *a1;
    v46 = a1[1];
    v76 = 0;
    if ( v45 != v46 )
    {
      if ( *v45 == 81 )
      {
        v47 = *((_BYTE *)a1 + 778);
        *a1 = v45 + 1;
        *((_BYTE *)a1 + 778) = 1;
        result = (unsigned __int8 *)sub_1A440((__int64)a1, v43);
        *((_BYTE *)a1 + 778) = v47;
        v76 = (__int64)result;
        if ( result == nullptr )
          goto LABEL_103;
        v45 = *a1;
        v46 = a1[1];
      }
      if ( v46 != v45 && *v45 == 118 )
      {
        *a1 = v45 + 1;
LABEL_84:
        v58 = sub_17574(a1, (v29 - v30) >> 3);
        v61 = *a1;
        v60 = a1[1];
        v75[0] = v58;
        v75[1] = v59;
        v74 = 0;
        if ( v61 == v60 )
          goto LABEL_102;
        if ( *v61 != 81 )
        {
LABEL_88:
          if ( v61 != v60 && *v61 == 69 )
          {
            v63 = v61 + 1;
            *a1 = v63;
            if ( v60 == v63 || (unsigned int)*v63 - 58 < 0xFFFFFFF6 )
            {
              v64 = nullptr;
              v65 = 0;
            }
            else
            {
              v66 = v63;
              while ( (unsigned int)*v66 - 58 >= 0xFFFFFFF6 )
              {
                *a1 = ++v66;
                if ( v66 == v60 )
                {
                  v67 = v60;
                  goto LABEL_98;
                }
              }
              v67 = v66;
LABEL_98:
              v64 = v63;
              v65 = v67 - v63;
              v63 = v66;
            }
            v73[0] = v64;
            v73[1] = v65;
            if ( v63 != v60 && *v63 == 95 )
            {
              *a1 = v63 + 1;
              result = (unsigned __int8 *)sub_229D4(a1, v77, &v76, v75, &v74, v73);
              goto LABEL_103;
            }
          }
LABEL_102:
          result = nullptr;
          goto LABEL_103;
        }
        v62 = *((_BYTE *)a1 + 778);
        *a1 = v61 + 1;
        *((_BYTE *)a1 + 778) = 1;
        result = (unsigned __int8 *)sub_1A440((__int64)a1, v59);
        *((_BYTE *)a1 + 778) = v62;
        v74 = (__int64)result;
        if ( result != nullptr )
        {
          v61 = *a1;
          v60 = a1[1];
          goto LABEL_88;
        }
LABEL_103:
        v68 = v78[83];
        if ( v79 > (v78[84] - v68) >> 3 )
          sub_1405C(
            "%s:%d: %s",
            "out/llvm-project/libcxxabi/src/demangle/ItaniumDemangle.h",
            2638,
            (const char *)&unk_9335);
        v69 = ptr[0];
        v70 = ptr[0] == v81;
        v78[84] = &v68[8 * v79];
        if ( !v70 )
        {
          v71 = (__int64)result;
          free(v69);
          result = (unsigned __int8 *)v71;
        }
        a1[98] = v72;
        return result;
      }
    }
    v48 = a1 + 5;
    while ( 1 )
    {
      result = (unsigned __int8 *)sub_1544C((__int64)a1, v43);
      if ( result == nullptr )
        goto LABEL_103;
      v50 = a1[3];
      if ( v50 == a1[4] )
      {
        v51 = a1[2];
        v52 = (__int64)result;
        v53 = v50 - v51;
        if ( v51 == (unsigned __int8 *)v48 )
        {
          v54 = (char *)malloc(2 * (v50 - v51));
          if ( v54 == nullptr )
            abort();
          if ( v50 != (unsigned __int8 *)v48 )
          {
            v55 = v50 - v51;
            v56 = v54;
            memmove(v54, v51, v55);
            v54 = v56;
          }
          a1[2] = (unsigned __int8 *)v54;
        }
        else
        {
          v54 = (char *)realloc(a1[2], 2 * (v50 - v51));
          a1[2] = (unsigned __int8 *)v54;
          if ( v54 == nullptr )
            abort();
        }
        v50 = (unsigned __int8 *)&v54[v53];
        v57 = (unsigned __int8 *)&v54[8 * (v53 >> 2)];
        result = (unsigned __int8 *)v52;
        a1[3] = v50;
        a1[4] = v57;
      }
      a1[3] = v50 + 8;
      *(_QWORD *)v50 = result;
      if ( a1[1] == *a1 )
      {
        v49 = 0;
      }
      else
      {
        v49 = **a1;
        if ( v49 == 69 )
          goto LABEL_84;
      }
      if ( v49 == 81 )
        goto LABEL_84;
    }
  }
  v11 = v4 + 2;
  *a1 = v4 + 2;
  if ( v3 == v4 + 2 || (unsigned int)*v11 - 58 < 0xFFFFFFF6 )
  {
    v12 = nullptr;
    v13 = 0;
    if ( v11 == v3 )
      return nullptr;
  }
  else
  {
    v20 = v4 + 2;
    v21 = v4 + 2;
    while ( (unsigned int)*v21 - 58 >= 0xFFFFFFF6 )
    {
      ++v21;
      ++v20;
      *a1 = v21;
      if ( v21 == v3 )
      {
        v20 = v3;
        break;
      }
    }
    v12 = v11;
    v13 = v20 - v11;
    v11 = v21;
    if ( v21 == v3 )
      return nullptr;
  }
  if ( *v11 != 95 )
    return nullptr;
  v22 = a1[614];
  *a1 = v11 + 1;
  v23 = *((_QWORD *)v22 + 1);
  if ( (unsigned __int64)(v23 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v24 = (unsigned __int8 *)malloc(0x1000u);
    if ( v24 == nullptr )
      goto LABEL_111;
    v23 = 0;
    *(_QWORD *)v24 = v22;
    *((_QWORD *)v24 + 1) = 0;
    v22 = v24;
    a1[614] = v24;
  }
  *((_QWORD *)v22 + 1) = v23 + 32;
  *(_QWORD *)&v22[v23 + 16] = off_378C8;
  result = &v22[v23 + 16];
  v25 = *(_WORD *)&v22[v23 + 25];
  *((_QWORD *)result + 2) = v12;
  *((_QWORD *)result + 3) = v13;
  result[8] = 51;
  *(_WORD *)(result + 9) = v25 & 0xF000 | 0x540;
  return result;
}


// Address: 0x21370 | Function: sub_21370
void __fastcall __noreturn sub_21370(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        __int64 a9,
        __int64 a10,
        __int64 a11,
        __int64 a12,
        __int64 a13,
        __int64 a14,
        __int64 a15,
        __int64 a16,
        __int64 a17,
        __int64 a18,
        char a19)
{
  __int64 v19; // x19
  char v20; // w21

  *(_BYTE *)(v19 + 778) = v20;
  ((void (__fastcall *)(char *))loc_22AB4)(&a19);
  *(_QWORD *)(v19 + 784) = a10;
  sub_2E950(a1);
}


// Address: 0x213AC | Function: sub_213AC
__int64 __fastcall sub_213AC(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 result; // x0
  __int16 v8; // w8
  __int64 v9; // x9

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 32;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_37C48;
  result = (__int64)v2 + v4 + 16;
  v8 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 75;
  v9 = *a2;
  *(_WORD *)(result + 9) = v8 & 0xF000 | 0x540;
  *(_QWORD *)(result + 16) = v9;
  return result;
}


// Address: 0x2144C | Function: sub_2144C
long double __fastcall sub_2144C(__int64 a1, _QWORD *a2, long double *a3)
{
  _QWORD *v3; // x22
  __int64 v6; // x8
  _QWORD *v8; // x0
  __int64 v9; // x0
  __int16 v10; // w8
  long double result; // q0

  v3 = *(_QWORD **)(a1 + 4912);
  v6 = v3[1];
  if ( (unsigned __int64)(v6 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v8 = malloc(0x1000u);
    if ( v8 == nullptr )
      sub_13E4C();
    v6 = 0;
    *v8 = v3;
    v8[1] = 0;
    v3 = v8;
    *(_QWORD *)(a1 + 4912) = v8;
  }
  v3[1] = v6 + 48;
  *(_QWORD *)((char *)v3 + v6 + 16) = off_37CB8;
  v9 = (__int64)v3 + v6 + 16;
  v10 = *(_WORD *)((char *)v3 + v6 + 25);
  *(_BYTE *)(v9 + 8) = 76;
  result = *a3;
  *(_QWORD *)(v9 + 16) = *a2;
  *(_WORD *)(v9 + 9) = v10 & 0xF000 | 0x540;
  *(long double *)(v9 + 24) = result;
  return result;
}


// Address: 0x214F8 | Function: sub_214F8
_QWORD *__fastcall sub_214F8(_QWORD *result, char **a2)
{
  _QWORD *v2; // x20
  char *v4; // x8
  unsigned __int64 v5; // x10
  char *v6; // x0
  char *v7; // x9
  unsigned __int64 v8; // x8
  size_t v9; // x1
  size_t v10; // x21
  size_t v11; // x8
  size_t v12; // x10
  const void *v13; // x22
  char *v14; // x0
  size_t v15; // x1
  unsigned __int64 v16; // x10
  size_t v17; // x9
  unsigned __int64 v18; // x8
  size_t v19; // x1
  _BYTE *v20; // x22
  unsigned __int64 v21; // x10
  __int64 v22; // x8
  __int64 *v23; // x23
  __int64 v24; // x9
  unsigned __int64 v25; // x8
  size_t v26; // x1
  __int64 v27; // x8
  size_t v28; // x21
  __int64 v29; // x8
  size_t v30; // x9
  char *v31; // x0
  __int64 v32; // x22
  size_t v33; // x10
  size_t v34; // x1
  char *v35; // x0
  const void *v36; // x1
  size_t v37; // x10
  char *v38; // x0
  __int64 v39; // x8
  size_t v40; // x1
  size_t v41; // x21
  char *v42; // x8
  size_t v43; // x9
  char *v44; // x0
  const void *v45; // x20
  char *v46; // x10
  size_t v47; // x1

  v2 = result;
  if ( result[3] >= 4u )
  {
    v4 = a2[1];
    v5 = (unsigned __int64)a2[2];
    v6 = *a2;
    v7 = v4 + 1;
    ++*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v4 + 1) > v5 )
    {
      v8 = (unsigned __int64)(v4 + 993);
      if ( 2 * v5 <= v8 )
        v9 = v8;
      else
        v9 = 2 * v5;
      a2[2] = (char *)v9;
      v6 = (char *)realloc(v6, v9);
      *a2 = v6;
      if ( v6 == nullptr )
        abort();
      v4 = a2[1];
      v7 = v4 + 1;
    }
    a2[1] = v7;
    v4[(_QWORD)v6] = 40;
    v10 = v2[3];
    v11 = (size_t)a2[1];
    if ( v10 != 0 )
    {
      v12 = (size_t)a2[2];
      v13 = (const void *)v2[2];
      v14 = *a2;
      if ( v11 + v10 > v12 )
      {
        if ( 2 * v12 <= v11 + v10 + 992 )
          v15 = v11 + v10 + 992;
        else
          v15 = 2 * v12;
        a2[2] = (char *)v15;
        v14 = (char *)realloc(v14, v15);
        *a2 = v14;
        if ( v14 == nullptr )
          abort();
        v11 = (size_t)a2[1];
      }
      memcpy(&v14[v11], v13, v10);
      v11 = (size_t)&a2[1][v10];
      a2[1] = (char *)v11;
    }
    v16 = (unsigned __int64)a2[2];
    v17 = v11 + 1;
    result = *a2;
    --*((_DWORD *)a2 + 8);
    if ( v11 + 1 > v16 )
    {
      v18 = v11 + 993;
      if ( 2 * v16 <= v18 )
        v19 = v18;
      else
        v19 = 2 * v16;
      a2[2] = (char *)v19;
      result = realloc(result, v19);
      *a2 = (char *)result;
      if ( result == nullptr )
        abort();
      v11 = (size_t)a2[1];
      v17 = v11 + 1;
    }
    a2[1] = (char *)v17;
    *((_BYTE *)result + v11) = 41;
  }
  v20 = (_BYTE *)v2[4];
  if ( *v20 == 110 )
  {
    v21 = (unsigned __int64)a2[2];
    result = *a2;
    v23 = (__int64 *)(a2 + 1);
    v22 = (__int64)a2[1];
    v24 = v22 + 1;
    if ( v22 + 1 > v21 )
    {
      v25 = v22 + 993;
      if ( 2 * v21 <= v25 )
        v26 = v25;
      else
        v26 = 2 * v21;
      a2[2] = (char *)v26;
      result = realloc(result, v26);
      *a2 = (char *)result;
      if ( result == nullptr )
        abort();
      v22 = *v23;
      v24 = *v23 + 1;
    }
    *v23 = v24;
    *((_BYTE *)result + v22) = 45;
    v27 = v2[5];
    v28 = v27 - 1;
    if ( v27 != 1 )
    {
      v29 = (__int64)a2[1];
      v30 = (size_t)a2[2];
      v31 = *a2;
      v32 = v2[4];
      v33 = v29 + v28;
      if ( v29 + v28 > v30 )
      {
        if ( 2 * v30 <= v33 + 992 )
          v34 = v33 + 992;
        else
          v34 = 2 * v30;
        a2[2] = (char *)v34;
        v31 = (char *)realloc(v31, v34);
        *a2 = v31;
        if ( v31 == nullptr )
          abort();
        v29 = *v23;
      }
      v35 = &v31[v29];
      v36 = (const void *)(v32 + 1);
LABEL_46:
      result = memcpy(v35, v36, v28);
      *v23 += v28;
    }
  }
  else
  {
    v28 = v2[5];
    if ( v28 != 0 )
    {
      v37 = (size_t)a2[2];
      v38 = *a2;
      v23 = (__int64 *)(a2 + 1);
      v39 = (__int64)a2[1];
      if ( v39 + v28 > v37 )
      {
        if ( 2 * v37 <= v39 + v28 + 992 )
          v40 = v39 + v28 + 992;
        else
          v40 = 2 * v37;
        a2[2] = (char *)v40;
        v38 = (char *)realloc(v38, v40);
        *a2 = v38;
        if ( v38 == nullptr )
          abort();
        v39 = *v23;
      }
      v35 = &v38[v39];
      v36 = v20;
      goto LABEL_46;
    }
  }
  v41 = v2[3];
  if ( v41 <= 3 && v41 != 0 )
  {
    v42 = a2[1];
    v43 = (size_t)a2[2];
    v44 = *a2;
    v45 = (const void *)v2[2];
    v46 = &v42[v41];
    if ( (unsigned __int64)&v42[v41] > v43 )
    {
      if ( 2 * v43 <= (unsigned __int64)(v46 + 992) )
        v47 = (size_t)(v46 + 992);
      else
        v47 = 2 * v43;
      a2[2] = (char *)v47;
      v44 = (char *)realloc(v44, v47);
      *a2 = v44;
      if ( v44 == nullptr )
        abort();
      v42 = a2[1];
    }
    result = memcpy(&v42[(_QWORD)v44], v45, v41);
    a2[1] += v41;
  }
  return result;
}


// Address: 0x217E4 | Function: sub_217E4
void sub_217E4()
{
  sub_13E30();
}


// Address: 0x217F0 | Function: sub_217F0
void *__fastcall sub_217F0(__int64 a1, char **a2)
{
  int v2; // w21
  char *v3; // x0
  size_t v5; // x20
  char *v6; // x8
  size_t v7; // x9
  char *v8; // x10
  size_t v9; // x1
  char *v10; // x0
  const char *v11; // x1
  void *result; // x0

  v2 = *(unsigned __int8 *)(a1 + 11);
  v3 = *a2;
  if ( v2 != 0 )
    v5 = 4;
  else
    v5 = 5;
  v6 = a2[1];
  v7 = (size_t)a2[2];
  v8 = &v6[v5];
  if ( (unsigned __int64)&v6[v5] > v7 )
  {
    if ( 2 * v7 <= (unsigned __int64)(v8 + 992) )
      v9 = (size_t)(v8 + 992);
    else
      v9 = 2 * v7;
    a2[2] = (char *)v9;
    v3 = (char *)realloc(v3, v9);
    *a2 = v3;
    if ( v3 == nullptr )
      abort();
    v6 = a2[1];
  }
  v10 = &v6[(_QWORD)v3];
  if ( v2 != 0 )
    v11 = "true";
  else
    v11 = "false";
  result = memcpy(v10, v11, v5);
  a2[1] += v5;
  return result;
}


// Address: 0x21898 | Function: sub_21898
void sub_21898()
{
  sub_13E30();
}


// Address: 0x218A4 | Function: sub_218A4
void *__fastcall sub_218A4(void *result, char **a2)
{
  unsigned __int8 *v2; // x11
  int v4; // w12
  int v5; // w13
  int v6; // w14
  int v7; // w16
  int v8; // w17
  int v9; // w15
  int v10; // w1
  int v11; // w12
  int v12; // w1
  int v13; // w13
  char v14; // w1
  int v15; // w12
  int v16; // w0
  char v17; // w14
  char v18; // w1
  char v19; // w16
  char v20; // w1
  int v21; // w11
  unsigned __int8 v22; // w13
  char v23; // w16
  char v24; // w15
  char v25; // w8
  char v26; // w10
  char *v27; // x8
  size_t v28; // x9
  size_t v29; // x20
  char *v30; // x0
  char *v31; // x10
  size_t v32; // x1
  char s[24]; // [xsp+8h] [xbp-18h] BYREF

  if ( *((_QWORD *)result + 3) >= 8u )
  {
    v2 = *((unsigned __int8 **)result + 2);
    v4 = v2[1];
    v5 = *v2;
    v6 = v2[7];
    v7 = v2[6];
    v8 = v2[5];
    memset(s, 0, sizeof(s));
    v9 = v2[4];
    v10 = (unsigned int)(v4 - 58) >= 0xFFFFFFF6 ? -48 : -87;
    v11 = v10 + v4;
    v12 = (unsigned int)(v5 - 58) >= 0xFFFFFFF6 ? 0 : 9;
    v13 = v12 + v5;
    v14 = (unsigned int)(v6 - 58) >= 0xFFFFFFF6 ? -48 : -87;
    v15 = v11 + 16 * v13;
    v16 = v2[3];
    v17 = v14 + v6;
    v18 = (unsigned int)(v7 - 58) >= 0xFFFFFFF6 ? 0 : 9;
    v19 = v18 + v7;
    v20 = (unsigned int)(v8 - 58) >= 0xFFFFFFF6 ? -48 : -87;
    v21 = v2[2];
    v22 = v17 + 16 * v19;
    v23 = (unsigned int)(v9 - 58) >= 0xFFFFFFF6 ? 0 : 9;
    v24 = v23 + v9;
    v25 = (unsigned int)(v16 - 58) >= 0xFFFFFFF6 ? -48 : -87;
    v26 = (unsigned int)(v21 - 58) >= 0xFFFFFFF6 ? 0 : 9;
    result = (void *)snprintf(
                       s,
                       0x18u,
                       "%af",
                       COERCE_FLOAT(
                         v22
                       | (v15 << 24)
                       | (unsigned __int16)((unsigned __int8)(v20 + v8 + 16 * v24) << 8)
                       | ((unsigned __int8)(v25 + v16 + 16 * (v26 + v21)) << 16)));
    if ( (_DWORD)result != 0 )
    {
      v27 = a2[1];
      v28 = (size_t)a2[2];
      v29 = (int)result;
      v30 = *a2;
      v31 = &v27[v29];
      if ( (unsigned __int64)&v27[v29] > v28 )
      {
        if ( 2 * v28 <= (unsigned __int64)(v31 + 992) )
          v32 = (size_t)(v31 + 992);
        else
          v32 = 2 * v28;
        a2[2] = (char *)v32;
        v30 = (char *)realloc(v30, v32);
        *a2 = v30;
        if ( v30 == nullptr )
          abort();
        v27 = a2[1];
      }
      result = memcpy(&v27[(_QWORD)v30], s, v29);
      a2[1] += v29;
    }
  }
  return result;
}


// Address: 0x21A30 | Function: sub_21A30
void sub_21A30()
{
  sub_13E30();
}


// Address: 0x21A3C | Function: sub_21A3C
void *__fastcall sub_21A3C(void *result, char **a2)
{
  unsigned __int8 *v2; // x10
  int v4; // w12
  int v5; // w13
  int v6; // w14
  int v7; // w15
  int v8; // w16
  int v9; // w17
  char v10; // w5
  int v11; // w0
  char v12; // w2
  char v13; // w12
  char v14; // w13
  char v15; // w2
  unsigned __int8 v16; // w13
  char v17; // w12
  char v18; // w14
  char v19; // w12
  char v20; // w15
  int v21; // w1
  unsigned __int8 v22; // w14
  char v23; // w12
  char v24; // w12
  int v25; // w17
  unsigned __int8 v26; // w12
  char v27; // w15
  int v28; // w16
  char v29; // w15
  char v30; // w0
  char v31; // w0
  int v32; // w2
  int v33; // w1
  unsigned __int8 v34; // w15
  int v35; // w0
  int v36; // w3
  __int64 v37; // x16
  int v38; // w0
  int v39; // w17
  int v40; // w0
  int v41; // w1
  int v42; // w2
  int v43; // w1
  int v44; // w4
  int v45; // w10
  char v46; // w5
  char v47; // w6
  int v48; // w8
  int v49; // w11
  __int128 v50; // t2
  unsigned __int64 v51; // x8
  char *v52; // x8
  size_t v53; // x9
  size_t v54; // x20
  char *v55; // x0
  char *v56; // x10
  size_t v57; // x1
  char v58[32]; // [xsp+0h] [xbp-20h] BYREF

  if ( *((_QWORD *)result + 3) >= 0x10u )
  {
    v2 = *((unsigned __int8 **)result + 2);
    v4 = v2[9];
    v5 = v2[8];
    v6 = v2[11];
    v7 = v2[10];
    v8 = v2[7];
    v9 = v2[6];
    v10 = (unsigned int)(v4 - 58) >= 0xFFFFFFF6 ? -48 : -87;
    v11 = v2[3];
    v12 = (unsigned int)(v5 - 58) >= 0xFFFFFFF6 ? 0 : 9;
    v13 = v10 + v4;
    v14 = v12 + v5;
    v15 = (unsigned int)(v6 - 58) >= 0xFFFFFFF6 ? -48 : -87;
    v16 = v13 + 16 * v14;
    v17 = (unsigned int)(v7 - 58) >= 0xFFFFFFF6 ? 0 : 9;
    v18 = v15 + v6;
    v19 = v17 + v7;
    v20 = (unsigned int)(v8 - 58) >= 0xFFFFFFF6 ? -48 : -87;
    v21 = v2[2];
    v22 = v18 + 16 * v19;
    v23 = (unsigned int)(v9 - 58) >= 0xFFFFFFF6 ? 0 : 9;
    v24 = v23 + v9;
    v25 = v2[1];
    v26 = v20 + v8 + 16 * v24;
    v27 = (unsigned int)(v11 - 58) >= 0xFFFFFFF6 ? -48 : -87;
    v28 = *v2;
    v29 = v27 + v11;
    v30 = (unsigned int)(v21 - 58) >= 0xFFFFFFF6 ? 0 : 9;
    v31 = v30 + v21;
    v32 = (unsigned int)(v25 - 58) >= 0xFFFFFFF6 ? -48 : -87;
    v33 = v2[5];
    v34 = v29 + 16 * v31;
    v35 = (unsigned int)(v28 - 58) >= 0xFFFFFFF6 ? 0 : 9;
    v36 = v2[4];
    v37 = (unsigned int)(v32 + v25 + 16 * (v35 + v28));
    v38 = (unsigned int)(v33 - 58) >= 0xFFFFFFF6 ? -48 : -87;
    v39 = v2[13];
    v40 = v38 + v33;
    v41 = (unsigned int)(v36 - 58) >= 0xFFFFFFF6 ? 0 : 9;
    v42 = v2[12];
    v43 = v41 + v36;
    v44 = v2[15];
    v45 = v2[14];
    v46 = (unsigned int)(v39 - 58) >= 0xFFFFFFF6 ? -48 : -87;
    v47 = (unsigned int)(v42 - 58) >= 0xFFFFFFF6 ? 0 : 9;
    v48 = (unsigned int)(v44 - 58) >= 0xFFFFFFF6 ? -48 : -87;
    v49 = (unsigned int)(v45 - 58) >= 0xFFFFFFF6 ? 0 : 9;
    memset(v58, 0, sizeof(v58));
    *((_QWORD *)&v50 + 1) = (unsigned int)(v40 + 16 * v43);
    *(_QWORD *)&v50 = ((unsigned __int64)v22 << 40)
                    | ((unsigned __int64)v16 << 32)
                    | (unsigned __int8)v37
                    | (unsigned __int64)(unsigned __int16)(v34 << 8)
                    | ((unsigned __int64)v26 << 24)
                    | ((unsigned __int64)(unsigned __int8)(v40 + 16 * v43) << 16);
    v51 = ((unsigned __int64)(unsigned int)(v48 + v44 + 16 * (v49 + v45)) << 56)
        | ((unsigned __int64)(unsigned __int8)(v46 + v39 + 16 * (v47 + v42)) << 48)
        | v50;
    result = (void *)snprintf(
                       v58,
                       0x20u,
                       "%a",
                       COERCE_DOUBLE(
                         (v50 >> 24) & 0xFF0000FF0000LL
                       | HIBYTE(v51)
                       | (unsigned __int64)(v37 << 56)
                       | (unsigned __int16)(HIDWORD(v51) >> 8) & 0xFF00
                       | ((unsigned __int64)v34 << 48)
                       | ((unsigned __int64)v50 >> 8) & 0xFF000000
                       | ((unsigned __int64)v26 << 32)));
    if ( (_DWORD)result != 0 )
    {
      v52 = a2[1];
      v53 = (size_t)a2[2];
      v54 = (int)result;
      v55 = *a2;
      v56 = &v52[v54];
      if ( (unsigned __int64)&v52[v54] > v53 )
      {
        if ( 2 * v53 <= (unsigned __int64)(v56 + 992) )
          v57 = (size_t)(v56 + 992);
        else
          v57 = 2 * v53;
        a2[2] = (char *)v57;
        v55 = (char *)realloc(v55, v57);
        *a2 = v55;
        if ( v55 == nullptr )
          abort();
        v52 = a2[1];
      }
      result = memcpy(&v52[(_QWORD)v55], v58, v54);
      a2[1] += v54;
    }
  }
  return result;
}


// Address: 0x21CD0 | Function: sub_21CD0
void sub_21CD0()
{
  sub_13E30();
}


// Address: 0x21CDC | Function: sub_21CDC
void *__fastcall sub_21CDC(void *result, char **a2)
{
  const char *v2; // x9
  unsigned __int8 *v4; // x9
  __int64 v5; // x10
  long double *v6; // x8
  int v7; // w14
  char v8; // w15
  int v9; // t1
  unsigned int v10; // w16
  char v11; // w17
  char v12; // w16
  unsigned __int8 v13; // w14
  uint32x4_t v14; // q2
  uint32x4_t v15; // q7
  uint16x8_t v16; // q3
  uint16x8_t v17; // q4
  uint16x8_t v18; // q5
  uint16x8_t v19; // q6
  uint32x4_t v20; // q16
  uint32x4_t v21; // q17
  int8x16_t v22; // q4
  uint32x4_t v23; // q3
  uint32x4_t v24; // q18
  uint32x4_t v25; // q19
  int8x16_t v26; // q6
  uint32x4_t v27; // q2
  int8x16_t v28; // q5
  int8x16_t v29; // q3
  int8x16_t v30; // q2
  char v31; // w9
  char v32; // w10
  char v33; // w9
  char v34; // w10
  char v35; // w9
  char v36; // w10
  char v37; // w9
  char v38; // w10
  char v39; // w9
  char v40; // w10
  char v41; // w9
  char v42; // w10
  char v43; // w9
  char v44; // w10
  char v45; // w9
  char *v46; // x8
  size_t v47; // x9
  size_t v48; // x20
  char *v49; // x0
  char *v50; // x10
  size_t v51; // x1
  _BYTE v52[42]; // [xsp+0h] [xbp-40h] BYREF
  char v53; // [xsp+2Fh] [xbp-11h] BYREF
  long double v54; // [xsp+30h] [xbp-10h] BYREF
  __int64 vars0; // [xsp+40h] [xbp+0h] BYREF
  int8x16x2_t v56; // 0:q0.16,16:q1.16

  if ( *((_QWORD *)result + 3) >= 0x20u )
  {
    v2 = *((const char **)result + 2);
    if ( &v54 >= (long double *)v2 + 2 || v2 >= (const char *)&vars0 )
    {
      v56 = vld2q_s8(v2);
      v14.n128_u64[0] = 0x3900000039LL;
      v14.n128_u64[1] = 0x3900000039LL;
      v15.n128_u64[0] = 0x900000009LL;
      v15.n128_u64[1] = 0x900000009LL;
      v6 = (long double *)((unsigned __int64)&v54 | 0xF);
      v16 = vmovl_high_u8(v56.val[0]);
      v17 = vmovl_u8((uint8x8_t)v56.val[0].n128_u64[0]);
      v18 = vmovl_high_u8(v56.val[1]);
      v19 = vmovl_u8((uint8x8_t)v56.val[1].n128_u64[0]);
      v20 = vaddw_high_u16(v14, v16);
      v21 = vaddw_u16(v14, (uint16x4_t)v17.n128_u64[0]);
      v22 = vaddw_high_u16(v14, v17);
      v23 = vaddw_u16(v14, (uint16x4_t)v16.n128_u64[0]);
      v24 = vaddw_u16(v14, (uint16x4_t)v19.n128_u64[0]);
      v25 = vaddw_high_u16(v14, v18);
      v26 = vaddw_high_u16(v14, v19);
      v27 = vaddw_u16(v14, (uint16x4_t)v18.n128_u64[0]);
      v28 = vuzp1q_s16(vcgtq_u32(v15, v24), vcgtq_u32(v15, v26));
      v26.n128_u64[0] = 0xA9A9A9A9A9A9A9A9LL;
      v26.n128_u64[1] = 0xA9A9A9A9A9A9A9A9LL;
      v29 = vuzp1q_s8(
              vuzp1q_s16(vcgtq_u32(v15, v21), vcgtq_u32(v15, v22)),
              vuzp1q_s16(vcgtq_u32(v15, v23), vcgtq_u32(v15, v20)));
      v22.n128_u64[0] = 0x909090909090909LL;
      v22.n128_u64[1] = 0x909090909090909LL;
      v30 = vuzp1q_s8(v28, vuzp1q_s16(vcgtq_u32(v15, v27), vcgtq_u32(v15, v25)));
      v28.n128_u64[0] = 0xD0D0D0D0D0D0D0D0LL;
      v28.n128_u64[1] = 0xD0D0D0D0D0D0D0D0LL;
      v56.val[0] = vaddq_s8(
                     vaddq_s8(vbslq_s8(v30, v26, v28), v56.val[1]),
                     vshlq_n_s8(vaddq_s8(vandq_s8(v29, v22), v56.val[0]), 4u));
      v13 = v56.val[0].n128_u8[15];
      v54 = *(long double *)v56.val;
    }
    else
    {
      v4 = (unsigned __int8 *)(v2 + 1);
      v5 = 32;
      v6 = (long double *)&v53;
      do
      {
        v7 = *(v4 - 1);
        v9 = *v4;
        v4 += 2;
        v8 = v9;
        v10 = v9 - 58;
        if ( (unsigned int)(v7 - 58) >= 0xFFFFFFF6 )
          v11 = 0;
        else
          v11 = 9;
        if ( v10 >= 0xFFFFFFF6 )
          v12 = -48;
        else
          v12 = -87;
        v5 -= 2;
        v13 = v12 + v8 + 16 * (v11 + v7);
        *((_BYTE *)v6 + 1) = v13;
        v6 = (long double *)((char *)v6 + 1);
      }
      while ( v5 != 0 );
    }
    if ( &v54 < v6 )
    {
      v31 = LOBYTE(v54);
      LOBYTE(v54) = v13;
      v32 = *((_BYTE *)v6 - 1);
      *(_BYTE *)v6 = v31;
      v33 = BYTE1(v54);
      BYTE1(v54) = v32;
      v34 = *((_BYTE *)v6 - 2);
      *((_BYTE *)v6 - 1) = v33;
      v35 = BYTE2(v54);
      BYTE2(v54) = v34;
      v36 = *((_BYTE *)v6 - 3);
      *((_BYTE *)v6 - 2) = v35;
      v37 = BYTE3(v54);
      BYTE3(v54) = v36;
      v38 = *((_BYTE *)v6 - 4);
      *((_BYTE *)v6 - 3) = v37;
      v39 = BYTE4(v54);
      BYTE4(v54) = v38;
      v40 = *((_BYTE *)v6 - 5);
      *((_BYTE *)v6 - 4) = v39;
      v41 = BYTE5(v54);
      BYTE5(v54) = v40;
      v42 = *((_BYTE *)v6 - 6);
      *((_BYTE *)v6 - 5) = v41;
      v43 = BYTE6(v54);
      BYTE6(v54) = v42;
      v44 = *((_BYTE *)v6 - 7);
      *((_BYTE *)v6 - 6) = v43;
      v45 = BYTE7(v54);
      BYTE7(v54) = v44;
      *((_BYTE *)v6 - 7) = v45;
    }
    memset(v52, 0, sizeof(v52));
    result = (void *)snprintf(v52, 0x2Au, "%LaL", v54);
    if ( (_DWORD)result != 0 )
    {
      v46 = a2[1];
      v47 = (size_t)a2[2];
      v48 = (int)result;
      v49 = *a2;
      v50 = &v46[v48];
      if ( (unsigned __int64)&v46[v48] > v47 )
      {
        if ( 2 * v47 <= (unsigned __int64)(v50 + 992) )
          v51 = (size_t)(v50 + 992);
        else
          v51 = 2 * v47;
        a2[2] = (char *)v51;
        v49 = (char *)realloc(v49, v51);
        *a2 = v49;
        if ( v49 == nullptr )
          abort();
        v46 = a2[1];
      }
      result = memcpy(&v46[(_QWORD)v49], v52, v48);
      a2[1] += v48;
    }
  }
  return result;
}


// Address: 0x21F38 | Function: sub_21F38
void sub_21F38()
{
  sub_13E30();
}


// Address: 0x21F44 | Function: sub_21F44
char *__fastcall sub_21F44(__int64 a1, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  void *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  __int64 *v12; // x20
  __int64 v13; // x9
  char *v14; // x8
  unsigned __int64 v15; // x9
  char *result; // x0
  unsigned __int64 v17; // x9
  size_t v18; // x8
  size_t v19; // x1

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  if ( (unsigned __int64)(v2 + 2) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 994);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (void *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = v11;
  }
  *(_WORD *)&v2[(_QWORD)v5] = 15394;
  v12 = *(__int64 **)(a1 + 16);
  v13 = *v12;
  a2[1] = (char *)a2[1] + 2;
  (*(void (__fastcall **)(__int64 *, void **))(v13 + 32))(v12, a2);
  if ( (*(_WORD *)((_BYTE *)v12 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64 *, void **))(*v12 + 40))(v12, a2);
  v14 = (char *)a2[1];
  v15 = (unsigned __int64)a2[2];
  result = (char *)*a2;
  if ( (unsigned __int64)(v14 + 2) > v15 )
  {
    v17 = 2 * v15;
    v18 = (size_t)(v14 + 994);
    if ( v17 <= v18 )
      v19 = v18;
    else
      v19 = v17;
    a2[2] = (void *)v19;
    result = (char *)realloc(result, v19);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v14 = (char *)a2[1];
  }
  *(_WORD *)&v14[(_QWORD)result] = 8766;
  a2[1] = (char *)a2[1] + 2;
  return result;
}


// Address: 0x22050 | Function: sub_22050
void sub_22050()
{
  sub_13E30();
}


// Address: 0x2205C | Function: sub_2205C
__int64 __fastcall sub_2205C(__int64 a1, _QWORD *a2, __int64 a3)
{
  unsigned __int8 *v3; // x8
  __int64 result; // x0
  int v6; // w20
  _QWORD *v7; // x21
  __int64 v8; // x8
  _QWORD *v9; // x22
  _QWORD *v10; // x0
  __int64 v11; // x23
  __int16 v12; // w8
  __int64 *v13; // x22
  _QWORD *v14; // x24
  __int64 *v15; // x21
  signed __int64 v16; // x20
  char *v17; // x0
  _QWORD *v18; // x25
  int v19; // w21
  _QWORD *v20; // x22
  __int64 v21; // x20
  __int64 v22; // x9
  _QWORD *v23; // x0
  __int64 v24; // x24
  __int16 v25; // w9
  _QWORD *v26; // x8
  __int64 *v27; // x23
  _QWORD *v28; // x22
  signed __int64 v29; // x21
  char *v30; // x0
  int v31; // w20
  _QWORD *v32; // x21
  __int64 v33; // x8
  _QWORD *v34; // x22
  _QWORD *v35; // x0
  __int64 v36; // x23
  __int16 v37; // w8
  __int64 *v38; // x22
  _QWORD *v39; // x24
  void *v40; // x21
  __int64 *v41; // x25
  signed __int64 v42; // x20
  char *v43; // x0
  int v44; // w20
  _QWORD *v45; // x21
  __int64 v46; // x8
  _QWORD *v47; // x22
  _QWORD *v48; // x0
  __int64 v49; // x25
  __int16 v50; // w8
  __int64 *v51; // x22
  _QWORD *v52; // x23
  void *v53; // x21
  __int64 *v54; // x24
  signed __int64 v55; // x20
  char *v56; // x0
  char *v57; // x22
  _QWORD *v58; // x20
  __int64 v59; // x8
  _QWORD *v60; // x0
  __int16 v61; // w8
  char v62; // w9
  char *v63; // x23
  _QWORD *v64; // x21
  __int64 v65; // x8
  _QWORD *v66; // x0
  char *v67; // x22
  _QWORD *v68; // x21
  __int64 v69; // x20
  __int64 v70; // x8
  _QWORD *v71; // x0
  char *v72; // x22
  char *v73; // x22
  char *v74; // x21
  char *v75; // x9
  __int64 v76; // x20
  __int64 v77; // x24
  __int64 v78; // x27
  char *v79; // x0
  size_t v80; // x2
  char *v81; // x22
  __int64 v82; // x8
  __int64 *v83; // x27
  unsigned __int64 v84; // x20
  unsigned __int8 *v85; // x8
  unsigned __int8 *v86; // x9
  size_t v87; // x1
  __int64 *v88; // x24
  __int64 *v89; // x23
  __int64 v90; // x28
  __int64 v91; // x22
  char *v92; // x0
  size_t v93; // x2
  char *v94; // x24
  char *v95; // x8
  char v96; // w22
  __int64 v97; // x21
  char *v98; // x0
  _QWORD *v99; // x23
  char *v100; // x22
  __int64 v101; // x1
  __int64 v102; // x20
  __int64 v103; // x8
  _QWORD *v104; // x0
  __int16 v105; // w8
  __int64 v106; // x11
  void *v107; // x8
  bool v108; // zf
  __int64 v109; // x19
  __int64 v110; // [xsp+8h] [xbp-68h] BYREF
  unsigned __int64 v111; // [xsp+10h] [xbp-60h]
  void *ptr[3]; // [xsp+18h] [xbp-58h] BYREF
  _QWORD v113[8]; // [xsp+30h] [xbp-40h] BYREF
  __int64 vars0; // [xsp+70h] [xbp+0h] BYREF

  v3 = *(unsigned __int8 **)a1;
  if ( *(_QWORD *)(a1 + 8) - *(_QWORD *)a1 < 2u )
    return 0;
  switch ( *(_WORD *)v3 )
  {
    case 0x7954:
      v6 = *(_DWORD *)(a1 + 792);
      v7 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v3 + 2;
      *(_DWORD *)(a1 + 792) = v6 + 1;
      v8 = v7[1];
      if ( (unsigned __int64)(v8 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v9 = a2;
        v10 = malloc(0x1000u);
        if ( v10 == nullptr )
          goto LABEL_118;
        v8 = 0;
        *v10 = v7;
        v10[1] = 0;
        v7 = v10;
        a2 = v9;
        *(_QWORD *)(a1 + 4912) = v10;
      }
      v7[1] = v8 + 32;
      *(_QWORD *)((char *)v7 + v8 + 16) = off_37938;
      v11 = (__int64)v7 + v8 + 16;
      v12 = *(_WORD *)((char *)v7 + v8 + 25);
      *(_DWORD *)(v11 + 12) = 0;
      *(_DWORD *)(v11 + 16) = v6;
      *(_BYTE *)(v11 + 8) = 33;
      *(_WORD *)(v11 + 9) = v12 & 0xF000 | 0x540;
      if ( a2 != nullptr )
      {
        v13 = (__int64 *)a2[1];
        if ( v13 == (__int64 *)a2[2] )
        {
          v14 = a2;
          v15 = (__int64 *)*a2;
          v16 = (signed __int64)v13 - *a2;
          if ( (_QWORD *)*a2 == a2 + 3 )
          {
            v17 = (char *)malloc(2 * v16);
            if ( v17 == nullptr )
              abort();
            if ( v13 != v15 )
            {
              v57 = v17;
              memmove(v17, v15, v16);
              v17 = v57;
            }
            a2 = v14;
            *v14 = v17;
          }
          else
          {
            v17 = (char *)realloc(v15, 2 * v16);
            a2 = v14;
            *v14 = v17;
            if ( v17 == nullptr )
              abort();
          }
          v13 = (__int64 *)&v17[v16];
          a2[1] = &v17[v16];
          a2[2] = &v17[8 * (v16 >> 2)];
        }
        a2[1] = v13 + 1;
        *v13 = v11;
      }
      v58 = *(_QWORD **)(a1 + 4912);
      v59 = v58[1];
      if ( (unsigned __int64)(v59 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v60 = malloc(0x1000u);
        if ( v60 == nullptr )
          goto LABEL_118;
        v59 = 0;
        *v60 = v58;
        v60[1] = 0;
        v58 = v60;
        *(_QWORD *)(a1 + 4912) = v60;
      }
      v58[1] = v59 + 32;
      *(_QWORD *)((char *)v58 + v59 + 16) = off_379A8;
      result = (__int64)v58 + v59 + 16;
      v61 = *(_WORD *)((char *)v58 + v59 + 25);
      v62 = 35;
      *(_QWORD *)(result + 16) = v11;
      goto LABEL_74;
    case 0x6B54:
      v18 = a2;
      *(_QWORD *)a1 = v3 + 2;
      result = sub_16998((unsigned __int8 **)a1, 0, a3);
      if ( result == 0 )
        return result;
      v19 = *(_DWORD *)(a1 + 792);
      v20 = *(_QWORD **)(a1 + 4912);
      v21 = result;
      *(_DWORD *)(a1 + 792) = v19 + 1;
      v22 = v20[1];
      if ( (unsigned __int64)(v22 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v23 = malloc(0x1000u);
        if ( v23 == nullptr )
          goto LABEL_118;
        v22 = 0;
        *v23 = v20;
        v23[1] = 0;
        v20 = v23;
        *(_QWORD *)(a1 + 4912) = v23;
      }
      v20[1] = v22 + 32;
      *(_QWORD *)((char *)v20 + v22 + 16) = off_37938;
      v24 = (__int64)v20 + v22 + 16;
      v25 = *(_WORD *)((char *)v20 + v22 + 25);
      v26 = v18;
      *(_DWORD *)(v24 + 12) = 0;
      *(_DWORD *)(v24 + 16) = v19;
      *(_BYTE *)(v24 + 8) = 33;
      *(_WORD *)(v24 + 9) = v25 & 0xF000 | 0x540;
      if ( v18 != nullptr )
      {
        v27 = (__int64 *)v18[1];
        if ( v27 == (__int64 *)v18[2] )
        {
          v28 = (_QWORD *)*v18;
          v29 = (signed __int64)v27 - *v18;
          if ( (_QWORD *)*v18 == v18 + 3 )
          {
            v30 = (char *)malloc(2 * v29);
            if ( v30 == nullptr )
              abort();
            if ( v27 != v18 + 3 )
            {
              v63 = v30;
              memmove(v30, v28, v29);
              v30 = v63;
            }
            v26 = v18;
            *v18 = v30;
          }
          else
          {
            v30 = (char *)realloc((void *)*v18, 2 * v29);
            v26 = v18;
            *v18 = v30;
            if ( v30 == nullptr )
              abort();
          }
          v27 = (__int64 *)&v30[v29];
          v26[1] = &v30[v29];
          v26[2] = &v30[8 * (v29 >> 2)];
        }
        v26[1] = v27 + 1;
        *v27 = v24;
      }
      v64 = *(_QWORD **)(a1 + 4912);
      v65 = v64[1];
      if ( (unsigned __int64)(v65 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v66 = malloc(0x1000u);
        if ( v66 == nullptr )
          goto LABEL_118;
        v65 = 0;
        *v66 = v64;
        v66[1] = 0;
        v64 = v66;
        *(_QWORD *)(a1 + 4912) = v66;
      }
      v64[1] = v65 + 32;
      *(_QWORD *)((char *)v64 + v65 + 16) = off_37A18;
      result = (__int64)v64 + v65 + 16;
      v61 = *(_WORD *)((char *)v64 + v65 + 25);
      v62 = 36;
      *(_QWORD *)(result + 16) = v21;
      *(_QWORD *)(result + 24) = v24;
      goto LABEL_74;
    case 0x6E54:
      v31 = *(_DWORD *)(a1 + 796);
      v32 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v3 + 2;
      *(_DWORD *)(a1 + 796) = v31 + 1;
      v33 = v32[1];
      if ( (unsigned __int64)(v33 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v34 = a2;
        v35 = malloc(0x1000u);
        if ( v35 == nullptr )
          goto LABEL_118;
        v33 = 0;
        *v35 = v32;
        v35[1] = 0;
        v32 = v35;
        a2 = v34;
        *(_QWORD *)(a1 + 4912) = v35;
      }
      v32[1] = v33 + 32;
      *(_QWORD *)((char *)v32 + v33 + 16) = off_37938;
      v36 = (__int64)v32 + v33 + 16;
      v37 = *(_WORD *)((char *)v32 + v33 + 25);
      *(_BYTE *)(v36 + 8) = 33;
      *(_DWORD *)(v36 + 12) = 1;
      *(_DWORD *)(v36 + 16) = v31;
      *(_WORD *)(v36 + 9) = v37 & 0xF000 | 0x540;
      if ( a2 != nullptr )
      {
        v38 = (__int64 *)a2[1];
        if ( v38 == (__int64 *)a2[2] )
        {
          v39 = a2;
          v41 = a2 + 3;
          v40 = (void *)*a2;
          v42 = (signed __int64)v38 - *a2;
          if ( (_QWORD *)*a2 == a2 + 3 )
          {
            v43 = (char *)malloc(2 * v42);
            if ( v43 == nullptr )
              abort();
            if ( v38 != v41 )
            {
              v67 = v43;
              memmove(v43, v40, v42);
              v43 = v67;
            }
            a2 = v39;
            *v39 = v43;
          }
          else
          {
            v43 = (char *)realloc(v40, 2 * v42);
            a2 = v39;
            *v39 = v43;
            if ( v43 == nullptr )
              abort();
          }
          v38 = (__int64 *)&v43[v42];
          a2[1] = &v43[v42];
          a2[2] = &v43[8 * (v42 >> 2)];
        }
        a2[1] = v38 + 1;
        *v38 = v36;
      }
      result = sub_1544C(a1, (size_t)a2);
      if ( result == 0 )
        return result;
      v68 = *(_QWORD **)(a1 + 4912);
      v69 = result;
      v70 = v68[1];
      if ( (unsigned __int64)(v70 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v71 = malloc(0x1000u);
        if ( v71 == nullptr )
          goto LABEL_118;
        v70 = 0;
        *v71 = v68;
        v71[1] = 0;
        v68 = v71;
        *(_QWORD *)(a1 + 4912) = v71;
      }
      v68[1] = v70 + 32;
      *(_QWORD *)((char *)v68 + v70 + 16) = off_37A88;
      result = (__int64)v68 + v70 + 16;
      v61 = *(_WORD *)((char *)v68 + v70 + 25);
      v62 = 37;
      *(_QWORD *)(result + 16) = v36;
      *(_QWORD *)(result + 24) = v69;
LABEL_74:
      *(_BYTE *)(result + 8) = v62;
      *(_WORD *)(result + 9) = v61 & 0xF000 | 0x500;
      return result;
    case 0x7454:
      v44 = *(_DWORD *)(a1 + 800);
      v45 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v3 + 2;
      *(_DWORD *)(a1 + 800) = v44 + 1;
      v46 = v45[1];
      if ( (unsigned __int64)(v46 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v47 = a2;
        v48 = malloc(0x1000u);
        if ( v48 == nullptr )
          goto LABEL_118;
        v46 = 0;
        *v48 = v45;
        v48[1] = 0;
        v45 = v48;
        a2 = v47;
        *(_QWORD *)(a1 + 4912) = v48;
      }
      v45[1] = v46 + 32;
      *(_QWORD *)((char *)v45 + v46 + 16) = off_37938;
      v49 = (__int64)v45 + v46 + 16;
      v50 = *(_WORD *)((char *)v45 + v46 + 25);
      *(_BYTE *)(v49 + 8) = 33;
      *(_DWORD *)(v49 + 12) = 2;
      *(_DWORD *)(v49 + 16) = v44;
      *(_WORD *)(v49 + 9) = v50 & 0xF000 | 0x540;
      if ( a2 != nullptr )
      {
        v51 = (__int64 *)a2[1];
        if ( v51 == (__int64 *)a2[2] )
        {
          v52 = a2;
          v54 = a2 + 3;
          v53 = (void *)*a2;
          v55 = (signed __int64)v51 - *a2;
          if ( (_QWORD *)*a2 == a2 + 3 )
          {
            v56 = (char *)malloc(2 * v55);
            if ( v56 == nullptr )
              abort();
            if ( v51 != v54 )
            {
              v72 = v56;
              memmove(v56, v53, v55);
              v56 = v72;
            }
            a2 = v52;
            *v52 = v56;
          }
          else
          {
            v56 = (char *)realloc(v53, 2 * v55);
            a2 = v52;
            *v52 = v56;
            if ( v56 == nullptr )
              abort();
          }
          v51 = (__int64 *)&v56[v55];
          a2[1] = &v56[v55];
          a2[2] = &v56[8 * (v55 >> 2)];
        }
        a2[1] = v51 + 1;
        *v51 = v49;
      }
      v73 = *(char **)(a1 + 672);
      v74 = *(char **)(a1 + 664);
      v75 = *(char **)(a1 + 680);
      v76 = v73 - v74;
      v78 = *(_QWORD *)(a1 + 16);
      v77 = *(_QWORD *)(a1 + 24);
      ptr[2] = &vars0;
      ptr[0] = v113;
      ptr[1] = v113;
      memset(v113, 0, sizeof(v113));
      v110 = a1;
      v111 = (v73 - v74) >> 3;
      if ( v73 == v75 )
      {
        if ( v74 == (char *)(a1 + 688) )
        {
          v79 = (char *)malloc(2 * v76);
          if ( v79 == nullptr )
            abort();
          if ( v73 != v74 )
          {
            v80 = v73 - v74;
            v81 = v79;
            memmove(v79, v74, v80);
            v79 = v81;
          }
          *(_QWORD *)(a1 + 664) = v79;
        }
        else
        {
          v79 = (char *)realloc(v74, 2 * v76);
          *(_QWORD *)(a1 + 664) = v79;
          if ( v79 == nullptr )
            abort();
        }
        v73 = &v79[v76];
        *(_QWORD *)(a1 + 672) = &v79[v76];
        *(_QWORD *)(a1 + 680) = &v79[8 * (v76 >> 2)];
      }
      *(_QWORD *)(a1 + 672) = v73 + 8;
      v82 = v77 - v78;
      v83 = (__int64 *)(a1 + 40);
      *(_QWORD *)v73 = ptr;
      v84 = v82 >> 3;
      v85 = *(unsigned __int8 **)a1;
      v86 = *(unsigned __int8 **)(a1 + 8);
      do
      {
        if ( v85 != v86 && *v85 == 69 )
        {
          v97 = 0;
          goto LABEL_111;
        }
        result = sub_2205C(a1, ptr);
        if ( result == 0 )
          goto LABEL_115;
        v88 = *(__int64 **)(a1 + 24);
        if ( v88 == *(__int64 **)(a1 + 32) )
        {
          v89 = *(__int64 **)(a1 + 16);
          v90 = result;
          v91 = (char *)v88 - (char *)v89;
          if ( v89 == v83 )
          {
            v92 = (char *)malloc(2 * ((char *)v88 - (char *)v89));
            if ( v92 == nullptr )
              abort();
            if ( v88 != v83 )
            {
              v93 = (char *)v88 - (char *)v89;
              v94 = v92;
              memmove(v92, v89, v93);
              v92 = v94;
            }
            *(_QWORD *)(a1 + 16) = v92;
          }
          else
          {
            v92 = (char *)realloc(*(void **)(a1 + 16), 2 * ((char *)v88 - (char *)v89));
            *(_QWORD *)(a1 + 16) = v92;
            if ( v92 == nullptr )
              abort();
          }
          v88 = (__int64 *)&v92[v91];
          v95 = &v92[8 * (v91 >> 2)];
          result = v90;
          *(_QWORD *)(a1 + 24) = v88;
          *(_QWORD *)(a1 + 32) = v95;
        }
        *(_QWORD *)(a1 + 24) = v88 + 1;
        *v88 = result;
        v85 = *(unsigned __int8 **)a1;
        v86 = *(unsigned __int8 **)(a1 + 8);
      }
      while ( *(unsigned __int8 **)a1 == v86 || *v85 != 81 );
      v96 = *(_BYTE *)(a1 + 778);
      *(_QWORD *)a1 = v85 + 1;
      *(_BYTE *)(a1 + 778) = 1;
      v97 = sub_1A440(a1, v87);
      *(_BYTE *)(a1 + 778) = v96;
      if ( v97 == 0 || (v85 = *(unsigned __int8 **)a1, *(_QWORD *)a1 == *(_QWORD *)(a1 + 8)) || *v85 != 69 )
      {
        result = 0;
        goto LABEL_115;
      }
LABEL_111:
      *(_QWORD *)a1 = v85 + 1;
      v98 = sub_17574((_QWORD *)a1, v84);
      v99 = *(_QWORD **)(a1 + 4912);
      v100 = v98;
      v102 = v101;
      v103 = v99[1];
      if ( (unsigned __int64)(v103 - 4032) > 0xFFFFFFFFFFFFF00FLL )
        goto LABEL_114;
      v104 = malloc(0x1000u);
      if ( v104 != nullptr )
      {
        v103 = 0;
        *v104 = v99;
        v104[1] = 0;
        v99 = v104;
        *(_QWORD *)(a1 + 4912) = v104;
LABEL_114:
        v99[1] = v103 + 48;
        *(_QWORD *)((char *)v99 + v103 + 16) = off_37AF8;
        result = (__int64)v99 + v103 + 16;
        v105 = *(_WORD *)((char *)v99 + v103 + 25);
        *(_BYTE *)(result + 8) = 38;
        *(_QWORD *)(result + 16) = v49;
        *(_QWORD *)(result + 24) = v100;
        *(_QWORD *)(result + 32) = v102;
        *(_QWORD *)(result + 40) = v97;
        *(_WORD *)(result + 9) = v105 & 0xF000 | 0x500;
LABEL_115:
        v106 = *(_QWORD *)(v110 + 664);
        if ( v111 > (*(_QWORD *)(v110 + 672) - v106) >> 3 )
          sub_1405C(
            "%s:%d: %s",
            "out/llvm-project/libcxxabi/src/demangle/ItaniumDemangle.h",
            2638,
            (const char *)&unk_9335);
        v107 = ptr[0];
        v108 = ptr[0] == v113;
        *(_QWORD *)(v110 + 672) = v106 + 8 * v111;
        if ( !v108 )
        {
          v109 = result;
          free(v107);
          return v109;
        }
        return result;
      }
LABEL_118:
      sub_13E4C();
    default:
      break;
  }
  if ( *(_WORD *)v3 != 28756 )
    return 0;
  *(_QWORD *)a1 = v3 + 2;
  result = sub_2205C(a1, a2);
  v110 = result;
  if ( result != 0 )
    return sub_22C84(a1, &v110);
  return result;
}


// Address: 0x229AC | Function: sub_229AC
void __fastcall __noreturn sub_229AC(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        __int64 a9,
        char a10)
{
  __int64 v10; // x19
  char v11; // w22

  *(_BYTE *)(v10 + 778) = v11;
  ((void (__fastcall *)(char *))loc_22AB4)(&a10);
  sub_2E950(a1);
}


// Address: 0x229D4 | Function: sub_229D4
long double __fastcall sub_229D4(__int64 a1, long double *a2, __int64 *a3, __int128 *a4, __int64 *a5, __int128 *a6)
{
  _QWORD *v6; // x25
  __int64 v12; // x8
  _QWORD *v14; // x0
  __int64 v15; // x9
  __int64 v16; // x0
  __int64 v17; // x10
  long double result; // q0
  __int128 v19; // q1
  __int16 v20; // w8
  __int128 v21; // q2

  v6 = *(_QWORD **)(a1 + 4912);
  v12 = v6[1];
  if ( (unsigned __int64)(v12 - 4000) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v14 = malloc(0x1000u);
    if ( v14 == nullptr )
      sub_13E4C();
    v12 = 0;
    *v14 = v6;
    v14[1] = 0;
    v6 = v14;
    *(_QWORD *)(a1 + 4912) = v14;
  }
  v6[1] = v12 + 80;
  v15 = *a3;
  *(_QWORD *)((char *)v6 + v12 + 16) = off_37BD8;
  v16 = (__int64)v6 + v12 + 16;
  *(_BYTE *)(v16 + 8) = 52;
  v17 = *a5;
  result = *a2;
  v19 = *a4;
  v20 = *(_WORD *)((_BYTE *)v6 + v12 + 25) & 0xF000;
  v21 = *a6;
  *(_QWORD *)(v16 + 32) = v15;
  *(long double *)(v16 + 16) = result;
  *(_WORD *)(v16 + 9) = v20 | 0x540;
  *(_OWORD *)(v16 + 40) = v19;
  *(_QWORD *)(v16 + 56) = v17;
  *(_OWORD *)(v16 + 64) = v21;
  return result;
}


// Address: 0x22B2C | Function: sub_22B2C
// attributes: thunk
__int64 sub_22B2C()
{
  sub_13E14();
  return sub_22B30();
}


// Address: 0x22B30 | Function: sub_22B30
void *__fastcall sub_22B30(__int64 a1, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  void *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  __int64 v12; // x8
  size_t v13; // x20
  size_t v14; // x10
  const void *v15; // x21
  char *v16; // x0
  size_t v17; // x1
  unsigned __int64 v18; // x9
  void *result; // x0
  unsigned __int64 v20; // x9
  size_t v21; // x8
  size_t v22; // x1

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  if ( (unsigned __int64)(v2 + 8) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 1000);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (void *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = v11;
  }
  *(_QWORD *)&v2[(_QWORD)v5] = 0x64656D616E6E7527LL;
  v12 = (__int64)a2[1] + 8;
  a2[1] = (void *)v12;
  v13 = *(_QWORD *)(a1 + 24);
  if ( v13 != 0 )
  {
    v14 = (size_t)a2[2];
    v15 = *(const void **)(a1 + 16);
    v16 = (char *)*a2;
    if ( v12 + v13 > v14 )
    {
      if ( 2 * v14 <= v12 + v13 + 992 )
        v17 = v12 + v13 + 992;
      else
        v17 = 2 * v14;
      a2[2] = (void *)v17;
      v16 = (char *)realloc(v16, v17);
      *a2 = v16;
      if ( v16 == nullptr )
        abort();
      v12 = (__int64)a2[1];
    }
    memcpy(&v16[v12], v15, v13);
    v12 = (__int64)a2[1] + v13;
    a2[1] = (void *)v12;
  }
  v18 = (unsigned __int64)a2[2];
  result = *a2;
  if ( v12 + 1 > v18 )
  {
    v20 = 2 * v18;
    v21 = v12 + 993;
    if ( v20 <= v21 )
      v22 = v21;
    else
      v22 = v20;
    a2[2] = (void *)v22;
    result = realloc(result, v22);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v12 = (__int64)a2[1];
  }
  *((_BYTE *)result + v12) = 39;
  a2[1] = (char *)a2[1] + 1;
  return result;
}


// Address: 0x22C78 | Function: sub_22C78
void sub_22C78()
{
  sub_13E30();
}


// Address: 0x22C84 | Function: sub_22C84
__int64 __fastcall sub_22C84(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 result; // x0
  __int16 v8; // w8
  __int64 v9; // x9

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 32;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_37B68;
  result = (__int64)v2 + v4 + 16;
  v8 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 39;
  v9 = *a2;
  *(_WORD *)(result + 9) = v8 & 0xF000 | 0x500;
  *(_QWORD *)(result + 16) = v9;
  return result;
}


// Address: 0x22D24 | Function: sub_22D24
_DWORD *__fastcall sub_22D24(_DWORD *result, char **a2)
{
  int v2; // w8
  unsigned __int64 v4; // x10
  char *v5; // x8
  __int64 v6; // x9
  __int64 *v7; // x20
  unsigned __int64 v8; // x10
  size_t v9; // x9
  _DWORD *v10; // x21
  char *v11; // x0
  size_t v12; // x1
  char *v13; // x0
  __int16 v14; // w10
  unsigned __int64 v15; // x10
  unsigned __int64 v16; // x10
  size_t v17; // x9
  _DWORD *v18; // x21
  char *v19; // x0
  size_t v20; // x1
  char *v21; // x0
  __int64 v22; // x8
  unsigned __int64 v23; // x10
  char *v24; // x8
  __int64 v25; // x9
  unsigned __int64 v26; // x10
  size_t v27; // x9
  _DWORD *v28; // x21
  char *v29; // x0
  size_t v30; // x1
  char *v31; // x0
  char *v32; // x8
  int v33; // w8
  unsigned __int64 v34; // x9
  __int64 v35; // x20
  _BYTE *v36; // x14
  bool v37; // cc
  int v38; // w13
  char *v39; // x8
  unsigned __int64 v40; // x9
  char *v41; // x0
  char *v42; // x10
  size_t v43; // x1
  _BYTE v44[21]; // [xsp+Bh] [xbp-15h] BYREF

  v2 = result[3];
  if ( v2 == 2 )
  {
    v23 = (unsigned __int64)a2[2];
    v24 = *a2;
    v7 = (__int64 *)(a2 + 1);
    v25 = (__int64)a2[1];
    if ( v25 + 3 > v23 )
    {
      v26 = 2 * v23;
      v27 = v25 + 995;
      v28 = result;
      v29 = *a2;
      if ( v26 <= v27 )
        v30 = v27;
      else
        v30 = v26;
      a2[2] = (char *)v30;
      v31 = (char *)realloc(v29, v30);
      *a2 = v31;
      if ( v31 == nullptr )
        abort();
      v25 = *v7;
      v24 = v31;
      result = v28;
    }
    v32 = &v24[v25];
    v32[2] = 84;
    *(_WORD *)v32 = 21540;
    v22 = 3;
  }
  else
  {
    if ( v2 == 1 )
    {
      v15 = (unsigned __int64)a2[2];
      v5 = *a2;
      v7 = (__int64 *)(a2 + 1);
      v6 = (__int64)a2[1];
      if ( v6 + 2 > v15 )
      {
        v16 = 2 * v15;
        v17 = v6 + 994;
        v18 = result;
        v19 = *a2;
        if ( v16 <= v17 )
          v20 = v17;
        else
          v20 = v16;
        a2[2] = (char *)v20;
        v21 = (char *)realloc(v19, v20);
        *a2 = v21;
        if ( v21 == nullptr )
          abort();
        v6 = *v7;
        v5 = v21;
        result = v18;
      }
      v14 = 20004;
    }
    else
    {
      if ( v2 != 0 )
        goto LABEL_27;
      v4 = (unsigned __int64)a2[2];
      v5 = *a2;
      v7 = (__int64 *)(a2 + 1);
      v6 = (__int64)a2[1];
      if ( v6 + 2 > v4 )
      {
        v8 = 2 * v4;
        v9 = v6 + 994;
        v10 = result;
        v11 = *a2;
        if ( v8 <= v9 )
          v12 = v9;
        else
          v12 = v8;
        a2[2] = (char *)v12;
        v13 = (char *)realloc(v11, v12);
        *a2 = v13;
        if ( v13 == nullptr )
          abort();
        v6 = *v7;
        v5 = v13;
        result = v10;
      }
      v14 = 21540;
    }
    *(_WORD *)&v5[v6] = v14;
    v22 = 2;
  }
  *v7 += v22;
LABEL_27:
  v33 = result[4];
  if ( v33 != 0 )
  {
    v34 = (unsigned int)(v33 - 1);
    v35 = 0;
    do
    {
      v36 = &v44[v35];
      v37 = v34 > 9;
      --v35;
      v38 = v34 % 0xA;
      v34 /= 0xAu;
      v36[20] = v38 | 0x30;
    }
    while ( v37 );
    v39 = a2[1];
    v40 = (unsigned __int64)a2[2];
    v41 = *a2;
    v42 = &v39[-v35];
    if ( (unsigned __int64)&v39[-v35] > v40 )
    {
      if ( 2 * v40 <= (unsigned __int64)(v42 + 992) )
        v43 = (size_t)(v42 + 992);
      else
        v43 = 2 * v40;
      a2[2] = (char *)v43;
      v41 = (char *)realloc(v41, v43);
      *a2 = v41;
      if ( v41 == nullptr )
        abort();
      v39 = a2[1];
    }
    result = memcpy(&v39[(_QWORD)v41], &v44[v35 + 21], -v35);
    a2[1] -= v35;
  }
  return result;
}


// Address: 0x22F50 | Function: sub_22F50
void sub_22F50()
{
  sub_13E30();
}


// Address: 0x22F5C | Function: sub_22F5C
char *__fastcall sub_22F5C(__int64 a1, char **a2)
{
  char *v2; // x8
  unsigned __int64 v3; // x9
  char *result; // x0
  unsigned __int64 v6; // x9
  size_t v7; // x8
  size_t v8; // x1
  char *v9; // x8

  v2 = a2[1];
  v3 = (unsigned __int64)a2[2];
  result = *a2;
  if ( (unsigned __int64)(v2 + 9) > v3 )
  {
    v6 = 2 * v3;
    v7 = (size_t)(v2 + 1001);
    if ( v6 <= v7 )
      v8 = v7;
    else
      v8 = v6;
    a2[2] = (char *)v8;
    result = (char *)realloc(result, v8);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v2 = a2[1];
  }
  v9 = &v2[(_QWORD)result];
  v9[8] = 32;
  *(_QWORD *)v9 = *(_QWORD *)"typename ";
  a2[1] += 9;
  return result;
}


// Address: 0x22FE4 | Function: sub_22FE4
__int64 __fastcall sub_22FE4(__int64 a1, __int64 a2)
{
  __int64 v2; // x19
  __int64 result; // x0

  v2 = *(_QWORD *)(a1 + 16);
  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v2 + 32LL))(v2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v2 + 40LL))(v2, a2);
  return result;
}


// Address: 0x2304C | Function: sub_2304C
void sub_2304C()
{
  sub_13E30();
}


// Address: 0x23058 | Function: sub_23058
void *__fastcall sub_23058(__int64 a1, __int64 a2)
{
  __int64 v2; // x20
  __int64 v4; // x8
  unsigned __int64 v5; // x9
  void *result; // x0
  unsigned __int64 v7; // x9
  size_t v8; // x8
  size_t v9; // x1

  v2 = *(_QWORD *)(a1 + 16);
  (*(void (__fastcall **)(__int64))(*(_QWORD *)v2 + 32LL))(v2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v2 + 40LL))(v2, a2);
  v4 = *(_QWORD *)(a2 + 8);
  v5 = *(_QWORD *)(a2 + 16);
  result = *(void **)a2;
  if ( v4 + 1 > v5 )
  {
    v7 = 2 * v5;
    v8 = v4 + 993;
    if ( v7 <= v8 )
      v9 = v8;
    else
      v9 = v7;
    *(_QWORD *)(a2 + 16) = v9;
    result = realloc(result, v9);
    *(_QWORD *)a2 = result;
    if ( result == nullptr )
      abort();
    v4 = *(_QWORD *)(a2 + 8);
  }
  *((_BYTE *)result + v4) = 32;
  ++*(_QWORD *)(a2 + 8);
  return result;
}


// Address: 0x23104 | Function: sub_23104
__int64 __fastcall sub_23104(__int64 a1, __int64 a2)
{
  __int64 v2; // x19
  __int64 result; // x0

  v2 = *(_QWORD *)(a1 + 24);
  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v2 + 32LL))(v2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v2 + 40LL))(v2, a2);
  return result;
}


// Address: 0x2316C | Function: sub_2316C
void sub_2316C()
{
  sub_13E30();
}


// Address: 0x23178 | Function: sub_23178
__int64 __fastcall sub_23178(__int64 a1, __int64 *a2)
{
  __int64 result; // x0
  unsigned int v5; // w8
  __int64 v6; // x8
  unsigned __int64 v7; // x9
  unsigned __int64 v8; // x9
  size_t v9; // x8
  size_t v10; // x1

  (*(void (__fastcall **)(_QWORD))(**(_QWORD **)(a1 + 24) + 32LL))(*(_QWORD *)(a1 + 24));
  result = *(_QWORD *)(a1 + 24);
  v5 = *(unsigned __int8 *)(result + 9);
  if ( (v5 & 0xC0) == 0x80 )
  {
    result = (**(__int64 (__fastcall ***)(__int64, __int64 *))result)(result, a2);
    if ( (result & 1) != 0 )
      return result;
  }
  else if ( v5 < 0x40 )
  {
    return result;
  }
  v6 = a2[1];
  v7 = a2[2];
  result = *a2;
  if ( v6 + 1 > v7 )
  {
    v8 = 2 * v7;
    v9 = v6 + 993;
    if ( v8 <= v9 )
      v10 = v9;
    else
      v10 = v8;
    a2[2] = v10;
    result = (__int64)realloc((void *)result, v10);
    *a2 = result;
    if ( result == 0 )
      abort();
    v6 = a2[1];
  }
  *(_BYTE *)(result + v6) = 32;
  ++a2[1];
  return result;
}


// Address: 0x23234 | Function: sub_23234
__int64 __fastcall sub_23234(__int64 a1, __int64 a2)
{
  __int64 v2; // x21

  v2 = *(_QWORD *)(a1 + 16);
  (*(void (__fastcall **)(__int64))(*(_QWORD *)v2 + 32LL))(v2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v2 + 40LL))(v2, a2);
  return (*(__int64 (__fastcall **)(_QWORD, __int64))(**(_QWORD **)(a1 + 24) + 40LL))(*(_QWORD *)(a1 + 24), a2);
}


// Address: 0x232AC | Function: sub_232AC
void sub_232AC()
{
  sub_13E30();
}


// Address: 0x232B8 | Function: sub_232B8
char *__fastcall sub_232B8(__int64 a1, __int64 a2)
{
  __int64 v2; // x8
  unsigned __int64 v3; // x9
  char *v5; // x0
  int v6; // w21
  unsigned __int64 v8; // x9
  size_t v9; // x8
  size_t v10; // x1
  char *v11; // x8
  __int64 v12; // x8
  unsigned __int64 v13; // x9
  char *result; // x0
  unsigned __int64 v15; // x9
  size_t v16; // x8
  size_t v17; // x1
  char *v18; // x8

  v2 = *(_QWORD *)(a2 + 8);
  v3 = *(_QWORD *)(a2 + 16);
  v5 = *(char **)a2;
  v6 = *(_DWORD *)(a2 + 32);
  *(_DWORD *)(a2 + 32) = 0;
  if ( v2 + 9 > v3 )
  {
    v8 = 2 * v3;
    v9 = v2 + 1001;
    if ( v8 <= v9 )
      v10 = v9;
    else
      v10 = v8;
    *(_QWORD *)(a2 + 16) = v10;
    v5 = (char *)realloc(v5, v10);
    *(_QWORD *)a2 = v5;
    if ( v5 == nullptr )
      abort();
    v2 = *(_QWORD *)(a2 + 8);
  }
  v11 = &v5[v2];
  v11[8] = 60;
  *(_QWORD *)v11 = *(_QWORD *)"template<";
  *(_QWORD *)(a2 + 8) += 9LL;
  sub_1F824((_QWORD *)(a1 + 24), a2);
  v12 = *(_QWORD *)(a2 + 8);
  v13 = *(_QWORD *)(a2 + 16);
  result = *(char **)a2;
  if ( v12 + 11 > v13 )
  {
    v15 = 2 * v13;
    v16 = v12 + 1003;
    if ( v15 <= v16 )
      v17 = v16;
    else
      v17 = v15;
    *(_QWORD *)(a2 + 16) = v17;
    result = (char *)realloc(result, v17);
    *(_QWORD *)a2 = result;
    if ( result == nullptr )
      abort();
    v12 = *(_QWORD *)(a2 + 8);
  }
  v18 = &result[v12];
  *(_QWORD *)v18 = *(_QWORD *)"> typename ";
  *(_DWORD *)(v18 + 7) = 543518049;
  *(_QWORD *)(a2 + 8) += 11LL;
  *(_DWORD *)(a2 + 32) = v6;
  return result;
}


// Address: 0x233CC | Function: sub_233CC
void __fastcall __noreturn sub_233CC(__int64 a1)
{
  __int64 v1; // x19
  int v2; // w21

  *(_DWORD *)(v1 + 32) = v2;
  sub_2E950(a1);
}


// Address: 0x233D4 | Function: sub_233D4
__int64 __fastcall sub_233D4(__int64 a1, char **a2)
{
  __int64 v2; // x21
  __int64 result; // x0
  char *v6; // x8
  unsigned __int64 v7; // x9
  char *v8; // x0
  unsigned __int64 v9; // x9
  size_t v10; // x8
  size_t v11; // x1
  char *v12; // x8
  __int64 *v13; // x20
  __int64 v14; // x9

  v2 = *(_QWORD *)(a1 + 16);
  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v2 + 32LL))(v2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    result = (*(__int64 (__fastcall **)(__int64, char **))(*(_QWORD *)v2 + 40LL))(v2, a2);
  if ( *(_QWORD *)(a1 + 40) != 0 )
  {
    v6 = a2[1];
    v7 = (unsigned __int64)a2[2];
    v8 = *a2;
    if ( (unsigned __int64)(v6 + 10) > v7 )
    {
      v9 = 2 * v7;
      v10 = (size_t)(v6 + 1002);
      if ( v9 <= v10 )
        v11 = v10;
      else
        v11 = v9;
      a2[2] = (char *)v11;
      v8 = (char *)realloc(v8, v11);
      *a2 = v8;
      if ( v8 == nullptr )
        abort();
      v6 = a2[1];
    }
    v12 = &v6[(_QWORD)v8];
    *((_WORD *)v12 + 4) = 8307;
    *(_QWORD *)v12 = *(_QWORD *)" requires ";
    v13 = *(__int64 **)(a1 + 40);
    v14 = *v13;
    a2[1] += 10;
    result = (*(__int64 (__fastcall **)(__int64 *, char **))(v14 + 32))(v13, a2);
    if ( (*(_WORD *)((_BYTE *)v13 + 9) & 0xC0) != 0x40 )
      return (*(__int64 (__fastcall **)(__int64 *, char **))(*v13 + 40))(v13, a2);
  }
  return result;
}


// Address: 0x234F4 | Function: sub_234F4
void sub_234F4()
{
  sub_13E30();
}


// Address: 0x23500 | Function: sub_23500
char *__fastcall sub_23500(__int64 a1, char **a2)
{
  char *v3; // x8
  unsigned __int64 v4; // x9
  char *result; // x0
  unsigned __int64 v6; // x9
  size_t v7; // x8
  size_t v8; // x1
  char *v9; // x8

  (*(void (__fastcall **)(_QWORD))(**(_QWORD **)(a1 + 16) + 32LL))(*(_QWORD *)(a1 + 16));
  v3 = a2[1];
  v4 = (unsigned __int64)a2[2];
  result = *a2;
  if ( (unsigned __int64)(v3 + 3) > v4 )
  {
    v6 = 2 * v4;
    v7 = (size_t)(v3 + 995);
    if ( v6 <= v7 )
      v8 = v7;
    else
      v8 = v6;
    a2[2] = (char *)v8;
    result = (char *)realloc(result, v8);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v3 = a2[1];
  }
  v9 = &v3[(_QWORD)result];
  v9[2] = 46;
  *(_WORD *)v9 = 11822;
  a2[1] += 3;
  return result;
}


// Address: 0x23590 | Function: sub_23590
__int64 __fastcall sub_23590(__int64 a1)
{
  return (*(__int64 (__fastcall **)(_QWORD))(**(_QWORD **)(a1 + 16) + 40LL))(*(_QWORD *)(a1 + 16));
}


// Address: 0x235A4 | Function: sub_235A4
void sub_235A4()
{
  sub_13E30();
}


// Address: 0x235B0 | Function: sub_235B0
__int64 __fastcall sub_235B0(__int64 a1, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  void *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  char *v12; // x8
  __int64 v13; // x8
  size_t v14; // x21
  size_t v15; // x10
  const void *v16; // x22
  char *v17; // x0
  size_t v18; // x1
  unsigned __int64 v19; // x9
  void *v20; // x0
  unsigned __int64 v21; // x9
  size_t v22; // x8
  size_t v23; // x1

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  if ( (unsigned __int64)(v2 + 7) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 999);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (void *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = v11;
  }
  v12 = &v2[(_QWORD)v5];
  *(_DWORD *)(v12 + 3) = 1633968749;
  *(_DWORD *)v12 = 1835101223;
  v13 = (__int64)a2[1] + 7;
  a2[1] = (void *)v13;
  v14 = *(_QWORD *)(a1 + 72);
  if ( v14 != 0 )
  {
    v15 = (size_t)a2[2];
    v16 = *(const void **)(a1 + 64);
    v17 = (char *)*a2;
    if ( v13 + v14 > v15 )
    {
      if ( 2 * v15 <= v13 + v14 + 992 )
        v18 = v13 + v14 + 992;
      else
        v18 = 2 * v15;
      a2[2] = (void *)v18;
      v17 = (char *)realloc(v17, v18);
      *a2 = v17;
      if ( v17 == nullptr )
        abort();
      v13 = (__int64)a2[1];
    }
    memcpy(&v17[v13], v16, v14);
    v13 = (__int64)a2[1] + v14;
    a2[1] = (void *)v13;
  }
  v19 = (unsigned __int64)a2[2];
  v20 = *a2;
  if ( v13 + 1 > v19 )
  {
    v21 = 2 * v19;
    v22 = v13 + 993;
    if ( v21 <= v22 )
      v23 = v22;
    else
      v23 = v21;
    a2[2] = (void *)v23;
    v20 = realloc(v20, v23);
    *a2 = v20;
    if ( v20 == nullptr )
      abort();
    v13 = (__int64)a2[1];
  }
  *((_BYTE *)v20 + v13) = 39;
  a2[1] = (char *)a2[1] + 1;
  return sub_23714(a1, a2);
}


// Address: 0x23708 | Function: sub_23708
void sub_23708()
{
  sub_13E30();
}


// Address: 0x23714 | Function: sub_23714
char *__fastcall sub_23714(_QWORD *a1, __int64 a2)
{
  __int64 v4; // x8
  unsigned __int64 v5; // x9
  char *v6; // x0
  int v7; // w21
  unsigned __int64 v8; // x9
  size_t v9; // x8
  size_t v10; // x1
  __int64 v11; // x8
  unsigned __int64 v12; // x9
  char *v13; // x0
  unsigned __int64 v14; // x9
  size_t v15; // x8
  size_t v16; // x1
  __int64 v17; // x8
  __int64 v18; // x8
  unsigned __int64 v19; // x9
  char *v20; // x0
  unsigned __int64 v21; // x9
  size_t v22; // x8
  size_t v23; // x1
  char *v24; // x8
  __int64 *v25; // x21
  __int64 v26; // x9
  __int64 v27; // x8
  unsigned __int64 v28; // x9
  char *v29; // x0
  unsigned __int64 v30; // x9
  size_t v31; // x8
  size_t v32; // x1
  unsigned __int64 v33; // x10
  __int64 v34; // x9
  char *v35; // x0
  unsigned __int64 v36; // x8
  size_t v37; // x1
  __int64 v38; // x8
  unsigned __int64 v39; // x10
  char *result; // x0
  __int64 v41; // x9
  unsigned __int64 v42; // x8
  size_t v43; // x1
  __int64 v44; // x8
  unsigned __int64 v45; // x9
  char *v46; // x0
  unsigned __int64 v47; // x9
  size_t v48; // x8
  size_t v49; // x1
  char *v50; // x8
  __int64 *v51; // x20
  __int64 v52; // x9

  if ( a1[3] != 0 )
  {
    v4 = *(_QWORD *)(a2 + 8);
    v5 = *(_QWORD *)(a2 + 16);
    v6 = *(char **)a2;
    v7 = *(_DWORD *)(a2 + 32);
    *(_DWORD *)(a2 + 32) = 0;
    if ( v4 + 1 > v5 )
    {
      v8 = 2 * v5;
      v9 = v4 + 993;
      if ( v8 <= v9 )
        v10 = v9;
      else
        v10 = v8;
      *(_QWORD *)(a2 + 16) = v10;
      v6 = (char *)realloc(v6, v10);
      *(_QWORD *)a2 = v6;
      if ( v6 == nullptr )
        abort();
      v4 = *(_QWORD *)(a2 + 8);
    }
    v6[v4] = 60;
    ++*(_QWORD *)(a2 + 8);
    sub_1F824(a1 + 2, a2);
    v11 = *(_QWORD *)(a2 + 8);
    v12 = *(_QWORD *)(a2 + 16);
    v13 = *(char **)a2;
    if ( v11 + 1 > v12 )
    {
      v14 = 2 * v12;
      v15 = v11 + 993;
      if ( v14 <= v15 )
        v16 = v15;
      else
        v16 = v14;
      *(_QWORD *)(a2 + 16) = v16;
      v13 = (char *)realloc(v13, v16);
      *(_QWORD *)a2 = v13;
      if ( v13 == nullptr )
        abort();
      v11 = *(_QWORD *)(a2 + 8);
    }
    v13[v11] = 62;
    v17 = *(_QWORD *)(a2 + 8);
    *(_DWORD *)(a2 + 32) = v7;
    *(_QWORD *)(a2 + 8) = v17 + 1;
  }
  v18 = *(_QWORD *)(a2 + 8);
  if ( a1[4] != 0 )
  {
    v19 = *(_QWORD *)(a2 + 16);
    v20 = *(char **)a2;
    if ( v18 + 10 > v19 )
    {
      v21 = 2 * v19;
      v22 = v18 + 1002;
      if ( v21 <= v22 )
        v23 = v22;
      else
        v23 = v21;
      *(_QWORD *)(a2 + 16) = v23;
      v20 = (char *)realloc(v20, v23);
      *(_QWORD *)a2 = v20;
      if ( v20 == nullptr )
        abort();
      v18 = *(_QWORD *)(a2 + 8);
    }
    v24 = &v20[v18];
    *((_WORD *)v24 + 4) = 8307;
    *(_QWORD *)v24 = *(_QWORD *)" requires ";
    v25 = (__int64 *)a1[4];
    v26 = *v25;
    *(_QWORD *)(a2 + 8) += 10LL;
    (*(void (__fastcall **)(__int64 *, __int64))(v26 + 32))(v25, a2);
    if ( (*(_WORD *)((_BYTE *)v25 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, __int64))(*v25 + 40))(v25, a2);
    v27 = *(_QWORD *)(a2 + 8);
    v28 = *(_QWORD *)(a2 + 16);
    v29 = *(char **)a2;
    if ( v27 + 1 > v28 )
    {
      v30 = 2 * v28;
      v31 = v27 + 993;
      if ( v30 <= v31 )
        v32 = v31;
      else
        v32 = v30;
      *(_QWORD *)(a2 + 16) = v32;
      v29 = (char *)realloc(v29, v32);
      *(_QWORD *)a2 = v29;
      if ( v29 == nullptr )
        abort();
      v27 = *(_QWORD *)(a2 + 8);
    }
    v29[v27] = 32;
    v18 = *(_QWORD *)(a2 + 8) + 1LL;
    *(_QWORD *)(a2 + 8) = v18;
  }
  v33 = *(_QWORD *)(a2 + 16);
  v34 = v18 + 1;
  v35 = *(char **)a2;
  ++*(_DWORD *)(a2 + 32);
  if ( v18 + 1 > v33 )
  {
    v36 = v18 + 993;
    if ( 2 * v33 <= v36 )
      v37 = v36;
    else
      v37 = 2 * v33;
    *(_QWORD *)(a2 + 16) = v37;
    v35 = (char *)realloc(v35, v37);
    *(_QWORD *)a2 = v35;
    if ( v35 == nullptr )
      abort();
    v18 = *(_QWORD *)(a2 + 8);
    v34 = v18 + 1;
  }
  *(_QWORD *)(a2 + 8) = v34;
  v35[v18] = 40;
  sub_1F824(a1 + 5, a2);
  v38 = *(_QWORD *)(a2 + 8);
  v39 = *(_QWORD *)(a2 + 16);
  result = *(char **)a2;
  v41 = v38 + 1;
  --*(_DWORD *)(a2 + 32);
  if ( v38 + 1 > v39 )
  {
    v42 = v38 + 993;
    if ( 2 * v39 <= v42 )
      v43 = v42;
    else
      v43 = 2 * v39;
    *(_QWORD *)(a2 + 16) = v43;
    result = (char *)realloc(result, v43);
    *(_QWORD *)a2 = result;
    if ( result == nullptr )
      abort();
    v38 = *(_QWORD *)(a2 + 8);
    v41 = v38 + 1;
  }
  *(_QWORD *)(a2 + 8) = v41;
  result[v38] = 41;
  if ( a1[7] != 0 )
  {
    v44 = *(_QWORD *)(a2 + 8);
    v45 = *(_QWORD *)(a2 + 16);
    v46 = *(char **)a2;
    if ( v44 + 10 > v45 )
    {
      v47 = 2 * v45;
      v48 = v44 + 1002;
      if ( v47 <= v48 )
        v49 = v48;
      else
        v49 = v47;
      *(_QWORD *)(a2 + 16) = v49;
      v46 = (char *)realloc(v46, v49);
      *(_QWORD *)a2 = v46;
      if ( v46 == nullptr )
        abort();
      v44 = *(_QWORD *)(a2 + 8);
    }
    v50 = &v46[v44];
    *((_WORD *)v50 + 4) = 8307;
    *(_QWORD *)v50 = *(_QWORD *)" requires ";
    v51 = (__int64 *)a1[7];
    v52 = *v51;
    *(_QWORD *)(a2 + 8) += 10LL;
    result = (char *)(*(__int64 (__fastcall **)(__int64 *, __int64))(v52 + 32))(v51, a2);
    if ( (*(_WORD *)((_BYTE *)v51 + 9) & 0xC0) != 0x40 )
      return (char *)(*(__int64 (__fastcall **)(__int64 *, __int64))(*v51 + 40))(v51, a2);
  }
  return result;
}


// Address: 0x23A6C | Function: sub_23A6C
void __fastcall __noreturn sub_23A6C(__int64 a1)
{
  __int64 v1; // x19
  int v2; // w21

  *(_DWORD *)(v1 + 32) = v2;
  sub_2E950(a1);
}


// Address: 0x23A74 | Function: sub_23A74
char *__fastcall sub_23A74(__int64 a1, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  void *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  __int64 v12; // x0
  int v13; // w9
  __int64 v14; // x8
  unsigned __int64 v15; // x9
  char *result; // x0
  unsigned __int64 v17; // x9
  size_t v18; // x8
  size_t v19; // x1
  char *v20; // x8

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  if ( (unsigned __int64)(v2 + 2) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 994);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (void *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = v11;
  }
  *(_WORD *)&v2[(_QWORD)v5] = 23899;
  v12 = *(_QWORD *)(a1 + 16);
  v13 = *(unsigned __int8 *)(v12 + 8);
  v14 = (__int64)a2[1] + 2;
  a2[1] = (void *)v14;
  if ( v13 == 52 )
  {
    sub_23714((_QWORD *)v12, (__int64)a2);
    v14 = (__int64)a2[1];
  }
  v15 = (unsigned __int64)a2[2];
  result = (char *)*a2;
  if ( v14 + 5 > v15 )
  {
    v17 = 2 * v15;
    v18 = v14 + 997;
    if ( v17 <= v18 )
      v19 = v18;
    else
      v19 = v17;
    a2[2] = (void *)v19;
    result = (char *)realloc(result, v19);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v14 = (__int64)a2[1];
  }
  v20 = &result[v14];
  v20[4] = 125;
  *(_DWORD *)v20 = 774778491;
  a2[1] = (char *)a2[1] + 5;
  return result;
}


// Address: 0x23B70 | Function: sub_23B70
void sub_23B70()
{
  sub_13E30();
}


// Address: 0x23B7C | Function: sub_23B7C
char *__fastcall sub_23B7C(_QWORD *a1, char **a2)
{
  char *v2; // x8
  unsigned __int64 v3; // x10
  char *v5; // x0
  char *v7; // x9
  unsigned __int64 v8; // x8
  size_t v9; // x1
  __int64 v10; // x21
  char *v11; // x8
  unsigned __int64 v12; // x10
  char *result; // x0
  char *v14; // x9
  unsigned __int64 v15; // x8
  size_t v16; // x1
  _BYTE *v17; // x22
  char *v18; // x8
  unsigned __int64 v19; // x10
  char *v20; // x9
  unsigned __int64 v21; // x8
  size_t v22; // x1
  __int64 v23; // x8
  size_t v24; // x21
  char *v25; // x8
  size_t v26; // x9
  char *v27; // x0
  __int64 v28; // x20
  char *v29; // x10
  size_t v30; // x1
  char *v31; // x0
  const void *v32; // x1
  char *v33; // x8
  size_t v34; // x9
  char *v35; // x0
  char *v36; // x10
  size_t v37; // x1

  v2 = a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = *a2;
  v7 = v2 + 1;
  ++*((_DWORD *)a2 + 8);
  if ( (unsigned __int64)(v2 + 1) > v3 )
  {
    v8 = (unsigned __int64)(v2 + 993);
    if ( 2 * v3 <= v8 )
      v9 = v8;
    else
      v9 = 2 * v3;
    a2[2] = (char *)v9;
    v5 = (char *)realloc(v5, v9);
    *a2 = v5;
    if ( v5 == nullptr )
      abort();
    v2 = a2[1];
    v7 = v2 + 1;
  }
  a2[1] = v7;
  v2[(_QWORD)v5] = 40;
  v10 = a1[2];
  (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v10 + 32LL))(v10, a2);
  if ( (*(_WORD *)(v10 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v10 + 40LL))(v10, a2);
  v11 = a2[1];
  v12 = (unsigned __int64)a2[2];
  result = *a2;
  v14 = v11 + 1;
  --*((_DWORD *)a2 + 8);
  if ( (unsigned __int64)(v11 + 1) > v12 )
  {
    v15 = (unsigned __int64)(v11 + 993);
    if ( 2 * v12 <= v15 )
      v16 = v15;
    else
      v16 = 2 * v12;
    a2[2] = (char *)v16;
    result = (char *)realloc(result, v16);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v11 = a2[1];
    v14 = v11 + 1;
  }
  a2[1] = v14;
  v11[(_QWORD)result] = 41;
  v17 = (_BYTE *)a1[3];
  if ( *v17 != 110 )
  {
    v24 = a1[4];
    if ( v24 == 0 )
      return result;
    v33 = a2[1];
    v34 = (size_t)a2[2];
    v35 = *a2;
    v36 = &v33[v24];
    if ( (unsigned __int64)&v33[v24] > v34 )
    {
      if ( 2 * v34 <= (unsigned __int64)(v36 + 992) )
        v37 = (size_t)(v36 + 992);
      else
        v37 = 2 * v34;
      a2[2] = (char *)v37;
      v35 = (char *)realloc(v35, v37);
      *a2 = v35;
      if ( v35 == nullptr )
        abort();
      v33 = a2[1];
    }
    v31 = &v33[(_QWORD)v35];
    v32 = v17;
    goto LABEL_38;
  }
  v18 = a2[1];
  v19 = (unsigned __int64)a2[2];
  result = *a2;
  v20 = v18 + 1;
  if ( (unsigned __int64)(v18 + 1) > v19 )
  {
    v21 = (unsigned __int64)(v18 + 993);
    if ( 2 * v19 <= v21 )
      v22 = v21;
    else
      v22 = 2 * v19;
    a2[2] = (char *)v22;
    result = (char *)realloc(result, v22);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v18 = a2[1];
    v20 = v18 + 1;
  }
  a2[1] = v20;
  v18[(_QWORD)result] = 45;
  v23 = a1[4];
  v24 = v23 - 1;
  if ( v23 != 1 )
  {
    v25 = a2[1];
    v26 = (size_t)a2[2];
    v27 = *a2;
    v28 = a1[3];
    v29 = &v25[v24];
    if ( (unsigned __int64)&v25[v24] > v26 )
    {
      if ( 2 * v26 <= (unsigned __int64)(v29 + 992) )
        v30 = (size_t)(v29 + 992);
      else
        v30 = 2 * v26;
      a2[2] = (char *)v30;
      v27 = (char *)realloc(v27, v30);
      *a2 = v27;
      if ( v27 == nullptr )
        abort();
      v25 = a2[1];
    }
    v31 = &v25[(_QWORD)v27];
    v32 = (const void *)(v28 + 1);
LABEL_38:
    result = (char *)memcpy(v31, v32, v24);
    a2[1] += v24;
  }
  return result;
}


// Address: 0x23DAC | Function: sub_23DAC
void sub_23DAC()
{
  sub_13E30();
}


// Address: 0x23DB8 | Function: sub_23DB8
long double __fastcall sub_23DB8(__int64 a1, long double *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x0
  __int16 v8; // w8
  long double result; // q0

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 32;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_37D28;
  v7 = (__int64)v2 + v4 + 16;
  v8 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(v7 + 8) = 67;
  result = *a2;
  *(_WORD *)(v7 + 9) = v8 & 0xF000 | 0x540;
  *(long double *)(v7 + 16) = result;
  return result;
}


// Address: 0x23E58 | Function: sub_23E58
char *__fastcall sub_23E58(char *result, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  _QWORD *v6; // x21
  unsigned __int64 v7; // x10
  size_t v8; // x9
  void *v9; // x0
  size_t v10; // x1
  __int64 v11; // x8
  size_t v12; // x20
  size_t v13; // x10
  const void *v14; // x21
  char *v15; // x0
  size_t v16; // x1

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  v6 = result;
  if ( (unsigned __int64)(v2 + 2) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 994);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (void *)v10;
    result = (char *)realloc(v9, v10);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = result;
  }
  *(_WORD *)&v2[(_QWORD)v5] = 28774;
  v11 = (__int64)a2[1] + 2;
  a2[1] = (void *)v11;
  v12 = v6[3];
  if ( v12 != 0 )
  {
    v13 = (size_t)a2[2];
    v14 = (const void *)v6[2];
    v15 = (char *)*a2;
    if ( v11 + v12 > v13 )
    {
      if ( 2 * v13 <= v11 + v12 + 992 )
        v16 = v11 + v12 + 992;
      else
        v16 = 2 * v13;
      a2[2] = (void *)v16;
      v15 = (char *)realloc(v15, v16);
      *a2 = v15;
      if ( v15 == nullptr )
        abort();
      v11 = (__int64)a2[1];
    }
    result = (char *)memcpy(&v15[v11], v14, v12);
    a2[1] = (char *)a2[1] + v12;
  }
  return result;
}


// Address: 0x23F44 | Function: sub_23F44
void sub_23F44()
{
  sub_13E30();
}


// Address: 0x23F50 | Function: sub_23F50
char *__fastcall sub_23F50(__int64 a1, char **a2)
{
  char *v2; // x8
  unsigned __int64 v3; // x10
  char *v5; // x0
  char *v7; // x9
  unsigned __int64 v8; // x8
  size_t v9; // x1
  __int64 v10; // x21
  __int64 v11; // x8
  char *v12; // x8
  unsigned __int64 v13; // x10
  void *v14; // x0
  char *v15; // x9
  unsigned __int64 v16; // x8
  size_t v17; // x1
  char *v18; // x8
  unsigned __int64 v19; // x10
  void *v20; // x0
  char *v21; // x9
  unsigned __int64 v22; // x8
  size_t v23; // x1
  char *v24; // x8
  unsigned __int64 v25; // x10
  void *v26; // x0
  char *v27; // x9
  unsigned __int64 v28; // x8
  size_t v29; // x1
  __int64 v30; // x9
  unsigned __int64 v31; // x10
  unsigned __int64 v32; // x8
  size_t v33; // x1
  char *v34; // x8
  unsigned __int64 v35; // x9
  void *v36; // x0
  unsigned __int64 v37; // x9
  size_t v38; // x8
  size_t v39; // x1
  __int64 v40; // x8
  size_t v41; // x21
  size_t v42; // x10
  const void *v43; // x22
  char *v44; // x0
  size_t v45; // x1
  unsigned __int64 v46; // x9
  char *v47; // x0
  unsigned __int64 v48; // x9
  size_t v49; // x8
  size_t v50; // x1
  unsigned __int64 v51; // x9
  char *v52; // x0
  unsigned __int64 v53; // x9
  size_t v54; // x8
  size_t v55; // x1
  char *v56; // x8
  char *v57; // x9
  char *v58; // x8
  unsigned __int64 v59; // x10
  void *v60; // x0
  unsigned __int64 v61; // x9
  size_t v62; // x1
  __int64 v63; // x8
  size_t v64; // x21
  size_t v65; // x10
  const void *v66; // x22
  char *v67; // x0
  size_t v68; // x1
  unsigned __int64 v69; // x9
  char *v70; // x0
  unsigned __int64 v71; // x9
  size_t v72; // x8
  size_t v73; // x1
  char *v74; // x9
  char *v75; // x8
  unsigned __int64 v76; // x11
  char *v77; // x10
  void *v78; // x0
  unsigned __int64 v79; // x9
  size_t v80; // x1
  __int64 v81; // x9
  char *v82; // x8
  unsigned __int64 v83; // x10
  void *v84; // x0
  char *v85; // x9
  unsigned __int64 v86; // x8
  size_t v87; // x1
  __int64 v88; // x20
  unsigned __int64 v89; // x11
  char *v90; // x10
  void *v91; // x0
  unsigned __int64 v92; // x9
  size_t v93; // x1
  unsigned __int64 v94; // x10
  unsigned __int64 v95; // x8
  size_t v96; // x1
  char *v97; // x8
  unsigned __int64 v98; // x10
  char *result; // x0
  char *v100; // x9
  unsigned __int64 v101; // x8
  size_t v102; // x1
  __int64 (__fastcall **v103)(); // [xsp+8h] [xbp-18h] BYREF
  char v104; // [xsp+10h] [xbp-10h]
  __int16 v105; // [xsp+11h] [xbp-Fh]
  __int64 v106; // [xsp+18h] [xbp-8h]

  v2 = a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = *a2;
  v7 = v2 + 1;
  ++*((_DWORD *)a2 + 8);
  if ( (unsigned __int64)(v2 + 1) > v3 )
  {
    v8 = (unsigned __int64)(v2 + 993);
    if ( 2 * v3 <= v8 )
      v9 = v8;
    else
      v9 = 2 * v3;
    a2[2] = (char *)v9;
    v5 = (char *)realloc(v5, v9);
    *a2 = v5;
    if ( v5 == nullptr )
      abort();
    v2 = a2[1];
    v7 = v2 + 1;
  }
  a2[1] = v7;
  v2[(_QWORD)v5] = 40;
  v10 = *(_QWORD *)(a1 + 24);
  if ( *(_BYTE *)(a1 + 48) == 1 && v10 == 0 )
  {
    v11 = (__int64)a2[1];
    goto LABEL_60;
  }
  if ( *(_BYTE *)(a1 + 48) == 0 )
  {
    v24 = a2[1];
    v25 = (unsigned __int64)a2[2];
    v26 = *a2;
    v27 = v24 + 1;
    ++*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v24 + 1) > v25 )
    {
      v28 = (unsigned __int64)(v24 + 993);
      if ( 2 * v25 <= v28 )
        v29 = v28;
      else
        v29 = 2 * v25;
      a2[2] = (char *)v29;
      v26 = realloc(v26, v29);
      *a2 = (char *)v26;
      if ( v26 == nullptr )
        abort();
      v24 = a2[1];
      v27 = v24 + 1;
    }
    a2[1] = v27;
    v24[(_QWORD)v26] = 40;
    v104 = 42;
    v30 = *(_QWORD *)(a1 + 16);
    v105 = 1344;
    v103 = off_37E08;
    v106 = v30;
    sub_246E0(&v103, a2);
    v18 = a2[1];
    v31 = (unsigned __int64)a2[2];
    v20 = *a2;
    v21 = v18 + 1;
    --*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v18 + 1) <= v31 )
      goto LABEL_38;
    v32 = (unsigned __int64)(v18 + 993);
    if ( 2 * v31 <= v32 )
      v33 = v32;
    else
      v33 = 2 * v31;
    a2[2] = (char *)v33;
    v20 = realloc(v20, v33);
    *a2 = (char *)v20;
    if ( v20 == nullptr )
      abort();
    goto LABEL_37;
  }
  if ( (*(_WORD *)(v10 + 9) & 0x3C) == 0 )
  {
    (*(void (__fastcall **)(_QWORD, char **))(*(_QWORD *)v10 + 32LL))(*(_QWORD *)(a1 + 24), a2);
    if ( (*(_WORD *)(v10 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v10 + 40LL))(v10, a2);
    goto LABEL_39;
  }
  v12 = a2[1];
  v13 = (unsigned __int64)a2[2];
  v14 = *a2;
  v15 = v12 + 1;
  ++*((_DWORD *)a2 + 8);
  if ( (unsigned __int64)(v12 + 1) > v13 )
  {
    v16 = (unsigned __int64)(v12 + 993);
    if ( 2 * v13 <= v16 )
      v17 = v16;
    else
      v17 = 2 * v13;
    a2[2] = (char *)v17;
    v14 = realloc(v14, v17);
    *a2 = (char *)v14;
    if ( v14 == nullptr )
      abort();
    v12 = a2[1];
    v15 = v12 + 1;
  }
  a2[1] = v15;
  v12[(_QWORD)v14] = 40;
  (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v10 + 32LL))(v10, a2);
  if ( (*(_WORD *)(v10 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v10 + 40LL))(v10, a2);
  v18 = a2[1];
  v19 = (unsigned __int64)a2[2];
  v20 = *a2;
  v21 = v18 + 1;
  --*((_DWORD *)a2 + 8);
  if ( (unsigned __int64)(v18 + 1) > v19 )
  {
    v22 = (unsigned __int64)(v18 + 993);
    if ( 2 * v19 <= v22 )
      v23 = v22;
    else
      v23 = 2 * v19;
    a2[2] = (char *)v23;
    v20 = realloc(v20, v23);
    *a2 = (char *)v20;
    if ( v20 == nullptr )
      abort();
LABEL_37:
    v18 = a2[1];
    v21 = v18 + 1;
  }
LABEL_38:
  a2[1] = v21;
  v18[(_QWORD)v20] = 41;
LABEL_39:
  v34 = a2[1];
  v35 = (unsigned __int64)a2[2];
  v36 = *a2;
  if ( (unsigned __int64)(v34 + 1) > v35 )
  {
    v37 = 2 * v35;
    v38 = (size_t)(v34 + 993);
    if ( v37 <= v38 )
      v39 = v38;
    else
      v39 = v37;
    a2[2] = (char *)v39;
    v36 = realloc(v36, v39);
    *a2 = (char *)v36;
    if ( v36 == nullptr )
      abort();
    v34 = a2[1];
  }
  v34[(_QWORD)v36] = 32;
  v40 = (__int64)(a2[1] + 1);
  a2[1] = (char *)v40;
  v41 = *(_QWORD *)(a1 + 40);
  if ( v41 != 0 )
  {
    v42 = (size_t)a2[2];
    v43 = *(const void **)(a1 + 32);
    v44 = *a2;
    if ( v40 + v41 > v42 )
    {
      if ( 2 * v42 <= v40 + v41 + 992 )
        v45 = v40 + v41 + 992;
      else
        v45 = 2 * v42;
      a2[2] = (char *)v45;
      v44 = (char *)realloc(v44, v45);
      *a2 = v44;
      if ( v44 == nullptr )
        abort();
      v40 = (__int64)a2[1];
    }
    memcpy(&v44[v40], v43, v41);
    v40 = (__int64)&a2[1][v41];
    a2[1] = (char *)v40;
  }
  v46 = (unsigned __int64)a2[2];
  v47 = *a2;
  if ( v40 + 1 > v46 )
  {
    v48 = 2 * v46;
    v49 = v40 + 993;
    if ( v48 <= v49 )
      v50 = v49;
    else
      v50 = v48;
    a2[2] = (char *)v50;
    v47 = (char *)realloc(v47, v50);
    *a2 = v47;
    if ( v47 == nullptr )
      abort();
    v40 = (__int64)a2[1];
  }
  v47[v40] = 32;
  v11 = (__int64)(a2[1] + 1);
  a2[1] = (char *)v11;
LABEL_60:
  v51 = (unsigned __int64)a2[2];
  v52 = *a2;
  if ( v11 + 3 > v51 )
  {
    v53 = 2 * v51;
    v54 = v11 + 995;
    if ( v53 <= v54 )
      v55 = v54;
    else
      v55 = v53;
    a2[2] = (char *)v55;
    v52 = (char *)realloc(v52, v55);
    *a2 = v52;
    if ( v52 == nullptr )
      abort();
    v11 = (__int64)a2[1];
  }
  v56 = &v52[v11];
  v56[2] = 46;
  *(_WORD *)v56 = 11822;
  v57 = a2[1];
  v58 = v57 + 3;
  a2[1] = v57 + 3;
  if ( (*(_BYTE *)(a1 + 48) & 1) != 0 || *(_QWORD *)(a1 + 24) != 0 )
  {
    v59 = (unsigned __int64)a2[2];
    v60 = *a2;
    if ( (unsigned __int64)(v57 + 4) > v59 )
    {
      v61 = (unsigned __int64)(v57 + 996);
      if ( 2 * v59 <= v61 )
        v62 = v61;
      else
        v62 = 2 * v59;
      a2[2] = (char *)v62;
      v60 = realloc(v60, v62);
      *a2 = (char *)v60;
      if ( v60 == nullptr )
        abort();
      v58 = a2[1];
    }
    v58[(_QWORD)v60] = 32;
    v63 = (__int64)(a2[1] + 1);
    a2[1] = (char *)v63;
    v64 = *(_QWORD *)(a1 + 40);
    if ( v64 != 0 )
    {
      v65 = (size_t)a2[2];
      v66 = *(const void **)(a1 + 32);
      v67 = *a2;
      if ( v63 + v64 > v65 )
      {
        if ( 2 * v65 <= v63 + v64 + 992 )
          v68 = v63 + v64 + 992;
        else
          v68 = 2 * v65;
        a2[2] = (char *)v68;
        v67 = (char *)realloc(v67, v68);
        *a2 = v67;
        if ( v67 == nullptr )
          abort();
        v63 = (__int64)a2[1];
      }
      memcpy(&v67[v63], v66, v64);
      v63 = (__int64)&a2[1][v64];
      a2[1] = (char *)v63;
    }
    v69 = (unsigned __int64)a2[2];
    v70 = *a2;
    if ( v63 + 1 > v69 )
    {
      v71 = 2 * v69;
      v72 = v63 + 993;
      if ( v71 <= v72 )
        v73 = v72;
      else
        v73 = v71;
      a2[2] = (char *)v73;
      v70 = (char *)realloc(v70, v73);
      *a2 = v70;
      if ( v70 == nullptr )
        abort();
      v63 = (__int64)a2[1];
    }
    v70[v63] = 32;
    v74 = a2[1];
    v75 = v74 + 1;
    a2[1] = v74 + 1;
    if ( *(_BYTE *)(a1 + 48) == 1 )
    {
      v76 = (unsigned __int64)a2[2];
      v77 = v74 + 2;
      v78 = *a2;
      ++*((_DWORD *)a2 + 8);
      if ( (unsigned __int64)(v74 + 2) > v76 )
      {
        v79 = (unsigned __int64)(v74 + 994);
        if ( 2 * v76 <= v79 )
          v80 = v79;
        else
          v80 = 2 * v76;
        a2[2] = (char *)v80;
        v78 = realloc(v78, v80);
        *a2 = (char *)v78;
        if ( v78 == nullptr )
          abort();
        v75 = a2[1];
        v77 = v75 + 1;
      }
      a2[1] = v77;
      v75[(_QWORD)v78] = 40;
      v104 = 42;
      v81 = *(_QWORD *)(a1 + 16);
      v105 = 1344;
      v103 = off_37E08;
      v106 = v81;
      sub_246E0(&v103, a2);
      v82 = a2[1];
      v83 = (unsigned __int64)a2[2];
      v84 = *a2;
      v85 = v82 + 1;
      --*((_DWORD *)a2 + 8);
      if ( (unsigned __int64)(v82 + 1) > v83 )
      {
        v86 = (unsigned __int64)(v82 + 993);
        if ( 2 * v83 <= v86 )
          v87 = v86;
        else
          v87 = 2 * v83;
        a2[2] = (char *)v87;
        v84 = realloc(v84, v87);
        *a2 = (char *)v84;
        if ( v84 == nullptr )
          abort();
LABEL_115:
        v82 = a2[1];
        v85 = v82 + 1;
      }
LABEL_116:
      a2[1] = v85;
      v82[(_QWORD)v84] = 41;
      goto LABEL_117;
    }
    v88 = *(_QWORD *)(a1 + 24);
    if ( (*(_WORD *)(v88 + 9) & 0x3C) != 0 )
    {
      v89 = (unsigned __int64)a2[2];
      v90 = v74 + 2;
      v91 = *a2;
      ++*((_DWORD *)a2 + 8);
      if ( (unsigned __int64)(v74 + 2) > v89 )
      {
        v92 = (unsigned __int64)(v74 + 994);
        if ( 2 * v89 <= v92 )
          v93 = v92;
        else
          v93 = 2 * v89;
        a2[2] = (char *)v93;
        v91 = realloc(v91, v93);
        *a2 = (char *)v91;
        if ( v91 == nullptr )
          abort();
        v75 = a2[1];
        v90 = v75 + 1;
      }
      a2[1] = v90;
      v75[(_QWORD)v91] = 40;
      (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v88 + 32LL))(v88, a2);
      if ( (*(_WORD *)(v88 + 9) & 0xC0) != 0x40 )
        (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v88 + 40LL))(v88, a2);
      v82 = a2[1];
      v94 = (unsigned __int64)a2[2];
      v84 = *a2;
      v85 = v82 + 1;
      --*((_DWORD *)a2 + 8);
      if ( (unsigned __int64)(v82 + 1) <= v94 )
        goto LABEL_116;
      v95 = (unsigned __int64)(v82 + 993);
      if ( 2 * v94 <= v95 )
        v96 = v95;
      else
        v96 = 2 * v94;
      a2[2] = (char *)v96;
      v84 = realloc(v84, v96);
      *a2 = (char *)v84;
      if ( v84 == nullptr )
        abort();
      goto LABEL_115;
    }
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v88 + 32LL))(v88, a2);
    if ( (*(_WORD *)(v88 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v88 + 40LL))(v88, a2);
  }
LABEL_117:
  v97 = a2[1];
  v98 = (unsigned __int64)a2[2];
  result = *a2;
  v100 = v97 + 1;
  --*((_DWORD *)a2 + 8);
  if ( (unsigned __int64)(v97 + 1) > v98 )
  {
    v101 = (unsigned __int64)(v97 + 993);
    if ( 2 * v98 <= v101 )
      v102 = v101;
    else
      v102 = 2 * v98;
    a2[2] = (char *)v102;
    result = (char *)realloc(result, v102);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v97 = a2[1];
    v100 = v97 + 1;
  }
  a2[1] = v100;
  v97[(_QWORD)result] = 41;
  return result;
}


// Address: 0x246D4 | Function: sub_246D4
void sub_246D4()
{
  sub_13E30();
}


// Address: 0x246E0 | Function: sub_246E0
__int64 __fastcall sub_246E0(__int64 a1, char **a2)
{
  __int64 *v2; // x21
  __int64 v3; // x25
  int v4; // w22
  int v5; // w23
  __int64 v6; // x8
  __int64 result; // x0
  unsigned int v10; // w24
  int i; // w25
  char *v12; // x8
  unsigned __int64 v13; // x9
  char *v14; // x0
  unsigned __int64 v15; // x9
  size_t v16; // x8
  size_t v17; // x1
  char *v18; // x8
  __int64 *v19; // x21
  __int64 v20; // x9
  char *v21; // x8
  unsigned __int64 v22; // x9
  unsigned __int64 v23; // x9
  size_t v24; // x8
  size_t v25; // x1
  char *v26; // x8

  v2 = *(__int64 **)(a1 + 16);
  v3 = (__int64)a2[1];
  v4 = *((_DWORD *)a2 + 6);
  v5 = *((_DWORD *)a2 + 7);
  v6 = *v2;
  a2[3] = (char *)-1LL;
  result = (*(__int64 (__fastcall **)(__int64 *))(v6 + 32))(v2);
  if ( (*(_WORD *)((_BYTE *)v2 + 9) & 0xC0) != 0x40 )
    result = (*(__int64 (__fastcall **)(__int64 *, char **))(*v2 + 40))(v2, a2);
  v10 = *((_DWORD *)a2 + 7);
  if ( v10 == -1 )
  {
    v21 = a2[1];
    v22 = (unsigned __int64)a2[2];
    result = (__int64)*a2;
    if ( (unsigned __int64)(v21 + 3) > v22 )
    {
      v23 = 2 * v22;
      v24 = (size_t)(v21 + 995);
      if ( v23 <= v24 )
        v25 = v24;
      else
        v25 = v23;
      a2[2] = (char *)v25;
      result = (__int64)realloc((void *)result, v25);
      *a2 = (char *)result;
      if ( result == 0 )
        abort();
      v21 = a2[1];
    }
    v26 = &v21[result];
    v26[2] = 46;
    *(_WORD *)v26 = 11822;
    v3 = (__int64)(a2[1] + 3);
  }
  else if ( v10 != 0 )
  {
    if ( v10 >= 2 )
    {
      for ( i = 1; i != v10; ++i )
      {
        v12 = a2[1];
        v13 = (unsigned __int64)a2[2];
        v14 = *a2;
        if ( (unsigned __int64)(v12 + 2) > v13 )
        {
          v15 = 2 * v13;
          v16 = (size_t)(v12 + 994);
          if ( v15 <= v16 )
            v17 = v16;
          else
            v17 = v15;
          a2[2] = (char *)v17;
          v14 = (char *)realloc(v14, v17);
          *a2 = v14;
          if ( v14 == nullptr )
            abort();
          v12 = a2[1];
        }
        *(_WORD *)&v12[(_QWORD)v14] = 8236;
        v18 = a2[1];
        v19 = *(__int64 **)(a1 + 16);
        *((_DWORD *)a2 + 6) = i;
        v20 = *v19;
        a2[1] = v18 + 2;
        result = (*(__int64 (__fastcall **)(__int64 *, char **))(v20 + 32))(v19, a2);
        if ( (*(_WORD *)((_BYTE *)v19 + 9) & 0xC0) != 0x40 )
          result = (*(__int64 (__fastcall **)(__int64 *, char **))(*v19 + 40))(v19, a2);
      }
    }
LABEL_24:
    *((_DWORD *)a2 + 6) = v4;
    *((_DWORD *)a2 + 7) = v5;
    return result;
  }
  a2[1] = (char *)v3;
  goto LABEL_24;
}


// Address: 0x24888 | Function: sub_24888
void __fastcall __noreturn sub_24888(__int64 a1)
{
  __int64 v1; // x19
  int v2; // w22
  int v3; // w23

  *(_DWORD *)(v1 + 24) = v2;
  *(_DWORD *)(v1 + 28) = v3;
  sub_2E950(a1);
}


// Address: 0x24890 | Function: sub_24890
void __fastcall __noreturn sub_24890(__int64 a1)
{
  __int64 v1; // x19
  int v2; // w22
  int v3; // w23

  *(_DWORD *)(v1 + 24) = v2;
  *(_DWORD *)(v1 + 28) = v3;
  sub_2E950(a1);
}


// Address: 0x24898 | Function: sub_24898
void sub_24898()
{
  sub_13E30();
}


// Address: 0x248A4 | Function: sub_248A4
__int64 __fastcall sub_248A4(__int64 a1, char **a2)
{
  char *v2; // x8
  unsigned __int64 v3; // x10
  int v5; // w9
  char *v6; // x0
  bool v8; // zf
  char *v9; // x9
  unsigned __int64 v10; // x8
  size_t v11; // x1
  __int64 v12; // x21
  char *v13; // x8
  unsigned __int64 v14; // x10
  char *v15; // x0
  char *v16; // x9
  unsigned __int64 v17; // x8
  size_t v18; // x1
  unsigned __int64 v19; // x8
  size_t v20; // x1
  __int64 v21; // x21
  __int64 v22; // x21
  char *v23; // x8
  unsigned __int64 v24; // x9
  char *v25; // x0
  unsigned __int64 v26; // x9
  size_t v27; // x8
  size_t v28; // x1
  char *v29; // x8
  __int64 result; // x0

  v2 = a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = *(unsigned __int8 *)(a1 + 32);
  v6 = *a2;
  v8 = v5 == 1;
  v9 = v2 + 1;
  if ( v8 )
  {
    if ( (unsigned __int64)v9 > v3 )
    {
      v10 = (unsigned __int64)(v2 + 993);
      if ( 2 * v3 <= v10 )
        v11 = v10;
      else
        v11 = 2 * v3;
      a2[2] = (char *)v11;
      v6 = (char *)realloc(v6, v11);
      *a2 = v6;
      if ( v6 == nullptr )
        abort();
      v2 = a2[1];
      v9 = v2 + 1;
    }
    a2[1] = v9;
    v2[(_QWORD)v6] = 91;
    v12 = *(_QWORD *)(a1 + 16);
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v12 + 32LL))(v12, a2);
    if ( (*(_WORD *)(v12 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v12 + 40LL))(v12, a2);
    v13 = a2[1];
    v14 = (unsigned __int64)a2[2];
    v15 = *a2;
    v16 = v13 + 1;
    if ( (unsigned __int64)(v13 + 1) > v14 )
    {
      v17 = (unsigned __int64)(v13 + 993);
      if ( 2 * v14 <= v17 )
        v18 = v17;
      else
        v18 = 2 * v14;
      a2[2] = (char *)v18;
      v15 = (char *)realloc(v15, v18);
      *a2 = v15;
      if ( v15 == nullptr )
        abort();
      v13 = a2[1];
      v16 = v13 + 1;
    }
    a2[1] = v16;
    v13[(_QWORD)v15] = 93;
  }
  else
  {
    if ( (unsigned __int64)v9 > v3 )
    {
      v19 = (unsigned __int64)(v2 + 993);
      if ( 2 * v3 <= v19 )
        v20 = v19;
      else
        v20 = 2 * v3;
      a2[2] = (char *)v20;
      v6 = (char *)realloc(v6, v20);
      *a2 = v6;
      if ( v6 == nullptr )
        abort();
      v2 = a2[1];
      v9 = v2 + 1;
    }
    a2[1] = v9;
    v2[(_QWORD)v6] = 46;
    v21 = *(_QWORD *)(a1 + 16);
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v21 + 32LL))(v21, a2);
    if ( (*(_WORD *)(v21 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v21 + 40LL))(v21, a2);
  }
  v22 = *(_QWORD *)(a1 + 24);
  if ( (unsigned int)*(unsigned __int8 *)(v22 + 8) - 81 >= 2 )
  {
    v23 = a2[1];
    v24 = (unsigned __int64)a2[2];
    v25 = *a2;
    if ( (unsigned __int64)(v23 + 3) > v24 )
    {
      v26 = 2 * v24;
      v27 = (size_t)(v23 + 995);
      if ( v26 <= v27 )
        v28 = v27;
      else
        v28 = v26;
      a2[2] = (char *)v28;
      v25 = (char *)realloc(v25, v28);
      *a2 = v25;
      if ( v25 == nullptr )
        abort();
      v23 = a2[1];
    }
    v29 = &v23[(_QWORD)v25];
    v29[2] = 32;
    *(_WORD *)v29 = 15648;
    v22 = *(_QWORD *)(a1 + 24);
    a2[1] += 3;
  }
  result = (*(__int64 (__fastcall **)(__int64, char **))(*(_QWORD *)v22 + 32LL))(v22, a2);
  if ( (*(_WORD *)(v22 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64, char **))(*(_QWORD *)v22 + 40LL))(v22, a2);
  return result;
}


// Address: 0x24AF0 | Function: sub_24AF0
void sub_24AF0()
{
  sub_13E30();
}


// Address: 0x24AFC | Function: sub_24AFC
__int64 __fastcall sub_24AFC(_QWORD *a1, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x11
  char *v5; // x8
  void *v7; // x10
  unsigned __int64 v8; // x9
  void *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  __int64 v12; // x21
  char *v13; // x8
  unsigned __int64 v14; // x9
  char *v15; // x0
  unsigned __int64 v16; // x9
  size_t v17; // x8
  size_t v18; // x1
  char *v19; // x8
  __int64 *v20; // x21
  __int64 v21; // x9
  char *v22; // x8
  unsigned __int64 v23; // x10
  void *v24; // x0
  void *v25; // x9
  unsigned __int64 v26; // x8
  size_t v27; // x1
  __int64 v28; // x21
  char *v29; // x8
  unsigned __int64 v30; // x9
  char *v31; // x0
  unsigned __int64 v32; // x9
  size_t v33; // x8
  size_t v34; // x1
  char *v35; // x8
  __int64 result; // x0

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  v7 = v2 + 1;
  if ( (unsigned __int64)(v2 + 1) > v3 )
  {
    v8 = (unsigned __int64)(v2 + 993);
    v9 = *a2;
    if ( 2 * v3 <= v8 )
      v10 = v8;
    else
      v10 = 2 * v3;
    a2[2] = (void *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = v11;
    v7 = v2 + 1;
  }
  a2[1] = v7;
  v2[(_QWORD)v5] = 91;
  v12 = a1[2];
  (*(void (__fastcall **)(__int64, void **))(*(_QWORD *)v12 + 32LL))(v12, a2);
  if ( (*(_WORD *)(v12 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, void **))(*(_QWORD *)v12 + 40LL))(v12, a2);
  v13 = (char *)a2[1];
  v14 = (unsigned __int64)a2[2];
  v15 = (char *)*a2;
  if ( (unsigned __int64)(v13 + 5) > v14 )
  {
    v16 = 2 * v14;
    v17 = (size_t)(v13 + 997);
    if ( v16 <= v17 )
      v18 = v17;
    else
      v18 = v16;
    a2[2] = (void *)v18;
    v15 = (char *)realloc(v15, v18);
    *a2 = v15;
    if ( v15 == nullptr )
      abort();
    v13 = (char *)a2[1];
  }
  v19 = &v13[(_QWORD)v15];
  v19[4] = 32;
  *(_DWORD *)v19 = 774778400;
  v20 = (__int64 *)a1[3];
  v21 = *v20;
  a2[1] = (char *)a2[1] + 5;
  (*(void (__fastcall **)(__int64 *, void **))(v21 + 32))(v20, a2);
  if ( (*(_WORD *)((_BYTE *)v20 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64 *, void **))(*v20 + 40))(v20, a2);
  v22 = (char *)a2[1];
  v23 = (unsigned __int64)a2[2];
  v24 = *a2;
  v25 = v22 + 1;
  if ( (unsigned __int64)(v22 + 1) > v23 )
  {
    v26 = (unsigned __int64)(v22 + 993);
    if ( 2 * v23 <= v26 )
      v27 = v26;
    else
      v27 = 2 * v23;
    a2[2] = (void *)v27;
    v24 = realloc(v24, v27);
    *a2 = v24;
    if ( v24 == nullptr )
      abort();
    v22 = (char *)a2[1];
    v25 = v22 + 1;
  }
  a2[1] = v25;
  v22[(_QWORD)v24] = 93;
  v28 = a1[4];
  if ( (unsigned int)*(unsigned __int8 *)(v28 + 8) - 81 >= 2 )
  {
    v29 = (char *)a2[1];
    v30 = (unsigned __int64)a2[2];
    v31 = (char *)*a2;
    if ( (unsigned __int64)(v29 + 3) > v30 )
    {
      v32 = 2 * v30;
      v33 = (size_t)(v29 + 995);
      if ( v32 <= v33 )
        v34 = v33;
      else
        v34 = v32;
      a2[2] = (void *)v34;
      v31 = (char *)realloc(v31, v34);
      *a2 = v31;
      if ( v31 == nullptr )
        abort();
      v29 = (char *)a2[1];
    }
    v35 = &v29[(_QWORD)v31];
    v35[2] = 32;
    *(_WORD *)v35 = 15648;
    v28 = a1[4];
    a2[1] = (char *)a2[1] + 3;
  }
  result = (*(__int64 (__fastcall **)(__int64, void **))(*(_QWORD *)v28 + 32LL))(v28, a2);
  if ( (*(_WORD *)(v28 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64, void **))(*(_QWORD *)v28 + 40LL))(v28, a2);
  return result;
}


// Address: 0x24D60 | Function: sub_24D60
void sub_24D60()
{
  sub_13E30();
}


// Address: 0x24D6C | Function: sub_24D6C
void *__fastcall sub_24D6C(__int64 a1, void **a2)
{
  __int64 v2; // x21
  char *v5; // x8
  unsigned __int64 v6; // x10
  void *v7; // x0
  void *v8; // x9
  unsigned __int64 v9; // x8
  size_t v10; // x1
  char *v11; // x8
  unsigned __int64 v12; // x10
  void *result; // x0
  void *v14; // x9
  unsigned __int64 v15; // x8
  size_t v16; // x1

  v2 = *(_QWORD *)(a1 + 16);
  if ( v2 != 0 )
  {
    (*(void (__fastcall **)(_QWORD, void **))(*(_QWORD *)v2 + 32LL))(*(_QWORD *)(a1 + 16), a2);
    if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64, void **))(*(_QWORD *)v2 + 40LL))(v2, a2);
  }
  v5 = (char *)a2[1];
  v6 = (unsigned __int64)a2[2];
  v7 = *a2;
  v8 = v5 + 1;
  if ( (unsigned __int64)(v5 + 1) > v6 )
  {
    v9 = (unsigned __int64)(v5 + 993);
    if ( 2 * v6 <= v9 )
      v10 = v9;
    else
      v10 = 2 * v6;
    a2[2] = (void *)v10;
    v7 = realloc(v7, v10);
    *a2 = v7;
    if ( v7 == nullptr )
      abort();
    v5 = (char *)a2[1];
    v8 = v5 + 1;
  }
  a2[1] = v8;
  v5[(_QWORD)v7] = 123;
  sub_1F824((_QWORD *)(a1 + 24), (__int64)a2);
  v11 = (char *)a2[1];
  v12 = (unsigned __int64)a2[2];
  result = *a2;
  v14 = v11 + 1;
  if ( (unsigned __int64)(v11 + 1) > v12 )
  {
    v15 = (unsigned __int64)(v11 + 993);
    if ( 2 * v12 <= v15 )
      v16 = v15;
    else
      v16 = 2 * v12;
    a2[2] = (void *)v16;
    result = realloc(result, v16);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v11 = (char *)a2[1];
    v14 = v11 + 1;
  }
  a2[1] = v14;
  v11[(_QWORD)result] = 125;
  return result;
}


// Address: 0x24E80 | Function: sub_24E80
void sub_24E80()
{
  sub_13E30();
}


// Address: 0x24E8C | Function: sub_24E8C
void *__fastcall sub_24E8C(__int64 a1, __int64 a2)
{
  __int64 v2; // x8
  unsigned __int64 v3; // x10
  void *v5; // x0
  __int64 v7; // x9
  unsigned __int64 v8; // x8
  size_t v9; // x1
  __int64 v10; // x21
  __int64 v11; // x8
  unsigned __int64 v12; // x10
  void *v13; // x0
  __int64 v14; // x9
  unsigned __int64 v15; // x8
  size_t v16; // x1
  __int64 v17; // x8
  unsigned __int64 v18; // x10
  void *v19; // x0
  __int64 v20; // x9
  unsigned __int64 v21; // x8
  size_t v22; // x1
  __int64 v23; // x20
  __int64 v24; // x8
  unsigned __int64 v25; // x10
  void *result; // x0
  __int64 v27; // x9
  unsigned __int64 v28; // x8
  size_t v29; // x1

  v2 = *(_QWORD *)(a2 + 8);
  v3 = *(_QWORD *)(a2 + 16);
  v5 = *(void **)a2;
  v7 = v2 + 1;
  ++*(_DWORD *)(a2 + 32);
  if ( v2 + 1 > v3 )
  {
    v8 = v2 + 993;
    if ( 2 * v3 <= v8 )
      v9 = v8;
    else
      v9 = 2 * v3;
    *(_QWORD *)(a2 + 16) = v9;
    v5 = realloc(v5, v9);
    *(_QWORD *)a2 = v5;
    if ( v5 == nullptr )
      abort();
    v2 = *(_QWORD *)(a2 + 8);
    v7 = v2 + 1;
  }
  *(_QWORD *)(a2 + 8) = v7;
  *((_BYTE *)v5 + v2) = 40;
  v10 = *(_QWORD *)(a1 + 16);
  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v10 + 32LL))(v10, a2);
  if ( (*(_WORD *)(v10 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v10 + 40LL))(v10, a2);
  v11 = *(_QWORD *)(a2 + 8);
  v12 = *(_QWORD *)(a2 + 16);
  v13 = *(void **)a2;
  v14 = v11 + 1;
  --*(_DWORD *)(a2 + 32);
  if ( v11 + 1 > v12 )
  {
    v15 = v11 + 993;
    if ( 2 * v12 <= v15 )
      v16 = v15;
    else
      v16 = 2 * v12;
    *(_QWORD *)(a2 + 16) = v16;
    v13 = realloc(v13, v16);
    *(_QWORD *)a2 = v13;
    if ( v13 == nullptr )
      abort();
    v11 = *(_QWORD *)(a2 + 8);
    v14 = v11 + 1;
  }
  *(_QWORD *)(a2 + 8) = v14;
  *((_BYTE *)v13 + v11) = 41;
  v17 = *(_QWORD *)(a2 + 8);
  v18 = *(_QWORD *)(a2 + 16);
  v19 = *(void **)a2;
  v20 = v17 + 1;
  ++*(_DWORD *)(a2 + 32);
  if ( v17 + 1 > v18 )
  {
    v21 = v17 + 993;
    if ( 2 * v18 <= v21 )
      v22 = v21;
    else
      v22 = 2 * v18;
    *(_QWORD *)(a2 + 16) = v22;
    v19 = realloc(v19, v22);
    *(_QWORD *)a2 = v19;
    if ( v19 == nullptr )
      abort();
    v17 = *(_QWORD *)(a2 + 8);
    v20 = v17 + 1;
  }
  *(_QWORD *)(a2 + 8) = v20;
  *((_BYTE *)v19 + v17) = 40;
  v23 = *(_QWORD *)(a1 + 24);
  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v23 + 32LL))(v23, a2);
  if ( (*(_WORD *)(v23 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v23 + 40LL))(v23, a2);
  v24 = *(_QWORD *)(a2 + 8);
  v25 = *(_QWORD *)(a2 + 16);
  result = *(void **)a2;
  v27 = v24 + 1;
  --*(_DWORD *)(a2 + 32);
  if ( v24 + 1 > v25 )
  {
    v28 = v24 + 993;
    if ( 2 * v25 <= v28 )
      v29 = v28;
    else
      v29 = 2 * v25;
    *(_QWORD *)(a2 + 16) = v29;
    result = realloc(result, v29);
    *(_QWORD *)a2 = result;
    if ( result == nullptr )
      abort();
    v24 = *(_QWORD *)(a2 + 8);
    v27 = v24 + 1;
  }
  *(_QWORD *)(a2 + 8) = v27;
  *((_BYTE *)result + v24) = 41;
  return result;
}


// Address: 0x25094 | Function: sub_25094
void sub_25094()
{
  sub_13E30();
}


// Address: 0x250A0 | Function: sub_250A0
char *__fastcall sub_250A0(__int64 a1, char **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  char *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  char *v12; // x9
  char v13; // w10
  char *v14; // x8
  unsigned __int64 v15; // x11
  char *v16; // x10
  char *v17; // x0
  unsigned __int64 v18; // x9
  size_t v19; // x1
  __int64 v20; // x21
  char *v21; // x8
  unsigned __int64 v22; // x10
  void *v23; // x0
  char *v24; // x9
  unsigned __int64 v25; // x8
  size_t v26; // x1
  char *v27; // x8
  unsigned __int64 v28; // x9
  char *v29; // x0
  unsigned __int64 v30; // x9
  size_t v31; // x8
  size_t v32; // x1
  char *v33; // x8
  char *v34; // x8
  unsigned __int64 v35; // x9
  char *v36; // x0
  unsigned __int64 v37; // x9
  size_t v38; // x8
  size_t v39; // x1
  __int64 *v40; // x20
  __int64 v41; // x9
  char *v42; // x8
  unsigned __int64 v43; // x10
  char *result; // x0
  char *v45; // x9
  unsigned __int64 v46; // x8
  size_t v47; // x1

  v2 = a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = *a2;
  if ( (unsigned __int64)(v2 + 1) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 993);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (char *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = a2[1];
    v5 = v11;
  }
  v2[(_QWORD)v5] = 32;
  v12 = a2[1];
  v13 = *(_BYTE *)(a1 + 24);
  v14 = v12 + 1;
  a2[1] = v12 + 1;
  if ( (v13 & 1) != 0 || *(_QWORD *)(a1 + 32) != 0 )
  {
    v15 = (unsigned __int64)a2[2];
    v16 = v12 + 2;
    v17 = *a2;
    ++*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v12 + 2) > v15 )
    {
      v18 = (unsigned __int64)(v12 + 994);
      if ( 2 * v15 <= v18 )
        v19 = v18;
      else
        v19 = 2 * v15;
      a2[2] = (char *)v19;
      v17 = (char *)realloc(v17, v19);
      *a2 = v17;
      if ( v17 == nullptr )
        abort();
      v14 = a2[1];
      v16 = v14 + 1;
    }
    a2[1] = v16;
    v14[(_QWORD)v17] = 123;
  }
  v20 = *(_QWORD *)(a1 + 16);
  (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v20 + 32LL))(v20, a2);
  if ( (*(_WORD *)(v20 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v20 + 40LL))(v20, a2);
  if ( (*(_BYTE *)(a1 + 24) & 1) != 0 || *(_QWORD *)(a1 + 32) != 0 )
  {
    v21 = a2[1];
    v22 = (unsigned __int64)a2[2];
    v23 = *a2;
    v24 = v21 + 1;
    --*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v21 + 1) > v22 )
    {
      v25 = (unsigned __int64)(v21 + 993);
      if ( 2 * v22 <= v25 )
        v26 = v25;
      else
        v26 = 2 * v22;
      a2[2] = (char *)v26;
      v23 = realloc(v23, v26);
      *a2 = (char *)v23;
      if ( v23 == nullptr )
        abort();
      v21 = a2[1];
      v24 = v21 + 1;
    }
    a2[1] = v24;
    v21[(_QWORD)v23] = 125;
    if ( (*(_BYTE *)(a1 + 24) & 1) == 0 )
    {
LABEL_21:
      if ( *(_QWORD *)(a1 + 32) == 0 )
        goto LABEL_45;
      goto LABEL_37;
    }
  }
  else if ( *(_BYTE *)(a1 + 24) == 0 )
  {
    goto LABEL_21;
  }
  v27 = a2[1];
  v28 = (unsigned __int64)a2[2];
  v29 = *a2;
  if ( (unsigned __int64)(v27 + 9) > v28 )
  {
    v30 = 2 * v28;
    v31 = (size_t)(v27 + 1001);
    if ( v30 <= v31 )
      v32 = v31;
    else
      v32 = v30;
    a2[2] = (char *)v32;
    v29 = (char *)realloc(v29, v32);
    *a2 = v29;
    if ( v29 == nullptr )
      abort();
    v27 = a2[1];
  }
  v33 = &v27[(_QWORD)v29];
  v33[8] = 116;
  *(_QWORD *)v33 = *(_QWORD *)" noexcept";
  a2[1] += 9;
  if ( *(_QWORD *)(a1 + 32) != 0 )
  {
LABEL_37:
    v34 = a2[1];
    v35 = (unsigned __int64)a2[2];
    v36 = *a2;
    if ( (unsigned __int64)(v34 + 4) > v35 )
    {
      v37 = 2 * v35;
      v38 = (size_t)(v34 + 996);
      if ( v37 <= v38 )
        v39 = v38;
      else
        v39 = v37;
      a2[2] = (char *)v39;
      v36 = (char *)realloc(v36, v39);
      *a2 = v36;
      if ( v36 == nullptr )
        abort();
      v34 = a2[1];
    }
    *(_DWORD *)&v34[(_QWORD)v36] = 540945696;
    v40 = *(__int64 **)(a1 + 32);
    v41 = *v40;
    a2[1] += 4;
    (*(void (__fastcall **)(__int64 *, char **))(v41 + 32))(v40, a2);
    if ( (*(_WORD *)((_BYTE *)v40 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, char **))(*v40 + 40))(v40, a2);
  }
LABEL_45:
  v42 = a2[1];
  v43 = (unsigned __int64)a2[2];
  result = *a2;
  v45 = v42 + 1;
  if ( (unsigned __int64)(v42 + 1) > v43 )
  {
    v46 = (unsigned __int64)(v42 + 993);
    if ( 2 * v43 <= v46 )
      v47 = v46;
    else
      v47 = 2 * v43;
    a2[2] = (char *)v47;
    result = (char *)realloc(result, v47);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v42 = a2[1];
    v45 = v42 + 1;
  }
  a2[1] = v45;
  v42[(_QWORD)result] = 59;
  return result;
}


// Address: 0x25394 | Function: sub_25394
void sub_25394()
{
  sub_13E30();
}


// Address: 0x253A0 | Function: sub_253A0
void *__fastcall sub_253A0(__int64 a1, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  void *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  char *v12; // x8
  __int64 *v13; // x20
  __int64 v14; // x9
  char *v15; // x8
  unsigned __int64 v16; // x10
  void *result; // x0
  void *v18; // x9
  unsigned __int64 v19; // x8
  size_t v20; // x1

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  if ( (unsigned __int64)(v2 + 10) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 1002);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (void *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = v11;
  }
  v12 = &v2[(_QWORD)v5];
  *((_WORD *)v12 + 4) = 8293;
  *(_QWORD *)v12 = *(_QWORD *)" typename ";
  v13 = *(__int64 **)(a1 + 16);
  v14 = *v13;
  a2[1] = (char *)a2[1] + 10;
  (*(void (__fastcall **)(__int64 *, void **))(v14 + 32))(v13, a2);
  if ( (*(_WORD *)((_BYTE *)v13 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64 *, void **))(*v13 + 40))(v13, a2);
  v15 = (char *)a2[1];
  v16 = (unsigned __int64)a2[2];
  result = *a2;
  v18 = v15 + 1;
  if ( (unsigned __int64)(v15 + 1) > v16 )
  {
    v19 = (unsigned __int64)(v15 + 993);
    if ( 2 * v16 <= v19 )
      v20 = v19;
    else
      v20 = 2 * v16;
    a2[2] = (void *)v20;
    result = realloc(result, v20);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v15 = (char *)a2[1];
    v18 = v15 + 1;
  }
  a2[1] = v18;
  v15[(_QWORD)result] = 59;
  return result;
}


// Address: 0x254BC | Function: sub_254BC
void sub_254BC()
{
  sub_13E30();
}


// Address: 0x254C8 | Function: sub_254C8
void *__fastcall sub_254C8(__int64 a1, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  void *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  char *v12; // x8
  __int64 *v13; // x20
  __int64 v14; // x9
  char *v15; // x8
  unsigned __int64 v16; // x10
  void *result; // x0
  void *v18; // x9
  unsigned __int64 v19; // x8
  size_t v20; // x1

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  if ( (unsigned __int64)(v2 + 10) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 1002);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (void *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = v11;
  }
  v12 = &v2[(_QWORD)v5];
  *((_WORD *)v12 + 4) = 8307;
  *(_QWORD *)v12 = *(_QWORD *)" requires ";
  v13 = *(__int64 **)(a1 + 16);
  v14 = *v13;
  a2[1] = (char *)a2[1] + 10;
  (*(void (__fastcall **)(__int64 *, void **))(v14 + 32))(v13, a2);
  if ( (*(_WORD *)((_BYTE *)v13 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64 *, void **))(*v13 + 40))(v13, a2);
  v15 = (char *)a2[1];
  v16 = (unsigned __int64)a2[2];
  result = *a2;
  v18 = v15 + 1;
  if ( (unsigned __int64)(v15 + 1) > v16 )
  {
    v19 = (unsigned __int64)(v15 + 993);
    if ( 2 * v16 <= v19 )
      v20 = v19;
    else
      v20 = 2 * v16;
    a2[2] = (void *)v20;
    result = realloc(result, v20);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v15 = (char *)a2[1];
    v18 = v15 + 1;
  }
  a2[1] = v18;
  v15[(_QWORD)result] = 59;
  return result;
}


// Address: 0x255E4 | Function: sub_255E4
void sub_255E4()
{
  sub_13E30();
}


// Address: 0x255F0 | Function: sub_255F0
char *__fastcall sub_255F0(_QWORD *a1, __int64 a2)
{
  __int64 v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  char *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  __int64 v12; // x9
  __int64 v13; // x10
  __int64 v14; // x8
  unsigned __int64 v15; // x11
  __int64 v16; // x10
  char *v17; // x0
  unsigned __int64 v18; // x9
  size_t v19; // x1
  __int64 v20; // x8
  unsigned __int64 v21; // x10
  char *v22; // x0
  __int64 v23; // x9
  unsigned __int64 v24; // x8
  size_t v25; // x1
  __int64 v26; // x8
  unsigned __int64 v27; // x10
  char *v28; // x0
  __int64 v29; // x9
  unsigned __int64 v30; // x8
  size_t v31; // x1
  unsigned __int64 v32; // x10
  __int64 v33; // x9
  char *v34; // x0
  unsigned __int64 v35; // x8
  size_t v36; // x1
  __int64 v37; // x8
  unsigned __int64 v38; // x10
  char *v39; // x0
  __int64 v40; // x9
  unsigned __int64 v41; // x8
  size_t v42; // x1
  __int64 v43; // x8
  _QWORD *v44; // x21
  __int64 v45; // x22
  __int64 v46; // x20
  __int64 v47; // x8
  unsigned __int64 v48; // x10
  char *v49; // x0
  __int64 v50; // x9
  unsigned __int64 v51; // x8
  size_t v52; // x1
  __int64 v53; // x8
  unsigned __int64 v54; // x10
  char *result; // x0
  __int64 v56; // x9
  unsigned __int64 v57; // x8
  size_t v58; // x1

  v2 = *(_QWORD *)(a2 + 8);
  v3 = *(_QWORD *)(a2 + 16);
  v5 = *(char **)a2;
  if ( v2 + 8 > v3 )
  {
    v7 = 2 * v3;
    v8 = v2 + 1000;
    v9 = *(char **)a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    *(_QWORD *)(a2 + 16) = v10;
    v11 = (char *)realloc(v9, v10);
    *(_QWORD *)a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = *(_QWORD *)(a2 + 8);
    v5 = v11;
  }
  *(_QWORD *)&v5[v2] = 0x7365726975716572LL;
  v12 = *(_QWORD *)(a2 + 8);
  v13 = a1[3];
  v14 = v12 + 8;
  *(_QWORD *)(a2 + 8) = v12 + 8;
  if ( v13 != 0 )
  {
    v15 = *(_QWORD *)(a2 + 16);
    v16 = v12 + 9;
    v17 = *(char **)a2;
    if ( v12 + 9 > v15 )
    {
      v18 = v12 + 1001;
      if ( 2 * v15 <= v18 )
        v19 = v18;
      else
        v19 = 2 * v15;
      *(_QWORD *)(a2 + 16) = v19;
      v17 = (char *)realloc(v17, v19);
      *(_QWORD *)a2 = v17;
      if ( v17 == nullptr )
        abort();
      v14 = *(_QWORD *)(a2 + 8);
      v16 = v14 + 1;
    }
    *(_QWORD *)(a2 + 8) = v16;
    v17[v14] = 32;
    v20 = *(_QWORD *)(a2 + 8);
    v21 = *(_QWORD *)(a2 + 16);
    v22 = *(char **)a2;
    v23 = v20 + 1;
    ++*(_DWORD *)(a2 + 32);
    if ( v20 + 1 > v21 )
    {
      v24 = v20 + 993;
      if ( 2 * v21 <= v24 )
        v25 = v24;
      else
        v25 = 2 * v21;
      *(_QWORD *)(a2 + 16) = v25;
      v22 = (char *)realloc(v22, v25);
      *(_QWORD *)a2 = v22;
      if ( v22 == nullptr )
        abort();
      v20 = *(_QWORD *)(a2 + 8);
      v23 = v20 + 1;
    }
    *(_QWORD *)(a2 + 8) = v23;
    v22[v20] = 40;
    sub_1F824(a1 + 2, a2);
    v26 = *(_QWORD *)(a2 + 8);
    v27 = *(_QWORD *)(a2 + 16);
    v28 = *(char **)a2;
    v29 = v26 + 1;
    --*(_DWORD *)(a2 + 32);
    if ( v26 + 1 > v27 )
    {
      v30 = v26 + 993;
      if ( 2 * v27 <= v30 )
        v31 = v30;
      else
        v31 = 2 * v27;
      *(_QWORD *)(a2 + 16) = v31;
      v28 = (char *)realloc(v28, v31);
      *(_QWORD *)a2 = v28;
      if ( v28 == nullptr )
        abort();
      v26 = *(_QWORD *)(a2 + 8);
      v29 = v26 + 1;
    }
    *(_QWORD *)(a2 + 8) = v29;
    v28[v26] = 41;
    v14 = *(_QWORD *)(a2 + 8);
  }
  v32 = *(_QWORD *)(a2 + 16);
  v33 = v14 + 1;
  v34 = *(char **)a2;
  if ( v14 + 1 > v32 )
  {
    v35 = v14 + 993;
    if ( 2 * v32 <= v35 )
      v36 = v35;
    else
      v36 = 2 * v32;
    *(_QWORD *)(a2 + 16) = v36;
    v34 = (char *)realloc(v34, v36);
    *(_QWORD *)a2 = v34;
    if ( v34 == nullptr )
      abort();
    v14 = *(_QWORD *)(a2 + 8);
    v33 = v14 + 1;
  }
  *(_QWORD *)(a2 + 8) = v33;
  v34[v14] = 32;
  v37 = *(_QWORD *)(a2 + 8);
  v38 = *(_QWORD *)(a2 + 16);
  v39 = *(char **)a2;
  v40 = v37 + 1;
  ++*(_DWORD *)(a2 + 32);
  if ( v37 + 1 > v38 )
  {
    v41 = v37 + 993;
    if ( 2 * v38 <= v41 )
      v42 = v41;
    else
      v42 = 2 * v38;
    *(_QWORD *)(a2 + 16) = v42;
    v39 = (char *)realloc(v39, v42);
    *(_QWORD *)a2 = v39;
    if ( v39 == nullptr )
      abort();
    v37 = *(_QWORD *)(a2 + 8);
    v40 = v37 + 1;
  }
  *(_QWORD *)(a2 + 8) = v40;
  v39[v37] = 123;
  v43 = a1[5];
  if ( v43 != 0 )
  {
    v44 = (_QWORD *)a1[4];
    v45 = 8 * v43;
    do
    {
      v46 = *v44;
      (*(void (__fastcall **)(_QWORD, __int64))(*(_QWORD *)*v44 + 32LL))(*v44, a2);
      if ( (*(_WORD *)(v46 + 9) & 0xC0) != 0x40 )
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v46 + 40LL))(v46, a2);
      v45 -= 8;
      ++v44;
    }
    while ( v45 != 0 );
  }
  v47 = *(_QWORD *)(a2 + 8);
  v48 = *(_QWORD *)(a2 + 16);
  v49 = *(char **)a2;
  v50 = v47 + 1;
  if ( v47 + 1 > v48 )
  {
    v51 = v47 + 993;
    if ( 2 * v48 <= v51 )
      v52 = v51;
    else
      v52 = 2 * v48;
    *(_QWORD *)(a2 + 16) = v52;
    v49 = (char *)realloc(v49, v52);
    *(_QWORD *)a2 = v49;
    if ( v49 == nullptr )
      abort();
    v47 = *(_QWORD *)(a2 + 8);
    v50 = v47 + 1;
  }
  *(_QWORD *)(a2 + 8) = v50;
  v49[v47] = 32;
  v53 = *(_QWORD *)(a2 + 8);
  v54 = *(_QWORD *)(a2 + 16);
  result = *(char **)a2;
  v56 = v53 + 1;
  --*(_DWORD *)(a2 + 32);
  if ( v53 + 1 > v54 )
  {
    v57 = v53 + 993;
    if ( 2 * v54 <= v57 )
      v58 = v57;
    else
      v58 = 2 * v54;
    *(_QWORD *)(a2 + 16) = v58;
    result = (char *)realloc(result, v58);
    *(_QWORD *)a2 = result;
    if ( result == nullptr )
      abort();
    v53 = *(_QWORD *)(a2 + 8);
    v56 = v53 + 1;
  }
  *(_QWORD *)(a2 + 8) = v56;
  result[v53] = 125;
  return result;
}


// Address: 0x25940 | Function: sub_25940
void sub_25940()
{
  sub_13E30();
}


// Address: 0x2594C | Function: sub_2594C
char *__fastcall sub_2594C(_QWORD *a1, char **a2)
{
  __int64 v2; // x21
  char *v5; // x8
  unsigned __int64 v6; // x9
  char *v7; // x0
  unsigned __int64 v8; // x9
  size_t v9; // x8
  size_t v10; // x1
  __int64 *v11; // x21
  __int64 v12; // x9
  char *v13; // x8
  unsigned __int64 v14; // x9
  char *v15; // x0
  unsigned __int64 v16; // x9
  size_t v17; // x8
  size_t v18; // x1
  char *v19; // x8
  char *v20; // x9
  char *v21; // x8
  size_t v22; // x21
  _BYTE *v23; // x22
  unsigned __int64 v24; // x10
  char *v25; // x0
  unsigned __int64 v26; // x9
  size_t v27; // x1
  char *v28; // x9
  __int64 v29; // x10
  size_t v30; // x8
  unsigned __int64 v31; // x11
  unsigned __int64 v32; // x9
  __int64 v33; // x20
  char *v34; // x0
  unsigned __int64 v35; // x9
  size_t v36; // x1
  char *v37; // x0
  const void *v38; // x1
  unsigned __int64 v39; // x10
  char *v40; // x0
  unsigned __int64 v41; // x9
  size_t v42; // x1
  size_t v43; // x1
  unsigned __int64 v44; // x9
  char *result; // x0
  unsigned __int64 v46; // x9
  size_t v47; // x8
  size_t v48; // x1

  v2 = a1[3];
  (*(void (__fastcall **)(__int64))(*(_QWORD *)v2 + 32LL))(v2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v2 + 40LL))(v2, a2);
  v5 = a2[1];
  v6 = (unsigned __int64)a2[2];
  v7 = *a2;
  if ( (unsigned __int64)(v5 + 2) > v6 )
  {
    v8 = 2 * v6;
    v9 = (size_t)(v5 + 994);
    if ( v8 <= v9 )
      v10 = v9;
    else
      v10 = v8;
    a2[2] = (char *)v10;
    v7 = (char *)realloc(v7, v10);
    *a2 = v7;
    if ( v7 == nullptr )
      abort();
    v5 = a2[1];
  }
  *(_WORD *)&v5[(_QWORD)v7] = 15406;
  v11 = (__int64 *)a1[2];
  v12 = *v11;
  a2[1] += 2;
  (*(void (__fastcall **)(__int64 *, char **))(v12 + 32))(v11, a2);
  if ( (*(_WORD *)((_BYTE *)v11 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64 *, char **))(*v11 + 40))(v11, a2);
  v13 = a2[1];
  v14 = (unsigned __int64)a2[2];
  v15 = *a2;
  if ( (unsigned __int64)(v13 + 11) > v14 )
  {
    v16 = 2 * v14;
    v17 = (size_t)(v13 + 1003);
    if ( v16 <= v17 )
      v18 = v17;
    else
      v18 = v16;
    a2[2] = (char *)v18;
    v15 = (char *)realloc(v15, v18);
    *a2 = v15;
    if ( v15 == nullptr )
      abort();
    v13 = a2[1];
  }
  v19 = &v13[(_QWORD)v15];
  *(_QWORD *)v19 = *(_QWORD *)" at offset ";
  *(_DWORD *)(v19 + 7) = 544499059;
  v20 = a2[1];
  v21 = v20 + 11;
  a2[1] = v20 + 11;
  v22 = a1[5];
  if ( v22 == 0 )
  {
    v39 = (unsigned __int64)a2[2];
    v40 = *a2;
    if ( (unsigned __int64)(v20 + 12) > v39 )
    {
      v41 = (unsigned __int64)(v20 + 1004);
      if ( 2 * v39 <= v41 )
        v42 = v41;
      else
        v42 = 2 * v39;
      a2[2] = (char *)v42;
      v40 = (char *)realloc(v40, v42);
      *a2 = v40;
      if ( v40 == nullptr )
        abort();
      v21 = a2[1];
    }
    v21[(_QWORD)v40] = 48;
    v22 = 1;
    goto LABEL_48;
  }
  v23 = (_BYTE *)a1[4];
  v24 = (unsigned __int64)a2[2];
  v25 = *a2;
  if ( *v23 != 110 )
  {
    if ( (unsigned __int64)&v21[v22] > v24 )
    {
      if ( 2 * v24 <= (unsigned __int64)&v21[v22 + 992] )
        v43 = (size_t)&v21[v22 + 992];
      else
        v43 = 2 * v24;
      a2[2] = (char *)v43;
      v25 = (char *)realloc(v25, v43);
      *a2 = v25;
      if ( v25 == nullptr )
        abort();
      v21 = a2[1];
    }
    v37 = &v21[(_QWORD)v25];
    v38 = v23;
    goto LABEL_47;
  }
  if ( (unsigned __int64)(v20 + 12) > v24 )
  {
    v26 = (unsigned __int64)(v20 + 1004);
    if ( 2 * v24 <= v26 )
      v27 = v26;
    else
      v27 = 2 * v24;
    a2[2] = (char *)v27;
    v25 = (char *)realloc(v25, v27);
    *a2 = v25;
    if ( v25 == nullptr )
      abort();
    v21 = a2[1];
  }
  v21[(_QWORD)v25] = 45;
  v28 = a2[1];
  v29 = a1[5];
  v30 = (size_t)(v28 + 1);
  v22 = v29 - 1;
  a2[1] = v28 + 1;
  if ( v29 != 1 )
  {
    v31 = (unsigned __int64)a2[2];
    v32 = (unsigned __int64)&v28[v29];
    v33 = a1[4];
    v34 = *a2;
    if ( v32 > v31 )
    {
      v35 = v32 + 992;
      if ( 2 * v31 <= v35 )
        v36 = v35;
      else
        v36 = 2 * v31;
      a2[2] = (char *)v36;
      v34 = (char *)realloc(v34, v36);
      *a2 = v34;
      if ( v34 == nullptr )
        abort();
      v30 = (size_t)a2[1];
    }
    v37 = &v34[v30];
    v38 = (const void *)(v33 + 1);
LABEL_47:
    memcpy(v37, v38, v22);
LABEL_48:
    v30 = (size_t)&a2[1][v22];
    a2[1] = (char *)v30;
  }
  v44 = (unsigned __int64)a2[2];
  result = *a2;
  if ( v30 + 1 > v44 )
  {
    v46 = 2 * v44;
    v47 = v30 + 993;
    if ( v46 <= v47 )
      v48 = v47;
    else
      v48 = v46;
    a2[2] = (char *)v48;
    result = (char *)realloc(result, v48);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v30 = (size_t)a2[1];
  }
  result[v30] = 62;
  ++a2[1];
  return result;
}


// Address: 0x25C54 | Function: sub_25C54
void sub_25C54()
{
  sub_13E30();
}


// Address: 0x25C60 | Function: sub_25C60
void *__fastcall sub_25C60(__int64 a1, __int64 a2)
{
  __int64 v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  char *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  char *v12; // x8
  __int64 v13; // x10
  unsigned __int64 v14; // x11
  void *v15; // x0
  __int64 v16; // x9
  __int64 v17; // x8
  size_t v18; // x1
  __int64 v19; // x9
  __int64 v20; // x8
  unsigned __int64 v21; // x10
  void *result; // x0
  __int64 v23; // x9
  unsigned __int64 v24; // x8
  size_t v25; // x1
  __int64 (__fastcall **v26)(); // [xsp+8h] [xbp-18h] BYREF
  char v27; // [xsp+10h] [xbp-10h]
  __int16 v28; // [xsp+11h] [xbp-Fh]
  __int64 v29; // [xsp+18h] [xbp-8h]

  v2 = *(_QWORD *)(a2 + 8);
  v3 = *(_QWORD *)(a2 + 16);
  v5 = *(char **)a2;
  if ( v2 + 9 > v3 )
  {
    v7 = 2 * v3;
    v8 = v2 + 1001;
    v9 = *(char **)a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    *(_QWORD *)(a2 + 16) = v10;
    v11 = (char *)realloc(v9, v10);
    *(_QWORD *)a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = *(_QWORD *)(a2 + 8);
    v5 = v11;
  }
  v12 = &v5[v2];
  v12[8] = 46;
  *(_QWORD *)v12 = *(_QWORD *)"sizeof...";
  v13 = *(_QWORD *)(a2 + 8);
  v14 = *(_QWORD *)(a2 + 16);
  v15 = *(void **)a2;
  v16 = v13 + 10;
  ++*(_DWORD *)(a2 + 32);
  v17 = v13 + 9;
  *(_QWORD *)(a2 + 8) = v13 + 9;
  if ( v13 + 10 > v14 )
  {
    if ( 2 * v14 <= v13 + 1002 )
      v18 = v13 + 1002;
    else
      v18 = 2 * v14;
    *(_QWORD *)(a2 + 16) = v18;
    v15 = realloc(v15, v18);
    *(_QWORD *)a2 = v15;
    if ( v15 == nullptr )
      abort();
    v17 = *(_QWORD *)(a2 + 8);
    v16 = v17 + 1;
  }
  *(_QWORD *)(a2 + 8) = v16;
  *((_BYTE *)v15 + v17) = 40;
  v27 = 42;
  v19 = *(_QWORD *)(a1 + 16);
  v28 = 1344;
  v26 = off_37E08;
  v29 = v19;
  sub_246E0((__int64)&v26, (char **)a2);
  v20 = *(_QWORD *)(a2 + 8);
  v21 = *(_QWORD *)(a2 + 16);
  result = *(void **)a2;
  v23 = v20 + 1;
  --*(_DWORD *)(a2 + 32);
  if ( v20 + 1 > v21 )
  {
    v24 = v20 + 993;
    if ( 2 * v21 <= v24 )
      v25 = v24;
    else
      v25 = 2 * v21;
    *(_QWORD *)(a2 + 16) = v25;
    result = realloc(result, v25);
    *(_QWORD *)a2 = result;
    if ( result == nullptr )
      abort();
    v20 = *(_QWORD *)(a2 + 8);
    v23 = v20 + 1;
  }
  *(_QWORD *)(a2 + 8) = v23;
  *((_BYTE *)result + v20) = 41;
  return result;
}


// Address: 0x25DD8 | Function: sub_25DD8
void sub_25DD8()
{
  sub_13E30();
}


// Address: 0x25DE4 | Function: sub_25DE4
_QWORD *__fastcall sub_25DE4(__int64 a1, __int64 a2)
{
  return sub_1F824((_QWORD *)(a1 + 16), a2);
}


// Address: 0x25DF0 | Function: sub_25DF0
void sub_25DF0()
{
  sub_13E30();
}


// Address: 0x25DFC | Function: sub_25DFC
__int64 __fastcall sub_25DFC(__int64 a1, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  void *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  char *v12; // x8
  __int64 *v13; // x20
  __int64 v14; // x9
  __int64 result; // x0

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  if ( (unsigned __int64)(v2 + 6) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 998);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (void *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = v11;
  }
  v12 = &v2[(_QWORD)v5];
  *((_WORD *)v12 + 2) = 8311;
  *(_DWORD *)v12 = 1869768820;
  v13 = *(__int64 **)(a1 + 16);
  v14 = *v13;
  a2[1] = (char *)a2[1] + 6;
  result = (*(__int64 (__fastcall **)(__int64 *, void **))(v14 + 32))(v13, a2);
  if ( (*(_WORD *)((_BYTE *)v13 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64 *, void **))(*v13 + 40))(v13, a2);
  return result;
}


// Address: 0x25ED4 | Function: sub_25ED4
void sub_25ED4()
{
  sub_13E30();
}


// Address: 0x25EE0 | Function: sub_25EE0
__int64 __fastcall sub_25EE0(unsigned __int8 **a1, size_t a2)
{
  int v2; // w8
  unsigned __int8 **v3; // x23
  __int64 result; // x0
  __int64 *v5; // x21
  unsigned __int8 **v6; // x8
  __int64 *v7; // x20
  __int64 v8; // x22
  signed __int64 v9; // x19
  unsigned __int8 *v10; // x0
  unsigned __int8 *v11; // x21
  char *v12; // x9

  if ( a1[1] == *a1 )
    return sub_19748(a1);
  v2 = **a1;
  if ( v2 != 68 )
  {
    if ( v2 == 84 )
    {
      v3 = a1;
      result = sub_1924C((__int64)a1, a2);
      if ( result == 0 )
        return result;
      v5 = (__int64 *)v3[38];
      v6 = v3;
      if ( v5 != (__int64 *)v3[39] )
        goto LABEL_20;
      v7 = (__int64 *)v3[37];
      v8 = result;
      v9 = (char *)v5 - (char *)v7;
      if ( v7 != (__int64 *)(v3 + 40) )
      {
        v10 = (unsigned __int8 *)realloc(v3[37], 2 * ((char *)v5 - (char *)v7));
        v6 = v3;
        v3[37] = v10;
        if ( v10 == nullptr )
          abort();
        goto LABEL_19;
      }
      v10 = (unsigned __int8 *)malloc(2 * ((char *)v5 - (char *)v7));
      if ( v10 == nullptr )
        abort();
      if ( v5 == (__int64 *)(v3 + 40) )
      {
LABEL_18:
        v6 = v3;
        v3[37] = v10;
LABEL_19:
        v5 = (__int64 *)&v10[v9];
        v12 = (char *)&v10[8 * (v9 >> 2)];
        result = v8;
        v6[39] = (unsigned __int8 *)v12;
        goto LABEL_20;
      }
LABEL_17:
      v11 = v10;
      memmove(v10, v7, v9);
      v10 = v11;
      goto LABEL_18;
    }
    return sub_19748(a1);
  }
  v3 = a1;
  result = sub_19618((__int64)a1);
  if ( result == 0 )
    return result;
  v5 = (__int64 *)v3[38];
  v6 = v3;
  if ( v5 == (__int64 *)v3[39] )
  {
    v7 = (__int64 *)v3[37];
    v8 = result;
    v9 = (char *)v5 - (char *)v7;
    if ( v7 != (__int64 *)(v3 + 40) )
    {
      v10 = (unsigned __int8 *)realloc(v7, 2 * ((char *)v5 - (char *)v7));
      v6 = v3;
      v3[37] = v10;
      if ( v10 == nullptr )
        abort();
      goto LABEL_19;
    }
    v10 = (unsigned __int8 *)malloc(2 * ((char *)v5 - (char *)v7));
    if ( v10 == nullptr )
      abort();
    if ( v5 == v7 )
      goto LABEL_18;
    goto LABEL_17;
  }
LABEL_20:
  v6[38] = (unsigned __int8 *)(v5 + 1);
  *v5 = result;
  return result;
}


// Address: 0x26058 | Function: sub_26058
__int64 __fastcall sub_26058(__int64 a1, size_t a2)
{
  unsigned __int8 *v2; // x8
  unsigned __int8 *v3; // x9
  __int64 result; // x0
  __int64 v6; // x20
  _QWORD *v7; // x21
  __int64 v8; // x8
  __int64 v9; // x22
  _QWORD *v10; // x0
  __int64 v11; // x9
  char *v12; // x8
  unsigned __int8 *v13; // x8
  __int64 v14; // x8
  _QWORD *v15; // x20
  __int64 v16; // x9
  __int64 v17; // x21
  _QWORD *v18; // x0
  __int16 v19; // w9
  __int64 v20; // x20
  _QWORD *v21; // x21
  __int64 v22; // x8
  __int64 v23; // x22
  _QWORD *v24; // x0
  __int64 v25; // x9
  char *v26; // x8

  v2 = *(unsigned __int8 **)a1;
  v3 = *(unsigned __int8 **)(a1 + 8);
  if ( v3 != *(unsigned __int8 **)a1 && (unsigned int)*v2 - 58 >= 0xFFFFFFF6 )
  {
    result = sub_1869C((unsigned __int8 **)a1);
    if ( result == 0 )
      return result;
    goto LABEL_10;
  }
  if ( (unsigned __int64)&v3[-*(_QWORD *)a1] < 2 )
  {
LABEL_7:
    result = sub_2640C(a1, 0);
    if ( result == 0 )
      return result;
LABEL_10:
    if ( *(_QWORD *)(a1 + 8) != *(_QWORD *)a1 && **(_BYTE **)a1 == 73 )
    {
      v6 = result;
      result = sub_18CC8(a1, 0);
      if ( result != 0 )
      {
        v7 = *(_QWORD **)(a1 + 4912);
        v8 = v7[1];
        if ( (unsigned __int64)(v8 - 4048) > 0xFFFFFFFFFFFFF00FLL )
        {
LABEL_16:
          v11 = v8 + 32;
          v12 = (char *)v7 + v8;
          v7[1] = v11;
          *((_QWORD *)v12 + 2) = off_38AB8;
          v12 += 16;
          LOWORD(v11) = *(_WORD *)(v12 + 9);
          *((_QWORD *)v12 + 2) = v6;
          *((_QWORD *)v12 + 3) = result;
          v12[8] = 45;
          *(_WORD *)(v12 + 9) = v11 & 0xF000 | 0x540;
          return (__int64)v12;
        }
        v9 = result;
        v10 = malloc(0x1000u);
        if ( v10 != nullptr )
        {
          v8 = 0;
          *v10 = v7;
          v10[1] = 0;
          v7 = v10;
          *(_QWORD *)(a1 + 4912) = v10;
          result = v9;
          goto LABEL_16;
        }
LABEL_33:
        sub_13E4C();
      }
    }
    return result;
  }
  if ( *(_WORD *)v2 != 28260 )
  {
    if ( *(_WORD *)v2 == 28271 )
      *(_QWORD *)a1 = v2 + 2;
    goto LABEL_7;
  }
  v13 = v2 + 2;
  *(_QWORD *)a1 = v13;
  if ( v3 == v13 || (unsigned int)*v13 - 58 < 0xFFFFFFF6 )
  {
    result = sub_25EE0((unsigned __int8 **)a1, a2);
    v14 = result;
    if ( result == 0 )
      return result;
  }
  else
  {
    result = sub_1869C((unsigned __int8 **)a1);
    if ( result == 0 )
      return result;
    v14 = result;
    if ( *(_QWORD *)(a1 + 8) != *(_QWORD *)a1 && **(_BYTE **)a1 == 73 )
    {
      v20 = result;
      result = sub_18CC8(a1, 0);
      if ( result == 0 )
        return result;
      v21 = *(_QWORD **)(a1 + 4912);
      v22 = v21[1];
      if ( (unsigned __int64)(v22 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v23 = result;
        v24 = malloc(0x1000u);
        if ( v24 == nullptr )
          goto LABEL_33;
        v22 = 0;
        *v24 = v21;
        v24[1] = 0;
        v21 = v24;
        *(_QWORD *)(a1 + 4912) = v24;
        result = v23;
      }
      v25 = v22 + 32;
      v26 = (char *)v21 + v22;
      v21[1] = v25;
      *((_QWORD *)v26 + 2) = off_38AB8;
      v14 = (__int64)(v26 + 16);
      LOWORD(v25) = *(_WORD *)(v14 + 9);
      *(_QWORD *)(v14 + 16) = v20;
      *(_QWORD *)(v14 + 24) = result;
      *(_BYTE *)(v14 + 8) = 45;
      *(_WORD *)(v14 + 9) = v25 & 0xF000 | 0x540;
    }
  }
  v15 = *(_QWORD **)(a1 + 4912);
  v16 = v15[1];
  if ( (unsigned __int64)(v16 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v17 = v14;
    v18 = malloc(0x1000u);
    if ( v18 == nullptr )
      goto LABEL_33;
    v16 = 0;
    *v18 = v15;
    v18[1] = 0;
    v15 = v18;
    v14 = v17;
    *(_QWORD *)(a1 + 4912) = v18;
  }
  v15[1] = v16 + 32;
  *(_QWORD *)((char *)v15 + v16 + 16) = off_38428;
  result = (__int64)v15 + v16 + 16;
  v19 = *(_WORD *)((char *)v15 + v16 + 25);
  *(_QWORD *)(result + 16) = v14;
  *(_BYTE *)(result + 8) = 50;
  *(_WORD *)(result + 9) = v19 & 0xF000 | 0x540;
  return result;
}


// Address: 0x262E8 | Function: sub_262E8
__int64 __fastcall sub_262E8(__int64 a1, char **a2)
{
  __int64 v2; // x21
  char *v5; // x8
  unsigned __int64 v6; // x9
  char *v7; // x0
  unsigned __int64 v8; // x9
  size_t v9; // x8
  size_t v10; // x1
  __int64 *v11; // x20
  __int64 v12; // x9
  __int64 result; // x0

  v2 = *(_QWORD *)(a1 + 16);
  (*(void (__fastcall **)(__int64))(*(_QWORD *)v2 + 32LL))(v2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v2 + 40LL))(v2, a2);
  v5 = a2[1];
  v6 = (unsigned __int64)a2[2];
  v7 = *a2;
  if ( (unsigned __int64)(v5 + 2) > v6 )
  {
    v8 = 2 * v6;
    v9 = (size_t)(v5 + 994);
    if ( v8 <= v9 )
      v10 = v9;
    else
      v10 = v8;
    a2[2] = (char *)v10;
    v7 = (char *)realloc(v7, v10);
    *a2 = v7;
    if ( v7 == nullptr )
      abort();
    v5 = a2[1];
  }
  *(_WORD *)&v5[(_QWORD)v7] = 14906;
  v11 = *(__int64 **)(a1 + 24);
  v12 = *v11;
  a2[1] += 2;
  result = (*(__int64 (__fastcall **)(__int64 *, char **))(v12 + 32))(v11, a2);
  if ( (*(_WORD *)((_BYTE *)v11 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64 *, char **))(*v11 + 40))(v11, a2);
  return result;
}


// Address: 0x263EC | Function: sub_263EC
__int64 __fastcall sub_263EC(__int64 a1)
{
  return (*(__int64 (__fastcall **)(_QWORD))(**(_QWORD **)(a1 + 24) + 48LL))(*(_QWORD *)(a1 + 24));
}


// Address: 0x26400 | Function: sub_26400
void sub_26400()
{
  sub_13E30();
}


// Address: 0x2640C | Function: sub_2640C
__int64 __fastcall sub_2640C(__int64 a1, _BYTE *a2)
{
  unsigned __int8 *v2; // x8
  unsigned __int8 *v3; // x9
  unsigned int v4; // w10
  unsigned __int64 v5; // x11
  __int64 v6; // x13
  unsigned __int64 v7; // x14
  unsigned __int8 *v8; // x15
  unsigned int v9; // w16
  unsigned __int8 *v10; // x11
  unsigned int v11; // w9
  char v12; // w20
  char v13; // w21
  char v15; // w8
  __int64 v17; // x19
  __int64 v18; // x8
  _QWORD *v19; // x23
  __int64 v20; // x9
  _QWORD *v21; // x0
  __int64 result; // x0
  __int16 v23; // w9
  _QWORD *v25; // x20
  __int64 v26; // x19
  __int64 v27; // x8
  _QWORD *v28; // x0
  __int64 v29; // x9
  char *v30; // x0
  __int64 (__fastcall **v31)(); // x8
  char v32; // w9
  _QWORD *v34; // x20
  __int64 v35; // x8
  _QWORD *v36; // x0
  __int64 v37; // x9
  __int16 v38; // w8
  const char *v39; // x19
  size_t v41; // x0
  _QWORD *v42; // x21
  __int64 v43; // x22
  size_t v44; // x20
  __int64 v45; // x8
  _QWORD *v46; // x0
  __int16 v47; // w8

  v2 = *(unsigned __int8 **)a1;
  v3 = *(unsigned __int8 **)(a1 + 8);
  if ( (unsigned __int64)&v3[-*(_QWORD *)a1] >= 2 )
  {
    v4 = *v2;
    v5 = 0;
    v6 = 61;
    do
    {
      v7 = (v5 + v6) >> 1;
      v8 = (unsigned __int8 *)&unk_36CF8 + 16 * v7;
      v9 = *v8;
      if ( v9 < v4 )
      {
        v5 = v7 + 1;
      }
      else if ( v9 == v4 )
      {
        if ( v8[1] >= (unsigned int)v2[1] )
          v6 = (v5 + v6) >> 1;
        else
          v5 = v7 + 1;
      }
      else
      {
        v6 = (v5 + v6) >> 1;
      }
    }
    while ( v6 != v5 );
    v10 = (unsigned __int8 *)&unk_36CF8 + 16 * v5;
    if ( *v10 == v4 && v10[1] == v2[1] )
    {
      v11 = v10[2];
      *(_QWORD *)a1 = v2 + 2;
      if ( v11 == 8 )
      {
        v12 = *(_BYTE *)(a1 + 777);
        v13 = *(_BYTE *)(a1 + 776);
        *(_BYTE *)(a1 + 776) = 0;
        if ( a2 != nullptr )
          v15 = 1;
        else
          v15 = v12;
        *(_BYTE *)(a1 + 777) = v15;
        v17 = sub_1544C(a1, (size_t)a2);
        if ( v17 == 0 )
        {
          result = 0;
          v18 = a1;
          goto LABEL_50;
        }
        v18 = a1;
        if ( a2 != nullptr )
          *a2 = 1;
        v19 = *(_QWORD **)(a1 + 4912);
        v20 = v19[1];
        if ( (unsigned __int64)(v20 - 4048) > 0xFFFFFFFFFFFFF00FLL )
        {
LABEL_23:
          v19[1] = v20 + 32;
          *(_QWORD *)((char *)v19 + v20 + 16) = off_38498;
          result = (__int64)v19 + v20 + 16;
          v23 = *(_WORD *)((char *)v19 + v20 + 25);
          *(_QWORD *)(result + 16) = v17;
          *(_BYTE *)(result + 8) = 4;
          *(_WORD *)(result + 9) = v23 & 0xF000 | 0x540;
LABEL_50:
          *(_BYTE *)(v18 + 777) = v12;
          *(_BYTE *)(v18 + 776) = v13;
          return result;
        }
        v21 = malloc(0x1000u);
        if ( v21 != nullptr )
        {
          v20 = 0;
          *v21 = v19;
          v21[1] = 0;
          v19 = v21;
          v18 = a1;
          *(_QWORD *)(a1 + 4912) = v21;
          goto LABEL_23;
        }
LABEL_51:
        sub_13E4C();
      }
      if ( v11 <= 0xA && (v11 != 4 || (v10[3] & 1) != 0) )
      {
        v39 = *((const char **)v10 + 1);
        v41 = strlen(v39);
        v42 = *(_QWORD **)(a1 + 4912);
        v43 = a1;
        v44 = v41;
        v45 = v42[1];
        if ( (unsigned __int64)(v45 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
        {
          v46 = malloc(0x1000u);
          if ( v46 == nullptr )
            goto LABEL_51;
          v45 = 0;
          *v46 = v42;
          v46[1] = 0;
          v42 = v46;
          *(_QWORD *)(v43 + 4912) = v46;
        }
        v42[1] = v45 + 32;
        *(_QWORD *)((char *)v42 + v45 + 16) = off_36BB8;
        result = (__int64)v42 + v45 + 16;
        v47 = *(_WORD *)((char *)v42 + v45 + 25);
        *(_QWORD *)(result + 16) = v39;
        *(_QWORD *)(result + 24) = v44;
        *(_BYTE *)(result + 8) = 8;
        *(_WORD *)(result + 9) = v47 & 0xF000 | 0x540;
        return result;
      }
      return 0;
    }
    if ( *(_WORD *)v2 == 26988 )
    {
      *(_QWORD *)a1 = v2 + 2;
      result = sub_1869C((unsigned __int8 **)a1);
      if ( result == 0 )
        return result;
      v34 = *(_QWORD **)(a1 + 4912);
      v26 = result;
      v35 = v34[1];
      if ( (unsigned __int64)(v35 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v36 = malloc(0x1000u);
        if ( v36 == nullptr )
          goto LABEL_51;
        v35 = 0;
        *v36 = v34;
        v36[1] = 0;
        v34 = v36;
        *(_QWORD *)(a1 + 4912) = v36;
      }
      v37 = v35 + 32;
      v30 = (char *)v34 + v35;
      v31 = off_38508;
      v34[1] = v37;
      v32 = 20;
LABEL_39:
      *((_QWORD *)v30 + 2) = v31;
      result = (__int64)(v30 + 16);
      v38 = *(_WORD *)(result + 9) & 0xF000;
      *(_BYTE *)(result + 8) = v32;
      *(_QWORD *)(result + 16) = v26;
      *(_WORD *)(result + 9) = v38 | 0x540;
      return result;
    }
  }
  if ( v2 != v3 && *v2 == 118 )
  {
    *(_QWORD *)a1 = v2 + 1;
    if ( v3 != v2 + 1 && (unsigned int)v2[1] - 48 <= 9 )
    {
      *(_QWORD *)a1 = v2 + 2;
      result = sub_1869C((unsigned __int8 **)a1);
      if ( result == 0 )
        return result;
      v25 = *(_QWORD **)(a1 + 4912);
      v26 = result;
      v27 = v25[1];
      if ( (unsigned __int64)(v27 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v28 = malloc(0x1000u);
        if ( v28 == nullptr )
          goto LABEL_51;
        v27 = 0;
        *v28 = v25;
        v28[1] = 0;
        v25 = v28;
        *(_QWORD *)(a1 + 4912) = v28;
      }
      v29 = v27 + 32;
      v30 = (char *)v25 + v27;
      v31 = off_38498;
      v25[1] = v29;
      v32 = 4;
      goto LABEL_39;
    }
  }
  return 0;
}


// Address: 0x26780 | Function: sub_26780
__int64 __fastcall sub_26780(__int64 a1, _QWORD *a2)
{
  __int64 v2; // x9
  unsigned __int64 v3; // x10
  _BYTE *v5; // x8
  unsigned __int64 v6; // x10
  size_t v7; // x9
  _BYTE *v8; // x0
  _QWORD *v9; // x20
  _BYTE *v10; // x0
  __int64 *v11; // x0
  __int64 v12; // x9

  v2 = a2[1];
  v3 = a2[2];
  v5 = (_BYTE *)*a2;
  if ( v2 + 1 > v3 )
  {
    v6 = 2 * v3;
    v7 = v2 + 993;
    v8 = (_BYTE *)*a2;
    v9 = a2;
    if ( v6 > v7 )
      v7 = v6;
    a2[2] = v7;
    v10 = realloc(v8, v7);
    *v9 = v10;
    if ( v10 == nullptr )
      abort();
    v2 = v9[1];
    a2 = v9;
    v5 = v10;
  }
  v5[v2] = 126;
  v11 = *(__int64 **)(a1 + 16);
  v12 = *v11;
  ++a2[1];
  return (*(__int64 (__fastcall **)(__int64 *))(v12 + 32))(v11);
}


// Address: 0x26814 | Function: sub_26814
void sub_26814()
{
  sub_13E30();
}


// Address: 0x26820 | Function: sub_26820
__int64 __fastcall sub_26820(__int64 a1, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  void *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  char *v12; // x8
  __int64 *v13; // x20
  __int64 v14; // x9
  __int64 result; // x0

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  if ( (unsigned __int64)(v2 + 9) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 1001);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (void *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = v11;
  }
  v12 = &v2[(_QWORD)v5];
  v12[8] = 32;
  *(_QWORD *)v12 = *(_QWORD *)"operator ";
  v13 = *(__int64 **)(a1 + 16);
  v14 = *v13;
  a2[1] = (char *)a2[1] + 9;
  result = (*(__int64 (__fastcall **)(__int64 *, void **))(v14 + 32))(v13, a2);
  if ( (*(_WORD *)((_BYTE *)v13 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64 *, void **))(*v13 + 40))(v13, a2);
  return result;
}


// Address: 0x268FC | Function: sub_268FC
void sub_268FC()
{
  sub_13E30();
}


// Address: 0x26908 | Function: sub_26908
__int64 __fastcall sub_26908(__int64 a1, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  void *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  char *v12; // x8
  __int64 *v13; // x20
  __int64 v14; // x9
  __int64 result; // x0

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  if ( (unsigned __int64)(v2 + 11) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 1003);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (void *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = v11;
  }
  v12 = &v2[(_QWORD)v5];
  *(_QWORD *)v12 = *(_QWORD *)"operator\"\" ";
  *(_DWORD *)(v12 + 7) = 539107954;
  v13 = *(__int64 **)(a1 + 16);
  v14 = *v13;
  a2[1] = (char *)a2[1] + 11;
  result = (*(__int64 (__fastcall **)(__int64 *, void **))(v14 + 32))(v13, a2);
  if ( (*(_WORD *)((_BYTE *)v13 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64 *, void **))(*v13 + 40))(v13, a2);
  return result;
}


// Address: 0x269E8 | Function: sub_269E8
void sub_269E8()
{
  sub_13E30();
}


// Address: 0x269F4 | Function: sub_269F4
__int64 __fastcall sub_269F4(__int64 a1, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  void *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  __int64 *v12; // x20
  __int64 v13; // x9
  __int64 result; // x0

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  if ( (unsigned __int64)(v2 + 2) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 994);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (void *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = v11;
  }
  *(_WORD *)&v2[(_QWORD)v5] = 14906;
  v12 = *(__int64 **)(a1 + 16);
  v13 = *v12;
  a2[1] = (char *)a2[1] + 2;
  result = (*(__int64 (__fastcall **)(__int64 *, void **))(v13 + 32))(v12, a2);
  if ( (*(_WORD *)((_BYTE *)v12 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64 *, void **))(*v12 + 40))(v12, a2);
  return result;
}


// Address: 0x26ABC | Function: sub_26ABC
__int64 __fastcall sub_26ABC(__int64 a1)
{
  return (*(__int64 (__fastcall **)(_QWORD))(**(_QWORD **)(a1 + 16) + 48LL))(*(_QWORD *)(a1 + 16));
}


// Address: 0x26AD0 | Function: sub_26AD0
void sub_26AD0()
{
  sub_13E30();
}


// Address: 0x26ADC | Function: sub_26ADC
char *__fastcall sub_26ADC(__int64 a1, char *a2)
{
  _BYTE *v2; // x8
  char *v5; // x0
  __int16 v6; // w8
  char *result; // x0
  __int16 v8; // w9
  __int64 v9; // x0
  __int64 v10; // x1
  _QWORD *v11; // x25
  __int64 v12; // x21
  __int64 v13; // x22
  __int64 v14; // x8
  _QWORD *v15; // x0

  v2 = *(_BYTE **)a1;
  if ( *(_QWORD *)a1 != *(_QWORD *)(a1 + 8) )
  {
    while ( *v2 == 66 )
    {
      *(_QWORD *)a1 = v2 + 1;
      v9 = sub_270FC(a1);
      if ( v10 == 0 )
        return nullptr;
      v11 = *(_QWORD **)(a1 + 4912);
      v12 = v10;
      v13 = v9;
      v14 = v11[1];
      if ( (unsigned __int64)(v14 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v15 = malloc(0x1000u);
        if ( v15 == nullptr )
          sub_13E4C();
        v14 = 0;
        *v15 = v11;
        v15[1] = 0;
        v11 = v15;
        *(_QWORD *)(a1 + 4912) = v15;
      }
      v5 = (char *)v11 + v14;
      v11[1] = v14 + 48;
      v6 = *(_WORD *)(a2 + 9);
      *((_QWORD *)v5 + 2) = off_386C8;
      result = v5 + 16;
      v8 = *(_WORD *)(result + 9);
      *((_QWORD *)result + 3) = v13;
      *((_QWORD *)result + 2) = a2;
      a2 = result;
      result[8] = 9;
      *((_QWORD *)result + 4) = v12;
      *(_WORD *)(result + 9) = v8 & 0xF000 | v6 & 0xFC0;
      v2 = *(_BYTE **)a1;
      if ( *(_QWORD *)a1 == *(_QWORD *)(a1 + 8) )
        return result;
    }
  }
  return a2;
}


// Address: 0x26BEC | Function: sub_26BEC
void *__fastcall sub_26BEC(__int64 a1, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  void *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  char *v12; // x8
  int v13; // w9
  __int64 v14; // x8
  const char *v15; // x21
  size_t v16; // x20
  const char *v17; // x9
  size_t v19; // x10
  char *v20; // x0
  size_t v21; // x1
  void *result; // x0

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  if ( (unsigned __int64)(v2 + 5) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 997);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (void *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = v11;
  }
  v12 = &v2[(_QWORD)v5];
  v12[4] = 58;
  *(_DWORD *)v12 = 979661939;
  v13 = *(_DWORD *)(a1 + 12);
  v14 = (__int64)a2[1] + 5;
  a2[1] = (void *)v14;
  if ( v13 > 2 )
  {
    if ( v13 == 3 )
    {
      v17 = "basic_istream";
      v16 = 7;
    }
    else if ( v13 == 4 )
    {
      v17 = "basic_ostream";
      v16 = 7;
    }
    else
    {
      v17 = "basic_iostream";
      v16 = 8;
    }
  }
  else
  {
    if ( v13 == 0 )
    {
      v15 = "allocator";
      v16 = 9;
      goto LABEL_24;
    }
    if ( v13 == 1 )
    {
      v15 = "basic_string";
      v16 = 12;
      goto LABEL_24;
    }
    v17 = "basic_string";
    v16 = 6;
  }
  if ( *(_DWORD *)v17 != 1769169250 || *((_WORD *)v17 + 2) != 24419 )
    sub_1405C("%s:%d: %s", "out/llvm-project/libcxxabi/src/demangle/ItaniumDemangle.h", 1704, (const char *)&unk_9335);
  v15 = v17 + 6;
LABEL_24:
  v19 = (size_t)a2[2];
  v20 = (char *)*a2;
  if ( v14 + v16 > v19 )
  {
    if ( 2 * v19 <= v14 + v16 + 992 )
      v21 = v14 + v16 + 992;
    else
      v21 = 2 * v19;
    a2[2] = (void *)v21;
    v20 = (char *)realloc(v20, v21);
    *a2 = v20;
    if ( v20 == nullptr )
      abort();
    v14 = (__int64)a2[1];
  }
  result = memcpy(&v20[v14], v15, v16);
  a2[1] = (char *)a2[1] + v16;
  return result;
}


// Address: 0x26DA4 | Function: sub_26DA4
const char *__fastcall sub_26DA4(__int64 a1)
{
  int v1; // w8
  const char *v3; // x8

  v1 = *(_DWORD *)(a1 + 12);
  if ( v1 > 2 )
  {
    if ( v1 == 3 )
    {
      v3 = "basic_istream";
    }
    else if ( v1 == 4 )
    {
      v3 = "basic_ostream";
    }
    else
    {
      v3 = "basic_iostream";
    }
  }
  else
  {
    if ( v1 == 0 )
      return "allocator";
    if ( v1 == 1 )
      return "basic_string";
    v3 = "basic_string";
  }
  if ( *(_DWORD *)v3 != 1769169250 || *((_WORD *)v3 + 2) != 24419 )
    sub_1405C("%s:%d: %s", "out/llvm-project/libcxxabi/src/demangle/ItaniumDemangle.h", 1704, (const char *)&unk_9335);
  return v3 + 6;
}


// Address: 0x26E80 | Function: sub_26E80
void sub_26E80()
{
  sub_13E30();
}


// Address: 0x26E8C | Function: sub_26E8C
void *__fastcall sub_26E8C(__int64 *a1, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  void *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  char *v12; // x8
  __int64 v13; // x9
  void *result; // x0
  size_t v15; // x1
  char *v16; // x8
  size_t v17; // x9
  const void *v18; // x22
  char *v19; // x0
  size_t v20; // x21
  char *v21; // x10
  size_t v22; // x1
  char *v23; // x8
  unsigned __int64 v24; // x9
  char *v25; // x0
  unsigned __int64 v26; // x9
  size_t v27; // x8
  size_t v28; // x1
  char *v29; // x9
  int v30; // w10
  __int64 v31; // x8
  unsigned __int64 v32; // x10
  char *v33; // x0
  unsigned __int64 v34; // x9
  size_t v35; // x1
  unsigned __int64 v36; // x9
  unsigned __int64 v37; // x9
  size_t v38; // x8
  size_t v39; // x1

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  if ( (unsigned __int64)(v2 + 5) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 997);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (void *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = v11;
  }
  v12 = &v2[(_QWORD)v5];
  v12[4] = 58;
  *(_DWORD *)v12 = 979661939;
  v13 = *a1;
  a2[1] = (char *)a2[1] + 5;
  result = (void *)(*(__int64 (__fastcall **)(__int64 *))(v13 + 48))(a1);
  if ( v15 != 0 )
  {
    v16 = (char *)a2[1];
    v17 = (size_t)a2[2];
    v18 = result;
    v19 = (char *)*a2;
    v20 = v15;
    v21 = &v16[v15];
    if ( (unsigned __int64)&v16[v15] > v17 )
    {
      if ( 2 * v17 <= (unsigned __int64)(v21 + 992) )
        v22 = (size_t)(v21 + 992);
      else
        v22 = 2 * v17;
      a2[2] = (void *)v22;
      v19 = (char *)realloc(v19, v22);
      *a2 = v19;
      if ( v19 == nullptr )
        abort();
      v16 = (char *)a2[1];
    }
    result = memcpy(&v16[(_QWORD)v19], v18, v20);
    a2[1] = (char *)a2[1] + v20;
  }
  if ( *((_DWORD *)a1 + 3) >= 2u )
  {
    v23 = (char *)a2[1];
    v24 = (unsigned __int64)a2[2];
    v25 = (char *)*a2;
    if ( (unsigned __int64)(v23 + 29) > v24 )
    {
      v26 = 2 * v24;
      v27 = (size_t)(v23 + 1021);
      if ( v26 <= v27 )
        v28 = v27;
      else
        v28 = v26;
      a2[2] = (void *)v28;
      v25 = (char *)realloc(v25, v28);
      *a2 = v25;
      if ( v25 == nullptr )
        abort();
      v23 = (char *)a2[1];
    }
    qmemcpy(&v23[(_QWORD)v25], "<char, std::char_traits<char>", 29);
    v29 = (char *)a2[1];
    v30 = *((_DWORD *)a1 + 3);
    v31 = (__int64)(v29 + 29);
    a2[1] = v29 + 29;
    if ( v30 == 2 )
    {
      v32 = (unsigned __int64)a2[2];
      v33 = (char *)*a2;
      if ( (unsigned __int64)(v29 + 51) > v32 )
      {
        v34 = (unsigned __int64)(v29 + 1043);
        if ( 2 * v32 <= v34 )
          v35 = v34;
        else
          v35 = 2 * v32;
        a2[2] = (void *)v35;
        v33 = (char *)realloc(v33, v35);
        *a2 = v33;
        if ( v33 == nullptr )
          abort();
        v31 = (__int64)a2[1];
      }
      qmemcpy(&v33[v31], ", std::allocator<char>", 22);
      v31 = (__int64)a2[1] + 22;
      a2[1] = (void *)v31;
    }
    v36 = (unsigned __int64)a2[2];
    result = *a2;
    if ( v31 + 1 > v36 )
    {
      v37 = 2 * v36;
      v38 = v31 + 993;
      if ( v37 <= v38 )
        v39 = v38;
      else
        v39 = v37;
      a2[2] = (void *)v39;
      result = realloc(result, v39);
      *a2 = result;
      if ( result == nullptr )
        abort();
      v31 = (__int64)a2[1];
    }
    *((_BYTE *)result + v31) = 62;
    a2[1] = (char *)a2[1] + 1;
  }
  return result;
}


// Address: 0x270C8 | Function: sub_270C8
char *__fastcall sub_270C8(__int64 a1)
{
  return (char *)dword_B728 + dword_B728[*(int *)(a1 + 12)];
}


// Address: 0x270F0 | Function: sub_270F0
void sub_270F0()
{
  sub_13E30();
}


// Address: 0x270FC | Function: sub_270FC
unsigned __int8 *__fastcall sub_270FC(__int64 a1)
{
  unsigned __int8 *result; // x0
  unsigned __int64 v3; // [xsp+18h] [xbp+18h] BYREF

  v3 = 0;
  if ( (sub_18848((unsigned __int8 **)a1, (__int64 *)&v3) & 1) != 0 )
    return nullptr;
  result = *(unsigned __int8 **)a1;
  if ( *(_QWORD *)(a1 + 8) - *(_QWORD *)a1 < v3 )
    return nullptr;
  *(_QWORD *)a1 = &result[v3];
  return result;
}


// Address: 0x27158 | Function: sub_27158
char *__fastcall sub_27158(__int64 a1, char **a2)
{
  char *v4; // x8
  unsigned __int64 v5; // x9
  char *v6; // x0
  unsigned __int64 v7; // x9
  size_t v8; // x8
  size_t v9; // x1
  char *v10; // x8
  __int64 v11; // x8
  size_t v12; // x21
  size_t v13; // x10
  const void *v14; // x20
  char *v15; // x0
  size_t v16; // x1
  unsigned __int64 v17; // x9
  char *result; // x0
  unsigned __int64 v19; // x9
  size_t v20; // x8
  size_t v21; // x1

  (*(void (__fastcall **)(_QWORD))(**(_QWORD **)(a1 + 16) + 32LL))(*(_QWORD *)(a1 + 16));
  v4 = a2[1];
  v5 = (unsigned __int64)a2[2];
  v6 = *a2;
  if ( (unsigned __int64)(v4 + 5) > v5 )
  {
    v7 = 2 * v5;
    v8 = (size_t)(v4 + 997);
    if ( v7 <= v8 )
      v9 = v8;
    else
      v9 = v7;
    a2[2] = (char *)v9;
    v6 = (char *)realloc(v6, v9);
    *a2 = v6;
    if ( v6 == nullptr )
      abort();
    v4 = a2[1];
  }
  v10 = &v4[(_QWORD)v6];
  v10[4] = 58;
  *(_DWORD *)v10 = 1768055131;
  v11 = (__int64)(a2[1] + 5);
  a2[1] = (char *)v11;
  v12 = *(_QWORD *)(a1 + 32);
  if ( v12 != 0 )
  {
    v13 = (size_t)a2[2];
    v14 = *(const void **)(a1 + 24);
    v15 = *a2;
    if ( v11 + v12 > v13 )
    {
      if ( 2 * v13 <= v11 + v12 + 992 )
        v16 = v11 + v12 + 992;
      else
        v16 = 2 * v13;
      a2[2] = (char *)v16;
      v15 = (char *)realloc(v15, v16);
      *a2 = v15;
      if ( v15 == nullptr )
        abort();
      v11 = (__int64)a2[1];
    }
    memcpy(&v15[v11], v14, v12);
    v11 = (__int64)&a2[1][v12];
    a2[1] = (char *)v11;
  }
  v17 = (unsigned __int64)a2[2];
  result = *a2;
  if ( v11 + 1 > v17 )
  {
    v19 = 2 * v17;
    v20 = v11 + 993;
    if ( v19 <= v20 )
      v21 = v20;
    else
      v21 = v19;
    a2[2] = (char *)v21;
    result = (char *)realloc(result, v21);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v11 = (__int64)a2[1];
  }
  result[v11] = 93;
  ++a2[1];
  return result;
}


// Address: 0x272AC | Function: sub_272AC
__int64 __fastcall sub_272AC(__int64 a1)
{
  return (*(__int64 (__fastcall **)(_QWORD))(**(_QWORD **)(a1 + 16) + 48LL))(*(_QWORD *)(a1 + 16));
}


// Address: 0x272C0 | Function: sub_272C0
void sub_272C0()
{
  sub_13E30();
}


// Address: 0x272CC | Function: sub_272CC
void *__fastcall sub_272CC(__int64 a1, __int64 a2)
{
  __int64 v2; // x8
  unsigned __int64 v3; // x10
  void *v5; // x0
  __int64 v7; // x9
  unsigned __int64 v8; // x8
  size_t v9; // x1
  __int64 v10; // x8
  unsigned __int64 v11; // x10
  void *result; // x0
  __int64 v13; // x9
  unsigned __int64 v14; // x8
  size_t v15; // x1

  v2 = *(_QWORD *)(a2 + 8);
  v3 = *(_QWORD *)(a2 + 16);
  v5 = *(void **)a2;
  v7 = v2 + 1;
  ++*(_DWORD *)(a2 + 32);
  if ( v2 + 1 > v3 )
  {
    v8 = v2 + 993;
    if ( 2 * v3 <= v8 )
      v9 = v8;
    else
      v9 = 2 * v3;
    *(_QWORD *)(a2 + 16) = v9;
    v5 = realloc(v5, v9);
    *(_QWORD *)a2 = v5;
    if ( v5 == nullptr )
      abort();
    v2 = *(_QWORD *)(a2 + 8);
    v7 = v2 + 1;
  }
  *(_QWORD *)(a2 + 8) = v7;
  *((_BYTE *)v5 + v2) = 91;
  sub_1F824((_QWORD *)(a1 + 16), a2);
  v10 = *(_QWORD *)(a2 + 8);
  v11 = *(_QWORD *)(a2 + 16);
  result = *(void **)a2;
  v13 = v10 + 1;
  --*(_DWORD *)(a2 + 32);
  if ( v10 + 1 > v11 )
  {
    v14 = v10 + 993;
    if ( 2 * v11 <= v14 )
      v15 = v14;
    else
      v15 = 2 * v11;
    *(_QWORD *)(a2 + 16) = v15;
    result = realloc(result, v15);
    *(_QWORD *)a2 = result;
    if ( result == nullptr )
      abort();
    v10 = *(_QWORD *)(a2 + 8);
    v13 = v10 + 1;
  }
  *(_QWORD *)(a2 + 8) = v13;
  *((_BYTE *)result + v10) = 93;
  return result;
}


// Address: 0x273B0 | Function: sub_273B0
void sub_273B0()
{
  sub_13E30();
}


// Address: 0x273BC | Function: sub_273BC
char *__fastcall sub_273BC(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x8
  __int64 v8; // x10
  char *result; // x0
  __int16 v10; // w9

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4064) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v7 = v4 + 16;
  v8 = *a2;
  v2[1] = v7;
  result = (char *)v2 + v7;
  v10 = *(_WORD *)((char *)v2 + v7 + 9);
  result[8] = 47;
  *(_QWORD *)result = off_38670;
  LODWORD(v7) = *(_DWORD *)(v8 + 12);
  *(_WORD *)(result + 9) = v10 & 0xF000 | 0x540;
  *((_DWORD *)result + 3) = v7;
  return result;
}


// Address: 0x27460 | Function: sub_27460
char *__fastcall sub_27460(__int64 a1, __int64 *a2, char *a3, _DWORD *a4)
{
  _QWORD *v4; // x23
  __int64 v8; // x8
  _QWORD *v10; // x0
  __int64 v11; // x9
  char *v12; // x0
  __int64 v13; // x8
  char *result; // x0
  char v15; // w11

  v4 = *(_QWORD **)(a1 + 4912);
  v8 = v4[1];
  if ( (unsigned __int64)(v8 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v10 = malloc(0x1000u);
    if ( v10 == nullptr )
      sub_13E4C();
    v8 = 0;
    *v10 = v4;
    v10[1] = 0;
    v4 = v10;
    *(_QWORD *)(a1 + 4912) = v10;
  }
  v11 = v8 + 32;
  v12 = (char *)v4 + v8;
  v13 = *a2;
  v4[1] = v11;
  *((_QWORD *)v12 + 2) = off_387A8;
  result = v12 + 16;
  LOWORD(v11) = *(_WORD *)(result + 9);
  v15 = *a3;
  *((_QWORD *)result + 2) = v13;
  result[8] = 49;
  LOWORD(v13) = v11 & 0xF000;
  LODWORD(v11) = *a4;
  result[24] = v15;
  *(_WORD *)(result + 9) = v13 | 0x540;
  *((_DWORD *)result + 7) = v11;
  return result;
}


// Address: 0x27520 | Function: sub_27520
void *__fastcall sub_27520(__int64 a1, char **a2)
{
  __int64 v2; // x8
  char *v4; // x9
  unsigned __int64 v5; // x10
  char *v6; // x0
  __int64 v7; // x20
  unsigned __int64 v8; // x9
  size_t v9; // x1
  void *result; // x0
  size_t v11; // x1
  char *v12; // x8
  char *v13; // x9
  const void *v14; // x21
  char *v15; // x0
  size_t v16; // x20
  char *v17; // x10
  size_t v18; // x1

  v2 = a1;
  if ( *(_BYTE *)(a1 + 24) == 1 )
  {
    v4 = a2[1];
    v5 = (unsigned __int64)a2[2];
    v6 = *a2;
    if ( (unsigned __int64)(v4 + 1) > v5 )
    {
      v7 = v2;
      v8 = (unsigned __int64)(v4 + 993);
      if ( 2 * v5 <= v8 )
        v9 = v8;
      else
        v9 = 2 * v5;
      a2[2] = (char *)v9;
      v6 = (char *)realloc(v6, v9);
      *a2 = v6;
      if ( v6 == nullptr )
        abort();
      v4 = a2[1];
      v2 = v7;
    }
    v4[(_QWORD)v6] = 126;
    ++a2[1];
  }
  result = (void *)(*(__int64 (__fastcall **)(_QWORD))(**(_QWORD **)(v2 + 16) + 48LL))(*(_QWORD *)(v2 + 16));
  if ( v11 != 0 )
  {
    v12 = a2[1];
    v13 = a2[2];
    v14 = result;
    v15 = *a2;
    v16 = v11;
    v17 = &v12[v11];
    if ( &v12[v11] > v13 )
    {
      if ( 2 * (__int64)v13 <= (unsigned __int64)(v17 + 992) )
        v18 = (size_t)(v17 + 992);
      else
        v18 = 2LL * (_QWORD)v13;
      a2[2] = (char *)v18;
      v15 = (char *)realloc(v15, v18);
      *a2 = v15;
      if ( v15 == nullptr )
        abort();
      v12 = a2[1];
    }
    result = memcpy(&v12[(_QWORD)v15], v14, v16);
    a2[1] += v16;
  }
  return result;
}


// Address: 0x27628 | Function: sub_27628
void sub_27628()
{
  sub_13E30();
}


// Address: 0x27634 | Function: sub_27634
__int64 __fastcall sub_27634(__int64 a1, __int64 a2)
{
  __int64 v2; // x21
  __int64 v5; // x8
  unsigned __int64 v6; // x10
  void *v7; // x0
  __int64 v8; // x9
  unsigned __int64 v9; // x8
  size_t v10; // x1
  __int64 v11; // x20
  __int64 result; // x0

  v2 = *(_QWORD *)(a1 + 24);
  (*(void (__fastcall **)(__int64))(*(_QWORD *)v2 + 32LL))(v2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v2 + 40LL))(v2, a2);
  v5 = *(_QWORD *)(a2 + 8);
  v6 = *(_QWORD *)(a2 + 16);
  v7 = *(void **)a2;
  v8 = v5 + 1;
  if ( v5 + 1 > v6 )
  {
    v9 = v5 + 993;
    if ( 2 * v6 <= v9 )
      v10 = v9;
    else
      v10 = 2 * v6;
    *(_QWORD *)(a2 + 16) = v10;
    v7 = realloc(v7, v10);
    *(_QWORD *)a2 = v7;
    if ( v7 == nullptr )
      abort();
    v5 = *(_QWORD *)(a2 + 8);
    v8 = v5 + 1;
  }
  *(_QWORD *)(a2 + 8) = v8;
  *((_BYTE *)v7 + v5) = 64;
  v11 = *(_QWORD *)(a1 + 16);
  result = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v11 + 32LL))(v11, a2);
  if ( (*(_WORD *)(v11 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v11 + 40LL))(v11, a2);
  return result;
}


// Address: 0x27734 | Function: sub_27734
__int64 __fastcall sub_27734(__int64 a1)
{
  return (*(__int64 (__fastcall **)(_QWORD))(**(_QWORD **)(a1 + 24) + 48LL))(*(_QWORD *)(a1 + 24));
}


// Address: 0x27748 | Function: sub_27748
void sub_27748()
{
  sub_13E30();
}


// Address: 0x27754 | Function: sub_27754
__int64 __fastcall sub_27754(__int64 a1, char **a2)
{
  __int64 v2; // x21
  char *v5; // x8
  unsigned __int64 v6; // x9
  char *v7; // x0
  unsigned __int64 v8; // x9
  size_t v9; // x8
  size_t v10; // x1
  char *v11; // x8
  __int64 *v12; // x20
  __int64 v13; // x9
  __int64 result; // x0

  v2 = *(_QWORD *)(a1 + 16);
  (*(void (__fastcall **)(__int64))(*(_QWORD *)v2 + 32LL))(v2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v2 + 40LL))(v2, a2);
  v5 = a2[1];
  v6 = (unsigned __int64)a2[2];
  v7 = *a2;
  if ( (unsigned __int64)(v5 + 9) > v6 )
  {
    v8 = 2 * v6;
    v9 = (size_t)(v5 + 1001);
    if ( v8 <= v9 )
      v10 = v9;
    else
      v10 = v8;
    a2[2] = (char *)v10;
    v7 = (char *)realloc(v7, v10);
    *a2 = v7;
    if ( v7 == nullptr )
      abort();
    v5 = a2[1];
  }
  v11 = &v5[(_QWORD)v7];
  v11[8] = 32;
  *(_QWORD *)v11 = *(_QWORD *)"::friend ";
  v12 = *(__int64 **)(a1 + 24);
  v13 = *v12;
  a2[1] += 9;
  result = (*(__int64 (__fastcall **)(__int64 *, char **))(v13 + 32))(v12, a2);
  if ( (*(_WORD *)((_BYTE *)v12 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64 *, char **))(*v12 + 40))(v12, a2);
  return result;
}


// Address: 0x2786C | Function: sub_2786C
__int64 __fastcall sub_2786C(__int64 a1)
{
  return (*(__int64 (__fastcall **)(_QWORD))(**(_QWORD **)(a1 + 24) + 48LL))(*(_QWORD *)(a1 + 24));
}


// Address: 0x27880 | Function: sub_27880
void sub_27880()
{
  sub_13E30();
}


// Address: 0x2788C | Function: sub_2788C
__int64 __fastcall sub_2788C(__int64 a1, char **a2)
{
  __int64 v2; // x21
  char *v5; // x8
  unsigned __int64 v6; // x9
  char *v7; // x0
  unsigned __int64 v8; // x9
  size_t v9; // x8
  size_t v10; // x1
  __int64 *v11; // x20
  __int64 v12; // x9
  __int64 result; // x0

  v2 = *(_QWORD *)(a1 + 16);
  (*(void (__fastcall **)(__int64))(*(_QWORD *)v2 + 32LL))(v2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v2 + 40LL))(v2, a2);
  v5 = a2[1];
  v6 = (unsigned __int64)a2[2];
  v7 = *a2;
  if ( (unsigned __int64)(v5 + 2) > v6 )
  {
    v8 = 2 * v6;
    v9 = (size_t)(v5 + 994);
    if ( v8 <= v9 )
      v10 = v9;
    else
      v10 = v8;
    a2[2] = (char *)v10;
    v7 = (char *)realloc(v7, v10);
    *a2 = v7;
    if ( v7 == nullptr )
      abort();
    v5 = a2[1];
  }
  *(_WORD *)&v5[(_QWORD)v7] = 14906;
  v11 = *(__int64 **)(a1 + 24);
  v12 = *v11;
  a2[1] += 2;
  result = (*(__int64 (__fastcall **)(__int64 *, char **))(v12 + 32))(v11, a2);
  if ( (*(_WORD *)((_BYTE *)v11 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64 *, char **))(*v11 + 40))(v11, a2);
  return result;
}


// Address: 0x27990 | Function: sub_27990
__int64 __fastcall sub_27990(__int64 a1)
{
  return (*(__int64 (__fastcall **)(_QWORD))(**(_QWORD **)(a1 + 24) + 48LL))(*(_QWORD *)(a1 + 24));
}


// Address: 0x279A4 | Function: sub_279A4
void sub_279A4()
{
  sub_13E30();
}


// Address: 0x279B0 | Function: sub_279B0
unsigned __int8 *__fastcall sub_279B0(unsigned __int8 *result, unsigned __int8 *a2)
{
  int v2; // w8
  int v3; // w8
  unsigned __int8 *v4; // x8
  int v5; // w9
  unsigned __int8 *v6; // x8
  int v7; // t1

  if ( result != a2 )
  {
    v2 = *result;
    if ( v2 == 95 )
    {
      if ( result + 1 != a2 )
      {
        v3 = result[1];
        if ( (unsigned int)(v3 - 58) >= 0xFFFFFFF6 )
        {
          result += 2;
        }
        else if ( v3 == 95 )
        {
          v4 = result + 2;
          if ( result + 2 != a2 )
          {
            while ( 1 )
            {
              v5 = *v4;
              if ( (unsigned int)(v5 - 58) < 0xFFFFFFF6 )
                break;
              if ( ++v4 == a2 )
                return result;
            }
            if ( v5 == 95 )
              return v4 + 1;
          }
        }
      }
    }
    else if ( (unsigned int)(v2 - 58) >= 0xFFFFFFF6 )
    {
      v6 = result + 1;
      while ( v6 != a2 )
      {
        v7 = *v6++;
        if ( (unsigned int)(v7 - 58) <= 0xFFFFFFF5 )
          return result;
      }
      return a2;
    }
  }
  return result;
}


// Address: 0x27A60 | Function: sub_27A60
char *__fastcall sub_27A60(__int64 a1, char *s)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  char *v7; // x20
  size_t v8; // x0
  size_t v9; // x8
  __int16 v11; // w9

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v7 = (char *)v2 + v4;
  v2[1] = v4 + 32;
  v8 = strlen(s);
  *((_QWORD *)v7 + 2) = off_36BB8;
  v9 = v8;
  v11 = *(_WORD *)(v7 + 25) & 0xF000;
  v7[24] = 8;
  *((_QWORD *)v7 + 4) = s;
  *((_QWORD *)v7 + 5) = v9;
  *(_WORD *)(v7 + 25) = v11 | 0x540;
  return v7 + 16;
}


// Address: 0x27B0C | Function: sub_27B0C
__int64 __fastcall sub_27B0C(__int64 a1, __int64 *a2, __int64 *a3)
{
  _QWORD *v3; // x22
  __int64 v6; // x8
  _QWORD *v8; // x0
  __int64 result; // x0
  __int16 v10; // w8
  __int64 v11; // x9
  __int64 v12; // x10

  v3 = *(_QWORD **)(a1 + 4912);
  v6 = v3[1];
  if ( (unsigned __int64)(v6 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v8 = malloc(0x1000u);
    if ( v8 == nullptr )
      sub_13E4C();
    v6 = 0;
    *v8 = v3;
    v8[1] = 0;
    v3 = v8;
    *(_QWORD *)(a1 + 4912) = v8;
  }
  v3[1] = v6 + 32;
  *(_QWORD *)((char *)v3 + v6 + 16) = off_38968;
  result = (__int64)v3 + v6 + 16;
  v10 = *(_WORD *)((char *)v3 + v6 + 25);
  *(_BYTE *)(result + 8) = 26;
  v11 = *a2;
  v12 = *a3;
  *(_WORD *)(result + 9) = v10 & 0xF000 | 0x540;
  *(_QWORD *)(result + 16) = v11;
  *(_QWORD *)(result + 24) = v12;
  return result;
}


// Address: 0x27BB4 | Function: sub_27BB4
__int64 __fastcall sub_27BB4(__int64 a1, char **a2)
{
  __int64 v2; // x21
  char *v5; // x8
  unsigned __int64 v6; // x9
  char *v7; // x0
  unsigned __int64 v8; // x9
  size_t v9; // x8
  size_t v10; // x1
  __int64 *v11; // x20
  __int64 v12; // x9
  __int64 result; // x0

  v2 = *(_QWORD *)(a1 + 16);
  (*(void (__fastcall **)(__int64))(*(_QWORD *)v2 + 32LL))(v2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v2 + 40LL))(v2, a2);
  v5 = a2[1];
  v6 = (unsigned __int64)a2[2];
  v7 = *a2;
  if ( (unsigned __int64)(v5 + 2) > v6 )
  {
    v8 = 2 * v6;
    v9 = (size_t)(v5 + 994);
    if ( v8 <= v9 )
      v10 = v9;
    else
      v10 = v8;
    a2[2] = (char *)v10;
    v7 = (char *)realloc(v7, v10);
    *a2 = v7;
    if ( v7 == nullptr )
      abort();
    v5 = a2[1];
  }
  *(_WORD *)&v5[(_QWORD)v7] = 14906;
  v11 = *(__int64 **)(a1 + 24);
  v12 = *v11;
  a2[1] += 2;
  result = (*(__int64 (__fastcall **)(__int64 *, char **))(v12 + 32))(v11, a2);
  if ( (*(_WORD *)((_BYTE *)v11 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64 *, char **))(*v11 + 40))(v11, a2);
  return result;
}


// Address: 0x27CB8 | Function: sub_27CB8
void sub_27CB8()
{
  sub_13E30();
}


// Address: 0x27CC4 | Function: sub_27CC4
__int64 __fastcall sub_27CC4(__int64 a1, __int64 a2)
{
  unsigned __int64 v2; // x8
  __int64 v3; // x0
  unsigned int v4; // w8
  __int64 v6; // x9

  if ( *(_DWORD *)(a2 + 28) != -1 )
  {
    v2 = *(unsigned int *)(a2 + 24);
    if ( *(_QWORD *)(a1 + 24) > v2 )
      goto LABEL_3;
    return 0;
  }
  v6 = *(_QWORD *)(a1 + 24);
  v2 = 0;
  *(_DWORD *)(a2 + 24) = 0;
  *(_DWORD *)(a2 + 28) = v6;
  if ( v6 == 0 )
    return 0;
LABEL_3:
  v3 = *(_QWORD *)(*(_QWORD *)(a1 + 16) + 8 * v2);
  v4 = *(unsigned __int8 *)(v3 + 9);
  if ( (v4 & 0xC0) == 0x80 )
    return (**(__int64 (__fastcall ***)(__int64))v3)(v3);
  else
    return v4 < 0x40;
}


// Address: 0x27D30 | Function: sub_27D30
__int64 __fastcall sub_27D30(__int64 a1, __int64 a2)
{
  unsigned __int64 v2; // x8
  _BYTE *v3; // x0
  int v4; // w8
  __int64 v6; // x9

  if ( *(_DWORD *)(a2 + 28) != -1 )
  {
    v2 = *(unsigned int *)(a2 + 24);
    if ( *(_QWORD *)(a1 + 24) > v2 )
      goto LABEL_3;
    return 0;
  }
  v6 = *(_QWORD *)(a1 + 24);
  v2 = 0;
  *(_DWORD *)(a2 + 24) = 0;
  *(_DWORD *)(a2 + 28) = v6;
  if ( v6 == 0 )
    return 0;
LABEL_3:
  v3 = *(_BYTE **)(*(_QWORD *)(a1 + 16) + 8 * v2);
  v4 = v3[10] & 3;
  if ( v4 == 2 )
    return (*(__int64 (__fastcall **)(_BYTE *))(*(_QWORD *)v3 + 8LL))(v3);
  else
    return v4 == 0;
}


// Address: 0x27D9C | Function: sub_27D9C
__int64 __fastcall sub_27D9C(__int64 a1, __int64 a2)
{
  unsigned __int64 v2; // x8
  __int64 v3; // x0
  int v4; // w8
  __int64 v6; // x9

  if ( *(_DWORD *)(a2 + 28) != -1 )
  {
    v2 = *(unsigned int *)(a2 + 24);
    if ( *(_QWORD *)(a1 + 24) > v2 )
      goto LABEL_3;
    return 0;
  }
  v6 = *(_QWORD *)(a1 + 24);
  v2 = 0;
  *(_DWORD *)(a2 + 24) = 0;
  *(_DWORD *)(a2 + 28) = v6;
  if ( v6 == 0 )
    return 0;
LABEL_3:
  v3 = *(_QWORD *)(*(_QWORD *)(a1 + 16) + 8 * v2);
  v4 = (*(unsigned __int16 *)(v3 + 9) >> 10) & 3;
  if ( v4 == 2 )
    return (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v3 + 16LL))(v3);
  else
    return v4 == 0;
}


// Address: 0x27E08 | Function: sub_27E08
__int64 __fastcall sub_27E08(__int64 result, __int64 a2)
{
  unsigned __int64 v2; // x8
  __int64 v3; // x0
  __int64 v4; // x9

  if ( *(_DWORD *)(a2 + 28) != -1 )
  {
    v2 = *(unsigned int *)(a2 + 24);
    if ( *(_QWORD *)(result + 24) <= v2 )
      return result;
    goto LABEL_3;
  }
  v4 = *(_QWORD *)(result + 24);
  v2 = 0;
  *(_DWORD *)(a2 + 24) = 0;
  *(_DWORD *)(a2 + 28) = v4;
  if ( v4 != 0 )
  {
LABEL_3:
    v3 = *(_QWORD *)(*(_QWORD *)(result + 16) + 8 * v2);
    return (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v3 + 24LL))(v3);
  }
  return result;
}


// Address: 0x27E54 | Function: sub_27E54
__int64 __fastcall sub_27E54(__int64 result, __int64 a2)
{
  unsigned __int64 v2; // x8
  __int64 v3; // x0
  __int64 v4; // x9

  if ( *(_DWORD *)(a2 + 28) != -1 )
  {
    v2 = *(unsigned int *)(a2 + 24);
    if ( *(_QWORD *)(result + 24) <= v2 )
      return result;
    goto LABEL_3;
  }
  v4 = *(_QWORD *)(result + 24);
  v2 = 0;
  *(_DWORD *)(a2 + 24) = 0;
  *(_DWORD *)(a2 + 28) = v4;
  if ( v4 != 0 )
  {
LABEL_3:
    v3 = *(_QWORD *)(*(_QWORD *)(result + 16) + 8 * v2);
    return (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v3 + 32LL))(v3);
  }
  return result;
}


// Address: 0x27EA0 | Function: sub_27EA0
__int64 __fastcall sub_27EA0(__int64 result, __int64 a2)
{
  unsigned __int64 v2; // x8
  __int64 v3; // x0
  __int64 v4; // x9

  if ( *(_DWORD *)(a2 + 28) != -1 )
  {
    v2 = *(unsigned int *)(a2 + 24);
    if ( *(_QWORD *)(result + 24) <= v2 )
      return result;
    goto LABEL_3;
  }
  v4 = *(_QWORD *)(result + 24);
  v2 = 0;
  *(_DWORD *)(a2 + 24) = 0;
  *(_DWORD *)(a2 + 28) = v4;
  if ( v4 != 0 )
  {
LABEL_3:
    v3 = *(_QWORD *)(*(_QWORD *)(result + 16) + 8 * v2);
    return (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v3 + 40LL))(v3);
  }
  return result;
}


// Address: 0x27EEC | Function: sub_27EEC
void sub_27EEC()
{
  sub_13E30();
}


// Address: 0x27EF8 | Function: sub_27EF8
void *__fastcall sub_27EF8(__int64 a1, __int64 a2)
{
  __int64 v2; // x8
  unsigned __int64 v3; // x9
  void *v5; // x0
  int v6; // w21
  unsigned __int64 v8; // x9
  size_t v9; // x8
  size_t v10; // x1
  __int64 v11; // x8
  unsigned __int64 v12; // x9
  void *result; // x0
  unsigned __int64 v14; // x9
  size_t v15; // x8
  size_t v16; // x1

  v2 = *(_QWORD *)(a2 + 8);
  v3 = *(_QWORD *)(a2 + 16);
  v5 = *(void **)a2;
  v6 = *(_DWORD *)(a2 + 32);
  *(_DWORD *)(a2 + 32) = 0;
  if ( v2 + 1 > v3 )
  {
    v8 = 2 * v3;
    v9 = v2 + 993;
    if ( v8 <= v9 )
      v10 = v9;
    else
      v10 = v8;
    *(_QWORD *)(a2 + 16) = v10;
    v5 = realloc(v5, v10);
    *(_QWORD *)a2 = v5;
    if ( v5 == nullptr )
      abort();
    v2 = *(_QWORD *)(a2 + 8);
  }
  *((_BYTE *)v5 + v2) = 60;
  ++*(_QWORD *)(a2 + 8);
  sub_1F824((_QWORD *)(a1 + 16), a2);
  v11 = *(_QWORD *)(a2 + 8);
  v12 = *(_QWORD *)(a2 + 16);
  result = *(void **)a2;
  if ( v11 + 1 > v12 )
  {
    v14 = 2 * v12;
    v15 = v11 + 993;
    if ( v14 <= v15 )
      v16 = v15;
    else
      v16 = v14;
    *(_QWORD *)(a2 + 16) = v16;
    result = realloc(result, v16);
    *(_QWORD *)a2 = result;
    if ( result == nullptr )
      abort();
    v11 = *(_QWORD *)(a2 + 8);
  }
  *((_BYTE *)result + v11) = 62;
  ++*(_QWORD *)(a2 + 8);
  *(_DWORD *)(a2 + 32) = v6;
  return result;
}


// Address: 0x27FE0 | Function: sub_27FE0
void __fastcall __noreturn sub_27FE0(__int64 a1)
{
  __int64 v1; // x19
  int v2; // w21

  *(_DWORD *)(v1 + 32) = v2;
  sub_2E950(a1);
}


// Address: 0x27FE8 | Function: sub_27FE8
void sub_27FE8()
{
  sub_13E30();
}


// Address: 0x27FF4 | Function: sub_27FF4
__int64 __fastcall sub_27FF4(__int64 a1, __int64 a2)
{
  __int64 v2; // x21
  __int64 v5; // x20
  __int64 result; // x0

  v2 = *(_QWORD *)(a1 + 16);
  (*(void (__fastcall **)(__int64))(*(_QWORD *)v2 + 32LL))(v2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v2 + 40LL))(v2, a2);
  v5 = *(_QWORD *)(a1 + 24);
  result = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v5 + 32LL))(v5, a2);
  if ( (*(_WORD *)(v5 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v5 + 40LL))(v5, a2);
  return result;
}


// Address: 0x280A8 | Function: sub_280A8
__int64 __fastcall sub_280A8(__int64 a1)
{
  return (*(__int64 (__fastcall **)(_QWORD))(**(_QWORD **)(a1 + 16) + 48LL))(*(_QWORD *)(a1 + 16));
}


// Address: 0x280BC | Function: sub_280BC
void sub_280BC()
{
  sub_13E30();
}


// Address: 0x280C8 | Function: sub_280C8
_QWORD *__fastcall sub_280C8(__int64 a1, __int64 a2)
{
  return sub_1F824((_QWORD *)(a1 + 16), a2);
}


// Address: 0x280D4 | Function: sub_280D4
void sub_280D4()
{
  sub_13E30();
}


// Address: 0x280E0 | Function: sub_280E0
__int64 __fastcall sub_280E0(__int64 a1, __int64 a2)
{
  __int64 v2; // x19
  __int64 result; // x0

  v2 = *(_QWORD *)(a1 + 24);
  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v2 + 32LL))(v2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v2 + 40LL))(v2, a2);
  return result;
}


// Address: 0x28148 | Function: sub_28148
void sub_28148()
{
  sub_13E30();
}


// Address: 0x28154 | Function: sub_28154
void *__fastcall sub_28154(__int64 a1, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  void *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  char *v12; // x8
  char *v13; // x8
  unsigned __int64 v14; // x10
  void *result; // x0
  void *v16; // x9
  unsigned __int64 v17; // x8
  size_t v18; // x1

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  if ( (unsigned __int64)(v2 + 12) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 1004);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (void *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = v11;
  }
  v12 = &v2[(_QWORD)v5];
  *(_QWORD *)v12 = *(_QWORD *)" [enable_if:";
  *((_DWORD *)v12 + 2) = 979790175;
  a2[1] = (char *)a2[1] + 12;
  sub_1F824((_QWORD *)(a1 + 16), (__int64)a2);
  v13 = (char *)a2[1];
  v14 = (unsigned __int64)a2[2];
  result = *a2;
  v16 = v13 + 1;
  if ( (unsigned __int64)(v13 + 1) > v14 )
  {
    v17 = (unsigned __int64)(v13 + 993);
    if ( 2 * v14 <= v17 )
      v18 = v17;
    else
      v18 = 2 * v14;
    a2[2] = (void *)v18;
    result = realloc(result, v18);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v13 = (char *)a2[1];
    v16 = v13 + 1;
  }
  a2[1] = v16;
  v13[(_QWORD)result] = 93;
  return result;
}


// Address: 0x28244 | Function: sub_28244
void sub_28244()
{
  sub_13E30();
}


// Address: 0x28250 | Function: sub_28250
__int64 __fastcall sub_28250(__int64 a1, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  void *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  char *v12; // x8
  __int64 *v13; // x20
  __int64 v14; // x9
  __int64 result; // x0

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  if ( (unsigned __int64)(v2 + 5) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 997);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (void *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = v11;
  }
  v12 = &v2[(_QWORD)v5];
  v12[4] = 32;
  *(_DWORD *)v12 = 1936287860;
  v13 = *(__int64 **)(a1 + 16);
  v14 = *v13;
  a2[1] = (char *)a2[1] + 5;
  result = (*(__int64 (__fastcall **)(__int64 *, void **))(v14 + 32))(v13, a2);
  if ( (*(_WORD *)((_BYTE *)v13 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64 *, void **))(*v13 + 40))(v13, a2);
  return result;
}


// Address: 0x28328 | Function: sub_28328
void sub_28328()
{
  sub_13E30();
}


// Address: 0x28334 | Function: sub_28334
__int64 sub_28334()
{
  return 1;
}


// Address: 0x28340 | Function: sub_28340
__int64 sub_28340()
{
  return 1;
}


// Address: 0x2834C | Function: sub_2834C
__int64 __fastcall sub_2834C(__int64 a1, __int64 a2)
{
  __int64 v3; // x0
  __int64 v5; // x0
  unsigned int v6; // w8
  __int64 v7; // x8
  unsigned __int64 v8; // x9
  void *v9; // x0
  unsigned __int64 v10; // x9
  size_t v11; // x8
  size_t v12; // x1
  __int64 v13; // x20
  __int64 result; // x0

  v3 = *(_QWORD *)(a1 + 16);
  if ( v3 == 0 )
    goto LABEL_13;
  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v3 + 32LL))(v3, a2);
  v5 = *(_QWORD *)(a1 + 16);
  v6 = *(unsigned __int8 *)(v5 + 9);
  if ( (v6 & 0xC0) == 0x80 )
  {
    if ( ((**(__int64 (__fastcall ***)(__int64, __int64))v5)(v5, a2) & 1) != 0 )
      goto LABEL_13;
  }
  else if ( v6 < 0x40 )
  {
    goto LABEL_13;
  }
  v7 = *(_QWORD *)(a2 + 8);
  v8 = *(_QWORD *)(a2 + 16);
  v9 = *(void **)a2;
  if ( v7 + 1 > v8 )
  {
    v10 = 2 * v8;
    v11 = v7 + 993;
    if ( v10 <= v11 )
      v12 = v11;
    else
      v12 = v10;
    *(_QWORD *)(a2 + 16) = v12;
    v9 = realloc(v9, v12);
    *(_QWORD *)a2 = v9;
    if ( v9 == nullptr )
      abort();
    v7 = *(_QWORD *)(a2 + 8);
  }
  *((_BYTE *)v9 + v7) = 32;
  ++*(_QWORD *)(a2 + 8);
LABEL_13:
  v13 = *(_QWORD *)(a1 + 24);
  result = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v13 + 32LL))(v13, a2);
  if ( (*(_WORD *)(v13 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v13 + 40LL))(v13, a2);
  return result;
}


// Address: 0x28458 | Function: sub_28458
char *__fastcall sub_28458(__int64 a1, __int64 a2)
{
  __int64 v2; // x8
  unsigned __int64 v3; // x10
  char *v5; // x0
  __int64 v7; // x9
  unsigned __int64 v8; // x8
  size_t v9; // x1
  __int64 v10; // x8
  unsigned __int64 v11; // x10
  char *v12; // x0
  __int64 v13; // x9
  unsigned __int64 v14; // x8
  size_t v15; // x1
  char *result; // x0
  int v17; // w8
  __int64 v18; // x8
  unsigned __int64 v19; // x9
  unsigned __int64 v20; // x9
  size_t v21; // x8
  size_t v22; // x1
  char *v23; // x8
  __int64 v24; // x8
  unsigned __int64 v25; // x9
  unsigned __int64 v26; // x9
  size_t v27; // x8
  size_t v28; // x1
  char *v29; // x8
  __int64 v30; // x8
  unsigned __int64 v31; // x9
  unsigned __int64 v32; // x9
  size_t v33; // x8
  size_t v34; // x1
  char *v35; // x8
  int v36; // w8
  __int64 v37; // x8
  unsigned __int64 v38; // x9
  unsigned __int64 v39; // x9
  size_t v40; // x8
  size_t v41; // x1
  __int64 v42; // x8
  __int64 v43; // x8
  unsigned __int64 v44; // x9
  unsigned __int64 v45; // x9
  size_t v46; // x8
  size_t v47; // x1
  char *v48; // x8
  __int64 v49; // x21
  __int64 v50; // x8
  unsigned __int64 v51; // x9
  char *v52; // x0
  unsigned __int64 v53; // x9
  size_t v54; // x8
  size_t v55; // x1
  char *v56; // x8
  __int64 *v57; // x20
  __int64 v58; // x9

  v2 = *(_QWORD *)(a2 + 8);
  v3 = *(_QWORD *)(a2 + 16);
  v5 = *(char **)a2;
  v7 = v2 + 1;
  ++*(_DWORD *)(a2 + 32);
  if ( v2 + 1 > v3 )
  {
    v8 = v2 + 993;
    if ( 2 * v3 <= v8 )
      v9 = v8;
    else
      v9 = 2 * v3;
    *(_QWORD *)(a2 + 16) = v9;
    v5 = (char *)realloc(v5, v9);
    *(_QWORD *)a2 = v5;
    if ( v5 == nullptr )
      abort();
    v2 = *(_QWORD *)(a2 + 8);
    v7 = v2 + 1;
  }
  *(_QWORD *)(a2 + 8) = v7;
  v5[v2] = 40;
  sub_1F824((_QWORD *)(a1 + 32), a2);
  v10 = *(_QWORD *)(a2 + 8);
  v11 = *(_QWORD *)(a2 + 16);
  v12 = *(char **)a2;
  v13 = v10 + 1;
  --*(_DWORD *)(a2 + 32);
  if ( v10 + 1 > v11 )
  {
    v14 = v10 + 993;
    if ( 2 * v11 <= v14 )
      v15 = v14;
    else
      v15 = 2 * v11;
    *(_QWORD *)(a2 + 16) = v15;
    v12 = (char *)realloc(v12, v15);
    *(_QWORD *)a2 = v12;
    if ( v12 == nullptr )
      abort();
    v10 = *(_QWORD *)(a2 + 8);
    v13 = v10 + 1;
  }
  *(_QWORD *)(a2 + 8) = v13;
  v12[v10] = 41;
  result = *(char **)(a1 + 16);
  if ( result != nullptr )
    result = (char *)(*(__int64 (__fastcall **)(char *, __int64))(*(_QWORD *)result + 40LL))(result, a2);
  v17 = *(_DWORD *)(a1 + 64);
  if ( (v17 & 1) != 0 )
  {
    v18 = *(_QWORD *)(a2 + 8);
    v19 = *(_QWORD *)(a2 + 16);
    result = *(char **)a2;
    if ( v18 + 6 > v19 )
    {
      v20 = 2 * v19;
      v21 = v18 + 998;
      if ( v20 <= v21 )
        v22 = v21;
      else
        v22 = v20;
      *(_QWORD *)(a2 + 16) = v22;
      result = (char *)realloc(result, v22);
      *(_QWORD *)a2 = result;
      if ( result == nullptr )
        abort();
      v18 = *(_QWORD *)(a2 + 8);
    }
    v23 = &result[v18];
    *((_WORD *)v23 + 2) = 29811;
    *(_DWORD *)v23 = 1852793632;
    v17 = *(_DWORD *)(a1 + 64);
    *(_QWORD *)(a2 + 8) += 6LL;
  }
  if ( (v17 & 2) != 0 )
  {
    v24 = *(_QWORD *)(a2 + 8);
    v25 = *(_QWORD *)(a2 + 16);
    result = *(char **)a2;
    if ( v24 + 9 > v25 )
    {
      v26 = 2 * v25;
      v27 = v24 + 1001;
      if ( v26 <= v27 )
        v28 = v27;
      else
        v28 = v26;
      *(_QWORD *)(a2 + 16) = v28;
      result = (char *)realloc(result, v28);
      *(_QWORD *)a2 = result;
      if ( result == nullptr )
        abort();
      v24 = *(_QWORD *)(a2 + 8);
    }
    v29 = &result[v24];
    v29[8] = 101;
    *(_QWORD *)v29 = *(_QWORD *)" volatile";
    v17 = *(_DWORD *)(a1 + 64);
    *(_QWORD *)(a2 + 8) += 9LL;
  }
  if ( (v17 & 4) != 0 )
  {
    v30 = *(_QWORD *)(a2 + 8);
    v31 = *(_QWORD *)(a2 + 16);
    result = *(char **)a2;
    if ( v30 + 9 > v31 )
    {
      v32 = 2 * v31;
      v33 = v30 + 1001;
      if ( v32 <= v33 )
        v34 = v33;
      else
        v34 = v32;
      *(_QWORD *)(a2 + 16) = v34;
      result = (char *)realloc(result, v34);
      *(_QWORD *)a2 = result;
      if ( result == nullptr )
        abort();
      v30 = *(_QWORD *)(a2 + 8);
    }
    v35 = &result[v30];
    v35[8] = 116;
    *(_QWORD *)v35 = *(_QWORD *)" restrict";
    *(_QWORD *)(a2 + 8) += 9LL;
  }
  v36 = *(unsigned __int8 *)(a1 + 68);
  if ( v36 == 2 )
  {
    v43 = *(_QWORD *)(a2 + 8);
    v44 = *(_QWORD *)(a2 + 16);
    result = *(char **)a2;
    if ( v43 + 3 > v44 )
    {
      v45 = 2 * v44;
      v46 = v43 + 995;
      if ( v45 <= v46 )
        v47 = v46;
      else
        v47 = v45;
      *(_QWORD *)(a2 + 16) = v47;
      result = (char *)realloc(result, v47);
      *(_QWORD *)a2 = result;
      if ( result == nullptr )
        abort();
      v43 = *(_QWORD *)(a2 + 8);
    }
    v48 = &result[v43];
    v48[2] = 38;
    *(_WORD *)v48 = 9760;
    v42 = 3;
    goto LABEL_55;
  }
  if ( v36 == 1 )
  {
    v37 = *(_QWORD *)(a2 + 8);
    v38 = *(_QWORD *)(a2 + 16);
    result = *(char **)a2;
    if ( v37 + 2 > v38 )
    {
      v39 = 2 * v38;
      v40 = v37 + 994;
      if ( v39 <= v40 )
        v41 = v40;
      else
        v41 = v39;
      *(_QWORD *)(a2 + 16) = v41;
      result = (char *)realloc(result, v41);
      *(_QWORD *)a2 = result;
      if ( result == nullptr )
        abort();
      v37 = *(_QWORD *)(a2 + 8);
    }
    *(_WORD *)&result[v37] = 9760;
    v42 = 2;
LABEL_55:
    *(_QWORD *)(a2 + 8) += v42;
  }
  v49 = *(_QWORD *)(a1 + 48);
  if ( v49 != 0 )
  {
    result = (char *)(*(__int64 (__fastcall **)(_QWORD, __int64))(*(_QWORD *)v49 + 32LL))(*(_QWORD *)(a1 + 48), a2);
    if ( (*(_WORD *)(v49 + 9) & 0xC0) != 0x40 )
      result = (char *)(*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v49 + 40LL))(v49, a2);
  }
  if ( *(_QWORD *)(a1 + 56) != 0 )
  {
    v50 = *(_QWORD *)(a2 + 8);
    v51 = *(_QWORD *)(a2 + 16);
    v52 = *(char **)a2;
    if ( v50 + 10 > v51 )
    {
      v53 = 2 * v51;
      v54 = v50 + 1002;
      if ( v53 <= v54 )
        v55 = v54;
      else
        v55 = v53;
      *(_QWORD *)(a2 + 16) = v55;
      v52 = (char *)realloc(v52, v55);
      *(_QWORD *)a2 = v52;
      if ( v52 == nullptr )
        abort();
      v50 = *(_QWORD *)(a2 + 8);
    }
    v56 = &v52[v50];
    *((_WORD *)v56 + 4) = 8307;
    *(_QWORD *)v56 = *(_QWORD *)" requires ";
    v57 = *(__int64 **)(a1 + 56);
    v58 = *v57;
    *(_QWORD *)(a2 + 8) += 10LL;
    result = (char *)(*(__int64 (__fastcall **)(__int64 *, __int64))(v58 + 32))(v57, a2);
    if ( (*(_WORD *)((_BYTE *)v57 + 9) & 0xC0) != 0x40 )
      return (char *)(*(__int64 (__fastcall **)(__int64 *, __int64))(*v57 + 40))(v57, a2);
  }
  return result;
}


// Address: 0x28854 | Function: sub_28854
void sub_28854()
{
  sub_13E30();
}


// Address: 0x28860 | Function: sub_28860
char *__fastcall sub_28860(_QWORD *a1, char **a2)
{
  __int64 v2; // x21
  char *v5; // x8
  unsigned __int64 v6; // x9
  char *v7; // x0
  unsigned __int64 v8; // x9
  size_t v9; // x8
  size_t v10; // x1
  __int64 v11; // x8
  size_t v12; // x21
  size_t v13; // x10
  const void *v14; // x20
  char *v15; // x0
  size_t v16; // x1
  unsigned __int64 v17; // x9
  char *result; // x0
  unsigned __int64 v19; // x9
  size_t v20; // x8
  size_t v21; // x1

  v2 = a1[2];
  (*(void (__fastcall **)(__int64))(*(_QWORD *)v2 + 32LL))(v2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v2 + 40LL))(v2, a2);
  v5 = a2[1];
  v6 = (unsigned __int64)a2[2];
  v7 = *a2;
  if ( (unsigned __int64)(v5 + 2) > v6 )
  {
    v8 = 2 * v6;
    v9 = (size_t)(v5 + 994);
    if ( v8 <= v9 )
      v10 = v9;
    else
      v10 = v8;
    a2[2] = (char *)v10;
    v7 = (char *)realloc(v7, v10);
    *a2 = v7;
    if ( v7 == nullptr )
      abort();
    v5 = a2[1];
  }
  *(_WORD *)&v5[(_QWORD)v7] = 10272;
  v11 = (__int64)(a2[1] + 2);
  a2[1] = (char *)v11;
  v12 = a1[4];
  if ( v12 != 0 )
  {
    v13 = (size_t)a2[2];
    v14 = (const void *)a1[3];
    v15 = *a2;
    if ( v11 + v12 > v13 )
    {
      if ( 2 * v13 <= v11 + v12 + 992 )
        v16 = v11 + v12 + 992;
      else
        v16 = 2 * v13;
      a2[2] = (char *)v16;
      v15 = (char *)realloc(v15, v16);
      *a2 = v15;
      if ( v15 == nullptr )
        abort();
      v11 = (__int64)a2[1];
    }
    memcpy(&v15[v11], v14, v12);
    v11 = (__int64)&a2[1][v12];
    a2[1] = (char *)v11;
  }
  v17 = (unsigned __int64)a2[2];
  result = *a2;
  if ( v11 + 1 > v17 )
  {
    v19 = 2 * v17;
    v20 = v11 + 993;
    if ( v19 <= v20 )
      v21 = v20;
    else
      v21 = v19;
    a2[2] = (char *)v21;
    result = (char *)realloc(result, v21);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v11 = (__int64)a2[1];
  }
  result[v11] = 41;
  ++a2[1];
  return result;
}


// Address: 0x289CC | Function: sub_289CC
void sub_289CC()
{
  sub_13E30();
}


// Address: 0x289D8 | Function: sub_289D8
__int64 __fastcall sub_289D8(__int64 a1, size_t a2)
{
  _BYTE *v2; // x8
  _BYTE *v3; // x9
  int v5; // w25
  __int64 v6; // x26
  __int64 v7; // x10
  __int64 v8; // x11
  _BYTE *v9; // x9
  __int64 *v10; // x24
  unsigned __int64 v11; // x20
  char *v12; // x0
  __int64 *v13; // x23
  char *v14; // x8
  __int64 result; // x0
  __int64 *v16; // x22
  __int64 v17; // x26
  __int64 v18; // x21
  size_t v19; // x2
  char *v20; // x23
  _QWORD *v21; // x20
  __int64 v22; // x8
  _QWORD *v23; // x0
  __int16 v24; // w8
  _BYTE *v25; // x9
  _QWORD *v26; // x20
  __int64 v27; // x8
  __int64 v28; // x21
  _QWORD *v29; // x0
  __int16 v30; // w8
  char v31; // w9
  char *v32; // x0
  _QWORD *v33; // x22
  char *v34; // x20
  size_t v35; // x21
  __int64 v36; // x8
  _QWORD *v37; // x0
  _BYTE *v38; // x8
  _BYTE *v39; // x9
  size_t v40; // x1
  __int64 *v41; // x28
  char *v42; // x0
  __int64 *v43; // x24
  char *v44; // x8
  _BYTE *v45; // x8
  __int64 v46; // x9
  __int64 *v47; // x23
  __int64 v48; // x20
  __int64 v49; // x22
  size_t v50; // x2
  char *v51; // x24
  char v52; // w23
  __int64 v53; // x9
  char *v54; // x0
  _QWORD *v55; // x20
  char *v56; // x21
  __int64 v57; // x1
  __int64 v58; // x22
  __int64 v59; // x8
  _QWORD *v60; // x0
  __int16 v61; // w8
  __int64 v62; // [xsp+0h] [xbp-10h]
  unsigned __int64 v63; // [xsp+8h] [xbp-8h]

  v3 = *(_BYTE **)a1;
  v2 = *(_BYTE **)(a1 + 8);
  if ( *(_BYTE **)a1 == v2 || *v3 != 114 )
  {
    v5 = 0;
    if ( v3 == v2 )
      goto LABEL_8;
  }
  else
  {
    ++v3;
    v5 = 4;
    *(_QWORD *)a1 = v3;
    if ( v3 == v2 )
      goto LABEL_8;
  }
  if ( *v3 == 86 )
  {
    ++v3;
    v5 |= 2u;
    *(_QWORD *)a1 = v3;
  }
LABEL_8:
  if ( v3 != v2 && *v3 == 75 )
  {
    ++v3;
    v5 |= 1u;
    *(_QWORD *)a1 = v3;
  }
  if ( (unsigned __int64)(v2 - v3) < 2 )
    goto LABEL_12;
  if ( *(_WORD *)v3 != 28484 )
  {
    if ( *(_WORD *)v3 == 20292 )
    {
      *(_QWORD *)a1 = v3 + 2;
      result = sub_1A440(a1, a2);
      if ( result == 0 )
        return result;
      v25 = *(_BYTE **)a1;
      if ( *(_QWORD *)a1 == *(_QWORD *)(a1 + 8) || *v25 != 69 )
        return 0;
      v26 = *(_QWORD **)(a1 + 4912);
      *(_QWORD *)a1 = v25 + 1;
      v27 = v26[1];
      if ( (unsigned __int64)(v27 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v28 = result;
        v29 = malloc(0x1000u);
        if ( v29 == nullptr )
          goto LABEL_85;
        v27 = 0;
        *v29 = v26;
        v29[1] = 0;
        v26 = v29;
        *(_QWORD *)(a1 + 4912) = v29;
        result = v28;
      }
      v26[1] = v27 + 32;
      *(_QWORD *)((char *)v26 + v27 + 16) = off_38DC8;
      v6 = (__int64)v26 + v27 + 16;
      v30 = *(_WORD *)((char *)v26 + v27 + 25);
      v31 = 17;
      *(_QWORD *)(v6 + 16) = result;
    }
    else
    {
      if ( *(_WORD *)v3 != 30532 )
      {
LABEL_12:
        v6 = 0;
        goto LABEL_45;
      }
      v8 = *(_QWORD *)(a1 + 16);
      v7 = *(_QWORD *)(a1 + 24);
      v9 = v3 + 2;
      v10 = (__int64 *)(a1 + 40);
      *(_QWORD *)a1 = v9;
      v11 = (v7 - v8) >> 3;
      while ( v9 == v2 || *v9 != 69 )
      {
        result = sub_1544C(a1, a2);
        if ( result == 0 )
          return result;
        v13 = *(__int64 **)(a1 + 24);
        if ( v13 == *(__int64 **)(a1 + 32) )
        {
          v16 = *(__int64 **)(a1 + 16);
          v17 = result;
          v18 = (char *)v13 - (char *)v16;
          if ( v16 == v10 )
          {
            v12 = (char *)malloc(2 * ((char *)v13 - (char *)v16));
            if ( v12 == nullptr )
              abort();
            if ( v13 != v10 )
            {
              v19 = (char *)v13 - (char *)v16;
              v20 = v12;
              memmove(v12, v16, v19);
              v12 = v20;
            }
            *(_QWORD *)(a1 + 16) = v12;
          }
          else
          {
            v12 = (char *)realloc(*(void **)(a1 + 16), 2 * ((char *)v13 - (char *)v16));
            *(_QWORD *)(a1 + 16) = v12;
            if ( v12 == nullptr )
              abort();
          }
          v13 = (__int64 *)&v12[v18];
          v14 = &v12[8 * (v18 >> 2)];
          result = v17;
          *(_QWORD *)(a1 + 32) = v14;
        }
        *(_QWORD *)(a1 + 24) = v13 + 1;
        *v13 = result;
        v9 = *(_BYTE **)a1;
        v2 = *(_BYTE **)(a1 + 8);
      }
      *(_QWORD *)a1 = v9 + 1;
      v32 = sub_17574((_QWORD *)a1, v11);
      v33 = *(_QWORD **)(a1 + 4912);
      v34 = v32;
      v35 = a2;
      v36 = v33[1];
      if ( (unsigned __int64)(v36 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v37 = malloc(0x1000u);
        if ( v37 == nullptr )
          goto LABEL_85;
        v36 = 0;
        *v37 = v33;
        v37[1] = 0;
        v33 = v37;
        *(_QWORD *)(a1 + 4912) = v37;
      }
      v33[1] = v36 + 32;
      *(_QWORD *)((char *)v33 + v36 + 16) = off_38E38;
      v6 = (__int64)v33 + v36 + 16;
      v30 = *(_WORD *)((char *)v33 + v36 + 25);
      v31 = 18;
      *(_QWORD *)(v6 + 16) = v34;
      *(_QWORD *)(v6 + 24) = v35;
    }
    *(_BYTE *)(v6 + 8) = v31;
    *(_WORD *)(v6 + 9) = v30 & 0xF000 | 0x540;
    goto LABEL_45;
  }
  v21 = *(_QWORD **)(a1 + 4912);
  *(_QWORD *)a1 = v3 + 2;
  v22 = v21[1];
  if ( (unsigned __int64)(v22 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v23 = malloc(0x1000u);
    if ( v23 == nullptr )
      goto LABEL_85;
    v22 = 0;
    *v23 = v21;
    v23[1] = 0;
    v21 = v23;
    *(_QWORD *)(a1 + 4912) = v23;
  }
  v21[1] = v22 + 32;
  *(_QWORD *)((char *)v21 + v22 + 16) = off_36BB8;
  v6 = (__int64)v21 + v22 + 16;
  v24 = *(_WORD *)((_BYTE *)v21 + v22 + 25) & 0xF000;
  *(_BYTE *)(v6 + 8) = 8;
  *(_WORD *)(v6 + 9) = v24 | 0x540;
  *(_QWORD *)(v6 + 16) = "noexcept";
  *(_QWORD *)(v6 + 24) = 8;
LABEL_45:
  v38 = *(_BYTE **)a1;
  v39 = *(_BYTE **)(a1 + 8);
  if ( (unsigned __int64)&v39[-*(_QWORD *)a1] >= 2 && *(_WORD *)v38 == 30788 )
  {
    v38 += 2;
    *(_QWORD *)a1 = v38;
    if ( v38 == v39 )
      return 0;
  }
  else if ( v38 == v39 )
  {
    return 0;
  }
  if ( *v38 != 70 )
    return 0;
  *(_QWORD *)a1 = v38 + 1;
  if ( v38 + 1 != v39 && v38[1] == 89 )
    *(_QWORD *)a1 = v38 + 2;
  result = sub_1544C(a1, a2);
  if ( result != 0 )
  {
    v41 = (__int64 *)(a1 + 40);
    v62 = result;
    v63 = (__int64)(*(_QWORD *)(a1 + 24) - *(_QWORD *)(a1 + 16)) >> 3;
    while ( 1 )
    {
      while ( 1 )
      {
        v45 = *(_BYTE **)a1;
        v46 = *(_QWORD *)(a1 + 8);
        if ( *(_QWORD *)a1 == v46 )
          break;
        if ( *v45 == 69 )
        {
          v52 = 0;
          v53 = 1;
          goto LABEL_77;
        }
        if ( *v45 != 118 )
          break;
        *(_QWORD *)a1 = v45 + 1;
      }
      if ( (unsigned __int64)(v46 - (_QWORD)v45) >= 2 )
      {
        if ( *(_WORD *)v45 == 17746 )
        {
          v52 = 1;
          v53 = 2;
          goto LABEL_77;
        }
        if ( *(_WORD *)v45 == 17743 )
          break;
      }
      result = sub_1544C(a1, v40);
      if ( result == 0 )
        return result;
      v43 = *(__int64 **)(a1 + 24);
      if ( v43 == *(__int64 **)(a1 + 32) )
      {
        v47 = *(__int64 **)(a1 + 16);
        v48 = result;
        v49 = (char *)v43 - (char *)v47;
        if ( v47 == v41 )
        {
          v42 = (char *)malloc(2 * ((char *)v43 - (char *)v47));
          if ( v42 == nullptr )
            abort();
          if ( v43 != v41 )
          {
            v50 = (char *)v43 - (char *)v47;
            v51 = v42;
            memmove(v42, v47, v50);
            v42 = v51;
          }
          *(_QWORD *)(a1 + 16) = v42;
        }
        else
        {
          v42 = (char *)realloc(*(void **)(a1 + 16), 2 * ((char *)v43 - (char *)v47));
          *(_QWORD *)(a1 + 16) = v42;
          if ( v42 == nullptr )
            abort();
        }
        v43 = (__int64 *)&v42[v49];
        v44 = &v42[8 * (v49 >> 2)];
        result = v48;
        *(_QWORD *)(a1 + 32) = v44;
      }
      *(_QWORD *)(a1 + 24) = v43 + 1;
      *v43 = result;
    }
    v53 = 2;
    v52 = 2;
LABEL_77:
    *(_QWORD *)a1 = &v45[v53];
    v54 = sub_17574((_QWORD *)a1, v63);
    v55 = *(_QWORD **)(a1 + 4912);
    v56 = v54;
    v58 = v57;
    v59 = v55[1];
    if ( (unsigned __int64)(v59 - 4016) > 0xFFFFFFFFFFFFF00FLL )
      goto LABEL_80;
    v60 = malloc(0x1000u);
    if ( v60 != nullptr )
    {
      v59 = 0;
      *v60 = v55;
      v60[1] = 0;
      v55 = v60;
      *(_QWORD *)(a1 + 4912) = v60;
LABEL_80:
      v55[1] = v59 + 64;
      *(_QWORD *)((char *)v55 + v59 + 16) = off_38EA8;
      result = (__int64)v55 + v59 + 16;
      *(_BYTE *)(result + 8) = 16;
      v61 = *(_WORD *)((char *)v55 + v59 + 25);
      *(_QWORD *)(result + 16) = v62;
      *(_QWORD *)(result + 24) = v56;
      *(_QWORD *)(result + 32) = v58;
      *(_DWORD *)(result + 40) = v5;
      *(_WORD *)(result + 9) = v61 & 0xF000 | 0x100;
      *(_BYTE *)(result + 44) = v52;
      *(_QWORD *)(result + 48) = v6;
      return result;
    }
LABEL_85:
    sub_13E4C();
  }
  return result;
}


// Address: 0x28F80 | Function: sub_28F80
__int64 __fastcall sub_28F80(unsigned __int8 **a1, size_t a2)
{
  unsigned __int8 *v2; // x8
  unsigned __int8 *v3; // x9
  __int64 v5; // x15
  unsigned __int64 v6; // x22
  unsigned __int8 *v7; // x11
  __int64 v8; // x14
  unsigned __int64 v9; // x12
  unsigned __int8 *v10; // x23
  __int64 v11; // x13
  unsigned __int8 *v12; // x10
  bool v13; // zf
  __int64 result; // x0
  __int64 v15; // x20
  int v16; // w20
  unsigned __int8 *v17; // x21
  __int64 v18; // x8
  __int64 v19; // x22
  unsigned __int8 *v20; // x0
  __int64 v21; // x9
  char *v22; // x8
  __int16 v23; // w10
  unsigned __int8 *v24; // x24
  __int64 v25; // x21
  __int64 v26; // x8
  unsigned __int8 *v27; // x0
  __int16 v28; // w8
  unsigned __int8 *v29; // x9
  unsigned __int8 *v30; // x11
  unsigned __int64 v31; // x21
  unsigned __int8 *v32; // x14
  __int64 v33; // x13
  unsigned __int8 *v34; // x22
  __int64 v35; // x15
  unsigned __int64 v36; // x12
  int v37; // t1
  unsigned __int8 *v38; // x23
  __int64 v39; // x20
  __int64 v40; // x8
  unsigned __int8 *v41; // x0
  __int16 v42; // w8

  v3 = *a1;
  v2 = a1[1];
  if ( *a1 == v2 )
    goto LABEL_22;
  if ( *v3 != 85 )
  {
    if ( *v3 == 114 )
    {
      ++v3;
      v16 = 4;
      *a1 = v3;
      if ( v3 != v2 )
      {
LABEL_23:
        if ( *v3 == 86 )
        {
          ++v3;
          v16 |= 2u;
          *a1 = v3;
        }
      }
LABEL_25:
      if ( v3 != v2 && *v3 == 75 )
      {
        v16 |= 1u;
        *a1 = v3 + 1;
      }
      result = sub_1544C((__int64)a1, a2);
      if ( result != 0 && v16 != 0 )
      {
        v17 = a1[614];
        v18 = *((_QWORD *)v17 + 1);
        if ( (unsigned __int64)(v18 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
        {
          v19 = result;
          v20 = (unsigned __int8 *)malloc(0x1000u);
          if ( v20 == nullptr )
            goto LABEL_55;
          v18 = 0;
          *(_QWORD *)v20 = v17;
          *((_QWORD *)v20 + 1) = 0;
          v17 = v20;
          a1[614] = v20;
          result = v19;
        }
        v21 = v18 + 32;
        v22 = (char *)&v17[v18];
        *((_QWORD *)v17 + 1) = v21;
        v23 = *(_WORD *)(result + 9);
        *((_QWORD *)v22 + 2) = off_38FF8;
        v22 += 16;
        LOWORD(v21) = *(_WORD *)(v22 + 9);
        *((_QWORD *)v22 + 2) = result;
        v22[8] = 3;
        *((_DWORD *)v22 + 3) = v16;
        *(_WORD *)(v22 + 9) = v21 & 0xF000 | v23 & 0xFC0;
        return (__int64)v22;
      }
      return result;
    }
LABEL_22:
    v16 = 0;
    if ( v3 == v2 )
      goto LABEL_25;
    goto LABEL_23;
  }
  *a1 = v3 + 1;
  if ( v2 != v3 + 1 && (unsigned int)v3[1] - 58 >= 0xFFFFFFF6 )
  {
    v5 = 0;
    v6 = 0;
    do
    {
      v7 = &v3[v5];
      v8 = v5;
      v9 = v6;
      v10 = &v3[v5 + 2];
      *a1 = v10;
      v11 = v3[v5 + 1];
      v6 = v11 + 10 * v6 - 48;
      if ( v10 == v2 )
        break;
      ++v5;
    }
    while ( (unsigned int)*v10 - 48 <= 9 );
    if ( v2 - v3 - v8 - 2 >= v6 )
    {
      v12 = &v3[10 * v9 - 46 + v8 + v11];
      *a1 = v12;
      if ( v6 != 0 )
      {
        if ( v6 < 9 || (*(_QWORD *)(v7 + 2) == 0x746F7270636A626FLL ? (v13 = v7[10] == 111) : (v13 = false), !v13) )
        {
          if ( v12 == v2 || *v12 != 73 )
          {
            v15 = 0;
          }
          else
          {
            result = sub_18CC8((__int64)a1, 0);
            v15 = result;
            if ( result == 0 )
              return result;
          }
          result = sub_28F80(a1);
          if ( result != 0 )
          {
            v24 = a1[614];
            v25 = result;
            v26 = *((_QWORD *)v24 + 1);
            if ( (unsigned __int64)(v26 - 4032) > 0xFFFFFFFFFFFFF00FLL )
            {
LABEL_39:
              *((_QWORD *)v24 + 1) = v26 + 48;
              *(_QWORD *)&v24[v26 + 16] = off_38F88;
              result = (__int64)&v24[v26 + 16];
              v28 = *(_WORD *)&v24[v26 + 25];
              *(_BYTE *)(result + 8) = 2;
              *(_QWORD *)(result + 16) = v25;
              *(_QWORD *)(result + 24) = v10;
              *(_QWORD *)(result + 32) = v6;
              *(_QWORD *)(result + 40) = v15;
              *(_WORD *)(result + 9) = v28 & 0xF000 | 0x540;
              return result;
            }
            v27 = (unsigned __int8 *)malloc(0x1000u);
            if ( v27 != nullptr )
            {
              v26 = 0;
              *(_QWORD *)v27 = v24;
              *((_QWORD *)v27 + 1) = 0;
              v24 = v27;
              a1[614] = v27;
              goto LABEL_39;
            }
LABEL_55:
            sub_13E4C();
          }
          return result;
        }
        v29 = &v3[v8 + 11];
        *a1 = v29;
        a1[1] = v12;
        if ( v6 == 9 || (unsigned int)*v29 - 58 < 0xFFFFFFF6 )
          goto LABEL_46;
        v30 = v7 + 12;
        v31 = 0;
        v32 = v30;
        v33 = v11 + 10 * v9 - 58;
        do
        {
          *a1 = v30;
          v34 = v32;
          v35 = *(v30 - 1) + 10 * v31;
          v36 = v33;
          v31 = v35 - 48;
          if ( v33 == 0 )
            break;
          v37 = *v30++;
          ++v32;
          --v33;
        }
        while ( (unsigned int)(v37 - 48) <= 9 );
        if ( v36 < v31 )
        {
LABEL_46:
          *a1 = v12;
          a1[1] = v2;
          return 0;
        }
        *a1 = v12;
        a1[1] = v2;
        if ( v35 != 48 )
        {
          result = sub_28F80(a1);
          if ( result != 0 )
          {
            v38 = a1[614];
            v39 = result;
            v40 = *((_QWORD *)v38 + 1);
            if ( (unsigned __int64)(v40 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
            {
              v41 = (unsigned __int8 *)malloc(0x1000u);
              if ( v41 == nullptr )
                goto LABEL_55;
              v40 = 0;
              *(_QWORD *)v41 = v38;
              *((_QWORD *)v41 + 1) = 0;
              v38 = v41;
              a1[614] = v41;
            }
            *((_QWORD *)v38 + 1) = v40 + 48;
            *(_QWORD *)&v38[v40 + 16] = off_38F18;
            result = (__int64)&v38[v40 + 16];
            v42 = *(_WORD *)&v38[v40 + 25];
            *(_BYTE *)(result + 8) = 11;
            *(_QWORD *)(result + 16) = v39;
            *(_QWORD *)(result + 24) = v34;
            *(_QWORD *)(result + 32) = v31;
            *(_WORD *)(result + 9) = v42 & 0xF000 | 0x540;
          }
          return result;
        }
      }
    }
  }
  return 0;
}


// Address: 0x2955C | Function: sub_2955C
long double __fastcall sub_2955C(__int64 a1, long double *a2, __int64 *a3)
{
  _QWORD *v3; // x22
  __int64 v6; // x8
  _QWORD *v8; // x0
  __int64 v9; // x0
  __int64 v10; // x10
  long double result; // q0
  __int16 v12; // w8

  v3 = *(_QWORD **)(a1 + 4912);
  v6 = v3[1];
  if ( (unsigned __int64)(v6 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v8 = malloc(0x1000u);
    if ( v8 == nullptr )
      sub_13E4C();
    v6 = 0;
    *v8 = v3;
    v8[1] = 0;
    v3 = v8;
    *(_QWORD *)(a1 + 4912) = v8;
  }
  v3[1] = v6 + 48;
  *(_QWORD *)((char *)v3 + v6 + 16) = off_39068;
  v9 = (__int64)v3 + v6 + 16;
  *(_BYTE *)(v9 + 8) = 7;
  v10 = *a3;
  result = *a2;
  v12 = *(_WORD *)((_BYTE *)v3 + v6 + 25) & 0xF000 | 0x540;
  *(long double *)(v9 + 16) = *a2;
  *(_WORD *)(v9 + 9) = v12;
  *(_QWORD *)(v9 + 32) = v10;
  return result;
}


// Address: 0x29608 | Function: sub_29608
__int64 __fastcall sub_29608(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 result; // x0
  __int16 v8; // w8
  __int64 v9; // x9

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 32;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_390D8;
  result = (__int64)v2 + v4 + 16;
  v8 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 31;
  v9 = *a2;
  *(_WORD *)(result + 9) = v8 & 0xF000 | 0x540;
  *(_QWORD *)(result + 16) = v9;
  return result;
}


// Address: 0x296A8 | Function: sub_296A8
__int64 __fastcall sub_296A8(__int64 a1, __int64 *a2, char *a3)
{
  _QWORD *v3; // x22
  __int64 v6; // x8
  _QWORD *v8; // x0
  __int64 result; // x0
  __int16 v10; // w8
  __int64 v11; // x9
  char v12; // w11

  v3 = *(_QWORD **)(a1 + 4912);
  v6 = v3[1];
  if ( (unsigned __int64)(v6 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v8 = malloc(0x1000u);
    if ( v8 == nullptr )
      sub_13E4C();
    v6 = 0;
    *v8 = v3;
    v8[1] = 0;
    v3 = v8;
    *(_QWORD *)(a1 + 4912) = v8;
  }
  v3[1] = v6 + 32;
  *(_QWORD *)((char *)v3 + v6 + 16) = off_39148;
  result = (__int64)v3 + v6 + 16;
  v10 = *(_WORD *)((char *)v3 + v6 + 25);
  v11 = *a2;
  *(_BYTE *)(result + 8) = 32;
  v12 = *a3;
  *(_QWORD *)(result + 16) = v11;
  *(_WORD *)(result + 9) = v10 & 0xF000 | 0x540;
  *(_BYTE *)(result + 24) = v12;
  return result;
}


// Address: 0x29754 | Function: sub_29754
long double __fastcall sub_29754(__int64 a1, _QWORD *a2, long double *a3)
{
  _QWORD *v3; // x22
  __int64 v6; // x8
  _QWORD *v8; // x0
  __int64 v9; // x0
  __int16 v10; // w8
  long double result; // q0

  v3 = *(_QWORD **)(a1 + 4912);
  v6 = v3[1];
  if ( (unsigned __int64)(v6 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v8 = malloc(0x1000u);
    if ( v8 == nullptr )
      sub_13E4C();
    v6 = 0;
    *v8 = v3;
    v8[1] = 0;
    v3 = v8;
    *(_QWORD *)(a1 + 4912) = v8;
  }
  v3[1] = v6 + 48;
  *(_QWORD *)((char *)v3 + v6 + 16) = off_391B8;
  v9 = (__int64)v3 + v6 + 16;
  v10 = *(_WORD *)((char *)v3 + v6 + 25);
  *(_BYTE *)(v9 + 8) = 5;
  result = *a3;
  *(_QWORD *)(v9 + 16) = *a2;
  *(_WORD *)(v9 + 9) = v10 & 0xF000 | 0x540;
  *(long double *)(v9 + 24) = result;
  return result;
}


// Address: 0x29800 | Function: sub_29800
__int64 __fastcall sub_29800(unsigned __int8 **a1, size_t a2)
{
  unsigned __int8 *v2; // x8
  unsigned __int8 *v3; // x9
  __int64 result; // x0
  char *v5; // x20
  unsigned __int8 **v6; // x19
  unsigned int v7; // w10
  unsigned __int8 *v8; // x21
  unsigned __int8 *v9; // x9
  unsigned __int8 *v10; // x22
  __int64 v11; // x9
  unsigned __int8 *v12; // x0
  unsigned __int8 *v13; // x8
  __int64 v14; // x10
  __int16 v15; // w8
  unsigned __int8 *v16; // x8
  unsigned __int8 *v17; // x9
  unsigned __int8 *v18; // x21
  __int64 v19; // x20
  __int64 v20; // x8
  unsigned __int8 *v21; // x0
  __int16 v22; // w8
  size_t v23; // x1
  unsigned __int8 *v24; // x9
  __int64 v25; // x21
  unsigned __int8 *v26; // x22
  __int64 v27; // x20
  __int64 v28; // x8
  unsigned __int8 *v29; // x0
  __int64 v30; // [xsp+0h] [xbp-10h] BYREF
  __int64 v31; // [xsp+8h] [xbp-8h] BYREF

  v3 = *a1;
  v2 = a1[1];
  if ( (unsigned __int64)(v2 - *a1) < 2 || *(_WORD *)v3 != 30276 )
    return 0;
  v5 = (char *)(v3 + 2);
  v6 = a1;
  *a1 = v3 + 2;
  if ( v2 == v3 + 2 )
    goto LABEL_26;
  v7 = (unsigned __int8)*v5;
  if ( v7 < 0x31 )
    goto LABEL_26;
  if ( v7 > 0x39 )
  {
    if ( v7 == 95 )
    {
      *a1 = v3 + 3;
      result = sub_1544C((__int64)a1, a2);
      if ( result == 0 )
        return result;
      v18 = v6[614];
      v19 = result;
      v20 = *((_QWORD *)v18 + 1);
      if ( (unsigned __int64)(v20 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
      {
        v21 = (unsigned __int8 *)malloc(0x1000u);
        if ( v21 == nullptr )
          goto LABEL_37;
        v20 = 0;
        *(_QWORD *)v21 = v18;
        *((_QWORD *)v21 + 1) = 0;
        v18 = v21;
        v6[614] = v21;
      }
      *((_QWORD *)v18 + 1) = v20 + 32;
      *(_QWORD *)&v18[v20 + 16] = off_39298;
      result = (__int64)&v18[v20 + 16];
      v22 = *(_WORD *)&v18[v20 + 25];
      *(_QWORD *)(result + 16) = v19;
      *(_QWORD *)(result + 24) = 0;
      goto LABEL_34;
    }
LABEL_26:
    result = sub_1A440((__int64)a1, a2);
    if ( result == 0 )
      return result;
    v24 = *v6;
    if ( *v6 == v6[1] || *v24 != 95 )
      return 0;
    v25 = result;
    *v6 = v24 + 1;
    result = sub_1544C((__int64)v6, v23);
    if ( result == 0 )
      return result;
    v26 = v6[614];
    v27 = result;
    v28 = *((_QWORD *)v26 + 1);
    if ( (unsigned __int64)(v28 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
    {
      v29 = (unsigned __int8 *)malloc(0x1000u);
      if ( v29 == nullptr )
        goto LABEL_37;
      v28 = 0;
      *(_QWORD *)v29 = v26;
      *((_QWORD *)v29 + 1) = 0;
      v26 = v29;
      v6[614] = v29;
    }
    *((_QWORD *)v26 + 1) = v28 + 32;
    *(_QWORD *)&v26[v28 + 16] = off_39298;
    result = (__int64)&v26[v28 + 16];
    v22 = *(_WORD *)&v26[v28 + 25];
    *(_QWORD *)(result + 16) = v27;
    *(_QWORD *)(result + 24) = v25;
LABEL_34:
    *(_BYTE *)(result + 8) = 29;
    *(_WORD *)(result + 9) = v22 & 0xF000 | 0x540;
    return result;
  }
  v8 = v3 + 2;
  v9 = v3 + 2;
  while ( (unsigned int)*v9 - 58 >= 0xFFFFFFF6 )
  {
    ++v9;
    ++v8;
    *a1 = v9;
    if ( v9 == v2 )
    {
      v8 = v2;
      break;
    }
  }
  v10 = a1[614];
  v11 = *((_QWORD *)v10 + 1);
  if ( (unsigned __int64)(v11 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v12 = (unsigned __int8 *)malloc(0x1000u);
    if ( v12 != nullptr )
    {
      v13 = v12;
      v11 = 0;
      *(_QWORD *)v12 = v10;
      *((_QWORD *)v12 + 1) = 0;
      v10 = v12;
      a1 = v6;
      v6[614] = v13;
      goto LABEL_15;
    }
LABEL_37:
    sub_13E4C();
  }
LABEL_15:
  *((_QWORD *)v10 + 1) = v11 + 32;
  *(_QWORD *)&v10[v11 + 16] = off_36BB8;
  v14 = (__int64)&v10[v11 + 16];
  v15 = *(_WORD *)&v10[v11 + 25];
  *(_QWORD *)(v14 + 16) = v5;
  *(_BYTE *)(v14 + 8) = 8;
  *(_QWORD *)(v14 + 24) = v8 - (unsigned __int8 *)v5;
  *(_WORD *)(v14 + 9) = v15 & 0xF000 | 0x540;
  v16 = *a1;
  v17 = a1[1];
  v31 = v14;
  if ( v16 == v17 || *v16 != 95 )
    return 0;
  *a1 = v16 + 1;
  if ( v16 + 1 == v17 || v16[1] != 112 )
  {
    result = sub_1544C((__int64)a1, a2);
    v30 = result;
    if ( result != 0 )
      return sub_2B284(v6, &v30, &v31);
  }
  else
  {
    *a1 = v16 + 2;
    return sub_2B1E4();
  }
  return result;
}


// Address: 0x29AB4 | Function: sub_29AB4
__int64 __fastcall sub_29AB4(__int64 a1, __int64 a2, __int64 a3)
{
  unsigned __int8 *v3; // x8
  __int64 result; // x0
  const char *v5; // x19
  __int64 v6; // x20
  _QWORD *v8; // x22
  __int64 v9; // x8
  __int64 v10; // x23
  _QWORD *v11; // x0
  __int64 v12; // x9
  __int64 v13; // x8

  v3 = *(unsigned __int8 **)a1;
  if ( *(_QWORD *)(a1 + 8) - *(_QWORD *)a1 < 2u )
    return sub_16998((unsigned __int8 **)a1, 0, a3);
  switch ( *(_WORD *)v3 )
  {
    case 0x7354:
      v5 = "struct";
      v6 = 6;
      break;
    case 0x7554:
      v5 = "union";
      v6 = 5;
      break;
    case 0x6554:
      v5 = "enum";
      v6 = 4;
      break;
    default:
      return sub_16998((unsigned __int8 **)a1, 0, a3);
  }
  *(_QWORD *)a1 = v3 + 2;
  result = sub_16998((unsigned __int8 **)a1, 0, a3);
  if ( result != 0 )
  {
    v8 = *(_QWORD **)(a1 + 4912);
    v9 = v8[1];
    if ( (unsigned __int64)(v9 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
    {
      v10 = result;
      v11 = malloc(0x1000u);
      if ( v11 == nullptr )
        sub_13E4C();
      v9 = 0;
      *v11 = v8;
      v11[1] = 0;
      v8 = v11;
      *(_QWORD *)(a1 + 4912) = v11;
      result = v10;
    }
    v12 = v9 + 48;
    v13 = (__int64)v8 + v9;
    v8[1] = v12;
    *(_QWORD *)(v13 + 16) = off_393E8;
    v13 += 16;
    LOWORD(v12) = *(_WORD *)(v13 + 9);
    *(_BYTE *)(v13 + 8) = 6;
    *(_QWORD *)(v13 + 32) = result;
    result = v13;
    *(_QWORD *)(v13 + 16) = v5;
    *(_QWORD *)(v13 + 24) = v6;
    *(_WORD *)(v13 + 9) = v12 & 0xF000 | 0x540;
  }
  return result;
}


// Address: 0x29C00 | Function: sub_29C00
__int64 __fastcall sub_29C00(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x10
  char v8; // w9
  __int64 result; // x0
  __int16 v10; // w8

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v7 = *a2;
  v2[1] = v4 + 32;
  v8 = *(_WORD *)(v7 + 9);
  *(_QWORD *)((char *)v2 + v4 + 16) = off_39458;
  result = (__int64)v2 + v4 + 16;
  v10 = v8 & 0xC0 | 0x500 | *(_WORD *)((_BYTE *)v2 + v4 + 25) & 0xF000;
  *(_BYTE *)(result + 8) = 12;
  *(_WORD *)(result + 9) = v10;
  *(_QWORD *)(result + 16) = v7;
  return result;
}


// Address: 0x29CAC | Function: sub_29CAC
char *__fastcall sub_29CAC(__int64 a1, __int64 *a2, int *a3)
{
  _QWORD *v3; // x22
  __int64 v6; // x8
  _QWORD *v8; // x0
  __int64 v9; // x9
  char *v10; // x0
  __int64 v11; // x8
  char v12; // w12
  int v13; // w11
  char *result; // x0
  __int16 v15; // w10

  v3 = *(_QWORD **)(a1 + 4912);
  v6 = v3[1];
  if ( (unsigned __int64)(v6 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v8 = malloc(0x1000u);
    if ( v8 == nullptr )
      sub_13E4C();
    v6 = 0;
    *v8 = v3;
    v8[1] = 0;
    v3 = v8;
    *(_QWORD *)(a1 + 4912) = v8;
  }
  v9 = v6 + 32;
  v10 = (char *)v3 + v6;
  v11 = *a2;
  v3[1] = v9;
  v12 = *(_WORD *)(v11 + 9);
  v13 = *a3;
  *((_QWORD *)v10 + 2) = off_394C8;
  result = v10 + 16;
  v15 = *(_WORD *)(result + 9);
  result[8] = 13;
  *((_QWORD *)result + 2) = v11;
  *((_DWORD *)result + 6) = v13;
  *(_WORD *)(result + 9) = v12 & 0xC0 | 0x500 | v15 & 0xF000;
  result[28] = 0;
  return result;
}


// Address: 0x29D68 | Function: sub_29D68
__int64 __fastcall sub_29D68(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x10
  __int64 result; // x0
  __int16 v9; // w8

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 48;
  v7 = *a2;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_391B8;
  result = (__int64)v2 + v4 + 16;
  v9 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 5;
  *(_QWORD *)(result + 16) = v7;
  *(_QWORD *)(result + 24) = " complex";
  *(_QWORD *)(result + 32) = 8;
  *(_WORD *)(result + 9) = v9 & 0xF000 | 0x540;
  return result;
}


// Address: 0x29E18 | Function: sub_29E18
__int64 __fastcall sub_29E18(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 v7; // x10
  __int64 result; // x0
  __int16 v9; // w8

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4032) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 48;
  v7 = *a2;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_391B8;
  result = (__int64)v2 + v4 + 16;
  v9 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 5;
  *(_QWORD *)(result + 16) = v7;
  *(_QWORD *)(result + 24) = " imaginary";
  *(_QWORD *)(result + 32) = 10;
  *(_WORD *)(result + 9) = v9 & 0xF000 | 0x540;
  return result;
}


// Address: 0x29EC8 | Function: sub_29EC8
char *__fastcall sub_29EC8(__int64 a1, char **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  char *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  char *v12; // x10
  unsigned __int64 v13; // x11
  char *v14; // x0
  char *v15; // x9
  char *v16; // x8
  size_t v17; // x1
  __int64 *v18; // x20
  char *v19; // x8
  unsigned __int64 v20; // x10
  void *v21; // x0
  char *v22; // x9
  unsigned __int64 v23; // x8
  size_t v24; // x1
  __int64 v25; // x9
  char *v26; // x8
  unsigned __int64 v27; // x10
  void *v28; // x0
  char *v29; // x9
  unsigned __int64 v30; // x8
  size_t v31; // x1
  char *v32; // x8
  unsigned __int64 v33; // x10
  char *result; // x0
  char *v35; // x9
  unsigned __int64 v36; // x8
  size_t v37; // x1

  v2 = a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = *a2;
  if ( (unsigned __int64)(v2 + 8) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 1000);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (char *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = a2[1];
    v5 = v11;
  }
  *(_QWORD *)&v2[(_QWORD)v5] = 0x7470656378656F6ELL;
  v12 = a2[1];
  v13 = (unsigned __int64)a2[2];
  v14 = *a2;
  v15 = v12 + 9;
  v16 = v12 + 8;
  ++*((_DWORD *)a2 + 8);
  a2[1] = v12 + 8;
  if ( (unsigned __int64)(v12 + 9) > v13 )
  {
    if ( 2 * v13 <= (unsigned __int64)(v12 + 1001) )
      v17 = (size_t)(v12 + 1001);
    else
      v17 = 2 * v13;
    a2[2] = (char *)v17;
    v14 = (char *)realloc(v14, v17);
    *a2 = v14;
    if ( v14 == nullptr )
      abort();
    v16 = a2[1];
    v15 = v16 + 1;
  }
  a2[1] = v15;
  v16[(_QWORD)v14] = 40;
  v18 = *(__int64 **)(a1 + 16);
  if ( (*(_WORD *)((_BYTE *)v18 + 9) & 0x3Fu) >= 0x13 )
  {
    v19 = a2[1];
    v20 = (unsigned __int64)a2[2];
    v21 = *a2;
    v22 = v19 + 1;
    ++*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v19 + 1) > v20 )
    {
      v23 = (unsigned __int64)(v19 + 993);
      if ( 2 * v20 <= v23 )
        v24 = v23;
      else
        v24 = 2 * v20;
      a2[2] = (char *)v24;
      v21 = realloc(v21, v24);
      *a2 = (char *)v21;
      if ( v21 == nullptr )
        abort();
      v19 = a2[1];
      v22 = v19 + 1;
    }
    a2[1] = v22;
    v25 = *v18;
    v19[(_QWORD)v21] = 40;
    (*(void (__fastcall **)(__int64 *, char **))(v25 + 32))(v18, a2);
    if ( (*(_WORD *)((_BYTE *)v18 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, char **))(*v18 + 40))(v18, a2);
    v26 = a2[1];
    v27 = (unsigned __int64)a2[2];
    v28 = *a2;
    v29 = v26 + 1;
    --*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v26 + 1) > v27 )
    {
      v30 = (unsigned __int64)(v26 + 993);
      if ( 2 * v27 <= v30 )
        v31 = v30;
      else
        v31 = 2 * v27;
      a2[2] = (char *)v31;
      v28 = realloc(v28, v31);
      *a2 = (char *)v28;
      if ( v28 == nullptr )
        abort();
      v26 = a2[1];
      v29 = v26 + 1;
    }
    a2[1] = v29;
    v26[(_QWORD)v28] = 41;
  }
  else
  {
    (*(void (__fastcall **)(__int64 *, char **))(*v18 + 32))(v18, a2);
    if ( (*(_WORD *)((_BYTE *)v18 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, char **))(*v18 + 40))(v18, a2);
  }
  v32 = a2[1];
  v33 = (unsigned __int64)a2[2];
  result = *a2;
  v35 = v32 + 1;
  --*((_DWORD *)a2 + 8);
  if ( (unsigned __int64)(v32 + 1) > v33 )
  {
    v36 = (unsigned __int64)(v32 + 993);
    if ( 2 * v33 <= v36 )
      v37 = v36;
    else
      v37 = 2 * v33;
    a2[2] = (char *)v37;
    result = (char *)realloc(result, v37);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v32 = a2[1];
    v35 = v32 + 1;
  }
  a2[1] = v35;
  v32[(_QWORD)result] = 41;
  return result;
}


// Address: 0x2A138 | Function: sub_2A138
void sub_2A138()
{
  sub_13E30();
}


// Address: 0x2A144 | Function: sub_2A144
char *__fastcall sub_2A144(__int64 a1, __int64 a2)
{
  __int64 v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  char *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  char *v12; // x8
  __int64 v13; // x10
  unsigned __int64 v14; // x11
  char *v15; // x0
  __int64 v16; // x9
  __int64 v17; // x8
  size_t v18; // x1
  __int64 v19; // x8
  unsigned __int64 v20; // x10
  char *result; // x0
  __int64 v22; // x9
  unsigned __int64 v23; // x8
  size_t v24; // x1

  v2 = *(_QWORD *)(a2 + 8);
  v3 = *(_QWORD *)(a2 + 16);
  v5 = *(char **)a2;
  if ( v2 + 5 > v3 )
  {
    v7 = 2 * v3;
    v8 = v2 + 997;
    v9 = *(char **)a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    *(_QWORD *)(a2 + 16) = v10;
    v11 = (char *)realloc(v9, v10);
    *(_QWORD *)a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = *(_QWORD *)(a2 + 8);
    v5 = v11;
  }
  v12 = &v5[v2];
  v12[4] = 119;
  *(_DWORD *)v12 = 1869768820;
  v13 = *(_QWORD *)(a2 + 8);
  v14 = *(_QWORD *)(a2 + 16);
  v15 = *(char **)a2;
  v16 = v13 + 6;
  ++*(_DWORD *)(a2 + 32);
  v17 = v13 + 5;
  *(_QWORD *)(a2 + 8) = v13 + 5;
  if ( v13 + 6 > v14 )
  {
    if ( 2 * v14 <= v13 + 998 )
      v18 = v13 + 998;
    else
      v18 = 2 * v14;
    *(_QWORD *)(a2 + 16) = v18;
    v15 = (char *)realloc(v15, v18);
    *(_QWORD *)a2 = v15;
    if ( v15 == nullptr )
      abort();
    v17 = *(_QWORD *)(a2 + 8);
    v16 = v17 + 1;
  }
  *(_QWORD *)(a2 + 8) = v16;
  v15[v17] = 40;
  sub_1F824((_QWORD *)(a1 + 16), a2);
  v19 = *(_QWORD *)(a2 + 8);
  v20 = *(_QWORD *)(a2 + 16);
  result = *(char **)a2;
  v22 = v19 + 1;
  --*(_DWORD *)(a2 + 32);
  if ( v19 + 1 > v20 )
  {
    v23 = v19 + 993;
    if ( 2 * v20 <= v23 )
      v24 = v23;
    else
      v24 = 2 * v20;
    *(_QWORD *)(a2 + 16) = v24;
    result = (char *)realloc(result, v24);
    *(_QWORD *)a2 = result;
    if ( result == nullptr )
      abort();
    v19 = *(_QWORD *)(a2 + 8);
    v22 = v19 + 1;
  }
  *(_QWORD *)(a2 + 8) = v22;
  result[v19] = 41;
  return result;
}


// Address: 0x2A28C | Function: sub_2A28C
void sub_2A28C()
{
  sub_13E30();
}


// Address: 0x2A298 | Function: sub_2A298
__int64 sub_2A298()
{
  return 1;
}


// Address: 0x2A2A4 | Function: sub_2A2A4
__int64 sub_2A2A4()
{
  return 1;
}


// Address: 0x2A2B0 | Function: sub_2A2B0
void *__fastcall sub_2A2B0(__int64 a1, __int64 a2)
{
  __int64 v3; // x8
  unsigned __int64 v4; // x9
  void *result; // x0
  unsigned __int64 v6; // x9
  size_t v7; // x8
  size_t v8; // x1

  (*(void (__fastcall **)(_QWORD))(**(_QWORD **)(a1 + 16) + 32LL))(*(_QWORD *)(a1 + 16));
  v3 = *(_QWORD *)(a2 + 8);
  v4 = *(_QWORD *)(a2 + 16);
  result = *(void **)a2;
  if ( v3 + 1 > v4 )
  {
    v6 = 2 * v4;
    v7 = v3 + 993;
    if ( v6 <= v7 )
      v8 = v7;
    else
      v8 = v6;
    *(_QWORD *)(a2 + 16) = v8;
    result = realloc(result, v8);
    *(_QWORD *)a2 = result;
    if ( result == nullptr )
      abort();
    v3 = *(_QWORD *)(a2 + 8);
  }
  *((_BYTE *)result + v3) = 32;
  ++*(_QWORD *)(a2 + 8);
  return result;
}


// Address: 0x2A334 | Function: sub_2A334
char *__fastcall sub_2A334(__int64 a1, __int64 a2)
{
  __int64 v2; // x8
  unsigned __int64 v3; // x10
  char *v5; // x0
  __int64 v7; // x9
  unsigned __int64 v8; // x8
  size_t v9; // x1
  __int64 v10; // x8
  unsigned __int64 v11; // x10
  char *v12; // x0
  __int64 v13; // x9
  unsigned __int64 v14; // x8
  size_t v15; // x1
  char *result; // x0
  int v17; // w8
  __int64 v18; // x8
  unsigned __int64 v19; // x9
  unsigned __int64 v20; // x9
  size_t v21; // x8
  size_t v22; // x1
  char *v23; // x8
  __int64 v24; // x8
  unsigned __int64 v25; // x9
  unsigned __int64 v26; // x9
  size_t v27; // x8
  size_t v28; // x1
  char *v29; // x8
  __int64 v30; // x8
  unsigned __int64 v31; // x9
  unsigned __int64 v32; // x9
  size_t v33; // x8
  size_t v34; // x1
  char *v35; // x8
  int v36; // w8
  __int64 v37; // x8
  unsigned __int64 v38; // x9
  unsigned __int64 v39; // x9
  size_t v40; // x8
  size_t v41; // x1
  __int64 v42; // x8
  __int64 v43; // x8
  unsigned __int64 v44; // x9
  unsigned __int64 v45; // x9
  size_t v46; // x8
  size_t v47; // x1
  char *v48; // x8
  __int64 v49; // x8
  unsigned __int64 v50; // x10
  char *v51; // x0
  __int64 v52; // x9
  unsigned __int64 v53; // x8
  size_t v54; // x1
  __int64 v55; // x20

  v2 = *(_QWORD *)(a2 + 8);
  v3 = *(_QWORD *)(a2 + 16);
  v5 = *(char **)a2;
  v7 = v2 + 1;
  ++*(_DWORD *)(a2 + 32);
  if ( v2 + 1 > v3 )
  {
    v8 = v2 + 993;
    if ( 2 * v3 <= v8 )
      v9 = v8;
    else
      v9 = 2 * v3;
    *(_QWORD *)(a2 + 16) = v9;
    v5 = (char *)realloc(v5, v9);
    *(_QWORD *)a2 = v5;
    if ( v5 == nullptr )
      abort();
    v2 = *(_QWORD *)(a2 + 8);
    v7 = v2 + 1;
  }
  *(_QWORD *)(a2 + 8) = v7;
  v5[v2] = 40;
  sub_1F824((_QWORD *)(a1 + 24), a2);
  v10 = *(_QWORD *)(a2 + 8);
  v11 = *(_QWORD *)(a2 + 16);
  v12 = *(char **)a2;
  v13 = v10 + 1;
  --*(_DWORD *)(a2 + 32);
  if ( v10 + 1 > v11 )
  {
    v14 = v10 + 993;
    if ( 2 * v11 <= v14 )
      v15 = v14;
    else
      v15 = 2 * v11;
    *(_QWORD *)(a2 + 16) = v15;
    v12 = (char *)realloc(v12, v15);
    *(_QWORD *)a2 = v12;
    if ( v12 == nullptr )
      abort();
    v10 = *(_QWORD *)(a2 + 8);
    v13 = v10 + 1;
  }
  *(_QWORD *)(a2 + 8) = v13;
  v12[v10] = 41;
  result = (char *)(*(__int64 (__fastcall **)(_QWORD, __int64))(**(_QWORD **)(a1 + 16) + 40LL))(
                     *(_QWORD *)(a1 + 16),
                     a2);
  v17 = *(_DWORD *)(a1 + 40);
  if ( (v17 & 1) != 0 )
  {
    v18 = *(_QWORD *)(a2 + 8);
    v19 = *(_QWORD *)(a2 + 16);
    result = *(char **)a2;
    if ( v18 + 6 > v19 )
    {
      v20 = 2 * v19;
      v21 = v18 + 998;
      if ( v20 <= v21 )
        v22 = v21;
      else
        v22 = v20;
      *(_QWORD *)(a2 + 16) = v22;
      result = (char *)realloc(result, v22);
      *(_QWORD *)a2 = result;
      if ( result == nullptr )
        abort();
      v18 = *(_QWORD *)(a2 + 8);
    }
    v23 = &result[v18];
    *((_WORD *)v23 + 2) = 29811;
    *(_DWORD *)v23 = 1852793632;
    v17 = *(_DWORD *)(a1 + 40);
    *(_QWORD *)(a2 + 8) += 6LL;
  }
  if ( (v17 & 2) != 0 )
  {
    v24 = *(_QWORD *)(a2 + 8);
    v25 = *(_QWORD *)(a2 + 16);
    result = *(char **)a2;
    if ( v24 + 9 > v25 )
    {
      v26 = 2 * v25;
      v27 = v24 + 1001;
      if ( v26 <= v27 )
        v28 = v27;
      else
        v28 = v26;
      *(_QWORD *)(a2 + 16) = v28;
      result = (char *)realloc(result, v28);
      *(_QWORD *)a2 = result;
      if ( result == nullptr )
        abort();
      v24 = *(_QWORD *)(a2 + 8);
    }
    v29 = &result[v24];
    v29[8] = 101;
    *(_QWORD *)v29 = *(_QWORD *)" volatile";
    v17 = *(_DWORD *)(a1 + 40);
    *(_QWORD *)(a2 + 8) += 9LL;
  }
  if ( (v17 & 4) != 0 )
  {
    v30 = *(_QWORD *)(a2 + 8);
    v31 = *(_QWORD *)(a2 + 16);
    result = *(char **)a2;
    if ( v30 + 9 > v31 )
    {
      v32 = 2 * v31;
      v33 = v30 + 1001;
      if ( v32 <= v33 )
        v34 = v33;
      else
        v34 = v32;
      *(_QWORD *)(a2 + 16) = v34;
      result = (char *)realloc(result, v34);
      *(_QWORD *)a2 = result;
      if ( result == nullptr )
        abort();
      v30 = *(_QWORD *)(a2 + 8);
    }
    v35 = &result[v30];
    v35[8] = 116;
    *(_QWORD *)v35 = *(_QWORD *)" restrict";
    *(_QWORD *)(a2 + 8) += 9LL;
  }
  v36 = *(unsigned __int8 *)(a1 + 44);
  if ( v36 == 2 )
  {
    v43 = *(_QWORD *)(a2 + 8);
    v44 = *(_QWORD *)(a2 + 16);
    result = *(char **)a2;
    if ( v43 + 3 > v44 )
    {
      v45 = 2 * v44;
      v46 = v43 + 995;
      if ( v45 <= v46 )
        v47 = v46;
      else
        v47 = v45;
      *(_QWORD *)(a2 + 16) = v47;
      result = (char *)realloc(result, v47);
      *(_QWORD *)a2 = result;
      if ( result == nullptr )
        abort();
      v43 = *(_QWORD *)(a2 + 8);
    }
    v48 = &result[v43];
    v48[2] = 38;
    *(_WORD *)v48 = 9760;
    v42 = 3;
  }
  else
  {
    if ( v36 != 1 )
      goto LABEL_54;
    v37 = *(_QWORD *)(a2 + 8);
    v38 = *(_QWORD *)(a2 + 16);
    result = *(char **)a2;
    if ( v37 + 2 > v38 )
    {
      v39 = 2 * v38;
      v40 = v37 + 994;
      if ( v39 <= v40 )
        v41 = v40;
      else
        v41 = v39;
      *(_QWORD *)(a2 + 16) = v41;
      result = (char *)realloc(result, v41);
      *(_QWORD *)a2 = result;
      if ( result == nullptr )
        abort();
      v37 = *(_QWORD *)(a2 + 8);
    }
    *(_WORD *)&result[v37] = 9760;
    v42 = 2;
  }
  *(_QWORD *)(a2 + 8) += v42;
LABEL_54:
  if ( *(_QWORD *)(a1 + 48) != 0 )
  {
    v49 = *(_QWORD *)(a2 + 8);
    v50 = *(_QWORD *)(a2 + 16);
    v51 = *(char **)a2;
    v52 = v49 + 1;
    if ( v49 + 1 > v50 )
    {
      v53 = v49 + 993;
      if ( 2 * v50 <= v53 )
        v54 = v53;
      else
        v54 = 2 * v50;
      *(_QWORD *)(a2 + 16) = v54;
      v51 = (char *)realloc(v51, v54);
      *(_QWORD *)a2 = v51;
      if ( v51 == nullptr )
        abort();
      v49 = *(_QWORD *)(a2 + 8);
      v52 = v49 + 1;
    }
    *(_QWORD *)(a2 + 8) = v52;
    v51[v49] = 32;
    v55 = *(_QWORD *)(a1 + 48);
    result = (char *)(*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v55 + 32LL))(v55, a2);
    if ( (*(_WORD *)(v55 + 9) & 0xC0) != 0x40 )
      return (char *)(*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v55 + 40LL))(v55, a2);
  }
  return result;
}


// Address: 0x2A6C8 | Function: sub_2A6C8
void sub_2A6C8()
{
  sub_13E30();
}


// Address: 0x2A6D4 | Function: sub_2A6D4
char *__fastcall sub_2A6D4(_QWORD *a1, char **a2)
{
  __int64 v2; // x21
  char *v5; // x8
  unsigned __int64 v6; // x9
  char *v7; // x0
  unsigned __int64 v8; // x9
  size_t v9; // x8
  size_t v10; // x1
  __int64 v11; // x8
  size_t v12; // x21
  size_t v13; // x10
  const void *v14; // x20
  char *v15; // x0
  size_t v16; // x1
  unsigned __int64 v17; // x9
  char *result; // x0
  unsigned __int64 v19; // x9
  size_t v20; // x8
  size_t v21; // x1

  v2 = a1[2];
  (*(void (__fastcall **)(__int64))(*(_QWORD *)v2 + 32LL))(v2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v2 + 40LL))(v2, a2);
  v5 = a2[1];
  v6 = (unsigned __int64)a2[2];
  v7 = *a2;
  if ( (unsigned __int64)(v5 + 1) > v6 )
  {
    v8 = 2 * v6;
    v9 = (size_t)(v5 + 993);
    if ( v8 <= v9 )
      v10 = v9;
    else
      v10 = v8;
    a2[2] = (char *)v10;
    v7 = (char *)realloc(v7, v10);
    *a2 = v7;
    if ( v7 == nullptr )
      abort();
    v5 = a2[1];
  }
  v5[(_QWORD)v7] = 60;
  v11 = (__int64)(a2[1] + 1);
  a2[1] = (char *)v11;
  v12 = a1[4];
  if ( v12 != 0 )
  {
    v13 = (size_t)a2[2];
    v14 = (const void *)a1[3];
    v15 = *a2;
    if ( v11 + v12 > v13 )
    {
      if ( 2 * v13 <= v11 + v12 + 992 )
        v16 = v11 + v12 + 992;
      else
        v16 = 2 * v13;
      a2[2] = (char *)v16;
      v15 = (char *)realloc(v15, v16);
      *a2 = v15;
      if ( v15 == nullptr )
        abort();
      v11 = (__int64)a2[1];
    }
    memcpy(&v15[v11], v14, v12);
    v11 = (__int64)&a2[1][v12];
    a2[1] = (char *)v11;
  }
  v17 = (unsigned __int64)a2[2];
  result = *a2;
  if ( v11 + 1 > v17 )
  {
    v19 = 2 * v17;
    v20 = v11 + 993;
    if ( v19 <= v20 )
      v21 = v20;
    else
      v21 = v19;
    a2[2] = (char *)v21;
    result = (char *)realloc(result, v21);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v11 = (__int64)a2[1];
  }
  result[v11] = 62;
  ++a2[1];
  return result;
}


// Address: 0x2A840 | Function: sub_2A840
void sub_2A840()
{
  sub_13E30();
}


// Address: 0x2A84C | Function: sub_2A84C
__int64 __fastcall sub_2A84C(_QWORD *a1, char **a2)
{
  __int64 v2; // x21
  char *v5; // x8
  unsigned __int64 v6; // x9
  __int64 result; // x0
  unsigned __int64 v8; // x9
  size_t v9; // x8
  size_t v10; // x1
  __int64 v11; // x8
  size_t v12; // x21
  size_t v13; // x10
  const void *v14; // x22
  char *v15; // x0
  size_t v16; // x1
  __int64 v17; // x20

  v2 = a1[2];
  (*(void (__fastcall **)(__int64))(*(_QWORD *)v2 + 32LL))(v2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v2 + 40LL))(v2, a2);
  v5 = a2[1];
  v6 = (unsigned __int64)a2[2];
  result = (__int64)*a2;
  if ( (unsigned __int64)(v5 + 1) > v6 )
  {
    v8 = 2 * v6;
    v9 = (size_t)(v5 + 993);
    if ( v8 <= v9 )
      v10 = v9;
    else
      v10 = v8;
    a2[2] = (char *)v10;
    result = (__int64)realloc((void *)result, v10);
    *a2 = (char *)result;
    if ( result == 0 )
      abort();
    v5 = a2[1];
  }
  v5[result] = 32;
  v11 = (__int64)(a2[1] + 1);
  a2[1] = (char *)v11;
  v12 = a1[4];
  if ( v12 != 0 )
  {
    v13 = (size_t)a2[2];
    v14 = (const void *)a1[3];
    v15 = *a2;
    if ( v11 + v12 > v13 )
    {
      if ( 2 * v13 <= v11 + v12 + 992 )
        v16 = v11 + v12 + 992;
      else
        v16 = 2 * v13;
      a2[2] = (char *)v16;
      v15 = (char *)realloc(v15, v16);
      *a2 = v15;
      if ( v15 == nullptr )
        abort();
      v11 = (__int64)a2[1];
    }
    result = (__int64)memcpy(&v15[v11], v14, v12);
    a2[1] += v12;
  }
  v17 = a1[5];
  if ( v17 != 0 )
  {
    result = (*(__int64 (__fastcall **)(__int64, char **))(*(_QWORD *)v17 + 32LL))(v17, a2);
    if ( (*(_WORD *)(v17 + 9) & 0xC0) != 0x40 )
      return (*(__int64 (__fastcall **)(__int64, char **))(*(_QWORD *)v17 + 40LL))(v17, a2);
  }
  return result;
}


// Address: 0x2A9B8 | Function: sub_2A9B8
void sub_2A9B8()
{
  sub_13E30();
}


// Address: 0x2A9C4 | Function: sub_2A9C4
__int64 __fastcall sub_2A9C4(__int64 a1)
{
  __int64 v1; // x0
  unsigned int v2; // w8

  v1 = *(_QWORD *)(a1 + 16);
  v2 = *(unsigned __int8 *)(v1 + 9);
  if ( (v2 & 0xC0) == 0x80 )
    return (**(__int64 (__fastcall ***)(__int64))v1)(v1);
  else
    return v2 < 0x40;
}


// Address: 0x2A9F4 | Function: sub_2A9F4
__int64 __fastcall sub_2A9F4(__int64 a1)
{
  _BYTE *v1; // x0
  int v2; // w8

  v1 = *(_BYTE **)(a1 + 16);
  v2 = v1[10] & 3;
  if ( v2 == 2 )
    return (*(__int64 (__fastcall **)(_BYTE *))(*(_QWORD *)v1 + 8LL))(v1);
  else
    return v2 == 0;
}


// Address: 0x2AA24 | Function: sub_2AA24
__int64 __fastcall sub_2AA24(__int64 a1)
{
  __int64 v1; // x0
  int v2; // w8

  v1 = *(_QWORD *)(a1 + 16);
  v2 = (*(unsigned __int16 *)(v1 + 9) >> 10) & 3;
  if ( v2 == 2 )
    return (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 16LL))(v1);
  else
    return v2 == 0;
}


// Address: 0x2AA54 | Function: sub_2AA54
__int64 __fastcall sub_2AA54(__int64 a1, char **a2)
{
  __int64 result; // x0
  int v5; // w8
  char *v6; // x8
  unsigned __int64 v7; // x9
  unsigned __int64 v8; // x9
  size_t v9; // x8
  size_t v10; // x1
  char *v11; // x8
  char *v12; // x8
  unsigned __int64 v13; // x9
  unsigned __int64 v14; // x9
  size_t v15; // x8
  size_t v16; // x1
  char *v17; // x8
  char *v18; // x8
  unsigned __int64 v19; // x9
  unsigned __int64 v20; // x9
  size_t v21; // x8
  size_t v22; // x1
  char *v23; // x8

  result = (*(__int64 (__fastcall **)(_QWORD))(**(_QWORD **)(a1 + 16) + 32LL))(*(_QWORD *)(a1 + 16));
  v5 = *(_DWORD *)(a1 + 12);
  if ( (v5 & 1) != 0 )
  {
    v6 = a2[1];
    v7 = (unsigned __int64)a2[2];
    result = (__int64)*a2;
    if ( (unsigned __int64)(v6 + 6) > v7 )
    {
      v8 = 2 * v7;
      v9 = (size_t)(v6 + 998);
      if ( v8 <= v9 )
        v10 = v9;
      else
        v10 = v8;
      a2[2] = (char *)v10;
      result = (__int64)realloc((void *)result, v10);
      *a2 = (char *)result;
      if ( result == 0 )
        abort();
      v6 = a2[1];
    }
    v11 = &v6[result];
    *((_WORD *)v11 + 2) = 29811;
    *(_DWORD *)v11 = 1852793632;
    v5 = *(_DWORD *)(a1 + 12);
    a2[1] += 6;
  }
  if ( (v5 & 2) != 0 )
  {
    v12 = a2[1];
    v13 = (unsigned __int64)a2[2];
    result = (__int64)*a2;
    if ( (unsigned __int64)(v12 + 9) > v13 )
    {
      v14 = 2 * v13;
      v15 = (size_t)(v12 + 1001);
      if ( v14 <= v15 )
        v16 = v15;
      else
        v16 = v14;
      a2[2] = (char *)v16;
      result = (__int64)realloc((void *)result, v16);
      *a2 = (char *)result;
      if ( result == 0 )
        abort();
      v12 = a2[1];
    }
    v17 = &v12[result];
    v17[8] = 101;
    *(_QWORD *)v17 = *(_QWORD *)" volatile";
    v5 = *(_DWORD *)(a1 + 12);
    a2[1] += 9;
  }
  if ( (v5 & 4) != 0 )
  {
    v18 = a2[1];
    v19 = (unsigned __int64)a2[2];
    result = (__int64)*a2;
    if ( (unsigned __int64)(v18 + 9) > v19 )
    {
      v20 = 2 * v19;
      v21 = (size_t)(v18 + 1001);
      if ( v20 <= v21 )
        v22 = v21;
      else
        v22 = v20;
      a2[2] = (char *)v22;
      result = (__int64)realloc((void *)result, v22);
      *a2 = (char *)result;
      if ( result == 0 )
        abort();
      v18 = a2[1];
    }
    v23 = &v18[result];
    v23[8] = 116;
    *(_QWORD *)v23 = *(_QWORD *)" restrict";
    a2[1] += 9;
  }
  return result;
}


// Address: 0x2ABCC | Function: sub_2ABCC
__int64 __fastcall sub_2ABCC(__int64 a1)
{
  return (*(__int64 (__fastcall **)(_QWORD))(**(_QWORD **)(a1 + 16) + 40LL))(*(_QWORD *)(a1 + 16));
}


// Address: 0x2ABE0 | Function: sub_2ABE0
void sub_2ABE0()
{
  sub_13E30();
}


// Address: 0x2ABEC | Function: sub_2ABEC
char *__fastcall sub_2ABEC(_QWORD *a1, char **a2)
{
  size_t v2; // x21
  size_t v3; // x8
  size_t v6; // x10
  const void *v7; // x22
  char *v8; // x0
  size_t v9; // x1
  unsigned __int64 v10; // x10
  size_t v11; // x9
  char *v12; // x0
  unsigned __int64 v13; // x8
  size_t v14; // x1
  __int64 v15; // x20
  char *v16; // x8
  unsigned __int64 v17; // x10
  char *result; // x0
  char *v19; // x9
  unsigned __int64 v20; // x8
  size_t v21; // x1

  v2 = a1[3];
  v3 = (size_t)a2[1];
  if ( v2 != 0 )
  {
    v6 = (size_t)a2[2];
    v7 = (const void *)a1[2];
    v8 = *a2;
    if ( v3 + v2 > v6 )
    {
      if ( 2 * v6 <= v3 + v2 + 992 )
        v9 = v3 + v2 + 992;
      else
        v9 = 2 * v6;
      a2[2] = (char *)v9;
      v8 = (char *)realloc(v8, v9);
      *a2 = v8;
      if ( v8 == nullptr )
        abort();
      v3 = (size_t)a2[1];
    }
    memcpy(&v8[v3], v7, v2);
    v3 = (size_t)&a2[1][v2];
    a2[1] = (char *)v3;
  }
  v10 = (unsigned __int64)a2[2];
  v11 = v3 + 1;
  v12 = *a2;
  if ( v3 + 1 > v10 )
  {
    v13 = v3 + 993;
    if ( 2 * v10 <= v13 )
      v14 = v13;
    else
      v14 = 2 * v10;
    a2[2] = (char *)v14;
    v12 = (char *)realloc(v12, v14);
    *a2 = v12;
    if ( v12 == nullptr )
      abort();
    v3 = (size_t)a2[1];
    v11 = v3 + 1;
  }
  a2[1] = (char *)v11;
  v12[v3] = 40;
  v15 = a1[4];
  (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v15 + 32LL))(v15, a2);
  if ( (*(_WORD *)(v15 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v15 + 40LL))(v15, a2);
  v16 = a2[1];
  v17 = (unsigned __int64)a2[2];
  result = *a2;
  v19 = v16 + 1;
  if ( (unsigned __int64)(v16 + 1) > v17 )
  {
    v20 = (unsigned __int64)(v16 + 993);
    if ( 2 * v17 <= v20 )
      v21 = v20;
    else
      v21 = 2 * v17;
    a2[2] = (char *)v21;
    result = (char *)realloc(result, v21);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v16 = a2[1];
    v19 = v16 + 1;
  }
  a2[1] = v19;
  v16[(_QWORD)result] = 41;
  return result;
}


// Address: 0x2AD58 | Function: sub_2AD58
void sub_2AD58()
{
  sub_13E30();
}


// Address: 0x2AD64 | Function: sub_2AD64
__int64 __fastcall sub_2AD64(__int64 a1, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  void *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  char *v12; // x8
  __int64 *v13; // x20
  __int64 v14; // x9
  __int64 result; // x0

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  if ( (unsigned __int64)(v2 + 6) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 998);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (void *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = v11;
  }
  v12 = &v2[(_QWORD)v5];
  *((_WORD *)v12 + 2) = 29793;
  *(_DWORD *)v12 = 1869366879;
  v13 = *(__int64 **)(a1 + 16);
  v14 = *v13;
  a2[1] = (char *)a2[1] + 6;
  result = (*(__int64 (__fastcall **)(__int64 *, void **))(v14 + 32))(v13, a2);
  if ( (*(_WORD *)((_BYTE *)v13 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64 *, void **))(*v13 + 40))(v13, a2);
  return result;
}


// Address: 0x2AE3C | Function: sub_2AE3C
void sub_2AE3C()
{
  sub_13E30();
}


// Address: 0x2AE48 | Function: sub_2AE48
char *__fastcall sub_2AE48(__int64 a1, char **a2)
{
  __int64 v2; // x8
  unsigned __int64 v5; // x9
  char *v6; // x0
  unsigned __int64 v7; // x9
  size_t v8; // x8
  size_t v9; // x1
  char *v10; // x8
  unsigned __int64 v11; // x9
  char *v12; // x0
  unsigned __int64 v13; // x9
  size_t v14; // x8
  size_t v15; // x1
  char *v16; // x8
  char *v17; // x10
  unsigned __int64 v18; // x11
  char *v19; // x0
  char *v20; // x9
  char *v21; // x8
  size_t v22; // x1
  __int64 *v23; // x20
  char *v24; // x8
  unsigned __int64 v25; // x10
  void *v26; // x0
  char *v27; // x9
  unsigned __int64 v28; // x8
  size_t v29; // x1
  __int64 v30; // x9
  char *v31; // x8
  unsigned __int64 v32; // x10
  void *v33; // x0
  char *v34; // x9
  unsigned __int64 v35; // x8
  size_t v36; // x1
  char *v37; // x8
  unsigned __int64 v38; // x10
  char *result; // x0
  char *v40; // x9
  unsigned __int64 v41; // x8
  size_t v42; // x1

  v2 = (__int64)a2[1];
  if ( (*(_BYTE *)(a1 + 24) & 1) == 0 )
  {
    v5 = (unsigned __int64)a2[2];
    v6 = *a2;
    if ( v2 + 9 > v5 )
    {
      v7 = 2 * v5;
      v8 = v2 + 1001;
      if ( v7 <= v8 )
        v9 = v8;
      else
        v9 = v7;
      a2[2] = (char *)v9;
      v6 = (char *)realloc(v6, v9);
      *a2 = v6;
      if ( v6 == nullptr )
        abort();
      v2 = (__int64)a2[1];
    }
    v10 = &v6[v2];
    v10[8] = 32;
    *(_QWORD *)v10 = *(_QWORD *)"unsigned ";
    v2 = (__int64)(a2[1] + 9);
    a2[1] = (char *)v2;
  }
  v11 = (unsigned __int64)a2[2];
  v12 = *a2;
  if ( v2 + 7 > v11 )
  {
    v13 = 2 * v11;
    v14 = v2 + 999;
    if ( v13 <= v14 )
      v15 = v14;
    else
      v15 = v13;
    a2[2] = (char *)v15;
    v12 = (char *)realloc(v12, v15);
    *a2 = v12;
    if ( v12 == nullptr )
      abort();
    v2 = (__int64)a2[1];
  }
  v16 = &v12[v2];
  *(_DWORD *)(v16 + 3) = 1953384820;
  *(_DWORD *)v16 = 1953055327;
  v17 = a2[1];
  v18 = (unsigned __int64)a2[2];
  v19 = *a2;
  v20 = v17 + 8;
  ++*((_DWORD *)a2 + 8);
  v21 = v17 + 7;
  a2[1] = v17 + 7;
  if ( (unsigned __int64)(v17 + 8) > v18 )
  {
    if ( 2 * v18 <= (unsigned __int64)(v17 + 1000) )
      v22 = (size_t)(v17 + 1000);
    else
      v22 = 2 * v18;
    a2[2] = (char *)v22;
    v19 = (char *)realloc(v19, v22);
    *a2 = v19;
    if ( v19 == nullptr )
      abort();
    v21 = a2[1];
    v20 = v21 + 1;
  }
  a2[1] = v20;
  v21[(_QWORD)v19] = 40;
  v23 = *(__int64 **)(a1 + 16);
  if ( (*(_WORD *)((_BYTE *)v23 + 9) & 0x3Fu) >= 0x13 )
  {
    v24 = a2[1];
    v25 = (unsigned __int64)a2[2];
    v26 = *a2;
    v27 = v24 + 1;
    ++*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v24 + 1) > v25 )
    {
      v28 = (unsigned __int64)(v24 + 993);
      if ( 2 * v25 <= v28 )
        v29 = v28;
      else
        v29 = 2 * v25;
      a2[2] = (char *)v29;
      v26 = realloc(v26, v29);
      *a2 = (char *)v26;
      if ( v26 == nullptr )
        abort();
      v24 = a2[1];
      v27 = v24 + 1;
    }
    a2[1] = v27;
    v30 = *v23;
    v24[(_QWORD)v26] = 40;
    (*(void (__fastcall **)(__int64 *, char **))(v30 + 32))(v23, a2);
    if ( (*(_WORD *)((_BYTE *)v23 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, char **))(*v23 + 40))(v23, a2);
    v31 = a2[1];
    v32 = (unsigned __int64)a2[2];
    v33 = *a2;
    v34 = v31 + 1;
    --*((_DWORD *)a2 + 8);
    if ( (unsigned __int64)(v31 + 1) > v32 )
    {
      v35 = (unsigned __int64)(v31 + 993);
      if ( 2 * v32 <= v35 )
        v36 = v35;
      else
        v36 = 2 * v32;
      a2[2] = (char *)v36;
      v33 = realloc(v33, v36);
      *a2 = (char *)v33;
      if ( v33 == nullptr )
        abort();
      v31 = a2[1];
      v34 = v31 + 1;
    }
    a2[1] = v34;
    v31[(_QWORD)v33] = 41;
  }
  else
  {
    (*(void (__fastcall **)(__int64 *, char **))(*v23 + 32))(v23, a2);
    if ( (*(_WORD *)((_BYTE *)v23 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64 *, char **))(*v23 + 40))(v23, a2);
  }
  v37 = a2[1];
  v38 = (unsigned __int64)a2[2];
  result = *a2;
  v40 = v37 + 1;
  --*((_DWORD *)a2 + 8);
  if ( (unsigned __int64)(v37 + 1) > v38 )
  {
    v41 = (unsigned __int64)(v37 + 993);
    if ( 2 * v38 <= v41 )
      v42 = v41;
    else
      v42 = 2 * v38;
    a2[2] = (char *)v42;
    result = (char *)realloc(result, v42);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v37 = a2[1];
    v40 = v37 + 1;
  }
  a2[1] = v40;
  v37[(_QWORD)result] = 41;
  return result;
}


// Address: 0x2B128 | Function: sub_2B128
void sub_2B128()
{
  sub_13E30();
}


// Address: 0x2B134 | Function: sub_2B134
void *__fastcall sub_2B134(__int64 a1, char **a2)
{
  void *result; // x0
  size_t v5; // x20
  char *v6; // x8
  size_t v7; // x9
  char *v8; // x0
  const void *v9; // x21
  char *v10; // x10
  size_t v11; // x1

  result = (void *)(*(__int64 (__fastcall **)(_QWORD))(**(_QWORD **)(a1 + 16) + 32LL))(*(_QWORD *)(a1 + 16));
  v5 = *(_QWORD *)(a1 + 32);
  if ( v5 != 0 )
  {
    v6 = a2[1];
    v7 = (size_t)a2[2];
    v8 = *a2;
    v9 = *(const void **)(a1 + 24);
    v10 = &v6[v5];
    if ( (unsigned __int64)&v6[v5] > v7 )
    {
      if ( 2 * v7 <= (unsigned __int64)(v10 + 992) )
        v11 = (size_t)(v10 + 992);
      else
        v11 = 2 * v7;
      a2[2] = (char *)v11;
      v8 = (char *)realloc(v8, v11);
      *a2 = v8;
      if ( v8 == nullptr )
        abort();
      v6 = a2[1];
    }
    result = memcpy(&v6[(_QWORD)v8], v9, v5);
    a2[1] += v5;
  }
  return result;
}


// Address: 0x2B1D8 | Function: sub_2B1D8
void sub_2B1D8()
{
  sub_13E30();
}


// Address: 0x2B1E4 | Function: sub_2B1E4
__int64 __fastcall sub_2B1E4(__int64 a1, __int64 *a2)
{
  _QWORD *v2; // x21
  __int64 v4; // x8
  _QWORD *v6; // x0
  __int64 result; // x0
  __int16 v8; // w8
  __int64 v9; // x9

  v2 = *(_QWORD **)(a1 + 4912);
  v4 = v2[1];
  if ( (unsigned __int64)(v4 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v6 = malloc(0x1000u);
    if ( v6 == nullptr )
      sub_13E4C();
    v4 = 0;
    *v6 = v2;
    v6[1] = 0;
    v2 = v6;
    *(_QWORD *)(a1 + 4912) = v6;
  }
  v2[1] = v4 + 32;
  *(_QWORD *)((char *)v2 + v4 + 16) = off_39228;
  result = (__int64)v2 + v4 + 16;
  v8 = *(_WORD *)((char *)v2 + v4 + 25);
  *(_BYTE *)(result + 8) = 30;
  v9 = *a2;
  *(_WORD *)(result + 9) = v8 & 0xF000 | 0x540;
  *(_QWORD *)(result + 16) = v9;
  return result;
}


// Address: 0x2B284 | Function: sub_2B284
__int64 __fastcall sub_2B284(__int64 a1, __int64 *a2, __int64 *a3)
{
  _QWORD *v3; // x22
  __int64 v6; // x8
  _QWORD *v8; // x0
  __int64 result; // x0
  __int16 v10; // w8
  __int64 v11; // x9
  __int64 v12; // x10

  v3 = *(_QWORD **)(a1 + 4912);
  v6 = v3[1];
  if ( (unsigned __int64)(v6 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v8 = malloc(0x1000u);
    if ( v8 == nullptr )
      sub_13E4C();
    v6 = 0;
    *v8 = v3;
    v8[1] = 0;
    v3 = v8;
    *(_QWORD *)(a1 + 4912) = v8;
  }
  v3[1] = v6 + 32;
  *(_QWORD *)((char *)v3 + v6 + 16) = off_39298;
  result = (__int64)v3 + v6 + 16;
  v10 = *(_WORD *)((char *)v3 + v6 + 25);
  *(_BYTE *)(result + 8) = 29;
  v11 = *a2;
  v12 = *a3;
  *(_WORD *)(result + 9) = v10 & 0xF000 | 0x540;
  *(_QWORD *)(result + 16) = v11;
  *(_QWORD *)(result + 24) = v12;
  return result;
}


// Address: 0x2B32C | Function: sub_2B32C
void *__fastcall sub_2B32C(__int64 a1, void **a2)
{
  char *v2; // x9
  unsigned __int64 v3; // x10
  char *v5; // x8
  unsigned __int64 v7; // x10
  size_t v8; // x9
  void *v9; // x0
  size_t v10; // x1
  char *v11; // x0
  __int64 *v12; // x20
  __int64 v13; // x9
  _BYTE *v14; // x8
  unsigned __int64 v15; // x9
  void *result; // x0
  unsigned __int64 v17; // x9
  size_t v18; // x8
  size_t v19; // x1

  v2 = (char *)a2[1];
  v3 = (unsigned __int64)a2[2];
  v5 = (char *)*a2;
  if ( (unsigned __int64)(v2 + 13) > v3 )
  {
    v7 = 2 * v3;
    v8 = (size_t)(v2 + 1005);
    v9 = *a2;
    if ( v7 <= v8 )
      v10 = v8;
    else
      v10 = v7;
    a2[2] = (void *)v10;
    v11 = (char *)realloc(v9, v10);
    *a2 = v11;
    if ( v11 == nullptr )
      abort();
    v2 = (char *)a2[1];
    v5 = v11;
  }
  qmemcpy(&v2[(_QWORD)v5], "pixel vector[", 13);
  v12 = *(__int64 **)(a1 + 16);
  v13 = *v12;
  a2[1] = (char *)a2[1] + 13;
  (*(void (__fastcall **)(__int64 *, void **))(v13 + 32))(v12, a2);
  if ( (*(_WORD *)((_BYTE *)v12 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64 *, void **))(*v12 + 40))(v12, a2);
  v14 = a2[1];
  v15 = (unsigned __int64)a2[2];
  result = *a2;
  if ( (unsigned __int64)(v14 + 1) > v15 )
  {
    v17 = 2 * v15;
    v18 = (size_t)(v14 + 993);
    if ( v17 <= v18 )
      v19 = v18;
    else
      v19 = v17;
    a2[2] = (void *)v19;
    result = realloc(result, v19);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v14 = a2[1];
  }
  v14[(_QWORD)result] = 93;
  a2[1] = (char *)a2[1] + 1;
  return result;
}


// Address: 0x2B44C | Function: sub_2B44C
void sub_2B44C()
{
  sub_13E30();
}


// Address: 0x2B458 | Function: sub_2B458
char *__fastcall sub_2B458(__int64 a1, char **a2)
{
  __int64 v2; // x21
  char *v5; // x8
  unsigned __int64 v6; // x9
  char *v7; // x0
  unsigned __int64 v8; // x9
  size_t v9; // x8
  size_t v10; // x1
  __int64 v11; // x20
  char *v12; // x8
  unsigned __int64 v13; // x9
  char *result; // x0
  unsigned __int64 v15; // x9
  size_t v16; // x8
  size_t v17; // x1

  v2 = *(_QWORD *)(a1 + 16);
  (*(void (__fastcall **)(__int64))(*(_QWORD *)v2 + 32LL))(v2);
  if ( (*(_WORD *)(v2 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v2 + 40LL))(v2, a2);
  v5 = a2[1];
  v6 = (unsigned __int64)a2[2];
  v7 = *a2;
  if ( (unsigned __int64)(v5 + 8) > v6 )
  {
    v8 = 2 * v6;
    v9 = (size_t)(v5 + 1000);
    if ( v8 <= v9 )
      v10 = v9;
    else
      v10 = v8;
    a2[2] = (char *)v10;
    v7 = (char *)realloc(v7, v10);
    *a2 = v7;
    if ( v7 == nullptr )
      abort();
    v5 = a2[1];
  }
  *(_QWORD *)&v5[(_QWORD)v7] = 0x5B726F7463657620LL;
  v11 = *(_QWORD *)(a1 + 24);
  a2[1] += 8;
  if ( v11 != 0 )
  {
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v11 + 32LL))(v11, a2);
    if ( (*(_WORD *)(v11 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v11 + 40LL))(v11, a2);
  }
  v12 = a2[1];
  v13 = (unsigned __int64)a2[2];
  result = *a2;
  if ( (unsigned __int64)(v12 + 1) > v13 )
  {
    v15 = 2 * v13;
    v16 = (size_t)(v12 + 993);
    if ( v15 <= v16 )
      v17 = v16;
    else
      v17 = v15;
    a2[2] = (char *)v17;
    result = (char *)realloc(result, v17);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v12 = a2[1];
  }
  v12[(_QWORD)result] = 93;
  ++a2[1];
  return result;
}


// Address: 0x2B5AC | Function: sub_2B5AC
void sub_2B5AC()
{
  sub_13E30();
}


// Address: 0x2B5B8 | Function: sub_2B5B8
__int64 __fastcall sub_2B5B8(__int64 a1, __int64 *a2, __int64 *a3)
{
  _QWORD *v3; // x22
  __int64 v6; // x8
  _QWORD *v8; // x0
  __int64 result; // x0
  __int16 v10; // w8
  __int64 v11; // x10
  __int64 v12; // x9

  v3 = *(_QWORD **)(a1 + 4912);
  v6 = v3[1];
  if ( (unsigned __int64)(v6 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v8 = malloc(0x1000u);
    if ( v8 == nullptr )
      sub_13E4C();
    v6 = 0;
    *v8 = v3;
    v8[1] = 0;
    v3 = v8;
    *(_QWORD *)(a1 + 4912) = v8;
  }
  v3[1] = v6 + 32;
  *(_QWORD *)((char *)v3 + v6 + 16) = off_39308;
  result = (__int64)v3 + v6 + 16;
  v10 = *(_WORD *)((char *)v3 + v6 + 25);
  v11 = *a2;
  *(_BYTE *)(result + 8) = 15;
  v12 = *a3;
  *(_WORD *)(result + 9) = v10 & 0xF000 | 0x400;
  *(_QWORD *)(result + 16) = v11;
  *(_QWORD *)(result + 24) = v12;
  return result;
}


// Address: 0x2B65C | Function: sub_2B65C
__int64 sub_2B65C()
{
  return 1;
}


// Address: 0x2B668 | Function: sub_2B668
__int64 sub_2B668()
{
  return 1;
}


// Address: 0x2B674 | Function: sub_2B674
__int64 __fastcall sub_2B674(__int64 a1)
{
  return (*(__int64 (__fastcall **)(_QWORD))(**(_QWORD **)(a1 + 16) + 32LL))(*(_QWORD *)(a1 + 16));
}


// Address: 0x2B688 | Function: sub_2B688
__int64 __fastcall sub_2B688(__int64 a1, __int64 a2)
{
  __int64 v2; // x8
  void *v4; // x0
  unsigned __int64 v6; // x9
  unsigned __int64 v7; // x9
  size_t v8; // x8
  size_t v9; // x1
  unsigned __int64 v10; // x9
  unsigned __int64 v11; // x9
  size_t v12; // x8
  size_t v13; // x1
  __int64 v14; // x21
  __int64 v15; // x8
  unsigned __int64 v16; // x9
  void *v17; // x0
  unsigned __int64 v18; // x9
  size_t v19; // x8
  size_t v20; // x1
  __int64 *v21; // x0
  __int64 v22; // x9

  v2 = *(_QWORD *)(a2 + 8);
  if ( v2 == 0 )
    sub_1405C("%s:%d: %s", "out/llvm-project/libcxxabi/src/demangle/Utility.h", 174, (const char *)&unk_9335);
  v4 = *(void **)a2;
  if ( *(_BYTE *)(*(_QWORD *)a2 + v2 - 1) != 93 )
  {
    v6 = *(_QWORD *)(a2 + 16);
    if ( v2 + 1 > v6 )
    {
      v7 = 2 * v6;
      v8 = v2 + 993;
      if ( v7 <= v8 )
        v9 = v8;
      else
        v9 = v7;
      *(_QWORD *)(a2 + 16) = v9;
      v4 = realloc(v4, v9);
      *(_QWORD *)a2 = v4;
      if ( v4 == nullptr )
        abort();
      v2 = *(_QWORD *)(a2 + 8);
    }
    *((_BYTE *)v4 + v2) = 32;
    v4 = *(void **)a2;
    v2 = *(_QWORD *)(a2 + 8) + 1LL;
    *(_QWORD *)(a2 + 8) = v2;
  }
  v10 = *(_QWORD *)(a2 + 16);
  if ( v2 + 1 > v10 )
  {
    v11 = 2 * v10;
    v12 = v2 + 993;
    if ( v11 <= v12 )
      v13 = v12;
    else
      v13 = v11;
    *(_QWORD *)(a2 + 16) = v13;
    v4 = realloc(v4, v13);
    *(_QWORD *)a2 = v4;
    if ( v4 == nullptr )
      abort();
    v2 = *(_QWORD *)(a2 + 8);
  }
  *((_BYTE *)v4 + v2) = 91;
  v14 = *(_QWORD *)(a1 + 24);
  ++*(_QWORD *)(a2 + 8);
  if ( v14 != 0 )
  {
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v14 + 32LL))(v14, a2);
    if ( (*(_WORD *)(v14 + 9) & 0xC0) != 0x40 )
      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v14 + 40LL))(v14, a2);
  }
  v15 = *(_QWORD *)(a2 + 8);
  v16 = *(_QWORD *)(a2 + 16);
  v17 = *(void **)a2;
  if ( v15 + 1 > v16 )
  {
    v18 = 2 * v16;
    v19 = v15 + 993;
    if ( v18 <= v19 )
      v20 = v19;
    else
      v20 = v18;
    *(_QWORD *)(a2 + 16) = v20;
    v17 = realloc(v17, v20);
    *(_QWORD *)a2 = v17;
    if ( v17 == nullptr )
      abort();
    v15 = *(_QWORD *)(a2 + 8);
  }
  *((_BYTE *)v17 + v15) = 93;
  v21 = *(__int64 **)(a1 + 16);
  v22 = *v21;
  ++*(_QWORD *)(a2 + 8);
  return (*(__int64 (__fastcall **)(__int64 *, __int64))(v22 + 40))(v21, a2);
}


// Address: 0x2B82C | Function: sub_2B82C
void sub_2B82C()
{
  sub_13E30();
}


// Address: 0x2B838 | Function: sub_2B838
__int64 __fastcall sub_2B838(__int64 a1, __int64 *a2, __int64 *a3)
{
  _QWORD *v3; // x22
  __int64 v6; // x8
  _QWORD *v8; // x0
  __int64 v9; // x10
  char v10; // w9
  __int64 result; // x0
  __int64 v12; // x12
  __int16 v13; // w8

  v3 = *(_QWORD **)(a1 + 4912);
  v6 = v3[1];
  if ( (unsigned __int64)(v6 - 4048) <= 0xFFFFFFFFFFFFF00FLL )
  {
    v8 = malloc(0x1000u);
    if ( v8 == nullptr )
      sub_13E4C();
    v6 = 0;
    *v8 = v3;
    v8[1] = 0;
    v3 = v8;
    *(_QWORD *)(a1 + 4912) = v8;
  }
  v9 = *a3;
  v3[1] = v6 + 32;
  v10 = *(_WORD *)(v9 + 9);
  *(_QWORD *)((char *)v3 + v6 + 16) = off_39378;
  result = (__int64)v3 + v6 + 16;
  v12 = *a2;
  v13 = v10 & 0xC0 | 0x500 | *(_WORD *)((_BYTE *)v3 + v6 + 25) & 0xF000;
  *(_BYTE *)(result + 8) = 14;
  *(_WORD *)(result + 9) = v13;
  *(_QWORD *)(result + 16) = v12;
  *(_QWORD *)(result + 24) = v9;
  return result;
}


// Address: 0x2B8EC | Function: sub_2B8EC
__int64 __fastcall sub_2B8EC(__int64 a1)
{
  __int64 v1; // x0
  unsigned int v2; // w8

  v1 = *(_QWORD *)(a1 + 24);
  v2 = *(unsigned __int8 *)(v1 + 9);
  if ( (v2 & 0xC0) == 0x80 )
    return (**(__int64 (__fastcall ***)(__int64))v1)(v1);
  else
    return v2 < 0x40;
}


// Address: 0x2B91C | Function: sub_2B91C
char *__fastcall sub_2B91C(__int64 a1, char **a2)
{
  __int64 v4; // x0
  unsigned int v5; // w8
  int v6; // w9
  int v7; // w8
  char *v8; // x8
  unsigned __int64 v9; // x9
  char *v10; // x0
  unsigned __int64 v11; // x9
  size_t v12; // x8
  size_t v13; // x1
  char v14; // w9
  unsigned __int64 v15; // x9
  unsigned __int64 v16; // x9
  size_t v17; // x8
  size_t v18; // x1
  __int64 *v19; // x20
  __int64 v20; // x9
  char *v21; // x8
  unsigned __int64 v22; // x9
  char *result; // x0
  unsigned __int64 v24; // x9
  size_t v25; // x8
  size_t v26; // x1
  char *v27; // x8

  (*(void (__fastcall **)(_QWORD))(**(_QWORD **)(a1 + 24) + 32LL))(*(_QWORD *)(a1 + 24));
  v4 = *(_QWORD *)(a1 + 24);
  v5 = *(unsigned __int16 *)(v4 + 9);
  v6 = (v5 >> 8) & 3;
  if ( v6 == 0 )
    goto LABEL_8;
  if ( v6 == 2 )
  {
    if ( ((*(__int64 (__fastcall **)(__int64, char **))(*(_QWORD *)v4 + 8LL))(v4, a2) & 1) != 0 )
    {
LABEL_8:
      v8 = a2[1];
      v9 = (unsigned __int64)a2[2];
      v10 = *a2;
      if ( (unsigned __int64)(v8 + 1) > v9 )
      {
        v11 = 2 * v9;
        v12 = (size_t)(v8 + 993);
        if ( v11 <= v12 )
          v13 = v12;
        else
          v13 = v11;
        a2[2] = (char *)v13;
        v10 = (char *)realloc(v10, v13);
        *a2 = v10;
        if ( v10 == nullptr )
          abort();
        v8 = a2[1];
      }
      v14 = 40;
      goto LABEL_22;
    }
    v4 = *(_QWORD *)(a1 + 24);
    v5 = *(unsigned __int16 *)(v4 + 9);
  }
  v7 = (v5 >> 10) & 3;
  if ( v7 == 0 || v7 == 2 && ((*(__int64 (__fastcall **)(__int64, char **))(*(_QWORD *)v4 + 16LL))(v4, a2) & 1) != 0 )
    goto LABEL_8;
  v8 = a2[1];
  v15 = (unsigned __int64)a2[2];
  v10 = *a2;
  if ( (unsigned __int64)(v8 + 1) > v15 )
  {
    v16 = 2 * v15;
    v17 = (size_t)(v8 + 993);
    if ( v16 <= v17 )
      v18 = v17;
    else
      v18 = v16;
    a2[2] = (char *)v18;
    v10 = (char *)realloc(v10, v18);
    *a2 = v10;
    if ( v10 == nullptr )
      abort();
    v8 = a2[1];
  }
  v14 = 32;
LABEL_22:
  v8[(_QWORD)v10] = v14;
  v19 = *(__int64 **)(a1 + 16);
  v20 = *v19;
  ++a2[1];
  (*(void (__fastcall **)(__int64 *, char **))(v20 + 32))(v19, a2);
  if ( (*(_WORD *)((_BYTE *)v19 + 9) & 0xC0) != 0x40 )
    (*(void (__fastcall **)(__int64 *, char **))(*v19 + 40))(v19, a2);
  v21 = a2[1];
  v22 = (unsigned __int64)a2[2];
  result = *a2;
  if ( (unsigned __int64)(v21 + 3) > v22 )
  {
    v24 = 2 * v22;
    v25 = (size_t)(v21 + 995);
    if ( v24 <= v25 )
      v26 = v25;
    else
      v26 = v24;
    a2[2] = (char *)v26;
    result = (char *)realloc(result, v26);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v21 = a2[1];
  }
  v27 = &v21[(_QWORD)result];
  v27[2] = 42;
  *(_WORD *)v27 = 14906;
  a2[1] += 3;
  return result;
}


// Address: 0x2BADC | Function: sub_2BADC
__int64 __fastcall sub_2BADC(__int64 a1, __int64 a2)
{
  __int64 v3; // x0
  unsigned int v5; // w8
  int v6; // w9
  int v7; // w8
  __int64 v8; // x8
  unsigned __int64 v9; // x9
  void *v10; // x0
  unsigned __int64 v11; // x9
  size_t v12; // x8
  size_t v13; // x1

  v3 = *(_QWORD *)(a1 + 24);
  v5 = *(unsigned __int16 *)(v3 + 9);
  v6 = (v5 >> 8) & 3;
  if ( v6 != 0 )
  {
    if ( v6 != 2 )
    {
LABEL_5:
      v7 = (v5 >> 10) & 3;
      if ( v7 != 0
        && (v7 != 2 || ((*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v3 + 16LL))(v3, a2) & 1) == 0) )
      {
        return (*(__int64 (__fastcall **)(_QWORD, __int64))(**(_QWORD **)(a1 + 24) + 40LL))(*(_QWORD *)(a1 + 24), a2);
      }
      goto LABEL_8;
    }
    if ( ((*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v3 + 8LL))(v3, a2) & 1) == 0 )
    {
      v3 = *(_QWORD *)(a1 + 24);
      v5 = *(unsigned __int16 *)(v3 + 9);
      goto LABEL_5;
    }
  }
LABEL_8:
  v8 = *(_QWORD *)(a2 + 8);
  v9 = *(_QWORD *)(a2 + 16);
  v10 = *(void **)a2;
  if ( v8 + 1 > v9 )
  {
    v11 = 2 * v9;
    v12 = v8 + 993;
    if ( v11 <= v12 )
      v13 = v12;
    else
      v13 = v11;
    *(_QWORD *)(a2 + 16) = v13;
    v10 = realloc(v10, v13);
    *(_QWORD *)a2 = v10;
    if ( v10 == nullptr )
      abort();
    v8 = *(_QWORD *)(a2 + 8);
  }
  *((_BYTE *)v10 + v8) = 41;
  ++*(_QWORD *)(a2 + 8);
  return (*(__int64 (__fastcall **)(_QWORD, __int64))(**(_QWORD **)(a1 + 24) + 40LL))(*(_QWORD *)(a1 + 24), a2);
}


// Address: 0x2BBC0 | Function: sub_2BBC0
void sub_2BBC0()
{
  sub_13E30();
}


// Address: 0x2BBCC | Function: sub_2BBCC
__int64 __fastcall sub_2BBCC(_QWORD *a1, char **a2)
{
  size_t v2; // x21
  size_t v3; // x8
  size_t v6; // x10
  const void *v7; // x22
  char *v8; // x0
  size_t v9; // x1
  unsigned __int64 v10; // x10
  size_t v11; // x9
  char *v12; // x0
  unsigned __int64 v13; // x8
  size_t v14; // x1
  __int64 v15; // x20
  __int64 result; // x0

  v2 = a1[3];
  v3 = (size_t)a2[1];
  if ( v2 != 0 )
  {
    v6 = (size_t)a2[2];
    v7 = (const void *)a1[2];
    v8 = *a2;
    if ( v3 + v2 > v6 )
    {
      if ( 2 * v6 <= v3 + v2 + 992 )
        v9 = v3 + v2 + 992;
      else
        v9 = 2 * v6;
      a2[2] = (char *)v9;
      v8 = (char *)realloc(v8, v9);
      *a2 = v8;
      if ( v8 == nullptr )
        abort();
      v3 = (size_t)a2[1];
    }
    memcpy(&v8[v3], v7, v2);
    v3 = (size_t)&a2[1][v2];
    a2[1] = (char *)v3;
  }
  v10 = (unsigned __int64)a2[2];
  v11 = v3 + 1;
  v12 = *a2;
  if ( v3 + 1 > v10 )
  {
    v13 = v3 + 993;
    if ( 2 * v10 <= v13 )
      v14 = v13;
    else
      v14 = 2 * v10;
    a2[2] = (char *)v14;
    v12 = (char *)realloc(v12, v14);
    *a2 = v12;
    if ( v12 == nullptr )
      abort();
    v3 = (size_t)a2[1];
    v11 = v3 + 1;
  }
  a2[1] = (char *)v11;
  v12[v3] = 32;
  v15 = a1[4];
  result = (*(__int64 (__fastcall **)(__int64, char **))(*(_QWORD *)v15 + 32LL))(v15, a2);
  if ( (*(_WORD *)(v15 + 9) & 0xC0) != 0x40 )
    return (*(__int64 (__fastcall **)(__int64, char **))(*(_QWORD *)v15 + 40LL))(v15, a2);
  return result;
}


// Address: 0x2BCFC | Function: sub_2BCFC
void sub_2BCFC()
{
  sub_13E30();
}


// Address: 0x2BD08 | Function: sub_2BD08
__int64 __fastcall sub_2BD08(__int64 a1)
{
  __int64 v1; // x0
  unsigned int v2; // w8

  v1 = *(_QWORD *)(a1 + 16);
  v2 = *(unsigned __int8 *)(v1 + 9);
  if ( (v2 & 0xC0) == 0x80 )
    return (**(__int64 (__fastcall ***)(__int64))v1)(v1);
  else
    return v2 < 0x40;
}


// Address: 0x2BD38 | Function: sub_2BD38
char *__fastcall sub_2BD38(__int64 a1, char **a2)
{
  __int64 v3; // x0
  __int64 v5; // x8
  __int64 *v6; // x8
  __int64 v7; // x9
  __int64 v8; // x8
  bool v9; // zf
  _BYTE *v10; // x0
  char *v11; // x8
  unsigned __int64 v12; // x9
  char *v13; // x0
  unsigned __int64 v14; // x9
  size_t v15; // x8
  size_t v16; // x1
  __int64 v17; // x0
  unsigned int v18; // w8
  int v19; // w9
  int v20; // w8
  char *v21; // x8
  unsigned __int64 v22; // x9
  char *v23; // x0
  unsigned __int64 v24; // x9
  size_t v25; // x8
  size_t v26; // x1
  unsigned __int64 v27; // x9
  char *result; // x0
  __int64 v29; // x8
  __int64 *v30; // x22
  unsigned __int64 v31; // x9
  size_t v32; // x8
  size_t v33; // x1
  char v34; // w9
  unsigned __int64 v35; // x10
  char *v36; // x8
  __int64 v37; // x9
  unsigned __int64 v38; // x10
  size_t v39; // x9
  __int64 v40; // x20
  char *v41; // x0
  size_t v42; // x1
  char *v43; // x0
  char *v44; // x8
  size_t v45; // x20
  size_t v46; // x10
  const void *v47; // x21
  char *v48; // x0
  size_t v49; // x1
  unsigned __int64 v50; // x9
  unsigned __int64 v51; // x9
  size_t v52; // x8
  size_t v53; // x1

  v3 = *(_QWORD *)(a1 + 16);
  if ( *(_BYTE *)(v3 + 8) != 11
    || *(_BYTE *)((v5 = *(_QWORD *)(v3 + 16)) + 8) != 8
    || *(_QWORD *)(v5 + 24) != 11
    || ((v6 = *(__int64 **)(v5 + 16), v7 = *v6, v8 = *(__int64 *)((char *)v6 + 3), v7 == 0x6A626F5F636A626FLL)
      ? (v9 = v8 == 0x7463656A626F5F63LL)
      : (v9 = false),
        !v9) )
  {
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v3 + 32LL))(v3, a2);
    v10 = *(_BYTE **)(a1 + 16);
    if ( (v10[10] & 3) == 0
      || (v10[10] & 3) == 2 && ((*(__int64 (__fastcall **)(_BYTE *, char **))(*(_QWORD *)v10 + 8LL))(v10, a2) & 1) != 0 )
    {
      v11 = a2[1];
      v12 = (unsigned __int64)a2[2];
      v13 = *a2;
      if ( (unsigned __int64)(v11 + 1) > v12 )
      {
        v14 = 2 * v12;
        v15 = (size_t)(v11 + 993);
        if ( v14 <= v15 )
          v16 = v15;
        else
          v16 = v14;
        a2[2] = (char *)v16;
        v13 = (char *)realloc(v13, v16);
        *a2 = v13;
        if ( v13 == nullptr )
          abort();
        v11 = a2[1];
      }
      v11[(_QWORD)v13] = 32;
      ++a2[1];
    }
    v17 = *(_QWORD *)(a1 + 16);
    v18 = *(unsigned __int16 *)(v17 + 9);
    v19 = (v18 >> 8) & 3;
    if ( v19 == 0 )
      goto LABEL_25;
    if ( v19 == 2 )
    {
      if ( ((*(__int64 (__fastcall **)(__int64, char **))(*(_QWORD *)v17 + 8LL))(v17, a2) & 1) != 0 )
        goto LABEL_25;
      v17 = *(_QWORD *)(a1 + 16);
      v18 = *(unsigned __int16 *)(v17 + 9);
    }
    v20 = (v18 >> 10) & 3;
    if ( v20 != 0
      && (v20 != 2 || ((*(__int64 (__fastcall **)(__int64, char **))(*(_QWORD *)v17 + 16LL))(v17, a2) & 1) == 0) )
    {
LABEL_32:
      v27 = (unsigned __int64)a2[2];
      result = *a2;
      v30 = (__int64 *)(a2 + 1);
      v29 = (__int64)a2[1];
      if ( v29 + 1 > v27 )
      {
        v31 = 2 * v27;
        v32 = v29 + 993;
        if ( v31 <= v32 )
          v33 = v32;
        else
          v33 = v31;
        a2[2] = (char *)v33;
        result = (char *)realloc(result, v33);
        *a2 = result;
        if ( result == nullptr )
          abort();
        v29 = *v30;
      }
      v34 = 42;
      goto LABEL_39;
    }
LABEL_25:
    v21 = a2[1];
    v22 = (unsigned __int64)a2[2];
    v23 = *a2;
    if ( (unsigned __int64)(v21 + 1) > v22 )
    {
      v24 = 2 * v22;
      v25 = (size_t)(v21 + 993);
      if ( v24 <= v25 )
        v26 = v25;
      else
        v26 = v24;
      a2[2] = (char *)v26;
      v23 = (char *)realloc(v23, v26);
      *a2 = v23;
      if ( v23 == nullptr )
        abort();
      v21 = a2[1];
    }
    v21[(_QWORD)v23] = 40;
    ++a2[1];
    goto LABEL_32;
  }
  v35 = (unsigned __int64)a2[2];
  v36 = *a2;
  v30 = (__int64 *)(a2 + 1);
  v37 = (__int64)a2[1];
  if ( v37 + 3 > v35 )
  {
    v38 = 2 * v35;
    v39 = v37 + 995;
    v40 = v3;
    v41 = *a2;
    if ( v38 <= v39 )
      v42 = v39;
    else
      v42 = v38;
    a2[2] = (char *)v42;
    v43 = (char *)realloc(v41, v42);
    *a2 = v43;
    if ( v43 == nullptr )
      abort();
    v37 = *v30;
    v36 = v43;
    v3 = v40;
  }
  v44 = &v36[v37];
  v44[2] = 60;
  *(_WORD *)v44 = 25705;
  v29 = *v30 + 3;
  *v30 = v29;
  v45 = *(_QWORD *)(v3 + 32);
  if ( v45 != 0 )
  {
    v46 = (size_t)a2[2];
    v47 = *(const void **)(v3 + 24);
    v48 = *a2;
    if ( v29 + v45 > v46 )
    {
      if ( 2 * v46 <= v29 + v45 + 992 )
        v49 = v29 + v45 + 992;
      else
        v49 = 2 * v46;
      a2[2] = (char *)v49;
      v48 = (char *)realloc(v48, v49);
      *a2 = v48;
      if ( v48 == nullptr )
        abort();
      v29 = *v30;
    }
    memcpy(&v48[v29], v47, v45);
    v29 = *v30 + v45;
    *v30 = v29;
  }
  v50 = (unsigned __int64)a2[2];
  result = *a2;
  if ( v29 + 1 > v50 )
  {
    v51 = 2 * v50;
    v52 = v29 + 993;
    if ( v51 <= v52 )
      v53 = v52;
    else
      v53 = v51;
    a2[2] = (char *)v53;
    result = (char *)realloc(result, v53);
    *a2 = result;
    if ( result == nullptr )
      abort();
    v29 = *v30;
  }
  v34 = 62;
LABEL_39:
  result[v29] = v34;
  ++*v30;
  return result;
}


// Address: 0x2C078 | Function: sub_2C078
__int64 __fastcall sub_2C078(__int64 a1, __int64 a2)
{
  __int64 result; // x0
  __int64 v5; // x8
  __int64 *v6; // x8
  __int64 v7; // x9
  __int64 v8; // x8
  bool v9; // zf
  unsigned int v10; // w8
  int v11; // w9
  int v12; // w8
  __int64 v13; // x8
  unsigned __int64 v14; // x9
  void *v15; // x0
  unsigned __int64 v16; // x9
  size_t v17; // x8
  size_t v18; // x1

  result = *(_QWORD *)(a1 + 16);
  if ( *(_BYTE *)(result + 8) != 11
    || *(_BYTE *)((v5 = *(_QWORD *)(result + 16)) + 8) != 8
    || *(_QWORD *)(v5 + 24) != 11
    || ((v6 = *(__int64 **)(v5 + 16), v7 = *v6, v8 = *(__int64 *)((char *)v6 + 3), v7 == 0x6A626F5F636A626FLL)
      ? (v9 = v8 == 0x7463656A626F5F63LL)
      : (v9 = false),
        !v9) )
  {
    v10 = *(unsigned __int16 *)(result + 9);
    v11 = (v10 >> 8) & 3;
    if ( v11 != 0 )
    {
      if ( v11 == 2 )
      {
        if ( ((*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)result + 8LL))(result, a2) & 1) != 0 )
          goto LABEL_15;
        result = *(_QWORD *)(a1 + 16);
        v10 = *(unsigned __int16 *)(result + 9);
      }
      v12 = (v10 >> 10) & 3;
      if ( v12 != 0
        && (v12 != 2 || ((*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)result + 16LL))(result, a2) & 1) == 0) )
      {
        return (*(__int64 (__fastcall **)(_QWORD, __int64))(**(_QWORD **)(a1 + 16) + 40LL))(*(_QWORD *)(a1 + 16), a2);
      }
    }
LABEL_15:
    v13 = *(_QWORD *)(a2 + 8);
    v14 = *(_QWORD *)(a2 + 16);
    v15 = *(void **)a2;
    if ( v13 + 1 > v14 )
    {
      v16 = 2 * v14;
      v17 = v13 + 993;
      if ( v16 <= v17 )
        v18 = v17;
      else
        v18 = v16;
      *(_QWORD *)(a2 + 16) = v18;
      v15 = realloc(v15, v18);
      *(_QWORD *)a2 = v15;
      if ( v15 == nullptr )
        abort();
      v13 = *(_QWORD *)(a2 + 8);
    }
    *((_BYTE *)v15 + v13) = 41;
    ++*(_QWORD *)(a2 + 8);
    return (*(__int64 (__fastcall **)(_QWORD, __int64))(**(_QWORD **)(a1 + 16) + 40LL))(*(_QWORD *)(a1 + 16), a2);
  }
  return result;
}


// Address: 0x2C1CC | Function: sub_2C1CC
void sub_2C1CC()
{
  sub_13E30();
}


// Address: 0x2C1D8 | Function: sub_2C1D8
__int64 __fastcall sub_2C1D8(__int64 a1)
{
  __int64 v1; // x0
  unsigned int v2; // w8

  v1 = *(_QWORD *)(a1 + 16);
  v2 = *(unsigned __int8 *)(v1 + 9);
  if ( (v2 & 0xC0) == 0x80 )
    return (**(__int64 (__fastcall ***)(__int64))v1)(v1);
  else
    return v2 < 0x40;
}


// Address: 0x2C208 | Function: sub_2C208
_BYTE *__fastcall sub_2C208(_BYTE *result, char **a2)
{
  char v2; // w23
  _BYTE *v3; // x19
  __int64 v5; // x1
  __int64 v6; // x22
  int v7; // w21
  char *v8; // x8
  unsigned __int64 v9; // x9
  char *v10; // x0
  unsigned __int64 v11; // x9
  size_t v12; // x8
  size_t v13; // x1
  unsigned int v14; // w8
  int v15; // w9
  int v16; // w8
  char *v17; // x8
  unsigned __int64 v18; // x9
  char *v19; // x0
  unsigned __int64 v20; // x9
  size_t v21; // x8
  size_t v22; // x1
  bool v23; // zf
  size_t v24; // x21
  char *v25; // x8
  size_t v26; // x9
  char *v27; // x0
  const char *v28; // x22
  char *v29; // x10
  size_t v30; // x1

  v2 = result[28];
  if ( (v2 & 1) == 0 )
  {
    v3 = result;
    result[28] = 1;
    result = (_BYTE *)sub_2C54C();
    v6 = v5;
    if ( v5 == 0 )
    {
LABEL_40:
      v3[28] = v2;
      return result;
    }
    v7 = (int)result;
    (*(void (__fastcall **)(__int64, char **))(*(_QWORD *)v5 + 32LL))(v5, a2);
    if ( (*(_BYTE *)(v6 + 10) & 3) == 0
      || (*(_BYTE *)(v6 + 10) & 3) == 2
      && ((*(__int64 (__fastcall **)(__int64, char **))(*(_QWORD *)v6 + 8LL))(v6, a2) & 1) != 0 )
    {
      v8 = a2[1];
      v9 = (unsigned __int64)a2[2];
      v10 = *a2;
      if ( (unsigned __int64)(v8 + 1) > v9 )
      {
        v11 = 2 * v9;
        v12 = (size_t)(v8 + 993);
        if ( v11 <= v12 )
          v13 = v12;
        else
          v13 = v11;
        a2[2] = (char *)v13;
        v10 = (char *)realloc(v10, v13);
        *a2 = v10;
        if ( v10 == nullptr )
          abort();
        v8 = a2[1];
      }
      v8[(_QWORD)v10] = 32;
      ++a2[1];
    }
    v14 = *(unsigned __int16 *)(v6 + 9);
    v15 = (v14 >> 8) & 3;
    if ( v15 == 0 )
      goto LABEL_20;
    if ( v15 == 2 )
    {
      if ( ((*(__int64 (__fastcall **)(__int64, char **))(*(_QWORD *)v6 + 8LL))(v6, a2) & 1) != 0 )
        goto LABEL_20;
      v14 = *(unsigned __int16 *)(v6 + 9);
    }
    v16 = (v14 >> 10) & 3;
    if ( v16 != 0
      && (v16 != 2 || ((*(__int64 (__fastcall **)(__int64, char **))(*(_QWORD *)v6 + 16LL))(v6, a2) & 1) == 0) )
    {
LABEL_27:
      v23 = v7 == 0;
      if ( v7 != 0 )
        v24 = 2;
      else
        v24 = 1;
      v25 = a2[1];
      v26 = (size_t)a2[2];
      v27 = *a2;
      if ( v23 )
        v28 = "&";
      else
        v28 = "&&";
      v29 = &v25[v24];
      if ( (unsigned __int64)&v25[v24] > v26 )
      {
        if ( 2 * v26 <= (unsigned __int64)(v29 + 992) )
          v30 = (size_t)(v29 + 992);
        else
          v30 = 2 * v26;
        a2[2] = (char *)v30;
        v27 = (char *)realloc(v27, v30);
        *a2 = v27;
        if ( v27 == nullptr )
          abort();
        v25 = a2[1];
      }
      result = memcpy(&v25[(_QWORD)v27], v28, v24);
      a2[1] += v24;
      goto LABEL_40;
    }
LABEL_20:
    v17 = a2[1];
    v18 = (unsigned __int64)a2[2];
    v19 = *a2;
    if ( (unsigned __int64)(v17 + 1) > v18 )
    {
      v20 = 2 * v18;
      v21 = (size_t)(v17 + 993);
      if ( v20 <= v21 )
        v22 = v21;
      else
        v22 = v20;
      a2[2] = (char *)v22;
      v19 = (char *)realloc(v19, v22);
      *a2 = v19;
      if ( v19 == nullptr )
        abort();
      v17 = a2[1];
    }
    v17[(_QWORD)v19] = 40;
    ++a2[1];
    goto LABEL_27;
  }
  return result;
}


// Address: 0x2C418 | Function: sub_2C418
void __fastcall __noreturn sub_2C418(__int64 a1)
{
  __int64 v1; // x19
  char v2; // w23

  *(_BYTE *)(v1 + 28) = v2;
  sub_2E950(a1);
}


// Address: 0x2C420 | Function: sub_2C420
__int64 __fastcall sub_2C420(__int64 result, __int64 a2)
{
  char v2; // w22
  __int64 v3; // x19
  __int64 v5; // x1
  __int64 v6; // x21
  unsigned int v7; // w8
  int v8; // w9
  int v9; // w8
  __int64 v10; // x8
  unsigned __int64 v11; // x9
  void *v12; // x0
  unsigned __int64 v13; // x9
  size_t v14; // x8
  size_t v15; // x1

  v2 = *(_BYTE *)(result + 28);
  if ( (v2 & 1) == 0 )
  {
    v3 = result;
    *(_BYTE *)(result + 28) = 1;
    result = sub_2C54C();
    v6 = v5;
    if ( v5 == 0 )
    {
LABEL_18:
      *(_BYTE *)(v3 + 28) = v2;
      return result;
    }
    v7 = *(unsigned __int16 *)(v5 + 9);
    v8 = (v7 >> 8) & 3;
    if ( v8 != 0 )
    {
      if ( v8 == 2 )
      {
        if ( ((*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v5 + 8LL))(v5, a2) & 1) != 0 )
          goto LABEL_10;
        v7 = *(unsigned __int16 *)(v6 + 9);
      }
      v9 = (v7 >> 10) & 3;
      if ( v9 != 0
        && (v9 != 2 || ((*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v6 + 16LL))(v6, a2) & 1) == 0) )
      {
LABEL_17:
        result = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v6 + 40LL))(v6, a2);
        goto LABEL_18;
      }
    }
LABEL_10:
    v10 = *(_QWORD *)(a2 + 8);
    v11 = *(_QWORD *)(a2 + 16);
    v12 = *(void **)a2;
    if ( v10 + 1 > v11 )
    {
      v13 = 2 * v11;
      v14 = v10 + 993;
      if ( v13 <= v14 )
        v15 = v14;
      else
        v15 = v13;
      *(_QWORD *)(a2 + 16) = v15;
      v12 = realloc(v12, v15);
      *(_QWORD *)a2 = v12;
      if ( v12 == nullptr )
        abort();
      v10 = *(_QWORD *)(a2 + 8);
    }
    *((_BYTE *)v12 + v10) = 41;
    ++*(_QWORD *)(a2 + 8);
    goto LABEL_17;
  }
  return result;
}


// Address: 0x2C530 | Function: sub_2C530
void __fastcall __noreturn sub_2C530(__int64 a1)
{
  __int64 v1; // x19
  char v2; // w22

  *(_BYTE *)(v1 + 28) = v2;
  sub_2E950(a1);
}


// Address: 0x2C538 | Function: sub_2C538
void sub_2C538()
{
  ;
}


// Address: 0x2C540 | Function: sub_2C540
void sub_2C540()
{
  sub_13E30();
}


// Address: 0x2C54C | Function: sub_2C54C
__int64 __fastcall sub_2C54C(__int64 a1, __int64 a2)
{
  unsigned int v2; // w25
  __int64 v3; // x20
  __int64 v5; // x0
  char *v6; // x23
  signed __int64 v7; // x21
  char *v8; // x0
  char *v9; // x23
  char *v10; // x0
  unsigned __int64 v11; // x8
  unsigned __int64 v12; // x9
  char *ptr; // [xsp+8h] [xbp-58h]
  char *v15; // [xsp+10h] [xbp-50h]
  char *v16; // [xsp+18h] [xbp-48h]
  _QWORD v17[8]; // [xsp+20h] [xbp-40h] BYREF
  __int64 v18; // [xsp+60h] [xbp+0h] BYREF

  v2 = *(_DWORD *)(a1 + 24);
  v3 = *(_QWORD *)(a1 + 16);
  ptr = (char *)v17;
  v15 = (char *)v17;
  v16 = (char *)&v18;
  memset(v17, 0, sizeof(v17));
  while ( 1 )
  {
    v5 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v3 + 24LL))(v3, a2);
    if ( *(_BYTE *)(v5 + 8) != 13 )
      break;
    v6 = v15;
    v3 = *(_QWORD *)(v5 + 16);
    if ( *(_DWORD *)(v5 + 24) < (signed int)v2 )
      v2 = *(_DWORD *)(v5 + 24);
    if ( v15 == v16 )
    {
      v7 = v15 - ptr;
      if ( ptr == (char *)v17 )
      {
        v8 = (char *)malloc(2 * (v15 - ptr));
        if ( v8 == nullptr )
          abort();
        if ( v15 != (char *)v17 )
        {
          v9 = v8;
          memmove(v8, ptr, v7);
          v8 = v9;
        }
        ptr = v8;
      }
      else
      {
        v8 = (char *)realloc(ptr, 2 * (v15 - ptr));
        ptr = v8;
        if ( v8 == nullptr )
          abort();
      }
      v6 = &v8[v7];
      v16 = &v8[8 * (v7 >> 2)];
    }
    v15 = v6 + 8;
    *(_QWORD *)v6 = v3;
    v10 = ptr;
    v11 = (v6 + 8 - ptr) >> 3;
    if ( v11 >= 2 )
    {
      v12 = (v11 - 1) >> 1;
      if ( v12 >= v11 )
        sub_1405C("%s:%d: %s", "out/llvm-project/libcxxabi/src/demangle/ItaniumDemangle.h", 148, "Invalid access!");
      if ( v3 == *(_QWORD *)&ptr[8 * v12] )
      {
        if ( ptr == (char *)v17 )
          return v2;
        goto LABEL_20;
      }
    }
  }
  v10 = ptr;
  if ( ptr == (char *)v17 )
    return v2;
LABEL_20:
  free(v10);
  return v2;
}


// Address: 0x2C6E4 | Function: sub_2C6E4
void __fastcall __noreturn sub_2C6E4(
        __int64 a1,
        int a2,
        int a3,
        int a4,
        int a5,
        int a6,
        int a7,
        int a8,
        int a9,
        void *ptr)
{
  void *v10; // x24

  if ( ptr != v10 )
    free(ptr);
  sub_2E950(a1);
}


// Address: 0x2C704 | Function: sub_2C704
__int64 sub_2C704()
{
  return sub_2D0B4();
}


// Address: 0x2C70C | Function: sub_2C70C
void sub_2C70C()
{
  ;
}


// Address: 0x2C714 | Function: sub_2C714
void sub_2C714()
{
  ;
}


// Address: 0x2C71C | Function: sub_2C71C
void sub_2C71C()
{
  sub_2D0B4();
  sub_13E30();
}


// Address: 0x2C74C | Function: sub_2C74C
void sub_2C74C()
{
  sub_2D0B4();
  sub_13E30();
}


// Address: 0x2C77C | Function: sub_2C77C
__int64 __fastcall sub_2C77C(__int64 a1, __int64 a2, __int64 *a3)
{
  __int64 result; // x0
  __int64 v6; // x2
  _QWORD v7[4]; // [xsp+8h] [xbp-58h] BYREF
  __int128 v8; // [xsp+28h] [xbp-38h]
  _BYTE v9[31]; // [xsp+38h] [xbp-28h] BYREF
  char v10; // [xsp+57h] [xbp-9h]
  __int64 v11; // [xsp+58h] [xbp-8h]

  if ( *(_QWORD *)(a1 + 8) == *(_QWORD *)(a2 + 8) )
    return 1;
  result = sub_2C868(a2, &`typeinfo for'__cxxabiv1::__shim_type_info, &`typeinfo for'__cxxabiv1::__class_type_info, 0);
  if ( result != 0 )
  {
    v6 = *a3;
    if ( *a3 == 0 )
      sub_1405C(
        "%s:%d: %s",
        "out/llvm-project/libcxxabi/src/private_typeinfo.cpp",
        485,
        "catching a class without an object?");
    v11 = 0;
    v7[2] = a1;
    v7[3] = -1;
    v10 = 1;
    v7[0] = result;
    v7[1] = 0;
    v8 = 0u;
    memset(v9, 0, sizeof(v9));
    *(_DWORD *)&v9[24] = 1;
    (*(void (__fastcall **)(__int64, _QWORD *, __int64, __int64))(*(_QWORD *)result + 56LL))(result, v7, v6, 1);
    result = *(_DWORD *)v9 == 1;
    if ( *(_DWORD *)v9 == 1 )
      *a3 = v8;
  }
  return result;
}


// Address: 0x2C868 | Function: sub_2C868
char *__fastcall sub_2C868(_QWORD *a1, _QWORD *a2, _QWORD *a3, __int64 a4)
{
  __int64 v4; // x8
  _QWORD *v5; // x20
  char *v6; // x19
  _QWORD *v7; // x21
  _QWORD *v8; // x23
  _QWORD *v9; // x24
  __int64 v10; // x25
  char *v11; // x22
  char *v12; // x8
  bool v15; // zf
  __int64 v16; // x8
  void (__fastcall *v17)(_QWORD *, _QWORD *, char *, char *, __int64, _QWORD); // x8
  _QWORD v19[2]; // [xsp+8h] [xbp-98h] BYREF
  _QWORD *v20; // [xsp+18h] [xbp-88h]
  __int64 v21; // [xsp+20h] [xbp-80h]
  __int128 v22; // [xsp+28h] [xbp-78h]
  int8x16x2_t v23; // [xsp+38h] [xbp-68h] BYREF
  __int64 v24; // [xsp+58h] [xbp-48h]

  v4 = *(_QWORD *)(*a1 - 16LL);
  v5 = *(_QWORD **)(*a1 - 8LL);
  v6 = (char *)a1 + v4;
  if ( v5[1] == a3[1] )
  {
    if ( a4 < 0 )
    {
      if ( a4 == -2 )
        return nullptr;
      v23.val[1].n128_u64[1] = 0x100000000000001LL;
      v16 = *a3;
      v24 = 0;
      v22 = 0u;
      memset(&v23, 0, 24);
      v17 = *(void (__fastcall **)(_QWORD *, _QWORD *, char *, char *, __int64, _QWORD))(v16 + 40);
      v19[0] = a3;
      v19[1] = a1;
      v20 = a2;
      v21 = a4;
      v17(a3, v19, v6, v6, 1, 0);
      v15 = v23.val[0].n128_u32[0] == 1;
    }
    else
    {
      v15 = v4 + a4 == 0;
    }
    if ( v15 )
      return v6;
    else
      return nullptr;
  }
  else
  {
    if ( a4 < 0 )
      goto LABEL_5;
    if ( (__int64)((char *)a1 - a4) < (__int64)v6 )
      goto LABEL_5;
    v19[0] = *(_QWORD *)(*a1 - 8LL);
    v19[1] = (char *)a1 - a4;
    v7 = a2;
    v20 = a3;
    v21 = a4;
    v8 = a1;
    v9 = a3;
    memset(&v23, 0, 24);
    v10 = a4;
    v22 = 0u;
    v23.val[1].n128_u64[1] = 0x100000000000001LL;
    v11 = (char *)a1 - a4;
    v24 = 0;
    (*(void (__fastcall **)(_QWORD *, _QWORD *, char *, char *, __int64, _QWORD))(*v5 + 40LL))(v5, v19, v6, v6, 1, 0);
    a1 = v8;
    v12 = v11;
    a2 = v7;
    a4 = v10;
    a3 = v9;
    if ( v23.val[0].n128_u32[0] == 0 )
    {
LABEL_5:
      v19[0] = a3;
      v19[1] = a1;
      v20 = a2;
      v21 = a4;
      v23.val[1].n128_u8[15] = 1;
      v24 = 0;
      v22 = 0u;
      memset(&v23, 0, 31);
      (*(void (__fastcall **)(_QWORD *, _QWORD *, char *, __int64, _QWORD))(*v5 + 48LL))(v5, v19, v6, 1, 0);
      if ( v23.val[0].n128_u32[3] == 1 )
      {
        if ( v23.val[0].n128_u32[0] == 1 )
          return (char *)v22;
        v12 = nullptr;
        if ( v23.val[1].n128_u32[0] == 0 && *(unsigned __int64 *)((char *)v23.val[0].n128_u64 + 4) == 0x100000001LL )
          return (char *)v22;
      }
      else
      {
        v12 = nullptr;
        if ( v23.val[0].n128_u32[3] == 0 )
        {
          v12 = *((char **)&v22 + 1);
          if ( v23.val[0].n128_u32[2] != 1 || v23.val[0].n128_u32[1] != 1 || v23.val[1].n128_u32[0] != 1 )
            return nullptr;
        }
      }
    }
  }
  return v12;
}


// Address: 0x2CA74 | Function: sub_2CA74
__int64 __fastcall sub_2CA74(__int64 result, __int64 a2, __int64 a3, int a4)
{
  int v4; // w8
  __int64 v5; // x8

  if ( *(_QWORD *)(result + 8) == *(_QWORD *)(*(_QWORD *)(a2 + 16) + 8LL) )
  {
    v4 = *(_DWORD *)(a2 + 60);
    if ( v4 != 0 )
    {
      if ( *(_QWORD *)(a2 + 40) == *(_QWORD *)(a2 + 80) && *(_QWORD *)(a2 + 32) == a3 )
      {
        if ( *(_DWORD *)(a2 + 48) == 2 )
          *(_DWORD *)(a2 + 48) = a4;
      }
      else
      {
        *(_DWORD *)(a2 + 60) = v4 + 1;
        *(_DWORD *)(a2 + 48) = 2;
        *(_BYTE *)(a2 + 78) = 1;
      }
    }
    else
    {
      v5 = *(_QWORD *)(a2 + 80);
      *(_DWORD *)(a2 + 48) = a4;
      *(_DWORD *)(a2 + 60) = 1;
      *(_QWORD *)(a2 + 32) = a3;
      *(_QWORD *)(a2 + 40) = v5;
    }
  }
  return result;
}


// Address: 0x2CAFC | Function: sub_2CAFC
__int64 __fastcall sub_2CAFC(__int64 result, __int64 a2, __int64 a3, int a4)
{
  int v4; // w8
  __int64 v5; // x8

  if ( *(_QWORD *)(result + 8) != *(_QWORD *)(*(_QWORD *)(a2 + 16) + 8LL) )
    return (*(__int64 (__fastcall **)(_QWORD))(**(_QWORD **)(result + 16) + 56LL))(*(_QWORD *)(result + 16));
  v4 = *(_DWORD *)(a2 + 60);
  if ( v4 != 0 )
  {
    if ( *(_QWORD *)(a2 + 40) == *(_QWORD *)(a2 + 80) && *(_QWORD *)(a2 + 32) == a3 )
    {
      if ( *(_DWORD *)(a2 + 48) == 2 )
        *(_DWORD *)(a2 + 48) = a4;
    }
    else
    {
      *(_DWORD *)(a2 + 60) = v4 + 1;
      *(_DWORD *)(a2 + 48) = 2;
      *(_BYTE *)(a2 + 78) = 1;
    }
  }
  else
  {
    v5 = *(_QWORD *)(a2 + 80);
    *(_DWORD *)(a2 + 48) = a4;
    *(_DWORD *)(a2 + 60) = 1;
    *(_QWORD *)(a2 + 32) = a3;
    *(_QWORD *)(a2 + 40) = v5;
  }
  return result;
}


// Address: 0x2CB90 | Function: sub_2CB90
__int64 __fastcall sub_2CB90(__int64 result, __int64 a2, __int64 a3, __int64 a4, char a5)
{
  __int64 v5; // x8
  __int64 v9; // x22
  const char *v10; // x23
  unsigned int v11; // w24
  int v12; // w8
  char v13; // w8
  __int64 v14; // x9
  int v15; // w8
  int v16; // w9

  v5 = *(_QWORD *)(a2 + 16);
  v9 = result;
  if ( (a5 & 1) == 0 )
  {
    v14 = *(_QWORD *)(result + 8);
    if ( v14 != *(_QWORD *)(v5 + 8) )
    {
      if ( v14 == *(_QWORD *)(*(_QWORD *)a2 + 8LL) )
        goto LABEL_6;
      return (*(__int64 (__fastcall **)(_QWORD, __int64, __int64, __int64, _QWORD))(**(_QWORD **)(v9 + 16) + 48LL))(
               *(_QWORD *)(v9 + 16),
               a2,
               a3,
               a4,
               a5 & 1);
    }
LABEL_15:
    if ( a3 == *(_QWORD *)(a2 + 8) && *(_DWORD *)(a2 + 52) != 1 )
      *(_DWORD *)(a2 + 52) = a4;
    return result;
  }
  if ( result == v5 )
    goto LABEL_15;
  v10 = *(const char **)(result + 8);
  v11 = a4;
  result = strcmp(v10, *(const char **)(v5 + 8));
  LODWORD(a4) = v11;
  if ( (_DWORD)result == 0 )
    goto LABEL_15;
  if ( v9 != *(_QWORD *)a2 )
  {
    result = strcmp(v10, *(const char **)(*(_QWORD *)a2 + 8LL));
    a4 = v11;
    if ( (_DWORD)result != 0 )
      return (*(__int64 (__fastcall **)(_QWORD, __int64, __int64, __int64, _QWORD))(**(_QWORD **)(v9 + 16) + 48LL))(
               *(_QWORD *)(v9 + 16),
               a2,
               a3,
               a4,
               a5 & 1);
  }
LABEL_6:
  if ( a3 == *(_QWORD *)(a2 + 32) || a3 == *(_QWORD *)(a2 + 40) )
  {
    if ( (_DWORD)a4 == 1 )
      *(_DWORD *)(a2 + 56) = 1;
  }
  else
  {
    v12 = *(_DWORD *)(a2 + 68);
    *(_DWORD *)(a2 + 56) = a4;
    if ( v12 != 4 )
    {
      *(_WORD *)(a2 + 76) = 0;
      result = (*(__int64 (__fastcall **)(_QWORD, __int64, __int64, __int64, __int64, _QWORD))(**(_QWORD **)(v9 + 16)
                                                                                             + 40LL))(
                 *(_QWORD *)(v9 + 16),
                 a2,
                 a3,
                 a3,
                 1,
                 a5 & 1);
      if ( *(_BYTE *)(a2 + 77) == 1 )
      {
        v13 = *(_BYTE *)(a2 + 76);
        *(_DWORD *)(a2 + 68) = 3;
        if ( (v13 & 1) != 0 )
          return result;
      }
      else
      {
        *(_DWORD *)(a2 + 68) = 4;
      }
    }
    v16 = *(_DWORD *)(a2 + 60);
    v15 = *(_DWORD *)(a2 + 64);
    *(_QWORD *)(a2 + 40) = a3;
    *(_DWORD *)(a2 + 64) = v15 + 1;
    if ( v16 == 1 && *(_DWORD *)(a2 + 48) == 2 )
      *(_BYTE *)(a2 + 78) = 1;
  }
  return result;
}


// Address: 0x2CD44 | Function: sub_2CD44
__int64 __fastcall sub_2CD44(__int64 result, __int64 a2, __int64 a3, int a4, char a5)
{
  __int64 v5; // x8
  const char *v9; // x22
  __int64 v10; // x23
  __int64 v11; // x9
  int v12; // w8
  int v13; // w9

  v5 = *(_QWORD *)(a2 + 16);
  if ( (a5 & 1) != 0 )
  {
    if ( result != v5 )
    {
      v9 = *(const char **)(result + 8);
      v10 = result;
      result = strcmp(v9, *(const char **)(v5 + 8));
      if ( (_DWORD)result != 0 )
      {
        if ( v10 != *(_QWORD *)a2 )
        {
          result = strcmp(v9, *(const char **)(*(_QWORD *)a2 + 8LL));
          if ( (_DWORD)result != 0 )
            return result;
        }
        goto LABEL_9;
      }
    }
  }
  else
  {
    v11 = *(_QWORD *)(result + 8);
    if ( v11 != *(_QWORD *)(v5 + 8) )
    {
      if ( v11 != *(_QWORD *)(*(_QWORD *)a2 + 8LL) )
        return result;
LABEL_9:
      if ( a3 == *(_QWORD *)(a2 + 32) || a3 == *(_QWORD *)(a2 + 40) )
      {
        if ( a4 == 1 )
          *(_DWORD *)(a2 + 56) = 1;
      }
      else
      {
        v13 = *(_DWORD *)(a2 + 60);
        v12 = *(_DWORD *)(a2 + 64);
        *(_DWORD *)(a2 + 56) = a4;
        *(_QWORD *)(a2 + 40) = a3;
        *(_DWORD *)(a2 + 64) = v12 + 1;
        if ( v13 == 1 && *(_DWORD *)(a2 + 48) == 2 )
          *(_BYTE *)(a2 + 78) = 1;
        *(_DWORD *)(a2 + 68) = 4;
      }
      return result;
    }
  }
  if ( a3 == *(_QWORD *)(a2 + 8) && *(_DWORD *)(a2 + 52) != 1 )
    *(_DWORD *)(a2 + 52) = a4;
  return result;
}


// Address: 0x2CE6C | Function: sub_2CE6C
__int64 __fastcall sub_2CE6C(__int64 result, __int64 a2, __int64 a3, __int64 a4, __int64 a5, char a6)
{
  __int64 v6; // x9
  __int64 v7; // x19
  __int64 v8; // x20
  unsigned int v9; // w22
  __int64 v10; // x23
  __int64 v11; // x21
  char v12; // w24
  int v13; // w0
  int v14; // w8
  __int64 v15; // x9
  __int64 v16; // x9
  int v17; // w8

  v6 = *(_QWORD *)(a2 + 16);
  if ( (a6 & 1) == 0 )
  {
    if ( *(_QWORD *)(result + 8) == *(_QWORD *)(v6 + 8) )
      goto LABEL_4;
    return (*(__int64 (__fastcall **)(_QWORD, __int64, __int64, __int64, __int64, _QWORD))(**(_QWORD **)(result + 16)
                                                                                         + 40LL))(
             *(_QWORD *)(result + 16),
             a2,
             a3,
             a4,
             a5,
             a6 & 1);
  }
  if ( result != v6 )
  {
    v7 = result;
    v8 = a2;
    v9 = a5;
    v10 = a3;
    v11 = a4;
    v12 = a6;
    v13 = strcmp(*(const char **)(result + 8), *(const char **)(v6 + 8));
    a6 = v12;
    a4 = v11;
    a3 = v10;
    a5 = v9;
    a2 = v8;
    v14 = v13;
    result = v7;
    if ( v14 != 0 )
      return (*(__int64 (__fastcall **)(_QWORD, __int64, __int64, __int64, __int64, _QWORD))(**(_QWORD **)(result + 16)
                                                                                           + 40LL))(
               *(_QWORD *)(result + 16),
               a2,
               a3,
               a4,
               a5,
               a6 & 1);
  }
LABEL_4:
  v15 = *(_QWORD *)(a2 + 8);
  *(_BYTE *)(a2 + 77) = 1;
  if ( a4 != v15 )
    return result;
  v16 = *(_QWORD *)(a2 + 32);
  *(_BYTE *)(a2 + 76) = 1;
  if ( v16 != 0 )
  {
    if ( v16 != a3 )
    {
      ++*(_DWORD *)(a2 + 60);
LABEL_16:
      *(_BYTE *)(a2 + 78) = 1;
      return result;
    }
    v17 = *(_DWORD *)(a2 + 48);
    if ( v17 == 2 )
    {
      v17 = a5;
      *(_DWORD *)(a2 + 48) = a5;
    }
    if ( v17 == 1 )
    {
LABEL_15:
      if ( *(_DWORD *)(a2 + 72) != 1 )
        return result;
      goto LABEL_16;
    }
  }
  else
  {
    *(_QWORD *)(a2 + 32) = a3;
    *(_DWORD *)(a2 + 48) = a5;
    *(_DWORD *)(a2 + 60) = 1;
    if ( (_DWORD)a5 == 1 )
      goto LABEL_15;
  }
  return result;
}


// Address: 0x2CFB0 | Function: sub_2CFB0
__int64 __fastcall sub_2CFB0(__int64 result, __int64 a2, __int64 a3, __int64 a4, int a5, char a6)
{
  __int64 v6; // x8
  __int64 v7; // x19
  int v8; // w21
  __int64 v9; // x22
  __int64 v10; // x20
  __int64 v11; // x9
  __int64 v12; // x9
  int v13; // w8

  v6 = *(_QWORD *)(a2 + 16);
  if ( (a6 & 1) != 0 )
  {
    if ( result != v6 )
    {
      v7 = a2;
      v8 = a5;
      v9 = a3;
      v10 = a4;
      result = strcmp(*(const char **)(result + 8), *(const char **)(v6 + 8));
      a4 = v10;
      a3 = v9;
      a5 = v8;
      a2 = v7;
      if ( (_DWORD)result != 0 )
        return result;
    }
  }
  else if ( *(_QWORD *)(result + 8) != *(_QWORD *)(v6 + 8) )
  {
    return result;
  }
  v11 = *(_QWORD *)(a2 + 8);
  *(_BYTE *)(a2 + 77) = 1;
  if ( a4 != v11 )
    return result;
  v12 = *(_QWORD *)(a2 + 32);
  *(_BYTE *)(a2 + 76) = 1;
  if ( v12 == 0 )
  {
    *(_QWORD *)(a2 + 32) = a3;
    *(_DWORD *)(a2 + 48) = a5;
    *(_DWORD *)(a2 + 60) = 1;
    if ( a5 != 1 )
      return result;
    goto LABEL_15;
  }
  if ( v12 != a3 )
  {
    ++*(_DWORD *)(a2 + 60);
    goto LABEL_16;
  }
  v13 = *(_DWORD *)(a2 + 48);
  if ( v13 == 2 )
  {
    v13 = a5;
    *(_DWORD *)(a2 + 48) = a5;
  }
  if ( v13 == 1 )
  {
LABEL_15:
    if ( *(_DWORD *)(a2 + 72) != 1 )
      return result;
LABEL_16:
    *(_BYTE *)(a2 + 78) = 1;
  }
  return result;
}


// Address: 0x2D0B4 | Function: sub_2D0B4
void sub_2D0B4()
{
  ;
}


// Address: 0x2D0BC | Function: sub_2D0BC
void sub_2D0BC()
{
  ;
}


// Address: 0x2D0C4 | Function: sub_2D0C4
_QWORD *__fastcall sub_2D0C4(_QWORD *result)
{
  *result = off_39630;
  return result;
}


// Address: 0x2D0DC | Function: sub_2D0DC
void sub_2D0DC()
{
  sub_2D0BC();
  sub_13E30();
}


// Address: 0x2D10C | Function: sub_2D10C
const char *sub_2D10C()
{
  return "std::bad_alloc";
}


// Address: 0x2D11C | Function: sub_2D11C
__int64 __fastcall sub_2D11C(__int64 a1)
{
  return *(_QWORD *)a1;
}


// Address: 0x2D128 | Function: sub_2D128
bool __fastcall sub_2D128(_QWORD *a1)
{
  return *a1 >> 8 == 0x434C4E47432B2BLL;
}


// Address: 0x2D14C | Function: sub_2D14C
char *__fastcall sub_2D14C(__int64 a1)
{
  __int64 v1; // x20
  char *v2; // x0
  char *v3; // x19

  v1 = a1 + 143;
  v2 = (char *)sub_2D390((a1 + 143) & 0xFFFFFFFFFFFFFFF0LL);
  v3 = v2;
  if ( v2 == nullptr )
    sub_13E4C();
  memset(v2, 0, v1 & 0xFFFFFFFFFFFFFFF0LL);
  return v3 + 128;
}


// Address: 0x2D19C | Function: sub_2D19C
unsigned __int64 *__fastcall sub_2D19C(unsigned __int64 *a1)
{
  unsigned __int64 v1; // x20
  __int64 v3; // x0
  unsigned __int64 *v4; // x8
  int v5; // w10
  unsigned __int64 *v6; // x9
  __int64 v7; // x8

  v1 = *a1;
  v3 = sub_14014();
  v4 = a1 - 12;
  if ( v1 >> 8 == 0x434C4E47432B2BLL )
  {
    v5 = *((_DWORD *)a1 - 10);
    v6 = *(unsigned __int64 **)v3;
    if ( v5 < 0 )
      v5 = -v5;
    *((_DWORD *)a1 - 10) = v5 + 1;
    if ( v4 != v6 )
    {
      *(a1 - 6) = (unsigned __int64)v6;
      *(_QWORD *)v3 = v4;
    }
    v7 = *(a1 - 1);
    --*(_DWORD *)(v3 + 8);
  }
  else
  {
    if ( *(_QWORD *)v3 != 0 )
      sub_13E4C();
    *(_QWORD *)v3 = v4;
    return a1 + 4;
  }
  return (unsigned __int64 *)v7;
}


// Address: 0x2D238 | Function: sub_2D238
__int64 __fastcall sub_2D238(__int64 a1, __int64 a2, __int64 a3)
{
  __int64 v6; // x22
  unsigned __int64 v7; // x0

  v6 = a1 - 128;
  *(_QWORD *)(a1 - 120) = 0;
  *(_QWORD *)(a1 - 96) = sub_13E38();
  v7 = sub_13E8C();
  *(_QWORD *)(a1 - 112) = a2;
  *(_QWORD *)(a1 - 104) = a3;
  *(_QWORD *)(a1 - 88) = v7;
  *(_QWORD *)(a1 - 32) = 0x434C4E47432B2B00LL;
  *(_QWORD *)(a1 - 24) = sub_2D2A8;
  return v6;
}


// Address: 0x2D2A8 | Function: sub_2D2A8
__int64 __fastcall sub_2D2A8(int a1, __int64 a2)
{
  __int64 result; // x0
  void (__fastcall *v4)(__int64); // x8

  if ( a1 != 1 )
    sub_13EA0(*(void (**)(void))(a2 - 56));
  result = sub_2E5D0(-1, a2 - 88);
  if ( result == 1 )
  {
    v4 = *(void (__fastcall **)(__int64))(a2 - 72);
    if ( v4 != nullptr )
      v4(a2 + 32);
    return sub_2D564(a2 - 96);
  }
  return result;
}


// Address: 0x2D310 | Function: sub_2D310
void __fastcall __noreturn sub_2D310(__int64 a1, __int64 a2, __int64 a3)
{
  __int64 v6; // x0
  __int64 v7; // x19

  v6 = sub_14014();
  ++*(_DWORD *)(v6 + 8);
  v7 = sub_2D238(a1, a2, a3);
  *(_QWORD *)(v7 + 8) = 1;
  sub_2E600(v7 + 96);
  sub_2D36C(v7);
}


// Address: 0x2D36C | Function: sub_2D36C
void __fastcall __noreturn sub_2D36C(__int64 a1)
{
  sub_2D19C((unsigned __int64 *)(a1 + 96));
  sub_13EA0(*(void (**)(void))(a1 + 40));
}


// Address: 0x2D390 | Function: sub_2D390
void *__fastcall sub_2D390(unsigned __int64 a1)
{
  size_t v1; // x19
  void *result; // x0
  void *memptr; // [xsp+18h] [xbp+18h] BYREF

  memptr = nullptr;
  if ( a1 <= 1 )
    v1 = 1;
  else
    v1 = a1;
  posix_memalign(&memptr, 0x10u, v1);
  result = memptr;
  if ( memptr == nullptr )
    return (void *)sub_2D3DC(v1);
  return result;
}


// Address: 0x2D3DC | Function: sub_2D3DC
int *__fastcall sub_2D3DC(__int64 a1)
{
  int *v2; // x14
  int *v3; // x10
  unsigned __int64 v4; // x12
  unsigned __int64 v5; // x13
  int *v6; // x19
  unsigned __int64 v7; // x15
  int *v8; // x9
  __int64 v9; // x14
  unsigned __int64 v10; // x14
  __int64 v11; // x10
  bool v12; // zf
  unsigned __int16 *v13; // x10
  __int64 v14; // x12

  pthread_mutex_lock(&stru_3DB48);
  v2 = (int *)qword_3DB70;
  if ( qword_3DB70 != 0 )
  {
    if ( (char *)qword_3DB70 == &byte_3DD80 )
    {
LABEL_13:
      v6 = nullptr;
      goto LABEL_19;
    }
  }
  else
  {
    v2 = &dword_3DB8C;
    qword_3DB70 = (__int64)&dword_3DB8C;
    dword_3DB8C = 8192128;
  }
  v3 = nullptr;
  v4 = (unsigned __int64)(a1 + 3) >> 2;
  v5 = v4 + 1;
  while ( 1 )
  {
    v6 = v2 + 1;
    if ( ((unsigned __int64)(v2 + 1) & 0xF) != 0 )
      sub_1405C("%s:%d: %s", "out/llvm-project/libcxxabi/src/fallback_malloc.cpp", 146, (const char *)&unk_9335);
    v7 = *((unsigned __int16 *)v2 + 1);
    v8 = v2;
    v9 = ((_BYTE)v7 - (_BYTE)v5) & 3;
    if ( v5 >= v7 )
      v9 = 0;
    v10 = v9 + v5;
    if ( v10 < v7 )
      break;
    if ( v4 < v7 )
    {
      v14 = *(unsigned __int16 *)v8;
      if ( v3 != nullptr )
      {
        *(_WORD *)v3 = v14;
        *(_WORD *)v8 = 0;
      }
      else
      {
        *(_WORD *)v8 = 0;
        qword_3DB70 = (__int64)&unk_3DB80 + 4 * v14;
      }
      goto LABEL_19;
    }
    v11 = *(unsigned __int16 *)v8;
    v2 = (int *)((char *)&unk_3DB80 + 4 * v11);
    v12 = v11 == 128;
    v3 = v8;
    if ( v12 )
      goto LABEL_13;
  }
  v13 = (unsigned __int16 *)&v8[(unsigned __int16)(v7 - v10)];
  *((_WORD *)v8 + 1) = v7 - v10;
  v6 = (int *)(v13 + 2);
  *v13 = 0;
  v13[1] = v10;
  if ( ((unsigned __int64)(v13 + 2) & 0xF) != 0 )
    sub_1405C("%s:%d: %s", "out/llvm-project/libcxxabi/src/fallback_malloc.cpp", 167, (const char *)&unk_9335);
LABEL_19:
  pthread_mutex_unlock(&stru_3DB48);
  return v6;
}


// Address: 0x2D564 | Function: sub_2D564
void __fastcall sub_2D564(char *a1)
{
  unsigned __int16 *v2; // x20
  int v3; // w9
  unsigned __int16 *v4; // x10
  unsigned __int16 *v5; // x11
  __int64 v6; // x13
  __int64 v7; // x14
  __int64 v8; // x10
  char *v9; // x13
  bool v10; // zf
  unsigned __int16 v11; // w9

  if ( a1 < byte_3DB80 || a1 >= &byte_3DD80 )
  {
    free(a1);
  }
  else
  {
    v2 = (unsigned __int16 *)(a1 - 4);
    pthread_mutex_lock(&stru_3DB48);
    v3 = qword_3DB70;
    if ( qword_3DB70 == 0 || (char *)qword_3DB70 == &byte_3DD80 )
    {
LABEL_12:
      qword_3DB70 = (__int64)v2;
      *v2 = (v3 - (unsigned int)byte_3DB80) >> 2;
    }
    else
    {
      v4 = nullptr;
      v5 = (unsigned __int16 *)qword_3DB70;
      while ( 1 )
      {
        v6 = v5[1];
        if ( &v5[2 * v6] == v2 )
        {
          v5[1] = *((_WORD *)a1 - 1) + v6;
          goto LABEL_17;
        }
        v7 = *((unsigned __int16 *)a1 - 1);
        if ( &v2[2 * v7] == v5 )
          break;
        v8 = *v5;
        v9 = &byte_3DB80[4 * v8];
        v10 = v8 == 128;
        v4 = v5;
        v5 = (unsigned __int16 *)v9;
        if ( v10 )
          goto LABEL_12;
      }
      *((_WORD *)a1 - 1) = v7 + v6;
      if ( v4 != nullptr )
      {
        *v4 = ((unsigned int)v2 - (unsigned int)byte_3DB80) >> 2;
      }
      else
      {
        v11 = *v5;
        qword_3DB70 = (__int64)v2;
        *v2 = v11;
      }
    }
LABEL_17:
    pthread_mutex_unlock(&stru_3DB48);
  }
}


// Address: 0x2D690 | Function: sub_2D690
__int64 sub_2D690()
{
  __int64 v0; // x29
  int v1; // w1
  __int64 v2; // x2
  unsigned __int64 *v3; // x3
  __int64 v4; // x4
  __int64 v5; // x30
  int v6; // w0
  bool v7; // zf
  __int64 result; // x0
  unsigned __int64 *v9; // x19
  __int64 v10; // x20
  char v11; // w21
  unsigned __int64 v12; // x22
  __int64 v13; // x21
  __int64 v14; // x22
  unsigned __int64 v15; // x22
  __int64 v16; // x26
  __int64 v17; // x0
  unsigned __int8 *v18; // x23
  __int64 v19; // x27
  __int64 v20; // x0
  __int64 v21; // x24
  __int64 v22; // x1
  unsigned __int8 *v23; // x8
  unsigned __int8 *v24; // x8
  unsigned int v25; // t1
  __int64 v26; // x11
  __int64 v27; // x10
  char v28; // t1
  unsigned __int64 v29; // x13
  char *v30; // x23
  __int64 v31; // x11
  unsigned int v32; // w10
  unsigned __int64 v33; // x24
  unsigned int v34; // w26
  char v35; // t1
  unsigned __int64 v36; // x9
  char *v37; // x9
  char *v38; // x22
  unsigned __int64 v39; // x27
  __int64 v40; // x28
  __int64 v41; // x0
  __int64 v42; // x10
  __int64 v43; // x8
  char v44; // t1
  unsigned __int64 v45; // x12
  unsigned __int64 v46; // x22
  int v47; // w28
  __int64 v48; // x24
  unsigned __int64 v49; // x9
  __int64 v50; // x8
  unsigned __int8 *v51; // x23
  unsigned int v52; // w10
  unsigned int v53; // t1
  unsigned __int64 v54; // x11
  bool v55; // cf
  __int64 v56; // x9
  __int64 v58; // x0
  __int64 v59; // x22
  __int64 v60; // x0
  unsigned __int64 *v61; // x8
  __int64 v62; // x1
  char v63; // w0
  int v64; // w8
  __int64 v65; // x0
  unsigned __int64 *v66; // x27
  __int64 v67; // x3
  char v68; // w0
  unsigned __int64 v69; // x10
  __int64 v70; // x9
  unsigned __int8 *v71; // x11
  unsigned int v72; // w12
  unsigned int v73; // t1
  unsigned __int64 v74; // x13
  __int64 v75; // x10
  __int64 v77; // x9
  unsigned __int64 v78; // [xsp+8h] [xbp-B8h]
  unsigned __int8 *v79; // [xsp+10h] [xbp-B0h]
  unsigned __int64 v80; // [xsp+20h] [xbp-A0h]
  __int64 v81; // [xsp+28h] [xbp-98h]
  __int64 v82; // [xsp+30h] [xbp-90h]
  __int64 v83; // [xsp+38h] [xbp-88h]
  __int64 v84; // [xsp+38h] [xbp-88h]
  unsigned __int8 *v85; // [xsp+40h] [xbp-80h]
  char *v86; // [xsp+48h] [xbp-78h] BYREF
  unsigned __int8 *v87; // [xsp+50h] [xbp-70h] BYREF
  unsigned __int64 *v88; // [xsp+58h] [xbp-68h] BYREF
  __int64 v89; // [xsp+60h] [xbp-60h]
  __int64 v90; // [xsp+68h] [xbp-58h]

  sub_13E14();
  v89 = v0;
  v90 = v5;
  v7 = v6 == 1;
  result = 3;
  if ( !v7 )
    return result;
  v9 = v3;
  if ( v3 == nullptr )
    return result;
  v10 = v4;
  if ( v4 == 0 )
    return result;
  v11 = v1;
  v12 = v2 & 0xFFFFFFFFFFFFFF00LL;
  if ( v1 == 6 && v12 == 0x434C4E47432B2B00LL )
  {
    v13 = *((int *)v3 - 9);
    v14 = *(v3 - 2);
    sub_2EB90(v4, 0, v3);
    sub_2EB90(v10, 1, v13);
    sub_2EBC8(v10, v14);
    if ( (v13 & 0x80000000) == 0 )
      return 7;
LABEL_8:
    *(v9 - 2) = 0;
    return 7;
  }
  if ( (v1 & 1) != 0 )
  {
    if ( (v1 & 0xE) != 0 )
      return result;
  }
  else
  {
    if ( (v1 & 2) == 0 )
      return result;
    if ( (~v1 & 0xC) == 0 )
    {
      v15 = 0;
LABEL_14:
      v16 = 0;
LABEL_15:
      sub_2EB90(v10, 0, v9);
      sub_2EB90(v10, 1, v16);
      sub_2EBC8(v10, v15);
      if ( (v16 & 0x8000000000000000LL) == 0 )
        return 7;
      goto LABEL_8;
    }
  }
  v17 = sub_2EB28(v4);
  if ( v17 == 0 )
    return 8;
  v18 = (unsigned __int8 *)v17;
  v19 = sub_2EB98(v10);
  v20 = sub_2EB5C(v10);
  v21 = v20;
  v23 = v18 + 1;
  v22 = *v18;
  v87 = v18 + 1;
  if ( (_DWORD)v22 != 255 )
  {
    v20 = sub_2DC60(&v87, v22, 0);
    v23 = v87;
  }
  v83 = v20;
  v25 = *v23;
  v24 = v23 + 1;
  v87 = v24;
  v79 = v18;
  v82 = v25;
  if ( v25 == 255 )
  {
    v85 = nullptr;
  }
  else
  {
    v26 = 0;
    v27 = 0;
    do
    {
      v28 = *v24++;
      v29 = (unsigned __int64)(v28 & 0x7F) << v26;
      v26 += 7;
      v27 |= v29;
    }
    while ( v28 < 0 );
    v85 = &v24[v27];
  }
  v30 = (char *)(v24 + 1);
  v31 = 0;
  v32 = 0;
  v87 = v24 + 1;
  v33 = v19 + ~v21;
  v34 = *v24;
  v80 = v12;
  do
  {
    v35 = *v30++;
    v36 = (unsigned __int64)(v35 & 0x7F) << v31;
    v31 += 7;
    v32 |= v36;
  }
  while ( v35 < 0 );
  v37 = v30;
  v86 = v30;
  v87 = (unsigned __int8 *)v30;
  v38 = &v30[v32];
  v81 = v32;
  while ( 1 )
  {
    if ( v37 >= v38 )
    {
LABEL_93:
      sub_2D19C(v9);
      if ( v80 == 0x434C4E47432B2B00LL )
        sub_13EA0((void (*)(void))*(v9 - 7));
      sub_13E4C();
    }
    v39 = sub_2DC60(&v86, v34, 0);
    v40 = sub_2DC60(&v86, v34, 0);
    v41 = sub_2DC60(&v86, v34, 0);
    v37 = v86;
    v42 = 0;
    v43 = 0;
    do
    {
      v44 = *v37++;
      v45 = (unsigned __int64)(v44 & 0x7F) << v42;
      v42 += 7;
      v43 |= v45;
    }
    while ( v44 < 0 );
    v86 = v37;
    if ( v39 <= v33 && v33 < v40 + v39 )
      break;
    if ( v33 < v39 )
      goto LABEL_93;
  }
  if ( v41 == 0 )
    return 8;
  v15 = v41 + v83;
  if ( v43 == 0 )
  {
    if ( (v11 & 1) == 0 )
      goto LABEL_14;
    return 8;
  }
  v78 = v41 + v83;
  v46 = v80;
  v47 = 0;
  v48 = (__int64)&v30[v81 - 1 + v43];
  v84 = v82 & 0xF;
  while ( 1 )
  {
    v49 = 0;
    v50 = 0;
    v51 = (unsigned __int8 *)v48;
    do
    {
      v53 = *v51++;
      v52 = v53;
      v54 = (unsigned __int64)(v53 & 0x7F) << v49;
      v49 += 7LL;
      v50 |= v54;
    }
    while ( (v53 & 0x80) != 0 );
    v55 = v49 >= 0x40;
    v56 = -1LL << v49;
    if ( v55 || v52 <= 0x3F )
      v56 = 0;
    v16 = v50 | v56;
    if ( (v50 | v56) >= 1 )
      break;
    v64 = (v16 == 0) | v47;
    if ( (v11 & 8) == 0 && v16 != 0 )
    {
      v65 = sub_2D11C((__int64)v9);
      if ( v46 != 0x434C4E47432B2B00LL )
      {
        if ( v65 == 0x434C4E47432B2B01LL )
          goto LABEL_84;
        goto LABEL_91;
      }
      v66 = v9 + 4;
      if ( v65 == 0x434C4E47432B2B01LL )
        v66 = (unsigned __int64 *)*(v9 - 11);
      if ( v66 == nullptr )
        goto LABEL_97;
      v67 = *(v9 - 10);
      if ( v67 == 0 )
        goto LABEL_97;
      v68 = sub_2DE08(v16, v85, v82, v67, v66, v9, 0);
      v64 = v47;
      if ( (v68 & 1) != 0 )
        goto LABEL_85;
    }
LABEL_65:
    v69 = 0;
    v70 = 0;
    v71 = v51;
    do
    {
      v73 = *v71++;
      v72 = v73;
      v74 = (unsigned __int64)(v73 & 0x7F) << v69;
      v69 += 7LL;
      v70 |= v74;
    }
    while ( (v73 & 0x80) != 0 );
    v55 = v69 >= 0x40;
    v75 = -1LL << v69;
    if ( v55 || v72 <= 0x3F )
      v75 = 0;
    v77 = v70 | v75;
    if ( v77 == 0 )
    {
      if ( ((unsigned __int8)v64 & ((v11 & 2) != 0)) == 0 )
        return 8;
      v46 = v80;
      v48 = 0;
      v16 = 0;
      v66 = nullptr;
      if ( (v11 & 1) == 0 )
        goto LABEL_86;
      goto LABEL_78;
    }
    v48 = (__int64)&v51[v77];
    v47 = v64;
  }
  if ( v85 == nullptr || (unsigned int)v84 > 0xC || ((0x1C1Du >> (v82 & 0xF)) & 1) == 0 )
  {
    sub_2DC30(v46 == 0x434C4E47432B2B00LL, v9);
LABEL_97:
    sub_2D19C(v9);
    sub_13EA0((void (*)(void))*(v9 - 7));
  }
  v88 = (unsigned __int64 *)&v85[qword_B7D8[v84] * v16];
  v58 = sub_2DC60(&v88, v82, 0);
  if ( v58 != 0 )
  {
    if ( v46 == 0x434C4E47432B2B00LL )
    {
      v59 = v58;
      v60 = sub_2D11C((__int64)v9);
      v61 = v9 + 4;
      if ( v60 == 0x434C4E47432B2B01LL )
        v61 = (unsigned __int64 *)*(v9 - 11);
      v88 = v61;
      if ( v61 == nullptr )
        goto LABEL_97;
      v62 = *(v9 - 10);
      if ( v62 == 0 )
        goto LABEL_97;
      v63 = (*(__int64 (__fastcall **)(__int64, __int64, unsigned __int64 **))(*(_QWORD *)v59 + 32LL))(v59, v62, &v88);
      v46 = v80;
      if ( (v63 & 1) != 0 )
      {
        v66 = v88;
        if ( (v11 & 1) != 0 )
          goto LABEL_78;
LABEL_86:
        v15 = v78;
        goto LABEL_15;
      }
    }
    v64 = v47;
    goto LABEL_65;
  }
  if ( sub_2D11C((__int64)v9) != 0x434C4E47432B2B01LL )
  {
LABEL_91:
    v66 = v9 + 4;
    if ( (v11 & 1) != 0 )
      goto LABEL_78;
    goto LABEL_86;
  }
LABEL_84:
  v66 = (unsigned __int64 *)*(v9 - 11);
LABEL_85:
  if ( (v11 & 1) == 0 )
    goto LABEL_86;
LABEL_78:
  if ( v46 == 0x434C4E47432B2B00LL )
  {
    *((_DWORD *)v9 - 9) = v16;
    *(v9 - 4) = v48;
    *(v9 - 3) = (unsigned __int64)v79;
    *(v9 - 2) = v78;
    *(v9 - 1) = (unsigned __int64)v66;
  }
  return 6;
}


// Address: 0x2DC30 | Function: sub_2DC30
void __fastcall __noreturn sub_2DC30(char a1, unsigned __int64 *a2)
{
  sub_2D19C(a2);
  if ( (a1 & 1) != 0 )
    sub_13EA0((void (*)(void))*(a2 - 7));
  sub_13E4C();
}


// Address: 0x2DC60 | Function: sub_2DC60
unsigned __int64 __fastcall sub_2DC60(unsigned __int16 **a1, unsigned __int8 a2, __int64 a3)
{
  unsigned int v3; // w8
  unsigned __int16 *v4; // x9
  unsigned __int64 v5; // x8
  __int64 v6; // x12
  unsigned __int16 *v7; // x11
  char v8; // t1
  unsigned __int64 v9; // x14
  int v10; // w10
  unsigned __int64 v11; // x12
  __int64 v12; // x8
  unsigned int v13; // w13
  unsigned int v14; // t1
  unsigned __int64 v15; // x14
  bool v16; // cf
  __int64 v17; // x12

  if ( a2 != 255 )
  {
    v3 = a2 & 0xF;
    v4 = *a1;
    if ( v3 <= 3 )
    {
      if ( (a2 & 0xFu) > 1 )
      {
        if ( v3 == 2 )
        {
          v7 = v4 + 1;
          v5 = *v4;
          v10 = (a2 >> 4) & 7;
          if ( v10 == 0 )
            goto LABEL_41;
        }
        else
        {
          if ( v3 != 3 )
            goto LABEL_49;
          v7 = v4 + 2;
          v5 = *(unsigned int *)v4;
          v10 = (a2 >> 4) & 7;
          if ( v10 == 0 )
            goto LABEL_41;
        }
        goto LABEL_35;
      }
      if ( (a2 & 0xF) == 0 )
        goto LABEL_29;
      v6 = 0;
      v5 = 0;
      v7 = *a1;
      do
      {
        v8 = *(_BYTE *)v7;
        v7 = (unsigned __int16 *)((char *)v7 + 1);
        v9 = (unsigned __int64)(v8 & 0x7F) << v6;
        v6 += 7;
        v5 |= v9;
      }
      while ( v8 < 0 );
    }
    else
    {
      if ( (a2 & 0xFu) <= 9 )
      {
        if ( v3 == 4 )
          goto LABEL_29;
        if ( v3 != 9 )
          goto LABEL_49;
        v11 = 0;
        v12 = 0;
        v7 = *a1;
        do
        {
          v14 = *(unsigned __int8 *)v7;
          v7 = (unsigned __int16 *)((char *)v7 + 1);
          v13 = v14;
          v15 = (unsigned __int64)(v14 & 0x7F) << v11;
          v11 += 7LL;
          v12 |= v15;
        }
        while ( (v14 & 0x80) != 0 );
        v16 = v11 >= 0x40;
        v17 = -1LL << v11;
        if ( v16 || v13 <= 0x3F )
          v17 = 0;
        v5 = v12 | v17;
        v10 = (a2 >> 4) & 7;
        if ( v10 == 0 )
          goto LABEL_41;
        goto LABEL_35;
      }
      if ( v3 != 10 )
      {
        if ( v3 != 11 )
        {
          if ( v3 != 12 )
LABEL_49:
            abort();
LABEL_29:
          v7 = v4 + 4;
          v5 = *(_QWORD *)v4;
          v10 = (a2 >> 4) & 7;
          if ( v10 == 0 )
            goto LABEL_41;
          goto LABEL_35;
        }
        v7 = v4 + 2;
        v5 = *(int *)v4;
        v10 = (a2 >> 4) & 7;
        if ( v10 != 0 )
        {
LABEL_35:
          if ( v10 == 3 )
          {
            if ( v5 == 0 )
            {
LABEL_44:
              *a1 = v7;
              return v5;
            }
            v5 += a3;
          }
          else
          {
            if ( v10 != 1 )
              abort();
            if ( v5 == 0 )
              goto LABEL_44;
            v5 += (unsigned __int64)v4;
          }
        }
LABEL_41:
        if ( v5 != 0 && (a2 & 0x80) != 0 )
          v5 = *(_QWORD *)v5;
        goto LABEL_44;
      }
      v7 = v4 + 1;
      v5 = (__int16)*v4;
    }
    v10 = (a2 >> 4) & 7;
    if ( v10 == 0 )
      goto LABEL_41;
    goto LABEL_35;
  }
  return 0;
}


// Address: 0x2DE08 | Function: sub_2DE08
bool __fastcall sub_2DE08(
        __int64 a1,
        __int64 a2,
        unsigned __int8 a3,
        __int64 a4,
        unsigned __int16 *a5,
        unsigned __int64 *a6,
        __int64 a7)
{
  __int64 v8; // x25
  __int64 v13; // x8
  __int64 v14; // x9
  char *v15; // x27
  char v16; // t1
  unsigned __int64 v17; // x11
  unsigned __int64 v18; // x19
  unsigned __int64 v19; // x0
  char v20; // w0
  unsigned __int16 *v23; // [xsp+8h] [xbp-8h] BYREF

  if ( a2 == 0 )
  {
    sub_2D19C(a6);
    sub_13E4C();
  }
  v8 = a3 & 0xF;
  v13 = 0;
  v14 = 0;
  v15 = (char *)(a2 + ~a1);
  do
  {
    do
    {
      v16 = *v15++;
      v17 = (unsigned __int64)(v16 & 0x7F) << v13;
      v13 += 7;
      v18 = v17 | v14;
      v14 |= v17;
    }
    while ( v16 < 0 );
    if ( v18 == 0 )
      break;
    if ( (unsigned int)v8 > 0xC || ((0x1C1Du >> v8) & 1) == 0 )
      sub_2DC30(1, a6);
    v23 = (unsigned __int16 *)(a2 + qword_B7D8[v8] * v18);
    v19 = sub_2DC60(&v23, a3, a7);
    v23 = a5;
    v20 = (*(__int64 (__fastcall **)(unsigned __int64, __int64, unsigned __int16 **))(*(_QWORD *)v19 + 32LL))(
            v19,
            a4,
            &v23);
    v13 = 0;
    v14 = 0;
  }
  while ( (v20 & 1) == 0 );
  return v18 == 0;
}


// Address: 0x2DF1C | Function: sub_2DF1C
__int64 __fastcall sub_2DF1C(size_t *a1)
{
  unsigned __int64 v2; // x22
  _QWORD *v3; // x0
  unsigned __int64 v4; // x21
  _QWORD *v5; // x20
  unsigned __int64 v6; // x24
  _QWORD *v7; // x0
  _QWORD *v8; // x0
  pthread_key_t v9; // w0
  unsigned __int64 v10; // x21
  _QWORD *v11; // x22
  __int64 result; // x0
  __int64 v13; // x23
  size_t v14; // x20
  __int64 v15; // x24
  void *v16; // x0
  const void *v17; // x1
  __int64 v18; // x19

  v2 = atomic_load(a1 + 2);
  if ( v2 == 0 )
  {
    pthread_once(dword_3DD88, (void (*)(void))sub_2E144);
    pthread_mutex_lock(&stru_3DD98);
    v2 = a1[2];
    if ( v2 == 0 )
    {
      v2 = ++qword_3DD90;
      atomic_store(qword_3DD90, a1 + 2);
    }
    pthread_mutex_unlock(&stru_3DD98);
    v3 = pthread_getspecific(dword_3DD84);
    if ( v3 != nullptr )
      goto LABEL_3;
LABEL_9:
    v6 = ((v2 + 17) & 0xFFFFFFFFFFFFFFF0LL) - 2;
    v8 = malloc(8 * v6 + 16);
    if ( v8 == nullptr )
      abort();
    v5 = v8;
    memset(v8 + 2, 0, 8 * v6);
    *v5 = 1;
    goto LABEL_11;
  }
  v3 = pthread_getspecific(dword_3DD84);
  if ( v3 == nullptr )
    goto LABEL_9;
LABEL_3:
  v4 = v3[1];
  v5 = v3;
  if ( v2 > v4 )
  {
    v6 = ((v2 + 17) & 0xFFFFFFFFFFFFFFF0LL) - 2;
    v7 = realloc(v3, 8 * v6 + 16);
    if ( v7 == nullptr )
      abort();
    v5 = v7;
    memset(&v7[v4 + 2], 0, 8 * (v6 - v4));
LABEL_11:
    v9 = dword_3DD84;
    v5[1] = v6;
    pthread_setspecific(v9, v5);
  }
  v10 = v2 - 1;
  v11 = v5 + 2;
  result = v5[v10 + 2];
  if ( result == 0 )
  {
    if ( a1[1] <= 8 )
      v13 = 8;
    else
      v13 = a1[1];
    if ( (v13 & (v13 - 1)) != 0 )
      abort();
    v14 = *a1;
    v16 = malloc(v13 + 7 + *a1);
    if ( v16 == nullptr )
      abort();
    v15 = v13 + 7;
    *(_QWORD *)((((unsigned __int64)v16 + v13 + 7) & -v13) - 8) = v16;
    v17 = (const void *)a1[3];
    v18 = ((unsigned __int64)v16 + v13 + 7) & -v13;
    if ( v17 != nullptr )
      memcpy((void *)(((unsigned __int64)v16 + v15) & -v13), v17, v14);
    else
      memset((void *)(((unsigned __int64)v16 + v15) & -v13), 0, v14);
    v11[v10] = v18;
    return v18;
  }
  return result;
}


// Address: 0x2E108 | Function: sub_2E108
__int64 sub_2E108()
{
  __int64 result; // x0

  if ( byte_3DD80 == 1 )
  {
    result = pthread_key_delete(dword_3DD84);
    byte_3DD80 = 0;
  }
  return result;
}


// Address: 0x2E144 | Function: sub_2E144
__int64 sub_2E144()
{
  __int64 result; // x0

  result = pthread_key_create((pthread_key_t *)&dword_3DD84, (void (*)(void *))sub_2E180);
  if ( (_DWORD)result != 0 )
    abort();
  byte_3DD80 = 1;
  return result;
}


// Address: 0x2E180 | Function: sub_2E180
void __fastcall sub_2E180(_QWORD *pointer)
{
  unsigned __int64 v2; // x8
  unsigned __int64 i; // x20
  __int64 v4; // x9

  if ( *pointer != 0 )
  {
    --*pointer;
    pthread_setspecific(dword_3DD84, pointer);
  }
  else
  {
    v2 = pointer[1];
    if ( v2 != 0 )
    {
      for ( i = 0; i < v2; ++i )
      {
        v4 = pointer[i + 2];
        if ( v4 != 0 )
        {
          free(*(void **)(v4 - 8));
          v2 = pointer[1];
        }
      }
    }
    free(pointer);
  }
}


// Address: 0x2E208 | Function: sub_2E208
__int64 sub_2E208()
{
  __int64 result; // x0
  char s1[92]; // [xsp+4h] [xbp-6Ch] BYREF

  result = getauxval(0x10u);
  if ( (result & 0x100) != 0 )
  {
    result = __system_property_get("ro.arch", s1);
    if ( (int)result < 1 )
    {
      byte_3DDC0 = 1;
    }
    else
    {
      result = strncmp(s1, "exynos9810", 0xAu);
      byte_3DDC0 = (_DWORD)result != 0;
    }
  }
  else
  {
    byte_3DDC0 = 0;
  }
  return result;
}


// Address: 0x2E2A0 | Function: sub_2E2A0
unsigned __int64 __fastcall sub_2E2A0(unsigned __int64 result, __int64 a2)
{
  unsigned __int64 v2; // x8
  uint64x2_t v3; // q1
  uint64x2_t v4; // q0
  int8x16_t v5; // q2
  int8x16_t v6; // q5
  uint64x2_t v7; // q6
  int8x16_t v8; // q2
  int8x16_t v9; // q1
  int8x16_t v10; // q5
  int8x16_t v11; // q7
  uint64x2_t v12; // q3
  uint64x2_t v13; // q6
  unsigned __int64 v14; // x10
  int8x16_t v15; // q1
  unsigned __int64 v16; // x9
  int8x8_t v17; // d2
  __int64 v18; // x13
  unsigned __int64 v19; // x12
  unsigned __int64 StatusReg; // x13
  unsigned __int64 v21; // x15
  unsigned __int64 v22; // x13
  __int64 v23; // x9

  if ( (result & 0x4000000000000000LL) != 0 )
    v2 = *(_QWORD *)(a2 + 16);
  else
    v2 = 0;
  v3 = vdupq_n_s64(result);
  v4 = vshlq_u64(v3, (uint64x2_t)xmmword_B8B0);
  v5 = vshlq_u64(v3, (uint64x2_t)xmmword_B870);
  v6 = vandq_s8(v5, (int8x16_t)xmmword_B900);
  v7 = vdupq_n_s64(v2);
  v8 = vandq_s8(vzip1q_s64(v5, v4), (int8x16_t)xmmword_B920);
  v9 = vorrq_s8(
         vorrq_s8(
           vandq_s8(vshlq_u64(v3, (uint64x2_t)xmmword_B890), (int8x16_t)xmmword_B8F0),
           vandq_s8(vshlq_u64(v3, (uint64x2_t)xmmword_B8A0), (int8x16_t)xmmword_B910)),
         vorrq_s8(v6, vandq_s8(v4, (int8x16_t)xmmword_B8C0)));
  v10 = vshlq_u64(v7, (uint64x2_t)xmmword_B8E0);
  v11 = vshlq_u64(v7, (uint64x2_t)xmmword_B8D0);
  v12 = vshlq_u64(v7, (uint64x2_t)xmmword_B840);
  v13 = vshlq_u64(v7, (uint64x2_t)xmmword_B860);
  v14 = vorr_s8((int8x8_t)v9.n128_u64[0], (int8x8_t)vextq_s8(v9, v9, 8u).n128_u64[0]).n64_u64[0];
  v15 = vorrq_s8(
          vorrq_s8(vandq_s8(v11, (int8x16_t)xmmword_B940), vandq_s8(v13, (int8x16_t)xmmword_B930)),
          vorrq_s8(vandq_s8(v10, (int8x16_t)xmmword_B880), vandq_s8(v12, (int8x16_t)xmmword_B850)));
  v16 = v14
      | (8 * (_WORD)result) & 0x400
      | vorrq_s8(v8, vdupq_laneq_s64(v8, 1)).n128_u64[0]
      | (result >> 7) & 0x20000
      | (result >> 6) & 0x40
      | (v2 >> 5) & 4;
  v17.n64_u64[0] = vextq_s8(v15, v15, 8u).n128_u64[0];
  if ( (result & 0x10000000) != 0 )
    v16 |= 0x3000000000000uLL;
  v18 = v16 | 0x180000000000LL;
  if ( (v2 & 0x40000) == 0 )
    v18 = v16;
  v19 = vorr_s8((int8x8_t)v15.n128_u64[0], v17).n64_u64[0]
      | v13.n128_u64[1] & 0x200000000000LL
      | (result >> 1) & 0x80
      | (((v2 >> 2) & 0x1F) << 37)
      | v12.n128_u64[0] & 0x80000
      | ((v2 & 0x10000) != 0)
      | (v2 >> 4) & 0x10000000
      | ((unsigned __int64)((v2 & 0x2000) != 0) << 26)
      | (v2 >> 1) & 0x100000000LL
      | ((unsigned __int64)((v2 & 0x1000000) != 0) << 56)
      | (v2 << 16) & 0x800000000000000LL
      | ((unsigned __int64)((v2 & 0x2000000) != 0) << 55)
      | v18;
  if ( (result & 0x800) != 0 )
  {
    StatusReg = _ReadStatusReg(ID_AA64ISAR1_EL1);
    v21 = StatusReg >> 60;
    if ( (StatusReg & 0xF0000000000LL) != 0 )
      v19 |= 0x800000000000uLL;
    v22 = StatusReg >> 61;
    if ( v21 != 0 )
      v19 |= 0x8000000000000uLL;
    if ( v22 != 0 )
      v19 |= 0x10000000000000uLL;
    if ( v21 > 2 )
      v19 |= 0x20000000000000uLL;
  }
  v23 = v19 | 0x300;
  if ( (result & 1) == 0 )
    v23 = v19;
  qword_3DDC8 = v4.n128_u32[0] & 0x400000LL
              | ((unsigned __int64)((result & 0x10000) != 0) << 18)
              | (result >> 3) & 0x800000
              | ((unsigned __int64)((result & 0x400000) != 0) << 30)
              | (result >> 4) & 0x2000
              | ((unsigned __int64)((v2 & 0x400000000000LL) != 0) << 58)
              | ((_DWORD)v2 << 13) & 0x8000000
              | (unsigned __int64)(v12.n128_u32[0] & 0x80000000)
              | (v2 << 35) & 0x1000000000LL
              | v23
              | 0x8000000000000000LL;
  return result;
}


// Address: 0x2E53C | Function: sub_2E53C
void sub_2E53C()
{
  __int64 v0; // x30
  unsigned __int64 v1; // x19
  _QWORD v2[14]; // [xsp+0h] [xbp-70h] BYREF

  if ( qword_3DDC8 == 0 )
  {
    v2[12] = v0;
    if ( (int)__system_property_get("ro.arch", v2) <= 0 || strncmp((const char *)v2, "exynos9810", 0xAu) != 0 )
    {
      v1 = getauxval(0x10u);
      v2[2] = getauxval(0x1Au);
      v2[0] = 24;
      v2[1] = v1;
      sub_2E2A0(v1 | 0x4000000000000000LL, (__int64)v2);
    }
  }
}


// Address: 0x2E5D0 | Function: sub_2E5D0
unsigned __int64 __fastcall sub_2E5D0(unsigned __int64 a1, atomic_ullong *a2)
{
  unsigned __int64 result; // x0

  if ( byte_3DDC0 != 0 )
    return atomic_fetch_add(a2, a1);
  do
    result = __ldaxr((unsigned __int64 *)a2);
  while ( __stlxr(result + a1, (unsigned __int64 *)a2) != 0 );
  return result;
}


// Address: 0x2E600 | Function: sub_2E600
__int64 __fastcall sub_2E600(_QWORD *a1)
{
  int v2; // w0
  int v4; // w0
  _BYTE v5[624]; // [xsp+0h] [xbp-4D0h] BYREF
  _BYTE v6[528]; // [xsp+270h] [xbp-260h] BYREF
  __int64 v7; // [xsp+480h] [xbp-50h] BYREF
  _BYTE v8[24]; // [xsp+488h] [xbp-48h] BYREF
  __int64 (__fastcall *v9)(__int64, __int64, _QWORD, _QWORD *, _BYTE *); // [xsp+4A0h] [xbp-30h]

  sub_325AC(v6);
  a1[2] = 0;
  a1[3] = 0;
  sub_2EBF8(v5, v6);
  v2 = sub_2EE08(v5);
  if ( v2 == 0 )
    return 5;
  while ( (v2 & 0x80000000) == 0 && (unsigned int)sub_2EE30(v5, v8) == 0 )
  {
    if ( v9 != nullptr )
    {
      v4 = v9(1, 1, *a1, a1, v5);
      if ( v4 != 8 )
      {
        if ( v4 == 6 )
        {
          sub_2ECA0(v5, 4294967294LL, &v7);
          a1[3] = v7;
          return sub_2E6F8(v6, v5, a1);
        }
        return 3;
      }
    }
    v2 = sub_2EE08(v5);
    if ( v2 == 0 )
      return 5;
  }
  return 3;
}


// Address: 0x2E6F8 | Function: sub_2E6F8
__int64 __fastcall sub_2E6F8(__int64 a1, __int64 a2, _QWORD *a3)
{
  int v9; // w0
  int i; // w22
  __int64 v11; // x1
  int v12; // w0
  __int64 v14; // kr00_8
  _BYTE v15[24]; // [xsp+8h] [xbp-48h] BYREF
  __int64 (__fastcall *v16)(__int64, __int64, _QWORD, _QWORD *, __int64); // [xsp+20h] [xbp-30h]
  __int64 v17; // [xsp+68h] [xbp+18h] BYREF

  sub_2EBF8(a2, a1);
  __asm { HINT            #0x28 ; '(' }
  v9 = sub_2EE1C(a2);
  if ( v9 == 0 )
    return 5;
  for ( i = 2; (v9 & 0x80000000) == 0; ++i )
  {
    sub_2ECA0(a2, 4294967294LL, &v17);
    if ( (unsigned int)sub_2EE30(a2, v15) != 0 )
      break;
    if ( v16 != nullptr )
    {
      if ( v17 == a3[3] )
        v11 = 6;
      else
        v11 = 2;
      v12 = v16(1, v11, *a3, a3, a2);
      if ( v12 != 8 )
      {
        if ( v12 == 7 )
        {
          sub_2EBE8(a2);
          v14 = sub_2EBD8();
          __asm { BR              X8 }
        }
        return 2;
      }
      if ( v17 == a3[3] )
      {
        fprintf(
          (FILE *)((char *)&_sF + 304),
          "libunwind: %s - %s\n",
          "unwind_phase2",
          "during phase1 personality function said it would stop here, but now in phase2 it did not stop here");
        fflush((FILE *)((char *)&_sF + 304));
        abort();
      }
    }
    v9 = sub_2EE1C(a2);
    if ( v9 == 0 )
      return 5;
  }
  return 2;
}


// Address: 0x2E950 | Function: sub_2E950
void __fastcall __noreturn sub_2E950(_QWORD *a1)
{
  __int64 v2; // x3
  _BYTE v3[624]; // [xsp+0h] [xbp-480h] BYREF
  _BYTE v4[528]; // [xsp+270h] [xbp-210h] BYREF

  sub_325AC(v4);
  v2 = a1[2];
  if ( v2 != 0 )
    sub_2E9D4(v4, v3, a1, v2, a1[3]);
  else
    sub_2E6F8((__int64)v4, (__int64)v3, a1);
  fprintf((FILE *)((char *)&_sF + 304), "libunwind: %s - %s\n", "_Unwind_Resume", "_Unwind_Resume() can't return");
  fflush((FILE *)((char *)&_sF + 304));
  abort();
}


// Address: 0x2E9D4 | Function: sub_2E9D4
__int64 __fastcall sub_2E9D4(
        __int64 a1,
        __int64 a2,
        _QWORD *a3,
        __int64 (__fastcall *a4)(__int64, __int64, _QWORD, _QWORD *, __int64, __int64),
        __int64 a5)
{
  int v9; // w24
  int i; // w25
  __int64 v11; // kr00_8
  __int64 result; // x0
  _BYTE v17[24]; // [xsp+8h] [xbp-48h] BYREF
  __int64 (__fastcall *v18)(__int64, __int64, _QWORD, _QWORD *, __int64); // [xsp+20h] [xbp-30h]

  sub_2EBF8(a2, a1);
  if ( (int)sub_2EE1C(a2) < 1 )
    return a4(1, 26, *a3, a3, a2, a5);
  v9 = 1;
  for ( i = -2; ; --i )
  {
    result = sub_2EE30(a2, v17);
    if ( (_DWORD)result != 0 )
      break;
    result = a4(1, 10, *a3, a3, a2, a5);
    if ( (_DWORD)result != 0 )
      break;
    ++v9;
    if ( v18 != nullptr )
    {
      result = v18(1, 10, *a3, a3, a2);
      if ( (_DWORD)result != 8 )
      {
        if ( (_DWORD)result == 7 )
        {
          __asm { HINT            #0x28 ; '(' }
          sub_2EBE8(a2);
          v11 = sub_2EBD8();
          __asm { BR              X8 }
        }
        return result;
      }
    }
    if ( (int)sub_2EE1C(a2) <= 0 )
      return a4(1, 26, *a3, a3, a2, a5);
  }
  return result;
}


// Address: 0x2EB28 | Function: sub_2EB28
__int64 __fastcall sub_2EB28(__int64 a1)
{
  _BYTE v2[16]; // [xsp+8h] [xbp-48h] BYREF
  __int64 v3; // [xsp+18h] [xbp-38h]

  if ( (unsigned int)sub_2EE30(a1, v2) != 0 )
    return 0;
  else
    return v3;
}


// Address: 0x2EB5C | Function: sub_2EB5C
__int64 __fastcall sub_2EB5C(__int64 a1)
{
  _QWORD v2[9]; // [xsp+8h] [xbp-48h] BYREF

  if ( (unsigned int)sub_2EE30(a1, v2) != 0 )
    return 0;
  else
    return v2[0];
}


// Address: 0x2EB90 | Function: sub_2EB90
__int64 sub_2EB90()
{
  return sub_2ED1C();
}


// Address: 0x2EB98 | Function: sub_2EB98
__int64 __fastcall sub_2EB98(__int64 a1)
{
  __int64 v2; // [xsp+8h] [xbp-8h] BYREF

  sub_2ECA0(a1, 0xFFFFFFFFLL, &v2);
  return v2;
}


// Address: 0x2EBC8 | Function: sub_2EBC8
__int64 __fastcall sub_2EBC8(__int64 a1, __int64 a2)
{
  return sub_2ED1C(a1, 0xFFFFFFFFLL, a2);
}


// Address: 0x2EBD8 | Function: sub_2EBD8
__int64 (__fastcall *sub_2EBD8())()
{
  return sub_3250C;
}


// Address: 0x2EBE8 | Function: sub_2EBE8
__int64 __fastcall sub_2EBE8(__int64 a1)
{
  return (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
}


// Address: 0x2EBF8 | Function: sub_2EBF8
__int64 __fastcall sub_2EBF8(__int64 a1, _OWORD *a2)
{
  __int128 v4; // q0
  __int128 v5; // q2
  __int128 v6; // q3
  __int128 v7; // q0
  __int128 v8; // q2
  __int128 v9; // q3
  __int128 v10; // q0
  __int128 v11; // q2
  __int128 v12; // q3
  __int128 v13; // q0
  __int128 v14; // q3
  __int128 v15; // q4

  *(_QWORD *)a1 = off_39680;
  *(_QWORD *)(a1 + 8) = &unk_3DDD0;
  memcpy((void *)(a1 + 16), a2, 0x110u);
  v4 = a2[20];
  v6 = a2[17];
  v5 = a2[18];
  *(_OWORD *)(a1 + 320) = a2[19];
  *(_OWORD *)(a1 + 336) = v4;
  *(_OWORD *)(a1 + 288) = v6;
  *(_OWORD *)(a1 + 304) = v5;
  v7 = a2[24];
  v9 = a2[21];
  v8 = a2[22];
  *(_OWORD *)(a1 + 384) = a2[23];
  *(_OWORD *)(a1 + 400) = v7;
  *(_OWORD *)(a1 + 352) = v9;
  *(_OWORD *)(a1 + 368) = v8;
  v10 = a2[28];
  v12 = a2[25];
  v11 = a2[26];
  *(_OWORD *)(a1 + 448) = a2[27];
  *(_OWORD *)(a1 + 464) = v10;
  *(_OWORD *)(a1 + 416) = v12;
  *(_OWORD *)(a1 + 432) = v11;
  v13 = a2[32];
  v15 = a2[29];
  v14 = a2[30];
  *(_OWORD *)(a1 + 512) = a2[31];
  *(_OWORD *)(a1 + 528) = v13;
  *(_OWORD *)(a1 + 480) = v15;
  *(_OWORD *)(a1 + 496) = v14;
  *(_OWORD *)(a1 + 603) = 0u;
  *(_OWORD *)(a1 + 544) = 0u;
  *(_OWORD *)(a1 + 560) = 0u;
  *(_OWORD *)(a1 + 576) = 0u;
  *(_OWORD *)(a1 + 592) = 0u;
  sub_2F6A8(a1, 0);
  return 0;
}


// Address: 0x2ECA0 | Function: sub_2ECA0
__int64 __fastcall sub_2ECA0(__int64 a1, unsigned int a2, __int64 *a3)
{
  __int64 v6; // x8

  if ( ((*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 16LL))(a1) & 1) == 0 )
    return 4294960754LL;
  v6 = (*(__int64 (__fastcall **)(__int64, _QWORD))(*(_QWORD *)a1 + 24LL))(a1, a2);
  *a3 = v6;
  return 0;
}


// Address: 0x2ED1C | Function: sub_2ED1C
__int64 __fastcall sub_2ED1C(__int64 a1, unsigned int a2, __int64 a3)
{
  __int64 v6; // x0
  _BYTE v8[32]; // [xsp+8h] [xbp-48h] BYREF
  __int64 v9; // [xsp+28h] [xbp-28h]

  if ( ((*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 16LL))(a1) & 1) == 0 )
    return 4294960754LL;
  (*(void (__fastcall **)(__int64, _QWORD, __int64))(*(_QWORD *)a1 + 32LL))(a1, a2, a3);
  if ( a2 == -1 )
  {
    (*(void (__fastcall **)(__int64, _BYTE *))(*(_QWORD *)a1 + 72LL))(a1, v8);
    (*(void (__fastcall **)(__int64, _QWORD))(*(_QWORD *)a1 + 104LL))(a1, 0);
    if ( v9 != 0 )
    {
      v6 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 24LL))(a1, 4294967294LL);
      (*(void (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 32LL))(a1, 4294967294LL, v9 + v6);
    }
  }
  return 0;
}


// Address: 0x2EE08 | Function: sub_2EE08
__int64 __fastcall sub_2EE08(__int64 a1)
{
  return (*(__int64 (__fastcall **)(__int64, _QWORD))(*(_QWORD *)a1 + 64LL))(a1, 0);
}


// Address: 0x2EE1C | Function: sub_2EE1C
__int64 __fastcall sub_2EE1C(__int64 a1)
{
  return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 64LL))(a1, 1);
}


// Address: 0x2EE30 | Function: sub_2EE30
__int64 __fastcall sub_2EE30(__int64 a1, __int64 a2)
{
  (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 72LL))(a1);
  if ( *(_QWORD *)(a2 + 8) != 0 )
    return 0;
  else
    return 4294960747LL;
}


// Address: 0x2EE70 | Function: sub_2EE70
const char *__fastcall sub_2EE70(__int64 a1, unsigned int *a2, _QWORD *a3, __int64 a4, char a5)
{
  __int64 v7; // x21
  unsigned int *v8; // x22
  __int64 v9; // x8
  char *v12; // x1
  const char *result; // x0
  __int64 v14; // x3
  char *v15; // x21
  __int64 v16; // x22
  __int64 v17; // x0
  char v18; // w9
  __int64 v19; // x23
  __int64 v20; // x0
  int v21; // w8
  unsigned int *v22; // x27
  unsigned int *v23; // x26
  __int64 v24; // x3
  __int64 v25; // x0
  _QWORD *v26; // x8
  unsigned int *v27; // [xsp+18h] [xbp+18h] BYREF

  v8 = a2 + 1;
  v7 = *a2;
  if ( (_DWORD)v7 != -1 )
  {
    if ( *a2 != 0 )
      goto LABEL_3;
    return "FDE has zero length";
  }
  v7 = *(_QWORD *)(a2 + 1);
  v8 = a2 + 3;
  if ( v7 == 0 )
    return "FDE has zero length";
LABEL_3:
  v9 = *v8;
  if ( (_DWORD)v9 == 0 )
    return "FDE is really a CIE";
  v12 = (char *)v8 - v9;
  if ( (a5 & 1) != 0 )
  {
    if ( *(char **)a4 != v12 )
      return "CIE start does not match";
  }
  else
  {
    result = (const char *)sub_2F008(a1, v12, a4);
    if ( result != nullptr )
      return result;
  }
  v14 = *(unsigned __int8 *)(a4 + 24);
  v15 = (char *)v8 + v7;
  v27 = v8 + 1;
  v16 = sub_30C78(a1, &v27, v15, v14, 0);
  v17 = sub_30C78(a1, &v27, v15, *(_BYTE *)(a4 + 24) & 0xF, 0);
  v18 = *(_BYTE *)(a4 + 49);
  v19 = v17;
  a3[5] = 0;
  if ( (v18 & 1) == 0 )
  {
    v23 = v27;
LABEL_16:
    v26 = a3;
    goto LABEL_17;
  }
  v20 = sub_31004(&v27, v15);
  v21 = *(unsigned __int8 *)(a4 + 25);
  v22 = v27;
  v23 = (unsigned int *)((char *)v27 + v20);
  if ( v21 == 255 || sub_30C78(a1, &v27, v15, v21 & 0xF, 0) == 0 )
    goto LABEL_16;
  v24 = *(unsigned __int8 *)(a4 + 25);
  v27 = v22;
  v25 = sub_30C78(a1, &v27, v15, v24, 0);
  v26 = a3;
  a3[5] = v25;
LABEL_17:
  v26[2] = v23;
  v26[3] = v16;
  *v26 = a2;
  v26[1] = v15 - (char *)a2;
  v26[4] = v19 + v16;
  return nullptr;
}


// Address: 0x2F008 | Function: sub_2F008
const char *__fastcall sub_2F008(__int64 a1, unsigned int *a2, __int64 a3)
{
  char v4; // w20
  unsigned int *v6; // x8
  __int64 v7; // x9
  char *v8; // x22
  const char *result; // x0
  __int64 v10; // x9
  int v11; // w24
  _BYTE *v12; // x23
  char *v13; // x8
  int v14; // t1
  int v15; // w0
  char *v16; // x8
  __int64 v17; // x9
  unsigned __int64 v18; // x11
  char *v19; // x10
  unsigned int v20; // w12
  unsigned int v21; // t1
  int v23; // w11
  unsigned int v24; // w8
  char v25; // w9
  char v26; // w9
  __int64 v27; // x3
  char v28; // w8
  char *v29; // x9
  char *v30; // [xsp+8h] [xbp-8h] BYREF

  *(_WORD *)(a3 + 51) = 0;
  *(_QWORD *)(a3 + 32) = 0;
  *(_QWORD *)(a3 + 40) = 0;
  v4 = (char)a2;
  *(_WORD *)(a3 + 48) = 0;
  *(_QWORD *)a3 = a2;
  *(_DWORD *)(a3 + 24) = 65280;
  v6 = a2 + 1;
  v7 = *a2;
  if ( (_DWORD)v7 != -1 )
  {
    v8 = (char *)v6 + v7;
    if ( *a2 != 0 )
      goto LABEL_3;
    return nullptr;
  }
  v10 = *(_QWORD *)(a2 + 1);
  v6 = a2 + 3;
  v8 = (char *)a2 + v10 + 12;
  if ( v10 == 0 )
    return nullptr;
LABEL_3:
  if ( *v6 != 0 )
    return "CIE ID is not zero";
  v11 = *((unsigned __int8 *)v6 + 4);
  if ( (v11 & 0xFFFFFFFD) != 1 )
    return "CIE version is not 1 or 3";
  v12 = (char *)v6 + 5;
  v13 = (char *)v6 + 5;
  do
    v14 = (unsigned __int8)*v13++;
  while ( v14 != 0 );
  v30 = v13;
  v15 = sub_31004(&v30, v8);
  v16 = v30;
  v17 = 0;
  v18 = -7;
  *(_DWORD *)(a3 + 40) = v15;
  v19 = v16;
  do
  {
    if ( v19 == v8 )
    {
      fprintf((FILE *)((char *)&_sF + 304), "libunwind: %s - %s\n", "getSLEB128", "truncated sleb128 expression");
      fflush((FILE *)((char *)&_sF + 304));
      abort();
    }
    v21 = (unsigned __int8)*v19++;
    v20 = v21;
    v18 += 7LL;
    ++v16;
    v17 |= (unsigned __int64)(v21 & 0x7F) << v18;
  }
  while ( (v21 & 0x80) != 0 );
  v30 = v16;
  if ( v18 < 0x39 && v20 > 0x3F )
    v23 = -1LL << ((unsigned __int8)v18 + 7);
  else
    v23 = 0;
  *(_DWORD *)(a3 + 44) = v17 | v23;
  if ( v11 == 1 )
  {
    v30 = v16 + 1;
    *(_BYTE *)(a3 + 50) = *v19;
    if ( *v12 != 122 )
      goto LABEL_44;
    goto LABEL_24;
  }
  *(_BYTE *)(a3 + 50) = sub_31004(&v30, v8);
  if ( *v12 == 122 )
  {
LABEL_24:
    sub_31004(&v30, v8);
    while ( 1 )
    {
      while ( 1 )
      {
        while ( 1 )
        {
          v24 = (unsigned __int8)*v12;
          if ( v24 <= 0x4F )
            break;
          if ( (unsigned __int8)*v12 > 0x52u )
          {
            if ( v24 == 83 )
            {
              *(_BYTE *)(a3 + 48) = 1;
              ++v12;
            }
            else
            {
              if ( v24 != 122 )
                goto LABEL_41;
              *(_BYTE *)(a3 + 49) = 1;
              ++v12;
            }
          }
          else if ( v24 == 80 )
          {
            v27 = (unsigned __int8)*v30++;
            v28 = (_BYTE)v30 - v4;
            *(_BYTE *)(a3 + 26) = v27;
            *(_BYTE *)(a3 + 27) = v28;
            *(_QWORD *)(a3 + 32) = sub_30C78(a1, &v30, v8, v27, 0);
            ++v12;
          }
          else
          {
            if ( v24 != 82 )
              goto LABEL_41;
            ++v12;
            v25 = *v30++;
            *(_BYTE *)(a3 + 24) = v25;
          }
        }
        if ( (unsigned __int8)*v12 > 0x46u )
          break;
        if ( v24 == 66 )
        {
          *(_BYTE *)(a3 + 51) = 1;
          ++v12;
        }
        else
        {
          if ( *v12 == 0 )
            goto LABEL_44;
LABEL_41:
          ++v12;
        }
      }
      if ( v24 == 71 )
      {
        *(_BYTE *)(a3 + 52) = 1;
        goto LABEL_41;
      }
      if ( v24 != 76 )
        goto LABEL_41;
      ++v12;
      v26 = *v30++;
      *(_BYTE *)(a3 + 25) = v26;
    }
  }
LABEL_44:
  v29 = v30;
  result = nullptr;
  *(_QWORD *)(a3 + 8) = &v8[-*(_QWORD *)a3];
  *(_QWORD *)(a3 + 16) = v29;
  return result;
}


// Address: 0x2F2D0 | Function: sub_2F2D0
void sub_2F2D0()
{
  ;
}


// Address: 0x2F2D8 | Function: sub_2F2D8
void sub_2F2D8()
{
  ;
}


// Address: 0x2F2E0 | Function: sub_2F2E0
bool __fastcall sub_2F2E0(__int64 a1, unsigned int a2)
{
  if ( a2 > 0xFFFFFFFD )
    return true;
  if ( a2 > 0x5F )
    return false;
  if ( a2 == 34 )
    return true;
  return a2 - 64 < 0xFFFFFFE1;
}


// Address: 0x2F324 | Function: sub_2F324
__int64 __fastcall sub_2F324(_QWORD *a1, int a2)
{
  if ( a2 <= 29 )
  {
    switch ( a2 )
    {
      case -2:
        return a1[33];
      case -1:
        return a1[34];
      case 29:
        return a1[31];
      default:
        break;
    }
    goto LABEL_13;
  }
  if ( a2 > 31 )
  {
    if ( a2 == 34 )
      return a1[35];
    if ( a2 == 32 )
      return a1[34];
LABEL_13:
    if ( (unsigned int)a2 > 0x1C )
    {
      fprintf((FILE *)((char *)&_sF + 304), "libunwind: %s - %s\n", "getRegister", "unsupported arm64 register");
      fflush((FILE *)((char *)&_sF + 304));
      abort();
    }
    return a1[(unsigned int)a2 + 2];
  }
  if ( a2 != 30 )
    return a1[33];
  return a1[32];
}


// Address: 0x2F40C | Function: sub_2F40C
_QWORD *__fastcall sub_2F40C(_QWORD *result, int a2, __int64 a3)
{
  if ( a2 <= 29 )
  {
    switch ( a2 )
    {
      case -2:
LABEL_12:
        result[33] = a3;
        return result;
      case -1:
        goto LABEL_11;
      case 29:
        result[31] = a3;
        return result;
      default:
        break;
    }
    goto LABEL_13;
  }
  if ( a2 > 31 )
  {
    if ( a2 == 34 )
    {
      result[35] = a3;
      return result;
    }
    if ( a2 == 32 )
    {
LABEL_11:
      result[34] = a3;
      return result;
    }
LABEL_13:
    if ( (unsigned int)a2 > 0x1C )
    {
      fprintf((FILE *)((char *)&_sF + 304), "libunwind: %s - %s\n", "setRegister", "unsupported arm64 register");
      fflush((FILE *)((char *)&_sF + 304));
      abort();
    }
    result[(unsigned int)a2 + 2] = a3;
    return result;
  }
  if ( a2 != 30 )
    goto LABEL_12;
  result[32] = a3;
  return result;
}


// Address: 0x2F4F4 | Function: sub_2F4F4
bool __fastcall sub_2F4F4(__int64 a1, int a2)
{
  return (a2 & 0xFFFFFFE0) == 64;
}


// Address: 0x2F508 | Function: sub_2F508
double __fastcall sub_2F508(__int64 a1, int a2)
{
  return *(double *)(a1 + 8LL * a2 - 224);
}


// Address: 0x2F518 | Function: sub_2F518
__int64 __fastcall sub_2F518(__int64 result, int a2, double a3)
{
  *(double *)(result + 8LL * a2 - 224) = a3;
  return result;
}


// Address: 0x2F528 | Function: sub_2F528
__int64 __fastcall sub_2F528(__int64 a1, char a2)
{
  __int64 v2; // x29
  __int64 v3; // x30
  __int64 result; // x0
  __int64 v6; // x20
  __int64 v8; // x0
  unsigned int v9; // w20
  _QWORD v10[68]; // [xsp-210h] [xbp-240h] BYREF

  if ( (*(_BYTE *)(a1 + 616) & 1) != 0 )
    return 0;
  v10[66] = v2;
  v10[67] = v3;
  if ( *(_BYTE *)(a1 + 618) == 1 )
  {
    memset(v10, 0, 0x210u);
    result = sub_2F904(a1, v10);
    if ( (_DWORD)result != 1 )
      return result;
  }
  else
  {
    v6 = *(_QWORD *)(a1 + 8);
    v8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 24LL))(a1, 0xFFFFFFFFLL);
    result = sub_2FA24(v6, v8, *(_QWORD *)(a1 + 600), a1 + 16, a1 + 617, a2 & 1);
    if ( (_DWORD)result != 1 )
      return result;
  }
  v9 = result;
  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, 1);
  result = v9;
  if ( (*(_BYTE *)(a1 + 616) & 1) != 0 )
    return 0;
  return result;
}


// Address: 0x2F61C | Function: sub_2F61C
long double __fastcall sub_2F61C(__int64 a1, __int64 a2)
{
  long double result; // q0
  __int128 v3; // q2
  __int128 v4; // q1

  if ( *(_BYTE *)(a1 + 616) == 1 )
  {
    *(_QWORD *)(a2 + 64) = 0;
    *(_OWORD *)a2 = 0u;
    *(_OWORD *)(a2 + 16) = 0u;
    *(_OWORD *)(a2 + 32) = 0u;
    *(_OWORD *)(a2 + 48) = 0u;
    *(_OWORD *)&result = 0u;
  }
  else
  {
    *(_OWORD *)a2 = *(_OWORD *)(a1 + 544);
    v3 = *(_OWORD *)(a1 + 576);
    result = *(long double *)(a1 + 592);
    v4 = *(_OWORD *)(a1 + 560);
    *(_QWORD *)(a2 + 64) = *(_QWORD *)(a1 + 608);
    *(_OWORD *)(a2 + 32) = v3;
    *(long double *)(a2 + 48) = result;
    *(_OWORD *)(a2 + 16) = v4;
  }
  return result;
}


// Address: 0x2F664 | Function: sub_2F664
__int64 __fastcall sub_2F664(__int64 a1)
{
  return sub_3250C(a1 + 16);
}


// Address: 0x2F670 | Function: sub_2F670
__int64 __fastcall sub_2F670(__int64 a1)
{
  return *(unsigned __int8 *)(a1 + 617);
}


// Address: 0x2F67C | Function: sub_2F67C
__int64 __fastcall sub_2F67C(__int64 a1)
{
  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 24LL))(a1, 0xFFFFFFFFLL);
  return 0;
}


// Address: 0x2F6A8 | Function: sub_2F6A8
__int64 __fastcall sub_2F6A8(__int64 *a1, char a2)
{
  __int64 v2; // x8
  __int64 result; // x0
  unsigned __int64 v6; // x20
  _QWORD *i; // x8
  unsigned int *v8; // x21
  __int64 v9; // x8
  __int64 v10; // x9
  __int128 v11; // q0
  __int64 v12; // x8
  __int64 v13; // x8
  _DWORD *v14; // x20
  int *v15; // x21
  int v16; // w22
  int v17; // w8
  _QWORD v18[7]; // [xsp+0h] [xbp-6B0h] BYREF
  _QWORD v19[3]; // [xsp+38h] [xbp-678h] BYREF
  __int128 v20; // [xsp+50h] [xbp-660h]
  __int64 v21; // [xsp+60h] [xbp-650h]
  _BYTE v22[16]; // [xsp+68h] [xbp-648h] BYREF
  __int64 v23; // [xsp+78h] [xbp-638h]
  _QWORD data[2]; // [xsp+98h] [xbp-618h] BYREF
  unsigned __int64 v25; // [xsp+A8h] [xbp-608h]

  v2 = *a1;
  *((_BYTE *)a1 + 618) = 0;
  result = (*(__int64 (__fastcall **)(__int64 *, __int64))(v2 + 24))(a1, 0xFFFFFFFFLL);
  if ( result == 0 )
  {
LABEL_20:
    *((_BYTE *)a1 + 616) = 1;
    return result;
  }
  v6 = result - (a2 & 1) + *((unsigned __int8 *)a1 + 617);
  data[0] = a1[1];
  data[1] = v22;
  v25 = v6;
  if ( dl_iterate_phdr((int (*)(struct dl_phdr_info *, size_t, void *))sub_31E64, data) == 0
    || v23 == 0
    || ((result = sub_31B90(a1, v6, v22, 0)) & 1) == 0 )
  {
    pthread_rwlock_rdlock(&stru_3DDD4);
    for ( i = off_3DB28; ; i += 4 )
    {
      if ( i >= (_QWORD *)off_3DB30 )
      {
        pthread_rwlock_unlock(&stru_3DDD4);
        goto LABEL_15;
      }
      if ( i[1] <= v6 && v6 < i[2] )
        break;
    }
    v8 = (unsigned int *)i[3];
    pthread_rwlock_unlock(&stru_3DDD4);
    if ( v8 != nullptr && sub_2EE70(a1[1], v8, v19, (__int64)v18, 0) == nullptr )
    {
      memset(data, 0, 0x618u);
      result = sub_2FEA0(a1[1], (int)v19, (int)v18, v6, 4, data);
      if ( (result & 1) != 0 )
      {
        v9 = v21;
        v10 = v18[4];
        v11 = v20;
        a1[73] = 0;
        a1[70] = v9;
        v12 = (unsigned int)v25;
        a1[71] = v10;
        a1[72] = v12;
        *((_DWORD *)a1 + 148) = 50331648;
        v13 = v19[0];
        LODWORD(v10) = v19[1];
        *((_OWORD *)a1 + 34) = v11;
        a1[76] = 0;
        a1[75] = v13;
        *((_DWORD *)a1 + 149) = v10;
        return result;
      }
    }
LABEL_15:
    result = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 24))(a1, 0xFFFFFFFFLL);
    if ( result != 0 )
    {
      v14 = (_DWORD *)result;
      v15 = (int *)__errno();
      v16 = *v15;
      result = syscall(135, 0xFFFFFFFFLL, v14, 0, 8);
      v17 = *v15;
      *v15 = v16;
      if ( v17 != 14 && *v14 == -763358872 && v14[1] == -738197503 )
      {
        a1[76] = 0;
        a1[69] = (__int64)(v14 + 1);
        a1[68] = (__int64)v14;
        *((_BYTE *)a1 + 618) = 1;
        *((_OWORD *)a1 + 36) = 0u;
        *((_OWORD *)a1 + 37) = 0u;
        *((_OWORD *)a1 + 35) = 0u;
        return result;
      }
    }
    goto LABEL_20;
  }
  return result;
}


// Address: 0x2F8EC | Function: sub_2F8EC
__int64 __fastcall sub_2F8EC(__int64 a1, unsigned int a2)
{
  return sub_324DC(a2);
}


// Address: 0x2F8F8 | Function: sub_2F8F8
__int64 __fastcall sub_2F8F8(__int64 a1)
{
  return a1 + 16;
}


// Address: 0x2F904 | Function: sub_2F904
__int64 __fastcall sub_2F904(__int64 a1)
{
  _QWORD *v1; // x10
  __int64 v2; // x10

  v1 = *(_QWORD **)(a1 + 264);
  *(_QWORD *)(a1 + 16) = v1[39];
  *(_QWORD *)(a1 + 24) = v1[40];
  *(_QWORD *)(a1 + 32) = v1[41];
  *(_QWORD *)(a1 + 40) = v1[42];
  *(_QWORD *)(a1 + 48) = v1[43];
  *(_QWORD *)(a1 + 56) = v1[44];
  *(_QWORD *)(a1 + 64) = v1[45];
  *(_QWORD *)(a1 + 72) = v1[46];
  *(_QWORD *)(a1 + 80) = v1[47];
  *(_QWORD *)(a1 + 88) = v1[48];
  *(_QWORD *)(a1 + 96) = v1[49];
  *(_QWORD *)(a1 + 104) = v1[50];
  *(_QWORD *)(a1 + 112) = v1[51];
  *(_QWORD *)(a1 + 120) = v1[52];
  *(_QWORD *)(a1 + 128) = v1[53];
  *(_QWORD *)(a1 + 136) = v1[54];
  *(_QWORD *)(a1 + 144) = v1[55];
  *(_QWORD *)(a1 + 152) = v1[56];
  *(_QWORD *)(a1 + 160) = v1[57];
  *(_QWORD *)(a1 + 168) = v1[58];
  *(_QWORD *)(a1 + 176) = v1[59];
  *(_QWORD *)(a1 + 184) = v1[60];
  *(_QWORD *)(a1 + 192) = v1[61];
  *(_QWORD *)(a1 + 200) = v1[62];
  *(_QWORD *)(a1 + 208) = v1[63];
  *(_QWORD *)(a1 + 216) = v1[64];
  *(_QWORD *)(a1 + 224) = v1[65];
  *(_QWORD *)(a1 + 232) = v1[66];
  *(_QWORD *)(a1 + 240) = v1[67];
  *(_QWORD *)(a1 + 248) = v1[68];
  *(_QWORD *)(a1 + 256) = v1[69];
  *(_QWORD *)(a1 + 264) = v1[70];
  v2 = v1[71];
  *(_BYTE *)(a1 + 617) = 1;
  *(_QWORD *)(a1 + 272) = v2;
  return 1;
}


// Address: 0x2FA24 | Function: sub_2FA24
__int64 __fastcall sub_2FA24(__int64 a1, int a2, unsigned int *a3, __int64 *a4, _BYTE *a5, char a6)
{
  unsigned __int64 v11; // x0
  unsigned __int64 v12; // x22
  char *i; // x8
  unsigned __int64 v14; // x26
  __int64 v15; // x23
  _QWORD *v16; // x24
  __int64 *v17; // x27
  __int64 v19; // d0
  int v20; // w8
  __int64 *v21; // x9
  __int64 v22; // x0
  _BYTE v23[528]; // [xsp+50h] [xbp-AC0h] BYREF
  _QWORD dest[31]; // [xsp+260h] [xbp-8B0h] BYREF
  __int64 v25; // [xsp+358h] [xbp-7B8h]
  __int64 v26; // [xsp+360h] [xbp-7B0h]
  __int64 v27; // [xsp+368h] [xbp-7A8h]
  _BYTE s[24]; // [xsp+470h] [xbp-6A0h] BYREF
  _QWORD v29[192]; // [xsp+488h] [xbp-688h] BYREF
  _BYTE v30[50]; // [xsp+A88h] [xbp-88h] BYREF
  unsigned __int8 v31; // [xsp+ABAh] [xbp-56h]
  char v32; // [xsp+ABCh] [xbp-54h]
  _QWORD v33[6]; // [xsp+AC0h] [xbp-50h] BYREF
  __int128 v34; // [xsp+AF0h] [xbp-20h] BYREF

  if ( sub_2EE70(a1, a3, v33, (__int64)v30, 0) != nullptr )
    return 4294960750LL;
  memset(s, 0, 0x618u);
  if ( (sub_2FEA0(a1, (int)v33, (int)v30, a2, 4, s) & 1) == 0 )
    return 4294960750LL;
  v11 = sub_30934(a1, s, a4);
  v12 = v11;
  if ( (a6 & 1) != 0 && v32 == 1 )
  {
    for ( i = (char *)(a4[31] & 0xFFFFFFFFFFFFFFF0LL); (unsigned __int64)i < v11; i += 16 )
      __arm_mte_set_tag(i);
  }
  memcpy(dest, a4, 0x210u);
  v14 = 0;
  v15 = 0;
  v16 = v29;
  v17 = dest;
  v25 = v12;
  do
  {
    v20 = *(_DWORD *)v16;
    if ( *(_DWORD *)v16 == 0 )
    {
      if ( v14 != v31 )
        goto LABEL_11;
      if ( v31 <= 0x1Eu )
      {
        v21 = a4 + 29;
        if ( v31 != 29 )
        {
          v21 = a4 + 30;
          if ( v31 != 30 )
            goto LABEL_38;
        }
      }
      else
      {
        v21 = a4 + 33;
        if ( v31 != 34 )
        {
          v21 = a4 + 32;
          if ( v31 != 32 )
          {
            v21 = a4 + 31;
            if ( v31 != 31 )
            {
LABEL_38:
              if ( v31 > 0x1Cu )
              {
                fprintf(
                  (FILE *)((char *)&_sF + 304),
                  "libunwind: %s - %s\n",
                  "getRegister",
                  "unsupported arm64 register");
                fflush((FILE *)((char *)&_sF + 304));
                abort();
              }
              v21 = &a4[v31];
            }
          }
        }
      }
      v15 = *v21;
      goto LABEL_11;
    }
    if ( (v14 & 0x60) == 0x40 )
    {
      if ( v20 > 4 )
      {
        if ( v20 == 5 )
        {
          v19 = *(__int64 *)((char *)a4 + (((v16[1] << 32) - 0x4000000000LL) >> 29) + 272);
        }
        else
        {
          if ( v20 != 6 )
          {
LABEL_50:
            fprintf(
              (FILE *)((char *)&_sF + 304),
              "libunwind: %s - %s\n",
              "getSavedFloatRegister",
              "unsupported restore location for float register");
            fflush((FILE *)((char *)&_sF + 304));
            abort();
          }
          v19 = *(_QWORD *)sub_311CC(v16[1], a1, a4, v12);
        }
      }
      else
      {
        v19 = 0;
        if ( v20 != 1 )
        {
          if ( v20 != 2 )
            goto LABEL_50;
          v19 = *(_QWORD *)(v16[1] + v12);
        }
      }
      *(_QWORD *)&v23[8 * v14 + 288] = v19;
    }
    else if ( v14 == v31 )
    {
      v15 = sub_30A68(a1, a4, v12, v16);
    }
    else if ( v14 == 34 )
    {
      v27 = sub_30A68(a1, a4, v12, v16);
    }
    else
    {
      if ( v14 > 0x20 )
        return 4294960754LL;
      v22 = sub_30A68(a1, a4, v12, v16);
      if ( (int)v14 > 30 )
      {
        if ( (_DWORD)v14 == 31 )
          v25 = v22;
        else
          v26 = v22;
      }
      else if ( (_DWORD)v14 == 29 )
      {
        dest[29] = v22;
      }
      else if ( (_DWORD)v14 == 30 )
      {
        dest[30] = v22;
      }
      else
      {
        *v17 = v22;
      }
    }
LABEL_11:
    ++v14;
    v16 += 2;
    ++v17;
  }
  while ( v14 != 96 );
  *a5 = v30[48];
  memcpy(v23, a4, sizeof(v23));
  v34 = *(_OWORD *)&v29[68];
  if ( LODWORD(v29[68]) != 0 )
    sub_30A68(a1, v23, v12, &v34);
  v26 = v15;
  memcpy(a4, dest, 0x210u);
  return 1;
}


// Address: 0x2FEA0 | Function: sub_2FEA0
__int64 __fastcall sub_2FEA0(__int64 a1, __int64 *a2, __int64 a3, __int64 a4, int a5, char *dest)
{
  __int64 v6; // x11
  __int64 v7; // x12
  __int64 v10; // x27
  __int64 v11; // x9
  char *v12; // x21
  __int64 v13; // x9
  __int64 v14; // x10
  unsigned __int8 *v15; // x9
  unsigned __int8 *v16; // x24
  unsigned __int64 v17; // x28
  unsigned __int64 v19; // x25
  unsigned __int8 *v20; // x8
  __int64 v21; // x10
  unsigned __int64 v22; // x0
  unsigned __int8 *v23; // x10
  __int64 v24; // x8
  unsigned __int64 v25; // x9
  unsigned __int8 *v26; // x12
  unsigned int v27; // w11
  unsigned int v28; // t1
  int v30; // w9
  int v31; // w8
  unsigned __int64 v32; // x0
  unsigned __int8 *v33; // x9
  __int64 v34; // x8
  unsigned __int64 v35; // x10
  unsigned __int8 *v36; // x12
  unsigned int v37; // w11
  unsigned int v38; // t1
  char *v39; // x12
  __int64 v40; // x13
  bool v41; // cc
  __int64 v42; // x10
  __int64 v43; // x11
  __int64 *v44; // x13
  __int128 v45; // q0
  __int64 v46; // x8
  int v47; // w9
  unsigned __int64 v48; // x0
  unsigned __int64 v49; // x0
  unsigned __int64 v50; // x26
  __int64 v51; // x0
  char *v52; // x8
  __int64 v53; // x9
  __int64 *v54; // x11
  __int128 v55; // q0
  __int64 v56; // x9
  __int64 *v57; // x9
  __int128 v58; // q0
  int v59; // w8
  int v60; // w10
  unsigned __int8 *v61; // x9
  unsigned __int64 v62; // x0
  char *v63; // x8
  __int64 *v64; // x10
  __int128 v65; // q0
  unsigned __int8 *v66; // x9
  int v67; // w10
  unsigned __int64 v68; // x26
  int v69; // w0
  __int64 v70; // x9
  unsigned __int64 v71; // x10
  unsigned __int8 *v72; // x11
  unsigned int v73; // w12
  unsigned int v74; // t1
  int v76; // w10
  unsigned __int64 v77; // x26
  __int64 v78; // x0
  __int64 v79; // x9
  __int64 *v80; // x11
  __int128 v81; // q0
  _QWORD *v82; // x26
  unsigned __int64 v83; // x0
  char *v84; // x8
  __int128 v85; // q0
  unsigned __int64 v86; // x0
  char *v87; // x8
  __int64 *v88; // x10
  __int128 v89; // q0
  unsigned __int64 v90; // x26
  unsigned __int64 v91; // x0
  char *v92; // x8
  __int64 *v93; // x10
  __int128 v94; // q0
  unsigned int v95; // w8
  __int64 v96; // x26
  unsigned __int64 v97; // x0
  char *v98; // x8
  __int64 *v99; // x10
  __int128 v100; // q0
  unsigned __int64 v101; // x0
  unsigned __int8 *v102; // x9
  __int64 v103; // x8
  unsigned __int64 v104; // x10
  unsigned __int8 *v105; // x12
  unsigned int v106; // w11
  unsigned int v107; // t1
  __int64 v108; // x13
  bool v109; // cc
  __int64 v110; // x11
  __int64 *v111; // x13
  __int128 v112; // q0
  unsigned __int64 v113; // x0
  __int64 *v114; // x10
  __int128 v115; // q0
  __int64 v116; // x0
  unsigned __int64 v117; // x0
  unsigned __int64 v118; // x26
  __int64 v119; // x0
  __int64 v120; // x9
  __int64 *v121; // x11
  __int128 v122; // q0
  int v123; // w10
  __int128 v124; // q0
  const char *v126; // x0
  size_t v127; // x1
  FILE *v128; // x3
  _QWORD *v129; // [xsp-620h] [xbp-CB0h] BYREF
  __int64 v130; // [xsp-618h] [xbp-CA8h] BYREF
  __int64 *v131; // [xsp+8h] [xbp-688h]
  __int128 *v132; // [xsp+10h] [xbp-680h]
  __int64 v133; // [xsp+18h] [xbp-678h]
  int v134; // [xsp+24h] [xbp-66Ch]
  _QWORD *v135; // [xsp+28h] [xbp-668h]
  __int64 *v136; // [xsp+30h] [xbp-660h]
  __int64 v137; // [xsp+50h] [xbp-640h] BYREF
  __int64 v138; // [xsp+270h] [xbp-420h] BYREF
  unsigned __int8 *v139; // [xsp+650h] [xbp-40h] BYREF
  _QWORD v140[7]; // [xsp+658h] [xbp-38h] BYREF

  v6 = a2[2];
  v7 = a2[3];
  v10 = 0;
  v11 = *(_QWORD *)(a3 + 8) + *(_QWORD *)a3;
  v12 = dest + 24;
  v140[0] = *(_QWORD *)(a3 + 16);
  v140[1] = v11;
  v13 = *a2;
  v14 = a2[1];
  v140[2] = -1;
  v140[3] = v6;
  v134 = a5;
  v133 = a1;
  v140[4] = v14 + v13;
  v140[5] = a4 - v7;
  v135 = nullptr;
  v136 = &v137;
  v131 = &v138;
  v132 = (__int128 *)(dest + 568);
  while ( 1 )
  {
    v15 = (unsigned __int8 *)v140[v10];
    v16 = (unsigned __int8 *)v140[v10 + 1];
    v17 = v140[v10 + 2];
    v139 = v15;
    if ( v15 < v16 && v17 != 0 )
      break;
LABEL_2:
    v10 += 3;
    if ( v10 == 6 )
      return 1;
  }
  v19 = 0;
  while ( 2 )
  {
    v20 = v15 + 1;
    v21 = *v15;
    v139 = v15 + 1;
    switch ( v21 )
    {
      case 0LL:
        goto LABEL_125;
      case 1LL:
        v19 = sub_30C78(v133, &v139, v16, *(unsigned __int8 *)(a3 + 24), 0);
        goto LABEL_125;
      case 2LL:
        v59 = v15[1];
        v60 = *(_DWORD *)(a3 + 40);
        v61 = v15 + 2;
        goto LABEL_69;
      case 3LL:
        v59 = *(unsigned __int16 *)(v15 + 1);
        v60 = *(_DWORD *)(a3 + 40);
        v61 = v15 + 3;
        goto LABEL_69;
      case 4LL:
        v59 = *(_DWORD *)(v15 + 1);
        v60 = *(_DWORD *)(a3 + 40);
        v61 = v15 + 5;
LABEL_69:
        v19 += (unsigned int)(v60 * v59);
        v139 = v61;
        goto LABEL_125;
      case 5LL:
        v77 = sub_31004(&v139, v16);
        v78 = sub_31004(&v139, v16);
        if ( v77 >= 0x60 )
        {
          v126 = "libunwind: malformed DW_CFA_offset_extended DWARF unwind, reg too big\n";
          v127 = 70;
          v128 = (FILE *)((char *)&_sF + 304);
          goto LABEL_147;
        }
        v52 = &v12[16 * v77];
        v79 = *(int *)(a3 + 44);
        if ( (v52[4] & 1) == 0 )
        {
          v80 = v136;
          v81 = *(_OWORD *)v52;
          v52[4] = 1;
          *(_OWORD *)&v80[2 * v77] = v81;
        }
LABEL_122:
        v56 = v78 * v79;
        goto LABEL_123;
      case 6LL:
        v83 = sub_31004(&v139, v16);
        if ( v83 < 0x60 )
        {
          v84 = &v12[16 * v83];
          if ( v84[4] == 1 )
          {
            v85 = *(_OWORD *)&v136[2 * v83];
LABEL_89:
            *(_OWORD *)v84 = v85;
          }
          goto LABEL_125;
        }
        v126 = "libunwind: malformed DW_CFA_restore_extended DWARF unwind, reg too big\n";
        goto LABEL_134;
      case 7LL:
        v86 = sub_31004(&v139, v16);
        if ( v86 >= 0x60 )
        {
          v126 = "libunwind: malformed DW_CFA_undefined DWARF unwind, reg too big\n";
          goto LABEL_146;
        }
        v87 = &v12[16 * v86];
        if ( (v87[4] & 1) == 0 )
        {
          v88 = v136;
          v89 = *(_OWORD *)v87;
          v87[4] = 1;
          *(_OWORD *)&v88[2 * v86] = v89;
        }
        *(_DWORD *)v87 = 1;
        goto LABEL_125;
      case 8LL:
        v97 = sub_31004(&v139, v16);
        if ( v97 >= 0x60 )
        {
          v126 = "libunwind: malformed DW_CFA_same_value DWARF unwind, reg too big\n";
          goto LABEL_144;
        }
        v98 = &v12[16 * v97];
        if ( (v98[4] & 1) == 0 )
        {
          v99 = v136;
          v100 = *(_OWORD *)v98;
          v98[4] = 1;
          *(_OWORD *)&v99[2 * v97] = v100;
        }
        *(_DWORD *)v98 = 0;
        goto LABEL_125;
      case 9LL:
        v90 = sub_31004(&v139, v16);
        v91 = sub_31004(&v139, v16);
        if ( v90 >= 0x60 )
        {
          v126 = "libunwind: malformed DW_CFA_register DWARF unwind, reg too big\n";
          v127 = 63;
          v128 = (FILE *)((char *)&_sF + 304);
          goto LABEL_147;
        }
        if ( v91 < 0x60 )
        {
          v92 = &v12[16 * v90];
          if ( (v92[4] & 1) == 0 )
          {
            v93 = v136;
            v94 = *(_OWORD *)v92;
            v92[4] = 1;
            *(_OWORD *)&v93[2 * v90] = v94;
          }
          *((_QWORD *)v92 + 1) = v91;
          *(_DWORD *)v92 = 5;
LABEL_125:
          v15 = v139;
          if ( v139 >= v16 || v19 >= v17 )
            goto LABEL_2;
          continue;
        }
        v126 = "libunwind: malformed DW_CFA_register DWARF unwind, reg2 too big\n";
LABEL_146:
        v128 = (FILE *)((char *)&_sF + 304);
        v127 = 64;
LABEL_147:
        fwrite(v126, v127, 1u, v128);
LABEL_148:
        fflush((FILE *)((char *)&_sF + 304));
        return 0;
      case 10LL:
        v129 = v135;
        memcpy(&v130, dest, 0x618u);
        v135 = &v129;
        goto LABEL_125;
      case 11LL:
        if ( v135 == nullptr )
          return 0;
        v82 = v135;
        memcpy(dest, v135 + 1, 0x618u);
        v135 = (_QWORD *)*v82;
        goto LABEL_125;
      case 12LL:
        v68 = sub_31004(&v139, v16);
        v69 = sub_31004(&v139, v16);
        if ( v68 >= 0x60 )
        {
          v126 = "libunwind: malformed DW_CFA_def_cfa DWARF unwind, reg too big\n";
          v127 = 62;
          v128 = (FILE *)((char *)&_sF + 304);
          goto LABEL_147;
        }
        *(_DWORD *)dest = v68;
        *((_DWORD *)dest + 1) = v69;
        goto LABEL_125;
      case 13LL:
        v48 = sub_31004(&v139, v16);
        if ( v48 >= 0x60 )
        {
          v126 = "libunwind: malformed DW_CFA_def_cfa_register DWARF unwind, reg too big\n";
LABEL_134:
          v128 = (FILE *)((char *)&_sF + 304);
          v127 = 71;
          goto LABEL_147;
        }
        *(_DWORD *)dest = v48;
        goto LABEL_125;
      case 14LL:
        *((_DWORD *)dest + 1) = sub_31004(&v139, v16);
        goto LABEL_125;
      case 15LL:
        *(_DWORD *)dest = 0;
        *((_QWORD *)dest + 1) = v20;
        goto LABEL_113;
      case 16LL:
        v113 = sub_31004(&v139, v16);
        if ( v113 >= 0x60 )
        {
          v126 = "libunwind: malformed DW_CFA_expression DWARF unwind, reg too big\n";
          goto LABEL_144;
        }
        v63 = &v12[16 * v113];
        if ( (v63[4] & 1) == 0 )
        {
          v114 = v136;
          v115 = *(_OWORD *)v63;
          v63[4] = 1;
          *(_OWORD *)&v114[2 * v113] = v115;
        }
        v66 = v139;
        v67 = 6;
        goto LABEL_112;
      case 17LL:
        v101 = sub_31004(&v139, v16);
        if ( v101 >= 0x60 )
        {
          v126 = "libunwind: malformed DW_CFA_offset_extended_sf DWARF unwind, reg too big\n";
          v127 = 73;
          v128 = (FILE *)((char *)&_sF + 304);
          goto LABEL_147;
        }
        v102 = v139;
        v103 = 0;
        v104 = -7;
        v105 = v139;
        do
        {
          if ( v105 == v16 )
          {
            fprintf((FILE *)((char *)&_sF + 304), "libunwind: %s - %s\n", "getSLEB128", "truncated sleb128 expression");
            fflush((FILE *)((char *)&_sF + 304));
            abort();
          }
          v107 = *v105++;
          v106 = v107;
          v104 += 7LL;
          ++v102;
          v103 |= (unsigned __int64)(v107 & 0x7F) << v104;
        }
        while ( (v107 & 0x80) != 0 );
        v39 = &v12[16 * v101];
        v139 = v102;
        v108 = -1LL << ((unsigned __int8)v104 + 7);
        v109 = v104 < 0x39 && v106 > 0x3F;
        v42 = *(int *)(a3 + 44);
        if ( v109 )
          v110 = v108;
        else
          v110 = 0;
        if ( (v39[4] & 1) == 0 )
        {
          v111 = v136;
          v112 = *(_OWORD *)v39;
          v39[4] = 1;
          *(_OWORD *)&v111[2 * v101] = v112;
        }
        v46 = v103 | v110;
        v47 = 2;
LABEL_107:
        *(_DWORD *)v39 = v47;
        *((_QWORD *)v39 + 1) = v46 * v42;
        goto LABEL_125;
      case 18LL:
        v22 = sub_31004(&v139, v16);
        v23 = v139;
        v24 = 0;
        v25 = -7;
        v26 = v139;
        do
        {
          if ( v26 == v16 )
          {
            fprintf((FILE *)((char *)&_sF + 304), "libunwind: %s - %s\n", "getSLEB128", "truncated sleb128 expression");
            fflush((FILE *)((char *)&_sF + 304));
            abort();
          }
          v28 = *v26++;
          v27 = v28;
          v25 += 7LL;
          ++v23;
          v24 |= (unsigned __int64)(v28 & 0x7F) << v25;
        }
        while ( (v28 & 0x80) != 0 );
        v139 = v23;
        if ( v22 >= 0x60 )
        {
          v126 = "libunwind: malformed DW_CFA_def_cfa_sf DWARF unwind, reg too big\n";
LABEL_144:
          v128 = (FILE *)((char *)&_sF + 304);
          v127 = 65;
          goto LABEL_147;
        }
        if ( v25 < 0x39 && v27 > 0x3F )
          v30 = -1LL << ((unsigned __int8)v25 + 7);
        else
          v30 = 0;
        v31 = *(_DWORD *)(a3 + 44) * (v24 | v30);
        *(_DWORD *)dest = v22;
        *((_DWORD *)dest + 1) = v31;
        goto LABEL_125;
      case 19LL:
        v70 = 0;
        v71 = -7;
        v72 = v20;
        do
        {
          if ( v72 == v16 )
          {
            fprintf((FILE *)((char *)&_sF + 304), "libunwind: %s - %s\n", "getSLEB128", "truncated sleb128 expression");
            fflush((FILE *)((char *)&_sF + 304));
            abort();
          }
          v74 = *v72++;
          v73 = v74;
          v71 += 7LL;
          ++v20;
          v70 |= (unsigned __int64)(v74 & 0x7F) << v71;
        }
        while ( (v74 & 0x80) != 0 );
        v139 = v20;
        if ( v71 < 0x39 && v73 > 0x3F )
          v76 = -1LL << ((unsigned __int8)v71 + 7);
        else
          v76 = 0;
        *((_DWORD *)dest + 1) = *(_DWORD *)(a3 + 44) * (v70 | v76);
        goto LABEL_125;
      case 20LL:
        v117 = sub_31004(&v139, v16);
        v118 = v117;
        if ( v117 >= 0x60 )
        {
          fprintf(
            (FILE *)((char *)&_sF + 304),
            "libunwind: malformed DW_CFA_val_offset DWARF unwind, reg (%lu) out of range\n\n",
            v117);
          goto LABEL_148;
        }
        v119 = sub_31004(&v139, v16);
        v52 = &v12[16 * v118];
        v120 = *(int *)(a3 + 44);
        if ( (v52[4] & 1) == 0 )
        {
          v121 = v136;
          v122 = *(_OWORD *)v52;
          v52[4] = 1;
          *(_OWORD *)&v121[2 * v118] = v122;
        }
        v56 = v119 * v120;
        v123 = 4;
LABEL_124:
        *(_DWORD *)v52 = v123;
        *((_QWORD *)v52 + 1) = v56;
        goto LABEL_125;
      case 21LL:
        v32 = sub_31004(&v139, v16);
        if ( v32 >= 0x60 )
        {
          v126 = "libunwind: malformed DW_CFA_val_offset_sf DWARF unwind, reg too big\n";
          v127 = 68;
          v128 = (FILE *)((char *)&_sF + 304);
          goto LABEL_147;
        }
        v33 = v139;
        v34 = 0;
        v35 = -7;
        v36 = v139;
        do
        {
          if ( v36 == v16 )
          {
            fprintf((FILE *)((char *)&_sF + 304), "libunwind: %s - %s\n", "getSLEB128", "truncated sleb128 expression");
            fflush((FILE *)((char *)&_sF + 304));
            abort();
          }
          v38 = *v36++;
          v37 = v38;
          v35 += 7LL;
          ++v33;
          v34 |= (unsigned __int64)(v38 & 0x7F) << v35;
        }
        while ( (v38 & 0x80) != 0 );
        v39 = &v12[16 * v32];
        v139 = v33;
        v40 = -1LL << ((unsigned __int8)v35 + 7);
        v41 = v35 < 0x39 && v37 > 0x3F;
        v42 = *(int *)(a3 + 44);
        if ( v41 )
          v43 = v40;
        else
          v43 = 0;
        if ( (v39[4] & 1) == 0 )
        {
          v44 = v136;
          v45 = *(_OWORD *)v39;
          v39[4] = 1;
          *(_OWORD *)&v44[2 * v32] = v45;
        }
        v46 = v34 | v43;
        v47 = 4;
        goto LABEL_107;
      case 22LL:
        v62 = sub_31004(&v139, v16);
        if ( v62 >= 0x60 )
        {
          v126 = "libunwind: malformed DW_CFA_val_expression DWARF unwind, reg too big\n";
          v127 = 69;
          v128 = (FILE *)((char *)&_sF + 304);
          goto LABEL_147;
        }
        v63 = &v12[16 * v62];
        if ( (v63[4] & 1) == 0 )
        {
          v64 = v136;
          v65 = *(_OWORD *)v63;
          v63[4] = 1;
          *(_OWORD *)&v64[2 * v62] = v65;
        }
        v66 = v139;
        v67 = 7;
LABEL_112:
        *(_DWORD *)v63 = v67;
        *((_QWORD *)v63 + 1) = v66;
LABEL_113:
        v116 = sub_31004(&v139, v16);
        v139 += v116;
        goto LABEL_125;
      case 45LL:
        if ( v134 == 4 )
        {
          if ( (dest[572] & 1) == 0 )
          {
            v57 = v131;
            v58 = *v132;
            dest[572] = 1;
            *(_OWORD *)v57 = v58;
          }
          *((_QWORD *)dest + 72) ^= 1uLL;
        }
        goto LABEL_125;
      case 46LL:
        *((_DWORD *)dest + 4) = sub_31004(&v139, v16);
        goto LABEL_125;
      case 47LL:
        v49 = sub_31004(&v139, v16);
        if ( v49 >= 0x60 )
        {
          v126 = "libunwind: malformed DW_CFA_GNU_negative_offset_extended DWARF unwind, reg too big\n";
          v127 = 83;
          v128 = (FILE *)((char *)&_sF + 304);
          goto LABEL_147;
        }
        v50 = v49;
        v51 = sub_31004(&v139, v16);
        v52 = &v12[16 * v50];
        v53 = *(int *)(a3 + 44);
        if ( (v52[4] & 1) == 0 )
        {
          v54 = v136;
          v55 = *(_OWORD *)v52;
          v52[4] = 1;
          *(_OWORD *)&v54[2 * v50] = v55;
        }
        v56 = -(v51 * v53);
LABEL_123:
        v123 = 2;
        goto LABEL_124;
      default:
        v95 = (unsigned int)v21 >> 6;
        v96 = v21 & 0x3F;
        if ( (unsigned int)v21 >> 6 <= 1 )
        {
          if ( v95 != 1 )
            return 0;
          v19 += (unsigned int)(*(_DWORD *)(a3 + 40) * v96);
          goto LABEL_125;
        }
        if ( v95 != 3 )
        {
          v78 = sub_31004(&v139, v16);
          v52 = &v12[16 * (unsigned int)v96];
          v79 = *(int *)(a3 + 44);
          if ( (v52[4] & 1) == 0 )
          {
            v124 = *(_OWORD *)v52;
            v52[4] = 1;
            *(_OWORD *)&v136[2 * (unsigned int)v96] = v124;
          }
          goto LABEL_122;
        }
        v84 = &v12[16 * v96];
        if ( v84[4] != 1 )
          goto LABEL_125;
        v85 = *(_OWORD *)&v136[2 * v96];
        goto LABEL_89;
    }
  }
}


// Address: 0x30934 | Function: sub_30934
__int64 __fastcall sub_30934(__int64 a1, unsigned int *a2, _QWORD *a3)
{
  __int64 v3; // x8

  v3 = *a2;
  if ( (int)v3 <= 29 )
  {
    if ( (v3 & 0x80000000) == 0 )
    {
      if ( (_DWORD)v3 == 0 )
        return sub_311CC(*((_QWORD *)a2 + 1), a1, a3, 0);
      if ( (_DWORD)v3 == 29 )
        return a3[29] + (int)a2[1];
      goto LABEL_18;
    }
    if ( (_DWORD)v3 != -2 )
    {
      if ( (_DWORD)v3 != -1 )
        goto LABEL_18;
      return a3[32] + (int)a2[1];
    }
    return a3[31] + (int)a2[1];
  }
  if ( (int)v3 <= 31 )
  {
    if ( (_DWORD)v3 == 30 )
      return a3[30] + (int)a2[1];
    return a3[31] + (int)a2[1];
  }
  if ( (_DWORD)v3 == 34 )
    return a3[33] + (int)a2[1];
  if ( (_DWORD)v3 == 32 )
    return a3[32] + (int)a2[1];
LABEL_18:
  if ( (unsigned int)v3 > 0x1C )
  {
    fprintf((FILE *)((char *)&_sF + 304), "libunwind: %s - %s\n", "getRegister", "unsupported arm64 register");
    fflush((FILE *)((char *)&_sF + 304));
    abort();
  }
  return a3[v3] + (int)a2[1];
}


// Address: 0x30A68 | Function: sub_30A68
__int64 __fastcall sub_30A68(__int64 a1, _QWORD *a2, __int64 a3, __int64 a4)
{
  int v4; // w9
  __int64 v6; // x8

  v4 = *(_DWORD *)a4;
  if ( *(int *)a4 > 4 )
  {
    if ( v4 != 5 )
    {
      if ( v4 == 6 )
        return *(_QWORD *)sub_311CC(*(_QWORD *)(a4 + 8), a1, a2, a3);
      if ( v4 != 7 )
        goto LABEL_28;
      return sub_311CC(*(_QWORD *)(a4 + 8), a1, a2, a3);
    }
    v6 = *(_QWORD *)(a4 + 8);
    if ( (int)v6 <= 29 )
    {
      switch ( (_DWORD)v6 )
      {
        case 0xFFFFFFFE:
          return a2[31];
        case 0xFFFFFFFF:
          return a2[32];
        case 0x1D:
          return a2[29];
        default:
          break;
      }
    }
    else
    {
      if ( (int)v6 <= 31 )
      {
        if ( (_DWORD)v6 == 30 )
          return a2[30];
        return a2[31];
      }
      if ( (_DWORD)v6 == 34 )
        return a2[33];
      if ( (_DWORD)v6 == 32 )
        return a2[32];
    }
    if ( (unsigned int)v6 > 0x1C )
    {
      fprintf((FILE *)((char *)&_sF + 304), "libunwind: %s - %s\n", "getRegister", "unsupported arm64 register");
      fflush((FILE *)((char *)&_sF + 304));
      abort();
    }
    return a2[*(_QWORD *)(a4 + 8) & 0x1FLL];
  }
  if ( v4 != 1 )
  {
    if ( v4 == 2 || v4 == 3 )
      return *(_QWORD *)(*(_QWORD *)(a4 + 8) + a3);
LABEL_28:
    fprintf(
      (FILE *)((char *)&_sF + 304),
      "libunwind: %s - %s\n",
      "getSavedRegister",
      "unsupported restore location for register");
    fflush((FILE *)((char *)&_sF + 304));
    abort();
  }
  return 0;
}


// Address: 0x30C78 | Function: sub_30C78
__int64 __fastcall sub_30C78(__int64 a1, unsigned __int8 **a2, unsigned __int8 *a3, unsigned __int8 a4, __int64 a5)
{
  unsigned int v5; // w8
  unsigned __int8 *v6; // x19
  unsigned __int8 v7; // w20
  __int64 v8; // x21
  __int64 result; // x0
  unsigned int v10; // w8
  __int64 v11; // x8
  unsigned __int64 v12; // x10
  unsigned __int8 *v13; // x9
  unsigned __int8 *v14; // x11
  unsigned int v15; // w12
  unsigned int v16; // t1
  __int64 v18; // x10

  v5 = a4 & 0xF;
  v6 = *a2;
  if ( v5 <= 3 )
  {
    if ( (a4 & 0xFu) > 1 )
    {
      if ( v5 == 2 )
      {
        result = *(unsigned __int16 *)v6;
        *a2 = v6 + 2;
        v10 = (a4 >> 4) & 7;
        if ( v10 > 1 )
          goto LABEL_28;
      }
      else
      {
        if ( v5 != 3 )
          goto LABEL_52;
        result = *(unsigned int *)v6;
        *a2 = v6 + 4;
        v10 = (a4 >> 4) & 7;
        if ( v10 > 1 )
          goto LABEL_28;
      }
      goto LABEL_39;
    }
    if ( (a4 & 0xF) != 0 )
    {
      if ( v5 != 1 )
        goto LABEL_52;
      v7 = a4;
      v8 = a5;
      result = sub_31004(a2, a3);
      a5 = v8;
      a4 = v7;
      v10 = (v7 >> 4) & 7;
      if ( v10 > 1 )
        goto LABEL_28;
      goto LABEL_39;
    }
    goto LABEL_32;
  }
  if ( (a4 & 0xFu) <= 9 )
  {
    if ( v5 != 4 )
    {
      if ( v5 != 9 )
        goto LABEL_52;
      v11 = 0;
      v12 = -7;
      v13 = *a2;
      v14 = *a2;
      do
      {
        if ( v14 == a3 )
        {
          fprintf((FILE *)((char *)&_sF + 304), "libunwind: %s - %s\n", "getSLEB128", "truncated sleb128 expression");
          fflush((FILE *)((char *)&_sF + 304));
          abort();
        }
        v16 = *v14++;
        v15 = v16;
        v12 += 7LL;
        ++v13;
        v11 |= (unsigned __int64)(v16 & 0x7F) << v12;
      }
      while ( (v16 & 0x80) != 0 );
      *a2 = v13;
      if ( v12 < 0x39 && v15 > 0x3F )
        v18 = -1LL << ((unsigned __int8)v12 + 7);
      else
        v18 = 0;
      result = v11 | v18;
      v10 = (a4 >> 4) & 7;
      if ( v10 > 1 )
        goto LABEL_28;
      goto LABEL_39;
    }
    goto LABEL_32;
  }
  if ( v5 == 10 )
  {
    result = *(__int16 *)v6;
    *a2 = v6 + 2;
    v10 = (a4 >> 4) & 7;
    if ( v10 > 1 )
      goto LABEL_28;
    goto LABEL_39;
  }
  if ( v5 != 11 )
  {
    if ( v5 != 12 )
    {
LABEL_52:
      fprintf((FILE *)((char *)&_sF + 304), "libunwind: %s - %s\n", "getEncodedP", "unknown pointer encoding");
      fflush((FILE *)((char *)&_sF + 304));
      abort();
    }
LABEL_32:
    result = *(_QWORD *)v6;
    *a2 = v6 + 8;
    v10 = (a4 >> 4) & 7;
    if ( v10 > 1 )
      goto LABEL_28;
    goto LABEL_39;
  }
  result = *(int *)v6;
  *a2 = v6 + 4;
  v10 = (a4 >> 4) & 7;
  if ( v10 > 1 )
  {
LABEL_28:
    if ( (int)v10 > 3 )
    {
      if ( v10 != 4 )
      {
        if ( v10 == 5 )
        {
          fprintf(
            (FILE *)((char *)&_sF + 304),
            "libunwind: %s - %s\n",
            "getEncodedP",
            "DW_EH_PE_aligned pointer encoding not supported");
          fflush((FILE *)((char *)&_sF + 304));
          abort();
        }
        fprintf((FILE *)((char *)&_sF + 304), "libunwind: %s - %s\n", "getEncodedP", "unknown pointer encoding");
        fflush((FILE *)((char *)&_sF + 304));
        abort();
      }
      fprintf(
        (FILE *)((char *)&_sF + 304),
        "libunwind: %s - %s\n",
        "getEncodedP",
        "DW_EH_PE_funcrel pointer encoding not supported");
      fflush((FILE *)((char *)&_sF + 304));
      abort();
    }
    if ( v10 != 3 )
    {
      fprintf(
        (FILE *)((char *)&_sF + 304),
        "libunwind: %s - %s\n",
        "getEncodedP",
        "DW_EH_PE_textrel pointer encoding not supported");
      fflush((FILE *)((char *)&_sF + 304));
      abort();
    }
    if ( a5 == 0 )
    {
      fprintf(
        (FILE *)((char *)&_sF + 304),
        "libunwind: %s - %s\n",
        "getEncodedP",
        "DW_EH_PE_datarel is invalid with a datarelBase of 0");
      fflush((FILE *)((char *)&_sF + 304));
      abort();
    }
    result += a5;
    goto LABEL_41;
  }
LABEL_39:
  if ( v10 != 0 )
    result += (__int64)v6;
LABEL_41:
  if ( (a4 & 0x80) != 0 )
    return *(_QWORD *)result;
  return result;
}


// Address: 0x31004 | Function: sub_31004
__int64 __fastcall sub_31004(unsigned __int8 **a1, unsigned __int8 *a2)
{
  unsigned __int8 *v2; // x9
  unsigned __int8 *v4; // x10
  __int64 result; // x0
  int v6; // w11
  int v7; // w11
  int v8; // w11
  int v9; // w11
  int v10; // w11
  int v11; // w11
  int v12; // w11
  int v13; // w11
  __int64 v14; // x11
  unsigned __int8 *v15; // x10

  v2 = *a1;
  if ( *a1 == a2 )
    goto LABEL_25;
  v4 = v2 + 1;
  result = *v2 & 0x7F;
  if ( (*v2 & 0x80) == 0 )
  {
LABEL_3:
    *a1 = v4;
    return result;
  }
  if ( v4 == a2 )
    goto LABEL_25;
  v6 = (char)v2[1];
  result |= (unsigned __int64)(v6 & 0x7F) << 7;
  v4 = v2 + 2;
  if ( (v6 & 0x80000000) == 0 )
    goto LABEL_3;
  if ( v4 == a2 )
    goto LABEL_25;
  v7 = (char)v2[2];
  result |= (unsigned __int64)(v7 & 0x7F) << 14;
  v4 = v2 + 3;
  if ( (v7 & 0x80000000) == 0 )
    goto LABEL_3;
  if ( v4 == a2 )
    goto LABEL_25;
  v8 = (char)v2[3];
  result |= (unsigned __int64)(v8 & 0x7F) << 21;
  v4 = v2 + 4;
  if ( (v8 & 0x80000000) == 0 )
    goto LABEL_3;
  if ( v4 == a2 )
    goto LABEL_25;
  v9 = (char)v2[4];
  result |= (unsigned __int64)(v9 & 0x7F) << 28;
  v4 = v2 + 5;
  if ( (v9 & 0x80000000) == 0 )
    goto LABEL_3;
  if ( v4 == a2 )
    goto LABEL_25;
  v10 = (char)v2[5];
  result |= (unsigned __int64)(v10 & 0x7F) << 35;
  v4 = v2 + 6;
  if ( (v10 & 0x80000000) == 0 )
    goto LABEL_3;
  if ( v4 == a2 )
    goto LABEL_25;
  v11 = (char)v2[6];
  result |= (unsigned __int64)(v11 & 0x7F) << 42;
  v4 = v2 + 7;
  if ( (v11 & 0x80000000) == 0 )
    goto LABEL_3;
  if ( v4 == a2 )
    goto LABEL_25;
  v12 = (char)v2[7];
  result |= (unsigned __int64)(v12 & 0x7F) << 49;
  v4 = v2 + 8;
  if ( (v12 & 0x80000000) == 0 )
    goto LABEL_3;
  if ( v4 == a2 )
    goto LABEL_25;
  v13 = (char)v2[8];
  result |= (unsigned __int64)(v13 & 0x7F) << 56;
  v4 = v2 + 9;
  if ( (v13 & 0x80000000) == 0 )
    goto LABEL_3;
  if ( v4 == a2 )
  {
LABEL_25:
    fprintf((FILE *)((char *)&_sF + 304), "libunwind: %s - %s\n", "getULEB128", "truncated uleb128 expression");
    fflush((FILE *)((char *)&_sF + 304));
    abort();
  }
  v14 = *v4;
  if ( (v14 & 0x7E) != 0 )
  {
LABEL_26:
    fprintf((FILE *)((char *)&_sF + 304), "libunwind: %s - %s\n", "getULEB128", "malformed uleb128 expression");
    fflush((FILE *)((char *)&_sF + 304));
    abort();
  }
  v15 = v2 + 10;
  if ( (v14 & 0x80) != 0 )
  {
    if ( v15 == a2 )
      goto LABEL_25;
    goto LABEL_26;
  }
  *a1 = v15;
  return result | (v14 << 63);
}


// Address: 0x311CC | Function: sub_311CC
_QWORD *__fastcall sub_311CC(unsigned __int8 *a1, __int64 a2, __int64 *a3, _QWORD *a4)
{
  __int64 v6; // x0
  unsigned __int8 *v7; // x10
  unsigned __int8 *v8; // x20
  __int64 *v9; // x27
  __int64 v10; // x8
  unsigned __int8 *v11; // x8
  int v12; // w9
  __int64 v13; // x10
  unsigned int v14; // w11
  unsigned __int64 v15; // x12
  unsigned __int8 *v16; // x13
  unsigned int v17; // w14
  unsigned int v18; // t1
  __int64 v20; // x12
  __int64 *v21; // x8
  __int64 *v22; // x8
  unsigned __int8 *v23; // x9
  int v24; // w0
  unsigned __int8 *v25; // x10
  __int64 v26; // x8
  unsigned __int64 v27; // x9
  unsigned __int8 *v28; // x11
  unsigned int v29; // w12
  unsigned int v30; // t1
  __int64 v32; // x9
  __int64 *v33; // x10
  __int64 *v34; // x8
  __int64 v35; // x9
  _QWORD *v36; // t1
  __int64 v37; // x8
  __int64 v38; // x9
  unsigned __int64 v39; // x10
  unsigned __int8 *v40; // x11
  unsigned int v41; // w12
  unsigned int v42; // t1
  __int64 v44; // x10
  __int64 v45; // x8
  __int64 *v46; // x8
  _QWORD *v47; // x8
  unsigned int v48; // w9
  int v49; // w0
  _QWORD *v51; // [xsp+10h] [xbp-320h] BYREF
  unsigned __int8 *v52; // [xsp+328h] [xbp-8h] BYREF

  v52 = a1;
  v6 = sub_31004(&v52, a1 + 20);
  v7 = v52;
  v51 = a4;
  v8 = &v52[v6];
  if ( v7 < &v7[v6] )
  {
    v9 = (__int64 *)&v51;
    while ( 2 )
    {
      v11 = v7 + 1;
      v52 = v7 + 1;
      v12 = *v7;
      switch ( *v7 )
      {
        case 3u:
        case 0xEu:
        case 0xFu:
          v10 = *(_QWORD *)(v7 + 1);
          v23 = v7 + 9;
          goto LABEL_87;
        case 6u:
          v46 = (__int64 *)*v9;
          goto LABEL_81;
        case 8u:
          v10 = v7[1];
          goto LABEL_77;
        case 9u:
          v10 = (char)v7[1];
LABEL_77:
          v23 = v7 + 2;
          goto LABEL_87;
        case 0xAu:
          v10 = *(unsigned __int16 *)(v7 + 1);
          v23 = v7 + 3;
          goto LABEL_87;
        case 0xBu:
          v10 = *(__int16 *)(v7 + 1);
          v23 = v7 + 3;
          goto LABEL_87;
        case 0xCu:
          v10 = *(unsigned int *)(v7 + 1);
          v23 = v7 + 5;
          goto LABEL_87;
        case 0xDu:
          v10 = *(int *)(v7 + 1);
          v23 = v7 + 5;
          goto LABEL_87;
        case 0x10u:
          v9[1] = sub_31004(&v52, v8);
          ++v9;
          goto LABEL_5;
        case 0x11u:
          v38 = 0;
          v39 = -7;
          v40 = v11;
          do
          {
            if ( v40 == v8 )
            {
              fprintf(
                (FILE *)((char *)&_sF + 304),
                "libunwind: %s - %s\n",
                "getSLEB128",
                "truncated sleb128 expression");
              fflush((FILE *)((char *)&_sF + 304));
              abort();
            }
            v42 = *v40++;
            v41 = v42;
            v39 += 7LL;
            ++v11;
            v38 |= (unsigned __int64)(v42 & 0x7F) << v39;
          }
          while ( (v42 & 0x80) != 0 );
          v52 = v11;
          if ( v39 < 0x39 && v41 > 0x3F )
            v44 = -1LL << ((unsigned __int8)v39 + 7);
          else
            v44 = 0;
          v9[1] = v38 | v44;
          ++v9;
          goto LABEL_5;
        case 0x12u:
          v10 = *v9;
          goto LABEL_4;
        case 0x13u:
          --v9;
          goto LABEL_5;
        case 0x14u:
          v10 = *(v9 - 1);
          goto LABEL_4;
        case 0x15u:
          v23 = v7 + 2;
          v10 = v9[-v7[1]];
LABEL_87:
          v52 = v23;
          goto LABEL_4;
        case 0x16u:
          *(int8x16_t *)(v9 - 1) = vextq_s8(*(int8x16_t *)(v9 - 1), *(int8x16_t *)(v9 - 1), 8u);
          goto LABEL_5;
        case 0x17u:
          v47 = (_QWORD *)*v9;
          *(_OWORD *)(v9 - 1) = *((_OWORD *)v9 - 1);
          *(v9 - 2) = (__int64)v47;
          goto LABEL_5;
        case 0x18u:
          *(v9 - 1) = *(_QWORD *)*v9;
          --v9;
          goto LABEL_5;
        case 0x19u:
          v45 = *v9;
          if ( *v9 < 0 )
            goto LABEL_103;
          goto LABEL_5;
        case 0x1Au:
          v34 = v9 - 1;
          v35 = *(v9 - 1) & *v9;
          goto LABEL_105;
        case 0x1Bu:
          v34 = v9 - 1;
          v35 = *(v9 - 1) / *v9;
          goto LABEL_105;
        case 0x1Cu:
          v34 = v9 - 1;
          v35 = *(v9 - 1) - *v9;
          goto LABEL_105;
        case 0x1Du:
          v34 = v9 - 1;
          v35 = *(v9 - 1) % *v9;
          goto LABEL_105;
        case 0x1Eu:
          v34 = v9 - 1;
          v35 = *(v9 - 1) * *v9;
          goto LABEL_105;
        case 0x1Fu:
          v45 = *v9;
LABEL_103:
          *v9 = -v45;
          goto LABEL_5;
        case 0x20u:
          *v9 = ~*v9;
          goto LABEL_5;
        case 0x21u:
          v34 = v9 - 1;
          v35 = *(v9 - 1) | *v9;
          goto LABEL_105;
        case 0x22u:
          v34 = v9 - 1;
          v35 = *(v9 - 1) + *v9;
          goto LABEL_105;
        case 0x23u:
          *v9 += sub_31004(&v52, v8);
          goto LABEL_5;
        case 0x24u:
          v34 = v9 - 1;
          v35 = *(v9 - 1) << *v9;
          goto LABEL_105;
        case 0x25u:
          v34 = v9 - 1;
          v35 = (unsigned __int64)*(v9 - 1) >> *v9;
          goto LABEL_105;
        case 0x26u:
          v34 = v9 - 1;
          v35 = *(v9 - 1) >> *v9;
          goto LABEL_105;
        case 0x27u:
          v34 = v9 - 1;
          v35 = *(v9 - 1) ^ *v9;
          goto LABEL_105;
        case 0x28u:
          v36 = (_QWORD *)*v9--;
          v37 = *(__int16 *)(v7 + 1);
          v52 = v7 + 3;
          if ( v36 != nullptr )
            v52 = &v7[v37 + 3];
          goto LABEL_5;
        case 0x29u:
          v34 = v9 - 1;
          v35 = *(v9 - 1) == *v9;
          goto LABEL_105;
        case 0x2Au:
          v34 = v9 - 1;
          v35 = *(v9 - 1) >= (unsigned __int64)*v9;
          goto LABEL_105;
        case 0x2Bu:
          v34 = v9 - 1;
          v35 = *(v9 - 1) > (unsigned __int64)*v9;
          goto LABEL_105;
        case 0x2Cu:
          v34 = v9 - 1;
          v35 = *(v9 - 1) <= (unsigned __int64)*v9;
          goto LABEL_105;
        case 0x2Du:
          v34 = v9 - 1;
          v35 = *(v9 - 1) < (unsigned __int64)*v9;
          goto LABEL_105;
        case 0x2Eu:
          v34 = v9 - 1;
          v35 = *(v9 - 1) != *v9;
LABEL_105:
          *v34 = v35;
          v9 = v34;
          goto LABEL_5;
        case 0x2Fu:
          v52 = &v7[*(__int16 *)(v7 + 1) + 3];
          goto LABEL_5;
        case 0x30u:
        case 0x31u:
        case 0x32u:
        case 0x33u:
        case 0x34u:
        case 0x35u:
        case 0x36u:
        case 0x37u:
        case 0x38u:
        case 0x39u:
        case 0x3Au:
        case 0x3Bu:
        case 0x3Cu:
        case 0x3Du:
        case 0x3Eu:
        case 0x3Fu:
        case 0x40u:
        case 0x41u:
        case 0x42u:
        case 0x43u:
        case 0x44u:
        case 0x45u:
        case 0x46u:
        case 0x47u:
        case 0x48u:
        case 0x49u:
        case 0x4Au:
        case 0x4Bu:
        case 0x4Cu:
        case 0x4Du:
        case 0x4Eu:
        case 0x4Fu:
          v10 = (unsigned int)(v12 - 48);
          goto LABEL_4;
        case 0x50u:
        case 0x51u:
        case 0x52u:
        case 0x53u:
        case 0x54u:
        case 0x55u:
        case 0x56u:
        case 0x57u:
        case 0x58u:
        case 0x59u:
        case 0x5Au:
        case 0x5Bu:
        case 0x5Cu:
        case 0x5Du:
        case 0x5Eu:
        case 0x5Fu:
        case 0x60u:
        case 0x61u:
        case 0x62u:
        case 0x63u:
        case 0x64u:
        case 0x65u:
        case 0x66u:
        case 0x67u:
        case 0x68u:
        case 0x69u:
        case 0x6Au:
        case 0x6Bu:
        case 0x6Cu:
        case 0x6Du:
        case 0x6Eu:
        case 0x6Fu:
          v22 = a3 + 31;
          if ( v12 != 111 )
          {
            v22 = a3 + 30;
            if ( v12 != 110 )
            {
              v22 = a3 + 29;
              if ( v12 != 109 )
                v22 = &a3[v12 - 80];
            }
          }
          goto LABEL_3;
        case 0x70u:
        case 0x71u:
        case 0x72u:
        case 0x73u:
        case 0x74u:
        case 0x75u:
        case 0x76u:
        case 0x77u:
        case 0x78u:
        case 0x79u:
        case 0x7Au:
        case 0x7Bu:
        case 0x7Cu:
        case 0x7Du:
        case 0x7Eu:
        case 0x7Fu:
        case 0x80u:
        case 0x81u:
        case 0x82u:
        case 0x83u:
        case 0x84u:
        case 0x85u:
        case 0x86u:
        case 0x87u:
        case 0x88u:
        case 0x89u:
        case 0x8Au:
        case 0x8Bu:
        case 0x8Cu:
        case 0x8Du:
        case 0x8Eu:
        case 0x8Fu:
          v13 = 0;
          v14 = v12 - 112;
          v15 = -7;
          v16 = v11;
          do
          {
            if ( v16 == v8 )
            {
              fprintf(
                (FILE *)((char *)&_sF + 304),
                "libunwind: %s - %s\n",
                "getSLEB128",
                "truncated sleb128 expression");
              fflush((FILE *)((char *)&_sF + 304));
              abort();
            }
            v18 = *v16++;
            v17 = v18;
            v15 += 7LL;
            ++v11;
            v13 |= (unsigned __int64)(v18 & 0x7F) << v15;
          }
          while ( (v18 & 0x80) != 0 );
          v52 = v11;
          if ( v15 < 0x39 && v17 > 0x3F )
            v20 = -1LL << ((unsigned __int8)v15 + 7);
          else
            v20 = 0;
          if ( v12 <= 141 )
          {
            v21 = a3 + 31;
            if ( v12 == 110 )
              goto LABEL_33;
            v21 = a3 + 32;
            if ( v12 == 111 )
              goto LABEL_33;
            v21 = a3 + 29;
            if ( v12 == 141 )
              goto LABEL_33;
          }
          else
          {
            if ( v12 <= 143 )
            {
              v21 = a3 + 30;
              if ( v12 != 142 )
                v21 = a3 + 31;
              goto LABEL_33;
            }
            v21 = a3 + 32;
            if ( v12 == 144 )
              goto LABEL_33;
            v21 = a3 + 33;
            if ( v12 == 146 )
              goto LABEL_33;
          }
          if ( v14 > 0x1C )
          {
            fprintf((FILE *)((char *)&_sF + 304), "libunwind: %s - %s\n", "getRegister", "unsupported arm64 register");
            fflush((FILE *)((char *)&_sF + 304));
            abort();
          }
          v21 = &a3[v14];
LABEL_33:
          v10 = *v21 + (v13 | v20);
          goto LABEL_4;
        case 0x90u:
          v49 = sub_31004(&v52, v8);
          if ( v49 <= 29 )
          {
            v22 = a3 + 31;
            if ( v49 == -2 )
              goto LABEL_3;
            v22 = a3 + 32;
            if ( v49 == -1 )
              goto LABEL_3;
            v22 = a3 + 29;
            if ( v49 == 29 )
              goto LABEL_3;
          }
          else
          {
            if ( v49 <= 31 )
            {
              v22 = a3 + 30;
              if ( v49 != 30 )
                v22 = a3 + 31;
              goto LABEL_3;
            }
            v22 = a3 + 32;
            if ( v49 == 32 )
              goto LABEL_3;
            v22 = a3 + 33;
            if ( v49 == 34 )
              goto LABEL_3;
          }
          if ( (unsigned int)v49 > 0x1C )
          {
            fprintf((FILE *)((char *)&_sF + 304), "libunwind: %s - %s\n", "getRegister", "unsupported arm64 register");
            fflush((FILE *)((char *)&_sF + 304));
            abort();
          }
          v22 = &a3[v49 & 0x1F];
LABEL_3:
          v10 = *v22;
          goto LABEL_4;
        case 0x91u:
          fprintf(
            (FILE *)((char *)&_sF + 304),
            "libunwind: %s - %s\n",
            "evaluateExpression",
            "DW_OP_fbreg not implemented");
          fflush((FILE *)((char *)&_sF + 304));
          abort();
        case 0x92u:
          v24 = sub_31004(&v52, v8);
          v25 = v52;
          v26 = 0;
          v27 = -7;
          v28 = v52;
          do
          {
            if ( v28 == v8 )
            {
              fprintf(
                (FILE *)((char *)&_sF + 304),
                "libunwind: %s - %s\n",
                "getSLEB128",
                "truncated sleb128 expression");
              fflush((FILE *)((char *)&_sF + 304));
              abort();
            }
            v30 = *v28++;
            v29 = v30;
            v27 += 7LL;
            ++v25;
            v26 |= (unsigned __int64)(v30 & 0x7F) << v27;
          }
          while ( (v30 & 0x80) != 0 );
          v52 = v25;
          if ( v27 < 0x39 && v29 > 0x3F )
            v32 = -1LL << ((unsigned __int8)v27 + 7);
          else
            v32 = 0;
          if ( v24 <= 29 )
          {
            v33 = a3 + 31;
            if ( v24 == -2 )
              goto LABEL_130;
            v33 = a3 + 32;
            if ( v24 == -1 )
              goto LABEL_130;
            v33 = a3 + 29;
            if ( v24 == 29 )
              goto LABEL_130;
          }
          else
          {
            if ( v24 <= 31 )
            {
              v33 = a3 + 30;
              if ( v24 != 30 )
                v33 = a3 + 31;
              goto LABEL_130;
            }
            v33 = a3 + 32;
            if ( v24 == 32 )
              goto LABEL_130;
            v33 = a3 + 33;
            if ( v24 == 34 )
              goto LABEL_130;
          }
          if ( (unsigned int)v24 > 0x1C )
          {
            fprintf((FILE *)((char *)&_sF + 304), "libunwind: %s - %s\n", "getRegister", "unsupported arm64 register");
            fflush((FILE *)((char *)&_sF + 304));
            abort();
          }
          v33 = &a3[v24 & 0x1F];
LABEL_130:
          v10 = *v33 + (v26 | v32);
LABEL_4:
          v9[1] = v10;
          ++v9;
          goto LABEL_5;
        case 0x93u:
          fprintf(
            (FILE *)((char *)&_sF + 304),
            "libunwind: %s - %s\n",
            "evaluateExpression",
            "DW_OP_piece not implemented");
          fflush((FILE *)((char *)&_sF + 304));
          abort();
        case 0x94u:
          v52 = v7 + 2;
          v46 = (__int64 *)*v9;
          v48 = v7[1];
          if ( v48 > 3 )
          {
            if ( v48 == 4 )
            {
              *v9 = *(unsigned int *)v46;
            }
            else
            {
              if ( v48 != 8 )
              {
LABEL_142:
                fprintf(
                  (FILE *)((char *)&_sF + 304),
                  "libunwind: %s - %s\n",
                  "evaluateExpression",
                  "DW_OP_deref_size with bad size");
                fflush((FILE *)((char *)&_sF + 304));
                abort();
              }
LABEL_81:
              *v9 = *v46;
            }
          }
          else if ( v48 == 1 )
          {
            *v9 = *(unsigned __int8 *)v46;
          }
          else
          {
            if ( v48 != 2 )
              goto LABEL_142;
            *v9 = *(unsigned __int16 *)v46;
          }
LABEL_5:
          v7 = v52;
          if ( v52 < v8 )
            continue;
          a4 = (_QWORD *)*v9;
          break;
        default:
          fprintf(
            (FILE *)((char *)&_sF + 304),
            "libunwind: %s - %s\n",
            "evaluateExpression",
            "DWARF opcode not implemented");
          fflush((FILE *)((char *)&_sF + 304));
          abort();
      }
      break;
    }
  }
  return a4;
}


// Address: 0x31B90 | Function: sub_31B90
__int64 __fastcall sub_31B90(__int64 a1, unsigned __int64 a2, __int64 *a3, unsigned int a4)
{
  __int64 v8; // x2
  __int64 v9; // x23
  _QWORD *v10; // x8
  __int64 v11; // x23
  char v12; // w24
  __int64 v13; // x25
  __int64 v14; // d0
  __int64 v15; // x9
  __int64 v16; // x22
  __int64 result; // x0
  __int64 v18; // x8
  __int64 v19; // x23
  char v20; // w8
  __int64 v21; // x24
  char *v22; // x8
  void *v23; // x21
  size_t v24; // x19
  signed __int64 v25; // x28
  char *v26; // x20
  __int64 v27; // [xsp+0h] [xbp-6A0h]
  _BYTE v28[32]; // [xsp+18h] [xbp-688h] BYREF
  __int64 v29; // [xsp+38h] [xbp-668h]
  __int64 v30[4]; // [xsp+50h] [xbp-650h] BYREF
  __int128 v31; // [xsp+70h] [xbp-630h]
  char s[16]; // [xsp+80h] [xbp-620h] BYREF
  unsigned int v33; // [xsp+90h] [xbp-610h]

  if ( a4 == 0 || (sub_320B0(*(_QWORD *)(a1 + 8), a2, a3[2], a3[3], a3[2] + a4, v30, v28) & 1) == 0 )
  {
    v8 = a3[4];
    if ( v8 == 0 || (sub_32278(*(_QWORD *)(a1 + 8), a2, v8, *((unsigned int *)a3 + 10), v30, v28) & 1) == 0 )
    {
      v9 = *a3;
      pthread_rwlock_rdlock(&stru_3DDD4);
      v10 = off_3DB28;
      if ( off_3DB28 >= off_3DB30 )
      {
LABEL_19:
        pthread_rwlock_unlock(&stru_3DDD4);
      }
      else
      {
        if ( v9 == -1 )
        {
          while ( v10[1] > a2 || a2 >= v10[2] )
          {
            v10 += 4;
            if ( v10 >= (_QWORD *)off_3DB30 )
              goto LABEL_19;
          }
        }
        else
        {
          while ( v9 != *v10 || v10[1] > a2 || a2 >= v10[2] )
          {
            v10 += 4;
            if ( v10 >= (_QWORD *)off_3DB30 )
              goto LABEL_19;
          }
        }
        v11 = v10[3];
        pthread_rwlock_unlock(&stru_3DDD4);
        if ( v11 != 0 && (sub_320B0(*(_QWORD *)(a1 + 8), a2, a3[2], a3[3], v11, v30, v28) & 1) != 0 )
        {
          v12 = 0;
          goto LABEL_22;
        }
      }
      if ( (sub_320B0(*(_QWORD *)(a1 + 8), a2, a3[2], a3[3], 0, v30, v28) & 1) == 0 )
        return 0;
    }
  }
  v12 = 1;
LABEL_22:
  v13 = *a3;
  memset(s, 0, 0x618u);
  if ( (sub_2FEA0(*(_QWORD *)(a1 + 8), v30, (__int64)v28, a2, 4, s) & 1) == 0 )
    return 0;
  v14 = v31;
  v15 = v29;
  v16 = v30[3];
  result = 1;
  *(_OWORD *)(a1 + 552) = v31;
  v18 = v33;
  *(_QWORD *)(a1 + 568) = v15;
  *(_QWORD *)(a1 + 576) = v18;
  *(_DWORD *)(a1 + 592) = 50331648;
  v19 = v30[0];
  LODWORD(v18) = v30[1];
  *(_QWORD *)(a1 + 544) = v16;
  *(_QWORD *)(a1 + 584) = 0;
  *(_DWORD *)(a1 + 596) = v18;
  if ( a4 != 0 )
    v20 = 1;
  else
    v20 = v12 ^ 1;
  *(_QWORD *)(a1 + 600) = v19;
  *(_QWORD *)(a1 + 608) = v13;
  if ( (v20 & 1) == 0 && a3[4] == 0 )
  {
    v21 = *a3;
    v27 = v14;
    pthread_rwlock_wrlock(&stru_3DDD4);
    v22 = (char *)off_3DB30;
    if ( off_3DB30 >= off_3DB38 )
    {
      v23 = off_3DB28;
      v24 = off_3DB38 - off_3DB28;
      v25 = (off_3DB38 - off_3DB28) >> 3;
      v26 = (char *)malloc(4 * (off_3DB38 - off_3DB28));
      memcpy(v26, v23, v24);
      if ( v23 != &unk_3DE10 )
        free(v23);
      v22 = &v26[v24];
      off_3DB28 = v26;
      off_3DB38 = &v26[32 * v25];
    }
    *(_QWORD *)v22 = v21;
    *((_QWORD *)v22 + 1) = v16;
    *((_QWORD *)v22 + 3) = v19;
    *((_QWORD *)v22 + 2) = v27;
    off_3DB30 = v22 + 32;
    pthread_rwlock_unlock(&stru_3DDD4);
    return 1;
  }
  return result;
}


// Address: 0x31E64 | Function: sub_31E64
__int64 __fastcall sub_31E64(unsigned __int64 *a1, __int64 a2, __int64 *a3)
{
  int v3; // w21
  unsigned __int64 v4; // x8
  unsigned __int64 v5; // x22
  unsigned __int64 v9; // x9
  __int64 v10; // x10
  unsigned __int64 v11; // x11
  unsigned __int64 v12; // x12
  unsigned __int64 *v13; // x8
  unsigned int v14; // w23
  __int64 v15; // x8
  __int64 v16; // x9
  __int64 v17; // x0
  __int64 v18; // x10
  __int64 v19; // x8
  __int64 v20; // x9
  _QWORD v21[4]; // [xsp+0h] [xbp-20h] BYREF

  v3 = *((unsigned __int16 *)a1 + 12);
  if ( *((_WORD *)a1 + 12) == 0 )
    return 0;
  v4 = a3[2];
  v5 = *a1;
  if ( v4 < *a1 )
    return 0;
  v9 = a1[2];
  v10 = *((unsigned __int16 *)a1 + 12);
  while ( 1 )
  {
    if ( *(_DWORD *)v9 == 1 )
    {
      v11 = *(_QWORD *)(v9 + 16) + v5;
      if ( v4 >= v11 )
      {
        v12 = *(_QWORD *)(v9 + 40);
        if ( v4 < v12 + v11 )
          break;
      }
    }
    --v10;
    v9 += 56LL;
    if ( v10 == 0 )
      return 0;
  }
  v13 = (unsigned __int64 *)a3[1];
  v14 = v3 - 1;
  *v13 = v11;
  v13[1] = v12;
  while ( 1 )
  {
    v15 = a1[2] + 56LL * v14;
    if ( *(_DWORD *)v15 == 1685382480 )
    {
      v16 = *(_QWORD *)(v15 + 16);
      v17 = *a3;
      v18 = a3[1];
      v19 = *(_QWORD *)(v15 + 40);
      *(_QWORD *)(v18 + 32) = v16 + v5;
      *(_QWORD *)(v18 + 40) = v19;
      if ( (sub_31F90(v17, v16 + v5, v19 + v16 + v5, v21) & 1) != 0 )
        break;
    }
    --v3;
    --v14;
    if ( (_WORD)v3 == 0 )
      return 0;
  }
  v20 = a3[1];
  *(_QWORD *)(v20 + 16) = v21[0];
  *(_QWORD *)(v20 + 24) = -1;
  return 1;
}


// Address: 0x31F90 | Function: sub_31F90
__int64 __fastcall sub_31F90(__int64 a1, unsigned __int8 *a2, unsigned __int8 *a3, __int64 a4)
{
  int v6; // w21
  unsigned __int8 v7; // w3
  __int64 v10; // x0
  unsigned __int8 *v12; // x8
  unsigned __int8 *v13; // [xsp+18h] [xbp+18h] BYREF

  if ( (unsigned __int64)(a3 - a2) <= 3 )
  {
    if ( a3 == a2 )
      return 0;
    fprintf(
      (FILE *)((char *)&_sF + 304),
      "libunwind: unsupported .eh_frame_hdr at %lx: need at least 4 bytes of data but only got %zd\n",
      a2,
      a3 - a2);
LABEL_8:
    fflush((FILE *)((char *)&_sF + 304));
    return 0;
  }
  if ( *a2 != 1 )
  {
    fprintf((FILE *)((char *)&_sF + 304), "libunwind: unsupported .eh_frame_hdr version: %u at %lx\n", *a2, a2);
    goto LABEL_8;
  }
  v6 = a2[2];
  v7 = a2[1];
  v13 = a2 + 4;
  *(_BYTE *)(a4 + 24) = a2[3];
  *(_QWORD *)a4 = sub_30C78(a1, &v13, a3, v7, (__int64)a2);
  if ( v6 == 255 )
    v10 = 0;
  else
    v10 = sub_30C78(a1, &v13, a3, v6, (__int64)a2);
  v12 = v13;
  *(_QWORD *)(a4 + 8) = v10;
  *(_QWORD *)(a4 + 16) = v12;
  return 1;
}


// Address: 0x320B0 | Function: sub_320B0
__int64 __fastcall sub_320B0(
        __int64 a1,
        unsigned __int64 a2,
        unsigned __int8 *a3,
        __int64 a4,
        unsigned __int8 *a5,
        _QWORD *a6,
        _BYTE *a7)
{
  unsigned __int8 *v7; // x22
  unsigned __int64 v8; // x27
  unsigned __int8 *v14; // x26
  unsigned __int8 *v15; // x8
  __int64 v16; // x9
  __int64 v17; // x10
  unsigned int *v18; // x1
  unsigned __int8 v19; // w3
  unsigned __int64 v20; // x25
  __int64 v21; // x0
  unsigned __int64 v22; // x28
  char v23; // w8
  __int64 v24; // x0
  int v25; // w8
  unsigned __int8 *v26; // x24
  unsigned __int8 *v27; // x23
  unsigned __int8 v28; // w3
  unsigned __int8 *i; // [xsp+8h] [xbp-8h] BYREF

  if ( a5 != nullptr )
    v7 = a5;
  else
    v7 = a3;
  if ( a4 == -1 )
    v8 = -1;
  else
    v8 = (unsigned __int64)&a3[a4];
  for ( i = v7; (unsigned __int64)v7 < v8; i = v7 )
  {
    v14 = v7;
    v15 = v7 + 4;
    v16 = *(unsigned int *)v7;
    i = v7 + 4;
    if ( (_DWORD)v16 == -1 )
    {
      v16 = *(_QWORD *)(v7 + 4);
      v15 = v7 + 12;
      i = v7 + 12;
    }
    if ( v16 == 0 )
      break;
    v17 = *(unsigned int *)v15;
    v7 = &v15[v16];
    if ( (_DWORD)v17 != 0 )
    {
      v18 = (unsigned int *)&v15[-v17];
      if ( a3 <= &v15[-v17] && (unsigned __int64)v18 < v8 && sub_2F008(a1, v18, (__int64)a7) == nullptr )
      {
        v19 = a7[24];
        i += 4;
        v20 = sub_30C78(a1, &i, v7, v19, 0);
        v21 = sub_30C78(a1, &i, v7, a7[24] & 0xF, 0);
        if ( v20 < a2 )
        {
          v22 = v21 + v20;
          if ( a2 <= v21 + v20 )
          {
            v23 = a7[49];
            a6[5] = 0;
            if ( (v23 & 1) != 0 )
            {
              v24 = sub_31004(&i, v7);
              v25 = (unsigned __int8)a7[25];
              v26 = i;
              v27 = &i[v24];
              if ( v25 != 255 && sub_30C78(a1, &i, v7, v25 & 0xF, 0) != 0 )
              {
                v28 = a7[25];
                i = v26;
                a6[5] = sub_30C78(a1, &i, v7, v28, 0);
              }
            }
            else
            {
              v27 = i;
            }
            a6[2] = v27;
            a6[3] = v20;
            *a6 = v14;
            a6[1] = v7 - v14;
            a6[4] = v22;
            return 1;
          }
        }
      }
    }
  }
  return 0;
}


// Address: 0x32278 | Function: sub_32278
bool __fastcall sub_32278(__int64 a1, unsigned __int64 a2, unsigned __int8 *a3, int a4, _QWORD *a5, __int64 a6)
{
  unsigned __int8 *v6; // x24
  __int64 v12; // x0
  unsigned __int64 v13; // x27
  __int64 v14; // x25
  __int64 v15; // x26
  unsigned __int64 v16; // x28
  unsigned __int64 v17; // x0
  unsigned __int8 v18; // w25
  unsigned int *v19; // x0
  unsigned __int8 *v21; // [xsp+18h] [xbp-28h] BYREF
  _BYTE v22[8]; // [xsp+20h] [xbp-20h] BYREF
  unsigned __int64 v23; // [xsp+28h] [xbp-18h]
  __int64 v24; // [xsp+30h] [xbp-10h]
  unsigned __int8 v25; // [xsp+38h] [xbp-8h]

  v6 = &a3[a4];
  if ( (sub_31F90(a1, a3, v6, (__int64)v22) & 1) == 0 || v23 == 0 )
    return false;
  v12 = sub_323E0(v25);
  v13 = v23;
  v14 = v12;
  v15 = 0;
  while ( v13 > 1 )
  {
    v16 = ((v13 >> 1) + v15) * v14;
    v21 = (unsigned __int8 *)(v24 + v16);
    v17 = sub_30C78(a1, &v21, v6, v25, (__int64)a3);
    if ( v17 >= a2 )
    {
      v13 >>= 1;
    }
    else
    {
      v15 += v13 >> 1;
      v13 -= v13 >> 1;
    }
    if ( v17 == a2 )
      goto LABEL_11;
  }
  v16 = v15 * v14;
LABEL_11:
  v18 = v25;
  v21 = (unsigned __int8 *)(v24 + v16);
  sub_30C78(a1, &v21, v6, v25, (__int64)a3);
  v19 = (unsigned int *)sub_30C78(a1, &v21, v6, v18, (__int64)a3);
  return sub_2EE70(a1, v19, a5, a6, 0) == nullptr && a2 >= a5[3] && a2 < a5[4];
}


// Address: 0x323E0 | Function: sub_323E0
__int64 __fastcall sub_323E0(char a1)
{
  int v1; // w8
  __int64 result; // x0

  v1 = a1 & 0xF;
  result = 4;
  if ( v1 > 8 )
  {
    if ( v1 > 10 )
    {
      if ( v1 == 12 )
        return 16;
      if ( v1 != 11 )
        goto LABEL_14;
      return 8;
    }
    if ( v1 != 10 )
    {
LABEL_16:
      fprintf(
        (FILE *)((char *)&_sF + 304),
        "libunwind: %s - %s\n",
        "getTableEntrySize",
        "Can't binary search on variable length encoded data.");
      fflush((FILE *)((char *)&_sF + 304));
      abort();
    }
  }
  else
  {
    if ( v1 > 2 )
    {
      if ( v1 != 3 )
      {
        if ( v1 != 4 )
        {
LABEL_14:
          fprintf(
            (FILE *)((char *)&_sF + 304),
            "libunwind: %s - %s\n",
            "getTableEntrySize",
            "Unknown DWARF encoding for search table.");
          fflush((FILE *)((char *)&_sF + 304));
          abort();
        }
        return 16;
      }
      return 8;
    }
    if ( v1 != 2 )
    {
      if ( v1 != 1 )
        goto LABEL_14;
      goto LABEL_16;
    }
  }
  return result;
}


// Address: 0x324DC | Function: sub_324DC
const char *__fastcall sub_324DC(int a1)
{
  if ( (unsigned int)(a1 + 2) > 0x61 )
    return "unknown register";
  else
    return (char *)dword_BAD4 + dword_BAD4[a1 + 2];
}


// Address: 0x3250C | Function: sub_3250C
__int64 __fastcall sub_3250C(__int64 a1)
{
  __asm { HINT            #0x28 ; '(' }
  return *(_QWORD *)a1;
}


// Address: 0x325AC | Function: sub_325AC
__int64 __usercall sub_325AC@<X0>(
        __int64 a1@<X0>,
        __int64 a2@<X1>,
        __int64 a3@<X2>,
        __int64 a4@<X3>,
        __int64 a5@<X4>,
        __int64 a6@<X5>,
        __int64 a7@<X6>,
        __int64 a8@<X7>,
        __int64 a9@<X8>,
        double a10@<D0>,
        double a11@<D1>,
        double a12@<D2>,
        double a13@<D3>,
        double a14@<D4>,
        double a15@<D5>,
        double a16@<D6>,
        double a17@<D7>,
        __int64 a18)
{
  __int64 v18; // x9
  __int64 v19; // x10
  __int64 v20; // x11
  __int64 v21; // x12
  __int64 v22; // x13
  __int64 v23; // x14
  __int64 v24; // x15
  __int64 v25; // x16
  __int64 v26; // x17
  __int64 v27; // x18
  __int64 v28; // x19
  __int64 v29; // x20
  __int64 v30; // x21
  __int64 v31; // x22
  __int64 v32; // x23
  __int64 v33; // x24
  __int64 v34; // x25
  __int64 v35; // x26
  __int64 v36; // x27
  __int64 v37; // x28
  __int64 v38; // x29
  __int64 v39; // x30
  __int64 v40; // d8
  __int64 v41; // d9
  __int64 v42; // d10
  __int64 v43; // d11
  __int64 v44; // d12
  __int64 v45; // d13
  __int64 v46; // d14
  __int64 v47; // d15
  __int64 v48; // d16
  __int64 v49; // d17
  __int64 v50; // d18
  __int64 v51; // d19
  __int64 v52; // d20
  __int64 v53; // d21
  __int64 v54; // d22
  __int64 v55; // d23
  __int64 v56; // d24
  __int64 v57; // d25
  __int64 v58; // d26
  __int64 v59; // d27
  __int64 v60; // d28
  __int64 v61; // d29
  __int64 v62; // d30
  __int64 v63; // d31

  *(_QWORD *)a1 = a1;
  *(_QWORD *)(a1 + 8) = a2;
  *(_QWORD *)(a1 + 16) = a3;
  *(_QWORD *)(a1 + 24) = a4;
  *(_QWORD *)(a1 + 32) = a5;
  *(_QWORD *)(a1 + 40) = a6;
  *(_QWORD *)(a1 + 48) = a7;
  *(_QWORD *)(a1 + 56) = a8;
  *(_QWORD *)(a1 + 64) = a9;
  *(_QWORD *)(a1 + 72) = v18;
  *(_QWORD *)(a1 + 80) = v19;
  *(_QWORD *)(a1 + 88) = v20;
  *(_QWORD *)(a1 + 96) = v21;
  *(_QWORD *)(a1 + 104) = v22;
  *(_QWORD *)(a1 + 112) = v23;
  *(_QWORD *)(a1 + 120) = v24;
  *(_QWORD *)(a1 + 128) = v25;
  *(_QWORD *)(a1 + 136) = v26;
  *(_QWORD *)(a1 + 144) = v27;
  *(_QWORD *)(a1 + 152) = v28;
  *(_QWORD *)(a1 + 160) = v29;
  *(_QWORD *)(a1 + 168) = v30;
  *(_QWORD *)(a1 + 176) = v31;
  *(_QWORD *)(a1 + 184) = v32;
  *(_QWORD *)(a1 + 192) = v33;
  *(_QWORD *)(a1 + 200) = v34;
  *(_QWORD *)(a1 + 208) = v35;
  *(_QWORD *)(a1 + 216) = v36;
  *(_QWORD *)(a1 + 224) = v37;
  *(_QWORD *)(a1 + 232) = v38;
  *(_QWORD *)(a1 + 240) = v39;
  *(_QWORD *)(a1 + 248) = &a18;
  *(_QWORD *)(a1 + 256) = v39;
  *(double *)(a1 + 272) = a10;
  *(double *)(a1 + 280) = a11;
  *(double *)(a1 + 288) = a12;
  *(double *)(a1 + 296) = a13;
  *(double *)(a1 + 304) = a14;
  *(double *)(a1 + 312) = a15;
  *(double *)(a1 + 320) = a16;
  *(double *)(a1 + 328) = a17;
  *(_QWORD *)(a1 + 336) = v40;
  *(_QWORD *)(a1 + 344) = v41;
  *(_QWORD *)(a1 + 352) = v42;
  *(_QWORD *)(a1 + 360) = v43;
  *(_QWORD *)(a1 + 368) = v44;
  *(_QWORD *)(a1 + 376) = v45;
  *(_QWORD *)(a1 + 384) = v46;
  *(_QWORD *)(a1 + 392) = v47;
  *(_QWORD *)(a1 + 400) = v48;
  *(_QWORD *)(a1 + 408) = v49;
  *(_QWORD *)(a1 + 416) = v50;
  *(_QWORD *)(a1 + 424) = v51;
  *(_QWORD *)(a1 + 432) = v52;
  *(_QWORD *)(a1 + 440) = v53;
  *(_QWORD *)(a1 + 448) = v54;
  *(_QWORD *)(a1 + 456) = v55;
  *(_QWORD *)(a1 + 464) = v56;
  *(_QWORD *)(a1 + 472) = v57;
  *(_QWORD *)(a1 + 480) = v58;
  *(_QWORD *)(a1 + 488) = v59;
  *(_QWORD *)(a1 + 496) = v60;
  *(_QWORD *)(a1 + 504) = v61;
  *(_QWORD *)(a1 + 512) = v62;
  *(_QWORD *)(a1 + 520) = v63;
  return 0;
}


// Address: 0x32648 | Function: sub_32648
void *__fastcall sub_32648(unsigned __int64 a1)
{
  size_t v1; // x19
  void *result; // x0
  void (*v3)(void); // x0
  char *v4; // x19

  if ( a1 <= 1 )
    v1 = 1;
  else
    v1 = a1;
  while ( 1 )
  {
    result = malloc(v1);
    if ( result != nullptr )
      break;
    v3 = (void (*)(void))sub_13ED0();
    if ( v3 == nullptr )
    {
      v4 = sub_2D14C(8);
      sub_2D0C4(v4);
      sub_2D310((__int64)v4, (__int64)&`typeinfo for'std::bad_alloc, (__int64)sub_2D0BC);
    }
    v3();
  }
  return result;
}


// Address: 0x326B4 | Function: sub_326B4
void *__fastcall sub_326B4(unsigned __int64 a1)
{
  return sub_32648(a1);
}


// Address: 0x326BC | Function: sub_326BC
void *__fastcall sub_326BC(unsigned __int64 a1, unsigned __int64 a2)
{
  size_t v2; // x19
  size_t v3; // x20
  void *result; // x0
  void (*v5)(void); // x0
  char *v6; // x19
  void *memptr; // [xsp+8h] [xbp-8h] BYREF

  if ( a1 <= 1 )
    v2 = 1;
  else
    v2 = a1;
  if ( a2 <= 8 )
    v3 = 8;
  else
    v3 = a2;
  while ( 1 )
  {
    memptr = nullptr;
    posix_memalign(&memptr, v3, v2);
    result = memptr;
    if ( memptr != nullptr )
      break;
    v5 = (void (*)(void))sub_13ED0();
    if ( v5 == nullptr )
    {
      v6 = sub_2D14C(8);
      sub_2D0C4(v6);
      sub_2D310((__int64)v6, (__int64)&`typeinfo for'std::bad_alloc, (__int64)sub_2D0BC);
    }
    v5();
  }
  return result;
}


// Address: 0x3274C | Function: sub_3274C
void *__fastcall sub_3274C(unsigned __int64 a1, unsigned __int64 a2)
{
  return sub_326BC(a1, a2);
}


// Address: 0x32760 | Function: sub_32760
void sub_32760()
{
  JUMPOUT(0);
}


// Address: 0x32780 | Function: .__cxa_finalize
// attributes: thunk
int __cxa_finalize(void *a1)
{
  return _cxa_finalize(a1);
}


// Address: 0x32790 | Function: .__cxa_atexit
// attributes: thunk
int __cxa_atexit(void (*lpfunc)(void *), void *obj, void *lpdso_handle)
{
  return _cxa_atexit(lpfunc, obj, lpdso_handle);
}


// Address: 0x327A0 | Function: .lstat
// attributes: thunk
int lstat(const char *file, struct stat *buf)
{
  return lstat(file, buf);
}


// Address: 0x327B0 | Function: .__errno
// attributes: thunk
__int64 __errno(void)
{
  return _errno();
}


// Address: 0x327C0 | Function: .opendir
// attributes: thunk
DIR *opendir(const char *name)
{
  return opendir(name);
}


// Address: 0x327D0 | Function: .readdir
// attributes: thunk
struct dirent *readdir(DIR *dirp)
{
  return readdir(dirp);
}


// Address: 0x327E0 | Function: .unlink
// attributes: thunk
int unlink(const char *name)
{
  return unlink(name);
}


// Address: 0x327F0 | Function: .closedir
// attributes: thunk
int closedir(DIR *dirp)
{
  return closedir(dirp);
}


// Address: 0x32800 | Function: .rmdir
// attributes: thunk
int rmdir(const char *path)
{
  return rmdir(path);
}


// Address: 0x32810 | Function: .__stack_chk_fail
// attributes: thunk
void __noreturn __stack_chk_fail()
{
  _stack_chk_fail();
}


// Address: 0x32820 | Function: .__vsprintf_chk
// attributes: thunk
__int64 __fastcall __vsprintf_chk()
{
  return _vsprintf_chk();
}


// Address: 0x32830 | Function: .getpwuid
// attributes: thunk
struct passwd *getpwuid(__uid_t uid)
{
  return getpwuid(uid);
}


// Address: 0x32840 | Function: .getgrgid
// attributes: thunk
struct group *getgrgid(__gid_t gid)
{
  return getgrgid(gid);
}


// Address: 0x32850 | Function: .memcpy
// attributes: thunk
void *memcpy(void *dest, const void *src, size_t n)
{
  return memcpy(dest, src, n);
}


// Address: 0x32860 | Function: .malloc
// attributes: thunk
void *malloc(size_t size)
{
  return malloc(size);
}


// Address: 0x32870 | Function: .free
// attributes: thunk
void free(void *ptr)
{
  free(ptr);
}


// Address: 0x32880 | Function: .posix_memalign
// attributes: thunk
int posix_memalign(void **memptr, size_t alignment, size_t size)
{
  return posix_memalign(memptr, alignment, size);
}


// Address: 0x32890 | Function: .fwrite
// attributes: thunk
size_t fwrite(const void *ptr, size_t size, size_t n, FILE *s)
{
  return fwrite(ptr, size, n, s);
}


// Address: 0x328A0 | Function: .vfprintf
// attributes: thunk
int vfprintf(FILE *s, const char *format, __gnuc_va_list arg)
{
  return vfprintf(s, format, arg);
}


// Address: 0x328B0 | Function: .fputc
// attributes: thunk
int fputc(int c, FILE *stream)
{
  return fputc(c, stream);
}


// Address: 0x328C0 | Function: .vasprintf
// attributes: thunk
int vasprintf(char **ptr, const char *f, __gnuc_va_list arg)
{
  return vasprintf(ptr, f, arg);
}


// Address: 0x328D0 | Function: .android_set_abort_message
// attributes: thunk
__int64 __fastcall android_set_abort_message()
{
  return android_set_abort_message();
}


// Address: 0x328E0 | Function: .openlog
// attributes: thunk
void openlog(const char *ident, int option, int facility)
{
  openlog(ident, option, facility);
}


// Address: 0x328F0 | Function: .syslog
// attributes: thunk
void syslog(int pri, const char *fmt, ...)
{
  syslog(pri, fmt);
}


// Address: 0x32900 | Function: .closelog
// attributes: thunk
void closelog(void)
{
  closelog();
}


// Address: 0x32910 | Function: .abort
// attributes: thunk
void __noreturn abort(void)
{
  abort();
}


// Address: 0x32920 | Function: .strlen
// attributes: thunk
size_t strlen(const char *s)
{
  return strlen(s);
}


// Address: 0x32930 | Function: .realloc
// attributes: thunk
void *realloc(void *ptr, size_t size)
{
  return realloc(ptr, size);
}


// Address: 0x32940 | Function: .memcmp
// attributes: thunk
int memcmp(const void *s1, const void *s2, size_t n)
{
  return memcmp(s1, s2, n);
}


// Address: 0x32950 | Function: .memmove
// attributes: thunk
void *memmove(void *dest, const void *src, size_t n)
{
  return memmove(dest, src, n);
}


// Address: 0x32960 | Function: .memchr
// attributes: thunk
void *memchr(const void *s, int c, size_t n)
{
  return memchr(s, c, n);
}


// Address: 0x32970 | Function: .snprintf
// attributes: thunk
int snprintf(char *s, size_t maxlen, const char *format, ...)
{
  return snprintf(s, maxlen, format);
}


// Address: 0x32980 | Function: .strcmp
// attributes: thunk
int strcmp(const char *s1, const char *s2)
{
  return strcmp(s1, s2);
}


// Address: 0x32990 | Function: .memset
// attributes: thunk
void *memset(void *s, int c, size_t n)
{
  return memset(s, c, n);
}


// Address: 0x329A0 | Function: .pthread_mutex_lock
// attributes: thunk
int pthread_mutex_lock(pthread_mutex_t *mutex)
{
  return pthread_mutex_lock(mutex);
}


// Address: 0x329B0 | Function: .pthread_mutex_unlock
// attributes: thunk
int pthread_mutex_unlock(pthread_mutex_t *mutex)
{
  return pthread_mutex_unlock(mutex);
}


// Address: 0x329C0 | Function: .pthread_getspecific
// attributes: thunk
void *pthread_getspecific(pthread_key_t key)
{
  return pthread_getspecific(key);
}


// Address: 0x329D0 | Function: .pthread_once
// attributes: thunk
int pthread_once(pthread_once_t *once_control, void (*init_routine)(void))
{
  return pthread_once(once_control, init_routine);
}


// Address: 0x329E0 | Function: .pthread_setspecific
// attributes: thunk
int pthread_setspecific(pthread_key_t key, const void *pointer)
{
  return pthread_setspecific(key, pointer);
}


// Address: 0x329F0 | Function: .pthread_key_delete
// attributes: thunk
int pthread_key_delete(pthread_key_t key)
{
  return pthread_key_delete(key);
}


// Address: 0x32A00 | Function: .pthread_key_create
// attributes: thunk
int pthread_key_create(pthread_key_t *key, void (*destr_function)(void *))
{
  return pthread_key_create(key, destr_function);
}


// Address: 0x32A10 | Function: .getauxval
// attributes: thunk
unsigned __int64 getauxval(unsigned __int64 type)
{
  return getauxval(type);
}


// Address: 0x32A20 | Function: .__system_property_get
// attributes: thunk
__int64 __fastcall __system_property_get()
{
  return _system_property_get();
}


// Address: 0x32A30 | Function: .strncmp
// attributes: thunk
int strncmp(const char *s1, const char *s2, size_t n)
{
  return strncmp(s1, s2, n);
}


// Address: 0x32A40 | Function: .fprintf
// attributes: thunk
int fprintf(FILE *stream, const char *format, ...)
{
  return fprintf(stream, format);
}


// Address: 0x32A50 | Function: .fflush
// attributes: thunk
int fflush(FILE *stream)
{
  return fflush(stream);
}


// Address: 0x32A60 | Function: .pthread_rwlock_wrlock
// attributes: thunk
int pthread_rwlock_wrlock(pthread_rwlock_t *rwlock)
{
  return pthread_rwlock_wrlock(rwlock);
}


// Address: 0x32A70 | Function: .pthread_rwlock_unlock
// attributes: thunk
int pthread_rwlock_unlock(pthread_rwlock_t *rwlock)
{
  return pthread_rwlock_unlock(rwlock);
}


// Address: 0x32A80 | Function: .dl_iterate_phdr
// attributes: thunk
int dl_iterate_phdr(int (*callback)(struct dl_phdr_info *, size_t, void *), void *data)
{
  return dl_iterate_phdr(callback, data);
}


// Address: 0x32A90 | Function: .pthread_rwlock_rdlock
// attributes: thunk
int pthread_rwlock_rdlock(pthread_rwlock_t *rwlock)
{
  return pthread_rwlock_rdlock(rwlock);
}


// Address: 0x32AA0 | Function: .syscall
// attributes: thunk
__int64 syscall(__int64 sysno, ...)
{
  return syscall(sysno);
}


