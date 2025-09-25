; ModuleID = 'preamble.c'
source_filename = "preamble.c"
target datalayout = "e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

declare i32 @puts(ptr noundef)

@.str = private unnamed_addr constant [2 x i8] c"1\00", align 1
@.str.1 = private unnamed_addr constant [2 x i8] c"0\00", align 1
@.str.2 = private unnamed_addr constant [7 x i8] c"%[^\0A]\0A\00", align 1

; Function Attrs: noinline nounwind optnone uwtable
define dso_local i8* @bool_to_str(i1 noundef zeroext %0) #0 {
  %2 = alloca i8, align 1
  %3 = zext i1 %0 to i8
  store i8 %3, i8* %2, align 1
  %4 = load i8, i8* %2, align 1
  %5 = trunc i8 %4 to i1
  %6 = zext i1 %5 to i64
  %7 = select i1 %5, i8* getelementptr inbounds ([2 x i8], [2 x i8]* @.str, i64 0, i64 0), i8* getelementptr inbounds ([2 x i8], [2 x i8]* @.str.1, i64 0, i64 0)
  ret i8* %7
}

; Function Attrs: noinline nounwind optnone uwtable
define dso_local i8* @getinput() #0 {
  %1 = alloca i8*, align 8
  %2 = call noalias i8* @malloc(i64 noundef 1024) #5
  store i8* %2, i8** %1, align 8
  %3 = load i8*, i8** %1, align 8
  %4 = call i32 (i8*, ...) @__isoc99_scanf(i8* noundef getelementptr inbounds ([7 x i8], [7 x i8]* @.str.2, i64 0, i64 0), i8* noundef %3)
  %5 = load i8*, i8** %1, align 8
  ret i8* %5
}

; Function Attrs: nounwind
declare noalias i8* @malloc(i64 noundef) #1

declare i32 @__isoc99_scanf(i8* noundef, ...) #2

; Function Attrs: noinline nounwind optnone uwtable
define dso_local zeroext i1 @not(i1 noundef zeroext %0) #0 {
  %2 = alloca i8, align 1
  %3 = zext i1 %0 to i8
  store i8 %3, i8* %2, align 1
  %4 = load i8, i8* %2, align 1
  %5 = trunc i8 %4 to i1
  %6 = xor i1 %5, true
  ret i1 %6
}

; Function Attrs: noinline nounwind optnone uwtable
define dso_local i8* @reverse_string(i8* noundef %0) #0 {
  %2 = alloca i8*, align 8
  %3 = alloca i32, align 4
  %4 = alloca i8*, align 8
  %5 = alloca i32, align 4
  store i8* %0, i8** %2, align 8
  %6 = load i8*, i8** %2, align 8
  %7 = call i64 @strlen(i8* noundef %6) #6
  %8 = trunc i64 %7 to i32
  store i32 %8, i32* %3, align 4
  %9 = load i32, i32* %3, align 4
  %10 = add nsw i32 %9, 1
  %11 = sext i32 %10 to i64
  %12 = call noalias i8* @malloc(i64 noundef %11) #5
  store i8* %12, i8** %4, align 8
  store i32 0, i32* %5, align 4
  br label %13

13:                                               ; preds = %30, %1
  %14 = load i32, i32* %5, align 4
  %15 = load i32, i32* %3, align 4
  %16 = icmp slt i32 %14, %15
  br i1 %16, label %17, label %33

17:                                               ; preds = %13
  %18 = load i8*, i8** %2, align 8
  %19 = load i32, i32* %3, align 4
  %20 = load i32, i32* %5, align 4
  %21 = sub nsw i32 %19, %20
  %22 = sub nsw i32 %21, 1
  %23 = sext i32 %22 to i64
  %24 = getelementptr inbounds i8, i8* %18, i64 %23
  %25 = load i8, i8* %24, align 1
  %26 = load i8*, i8** %4, align 8
  %27 = load i32, i32* %5, align 4
  %28 = sext i32 %27 to i64
  %29 = getelementptr inbounds i8, i8* %26, i64 %28
  store i8 %25, i8* %29, align 1
  br label %30

30:                                               ; preds = %17
  %31 = load i32, i32* %5, align 4
  %32 = add nsw i32 %31, 1
  store i32 %32, i32* %5, align 4
  br label %13, !llvm.loop !6

