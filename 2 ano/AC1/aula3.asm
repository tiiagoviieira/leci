# Mapa de registos:
# soma: $t0
# value: $t1
# i: $t2

 	.data
str1: .asciiz "Introduza um numero: "
str2: .asciiz "Valor ignorado\n"
str3: .asciiz "A soma dos positivos é : "
 	.text
 	
 	.globl main
 	
main: 	li $t0,0 # soma = 0;
 	li $t2,0 # i = 0;
 	
for: 	bge $t2,5,endfor 

	li $v0, 4
	la $a0, str1
 	syscall
 	
 	li $v0, 5
 	syscall
 	move $t1, $v0

 		
if: 	ble $t1,0,else 
 	add $t0, $t0, $t1
 	j 	endif
 	
else: 
 	li $v0, 4
	la $a0, str2
 	syscall	
 	
endif: 	addi $t2,$t2,1 
 	j 	for 	
 	
endfor:
 	li $v0, 4
 	la $a0, str3
 	syscall
 	
 	li $v0, 1
 	move $a0, $t0
 	syscall
 	
 	jr $ra 
 	
 	
 	
 	
 	