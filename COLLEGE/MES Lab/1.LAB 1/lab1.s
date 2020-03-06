 	area lab1, code, readonly
	entry      					; Here: area ,code ,entry and end are the assembler directive.
start     						; Here start and stop are label,i.e. it just inform the ARM processor about code section.
	mov r0,#00010 				; here we're assigning decimal value to register.
	mov r1,#0004  				; Note: For assigning hexdec value,refer the demo program.
	mul r2,r1,r0
stop b stop
	end
		