33:                                               ; preds = %13
  %34 = load i8*, i8** %4, align 8
  %35 = load i32, i32* %3, align 4
  %36 = sext i32 %35 to i64
  %37 = getelementptr inbounds i8, i8* %34, i64 %36
  store i8 0, i8* %37, align 1
  %38 = load i8*, i8** %4, align 8
  ret i8* %38
}

; Function Attrs: nounwind readonly willreturn
declare i64 @strlen(i8* noundef) #3

; Function Attrs: noinline nounwind optnone uwtable
define dso_local zeroext i1 @str_lt(i8* noundef %0, i8* noundef %1) #0 {
  %3 = alloca i1, align 1
  %4 = alloca i8*, align 8
  %5 = alloca i8*, align 8
  %6 = alloca i32, align 4
  %7 = alloca i32, align 4
  %8 = alloca i32, align 4
  %9 = alloca i32, align 4
  store i8* %0, i8** %4, align 8
  store i8* %1, i8** %5, align 8
  %10 = load i8*, i8** %4, align 8
  %11 = call i64 @strlen(i8* noundef %10) #6
  %12 = trunc i64 %11 to i32
  store i32 %12, i32* %6, align 4
  %13 = load i8*, i8** %5, align 8
  %14 = call i64 @strlen(i8* noundef %13) #6
  %15 = trunc i64 %14 to i32
  store i32 %15, i32* %7, align 4
  %16 = load i32, i32* %6, align 4
  %17 = load i32, i32* %7, align 4
  %18 = icmp sgt i32 %16, %17
  br i1 %18, label %19, label %44

19:                                               ; preds = %2
  store i32 0, i32* %8, align 4
  br label %20

20:                                               ; preds = %40, %19
  %21 = load i32, i32* %8, align 4
  %22 = load i32, i32* %7, align 4
  %23 = icmp slt i32 %21, %22
  br i1 %23, label %24, label %43

24:                                               ; preds = %20
  %25 = load i8*, i8** %4, align 8
  %26 = load i32, i32* %8, align 4
  %27 = sext i32 %26 to i64
  %28 = getelementptr inbounds i8, i8* %25, i64 %27
  %29 = load i8, i8* %28, align 1
  %30 = sext i8 %29 to i32
  %31 = load i8*, i8** %5, align 8
  %32 = load i32, i32* %8, align 4
  %33 = sext i32 %32 to i64
  %34 = getelementptr inbounds i8, i8* %31, i64 %33
  %35 = load i8, i8* %34, align 1
  %36 = sext i8 %35 to i32
  %37 = icmp sgt i32 %30, %36
  br i1 %37, label %38, label %39

38:                                               ; preds = %24
  store i1 false, i1* %3, align 1
  br label %70

39:                                               ; preds = %24
  br label %40

40:                                               ; preds = %39
  %41 = load i32, i32* %8, align 4
  %42 = add nsw i32 %41, 1
  store i32 %42, i32* %8, align 4
  br label %20, !llvm.loop !8

43:                                               ; preds = %20
  br label %69

44:                                               ; preds = %2
  store i32 0, i32* %9, align 4
  br label %45

45:                                               ; preds = %65, %44
  %46 = load i32, i32* %9, align 4
  %47 = load i32, i32* %6, align 4
  %48 = icmp slt i32 %46, %47
  br i1 %48, label %49, label %68

49:                                               ; preds = %45
  %50 = load i8*, i8** %4, align 8
  %51 = load i32, i32* %9, align 4
  %52 = sext i32 %51 to i64
  %53 = getelementptr inbounds i8, i8* %50, i64 %52
  %54 = load i8, i8* %53, align 1
  %55 = sext i8 %54 to i32
  %56 = load i8*, i8** %5, align 8
  %57 = load i32, i32* %9, align 4
  %58 = sext i32 %57 to i64
  %59 = getelementptr inbounds i8, i8* %56, i64 %58
  %60 = load i8, i8* %59, align 1
  %61 = sext i8 %60 to i32
  %62 = icmp sgt i32 %55, %61
  br i1 %62, label %63, label %64

63:                                               ; preds = %49
  store i1 false, i1* %3, align 1
  br label %70

64:                                               ; preds = %49
  br label %65

