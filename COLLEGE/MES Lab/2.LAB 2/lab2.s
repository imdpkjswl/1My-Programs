	area lab2, code, readonly
	entry
start
	mov r1,#10 			; assigning 10 value to r1
	mov r2,#00			; assigning 0 value to r2 for cmp purpose
	
loop   					; aplying loop addition
	add r2,r2,r1		; adding r1's value one by one to r2 
	subs r1,#01			; decrementing from r1 by 1 value
	bne loop			; bne used for comparing previous instruction value to zero.if it'll zero,loop automatically stopped
stop b stop
	end