#! /usr/bin/zsh

Red='\033[1;31m'
Green='\033[0;32m'
Blue='\033[0;34m'
White='\033[0;37m'
#Black        0;30     Dark Gray     1;30
#Red          0;31     Light Red     1;31
#Green        0;32     Light Green   1;32
#Brown/Orange 0;33     Yellow        1;33
#Blue         0;34     Light Blue    1;34
#Purple       0;35     Light Purple  1;35
#Cyan         0;36     Light Cyan    1;36
#Light Gray   0;37     White         1;37
#
printf "${White}------------------------------------------------------------------------------------------------------------------------------\n"
cd ./target
printf "${Blue}1.Clean\n"
if [ -d "commons" ] 
then
    rm -fr commons;
fi
if [ -f "commons.jar" ] 
then
    rm -fr commons.jar;
fi

if [ -d "com" ] 
then
    rm -fr com;
fi
if [ -f "com.jar" ] 
then
    rm -fr com.jar;
fi

printf "${Red}2.Compile\n"
javac -d . -cp ../lib/commons-lang3-3.11/commons-lang3-3.11.jar ../src/main/java/com/miro/App.java ../src/main/java/com/miro/domain/Money.java

#cp -R ../libs/commons-lang3-3.11/org .
printf "${Red}3.Package\n"
#jar -cvf commons.jar org
jar -cvfm com.jar MANIFEST.MF com

printf "${Green}4.Execute\n"
printf "${White}------------------------------------------------------------------------------------------------------------------------------\n"
java -jar com.jar
