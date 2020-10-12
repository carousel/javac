#! /usr/bin/zsh
source config.sh

printf "${White}------------------------------------------------------------------------------------------------------------------------------\n"
printf "${Blue}1.Clean\n"
if [ -d "target" ] 
then
    rm -fr target
    mkdir target
    chmod 700 target
    touch ${BUILDPATH}/MANIFEST.MF;
    echo "Manifest-Version: 1.0" >> ${BUILDPATH}/MANIFEST.MF;
    echo "Main-Class: com.miro.App" >> ${BUILDPATH}/MANIFEST.MF;
    echo "Class-Path: ../lib/commons-lang3-3.11/commons-lang3-3.11.jar" >> ${BUILDPATH}/MANIFEST.MF;
else
    mkdir target
    chmod 700 target
    touch ${BUILDPATH}/MANIFEST.MF;
    echo "Manifest-Version: 1.0" >> ${BUILDPATH}/MANIFEST.MF;
    echo "Main-Class: com.miro.App" >> ${BUILDPATH}/MANIFEST.MF;
    echo "Class-Path: ../lib/commons-lang3-3.11/commons-lang3-3.11.jar" >> ${BUILDPATH}/MANIFEST.MF;
fi

printf "${Red}2.Compile\n"
javac -d ${BUILDPATH} -cp ${Commons} ${App} ${Money} ${Account} ${Currency}

printf "${Red}3.Package\n"
cd ${BUILDPATH}
jar -cvfm com.jar MANIFEST.MF com

printf "${Green}4.Execute\n"
printf "${White}------------------------------------------------------------------------------------------------------------------------------\n"
java -jar com.jar
