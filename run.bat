@echo off
FOR /F "tokens=*" %%G IN ('dir /b ^| findstr /r "test.*.apk"') DO set var=%%G
echo %var%
cmd /k