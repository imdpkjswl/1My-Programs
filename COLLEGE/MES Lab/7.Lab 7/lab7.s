		AREA SORT, CODE, READONLY
			ENTRY
			MOV 	R5,#5			; N-1 PASSES
NXTPASS		LDR 	R0, A
			MOV 	R4, R5			; N-1 COMPARISON
NXTCOMP		LDR 	R2, R5			;READ FIRST NUMBER
			MOV 	R1, R2			;SAVE IT IN R1
			ADD 	R0, #4			;UPDATE THE POINTER
			LDR 	R2, [R0]		;READ SECOND NUMBER
			CMP 	R1, R2			;COMPARE 1ST NUM WITH 2ND NUM
			BLS 	NOEXG			;IF 1ST NUM< 2ND NUM,THEN  NOT REQUIRED
			STR 	R1, [R0], #-4 	;EXCHANGE THE NUMBER
			STR 	R2, [R0], #4
NOEXG		SUBS 	R4, #1			;DECREMENT NUMBER OF COMPOARISON
			BNE 	NXTCOMP
			SUBS 	R5, #1 		;DECREMENT NUMBER OF PASSES
			BNE 	NXTPASS
B1			B		B1
A			DCD 	0X40000000
			END
				
;NOTE:REPLACE BLS BY SHS FOR DESCENDING ORDER PROGRAM 
		
			