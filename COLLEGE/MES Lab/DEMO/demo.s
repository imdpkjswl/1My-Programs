	area demo, code, readonly
	entry 
start
	ldr r0, = 0x00000006
	ldr r1, = 0x00000002
	add r2,r1,r0
	
stop b stop
	end