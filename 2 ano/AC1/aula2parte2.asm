	
#(0x12345678, 1)
#(0x12345678, 4)
#(0x12345678, 16)
#(0x862A5C1B, 2)
#(0x862A5C1B, 4)
	
	
	.data
	.text
	.globl main
#2.a, 2.b , 2.c, 2.d e 2.e
main:	li $t0, 0x862A5C1B

	sll $t2,$t0,4
	srl $t3,$t0,4 
	sra $t4,$t0,4
	
	#0x00400058
	#(2,4,5)
	
	li $t0, 2
	li $t1, 0
	li $t2, 0
	
	srl $t2, $t0, 1
	xor $t1, $t0, $t2
	
	move $t2, $t1
	
	srl $t2, $t0, 4
	xor $t0, $t0, $t2
	
	srl $t2, $t0, 2      
    	xor $t0, $t0, $t2
	
	srl $t2, $t0, 1       
    	xor $t0, $t0, $t2 
    	
    	move $t2, $t1
    	
	jr $ra