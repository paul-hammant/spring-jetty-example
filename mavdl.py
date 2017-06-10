# pip3 install sh
from sh import mvn, grep, rm, mkdir, sed, wget
import csv

rm("-rf", "libs")
mkdir("libs")

tree = sed(sed(mvn("dependency:tree", _tty_out=False), "s/\\[INFO\\]//"), "/\\[WARNING\\]/d")
lines = sed(sed(sed(sed(sed(sed(sed(sed(tree, "s/+//"), "s/-//"), "s/\\\//"), "s/\|//g"), "s/ //g"), "s/:jar:/:/"), "s/:/,/g"), "s/\[INFO\]//")

for gav in csv.reader(lines):
    if (len(gav) is not 4):
        continue

    # print(gav[0] + " " + gav[1]+ " " + gav[2]+ " " + gav[3])

    mkdir("-p", "libs/" + gav[3])
    try:
        wget("http://central.maven.org/maven2/" + gav[0].replace(".", "/") + "/" + gav[1] + "/" + gav[2] + "/" + gav[1] + "-" + gav[2] + ".jar", "-O", "libs/" + gav[3] + "/" + gav[1] + "-" + gav[2] + ".jar")
    except:
        pass
