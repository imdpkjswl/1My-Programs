;Write a program to find the largest/smallest number in an array of 32 bit numbers.

		AREA LARGER, CODE, READONLY
		ENTRY
		MOV R5, #5 ;number of comparison(n-1) 
		LDR R0, ARR ; get the starting address of the array
		LDR R2, [R0] ; read first number
NEXT 	ADD R0, #4   ; update the pointer by 4
		LDR R3, [R0] ; read the second number
		CMP R2, R3   ; compare first number(R2) to second number(R3)
		BHS LARGE ; Unsigned higher or same
		MOV R2, R3
LARGE   SUBS R5, #1 ; decrement comprison counter
		BNE NEXT
		LDR R1, RES ; get the address of the result
		STR R2, [R1] ; store the result
		
ARR		DCD 0X40000000
RES		DCD 0X40000020
		END
			
			
			; Note: Replace BHS by BLS(Unsigned Lower or same)			