target triple = "x86_64-pc-linux-gnu"

declare i32 @puts(ptr noundef)
declare i64 @strlen(ptr noundef)
declare noalias noundef ptr @malloc(i64 noundef) local_unnamed_addr
declare ptr @strcpy(ptr noalias noundef returned writeonly, ptr noalias nocapture noundef readonly) local_unnamed_addr
declare noundef i32 @__isoc99_scanf(ptr nocapture noundef readonly, ...)

define noundef ptr @concat(ptr noundef readonly %a, ptr noundef readonly %b) {
	%alen = tail call i64 @strlen(ptr noundef nonnull dereferenceable(1) %a)
	%alen32 = trunc i64 %alen to i32
	%blen = tail call i64 @strlen(ptr noundef nonnull dereferenceable(1) %b)
	%blen32 = trunc i64 %blen to i32
	%ablen = add nsw i32 %blen32, %alen32
	%clen = add nsw i32 %ablen, 1
	%clen64 = sext i32 %clen to i64
	%c = tail call noalias ptr @malloc(i64 noundef %clen64)
	%ca = tail call ptr @strcpy(ptr noundef nonnull dereferenceable(1) %c, ptr noundef nonnull dereferenceable(1) %a)
	%c_offset_a = shl i64 %alen, 32
	%c_offset = ashr exact i64 %c_offset_a, 32
	%ca_ptr = getelementptr inbounds i8, ptr %c, i64 %c_offset
	%cab = tail call ptr @strcpy(ptr noundef nonnull dereferenceable(1) %ca_ptr, ptr noundef nonnull dereferenceable(1) %b)
	%c_addr = sext i32 %clen to i64
	%c_ptr = getelementptr inbounds i8, ptr %c, i64 %c_addr
	store i8 0, ptr %c_ptr, align 1, !tbaa !5
	ret ptr %c
}

@inputFormat = constant [7 x i8] c"%[^\0A]\0A\00"
define dso_local ptr @getUserInput() local_unnamed_addr {
	%userIn = tail call noalias dereferenceable_or_null(1024) ptr @malloc(i64 noundef 1024)
	call i32 (ptr, ...) @__isoc99_scanf(ptr noundef getelementptr inbounds ([7 x i8], [7 x i8]* @inputFormat, i64 0, i64 0), ptr noundef %userIn)
	ret ptr %userIn
}