65:                                               ; preds = %64
  %66 = load i32, i32* %9, align 4
  %67 = add nsw i32 %66, 1
  store i32 %67, i32* %9, align 4
  br label %45, !llvm.loop !9

68:                                               ; preds = %45
  br label %69

69:                                               ; preds = %68, %43
  store i1 true, i1* %3, align 1
  br label %70

70:                                               ; preds = %69, %63, %38
  %71 = load i1, i1* %3, align 1
  ret i1 %71
}

; Function Attrs: noinline nounwind optnone uwtable
define dso_local zeroext i1 @str_gt(i8* noundef %0, i8* noundef %1) #0 {
  %3 = alloca i1, align 1
  %4 = alloca i8*, align 8
  %5 = alloca i8*, align 8
  %6 = alloca i32, align 4
  %7 = alloca i32, align 4
  %8 = alloca i32, align 4
  %9 = alloca i32, align 4
  store i8* %0, i8** %4, align 8
  store i8* %1, i8** %5, align 8
  %10 = load i8*, i8** %4, align 8
  %11 = call i64 @strlen(i8* noundef %10) #6
  %12 = trunc i64 %11 to i32
  store i32 %12, i32* %6, align 4
  %13 = load i8*, i8** %5, align 8
  %14 = call i64 @strlen(i8* noundef %13) #6
  %15 = trunc i64 %14 to i32
  store i32 %15, i32* %7, align 4
  %16 = load i32, i32* %6, align 4
  %17 = load i32, i32* %7, align 4
  %18 = icmp sgt i32 %16, %17
  br i1 %18, label %19, label %44

19:                                               ; preds = %2
  store i32 0, i32* %8, align 4
  br label %20

20:                                               ; preds = %40, %19
  %21 = load i32, i32* %8, align 4
  %22 = load i32, i32* %7, align 4
  %23 = icmp slt i32 %21, %22
  br i1 %23, label %24, label %43

24:                                               ; preds = %20
  %25 = load i8*, i8** %4, align 8
  %26 = load i32, i32* %8, align 4
  %27 = sext i32 %26 to i64
  %28 = getelementptr inbounds i8, i8* %25, i64 %27
  %29 = load i8, i8* %28, align 1
  %30 = sext i8 %29 to i32
  %31 = load i8*, i8** %5, align 8
  %32 = load i32, i32* %8, align 4
  %33 = sext i32 %32 to i64
  %34 = getelementptr inbounds i8, i8* %31, i64 %33
  %35 = load i8, i8* %34, align 1
  %36 = sext i8 %35 to i32
  %37 = icmp slt i32 %30, %36
  br i1 %37, label %38, label %39

38:                                               ; preds = %24
  store i1 false, i1* %3, align 1
  br label %70

39:                                               ; preds = %24
  br label %40

40:                                               ; preds = %39
  %41 = load i32, i32* %8, align 4
  %42 = add nsw i32 %41, 1
  store i32 %42, i32* %8, align 4
  br label %20, !llvm.loop !10

43:                                               ; preds = %20
  br label %69

44:                                               ; preds = %2
  store i32 0, i32* %9, align 4
  br label %45

45:                                               ; preds = %65, %44
  %46 = load i32, i32* %9, align 4
  %47 = load i32, i32* %6, align 4
  %48 = icmp slt i32 %46, %47
  br i1 %48, label %49, label %68

49:                                               ; preds = %45
  %50 = load i8*, i8** %4, align 8
  %51 = load i32, i32* %9, align 4
  %52 = sext i32 %51 to i64
  %53 = getelementptr inbounds i8, i8* %50, i64 %52
  %54 = load i8, i8* %53, align 1
  %55 = sext i8 %54 to i32
  %56 = load i8*, i8** %5, align 8
  %57 = load i32, i32* %9, align 4
  %58 = sext i32 %57 to i64
  %59 = getelementptr inbounds i8, i8* %56, i64 %58
  %60 = load i8, i8* %59, align 1
  %61 = sext i8 %60 to i32
  %62 = icmp slt i32 %55, %61
  br i1 %62, label %63, label %64

63:                                               ; preds = %49
  store i1 false, i1* %3, align 1
  br label %70

64:                                               ; preds = %49
  br label %65

