# p: $t0
# *p: $t1
# lista + size: $t2


	.eqv SIZE,10
	.data
	
str:	.asciiz "\nConteudo do array: "

	.align 2
lista:	.word  8,-4,3,5,124,-15,87,9,27,15

	.text
	.globl main
	
main:	la $a0, str
	li $v0, 4
	syscall

	la $t0,lista
	li $t3, SIZE
	
	sll
	addu $t2, $t0, $t3

while:	bge $t0,$t2, endw

	lw $t1,$t0
	
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
	