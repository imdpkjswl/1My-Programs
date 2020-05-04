;Write a program to find the square of a number(1 to 10) using lookup table

	AREA SQUARE, CODE, READONLY
		ENTRY
			LDR		R0, LOOKUP	;Get the starting address of the lookup table
			LDR 	R2, RESULT	;Get the starting address of the result
			LDRB	R1, [R0]	;Read the input
			ADD		R0,R0,R1	;Calculate the address of the output(Square of input) 
			LDRB	R3, [R0]	;Store the result
			STRB 	R3, [R2]	;stop
HERE		B		HERE		;
	
LOOKUP		DCD		0X40000000
RESULT		DCD 	0X40000010
				
			END
