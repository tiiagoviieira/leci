	.data
	.text
	.globl main
# 1.a e 1.b
main:	ori $t0, $0, 0x5C1B
	ori $t1, $0, 0xA3E4
	
	and $t2, $t0, $t1
	or $t2, $t0, $t1
	nor $t2, $t0, $t1
	xor $t2, $t0, $t1
	
#1.c	
# ----------------------------------#

	ori $t3, $0, 0xE543
	nor $t4, $t3, $0	
	
	jr $ra	