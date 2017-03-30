;;Wait 5 seconds for the File Upload window to appear
WinWait("File Upload", "", 5)
 
;;Paste location of folder where data files are locally stored (Text limited to 259 characters)
ControlSetText("File Upload", "", "[CLASS:Edit; INSTANCE:1]", "D:\YourPath\QVDs")
 
;;Wait 1 second to finish pasting text
Sleep(1000)
 
;;Hit Enter and go to folder where data files are locally stored
ControlSend("File Upload", "", "[CLASS:Edit; INSTANCE:1]", "{ENTER}")
 
;;Wait 5 seconds to go to folder
Sleep(5000)
 
;;Paste list of data files to upload (Text limited to 259 characters)
ControlSetText("File Upload", "", "[CLASS:Edit; INSTANCE:1]", '"Worklogs.qvd" "DocumentTypes.qvd" "INV1.qvd" "ITR1.qvd" "JDT1.qvd"')
 
;;Wait 1 second to finish typing
Sleep(1000)
 
;;Hit Enter and upload data files
ControlSend("File Upload", "", "[CLASS:Edit; INSTANCE:1]", "{ENTER}")
