import os
import json
import sys
from subprocess import call,Popen,PIPE


file = open("dependency.json")
json_data = json.load(file)

uninstalled_list = []
for depen in json_data['Dependencies']:
    try:
        version = json_data['Dependencies'][depen]
        process = Popen(["pip", "install", depen+"=="+version], stdout=PIPE, stderr=PIPE)
        stdout, stderr = process.communicate()
	stdout=stdout.decode("utf-8")
        #print (stdout, stderr)
        if not ("Successfully installed "+depen+"-"+version in stdout or "Requirement already satisfied" in stdout):
            uninstalled_list.append(depen)
    except Exception as e:
        uninstalled_list.append(depen)



if len(uninstalled_list) == 0:
    print ("Success")
else:
    print ("These packages failed to install")
    for depen in uninstalled_list:
        print (depen)
