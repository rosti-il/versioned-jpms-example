@echo off

rem java com.example.module.application.MainClass --module-path application-1.0.jar;foo-2.0.jar;bar-3.0.jar;baz-base-1.0.jar
java --module-path "application-1.0.jar;versioned-jpms-1.0.jar;foo-2.0.jar;bar-3.0.jar;baz-base-1.0.jar;pagaz-base-1.0.jar" -m application/com.example.module.application.MainClass
