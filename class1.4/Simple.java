class Simple {
    void foo() {
        String x = "some string";
        x = "another" + "yet another";
        // "inside a single-line comment"
        x = /* "multi-line comment" */ "outside comment";
        x = "let's try an \"escape\" inside the literal";
        /*
         "multi-line comment on multiple lines"
         */
    }
}