65:                                               ; preds = %64
  %66 = load i32, i32* %9, align 4
  %67 = add nsw i32 %66, 1
  store i32 %67, i32* %9, align 4
  br label %45, !llvm.loop !11

68:                                               ; preds = %45
  br label %69

69:                                               ; preds = %68, %43
  store i1 true, i1* %3, align 1
  br label %70

70:                                               ; preds = %69, %63, %38
  %71 = load i1, i1* %3, align 1
  ret i1 %71
}

; Function Attrs: noinline nounwind optnone uwtable
define dso_local zeroext i1 @substr(i8* noundef %0, i8* noundef %1) #0 {
  %3 = alloca i8*, align 8
  %4 = alloca i8*, align 8
  store i8* %0, i8** %3, align 8
  store i8* %1, i8** %4, align 8
  %5 = load i8*, i8** %4, align 8
  %6 = load i8*, i8** %3, align 8
  %7 = call i8* @strstr(i8* noundef %5, i8* noundef %6) #6
  %8 = icmp ne i8* %7, null
  ret i1 %8
}

; Function Attrs: nounwind readonly willreturn
declare i8* @strstr(i8* noundef, i8* noundef) #3

; Function Attrs: noinline nounwind optnone uwtable
define dso_local i8* @concat(i8* noundef %0, i8* noundef %1) #0 {
  %3 = alloca i8*, align 8
  %4 = alloca i8*, align 8
  %5 = alloca i32, align 4
  %6 = alloca i32, align 4
  %7 = alloca i8*, align 8
  store i8* %0, i8** %3, align 8
  store i8* %1, i8** %4, align 8
  %8 = load i8*, i8** %3, align 8
  %9 = call i64 @strlen(i8* noundef %8) #6
  %10 = trunc i64 %9 to i32
  store i32 %10, i32* %5, align 4
  %11 = load i8*, i8** %4, align 8
  %12 = call i64 @strlen(i8* noundef %11) #6
  %13 = trunc i64 %12 to i32
  store i32 %13, i32* %6, align 4
  %14 = load i32, i32* %5, align 4
  %15 = load i32, i32* %6, align 4
  %16 = add nsw i32 %14, %15
  %17 = add nsw i32 %16, 1
  %18 = sext i32 %17 to i64
  %19 = mul i64 %18, 1
  %20 = call noalias i8* @malloc(i64 noundef %19) #5
  store i8* %20, i8** %7, align 8
  %21 = load i8*, i8** %7, align 8
  %22 = load i8*, i8** %3, align 8
  %23 = load i32, i32* %5, align 4
  %24 = sext i32 %23 to i64
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %21, i8* align 1 %22, i64 %24, i1 false)
  %25 = load i8*, i8** %7, align 8
  %26 = load i32, i32* %5, align 4
  %27 = sext i32 %26 to i64
  %28 = getelementptr inbounds i8, i8* %25, i64 %27
  %29 = load i8*, i8** %4, align 8
  %30 = load i32, i32* %6, align 4
  %31 = sext i32 %30 to i64
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %28, i8* align 1 %29, i64 %31, i1 false)
  %32 = load i8*, i8** %7, align 8
  %33 = load i32, i32* %5, align 4
  %34 = load i32, i32* %6, align 4
  %35 = add nsw i32 %33, %34
  %36 = sext i32 %35 to i64
  %37 = getelementptr inbounds i8, i8* %32, i64 %36
  store i8 0, i8* %37, align 1
  %38 = load i8*, i8** %7, align 8
  ret i8* %38
}

; Function Attrs: argmemonly nofree nounwind willreturn
declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg) #4

attributes #0 = { noinline nounwind optnone uwtable "frame-pointer"="all" "min-legal-vector-width"="0" "no-trapping-math"="true" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "tune-cpu"="generic" }
attributes #1 = { nounwind "frame-pointer"="all" "no-trapping-math"="true" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "tune-cpu"="generic" }
attributes #2 = { "frame-pointer"="all" "no-trapping-math"="true" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "tune-cpu"="generic" }
attributes #3 = { nounwind readonly willreturn "frame-pointer"="all" "no-trapping-math"="true" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "tune-cpu"="generic" }
attributes #4 = { argmemonly nofree nounwind willreturn }
attributes #5 = { nounwind }
attributes #6 = { nounwind readonly willreturn }

