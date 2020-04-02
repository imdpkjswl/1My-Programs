	area addArray, code, readonly
	entry
start
	mov r0, #0
	ldr r1, = table
	mov r2, #6
loop
	ldrh r3, [r1], #2
	add r0,r0, r3
	subs r2, r2, #1
	bne loop
	
	ldr r1, = 0x40000080
	str r0, [r1]
stop b stop
table dcw 0x1111,0x2222,0x3333,0x4444,0x5555,0x6666
	end