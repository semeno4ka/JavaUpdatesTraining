module moduleJava9{
// YOU CAN NOW DEFINE ACCESS

        /*

        How to create?

        new module-> module name
        - define dependencies
        -what other modules are required by this module: requires moduleA, requires moduleB etc
        -what packages can be exported by this module?
        -we don't want to open other pack to outside, just interior purpose  for  packA;
         */
        exports com.cydeo.java9;// outside will get access to java9 package, not the rest of the packages in module
        /*
        You need to go to package under another module, create a module-info and specify:
        requires moduleJava9;and add dependency through quick access
         */
        }