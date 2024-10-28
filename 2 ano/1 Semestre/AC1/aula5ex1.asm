# i: $t0
# lista: $t1
# lista + i: $t2


	.eqv SIZE,5
	.data
str:	.asciiz "\nIntroduza um numero: "

	.align 2
lista:	.space 20

	.text
	.globl main
	
main:	li $t0, 0

while:	bge $t0,SIZE, endw

	la $a0, str
	li $v0, 4
	syscall
	
	li $v0,5
	syscall
	move $t4,$v0
	
	la $t1,lista
	sll $t2,$t0,2
	addu $t2, $t2, $t1
	
	sw $t4,0($t2) 
	
	lw $a0, 0($t2)
	li $v0, 1
	syscall
	
	addi $t0, $t0, 1 
	
	j while
	
endw:	jr $ra
	