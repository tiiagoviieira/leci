# Mapa de registos:
# value: $t0
# bit: $t1
# i: $t2 

	.data 
str1: 	.asciiz "Introduza o numero: "
str2: 	.asciiz "\nO valor em binário e': "
	.text
	
	.globl main
	
main:	li $v0, 4
	la $a0, str1
	syscall
	
	li $v0, 5
	syscall
	move $t0, $v0
	
	li $v0, 4
	la $a0, str2
	syscall
	
	li $t2, 0
	
for:	bge $t2,32, endfor
	li $t3, 0x80000000
	and $t1, $t0, $t3
	
	rem $t4, $t2, 4
	bne $t4, 0, if	
	
	li $v0, 11
	li $a0, 32
	syscall
	
if:	beq  $t1, 0, else 	

	li $v0, 11
	li $a0, '1'
	syscall
	j endif

else:	li $v0, 11
	li $a0, '0'
	syscall
	
endif:	sll $t0, $t0, 1
	addi $t2, $t2, 1
	j for
	
endfor:
	
	jr $ra
	