define dso_local ptr @reverseString(ptr nocapture noundef %0) {
%2 = tail call i64 @strlen(ptr noundef nonnull dereferenceable(1) %0) #6
%3 = trunc i64 %2 to i32
%4 = shl i64 %2, 32
%5 = add i64 %4, 4294967296
%6 = ashr exact i64 %5, 32
%7 = tail call noalias ptr @malloc(i64 noundef %6) #7
%8 = icmp sgt i32 %3, 0
br i1 %8, label %9, label %90

9:                                                ; preds = %1
%10 = and i64 %2, 4294967295
%11 = icmp ult i64 %10, 8
br i1 %11, label %72, label %12

12:                                               ; preds = %9
%13 = add nsw i64 %10, -1
%14 = add i32 %3, -1
%15 = trunc i64 %13 to i32
%16 = sub i32 %14, %15
%17 = icmp sgt i32 %16, %14
%18 = icmp ugt i64 %13, 4294967295
%19 = or i1 %17, %18
br i1 %19, label %72, label %20

20:                                               ; preds = %12
%21 = icmp ult i64 %10, 32
br i1 %21, label %51, label %22

22:                                               ; preds = %20
%23 = and i64 %2, 31
%24 = sub nsw i64 %10, %23
br label %25

25:                                               ; preds = %25, %22
%26 = phi i64 [ 0, %22 ], [ %45, %25 ]
%27 = xor i64 %26, -1
%28 = add i64 %2, %27
%29 = shl i64 %28, 32
%30 = ashr exact i64 %29, 32
%31 = getelementptr inbounds i8, ptr %0, i64 %30
%32 = getelementptr inbounds i8, ptr %31, i64 -15
%33 = bitcast ptr %32 to <16 x i8>*
%34 = load <16 x i8>, <16 x i8>* %33, align 1, !tbaa !5
%35 = shufflevector <16 x i8> %34, <16 x i8> poison, <16 x i32> <i32 15, i32 14, i32 13, i32 12, i32 11, i32 10, i32 9, i32 8, i32 7, i32 6, i32 5, i32 4, i32 3, i32 2, i32 1, i32 0>
%36 = getelementptr inbounds i8, ptr %31, i64 -16
%37 = getelementptr inbounds i8, ptr %36, i64 -15
%38 = bitcast ptr %37 to <16 x i8>*
%39 = load <16 x i8>, <16 x i8>* %38, align 1, !tbaa !5
%40 = shufflevector <16 x i8> %39, <16 x i8> poison, <16 x i32> <i32 15, i32 14, i32 13, i32 12, i32 11, i32 10, i32 9, i32 8, i32 7, i32 6, i32 5, i32 4, i32 3, i32 2, i32 1, i32 0>
%41 = getelementptr inbounds i8, ptr %7, i64 %26
%42 = bitcast ptr %41 to <16 x i8>*
store <16 x i8> %35, <16 x i8>* %42, align 1, !tbaa !5
%43 = getelementptr inbounds i8, ptr %41, i64 16
%44 = bitcast ptr %43 to <16 x i8>*
store <16 x i8> %40, <16 x i8>* %44, align 1, !tbaa !5
%45 = add nuw i64 %26, 32
%46 = icmp eq i64 %45, %24
br i1 %46, label %47, label %25, !llvm.loop !8

47:                                               ; preds = %25
%48 = icmp eq i64 %23, 0
br i1 %48, label %90, label %49

49:                                               ; preds = %47
%50 = icmp ult i64 %23, 8
br i1 %50, label %72, label %51

51:                                               ; preds = %20, %49
%52 = phi i64 [ %24, %49 ], [ 0, %20 ]
%53 = and i64 %2, 7
%54 = sub nsw i64 %10, %53
%55 = getelementptr inbounds i8, ptr %0, i64 -7
br label %56

56:                                               ; preds = %56, %51
%57 = phi i64 [ %52, %51 ], [ %68, %56 ]
%58 = xor i64 %57, -1
%59 = add i64 %2, %58
%60 = shl i64 %59, 32
%61 = ashr exact i64 %60, 32
%62 = getelementptr inbounds i8, ptr %55, i64 %61
%63 = bitcast ptr %62 to <8 x i8>*
%64 = load <8 x i8>, <8 x i8>* %63, align 1, !tbaa !5
%65 = shufflevector <8 x i8> %64, <8 x i8> poison, <8 x i32> <i32 7, i32 6, i32 5, i32 4, i32 3, i32 2, i32 1, i32 0>
%66 = getelementptr inbounds i8, ptr %7, i64 %57
%67 = bitcast ptr %66 to <8 x i8>*
store <8 x i8> %65, <8 x i8>* %67, align 1, !tbaa !5
%68 = add nuw i64 %57, 8
%69 = icmp eq i64 %68, %54
br i1 %69, label %70, label %56, !llvm.loop !11

70:                                               ; preds = %56
%71 = icmp eq i64 %53, 0
br i1 %71, label %90, label %72

72:                                               ; preds = %12, %9, %49, %70
%73 = phi i64 [ 0, %9 ], [ 0, %12 ], [ %24, %49 ], [ %54, %70 ]
%74 = sub i64 %2, %73
%75 = add nsw i64 %73, 1
%76 = and i64 %74, 1
%77 = icmp eq i64 %76, 0
br i1 %77, label %87, label %78

78:                                               ; preds = %72
%79 = xor i64 %73, -1
%80 = add i64 %2, %79
%81 = shl i64 %80, 32
%82 = ashr exact i64 %81, 32
%83 = getelementptr inbounds i8, ptr %0, i64 %82
%84 = load i8, ptr %83, align 1, !tbaa !5
%85 = getelementptr inbounds i8, ptr %7, i64 %73
store i8 %84, ptr %85, align 1, !tbaa !5
%86 = add nuw nsw i64 %73, 1
br label %87

87:                                               ; preds = %78, %72
%88 = phi i64 [ %73, %72 ], [ %86, %78 ]
%89 = icmp eq i64 %10, %75
br i1 %89, label %90, label %93

90:                                               ; preds = %87, %93, %47, %70, %1
%91 = ashr exact i64 %4, 32
%92 = getelementptr inbounds i8, ptr %7, i64 %91
store i8 0, ptr %92, align 1, !tbaa !5
ret ptr %7

93:                                               ; preds = %87, %93
%94 = phi i64 [ %110, %93 ], [ %88, %87 ]
%95 = xor i64 %94, -1
%96 = add i64 %2, %95
%97 = shl i64 %96, 32
%98 = ashr exact i64 %97, 32
%99 = getelementptr inbounds i8, ptr %0, i64 %98
%100 = load i8, ptr %99, align 1, !tbaa !5
%101 = getelementptr inbounds i8, ptr %7, i64 %94
store i8 %100, ptr %101, align 1, !tbaa !5
%102 = add nuw nsw i64 %94, 1
%103 = sub i64 4294967294, %94
%104 = add i64 %2, %103
%105 = shl i64 %104, 32
%106 = ashr exact i64 %105, 32
%107 = getelementptr inbounds i8, ptr %0, i64 %106
%108 = load i8, ptr %107, align 1, !tbaa !5
%109 = getelementptr inbounds i8, ptr %7, i64 %102
store i8 %108, ptr %109, align 1, !tbaa !5
%110 = add nuw nsw i64 %94, 2
%111 = icmp eq i64 %110, %10
br i1 %111, label %90, label %93, !llvm.loop !13
}

