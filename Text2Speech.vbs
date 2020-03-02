Dim Message, Speak
Message=Inputbox("Enter The Text","Speak")
Set speak=CreateObject("sapi.spvoice")
speak.Speak Message