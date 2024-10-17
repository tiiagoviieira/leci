	.eqv SIZE,20
	.data
	
str:	.space	21

	.text
	.globl main

#Este programa conta o numero de digitos no valor que inserires	
			
main:	
	
	la $a0,str
	li $a1,SIZE
	li $v0,8
	syscall		# read_str(str, SIZE)
	
	li $t0,0 	#num = 0
	li $t1,0	#i = 0
	
while:				#while(str[0]) != '\0'
	la $t2,str	
	addu $t2,$t2,$t1
	lb $t2,0($t2)
	beq $t2,'\0',endw
	
if:	blt $t2,'0',endif
	bgt $t2,'9',endif
	addi $t0, $t0, 1
	
endif:	addi $t1, $t1, 1
	j	while

endw:
	move $a0,$t0
	li $v0,1
	syscall
	
	jr $ra