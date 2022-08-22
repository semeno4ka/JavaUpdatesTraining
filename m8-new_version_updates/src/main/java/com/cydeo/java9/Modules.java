package com.cydeo.java9;

import java.util.List;
import java.util.Scanner;

public class Modules {
    public static void main(String[] args) {

/*
IntelliJ already uses Module:
before: module everything was Jar files(Classes+Interfaces+Enum->Package->Jar file)
after: Module(Group of packages) which CONTAINS configuration information inside the special file(module-info.java)
purpose:

               JAR                                                      MODULE (Encapsulating packages)
- cannot specify dependent jar files                        - module-info.java specifies dependencies
whenever you provided a jar info to pom file                you can encapsulate specific files, plus, you get a warning
as dependency, you have access to ALL info,                 if something is wrong with importing file, won't let you compile
plus, you don't have info whether one of
those files is broken
- one java package contains around 4000 files               - base module contains different groups of packages, which makes it easier to maintain



 */
        System.out.println(String.class.getModule());
        System.out.println(Scanner.class.getModule());
        System.out.println(List.class.getModule());








    }
}
