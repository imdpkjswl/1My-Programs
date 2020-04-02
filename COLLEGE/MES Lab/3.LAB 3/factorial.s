	area factorial, code, readonly
	entry
start
	mov r0, #1
	mov r1, #3
loop
	mul r0, r1, r0
	sub r1, #1
	bne loop
stop b stop
	end