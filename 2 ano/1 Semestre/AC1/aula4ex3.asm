	.eqv SIZE,4
	.data

array:	.word	7692,23,5,234


	.text
	.globl main

#Este programa conta o numero de digitos no valor que inserires	
			
main:	
	
	li $t3,0
	li $a1,SIZE
	addi $t4,$a1,-1
	sll $t4,$t4,2
	la $t0,array
	addu $t1,$t0,$t4
	
	
	
while:	
	
	bgtu $t0,$t1,endw
	lw $t2, 0($t0)
	add $t3,$t3, $t2
	addiu $t0,$t0,4
	j while

endw:

	li $v0,1
	move $a0,$t3
	syscall
	
	jr $ra