define i32 @main() {
call i32 @puts(ptr @lit0)
%var0 = call ptr @reverseString(ptr @lit1)
call i32 @puts(ptr %var0)
%var1 = call ptr @getUserInput()
call i32 @puts(ptr %var1)
%var2 = call ptr @concat(ptr @lit2, ptr @lit3)
call i32 @puts(ptr %var2)
%var3 = call ptr @reverseString(ptr @lit4)
%var4 = call ptr @concat(ptr %var3, ptr @lit5)
%var5 = call ptr @getUserInput()
%var6 = call ptr @concat(ptr %var4, ptr %var5)
call i32 @puts(ptr %var6)
call i32 @puts(ptr @lit6)
ret i32 0
}

@lit0 = constant [30 x i8] c"print a single string literal\00"
@lit1 = constant [11 x i8] c"reverse me\00"
@lit2 = constant [7 x i8] c"superb\00"
@lit3 = constant [4 x i8] c"owl\00"
@lit4 = constant [17 x i8] c"gnirts a si siht\00"
@lit5 = constant [12 x i8] c" that says \00"
@lit6 = constant [13 x i8] c"escape ] [$]\00"
!0 = !{i32 1, !"wchar_size", i32 4}
!1 = !{i32 7, !"PIC Level", i32 2}
!2 = !{i32 7, !"PIE Level", i32 2}
!3 = !{i32 7, !"uwtable", i32 1}
!4 = !{!"Ubuntu clang version 14.0.0-1ubuntu1.1"}
!5 = !{!6, !6, i64 0}
!6 = !{!"omnipotent char", !7, i64 0}
!7 = !{!"Simple C/C++ TBAA"}
!8 = distinct !{!8, !9}
!9 = !{!"llvm.loop.mustprogress"}
!10 = !{!"llvm.loop.isvectorized", i32 1}
!11 = distinct !{!11, !9, !10, !12}
!12 = !{!"llvm.loop.unroll.runtime.disable"}
!13 = distinct !{!13, !9, !10}