!llvm.module.flags = !{!0, !1, !2, !3, !4}
!llvm.ident = !{!5}

!0 = !{i32 1, !"wchar_size", i32 4}
!1 = !{i32 7, !"PIC Level", i32 2}
!2 = !{i32 7, !"PIE Level", i32 2}
!3 = !{i32 7, !"uwtable", i32 1}
!4 = !{i32 7, !"frame-pointer", i32 2}
!5 = !{!"Ubuntu clang version 14.0.0-1ubuntu1.1"}
!6 = distinct !{!6, !7}
!7 = !{!"llvm.loop.mustprogress"}
!8 = distinct !{!8, !7}
!9 = distinct !{!9, !7}
!10 = distinct !{!10, !7}
!11 = distinct !{!11, !7}

define i32 @main() {
	call i32 @puts(ptr @lit0)
	%bool0 = add i1 0, 0
	%bool1 = add i1 1, 0
	call i32 @puts(ptr @lit1)
	%bool2 = and i1 %bool0, %bool1
	%str3 = call ptr @bool_to_str(i1 %bool2)
	call i32 @puts(ptr %str3)
	%bool4 = or i1 %bool0, %bool1
	%str5 = call ptr @bool_to_str(i1 %bool4)
	call i32 @puts(ptr %str5)
	call i32 @puts(ptr @lit4)
	%bool6 = call i1 @str_lt(ptr @lit2, ptr @lit3)
	%str7 = call ptr @bool_to_str(i1 %bool6)
	call i32 @puts(ptr %str7)
	%bool8 = call i1 @substr(ptr @lit2, ptr @lit3)
	%str9 = call ptr @bool_to_str(i1 %bool8)
	call i32 @puts(ptr %str9)
	%bool10 = call i1 @substr(ptr @lit5, ptr @lit3)
	%str11 = call ptr @bool_to_str(i1 %bool10)
	call i32 @puts(ptr %str11)
	%str12 = call ptr @getinput()
	%str13 = call ptr @concat(ptr @lit6, ptr %str12)
	%str14 = call ptr @concat(ptr @lit7, ptr %str13)
	%str15 = call ptr @reverse_string(ptr @lit8)
	%str16 = call ptr @concat(ptr %str14, ptr %str15)
	call i32 @puts(ptr %str16)
	%str17 = call ptr @reverse_string(ptr @lit3)
	%str18 = call ptr @reverse_string(ptr %str17)
	%str19 = call ptr @reverse_string(ptr %str18)
	call i32 @puts(ptr %str19)
	%str20 = call ptr @getinput()
	%str21 = call ptr @getinput()
	%bool22 = call i1 @str_lt(ptr %str20, ptr %str21)
	%bool23 = and i1 %bool22, %bool1
	%str24 = call ptr @bool_to_str(i1 %bool23)
	call i32 @puts(ptr %str24)
	%str25 = call ptr @getinput()
	%str26 = call ptr @concat(ptr @lit9, ptr %str25)
	%str27 = call ptr @reverse_string(ptr @lit10)
	%str28 = call ptr @concat(ptr %str26, ptr %str27)
	%str29 = call ptr @reverse_string(ptr %str28)
	call i32 @puts(ptr %str29)
	call i32 @puts(ptr @lit11)
	%bool30 = add i1 0, 0
	%bool31 = call i1 @not(i1 %bool30)
	%str32 = call ptr @bool_to_str(i1 %bool31)
	call i32 @puts(ptr %str32)
  ret i32 0
}

@lit0 = constant [8 x i8] c"welcome\00"
@lit1 = constant [9 x i8] c"booleans\00"
@lit2 = constant [4 x i8] c"bye\00"
@lit3 = constant [6 x i8] c"hello\00"
@lit4 = constant [8 x i8] c"strings\00"
@lit5 = constant [5 x i8] c"ello\00"
@lit6 = constant [9 x i8] c"this is \00"
@lit7 = constant [6 x i8] c"[hi] \00"
@lit8 = constant [3 x i8] c".!\00"
@lit9 = constant [5 x i8] c"dne \00"
@lit10 = constant [5 x i8] c"cba \00"
@lit11 = constant [9 x i8] c"expect 1\00"
